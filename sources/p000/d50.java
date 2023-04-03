package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C7759c;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.ThreadContextKt;
import p000.ps0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aL\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aR\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"Lhu0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lns0;", "Lr37;", "", "block", "Ly23;", "a", "(Lhu0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lfd2;)Ly23;", "T", "c", "(Lkotlin/coroutines/CoroutineContext;Lfd2;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: d50 */
/* compiled from: Builders.common.kt */
public final /* synthetic */ class d50 {
    /* renamed from: a */
    public static final y23 m56747a(hu0 hu0, CoroutineContext coroutineContext, CoroutineStart coroutineStart, fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2) {
        C9627y5 y5Var;
        CoroutineContext d = CoroutineContextKt.m63133d(hu0, coroutineContext);
        if (coroutineStart.isLazy()) {
            y5Var = new uf3(d, fd2);
        } else {
            y5Var = new z76(d, true);
        }
        y5Var.mo67038S0(coroutineStart, y5Var, fd2);
        return y5Var;
    }

    /* renamed from: b */
    public static /* synthetic */ y23 m56748b(hu0 hu0, CoroutineContext coroutineContext, CoroutineStart coroutineStart, fd2 fd2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return b50.m55764a(hu0, coroutineContext, coroutineStart, fd2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static final <T> Object m56749c(CoroutineContext coroutineContext, fd2<? super hu0, ? super ns0<? super T>, ? extends Object> fd2, ns0<? super T> ns0) {
        Object obj;
        CoroutineContext context = ns0.getContext();
        CoroutineContext e = CoroutineContextKt.m63134e(context, coroutineContext);
        g33.m58014k(e);
        if (e == context) {
            jn5 jn5 = new jn5(e, ns0);
            obj = p37.m70907c(jn5, jn5, fd2);
        } else {
            ps0.C6371b bVar = ps0.f32794h;
            if (vx2.m53586b(e.get(bVar), context.get(bVar))) {
                o37 o37 = new o37(e, ns0);
                Object c = ThreadContextKt.m63497c(e, (Object) null);
                try {
                    Object c2 = p37.m70907c(o37, o37, fd2);
                    ThreadContextKt.m63495a(e, c);
                    obj = c2;
                } catch (Throwable th) {
                    ThreadContextKt.m63495a(e, c);
                    throw th;
                }
            } else {
                C7759c cVar = new C7759c(e, ns0);
                qa0.m71199e(fd2, cVar, cVar, (rc2) null, 4, (Object) null);
                obj = cVar.mo55570U0();
            }
        }
        if (obj == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return obj;
    }
}
