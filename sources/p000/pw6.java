package p000;

import android.graphics.Bitmap;

/* renamed from: pw6 */
/* compiled from: TransformationUtils */
public final class pw6 {
    /* renamed from: a */
    public static boolean m25185a(z20 z20, nh0<Bitmap> nh0) {
        if (z20 == null || nh0 == null) {
            return false;
        }
        Bitmap j = nh0.mo23684j();
        if (z20.mo28305a()) {
            j.setHasAlpha(true);
        }
        z20.transform(j);
        return true;
    }
}
