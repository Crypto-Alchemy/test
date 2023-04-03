package kotlin.jvm.internal;

public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(y83 y83, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((df0) y83).mo41920k(), str, str2, (y83 instanceof q83) ^ true ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
