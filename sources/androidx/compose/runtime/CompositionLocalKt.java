package androidx.compose.runtime;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a9\u0010\r\u001a\u00020\u000b2\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo44877d2 = {"T", "Lh56;", "policy", "Lkotlin/Function0;", "defaultFactory", "Lhy4;", "b", "d", "", "Ljy4;", "values", "Lr37;", "content", "a", "([Ljy4;Lfd2;Lnn0;I)V", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: CompositionLocal.kt */
public final class CompositionLocalKt {
    /* renamed from: a */
    public static final void m2035a(jy4<?>[] jy4Arr, fd2<? super nn0, ? super Integer, r37> fd2, nn0 nn0, int i) {
        vx2.m53591g(jy4Arr, "values");
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        nn0 a = nn0.mo2929a(-1390796515);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        a.mo2944f(jy4Arr);
        fd2.invoke(a, Integer.valueOf((i >> 3) & 14));
        a.mo2965n();
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new CompositionLocalKt$CompositionLocalProvider$1(jy4Arr, fd2, i));
        }
    }

    /* renamed from: b */
    public static final <T> hy4<T> m2036b(h56<T> h56, pc2<? extends T> pc2) {
        vx2.m53591g(h56, "policy");
        vx2.m53591g(pc2, "defaultFactory");
        return new nl1(h56, pc2);
    }

    /* renamed from: c */
    public static /* synthetic */ hy4 m2037c(h56 h56, pc2 pc2, int i, Object obj) {
        if ((i & 1) != 0) {
            h56 = i56.m19417f();
        }
        return m2036b(h56, pc2);
    }

    /* renamed from: d */
    public static final <T> hy4<T> m2038d(pc2<? extends T> pc2) {
        vx2.m53591g(pc2, "defaultFactory");
        return new i96(pc2);
    }
}
