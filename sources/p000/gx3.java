package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006¨\u0006\b"}, mo44877d2 = {"Ljava/lang/Class;", "Loi5;", "a", "Ljava/util/concurrent/ConcurrentMap;", "Lqj7;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: gx3 */
/* compiled from: moduleByClassLoader.kt */
public final class gx3 {

    /* renamed from: a */
    public static final ConcurrentMap<qj7, WeakReference<oi5>> f38086a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final oi5 m58285a(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        ClassLoader f = ReflectClassUtilKt.m60598f(cls);
        qj7 qj7 = new qj7(f);
        ConcurrentMap<qj7, WeakReference<oi5>> concurrentMap = f38086a;
        WeakReference weakReference = concurrentMap.get(qj7);
        if (weakReference != null) {
            oi5 oi5 = (oi5) weakReference.get();
            if (oi5 != null) {
                return oi5;
            }
            concurrentMap.remove(qj7, weakReference);
        }
        oi5 a = oi5.f43711c.mo62930a(f);
        while (true) {
            try {
                ConcurrentMap<qj7, WeakReference<oi5>> concurrentMap2 = f38086a;
                WeakReference putIfAbsent = concurrentMap2.putIfAbsent(qj7, new WeakReference(a));
                if (putIfAbsent == null) {
                    qj7.mo65482a((ClassLoader) null);
                    return a;
                }
                oi5 oi52 = (oi5) putIfAbsent.get();
                if (oi52 != null) {
                    return oi52;
                }
                concurrentMap2.remove(qj7, putIfAbsent);
            } finally {
                qj7.mo65482a((ClassLoader) null);
            }
        }
    }
}
