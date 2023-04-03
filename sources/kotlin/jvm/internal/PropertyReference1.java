package kotlin.jvm.internal;

import p000.k93;

public abstract class PropertyReference1 extends PropertyReference implements k93 {
    public PropertyReference1() {
    }

    public o83 computeReflected() {
        return ua5.m52732g(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    public Object getDelegate(Object obj) {
        return ((k93) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public k93.C6138a getGetter() {
        return ((k93) getReflected()).getGetter();
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
