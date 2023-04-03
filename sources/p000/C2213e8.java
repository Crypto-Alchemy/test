package p000;

import android.graphics.Rect;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, mo44877d2 = {"Le8;", "Lb8;", "", "text", "Lxn6;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lr37;", "j", "", "current", "", "a", "b", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "i", "c", "Lxn6;", "d", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "<init>", "()V", "f", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: e8 */
/* compiled from: AccessibilityIterators.android.kt */
public final class C2213e8 extends C1610b8 {

    /* renamed from: f */
    public static final C2214a f11083f = new C2214a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f11084g = 8;

    /* renamed from: h */
    public static C2213e8 f11085h;

    /* renamed from: i */
    public static final ResolvedTextDirection f11086i = ResolvedTextDirection.Rtl;

    /* renamed from: j */
    public static final ResolvedTextDirection f11087j = ResolvedTextDirection.Ltr;

    /* renamed from: c */
    public xn6 f11088c;

    /* renamed from: d */
    public SemanticsNode f11089d;

    /* renamed from: e */
    public Rect f11090e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Le8$a;", "", "Le8;", "a", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Le8;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: e8$a */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class C2214a {
        public C2214a() {
        }

        public /* synthetic */ C2214a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2213e8 mo19207a() {
            if (C2213e8.f11085h == null) {
                C2213e8.f11085h = new C2213e8((DefaultConstructorMarker) null);
            }
            C2213e8 g = C2213e8.f11085h;
            vx2.m53589e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return g;
        }
    }

    public C2213e8() {
        this.f11090e = new Rect();
    }

    public /* synthetic */ C2213e8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public int[] mo12014a(int i) {
        int i2;
        xn6 xn6 = null;
        if (mo11430d().length() <= 0 || i >= mo11430d().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f11089d;
            if (semanticsNode == null) {
                vx2.m53605u("node");
                semanticsNode = null;
            }
            int b = ap3.m31899b(semanticsNode.mo4000f().mo116e());
            int d = d75.m43382d(0, i);
            xn6 xn62 = this.f11088c;
            if (xn62 == null) {
                vx2.m53605u("layoutResult");
                xn62 = null;
            }
            int e = xn62.mo27844e(d);
            xn6 xn63 = this.f11088c;
            if (xn63 == null) {
                vx2.m53605u("layoutResult");
                xn63 = null;
            }
            float h = xn63.mo27848h(e) + ((float) b);
            xn6 xn64 = this.f11088c;
            if (xn64 == null) {
                vx2.m53605u("layoutResult");
                xn64 = null;
            }
            xn6 xn65 = this.f11088c;
            if (xn65 == null) {
                vx2.m53605u("layoutResult");
                xn65 = null;
            }
            if (h < xn64.mo27848h(xn65.mo27842b() - 1)) {
                xn6 xn66 = this.f11088c;
                if (xn66 == null) {
                    vx2.m53605u("layoutResult");
                } else {
                    xn6 = xn66;
                }
                i2 = xn6.mo27846f(h);
            } else {
                xn6 xn67 = this.f11088c;
                if (xn67 == null) {
                    vx2.m53605u("layoutResult");
                } else {
                    xn6 = xn67;
                }
                i2 = xn6.mo27842b();
            }
            return mo11429c(d, mo19205i(i2 - 1, f11087j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public int[] mo12015b(int i) {
        int i2;
        xn6 xn6 = null;
        if (mo11430d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f11089d;
            if (semanticsNode == null) {
                vx2.m53605u("node");
                semanticsNode = null;
            }
            int b = ap3.m31899b(semanticsNode.mo4000f().mo116e());
            int g = d75.m43385g(mo11430d().length(), i);
            xn6 xn62 = this.f11088c;
            if (xn62 == null) {
                vx2.m53605u("layoutResult");
                xn62 = null;
            }
            int e = xn62.mo27844e(g);
            xn6 xn63 = this.f11088c;
            if (xn63 == null) {
                vx2.m53605u("layoutResult");
                xn63 = null;
            }
            float h = xn63.mo27848h(e) - ((float) b);
            if (h > Utils.FLOAT_EPSILON) {
                xn6 xn64 = this.f11088c;
                if (xn64 == null) {
                    vx2.m53605u("layoutResult");
                } else {
                    xn6 = xn64;
                }
                i2 = xn6.mo27846f(h);
            } else {
                i2 = 0;
            }
            if (g == mo11430d().length() && i2 < e) {
                i2++;
            }
            return mo11429c(mo19205i(i2, f11086i), g);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final int mo19205i(int i, ResolvedTextDirection resolvedTextDirection) {
        xn6 xn6 = this.f11088c;
        xn6 xn62 = null;
        if (xn6 == null) {
            vx2.m53605u("layoutResult");
            xn6 = null;
        }
        int g = xn6.mo27847g(i);
        xn6 xn63 = this.f11088c;
        if (xn63 == null) {
            vx2.m53605u("layoutResult");
            xn63 = null;
        }
        if (resolvedTextDirection != xn63.mo27850i(g)) {
            xn6 xn64 = this.f11088c;
            if (xn64 == null) {
                vx2.m53605u("layoutResult");
            } else {
                xn62 = xn64;
            }
            return xn62.mo27847g(i);
        }
        xn6 xn65 = this.f11088c;
        if (xn65 == null) {
            vx2.m53605u("layoutResult");
            xn65 = null;
        }
        return xn6.m30246d(xn65, i, false, 2, (Object) null) - 1;
    }

    /* renamed from: j */
    public final void mo19206j(String str, xn6 xn6, SemanticsNode semanticsNode) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        vx2.m53591g(xn6, "layoutResult");
        vx2.m53591g(semanticsNode, "node");
        mo11432f(str);
        this.f11088c = xn6;
        this.f11089d = semanticsNode;
    }
}
