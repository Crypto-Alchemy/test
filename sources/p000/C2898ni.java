package p000;

import kotlin.Metadata;
import p000.r72;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\"\u0018\u0010\u000e\u001a\u00020\u0000*\u00020\u000b8@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lr72;", "fontWeight", "Ln72;", "fontStyle", "", "c", "(Lr72;I)I", "", "isBold", "isItalic", "b", "Lr72$a;", "a", "(Lr72$a;)Lr72;", "AndroidBold", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ni */
/* compiled from: AndroidFontUtils.android.kt */
public final class C2898ni {
    /* renamed from: a */
    public static final r72 m23197a(r72.C3185a aVar) {
        vx2.m53591g(aVar, "<this>");
        return aVar.mo25351d();
    }

    /* renamed from: b */
    public static final int m23198b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* renamed from: c */
    public static final int m23199c(r72 r72, int i) {
        boolean z;
        vx2.m53591g(r72, "fontWeight");
        if (r72.compareTo(m23197a(r72.f17161d)) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return m23198b(z, n72.m22833e(i, n72.f15367b.mo23532a()));
    }
}
