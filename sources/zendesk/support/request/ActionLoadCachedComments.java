package zendesk.support.request;

import com.zendesk.logger.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.belvedere.C9800a;
import zendesk.belvedere.MediaResult;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.suas.Action;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

class ActionLoadCachedComments implements AsyncMiddleware.AsyncAction {

    /* renamed from: af */
    private final ActionFactory f46847af;
    private final C9800a belvedere;
    private final Executor executorService;
    private final String sdkVersion;
    private final SupportUiStorage supportUiStorage;

    public static class LoadComments implements Runnable {

        /* renamed from: af */
        private final ActionFactory f46848af;
        private final C9800a belvedere;
        private final AsyncMiddleware.Callback callback;
        private final Dispatcher dispatcher;

        /* renamed from: id */
        private final String f46849id;
        private final String sdkVersion;
        private final SupportUiStorage supportUiStorage;

        public LoadComments(String str, Dispatcher dispatcher2, AsyncMiddleware.Callback callback2, SupportUiStorage supportUiStorage2, ActionFactory actionFactory, C9800a aVar, String str2) {
            this.f46849id = str;
            this.dispatcher = dispatcher2;
            this.callback = callback2;
            this.supportUiStorage = supportUiStorage2;
            this.f46848af = actionFactory;
            this.belvedere = aVar;
            this.sdkVersion = str2;
        }

        private StateMessage findLocalAttachmentForMessage(StateMessage stateMessage, StateIdMapper stateIdMapper, C9800a aVar, String str) {
            List<StateRequestAttachment> attachments = stateMessage.getAttachments();
            if (!kj0.m47118i(attachments)) {
                return stateMessage;
            }
            ArrayList arrayList = new ArrayList(stateMessage.getAttachments().size());
            for (StateRequestAttachment next : attachments) {
                if (stateIdMapper.hasRemoteId(Long.valueOf(next.getId()))) {
                    arrayList.add(updateAttachment(next, UtilsAttachment.getLocalFile(aVar, str, stateIdMapper.getRemoteId(Long.valueOf(next.getId())).longValue(), next.getName())));
                } else {
                    arrayList.add(next);
                }
            }
            return stateMessage.withAttachments(arrayList);
        }

        private StateRequestAttachment updateAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
            String str;
            File file = null;
            if (stateRequestAttachment.getSize() == mediaResult.mo73696e().length()) {
                file = mediaResult.mo73696e();
                str = mediaResult.mo73704m().toString();
            } else {
                str = null;
            }
            return stateRequestAttachment.newBuilder().setLocalFile(file).setLocalUri(str).build();
        }

        public String getId() {
            return this.f46849id;
        }

        public StateConversation resolveAttachments(StateConversation stateConversation) {
            ArrayList arrayList = new ArrayList(stateConversation.getMessages().size());
            for (StateMessage findLocalAttachmentForMessage : stateConversation.getMessages()) {
                arrayList.add(findLocalAttachmentForMessage(findLocalAttachmentForMessage, stateConversation.getAttachmentIdMapper(), this.belvedere, stateConversation.getLocalId()));
            }
            return stateConversation.newBuilder().setMessages(arrayList).build();
        }

        public void run() {
            Action action;
            ComponentPersistence.RequestPersistenceModel requestPersistenceModel = (ComponentPersistence.RequestPersistenceModel) this.supportUiStorage.read(this.f46849id, ComponentPersistence.RequestPersistenceModel.class);
            if (requestPersistenceModel == null || requestPersistenceModel.getConversation() == null) {
                Logger.m43078b(RequestActivity.LOG_TAG, "Unable to loaded request from disk", new Object[0]);
                action = this.f46848af.loadCommentsFromCacheError();
            } else if (this.sdkVersion.equals(requestPersistenceModel.getVersion())) {
                Logger.m43078b(RequestActivity.LOG_TAG, "Successfully loaded request from disk", new Object[0]);
                action = this.f46848af.loadCommentsFromCacheSuccess(resolveAttachments(requestPersistenceModel.getConversation()));
            } else {
                Logger.m43078b(RequestActivity.LOG_TAG, "Cached version doesn't match with SDK version. Ignoring cached data. [%s, %s]", requestPersistenceModel.getVersion(), "5.0.9");
                action = this.f46848af.loadCommentsFromCacheError();
            }
            this.dispatcher.dispatch(action);
            this.callback.done();
        }
    }

    public ActionLoadCachedComments(ActionFactory actionFactory, SupportUiStorage supportUiStorage2, C9800a aVar, Executor executor, String str) {
        this.f46847af = actionFactory;
        this.supportUiStorage = supportUiStorage2;
        this.belvedere = aVar;
        this.executorService = executor;
        this.sdkVersion = str;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.f46847af.loadCommentsFromCache());
    }

    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        if (kb6.m46949b(fromState.getLocalId())) {
            this.executorService.execute(new LoadComments(fromState.getLocalId(), dispatcher, callback, this.supportUiStorage, this.f46847af, this.belvedere, this.sdkVersion));
            return;
        }
        dispatcher.dispatch(this.f46847af.skipAction());
        callback.done();
    }
}
