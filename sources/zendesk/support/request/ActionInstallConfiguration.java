package zendesk.support.request;

import com.zendesk.logger.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.IdUtil;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

class ActionInstallConfiguration implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f46846af;
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    private final Executor executor;
    /* access modifiers changed from: private */
    public final Executor mainThreadExecutor;
    /* access modifiers changed from: private */
    public final RequestConfiguration startConfig;
    /* access modifiers changed from: private */
    public final SupportUiStorage supportUiStorage;

    public ActionInstallConfiguration(SupportUiStorage supportUiStorage2, RequestConfiguration requestConfiguration, Executor executor2, Executor executor3, ActionFactory actionFactory, SupportBlipsProvider supportBlipsProvider) {
        this.supportUiStorage = supportUiStorage2;
        this.startConfig = requestConfiguration;
        this.executor = executor2;
        this.mainThreadExecutor = executor3;
        this.f46846af = actionFactory;
        this.blipsProvider = supportBlipsProvider;
    }

    public void actionQueued(Dispatcher dispatcher, GetState getState) {
    }

    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        this.executor.execute(new Runnable() {
            public void run() {
                List list;
                boolean b = kb6.m46949b(ActionInstallConfiguration.this.startConfig.getRequestId());
                boolean b2 = kb6.m46949b(ActionInstallConfiguration.this.startConfig.getLocalRequestId());
                String requestId = ActionInstallConfiguration.this.startConfig.getRequestId();
                String localRequestId = ActionInstallConfiguration.this.startConfig.getLocalRequestId();
                if (!b || !b2) {
                    ComponentPersistence.RequestIdMapper requestIdMapper = (ComponentPersistence.RequestIdMapper) ActionInstallConfiguration.this.supportUiStorage.read(SupportUiStorage.REQUEST_MAPPER, ComponentPersistence.RequestIdMapper.class);
                    if (requestIdMapper != null) {
                        if (b2) {
                            requestId = requestIdMapper.getRemoteId(localRequestId);
                        } else if (b) {
                            localRequestId = requestIdMapper.getLocalId(requestId);
                        }
                    }
                    if (!kb6.m46949b(localRequestId)) {
                        localRequestId = IdUtil.newStringId();
                    }
                }
                String str = requestId;
                String str2 = localRequestId;
                if (kb6.m46949b(str)) {
                    ActionInstallConfiguration.this.blipsProvider.requestViewed(str);
                }
                Logger.m43078b(RequestActivity.LOG_TAG, "Request information loaded from disk. Remote id: '%s'. Local id: '%s'", str, str2);
                if (kb6.m46951d(str)) {
                    list = ActionInstallConfiguration.this.startConfig.getFilesAsAttachments();
                } else {
                    list = new ArrayList();
                }
                final RequestConfiguration requestConfiguration = new RequestConfiguration(ActionInstallConfiguration.this.startConfig.getRequestSubject(), ActionInstallConfiguration.this.startConfig.getTags(), str, str2, ActionInstallConfiguration.this.startConfig.getRequestStatus(), ActionInstallConfiguration.this.startConfig.getCustomFields(), ActionInstallConfiguration.this.startConfig.getTicketFormId(), list, ActionInstallConfiguration.this.startConfig.hasAgentReplies(), ActionInstallConfiguration.this.startConfig.getConfigurations());
                ActionInstallConfiguration.this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        C100671 r0 = C100671.this;
                        dispatcher.dispatch(ActionInstallConfiguration.this.f46846af.startConfig(requestConfiguration));
                        callback.done();
                    }
                });
            }
        });
    }
}
