package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"Lad7;", "Lhu0;", "a", "(Lad7;)Lhu0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: cd7 */
/* compiled from: ViewModel.kt */
public final class cd7 {
    /* renamed from: a */
    public static final hu0 m11843a(ad7 ad7) {
        vx2.m53591g(ad7, "<this>");
        hu0 hu0 = (hu0) ad7.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (hu0 != null) {
            return hu0;
        }
        Object tagIfAbsent = ad7.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new jh0(qd6.m71250b((y23) null, 1, (Object) null).plus(qh1.m71266c().mo55551K())));
        vx2.m53590f(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (hu0) tagIfAbsent;
    }
}
