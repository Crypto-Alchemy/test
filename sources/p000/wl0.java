package p000;

import com.google.common.primitives.Ints;
import java.util.Comparator;

/* renamed from: wl0 */
/* compiled from: ComparisonChain */
public abstract class wl0 {

    /* renamed from: a */
    public static final wl0 f35371a = new C6665a();

    /* renamed from: b */
    public static final wl0 f35372b = new C6666b(-1);

    /* renamed from: c */
    public static final wl0 f35373c = new C6666b(1);

    /* renamed from: wl0$a */
    /* compiled from: ComparisonChain */
    public class C6665a extends wl0 {
        public C6665a() {
            super((C6665a) null);
        }

        /* renamed from: d */
        public wl0 mo49221d(int i, int i2) {
            return mo49227k(Ints.m37046e(i, i2));
        }

        /* renamed from: e */
        public wl0 mo49222e(long j, long j2) {
            return mo49227k(ll3.m47833a(j, j2));
        }

        /* renamed from: f */
        public <T> wl0 mo49223f(T t, T t2, Comparator<T> comparator) {
            return mo49227k(comparator.compare(t, t2));
        }

        /* renamed from: g */
        public wl0 mo49224g(boolean z, boolean z2) {
            return mo49227k(s30.m51518a(z, z2));
        }

        /* renamed from: h */
        public wl0 mo49225h(boolean z, boolean z2) {
            return mo49227k(s30.m51518a(z2, z));
        }

        /* renamed from: i */
        public int mo49226i() {
            return 0;
        }

        /* renamed from: k */
        public wl0 mo49227k(int i) {
            if (i < 0) {
                return wl0.f35372b;
            }
            if (i > 0) {
                return wl0.f35373c;
            }
            return wl0.f35371a;
        }
    }

    /* renamed from: wl0$b */
    /* compiled from: ComparisonChain */
    public static final class C6666b extends wl0 {

        /* renamed from: d */
        public final int f35374d;

        public C6666b(int i) {
            super((C6665a) null);
            this.f35374d = i;
        }

        /* renamed from: d */
        public wl0 mo49221d(int i, int i2) {
            return this;
        }

        /* renamed from: e */
        public wl0 mo49222e(long j, long j2) {
            return this;
        }

        /* renamed from: f */
        public <T> wl0 mo49223f(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        /* renamed from: g */
        public wl0 mo49224g(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: h */
        public wl0 mo49225h(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: i */
        public int mo49226i() {
            return this.f35374d;
        }
    }

    public wl0() {
    }

    public /* synthetic */ wl0(C6665a aVar) {
        this();
    }

    /* renamed from: j */
    public static wl0 m53949j() {
        return f35371a;
    }

    /* renamed from: d */
    public abstract wl0 mo49221d(int i, int i2);

    /* renamed from: e */
    public abstract wl0 mo49222e(long j, long j2);

    /* renamed from: f */
    public abstract <T> wl0 mo49223f(T t, T t2, Comparator<T> comparator);

    /* renamed from: g */
    public abstract wl0 mo49224g(boolean z, boolean z2);

    /* renamed from: h */
    public abstract wl0 mo49225h(boolean z, boolean z2);

    /* renamed from: i */
    public abstract int mo49226i();
}
