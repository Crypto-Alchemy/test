package zendesk.messaging.p026ui;

/* renamed from: zendesk.messaging.ui.AvatarStateFactory_Factory */
public final class AvatarStateFactory_Factory implements ry1<AvatarStateFactory> {

    /* renamed from: zendesk.messaging.ui.AvatarStateFactory_Factory$InstanceHolder */
    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final AvatarStateFactory_Factory INSTANCE = new AvatarStateFactory_Factory();
    }

    public static AvatarStateFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AvatarStateFactory newInstance() {
        return new AvatarStateFactory();
    }

    public AvatarStateFactory get() {
        return newInstance();
    }
}
