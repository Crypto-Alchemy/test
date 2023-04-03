package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: kj1 */
/* compiled from: DrawableDecoderCompat */
public final class kj1 {

    /* renamed from: a */
    public static volatile boolean f14103a = true;

    /* renamed from: a */
    public static Drawable m20750a(Context context, int i, Resources.Theme theme) {
        return m20752c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m20751b(Context context, Context context2, int i) {
        return m20752c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    public static Drawable m20752c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f14103a) {
                return m20754e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f14103a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return zr0.m31442e(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m20753d(context2, i, theme);
    }

    /* renamed from: d */
    public static Drawable m20753d(Context context, int i, Resources.Theme theme) {
        return uf5.m28223f(context.getResources(), i, theme);
    }

    /* renamed from: e */
    public static Drawable m20754e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new hs0(context, theme);
        }
        return C2554in.m19714b(context, i);
    }
}
