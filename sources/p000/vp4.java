package p000;

import android.graphics.Typeface;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, mo44877d2 = {"Lvp4;", "Ltp4;", "Lr72;", "fontWeight", "Ln72;", "fontStyle", "Landroid/graphics/Typeface;", "a", "(Lr72;I)Landroid/graphics/Typeface;", "Ljf2;", "name", "b", "(Ljf2;Lr72;I)Landroid/graphics/Typeface;", "", "familyName", "weight", "style", "d", "(Ljava/lang/String;Lr72;I)Landroid/graphics/Typeface;", "genericFontFamily", "c", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vp4 */
/* compiled from: PlatformTypefaces.kt */
public final class vp4 implements tp4 {
    /* renamed from: a */
    public Typeface mo26526a(r72 r72, int i) {
        vx2.m53591g(r72, "fontWeight");
        return mo27290c((String) null, r72, i);
    }

    /* renamed from: b */
    public Typeface mo26527b(jf2 jf2, r72 r72, int i) {
        vx2.m53591g(jf2, PublicResolver.FUNC_NAME);
        vx2.m53591g(r72, "fontWeight");
        Typeface d = mo27291d(wp4.m29684b(jf2.mo21821e(), r72), r72, i);
        if (d == null) {
            return mo27290c(jf2.mo21821e(), r72, i);
        }
        return d;
    }

    /* renamed from: c */
    public final Typeface mo27290c(String str, r72 r72, int i) {
        boolean z;
        boolean z2 = false;
        if (n72.m22833e(i, n72.f15367b.mo23533b()) && vx2.m53586b(r72, r72.f17161d.mo25348a())) {
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Typeface typeface = Typeface.DEFAULT;
                vx2.m53590f(typeface, "DEFAULT");
                return typeface;
            }
        }
        int c = C2898ni.m23199c(r72, i);
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(c);
            vx2.m53590f(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, c);
        vx2.m53590f(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    /* renamed from: d */
    public final Typeface mo27291d(String str, r72 r72, int i) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Typeface c = mo27290c(str, r72, i);
        if (vx2.m53586b(c, Typeface.create(Typeface.DEFAULT, C2898ni.m23199c(r72, i))) || vx2.m53586b(c, mo27290c((String) null, r72, i))) {
            z2 = false;
        }
        if (z2) {
            return c;
        }
        return null;
    }
}
