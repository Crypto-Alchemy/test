package zendesk.support.request;

import com.zendesk.logger.Logger;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

class ActionLoadRequest implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f46850af;
    private final RequestProvider requestProvider;

    public ActionLoadRequest(ActionFactory actionFactory, RequestProvider requestProvider2) {
        this.f46850af = actionFactory;
        this.requestProvider = requestProvider2;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.f46850af.loadRequest());
    }

    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        String remoteId = fromState.getRemoteId();
        if (!kb6.m46949b(remoteId)) {
            Logger.m43078b(RequestActivity.LOG_TAG, "Skip loading request. No remote id found.", new Object[0]);
            dispatcher.dispatch(this.f46850af.skipAction());
            callback.done();
        } else if (fromState.getStatus() != null) {
            Logger.m43078b(RequestActivity.LOG_TAG, "Skip loading request. Request status already available.", new Object[0]);
            dispatcher.dispatch(this.f46850af.skipAction());
            callback.done();
        } else {
            this.requestProvider.getRequest(remoteId, new op7<Request>() {
                public void onError(hr1 hr1) {
                    Logger.m43087k(RequestActivity.LOG_TAG, "Error loading request. Error: '%s'", hr1.mo43366h());
                    dispatcher.dispatch(ActionLoadRequest.this.f46850af.loadRequestError(hr1));
                    callback.done();
                }

                public void onSuccess(Request request) {
                    dispatcher.dispatch(ActionLoadRequest.this.f46850af.loadRequestSuccess(request));
                    callback.done();
                }
            });
        }
    }
}
