package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;

/* renamed from: tm2 */
/* compiled from: HoneycombBitmapCreator */
public class tm2 implements a20 {

    /* renamed from: a */
    public final so1 f18194a;

    /* renamed from: b */
    public final f42 f18195b;

    public tm2(ls4 ls4) {
        this.f18195b = ls4.mo22958d();
        this.f18194a = new so1(ls4.mo22962h());
    }

    /* renamed from: b */
    public static BitmapFactory.Options m27826b(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @TargetApi(12)
    /* renamed from: a */
    public Bitmap mo11a(int i, int i2, Bitmap.Config config) {
        gp1 gp1;
        nh0<PooledByteBuffer> a = this.f18194a.mo25920a((short) i, (short) i2);
        nh0<byte[]> nh0 = null;
        try {
            gp1 = new gp1(a);
            try {
                gp1.mo20738P(r81.f17197a);
                BitmapFactory.Options b = m27826b(gp1.mo20755p(), config);
                int size = a.mo23684j().size();
                nh0 = this.f18195b.mo19685a(size + 2);
                byte[] j = nh0.mo23684j();
                a.mo23684j().mo13167t(0, j, 0, size);
                Bitmap bitmap = (Bitmap) au4.m10792g(BitmapFactory.decodeByteArray(j, 0, size, b));
                bitmap.setHasAlpha(true);
                bitmap.eraseColor(0);
                nh0.m23178h(nh0);
                gp1.m18285c(gp1);
                nh0.m23178h(a);
                return bitmap;
            } catch (Throwable th) {
                th = th;
                nh0.m23178h(nh0);
                gp1.m18285c(gp1);
                nh0.m23178h(a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gp1 = null;
            nh0.m23178h(nh0);
            gp1.m18285c(gp1);
            nh0.m23178h(a);
            throw th;
        }
    }
}
