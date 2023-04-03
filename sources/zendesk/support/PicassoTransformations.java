package zendesk.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.renderscript.RenderScript;
import java.util.Locale;

public class PicassoTransformations {

    public static class BlurTransformation implements lw6 {

        /* renamed from: rs */
        private final RenderScript f46829rs;

        public BlurTransformation(Context context) {
            this.f46829rs = RenderScript.create(context);
        }

        public String key() {
            return "blur";
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap transform(android.graphics.Bitmap r8) {
            /*
                r7 = this;
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                r1 = 1
                android.graphics.Bitmap r0 = r8.copy(r0, r1)
                android.renderscript.RenderScript r1 = r7.f46829rs
                android.renderscript.Element r2 = android.renderscript.Element.U8_4(r1)
                android.renderscript.ScriptIntrinsicBlur r1 = android.renderscript.ScriptIntrinsicBlur.create(r1, r2)
                r2 = 0
                android.renderscript.RenderScript r3 = r7.f46829rs     // Catch:{ all -> 0x004b }
                android.renderscript.Allocation$MipmapControl r4 = android.renderscript.Allocation.MipmapControl.MIPMAP_FULL     // Catch:{ all -> 0x004b }
                r5 = 128(0x80, float:1.794E-43)
                android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r3, r0, r4, r5)     // Catch:{ all -> 0x004b }
                android.renderscript.RenderScript r4 = r7.f46829rs     // Catch:{ all -> 0x0046 }
                android.renderscript.Type r5 = r3.getType()     // Catch:{ all -> 0x0046 }
                android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r4, r5)     // Catch:{ all -> 0x0046 }
                r1.setInput(r3)     // Catch:{ all -> 0x0046 }
                r4 = 1103626240(0x41c80000, float:25.0)
                r1.setRadius(r4)     // Catch:{ all -> 0x0046 }
                r1.forEach(r2)     // Catch:{ all -> 0x0046 }
                r2.copyTo(r0)     // Catch:{ all -> 0x0046 }
                r8.recycle()
                android.renderscript.RenderScript r8 = r7.f46829rs
                r8.destroy()
                r1.destroy()
                r3.destroy()
                r2.destroy()
                return r0
            L_0x0046:
                r0 = move-exception
                r6 = r3
                r3 = r2
                r2 = r6
                goto L_0x004d
            L_0x004b:
                r0 = move-exception
                r3 = r2
            L_0x004d:
                r8.recycle()
                android.renderscript.RenderScript r8 = r7.f46829rs
                r8.destroy()
                r1.destroy()
                if (r2 == 0) goto L_0x005d
                r2.destroy()
            L_0x005d:
                if (r3 == 0) goto L_0x0062
                r3.destroy()
            L_0x0062:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.PicassoTransformations.BlurTransformation.transform(android.graphics.Bitmap):android.graphics.Bitmap");
        }
    }

    public static class RoundedTransformation implements lw6 {
        private final int radius;
        private final int strokeColor;
        private final int strokeWidth;

        public RoundedTransformation(int i) {
            this(i, 0, -1);
        }

        private RectF getMask(int i, int i2, int i3) {
            float f = (float) i3;
            return new RectF(f, f, (float) (i - i3), (float) (i2 - i3));
        }

        private Paint shapePaint(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            return paint;
        }

        private Paint strokePaint() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.strokeColor);
            return paint;
        }

        public String key() {
            return String.format(Locale.US, "rounded-%s-%s-%s", new Object[]{Integer.valueOf(this.radius), Integer.valueOf(this.strokeColor), Integer.valueOf(this.strokeWidth)});
        }

        public Bitmap transform(Bitmap bitmap) {
            if (this.strokeWidth > 0) {
                if (!bitmap.isMutable()) {
                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    if (copy != bitmap) {
                        bitmap.recycle();
                    }
                    bitmap = copy;
                }
                Canvas canvas = new Canvas(bitmap);
                Paint strokePaint = strokePaint();
                Path path = new Path();
                path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                RectF mask = getMask(bitmap.getWidth(), bitmap.getHeight(), this.strokeWidth);
                int i = this.radius;
                path.addRoundRect(mask, (float) i, (float) i, Path.Direction.CW);
                canvas.drawPath(path, strokePaint);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint shapePaint = shapePaint(bitmap);
            RectF mask2 = getMask(bitmap.getWidth(), bitmap.getHeight(), 0);
            int i2 = this.radius;
            canvas2.drawRoundRect(mask2, (float) i2, (float) i2, shapePaint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        public RoundedTransformation(int i, int i2, int i3) {
            this.radius = i;
            this.strokeColor = i2;
            this.strokeWidth = i3;
        }
    }

    private PicassoTransformations() {
    }

    public static lw6 getBlurTransformation(Context context) {
        return new BlurTransformation(context);
    }

    public static lw6 getRoundWithBorderTransformation(int i, int i2, int i3) {
        return new RoundedTransformation(i, i2, i3);
    }

    public static lw6 getRoundedTransformation(int i) {
        return new RoundedTransformation(i);
    }
}
