package p000;

import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\"\u001e\u0010\n\u001a\u00020\u0005*\u00020\u00008@X\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lyt5;", "Lvt5;", "a", "La95;", "c", "", "b", "(Lyt5;)Z", "getUseMinimumTouchTarget$annotations", "(Lyt5;)V", "useMinimumTouchTarget", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: zt5 */
/* compiled from: SemanticsModifierNode.kt */
public final class zt5 {
    /* renamed from: a */
    public static final vt5 m31502a(yt5 yt5) {
        vx2.m53591g(yt5, "<this>");
        sw3.C3310c d = ob1.m23742d(yt5, g84.f12195a.mo20434j());
        if (!(d instanceof yt5)) {
            d = null;
        }
        yt5 yt52 = (yt5) d;
        if (yt52 == null || yt5.mo3368h().mo27324t()) {
            return yt5.mo3368h();
        }
        vt5 n = yt5.mo3368h().mo27320n();
        n.mo27318j(m31502a(yt52));
        return n;
    }

    /* renamed from: b */
    public static final boolean m31503b(yt5 yt5) {
        vx2.m53591g(yt5, "<this>");
        if (SemanticsConfigurationKt.m3168a(yt5.mo3368h(), tt5.f18260a.mo26560h()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final a95 m31504c(yt5 yt5) {
        vx2.m53591g(yt5, "<this>");
        if (!yt5.mo23638l().mo25990y()) {
            return a95.f70e.mo127a();
        }
        if (!m31503b(yt5)) {
            return ne3.m23129b(ob1.m23743e(yt5, g84.f12195a.mo20434j()));
        }
        return ob1.m23743e(yt5, g84.f12195a.mo20434j()).mo3635w1();
    }
}
