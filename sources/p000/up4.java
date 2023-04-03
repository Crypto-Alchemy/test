package p000;

import android.graphics.Typeface;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.n72;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"Lup4;", "Ltp4;", "Lr72;", "fontWeight", "Ln72;", "fontStyle", "Landroid/graphics/Typeface;", "a", "(Lr72;I)Landroid/graphics/Typeface;", "Ljf2;", "name", "b", "(Ljf2;Lr72;I)Landroid/graphics/Typeface;", "", "genericFontFamily", "c", "(Ljava/lang/String;Lr72;I)Landroid/graphics/Typeface;", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: up4 */
/* compiled from: PlatformTypefaces.kt */
public final class up4 implements tp4 {
    /* renamed from: a */
    public Typeface mo26526a(r72 r72, int i) {
        vx2.m53591g(r72, "fontWeight");
        return mo26840c((String) null, r72, i);
    }

    /* renamed from: b */
    public Typeface mo26527b(jf2 jf2, r72 r72, int i) {
        vx2.m53591g(jf2, PublicResolver.FUNC_NAME);
        vx2.m53591g(r72, "fontWeight");
        return mo26840c(jf2.mo21821e(), r72, i);
    }

    /* renamed from: c */
    public final Typeface mo26840c(String str, r72 r72, int i) {
        Typeface typeface;
        boolean z;
        n72.C2869a aVar = n72.f15367b;
        if (n72.m22833e(i, aVar.mo23533b()) && vx2.m53586b(r72, r72.f17161d.mo25348a())) {
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Typeface typeface2 = Typeface.DEFAULT;
                vx2.m53590f(typeface2, "DEFAULT");
                return typeface2;
            }
        }
        if (str == null) {
            typeface = Typeface.DEFAULT;
        } else {
            typeface = Typeface.create(str, 0);
        }
        Typeface a = Typeface.create(typeface, r72.mo25345h(), n72.m22833e(i, aVar.mo23532a()));
        vx2.m53590f(a, "create(\n            fami…ontStyle.Italic\n        )");
        return a;
    }
}
