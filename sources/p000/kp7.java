package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, mo44877d2 = {"Lr37;", "a", "(Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: kp7 */
/* compiled from: Yield.kt */
public final class kp7 {
    /* renamed from: a */
    public static final Object m63580a(ns0<? super r37> ns0) {
        lh1 lh1;
        Object obj;
        CoroutineContext context = ns0.getContext();
        g33.m58014k(context);
        ns0<? super r37> c = IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0);
        if (c instanceof lh1) {
            lh1 = (lh1) c;
        } else {
            lh1 = null;
        }
        if (lh1 == null) {
            obj = r37.f33317a;
        } else {
            if (lh1.f40619g.mo28541z(context)) {
                lh1.mo55899k(context, r37.f33317a);
            } else {
                jp7 jp7 = new jp7();
                CoroutineContext plus = context.plus(jp7);
                r37 r37 = r37.f33317a;
                lh1.mo55899k(plus, r37);
                if (jp7.f38764d) {
                    if (mh1.m64331d(lh1)) {
                        obj = wx2.m54101d();
                    } else {
                        obj = r37;
                    }
                }
            }
            obj = wx2.m54101d();
        }
        if (obj == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (obj == wx2.m54101d()) {
            return obj;
        }
        return r37.f33317a;
    }
}
