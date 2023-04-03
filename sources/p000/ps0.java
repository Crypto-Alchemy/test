package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¨\u0006\n"}, mo44877d2 = {"Lps0;", "Lkotlin/coroutines/CoroutineContext$a;", "T", "Lns0;", "continuation", "x", "Lr37;", "s", "h", "b", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ps0 */
/* compiled from: ContinuationInterceptor.kt */
public interface ps0 extends CoroutineContext.C6188a {

    /* renamed from: h */
    public static final C6371b f32794h = C6371b.f32795a;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: ps0$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C6370a {
        /* renamed from: a */
        public static <E extends CoroutineContext.C6188a> E m50087a(ps0 ps0, CoroutineContext.C6190b<E> bVar) {
            vx2.m53591g(bVar, "key");
            if (bVar instanceof C3800a6) {
                C3800a6 a6Var = (C3800a6) bVar;
                if (!a6Var.mo28881a(ps0.getKey())) {
                    return null;
                }
                E b = a6Var.mo28882b(ps0);
                if (b instanceof CoroutineContext.C6188a) {
                    return b;
                }
                return null;
            } else if (ps0.f32794h != bVar) {
                return null;
            } else {
                vx2.m53589e(ps0, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return ps0;
            }
        }

        /* renamed from: b */
        public static CoroutineContext m50088b(ps0 ps0, CoroutineContext.C6190b<?> bVar) {
            vx2.m53591g(bVar, "key");
            if (bVar instanceof C3800a6) {
                C3800a6 a6Var = (C3800a6) bVar;
                if (!a6Var.mo28881a(ps0.getKey()) || a6Var.mo28882b(ps0) == null) {
                    return ps0;
                }
                return EmptyCoroutineContext.INSTANCE;
            } else if (ps0.f32794h == bVar) {
                return EmptyCoroutineContext.INSTANCE;
            } else {
                return ps0;
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Lps0$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lps0;", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ps0$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C6371b implements CoroutineContext.C6190b<ps0> {

        /* renamed from: a */
        public static final /* synthetic */ C6371b f32795a = new C6371b();
    }

    /* renamed from: s */
    void mo46863s(ns0<?> ns0);

    /* renamed from: x */
    <T> ns0<T> mo46864x(ns0<? super T> ns0);
}
