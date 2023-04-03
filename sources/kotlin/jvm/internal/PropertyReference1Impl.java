package kotlin.jvm.internal;

public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(y83 y83, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((df0) y83).mo41920k(), str, str2, (y83 instanceof q83) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
