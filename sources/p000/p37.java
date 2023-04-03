package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aV\u0010\u000f\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aV\u0010\u0011\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"T", "Lkotlin/Function1;", "Lns0;", "", "completion", "Lr37;", "a", "(Lrc2;Lns0;)V", "R", "Lkotlin/Function2;", "receiver", "b", "(Lfd2;Ljava/lang/Object;Lns0;)V", "Ljn5;", "block", "c", "(Ljn5;Ljava/lang/Object;Lfd2;)Ljava/lang/Object;", "d", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: p37 */
/* compiled from: Undispatched.kt */
public final class p37 {
    /* renamed from: a */
    public static final <T> void m70905a(rc2<? super ns0<? super T>, ? extends Object> rc2, ns0<? super T> ns0) {
        CoroutineContext context;
        Object c;
        ns0<? super T> a = a31.m31654a(ns0);
        try {
            context = ns0.getContext();
            c = ThreadContextKt.m63497c(context, (Object) null);
            Object invoke = ((rc2) t07.m52027f(rc2, 1)).invoke(a);
            ThreadContextKt.m63495a(context, c);
            if (invoke != wx2.m54101d()) {
                a.resumeWith(Result.m75635constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.C6167a aVar = Result.Companion;
            a.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
        }
    }

    /* renamed from: b */
    public static final <R, T> void m70906b(fd2<? super R, ? super ns0<? super T>, ? extends Object> fd2, R r, ns0<? super T> ns0) {
        CoroutineContext context;
        Object c;
        ns0<? super T> a = a31.m31654a(ns0);
        try {
            context = ns0.getContext();
            c = ThreadContextKt.m63497c(context, (Object) null);
            Object invoke = ((fd2) t07.m52027f(fd2, 2)).invoke(r, a);
            ThreadContextKt.m63495a(context, c);
            if (invoke != wx2.m54101d()) {
                a.resumeWith(Result.m75635constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.C6167a aVar = Result.Companion;
            a.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
        }
    }

    /* renamed from: c */
    public static final <T, R> Object m70907c(jn5<? super T> jn5, R r, fd2<? super R, ? super ns0<? super T>, ? extends Object> fd2) {
        Object obj;
        try {
            obj = ((fd2) t07.m52027f(fd2, 2)).invoke(r, jn5);
        } catch (Throwable th) {
            obj = new lm0(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == wx2.m54101d()) {
            return wx2.m54101d();
        }
        Object s0 = jn5.mo55523s0(obj);
        if (s0 == k33.f38851b) {
            return wx2.m54101d();
        }
        if (!(s0 instanceof lm0)) {
            return k33.m59674h(s0);
        }
        throw ((lm0) s0).f40642a;
    }

    /* renamed from: d */
    public static final <T, R> Object m70908d(jn5<? super T> jn5, R r, fd2<? super R, ? super ns0<? super T>, ? extends Object> fd2) {
        Object obj;
        boolean z = false;
        try {
            obj = ((fd2) t07.m52027f(fd2, 2)).invoke(r, jn5);
        } catch (Throwable th) {
            obj = new lm0(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == wx2.m54101d()) {
            return wx2.m54101d();
        }
        Object s0 = jn5.mo55523s0(obj);
        if (s0 == k33.f38851b) {
            return wx2.m54101d();
        }
        if (s0 instanceof lm0) {
            Throwable th2 = ((lm0) s0).f40642a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != jn5) {
                z = true;
            }
            if (z) {
                throw th2;
            } else if (obj instanceof lm0) {
                throw ((lm0) obj).f40642a;
            }
        } else {
            obj = k33.m59674h(s0);
        }
        return obj;
    }
}
