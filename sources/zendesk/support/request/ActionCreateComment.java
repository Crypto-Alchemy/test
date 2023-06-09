package zendesk.support.request;

import com.zendesk.logger.Logger;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.Comment;
import zendesk.support.CreateRequest;
import zendesk.support.EndUserComment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.AttachmentUploadService;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

class ActionCreateComment implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f46845af;
    private op7<AttachmentUploadService.AttachmentUploadResult> attachmentCallback;
    private final AttachmentUploadService attachmentUploader;
    /* access modifiers changed from: private */
    public final StateMessage message;
    /* access modifiers changed from: private */
    public final RequestProvider requestProvider;

    public static class CreateCommentResult {
        private final long commentRemoteId;
        private final AttachmentUploadService.AttachmentUploadResult localToRemoteAttachments;
        private final StateMessage message;
        private final String requestId;

        public CreateCommentResult(StateMessage stateMessage, String str, long j, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
            this.message = stateMessage;
            this.requestId = str;
            this.commentRemoteId = j;
            this.localToRemoteAttachments = attachmentUploadResult;
        }

        public long getCommentRemoteId() {
            return this.commentRemoteId;
        }

        public AttachmentUploadService.AttachmentUploadResult getLocalToRemoteAttachments() {
            return this.localToRemoteAttachments;
        }

        public StateMessage getMessage() {
            return this.message;
        }

        public String getRequestId() {
            return this.requestId;
        }
    }

    public ActionCreateComment(ActionFactory actionFactory, RequestProvider requestProvider2, AttachmentUploadService attachmentUploadService, StateMessage stateMessage) {
        this.f46845af = actionFactory;
        this.requestProvider = requestProvider2;
        this.message = stateMessage;
        this.attachmentUploader = attachmentUploadService;
    }

    private void addComment(AsyncMiddleware.Callback callback, Dispatcher dispatcher, StateConversation stateConversation, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
        EndUserComment endUserComment = new EndUserComment();
        endUserComment.setValue(this.message.getBody());
        endUserComment.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        String remoteId = stateConversation.getRemoteId();
        final AttachmentUploadService.AttachmentUploadResult attachmentUploadResult2 = attachmentUploadResult;
        final Dispatcher dispatcher2 = dispatcher;
        final String str = remoteId;
        final StateConversation stateConversation2 = stateConversation;
        final AsyncMiddleware.Callback callback2 = callback;
        this.requestProvider.addComment(remoteId, endUserComment, new op7<Comment>() {
            public void onError(hr1 hr1) {
                Logger.m43087k(RequestActivity.LOG_TAG, "Unable to add comment to request. Error: '%s'. Message Id: %d", hr1.mo43366h(), Long.valueOf(ActionCreateComment.this.message.getId()));
                if (hr1.mo43367i() && hr1.mo43362e() == 422) {
                    Logger.m43087k(RequestActivity.LOG_TAG, "This request (%s) is closed. Error: '%s'. Message Id: %d", str, hr1.mo43366h(), Long.valueOf(ActionCreateComment.this.message.getId()));
                    dispatcher2.dispatch(ActionCreateComment.this.f46845af.requestClosed());
                }
                dispatcher2.dispatch(ActionCreateComment.this.f46845af.createCommentError(hr1, ActionCreateComment.this.message.withError(hr1)));
                callback2.done();
            }

            public void onSuccess(Comment comment) {
                dispatcher2.dispatch(ActionCreateComment.this.f46845af.createCommentSuccess(new CreateCommentResult(ActionCreateComment.this.message.withAttachments(attachmentUploadResult2.getRequestAttachments()).withDelivered(), str, comment.getId().longValue(), attachmentUploadResult2)));
                ActionCreateComment.this.requestProvider.markRequestAsRead(str, stateConversation2.getMessageIdMapper().getRemoteIds().size());
                callback2.done();
            }
        });
    }

    /* access modifiers changed from: private */
    public void createMessage(StateConversation stateConversation, StateConfig stateConfig, Dispatcher dispatcher, AsyncMiddleware.Callback callback, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
        if (kb6.m46949b(stateConversation.getRemoteId())) {
            Logger.m43078b(RequestActivity.LOG_TAG, "Adding a comment to an existing request. Message Id %s", Long.valueOf(this.message.getId()));
            addComment(callback, dispatcher, stateConversation, attachmentUploadResult);
            return;
        }
        Logger.m43078b(RequestActivity.LOG_TAG, "Creating a new request. Message Id %s", Long.valueOf(this.message.getId()));
        createRequest(callback, dispatcher, attachmentUploadResult, stateConfig);
    }

    private void createRequest(final AsyncMiddleware.Callback callback, final Dispatcher dispatcher, final AttachmentUploadService.AttachmentUploadResult attachmentUploadResult, StateConfig stateConfig) {
        CreateRequest createRequest = new CreateRequest();
        createRequest.setDescription(this.message.getBody());
        createRequest.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        if (kj0.m47118i(stateConfig.getTags())) {
            createRequest.setTags(stateConfig.getTags());
        }
        if (kb6.m46949b(stateConfig.getSubject())) {
            createRequest.setSubject(stateConfig.getSubject());
        }
        if (stateConfig.getTicketForm() != null) {
            if (stateConfig.getTicketForm().getId() != -1) {
                createRequest.setTicketFormId(Long.valueOf(stateConfig.getTicketForm().getId()));
            }
            createRequest.setCustomFields(stateConfig.getTicketForm().getTicketFieldsForApi());
        }
        this.requestProvider.createRequest(createRequest, new op7<Request>() {
            public void onError(hr1 hr1) {
                dispatcher.dispatch(ActionCreateComment.this.f46845af.createRequestError(hr1, ActionCreateComment.this.message.withError(hr1)));
                callback.done();
            }

            public void onSuccess(Request request) {
                dispatcher.dispatch(ActionCreateComment.this.f46845af.createRequestSuccess(new CreateCommentResult(ActionCreateComment.this.message.withAttachments(attachmentUploadResult.getRequestAttachments()).withDelivered(), request.getId(), request.getLastComment().getId().longValue(), attachmentUploadResult)));
                callback.done();
                if (request.getId() != null) {
                    ActionCreateComment.this.requestProvider.markRequestAsRead(request.getId(), 1);
                }
            }
        });
    }

    private List<String> getAttachmentToken(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList();
        for (StateRequestAttachment token : list) {
            arrayList.add(token.getToken());
        }
        return arrayList;
    }

    private void waitForAttachments(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        final StateConversation fromState = StateConversation.fromState(getState.getState());
        final StateConfig fromState2 = StateConfig.fromState(getState.getState());
        Logger.m43078b(RequestActivity.LOG_TAG, "Waiting for attachments to be uploaded. Message Id: %s", Long.valueOf(this.message.getId()));
        final Dispatcher dispatcher2 = dispatcher;
        final AsyncMiddleware.Callback callback2 = callback;
        C100641 r1 = new op7<AttachmentUploadService.AttachmentUploadResult>() {
            public void onError(hr1 hr1) {
                Logger.m43087k(RequestActivity.LOG_TAG, "Attachment upload error. '%s'. Message Id: %s", hr1.mo43366h(), Long.valueOf(ActionCreateComment.this.message.getId()));
                StateMessage withError = ActionCreateComment.this.message.withError(hr1);
                if (kb6.m46949b(fromState.getRemoteId())) {
                    dispatcher2.dispatch(ActionCreateComment.this.f46845af.createCommentError(hr1, withError));
                } else {
                    dispatcher2.dispatch(ActionCreateComment.this.f46845af.createRequestError(hr1, withError));
                }
                callback2.done();
            }

            public void onSuccess(AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
                Logger.m43078b(RequestActivity.LOG_TAG, "Attachments resolved and uploaded. Message Id: %s", Long.valueOf(ActionCreateComment.this.message.getId()));
                ActionCreateComment.this.createMessage(fromState, fromState2, dispatcher2, callback2, attachmentUploadResult);
            }
        };
        this.attachmentCallback = r1;
        this.attachmentUploader.setResultListener(r1);
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        List<StateRequestAttachment> attachments = this.message.getAttachments();
        String localId = StateConversation.fromState(getState.getState()).getLocalId();
        if (kj0.m47118i(attachments)) {
            Logger.m43078b(RequestActivity.LOG_TAG, "Start uploading %d attachments. Message Id: %s", Integer.valueOf(attachments.size()), Long.valueOf(this.message.getId()));
            this.attachmentUploader.start(localId);
        }
        dispatcher.dispatch(this.f46845af.createComment(this.message.withPending()));
    }

    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        waitForAttachments(dispatcher, getState, callback);
    }
}
