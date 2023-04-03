package zendesk.messaging;

import android.content.Context;
import android.content.res.Resources;

public final class MessagingModule_ResourcesFactory implements ry1<Resources> {
    private final ky4<Context> contextProvider;

    public MessagingModule_ResourcesFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static MessagingModule_ResourcesFactory create(ky4<Context> ky4) {
        return new MessagingModule_ResourcesFactory(ky4);
    }

    public static Resources resources(Context context) {
        return (Resources) fu4.m44415f(MessagingModule.resources(context));
    }

    public Resources get() {
        return resources(this.contextProvider.get());
    }
}
