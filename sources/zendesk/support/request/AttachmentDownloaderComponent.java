package zendesk.support.request;

import com.zendesk.logger.Logger;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import okhttp3.ResponseBody;
import zendesk.belvedere.C9800a;
import zendesk.belvedere.MediaResult;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;

class AttachmentDownloaderComponent implements Listener<StateConversation> {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final AttachmentDownloader attachmentDownloader;
    /* access modifiers changed from: private */
    public final Dispatcher dispatcher;
    private final AttachmentDownloaderSelector selector = new AttachmentDownloaderSelector();

    public static class AttachmentDownloader {
        /* access modifiers changed from: private */
        public final AttachmentDownloadService attachmentIo;
        /* access modifiers changed from: private */
        public final C9800a belvedere;
        /* access modifiers changed from: private */
        public final Set<String> downloadingHistory = new HashSet();

        public class CacheCallback extends op7<MediaResult> {
            private final op7<MediaResult> callback;
            private final StateRequestAttachment requestAttachment;

            public CacheCallback(StateRequestAttachment stateRequestAttachment, op7<MediaResult> op7) {
                this.requestAttachment = stateRequestAttachment;
                this.callback = op7;
            }

            public void onError(hr1 hr1) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), hr1, this.callback);
            }

            public void onSuccess(MediaResult mediaResult) {
                this.callback.onSuccess(mediaResult);
                AttachmentDownloader.this.downloadingHistory.remove(this.requestAttachment.getUrl());
            }
        }

        public class HttpCallback extends op7<ResponseBody> {
            private final op7<MediaResult> callback;
            private final Request request;
            private final StateRequestAttachment requestAttachment;

            public HttpCallback(Request request2, StateRequestAttachment stateRequestAttachment, op7<MediaResult> op7) {
                this.request = request2;
                this.requestAttachment = stateRequestAttachment;
                this.callback = op7;
            }

            public void onError(hr1 hr1) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), hr1, this.callback);
            }

            public void onSuccess(ResponseBody responseBody) {
                AttachmentDownloader.this.attachmentIo.storeAttachment(responseBody, UtilsAttachment.getLocalFile(AttachmentDownloader.this.belvedere, this.request.getRequestId(), this.request.getRemoteAttachmentId(), this.requestAttachment.getName()), new CacheCallback(this.requestAttachment, this.callback));
            }
        }

        public static class Request {
            private final long remoteAttachmentId;
            private final StateRequestAttachment requestAttachment;
            private final String requestId;

            public Request(String str, long j, StateRequestAttachment stateRequestAttachment) {
                this.requestId = str;
                this.remoteAttachmentId = j;
                this.requestAttachment = stateRequestAttachment;
            }

            public long getRemoteAttachmentId() {
                return this.remoteAttachmentId;
            }

            public StateRequestAttachment getRequestAttachment() {
                return this.requestAttachment;
            }

            public String getRequestId() {
                return this.requestId;
            }
        }

        public AttachmentDownloader(C9800a aVar, AttachmentDownloadService attachmentDownloadService) {
            this.belvedere = aVar;
            this.attachmentIo = attachmentDownloadService;
        }

        /* access modifiers changed from: private */
        public void handleError(String str, hr1 hr1, op7 op7) {
            this.downloadingHistory.remove(str);
            if (op7 != null) {
                op7.onError(hr1);
            }
        }

        public void download(Request request, op7<MediaResult> op7) {
            StateRequestAttachment requestAttachment = request.getRequestAttachment();
            String url = requestAttachment.getUrl();
            if (!this.downloadingHistory.contains(url)) {
                this.downloadingHistory.add(url);
                this.attachmentIo.downloadAttachment(url, new HttpCallback(request, requestAttachment, op7));
            }
        }
    }

    public static class AttachmentDownloaderSelector {
        public List<AttachmentDownloader.Request> selectData(StateConversation stateConversation) {
            boolean z;
            StateIdMapper attachmentIdMapper = stateConversation.getAttachmentIdMapper();
            String localId = stateConversation.getLocalId();
            List<StateMessage> messages = stateConversation.getMessages();
            LinkedList linkedList = new LinkedList();
            for (StateMessage attachments : messages) {
                for (StateRequestAttachment next : attachments.getAttachments()) {
                    long id = next.getId();
                    if (next.getLocalFile() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean hasRemoteId = attachmentIdMapper.hasRemoteId(Long.valueOf(id));
                    boolean b = kb6.m46949b(next.getUrl());
                    if (!z && hasRemoteId && b) {
                        linkedList.add(new AttachmentDownloader.Request(localId, attachmentIdMapper.getRemoteId(Long.valueOf(id)).longValue(), next));
                    }
                }
            }
            return linkedList;
        }
    }

    public class DownloadCallback extends op7<MediaResult> {
        private final StateRequestAttachment requestAttachment;

        public DownloadCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void onError(hr1 hr1) {
            Logger.m43078b(RequestActivity.LOG_TAG, "Unable to download attachment. Error: %s", hr1.mo43366h());
        }

        public void onSuccess(MediaResult mediaResult) {
            AttachmentDownloaderComponent.this.dispatcher.dispatch(AttachmentDownloaderComponent.this.actionFactory.attachmentDownloaded(this.requestAttachment, mediaResult));
        }
    }

    public AttachmentDownloaderComponent(Dispatcher dispatcher2, ActionFactory actionFactory2, AttachmentDownloader attachmentDownloader2) {
        this.dispatcher = dispatcher2;
        this.actionFactory = actionFactory2;
        this.attachmentDownloader = attachmentDownloader2;
    }

    public void update(StateConversation stateConversation) {
        for (AttachmentDownloader.Request next : this.selector.selectData(stateConversation)) {
            this.attachmentDownloader.download(next, new DownloadCallback(next.getRequestAttachment()));
        }
    }
}
