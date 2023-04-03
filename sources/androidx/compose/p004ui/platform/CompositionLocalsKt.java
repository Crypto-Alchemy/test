package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.y62;
import p000.z62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\"\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"(\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r8GX\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0011\"&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\r8GX\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0011\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\r8\u0006¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0011\"&\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010\u000f\u0012\u0004\b,\u0010\u0017\u001a\u0004\b+\u0010\u0011\"\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020.0\r8\u0006¢\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b0\u0010\u0011\"\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002020\r8\u0006¢\u0006\f\n\u0004\b3\u0010\u000f\u001a\u0004\b4\u0010\u0011\"\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002060\r8\u0006¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b8\u0010\u0011\"\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\r8\u0006¢\u0006\f\n\u0004\b;\u0010\u000f\u001a\u0004\b<\u0010\u0011\"\u001f\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\r8\u0006¢\u0006\f\n\u0004\b?\u0010\u000f\u001a\u0004\b@\u0010\u0011\"\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\r8\u0006¢\u0006\f\n\u0004\bC\u0010\u000f\u001a\u0004\bD\u0010\u0011\"\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\bF\u0010\u000f\u001a\u0004\bG\u0010\u0011\"\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020I0\r8\u0006¢\u0006\f\n\u0004\bJ\u0010\u000f\u001a\u0004\bK\u0010\u0011\"\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\r8\u0006¢\u0006\f\n\u0004\bN\u0010\u000f\u001a\u0004\bO\u0010\u0011\"\"\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0\r8\u0000X\u0004¢\u0006\f\n\u0004\bR\u0010\u000f\u001a\u0004\bS\u0010\u0011¨\u0006U"}, mo44877d2 = {"Lnj4;", "owner", "Lg57;", "uriHandler", "Lkotlin/Function0;", "Lr37;", "content", "a", "(Lnj4;Lg57;Lfd2;Lnn0;I)V", "", "name", "", "c", "Lhy4;", "Li8;", "Lhy4;", "getLocalAccessibilityManager", "()Lhy4;", "LocalAccessibilityManager", "Llv;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Luv;", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Lyg0;", "d", "getLocalClipboardManager", "LocalClipboardManager", "Ldc1;", "e", "getLocalDensity", "LocalDensity", "Lm62;", "f", "getLocalFocusManager", "LocalFocusManager", "Ly62$a;", "g", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Lz62$b;", "h", "getLocalFontFamilyResolver", "LocalFontFamilyResolver", "Ldl2;", "i", "getLocalHapticFeedback", "LocalHapticFeedback", "Lcv2;", "j", "getLocalInputModeManager", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "k", "getLocalLayoutDirection", "LocalLayoutDirection", "Lun6;", "l", "getLocalTextInputService", "LocalTextInputService", "Lfo6;", "m", "getLocalTextToolbar", "LocalTextToolbar", "n", "getLocalUriHandler", "LocalUriHandler", "Ltb7;", "o", "getLocalViewConfiguration", "LocalViewConfiguration", "Lfl7;", "p", "getLocalWindowInfo", "LocalWindowInfo", "Llr4;", "q", "getLocalPointerIconService", "LocalPointerIconService", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt */
/* compiled from: CompositionLocals.kt */
public final class CompositionLocalsKt {

    /* renamed from: a */
    public static final hy4<C2530i8> f2022a = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);

    /* renamed from: b */
    public static final hy4<C2790lv> f2023b = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalAutofill$1.INSTANCE);

    /* renamed from: c */
    public static final hy4<C3436uv> f2024c = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);

    /* renamed from: d */
    public static final hy4<yg0> f2025d = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);

    /* renamed from: e */
    public static final hy4<dc1> f2026e = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalDensity$1.INSTANCE);

    /* renamed from: f */
    public static final hy4<m62> f2027f = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);

    /* renamed from: g */
    public static final hy4<y62.C3655a> f2028g = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);

    /* renamed from: h */
    public static final hy4<z62.C3714b> f2029h = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);

    /* renamed from: i */
    public static final hy4<dl2> f2030i = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);

    /* renamed from: j */
    public static final hy4<cv2> f2031j = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);

    /* renamed from: k */
    public static final hy4<LayoutDirection> f2032k = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);

    /* renamed from: l */
    public static final hy4<un6> f2033l = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);

    /* renamed from: m */
    public static final hy4<fo6> f2034m = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);

    /* renamed from: n */
    public static final hy4<g57> f2035n = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);

    /* renamed from: o */
    public static final hy4<tb7> f2036o = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);

    /* renamed from: p */
    public static final hy4<fl7> f2037p = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);

    /* renamed from: q */
    public static final hy4<lr4> f2038q = CompositionLocalKt.m2038d(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);

    /* renamed from: a */
    public static final void m3074a(nj4 nj4, g57 g57, fd2<? super nn0, ? super Integer, r37> fd2, nn0 nn0, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        vx2.m53591g(nj4, ENS.FUNC_OWNER);
        vx2.m53591g(g57, "uriHandler");
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        nn0 a = nn0.mo2929a(874662829);
        if ((i & 14) == 0) {
            if (a.mo2971p(nj4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (a.mo2971p(g57)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (a.mo2971p(fd2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !a.mo2932b()) {
            if (ComposerKt.m1997O()) {
                ComposerKt.m2008Z(874662829, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:171)");
            }
            CompositionLocalKt.m2035a(new jy4[]{f2022a.mo21417c(nj4.getAccessibilityManager()), f2023b.mo21417c(nj4.getAutofill()), f2024c.mo21417c(nj4.getAutofillTree()), f2025d.mo21417c(nj4.getClipboardManager()), f2026e.mo21417c(nj4.getDensity()), f2027f.mo21417c(nj4.getFocusManager()), f2028g.mo21418d(nj4.getFontLoader()), f2029h.mo21418d(nj4.getFontFamilyResolver()), f2030i.mo21417c(nj4.getHapticFeedBack()), f2031j.mo21417c(nj4.getInputModeManager()), f2032k.mo21417c(nj4.getLayoutDirection()), f2033l.mo21417c(nj4.getTextInputService()), f2034m.mo21417c(nj4.getTextToolbar()), f2035n.mo21417c(g57), f2036o.mo21417c(nj4.getViewConfiguration()), f2037p.mo21417c(nj4.getWindowInfo()), f2038q.mo21417c(nj4.getPointerIconService())}, fd2, a, ((i2 >> 3) & 112) | 8);
            if (ComposerKt.m1997O()) {
                ComposerKt.m2007Y();
            }
        } else {
            a.mo2963m();
        }
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(nj4, g57, fd2, i));
        }
    }

    /* renamed from: c */
    public static final Void m3076c(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
