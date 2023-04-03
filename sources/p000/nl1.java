package p000;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0011¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000e"}, mo44877d2 = {"Lnl1;", "T", "Lhy4;", "value", "Lr86;", "b", "(Ljava/lang/Object;Lnn0;I)Lr86;", "Lh56;", "Lh56;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lh56;Lpc2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nl1 */
/* compiled from: CompositionLocal.kt */
public final class nl1<T> extends hy4<T> {

    /* renamed from: b */
    public final h56<T> f15607b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nl1(h56<T> h56, pc2<? extends T> pc2) {
        super(pc2);
        vx2.m53591g(h56, "policy");
        vx2.m53591g(pc2, "defaultFactory");
        this.f15607b = h56;
    }

    /* renamed from: b */
    public r86<T> mo18866b(T t, nn0 nn0, int i) {
        nn0.mo2953i(-84026900);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(-84026900, i, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        nn0.mo2953i(-492369756);
        Object j = nn0.mo2956j();
        if (j == nn0.f15626a.mo23753a()) {
            j = i56.m19412a(t, this.f15607b);
            nn0.mo2941e(j);
        }
        nn0.mo2968o();
        t04 t04 = (t04) j;
        t04.setValue(t);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn0.mo2968o();
        return t04;
    }
}
