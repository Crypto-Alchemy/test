package p000;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: m71 */
/* compiled from: DefaultDrawableFactory */
public class m71 implements lj1 {

    /* renamed from: a */
    public final Resources f14839a;

    /* renamed from: b */
    public final lj1 f14840b;

    public m71(Resources resources, lj1 lj1) {
        this.f14839a = resources;
        this.f14840b = lj1;
    }

    /* renamed from: c */
    public static boolean m22035c(qh0 qh0) {
        if (qh0.mo25110k() == 1 || qh0.mo25110k() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m22036d(qh0 qh0) {
        if (qh0.mo25111l() == 0 || qh0.mo25111l() == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Drawable mo21646a(kh0 kh0) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("DefaultDrawableFactory#createDrawable");
            }
            if (kh0 instanceof qh0) {
                qh0 qh0 = (qh0) kh0;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f14839a, qh0.mo21538f());
                if (!m22036d(qh0) && !m22035c(qh0)) {
                    return bitmapDrawable;
                }
                bj4 bj4 = new bj4(bitmapDrawable, qh0.mo25111l(), qh0.mo25110k());
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
                return bj4;
            }
            lj1 lj1 = this.f14840b;
            if (lj1 == null || !lj1.mo21647b(kh0)) {
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
                return null;
            }
            Drawable a = this.f14840b.mo21646a(kh0);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            return a;
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: b */
    public boolean mo21647b(kh0 kh0) {
        return true;
    }
}
