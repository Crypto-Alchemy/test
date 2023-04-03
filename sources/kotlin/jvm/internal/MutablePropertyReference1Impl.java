package kotlin.jvm.internal;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(y83 y83, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((df0) y83).mo41920k(), str, str2, (y83 instanceof q83) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
