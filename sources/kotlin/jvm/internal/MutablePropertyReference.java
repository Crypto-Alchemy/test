package kotlin.jvm.internal;

import p000.f93;
import p000.i93;

public abstract class MutablePropertyReference extends PropertyReference implements f93 {
    public MutablePropertyReference() {
    }

    public abstract /* synthetic */ i93.C5953b getGetter();

    public abstract /* synthetic */ f93.C5836a getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
