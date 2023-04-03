package p000;

import androidx.compose.p004ui.modifier.ModifierLocalManager;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.OwnerSnapshotObserver;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.Metadata;
import p000.y62;
import p000.z62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 v2\u00020\u0001:\u0002\u0010\bJ$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&J$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0012\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J*\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H&J\b\u0010\u0019\u001a\u00020\u0007H&J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H&J\b\u0010\u001d\u001a\u00020\u0007H&J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001eH&R\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u0010=\u001a\u0002088gX§\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R\u001c\u0010B\u001a\u0004\u0018\u00010>8gX§\u0004¢\u0006\f\u0012\u0004\bA\u0010<\u001a\u0004\b?\u0010@R\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010[\u001a\u00020W8&X§\u0004¢\u0006\f\u0012\u0004\bZ\u0010<\u001a\u0004\bX\u0010YR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR$\u0010i\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048&@gX¦\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006wÀ\u0006\u0001"}, mo44877d2 = {"Lnj4;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "Lr37;", "b", "c", "d", "node", "m", "q", "requestFocus", "sendPointerUpdate", "a", "g", "Lkotlin/Function1;", "Lxa0;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "Llj4;", "n", "u", "e", "listener", "o", "t", "Lnj4$b;", "i", "Lye3;", "getSharedDrawScope", "()Lye3;", "sharedDrawScope", "Ldl2;", "getHapticFeedBack", "()Ldl2;", "hapticFeedBack", "Lcv2;", "getInputModeManager", "()Lcv2;", "inputModeManager", "Lyg0;", "getClipboardManager", "()Lyg0;", "clipboardManager", "Li8;", "getAccessibilityManager", "()Li8;", "accessibilityManager", "Lfo6;", "getTextToolbar", "()Lfo6;", "textToolbar", "Luv;", "getAutofillTree", "()Luv;", "getAutofillTree$annotations", "()V", "autofillTree", "Llv;", "getAutofill", "()Llv;", "getAutofill$annotations", "autofill", "Ldc1;", "getDensity", "()Ldc1;", "density", "Lun6;", "getTextInputService", "()Lun6;", "textInputService", "Llr4;", "getPointerIconService", "()Llr4;", "pointerIconService", "Lm62;", "getFocusManager", "()Lm62;", "focusManager", "Lfl7;", "getWindowInfo", "()Lfl7;", "windowInfo", "Ly62$a;", "getFontLoader", "()Ly62$a;", "getFontLoader$annotations", "fontLoader", "Lz62$b;", "getFontFamilyResolver", "()Lz62$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "showLayoutBounds", "Ltb7;", "getViewConfiguration", "()Ltb7;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "p", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nj4 */
/* compiled from: Owner.kt */
public interface nj4 {

    /* renamed from: p */
    public static final C2901a f15566p = C2901a.f15567a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lnj4$a;", "", "", "b", "Z", "a", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: nj4$a */
    /* compiled from: Owner.kt */
    public static final class C2901a {

        /* renamed from: a */
        public static final /* synthetic */ C2901a f15567a = new C2901a();

        /* renamed from: b */
        public static boolean f15568b;

        /* renamed from: a */
        public final boolean mo23706a() {
            return f15568b;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, mo44877d2 = {"Lnj4$b;", "", "Lr37;", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: nj4$b */
    /* compiled from: Owner.kt */
    public interface C2902b {
        /* renamed from: b */
        void mo3379b();
    }

    /* renamed from: a */
    void mo3713a(boolean z);

    /* renamed from: b */
    void mo3716b(LayoutNode layoutNode, boolean z, boolean z2);

    /* renamed from: c */
    void mo3718c(LayoutNode layoutNode, boolean z, boolean z2);

    /* renamed from: d */
    void mo3722d(LayoutNode layoutNode);

    /* renamed from: e */
    void mo3729e(LayoutNode layoutNode);

    /* renamed from: g */
    void mo3733g(LayoutNode layoutNode);

    C2530i8 getAccessibilityManager();

    C2790lv getAutofill();

    C3436uv getAutofillTree();

    yg0 getClipboardManager();

    dc1 getDensity();

    m62 getFocusManager();

    z62.C3714b getFontFamilyResolver();

    y62.C3655a getFontLoader();

    dl2 getHapticFeedBack();

    cv2 getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    lr4 getPointerIconService();

    ye3 getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    un6 getTextInputService();

    fo6 getTextToolbar();

    tb7 getViewConfiguration();

    fl7 getWindowInfo();

    /* renamed from: i */
    void mo3768i(C2902b bVar);

    /* renamed from: m */
    void mo3773m(LayoutNode layoutNode);

    /* renamed from: n */
    lj4 mo3775n(rc2<? super xa0, r37> rc2, pc2<r37> pc2);

    /* renamed from: o */
    void mo3777o(pc2<r37> pc2);

    /* renamed from: q */
    void mo3792q(LayoutNode layoutNode);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z);

    /* renamed from: t */
    void mo3801t();

    /* renamed from: u */
    void mo3802u();
}
