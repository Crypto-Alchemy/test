package zendesk.support.requestlist;

import zendesk.core.ActionHandlerRegistry;

public final class RequestListActivity_MembersInjector implements ts3<RequestListActivity> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<RequestListModel> modelProvider;
    private final ky4<RequestListPresenter> presenterProvider;
    private final ky4<RequestListSyncHandler> syncHandlerProvider;
    private final ky4<RequestListView> viewProvider;

    public RequestListActivity_MembersInjector(ky4<RequestListPresenter> ky4, ky4<RequestListView> ky42, ky4<RequestListModel> ky43, ky4<ActionHandlerRegistry> ky44, ky4<RequestListSyncHandler> ky45) {
        this.presenterProvider = ky4;
        this.viewProvider = ky42;
        this.modelProvider = ky43;
        this.actionHandlerRegistryProvider = ky44;
        this.syncHandlerProvider = ky45;
    }

    public static ts3<RequestListActivity> create(ky4<RequestListPresenter> ky4, ky4<RequestListView> ky42, ky4<RequestListModel> ky43, ky4<ActionHandlerRegistry> ky44, ky4<RequestListSyncHandler> ky45) {
        return new RequestListActivity_MembersInjector(ky4, ky42, ky43, ky44, ky45);
    }

    public static void injectActionHandlerRegistry(RequestListActivity requestListActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestListActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectModel(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.model = (RequestListModel) obj;
    }

    public static void injectPresenter(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.presenter = (RequestListPresenter) obj;
    }

    public static void injectSyncHandler(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.syncHandler = (RequestListSyncHandler) obj;
    }

    public static void injectView(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.view = (RequestListView) obj;
    }

    public void injectMembers(RequestListActivity requestListActivity) {
        injectPresenter(requestListActivity, this.presenterProvider.get());
        injectView(requestListActivity, this.viewProvider.get());
        injectModel(requestListActivity, this.modelProvider.get());
        injectActionHandlerRegistry(requestListActivity, this.actionHandlerRegistryProvider.get());
        injectSyncHandler(requestListActivity, this.syncHandlerProvider.get());
    }
}
