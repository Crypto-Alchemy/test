package zendesk.support.request;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.zendesk.logger.Logger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import zendesk.belvedere.C9800a;
import zendesk.belvedere.MediaResult;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.CommentsResponse;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

class ActionLoadComments implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final C9800a belvedere;
    private final Handler handler;
    /* access modifiers changed from: private */
    public final boolean initialLoad;
    /* access modifiers changed from: private */
    public final RequestProvider requestProvider;

    public static abstract class MinimumTimeCallback<E> extends op7<E> {
        private final Handler handler;
        private final long minTime;
        private final TimeUnit minTimeUnit;
        private final long start = System.nanoTime();

        public MinimumTimeCallback(Handler handler2, long j, TimeUnit timeUnit) {
            this.handler = handler2;
            this.minTime = j;
            this.minTimeUnit = timeUnit;
        }

        private long remainingTime() {
            long nanoTime = System.nanoTime() - this.start;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long convert = timeUnit.convert(this.minTime, this.minTimeUnit);
            if (nanoTime < convert) {
                return TimeUnit.MILLISECONDS.convert(convert - nanoTime, timeUnit);
            }
            return 0;
        }

        public abstract void onDelayedError(hr1 hr1);

        public abstract void onDelayedSuccess(E e);

        public void onError(final hr1 hr1) {
            this.handler.postDelayed(new Runnable() {
                public void run() {
                    MinimumTimeCallback.this.onDelayedError(hr1);
                }
            }, remainingTime());
        }

        public void onSuccess(final E e) {
            this.handler.postDelayed(new Runnable() {
                public void run() {
                    MinimumTimeCallback.this.onDelayedSuccess(e);
                }
            }, remainingTime());
        }
    }

    public ActionLoadComments(ActionFactory actionFactory2, RequestProvider requestProvider2, C9800a aVar, boolean z) {
        this(actionFactory2, requestProvider2, aVar, new Handler(Looper.getMainLooper()), z);
    }

    private StateMessage find2ndLastDeliveredMessage(List<StateMessage> list) {
        ListIterator<StateMessage> listIterator = list.listIterator(list.size());
        int i = 0;
        while (listIterator.hasPrevious()) {
            StateMessage previous = listIterator.previous();
            if (previous.getState().getStatus() == 2 && (i = i + 1) == 2) {
                return previous;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"UseSparseArrays"})
    public Map<Long, MediaResult> findAttachments(String str, CommentsResponse commentsResponse) {
        List<CommentResponse> comments = commentsResponse.getComments();
        HashMap hashMap = new HashMap();
        for (CommentResponse attachments : comments) {
            for (Attachment next : attachments.getAttachments()) {
                MediaResult localFile = UtilsAttachment.getLocalFile(this.belvedere, str, next.getId().longValue(), next.getFileName());
                if (next.getSize().longValue() == localFile.mo73696e().length()) {
                    hashMap.put(next.getId(), localFile);
                }
            }
        }
        return hashMap;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadComments(this.initialLoad));
    }

    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        if (!kb6.m46949b(fromState.getRemoteId())) {
            Logger.m43078b(RequestActivity.LOG_TAG, "Skip loading comments. No remote id found.", new Object[0]);
            dispatcher.dispatch(this.actionFactory.skipAction());
            callback.done();
            return;
        }
        final StateConversation stateConversation = fromState;
        final Dispatcher dispatcher2 = dispatcher;
        final AsyncMiddleware.Callback callback2 = callback;
        C100691 r0 = new MinimumTimeCallback<CommentsResponse>(this.handler, 1, TimeUnit.SECONDS) {
            public void onDelayedError(hr1 hr1) {
                Logger.m43087k(RequestActivity.LOG_TAG, "Unable to load comments. Error: '%s'", hr1.mo43366h());
                dispatcher2.dispatch(ActionLoadComments.this.actionFactory.loadCommentsError(ActionLoadComments.this.initialLoad, hr1));
                callback2.done();
            }

            public void onDelayedSuccess(CommentsResponse commentsResponse) {
                HashSet hashSet = new HashSet(stateConversation.getMessageIdMapper().getRemoteIds());
                for (CommentResponse id : commentsResponse.getComments()) {
                    hashSet.add(id.getId());
                }
                ActionLoadComments.this.requestProvider.markRequestAsRead(stateConversation.getRemoteId(), hashSet.size());
                dispatcher2.dispatch(ActionLoadComments.this.actionFactory.loadCommentsSuccess(ActionLoadComments.this.initialLoad, commentsResponse, ActionLoadComments.this.findAttachments(stateConversation.getLocalId(), commentsResponse)));
                callback2.done();
            }
        };
        StateMessage find2ndLastDeliveredMessage = find2ndLastDeliveredMessage(fromState.getMessages());
        if (find2ndLastDeliveredMessage != null) {
            this.requestProvider.getCommentsSince(fromState.getRemoteId(), find2ndLastDeliveredMessage.getDate(), false, r0);
        } else {
            this.requestProvider.getComments(fromState.getRemoteId(), r0);
        }
    }

    public ActionLoadComments(ActionFactory actionFactory2, RequestProvider requestProvider2, C9800a aVar, Handler handler2, boolean z) {
        this.actionFactory = actionFactory2;
        this.requestProvider = requestProvider2;
        this.belvedere = aVar;
        this.handler = handler2;
        this.initialLoad = z;
    }
}
