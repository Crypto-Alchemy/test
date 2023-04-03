package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
public final class NullabilityAnnotationStatesImpl<T> implements cc4<T> {

    /* renamed from: b */
    public final Map<u82, T> f39407b;

    /* renamed from: c */
    public final LockBasedStorageManager f39408c;

    /* renamed from: d */
    public final ws3<u82, T> f39409d;

    public NullabilityAnnotationStatesImpl(Map<u82, ? extends T> map) {
        vx2.m53591g(map, "states");
        this.f39407b = map;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.f39408c = lockBasedStorageManager;
        ws3<u82, T> d = lockBasedStorageManager.mo51159d(new NullabilityAnnotationStatesImpl$cache$1(this));
        vx2.m53590f(d, "storageManager.createMem…cificFqname(states)\n    }");
        this.f39409d = d;
    }

    /* renamed from: a */
    public T mo50852a(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return this.f39409d.invoke(u82);
    }

    /* renamed from: b */
    public final Map<u82, T> mo53452b() {
        return this.f39407b;
    }
}
