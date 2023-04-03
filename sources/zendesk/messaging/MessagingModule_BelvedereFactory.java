package zendesk.messaging;

import android.content.Context;
import zendesk.belvedere.C9800a;

public final class MessagingModule_BelvedereFactory implements ry1<C9800a> {
    private final ky4<Context> contextProvider;

    public MessagingModule_BelvedereFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static C9800a belvedere(Context context) {
        return (C9800a) fu4.m44415f(MessagingModule.belvedere(context));
    }

    public static MessagingModule_BelvedereFactory create(ky4<Context> ky4) {
        return new MessagingModule_BelvedereFactory(ky4);
    }

    public C9800a get() {
        return belvedere(this.contextProvider.get());
    }
}
