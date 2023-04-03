package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\"\u0018\u0010\u000e\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"T", "Lnh1;", "", "mode", "Lr37;", "a", "Lns0;", "delegate", "", "undispatched", "d", "e", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: oh1 */
/* compiled from: DispatchedTask.kt */
public final class oh1 {
    /* renamed from: a */
    public static final <T> void m70281a(nh1<? super T> nh1, int i) {
        boolean z;
        ns0<? super T> b = nh1.mo55895b();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(b instanceof lh1) || m70282b(i) != m70282b(nh1.f43474e)) {
            m70284d(nh1, b, z);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((lh1) b).f40619g;
        CoroutineContext context = b.getContext();
        if (coroutineDispatcher.mo28541z(context)) {
            coroutineDispatcher.mo3894m(context, nh1);
        } else {
            m70285e(nh1);
        }
    }

    /* renamed from: b */
    public static final boolean m70282b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m70283c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m70284d(nh1<? super T> nh1, ns0<? super T> ns0, boolean z) {
        Object obj;
        o37<?> o37;
        Object g = nh1.mo55896g();
        Throwable c = nh1.mo56411c(g);
        if (c != null) {
            Result.C6167a aVar = Result.Companion;
            obj = hg5.m45198a(c);
        } else {
            Result.C6167a aVar2 = Result.Companion;
            obj = nh1.mo56412d(g);
        }
        Object r3 = Result.m75635constructorimpl(obj);
        if (z) {
            lh1 lh1 = (lh1) ns0;
            ns0<T> ns02 = lh1.f40620k;
            Object obj2 = lh1.f40622s;
            CoroutineContext context = ns02.getContext();
            Object c2 = ThreadContextKt.m63497c(context, obj2);
            if (c2 != ThreadContextKt.f40474a) {
                o37 = CoroutineContextKt.m63136g(ns02, context, c2);
            } else {
                o37 = null;
            }
            try {
                lh1.f40620k.resumeWith(r3);
                r37 r37 = r37.f33317a;
            } finally {
                if (o37 == null || o37.mo62831U0()) {
                    ThreadContextKt.m63495a(context, c2);
                }
            }
        } else {
            ns0.resumeWith(r3);
        }
    }

    /* renamed from: e */
    public static final void m70285e(nh1<?> nh1) {
        nt1 b = ip6.f38501a.mo52519b();
        if (b.mo62803W()) {
            b.mo62801O(nh1);
            return;
        }
        b.mo62802Q(true);
        try {
            m70284d(nh1, nh1.mo55895b(), true);
            do {
            } while (b.mo62805b0());
        } catch (Throwable th) {
            b.mo62799K(true);
            throw th;
        }
        b.mo62799K(true);
    }
}
