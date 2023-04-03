package zendesk.core;

import android.content.Context;

public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements ry1<Context> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationContextFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }

    public static Context provideApplicationContext(ZendeskApplicationModule zendeskApplicationModule) {
        return (Context) fu4.m44415f(zendeskApplicationModule.provideApplicationContext());
    }

    public Context get() {
        return provideApplicationContext(this.module);
    }
}
