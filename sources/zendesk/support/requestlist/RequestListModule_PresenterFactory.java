package zendesk.support.requestlist;

public final class RequestListModule_PresenterFactory implements ry1<RequestListPresenter> {
    private final ky4<RequestListModel> modelProvider;
    private final RequestListModule module;

    public RequestListModule_PresenterFactory(RequestListModule requestListModule, ky4<RequestListModel> ky4) {
        this.module = requestListModule;
        this.modelProvider = ky4;
    }

    public static RequestListModule_PresenterFactory create(RequestListModule requestListModule, ky4<RequestListModel> ky4) {
        return new RequestListModule_PresenterFactory(requestListModule, ky4);
    }

    public static RequestListPresenter presenter(RequestListModule requestListModule, Object obj) {
        return (RequestListPresenter) fu4.m44415f(requestListModule.presenter((RequestListModel) obj));
    }

    public RequestListPresenter get() {
        return presenter(this.module, this.modelProvider.get());
    }
}
