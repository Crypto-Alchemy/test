package zendesk.support.requestlist;

import com.squareup.picasso.Picasso;

public final class RequestListViewModule_ViewFactory implements ry1<RequestListView> {
    private final RequestListViewModule module;
    private final ky4<Picasso> picassoProvider;

    public RequestListViewModule_ViewFactory(RequestListViewModule requestListViewModule, ky4<Picasso> ky4) {
        this.module = requestListViewModule;
        this.picassoProvider = ky4;
    }

    public static RequestListViewModule_ViewFactory create(RequestListViewModule requestListViewModule, ky4<Picasso> ky4) {
        return new RequestListViewModule_ViewFactory(requestListViewModule, ky4);
    }

    public static RequestListView view(RequestListViewModule requestListViewModule, Picasso picasso) {
        return (RequestListView) fu4.m44415f(requestListViewModule.view(picasso));
    }

    public RequestListView get() {
        return view(this.module, this.picassoProvider.get());
    }
}
