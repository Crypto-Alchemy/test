package kotlin.jvm.internal;

import p000.g93;
import p000.k93;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements g93 {
    public MutablePropertyReference1() {
    }

    public o83 computeReflected() {
        return ua5.m52730e(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    public Object getDelegate(Object obj) {
        return ((g93) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public k93.C6138a getGetter() {
        return ((g93) getReflected()).getGetter();
    }

    public g93.C5858a getSetter() {
        return ((g93) getReflected()).getSetter();
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
