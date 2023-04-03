package zendesk.core;

import com.google.gson.Gson;

public final class ZendeskApplicationModule_ProvideGsonFactory implements ry1<Gson> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideGsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Gson provideGson() {
        return (Gson) fu4.m44415f(ZendeskApplicationModule.provideGson());
    }

    public Gson get() {
        return provideGson();
    }
}
