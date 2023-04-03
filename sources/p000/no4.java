package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Locale;

/* renamed from: no4 */
/* compiled from: PicassoTransformations */
public class no4 {

    /* renamed from: no4$a */
    /* compiled from: PicassoTransformations */
    public static class C9723a implements lw6 {

        /* renamed from: a */
        public final int f46529a;

        /* renamed from: b */
        public final int f46530b;

        /* renamed from: c */
        public final int f46531c;

        public C9723a(int i, int i2, int i3) {
            this.f46529a = i;
            this.f46531c = i2;
            this.f46530b = i3;
        }

        /* renamed from: a */
        public final RectF mo67432a(int i, int i2, int i3) {
            float f = (float) i3;
            return new RectF(f, f, (float) (i - i3), (float) (i2 - i3));
        }

        /* renamed from: b */
        public final Paint mo67433b(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            return paint;
        }

        /* renamed from: c */
        public final Paint mo67434c() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f46531c);
            return paint;
        }

        public String key() {
            return String.format(Locale.US, "rounded-%s-%s-%s", new Object[]{Integer.valueOf(this.f46529a), Integer.valueOf(this.f46531c), Integer.valueOf(this.f46530b)});
        }

        public Bitmap transform(Bitmap bitmap) {
            if (this.f46530b > 0) {
                Canvas canvas = new Canvas(bitmap);
                Paint c = mo67434c();
                Path path = new Path();
                path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                RectF a = mo67432a(bitmap.getWidth(), bitmap.getHeight(), this.f46530b);
                int i = this.f46529a;
                path.addRoundRect(a, (float) i, (float) i, Path.Direction.CW);
                canvas.drawPath(path, c);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint b = mo67433b(bitmap);
            RectF a2 = mo67432a(bitmap.getWidth(), bitmap.getHeight(), 0);
            int i2 = this.f46529a;
            canvas2.drawRoundRect(a2, (float) i2, (float) i2, b);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    /* renamed from: a */
    public static lw6 m75290a(int i, int i2, int i3) {
        return new C9723a(i, i2, i3);
    }
}
