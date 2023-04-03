package zendesk.support.request;

import android.content.Context;
import zendesk.belvedere.C9800a;

public final class RequestModule_ProvidesBelvedereFactory implements ry1<C9800a> {
    private final ky4<Context> contextProvider;

    public RequestModule_ProvidesBelvedereFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static RequestModule_ProvidesBelvedereFactory create(ky4<Context> ky4) {
        return new RequestModule_ProvidesBelvedereFactory(ky4);
    }

    public static C9800a providesBelvedere(Context context) {
        return (C9800a) fu4.m44415f(RequestModule.providesBelvedere(context));
    }

    public C9800a get() {
        return providesBelvedere(this.contextProvider.get());
    }
}
