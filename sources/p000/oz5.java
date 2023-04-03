package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: oz5 */
/* compiled from: ShadowRenderer */
public class oz5 {

    /* renamed from: i */
    public static final int[] f32512i = new int[3];

    /* renamed from: j */
    public static final float[] f32513j = {Utils.FLOAT_EPSILON, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f32514k = new int[4];

    /* renamed from: l */
    public static final float[] f32515l = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f32516a;

    /* renamed from: b */
    public final Paint f32517b;

    /* renamed from: c */
    public final Paint f32518c;

    /* renamed from: d */
    public int f32519d;

    /* renamed from: e */
    public int f32520e;

    /* renamed from: f */
    public int f32521f;

    /* renamed from: g */
    public final Path f32522g;

    /* renamed from: h */
    public Paint f32523h;

    public oz5() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo46578a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        if (f3 < Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f32522g;
        if (z) {
            int[] iArr = f32514k;
            iArr[0] = 0;
            iArr[1] = this.f32521f;
            iArr[2] = this.f32520e;
            iArr[3] = this.f32519d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f32514k;
            iArr2[0] = 0;
            iArr2[1] = this.f32519d;
            iArr2[2] = this.f32520e;
            iArr2[3] = this.f32521f;
        }
        float width = rectF.width() / 2.0f;
        if (width > Utils.FLOAT_EPSILON) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f32515l;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f32517b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f32514k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f32523h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f32517b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo46579b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(Utils.FLOAT_EPSILON, (float) (-i));
        int[] iArr = f32512i;
        iArr[0] = this.f32521f;
        iArr[1] = this.f32520e;
        iArr[2] = this.f32519d;
        Paint paint = this.f32518c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f32513j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f32518c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo46580c() {
        return this.f32516a;
    }

    /* renamed from: d */
    public void mo46581d(int i) {
        this.f32519d = gl0.m18169j(i, 68);
        this.f32520e = gl0.m18169j(i, 20);
        this.f32521f = gl0.m18169j(i, 0);
        this.f32516a.setColor(this.f32519d);
    }

    public oz5(int i) {
        this.f32522g = new Path();
        this.f32523h = new Paint();
        this.f32516a = new Paint();
        mo46581d(i);
        this.f32523h.setColor(0);
        Paint paint = new Paint(4);
        this.f32517b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f32518c = new Paint(paint);
    }
}
