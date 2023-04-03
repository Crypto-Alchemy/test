package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, mo44877d2 = {"Lip6;", "", "Lnt1;", "a", "()Lnt1;", "Lr37;", "c", "()V", "eventLoop", "d", "(Lnt1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ip6 */
/* compiled from: EventLoop.common.kt */
public final class ip6 {

    /* renamed from: a */
    public static final ip6 f38501a = new ip6();

    /* renamed from: b */
    public static final ThreadLocal<nt1> f38502b = new ThreadLocal<>();

    /* renamed from: a */
    public final nt1 mo52518a() {
        return f38502b.get();
    }

    /* renamed from: b */
    public final nt1 mo52519b() {
        ThreadLocal<nt1> threadLocal = f38502b;
        nt1 nt1 = threadLocal.get();
        if (nt1 != null) {
            return nt1;
        }
        nt1 a = pt1.m71114a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo52520c() {
        f38502b.set((Object) null);
    }

    /* renamed from: d */
    public final void mo52521d(nt1 nt1) {
        f38502b.set(nt1);
    }
}
