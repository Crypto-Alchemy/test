package zendesk.support;

public final class SupportApplicationModule_ProvidesZendeskTrackerFactory implements ry1<ZendeskTracker> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvidesZendeskTrackerFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvidesZendeskTrackerFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvidesZendeskTrackerFactory(supportApplicationModule);
    }

    public static ZendeskTracker providesZendeskTracker(SupportApplicationModule supportApplicationModule) {
        return (ZendeskTracker) fu4.m44415f(supportApplicationModule.providesZendeskTracker());
    }

    public ZendeskTracker get() {
        return providesZendeskTracker(this.module);
    }
}
