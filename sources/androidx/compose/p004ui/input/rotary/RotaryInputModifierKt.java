package androidx.compose.p004ui.input.rotary;

import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.Metadata;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u001a$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0003\".\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t0\b8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lsw3;", "Lkotlin/Function1;", "Lvh5;", "", "onRotaryScrollEvent", "c", "Li62;", "a", "Liy4;", "Lh62;", "Liy4;", "b", "()Liy4;", "getModifierLocalRotaryScrollParent$annotations", "()V", "ModifierLocalRotaryScrollParent", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierKt */
/* compiled from: RotaryInputModifier.kt */
public final class RotaryInputModifierKt {

    /* renamed from: a */
    public static final iy4<h62<vh5>> f1704a = ww3.m29725a(RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1.INSTANCE);

    /* renamed from: a */
    public static final rc2<i62, Boolean> m2460a(rc2<? super vh5, Boolean> rc2) {
        return new RotaryInputModifierKt$focusAwareCallback$1(rc2);
    }

    /* renamed from: b */
    public static final iy4<h62<vh5>> m2461b() {
        return f1704a;
    }

    /* renamed from: c */
    public static final sw3 m2462c(sw3 sw3, rc2<? super vh5, Boolean> rc2) {
        rc2 rc22;
        vx2.m53591g(sw3, "<this>");
        vx2.m53591g(rc2, "onRotaryScrollEvent");
        if (InspectableValueKt.m3089c()) {
            rc22 = new C0371xf2432cea(rc2);
        } else {
            rc22 = InspectableValueKt.m3087a();
        }
        sw3.C3308a aVar = sw3.f17820m;
        return InspectableValueKt.m3088b(sw3, rc22, new h62(m2460a(rc2), (rc2<? super i62, Boolean>) null, f1704a));
    }
}
