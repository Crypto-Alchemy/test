package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: az3 */
/* compiled from: MovementBounds */
public class az3 {

    /* renamed from: f */
    public static final Matrix f7884f = new Matrix();

    /* renamed from: g */
    public static final float[] f7885g = new float[2];

    /* renamed from: h */
    public static final Point f7886h = new Point();

    /* renamed from: i */
    public static final Rect f7887i = new Rect();

    /* renamed from: j */
    public static final RectF f7888j = new RectF();

    /* renamed from: a */
    public final Settings f7889a;

    /* renamed from: b */
    public final RectF f7890b = new RectF();

    /* renamed from: c */
    public float f7891c;

    /* renamed from: d */
    public float f7892d;

    /* renamed from: e */
    public float f7893e;

    /* renamed from: az3$a */
    /* compiled from: MovementBounds */
    public static /* synthetic */ class C1598a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7894a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alexvasilkov.gestures.Settings$Bounds[] r0 = com.alexvasilkov.gestures.Settings.Bounds.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7894a = r0
                com.alexvasilkov.gestures.Settings$Bounds r1 = com.alexvasilkov.gestures.Settings.Bounds.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7894a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alexvasilkov.gestures.Settings$Bounds r1 = com.alexvasilkov.gestures.Settings.Bounds.INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7894a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alexvasilkov.gestures.Settings$Bounds r1 = com.alexvasilkov.gestures.Settings.Bounds.OUTSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7894a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alexvasilkov.gestures.Settings$Bounds r1 = com.alexvasilkov.gestures.Settings.Bounds.PIVOT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7894a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alexvasilkov.gestures.Settings$Bounds r1 = com.alexvasilkov.gestures.Settings.Bounds.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.az3.C1598a.<clinit>():void");
        }
    }

    public az3(Settings settings) {
        this.f7889a = settings;
    }

    /* renamed from: a */
    public final void mo11303a(RectF rectF, Rect rect) {
        if (rectF.width() < ((float) rect.width())) {
            this.f7890b.left = rectF.left - (((float) rect.width()) - rectF.width());
            this.f7890b.right = rectF.left;
        } else {
            RectF rectF2 = this.f7890b;
            rectF2.left = rectF.left;
            rectF2.right = rectF.right - ((float) rect.width());
        }
        if (rectF.height() < ((float) rect.height())) {
            this.f7890b.top = rectF.top - (((float) rect.height()) - rectF.height());
            this.f7890b.bottom = rectF.top;
            return;
        }
        RectF rectF3 = this.f7890b;
        rectF3.top = rectF.top;
        rectF3.bottom = rectF.bottom - ((float) rect.height());
    }

    /* renamed from: b */
    public final void mo11304b(RectF rectF, Rect rect) {
        if (rectF.width() < ((float) rect.width())) {
            this.f7890b.left = rectF.left - (((float) rect.width()) - rectF.width());
            this.f7890b.right = rectF.left;
        } else {
            RectF rectF2 = this.f7890b;
            float f = (float) rect.left;
            rectF2.right = f;
            rectF2.left = f;
        }
        if (rectF.height() < ((float) rect.height())) {
            this.f7890b.top = rectF.top - (((float) rect.height()) - rectF.height());
            this.f7890b.bottom = rectF.top;
            return;
        }
        RectF rectF3 = this.f7890b;
        float f2 = (float) rect.top;
        rectF3.bottom = f2;
        rectF3.top = f2;
    }

    /* renamed from: c */
    public final void mo11305c(RectF rectF, Rect rect) {
        this.f7890b.left = rectF.left - ((float) rect.width());
        RectF rectF2 = this.f7890b;
        rectF2.right = rectF.right;
        rectF2.top = rectF.top - ((float) rect.height());
        this.f7890b.bottom = rectF.bottom;
    }

    /* renamed from: d */
    public final void mo11306d(Rect rect) {
        Settings settings = this.f7889a;
        Point point = f7886h;
        qj2.m25708a(settings, point);
        float[] fArr = f7885g;
        fArr[0] = (float) point.x;
        fArr[1] = (float) point.y;
        if (!p86.m24755c(this.f7891c, Utils.FLOAT_EPSILON)) {
            Matrix matrix = f7884f;
            matrix.setRotate(-this.f7891c, this.f7892d, this.f7893e);
            matrix.mapPoints(fArr);
        }
        this.f7890b.left = fArr[0] - ((float) rect.width());
        RectF rectF = this.f7890b;
        rectF.right = fArr[0];
        rectF.top = fArr[1] - ((float) rect.height());
        this.f7890b.bottom = fArr[1];
    }

    /* renamed from: e */
    public void mo11307e(float f, float f2) {
        float[] fArr = f7885g;
        fArr[0] = f;
        fArr[1] = f2;
        float f3 = this.f7891c;
        if (f3 != Utils.FLOAT_EPSILON) {
            Matrix matrix = f7884f;
            matrix.setRotate(-f3, this.f7892d, this.f7893e);
            matrix.mapPoints(fArr);
        }
        this.f7890b.union(fArr[0], fArr[1]);
    }

    /* renamed from: f */
    public void mo11308f(RectF rectF) {
        float f = this.f7891c;
        if (f == Utils.FLOAT_EPSILON) {
            rectF.set(this.f7890b);
            return;
        }
        Matrix matrix = f7884f;
        matrix.setRotate(f, this.f7892d, this.f7893e);
        matrix.mapRect(rectF, this.f7890b);
    }

    /* renamed from: g */
    public void mo11309g(float f, float f2, float f3, float f4, PointF pointF) {
        float[] fArr = f7885g;
        fArr[0] = f;
        fArr[1] = f2;
        float f5 = this.f7891c;
        if (f5 != Utils.FLOAT_EPSILON) {
            Matrix matrix = f7884f;
            matrix.setRotate(-f5, this.f7892d, this.f7893e);
            matrix.mapPoints(fArr);
        }
        float f6 = fArr[0];
        RectF rectF = this.f7890b;
        fArr[0] = cp3.m14357f(f6, rectF.left - f3, rectF.right + f3);
        float f7 = fArr[1];
        RectF rectF2 = this.f7890b;
        fArr[1] = cp3.m14357f(f7, rectF2.top - f4, rectF2.bottom + f4);
        float f8 = this.f7891c;
        if (f8 != Utils.FLOAT_EPSILON) {
            Matrix matrix2 = f7884f;
            matrix2.setRotate(f8, this.f7892d, this.f7893e);
            matrix2.mapPoints(fArr);
        }
        pointF.set(fArr[0], fArr[1]);
    }

    /* renamed from: h */
    public void mo11310h(float f, float f2, PointF pointF) {
        mo11309g(f, f2, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, pointF);
    }

    /* renamed from: i */
    public az3 mo11311i(p86 p86) {
        RectF rectF = f7888j;
        Settings settings = this.f7889a;
        Rect rect = f7887i;
        qj2.m25711d(settings, rect);
        rectF.set(rect);
        Settings.Fit i = this.f7889a.mo12258i();
        Settings.Fit fit = Settings.Fit.OUTSIDE;
        if (i == fit) {
            this.f7891c = p86.mo24481e();
            this.f7892d = rectF.centerX();
            this.f7893e = rectF.centerY();
            if (!p86.m24755c(this.f7891c, Utils.FLOAT_EPSILON)) {
                Matrix matrix = f7884f;
                matrix.setRotate(-this.f7891c, this.f7892d, this.f7893e);
                matrix.mapRect(rectF);
            }
        } else {
            this.f7891c = Utils.FLOAT_EPSILON;
            this.f7893e = Utils.FLOAT_EPSILON;
            this.f7892d = Utils.FLOAT_EPSILON;
        }
        Matrix matrix2 = f7884f;
        p86.mo24480d(matrix2);
        if (!p86.m24755c(this.f7891c, Utils.FLOAT_EPSILON)) {
            matrix2.postRotate(-this.f7891c, this.f7892d, this.f7893e);
        }
        qj2.m25710c(matrix2, this.f7889a, rect);
        int i2 = C1598a.f7894a[this.f7889a.mo12255f().ordinal()];
        if (i2 == 1) {
            mo11304b(rectF, rect);
        } else if (i2 == 2) {
            mo11303a(rectF, rect);
        } else if (i2 == 3) {
            mo11305c(rectF, rect);
        } else if (i2 != 4) {
            this.f7890b.set(-5.3687091E8f, -5.3687091E8f, 5.3687091E8f, 5.3687091E8f);
        } else {
            mo11306d(rect);
        }
        if (this.f7889a.mo12258i() != fit) {
            p86.mo24480d(matrix2);
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.f7889a.mo12261l(), (float) this.f7889a.mo12260k());
            matrix2.mapRect(rectF);
            float[] fArr = f7885g;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            matrix2.mapPoints(fArr);
            this.f7890b.offset(fArr[0] - rectF.left, fArr[1] - rectF.top);
        }
        return this;
    }
}
