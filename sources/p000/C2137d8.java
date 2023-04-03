package p000;

import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Ld8;", "Lb8;", "", "text", "Lxn6;", "layoutResult", "Lr37;", "j", "", "current", "", "a", "b", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "i", "c", "Lxn6;", "<init>", "()V", "d", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: d8 */
/* compiled from: AccessibilityIterators.android.kt */
public final class C2137d8 extends C1610b8 {

    /* renamed from: d */
    public static final C2138a f10525d = new C2138a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f10526e = 8;

    /* renamed from: f */
    public static C2137d8 f10527f;

    /* renamed from: g */
    public static final ResolvedTextDirection f10528g = ResolvedTextDirection.Rtl;

    /* renamed from: h */
    public static final ResolvedTextDirection f10529h = ResolvedTextDirection.Ltr;

    /* renamed from: c */
    public xn6 f10530c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Ld8$a;", "", "Ld8;", "a", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Ld8;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: d8$a */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class C2138a {
        public C2138a() {
        }

        public /* synthetic */ C2138a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2137d8 mo18566a() {
            if (C2137d8.f10527f == null) {
                C2137d8.f10527f = new C2137d8((DefaultConstructorMarker) null);
            }
            C2137d8 g = C2137d8.f10527f;
            vx2.m53589e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return g;
        }
    }

    public C2137d8() {
    }

    public /* synthetic */ C2137d8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public int[] mo12014a(int i) {
        int i2;
        if (mo11430d().length() <= 0 || i >= mo11430d().length()) {
            return null;
        }
        if (i < 0) {
            xn6 xn6 = this.f10530c;
            if (xn6 == null) {
                vx2.m53605u("layoutResult");
                xn6 = null;
            }
            i2 = xn6.mo27844e(0);
        } else {
            xn6 xn62 = this.f10530c;
            if (xn62 == null) {
                vx2.m53605u("layoutResult");
                xn62 = null;
            }
            int e = xn62.mo27844e(i);
            if (mo18564i(e, f10528g) == i) {
                i2 = e;
            } else {
                i2 = e + 1;
            }
        }
        xn6 xn63 = this.f10530c;
        if (xn63 == null) {
            vx2.m53605u("layoutResult");
            xn63 = null;
        }
        if (i2 >= xn63.mo27842b()) {
            return null;
        }
        return mo11429c(mo18564i(i2, f10528g), mo18564i(i2, f10529h) + 1);
    }

    /* renamed from: b */
    public int[] mo12015b(int i) {
        int i2;
        if (mo11430d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > mo11430d().length()) {
            xn6 xn6 = this.f10530c;
            if (xn6 == null) {
                vx2.m53605u("layoutResult");
                xn6 = null;
            }
            i2 = xn6.mo27844e(mo11430d().length());
        } else {
            xn6 xn62 = this.f10530c;
            if (xn62 == null) {
                vx2.m53605u("layoutResult");
                xn62 = null;
            }
            int e = xn62.mo27844e(i);
            if (mo18564i(e, f10529h) + 1 == i) {
                i2 = e;
            } else {
                i2 = e - 1;
            }
        }
        if (i2 < 0) {
            return null;
        }
        return mo11429c(mo18564i(i2, f10528g), mo18564i(i2, f10529h) + 1);
    }

    /* renamed from: i */
    public final int mo18564i(int i, ResolvedTextDirection resolvedTextDirection) {
        xn6 xn6 = this.f10530c;
        xn6 xn62 = null;
        if (xn6 == null) {
            vx2.m53605u("layoutResult");
            xn6 = null;
        }
        int g = xn6.mo27847g(i);
        xn6 xn63 = this.f10530c;
        if (xn63 == null) {
            vx2.m53605u("layoutResult");
            xn63 = null;
        }
        if (resolvedTextDirection != xn63.mo27850i(g)) {
            xn6 xn64 = this.f10530c;
            if (xn64 == null) {
                vx2.m53605u("layoutResult");
            } else {
                xn62 = xn64;
            }
            return xn62.mo27847g(i);
        }
        xn6 xn65 = this.f10530c;
        if (xn65 == null) {
            vx2.m53605u("layoutResult");
            xn65 = null;
        }
        return xn6.m30246d(xn65, i, false, 2, (Object) null) - 1;
    }

    /* renamed from: j */
    public final void mo18565j(String str, xn6 xn6) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        vx2.m53591g(xn6, "layoutResult");
        mo11432f(str);
        this.f10530c = xn6;
    }
}
