package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.OutputStream;

/* renamed from: n26 */
/* compiled from: SimpleImageTranscoder */
public class n26 implements yr2 {

    /* renamed from: a */
    public final boolean f15302a;

    /* renamed from: b */
    public final int f15303b;

    public n26(boolean z, int i) {
        this.f15302a = z;
        this.f15303b = i;
    }

    /* renamed from: e */
    public static Bitmap.CompressFormat m22756e(rq2 rq2) {
        if (rq2 == null) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (rq2 == r81.f17197a) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (rq2 == r81.f17198b) {
            return Bitmap.CompressFormat.PNG;
        }
        if (r81.m26115a(rq2)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: a */
    public String mo13377a() {
        return "SimpleImageTranscoder";
    }

    /* renamed from: b */
    public boolean mo13378b(gp1 gp1, xh5 xh5, te5 te5) {
        if (xh5 == null) {
            xh5 = xh5.m30104a();
        }
        if (!this.f15302a || ti1.m27754b(xh5, te5, gp1, this.f15303b) <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo13379c(rq2 rq2) {
        if (rq2 == r81.f17207k || rq2 == r81.f17197a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public xr2 mo13380d(gp1 gp1, OutputStream outputStream, xh5 xh5, te5 te5, rq2 rq2, Integer num) {
        Integer num2;
        n26 n26;
        xh5 xh52;
        Bitmap bitmap;
        gp1 gp12 = gp1;
        if (num == null) {
            num2 = 85;
        } else {
            num2 = num;
        }
        if (xh5 == null) {
            xh52 = xh5.m30104a();
            n26 = this;
        } else {
            n26 = this;
            xh52 = xh5;
        }
        int f = n26.mo23480f(gp12, xh52, te5);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = f;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(gp1.mo20752l(), (Rect) null, options);
            if (decodeStream == null) {
                oy1.m24421h("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new xr2(2);
            }
            Matrix f2 = x33.m29865f(gp12, xh52);
            if (f2 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), f2, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    try {
                        oy1.m24422i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        xr2 xr2 = new xr2(2);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return xr2;
                    } catch (Throwable th) {
                        th = th;
                        bitmap.recycle();
                        decodeStream.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(m22756e(rq2), num2.intValue(), outputStream);
                int i = 1;
                if (f > 1) {
                    i = 0;
                }
                xr2 xr22 = new xr2(i);
                bitmap.recycle();
                decodeStream.recycle();
                return xr22;
            } catch (OutOfMemoryError e2) {
                e = e2;
                oy1.m24422i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                xr2 xr23 = new xr2(2);
                bitmap.recycle();
                decodeStream.recycle();
                return xr23;
            }
        } catch (OutOfMemoryError e3) {
            oy1.m24422i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new xr2(2);
        }
    }

    /* renamed from: f */
    public final int mo23480f(gp1 gp1, xh5 xh5, te5 te5) {
        if (!this.f15302a) {
            return 1;
        }
        return ti1.m27754b(xh5, te5, gp1, this.f15303b);
    }
}
