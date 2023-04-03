package p000;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b\"P\u0010\u0012\u001a>\u0012:\u00128\u00124\u00122\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00030\u00010\u000ej\u0002`\u00100\r0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b*d\b\u0002\u0010\u0013\".\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00030\u00010\u000e2.\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00030\u00010\u000e¨\u0006\u0014"}, mo44877d2 = {"R", "Lkotlin/Function1;", "Lr86;", "Lr37;", "start", "done", "Lkotlin/Function0;", "block", "a", "Ln56;", "", "Ln56;", "calculationBlockNestedLevel", "Lv04;", "Lkotlin/Pair;", "Lqc1;", "Landroidx/compose/runtime/DerivedStateObservers;", "b", "derivedStateObservers", "DerivedStateObservers", "runtime_release"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "androidx/compose/runtime/SnapshotStateKt")
/* renamed from: j56 */
/* compiled from: DerivedState.kt */
public final /* synthetic */ class j56 {

    /* renamed from: a */
    public static final n56<Integer> f13515a = new n56<>();

    /* renamed from: b */
    public static final n56<v04<Pair<rc2<qc1<?>, r37>, rc2<qc1<?>, r37>>>> f13516b = new n56<>();

    /* renamed from: a */
    public static final <R> void m19967a(rc2<? super r86<?>, r37> rc2, rc2<? super r86<?>, r37> rc22, pc2<? extends R> pc2) {
        vx2.m53591g(rc2, "start");
        vx2.m53591g(rc22, "done");
        vx2.m53591g(pc2, "block");
        n56<v04<Pair<rc2<qc1<?>, r37>, rc2<qc1<?>, r37>>>> n56 = f13516b;
        v04 a = n56.mo23520a();
        if (a == null) {
            v04 v04 = new v04(new Pair[16], 0);
            n56.mo23521b(v04);
            a = v04;
        }
        try {
            a.mo26953c(wy6.m54142a(rc2, rc22));
            pc2.invoke();
        } finally {
            a.mo26971x(a.mo26963n() - 1);
        }
    }
}
