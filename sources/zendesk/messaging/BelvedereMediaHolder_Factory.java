package zendesk.messaging;

public final class BelvedereMediaHolder_Factory implements ry1<BelvedereMediaHolder> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final BelvedereMediaHolder_Factory INSTANCE = new BelvedereMediaHolder_Factory();
    }

    public static BelvedereMediaHolder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BelvedereMediaHolder newInstance() {
        return new BelvedereMediaHolder();
    }

    public BelvedereMediaHolder get() {
        return newInstance();
    }
}
