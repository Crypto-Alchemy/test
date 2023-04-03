package zendesk.support.requestlist;

public final class RequestListModule_RefreshHandlerFactory implements ry1<RequestListSyncHandler> {
    private final ky4<RequestListPresenter> presenterProvider;

    public RequestListModule_RefreshHandlerFactory(ky4<RequestListPresenter> ky4) {
        this.presenterProvider = ky4;
    }

    public static RequestListModule_RefreshHandlerFactory create(ky4<RequestListPresenter> ky4) {
        return new RequestListModule_RefreshHandlerFactory(ky4);
    }

    public static RequestListSyncHandler refreshHandler(Object obj) {
        return (RequestListSyncHandler) fu4.m44415f(RequestListModule.refreshHandler((RequestListPresenter) obj));
    }

    public RequestListSyncHandler get() {
        return refreshHandler(this.presenterProvider.get());
    }
}
