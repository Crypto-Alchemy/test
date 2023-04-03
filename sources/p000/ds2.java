package p000;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ds2 */
/* compiled from: ImageViewHelper */
public class ds2 {

    /* renamed from: a */
    public static final RectF f10847a = new RectF();

    /* renamed from: b */
    public static final RectF f10848b = new RectF();

    /* renamed from: ds2$a */
    /* compiled from: ImageViewHelper */
    public static /* synthetic */ class C2195a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10849a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10849a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10849a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10849a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10849a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ds2.C2195a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m15371a(ImageView.ScaleType scaleType, int i, int i2, int i3, int i4, Matrix matrix, Matrix matrix2) {
        float f;
        float f2;
        float f3;
        if (ImageView.ScaleType.CENTER == scaleType) {
            matrix2.setTranslate(((float) (i3 - i)) * 0.5f, ((float) (i4 - i2)) * 0.5f);
            return;
        }
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER_CROP;
        float f4 = Utils.FLOAT_EPSILON;
        if (scaleType2 == scaleType) {
            if (i * i4 > i3 * i2) {
                f3 = ((float) i4) / ((float) i2);
                f2 = 0.0f;
                f4 = (((float) i3) - (((float) i) * f3)) * 0.5f;
            } else {
                f3 = ((float) i3) / ((float) i);
                f2 = (((float) i4) - (((float) i2) * f3)) * 0.5f;
            }
            matrix2.setScale(f3, f3);
            matrix2.postTranslate(f4, f2);
        } else if (ImageView.ScaleType.CENTER_INSIDE == scaleType) {
            if (i > i3 || i2 > i4) {
                f = Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            } else {
                f = 1.0f;
            }
            matrix2.setScale(f, f);
            matrix2.postTranslate((((float) i3) - (((float) i) * f)) * 0.5f, (((float) i4) - (((float) i2) * f)) * 0.5f);
        } else {
            Matrix.ScaleToFit b = m15372b(scaleType);
            if (b == null) {
                matrix2.set(matrix);
                return;
            }
            RectF rectF = f10847a;
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i, (float) i2);
            RectF rectF2 = f10848b;
            rectF2.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i3, (float) i4);
            matrix2.setRectToRect(rectF, rectF2, b);
        }
    }

    /* renamed from: b */
    public static Matrix.ScaleToFit m15372b(ImageView.ScaleType scaleType) {
        int i = C2195a.f10849a[scaleType.ordinal()];
        if (i == 1) {
            return Matrix.ScaleToFit.FILL;
        }
        if (i == 2) {
            return Matrix.ScaleToFit.START;
        }
        if (i == 3) {
            return Matrix.ScaleToFit.CENTER;
        }
        if (i != 4) {
            return null;
        }
        return Matrix.ScaleToFit.END;
    }
}
