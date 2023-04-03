package p000;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

/* renamed from: s5 */
/* compiled from: ArrayMapOwner.kt */
public abstract class C9303s5<K, V> implements Iterable<V>, a93 {

    /* renamed from: s5$a */
    /* compiled from: ArrayMapOwner.kt */
    public static abstract class C9304a<K, V, T extends V> {

        /* renamed from: a */
        public final q83<? extends K> f44532a;

        /* renamed from: b */
        public final int f44533b;

        public C9304a(q83<? extends K> q83, int i) {
            vx2.m53591g(q83, "key");
            this.f44532a = q83;
            this.f44533b = i;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [s5, s5<K, V>, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T mo65823c(p000.C9303s5<K, V> r2) {
            /*
                r1 = this;
                java.lang.String r0 = "thisRef"
                p000.vx2.m53591g(r2, r0)
                mq r2 = r2.mo55772e()
                int r0 = r1.f44533b
                java.lang.Object r2 = r2.get(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C9303s5.C9304a.mo65823c(s5):java.lang.Object");
        }
    }

    /* renamed from: e */
    public abstract C7913mq<V> mo55772e();

    public final boolean isEmpty() {
        if (mo55772e().mo56310e() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator<V> iterator() {
        return mo55772e().iterator();
    }

    /* renamed from: j */
    public abstract TypeRegistry<K, V> mo65776j();
}
