package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¨\u0006\r"}, mo44877d2 = {"Ltp4;", "a", "Landroid/graphics/Typeface;", "Lq72;", "variationSettings", "Landroid/content/Context;", "context", "c", "", "name", "Lr72;", "fontWeight", "b", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: wp4 */
/* compiled from: PlatformTypefaces.kt */
public final class wp4 {
    /* renamed from: a */
    public static final tp4 m29683a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new up4();
        }
        return new vp4();
    }

    /* renamed from: b */
    public static final String m29684b(String str, r72 r72) {
        boolean z;
        boolean z2;
        boolean z3;
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(r72, "fontWeight");
        int h = r72.mo25345h() / 100;
        boolean z4 = true;
        if (h < 0 || h >= 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str + "-thin";
        }
        if (2 > h || h >= 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return str + "-light";
        } else if (h == 4) {
            return str;
        } else {
            if (h == 5) {
                return str + "-medium";
            }
            if (6 > h || h >= 8) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                return str;
            }
            if (8 > h || h >= 11) {
                z4 = false;
            }
            if (!z4) {
                return str;
            }
            return str + "-black";
        }
    }

    /* renamed from: c */
    public static final Typeface m29685c(Typeface typeface, q72 q72, Context context) {
        vx2.m53591g(q72, "variationSettings");
        vx2.m53591g(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            return j27.f13498a.mo21713a(typeface, q72, context);
        }
        return typeface;
    }
}
