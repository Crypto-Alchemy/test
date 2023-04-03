package zendesk.core;

import android.content.Context;

public final class CoreModule_GetApplicationContextFactory implements ry1<Context> {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationContextFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }

    public static Context getApplicationContext(CoreModule coreModule) {
        return (Context) fu4.m44415f(coreModule.getApplicationContext());
    }

    public Context get() {
        return getApplicationContext(this.module);
    }
}
