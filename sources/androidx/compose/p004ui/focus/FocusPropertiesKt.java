package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.node.OwnerSnapshotObserver;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0000\"\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Ls62;", "properties", "Lr37;", "d", "a", "c", "Liy4;", "Lt62;", "Liy4;", "b", "()Liy4;", "ModifierLocalFocusProperties", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.FocusPropertiesKt */
/* compiled from: FocusProperties.kt */
public final class FocusPropertiesKt {

    /* renamed from: a */
    public static final iy4<t62> f1651a = ww3.m29725a(FocusPropertiesKt$ModifierLocalFocusProperties$1.INSTANCE);

    /* renamed from: a */
    public static final void m2375a(s62 s62) {
        vx2.m53591g(s62, "<this>");
        s62.mo3247j(true);
        FocusRequester.C0359a aVar = FocusRequester.f1652b;
        s62.mo3259v(aVar.mo3268b());
        s62.mo3258u(aVar.mo3268b());
        s62.mo3245h(aVar.mo3268b());
        s62.mo3249l(aVar.mo3268b());
        s62.mo3251n(aVar.mo3268b());
        s62.mo3252o(aVar.mo3268b());
        s62.mo3253p(aVar.mo3268b());
        s62.mo3250m(aVar.mo3268b());
        s62.mo3256s(FocusPropertiesKt$clear$1.INSTANCE);
        s62.mo3257t(FocusPropertiesKt$clear$2.INSTANCE);
    }

    /* renamed from: b */
    public static final iy4<t62> m2376b() {
        return f1651a;
    }

    /* renamed from: c */
    public static final void m2377c(FocusModifier focusModifier) {
        OwnerSnapshotObserver snapshotObserver;
        vx2.m53591g(focusModifier, "<this>");
        NodeCoordinator t = focusModifier.mo3226t();
        if (t != null) {
            m2375a(focusModifier.mo3228v());
            nj4 U = t.mo3596X().mo3428U();
            if (!(U == null || (snapshotObserver = U.getSnapshotObserver()) == null)) {
                snapshotObserver.mo3657h(focusModifier, FocusModifier.f1620P.mo3233a(), new FocusPropertiesKt$refreshFocusProperties$1(focusModifier));
            }
            m2378d(focusModifier, focusModifier.mo3228v());
        }
    }

    /* renamed from: d */
    public static final void m2378d(FocusModifier focusModifier, s62 s62) {
        vx2.m53591g(focusModifier, "<this>");
        vx2.m53591g(s62, "properties");
        if (s62.mo3254q()) {
            FocusTransactionsKt.m2388a(focusModifier);
        } else {
            FocusTransactionsKt.m2392e(focusModifier);
        }
    }
}
