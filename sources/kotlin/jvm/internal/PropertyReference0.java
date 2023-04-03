package kotlin.jvm.internal;

import p000.j93;

public abstract class PropertyReference0 extends PropertyReference implements j93 {
    public PropertyReference0() {
    }

    public o83 computeReflected() {
        return ua5.m52731f(this);
    }

    public abstract /* synthetic */ Object get();

    public Object getDelegate() {
        return ((j93) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    public j93.C6022a getGetter() {
        return ((j93) getReflected()).getGetter();
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
