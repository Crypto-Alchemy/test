package p000;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: rp7 */
/* compiled from: ZoomBounds */
public class rp7 {

    /* renamed from: e */
    public static final Matrix f17325e = new Matrix();

    /* renamed from: f */
    public static final RectF f17326f = new RectF();

    /* renamed from: a */
    public final Settings f17327a;

    /* renamed from: b */
    public float f17328b;

    /* renamed from: c */
    public float f17329c;

    /* renamed from: d */
    public float f17330d;

    /* renamed from: rp7$a */
    /* compiled from: ZoomBounds */
    public static /* synthetic */ class C3213a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17331a;

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
                com.alexvasilkov.gestures.Settings$Fit[] r0 = com.alexvasilkov.gestures.Settings.Fit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17331a = r0
                com.alexvasilkov.gestures.Settings$Fit r1 = com.alexvasilkov.gestures.Settings.Fit.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17331a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alexvasilkov.gestures.Settings$Fit r1 = com.alexvasilkov.gestures.Settings.Fit.VERTICAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17331a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alexvasilkov.gestures.Settings$Fit r1 = com.alexvasilkov.gestures.Settings.Fit.INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17331a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alexvasilkov.gestures.Settings$Fit r1 = com.alexvasilkov.gestures.Settings.Fit.OUTSIDE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17331a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alexvasilkov.gestures.Settings$Fit r1 = com.alexvasilkov.gestures.Settings.Fit.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.rp7.C3213a.<clinit>():void");
        }
    }

    public rp7(Settings settings) {
        this.f17327a = settings;
    }

    /* renamed from: a */
    public float mo25492a() {
        return this.f17330d;
    }

    /* renamed from: b */
    public float mo25493b() {
        return this.f17329c;
    }

    /* renamed from: c */
    public float mo25494c() {
        return this.f17328b;
    }

    /* renamed from: d */
    public float mo25495d(float f, float f2) {
        return cp3.m14357f(f, this.f17328b / f2, this.f17329c * f2);
    }

    /* renamed from: e */
    public rp7 mo25496e(p86 p86) {
        float l = (float) this.f17327a.mo12261l();
        float k = (float) this.f17327a.mo12260k();
        float p = (float) this.f17327a.mo12265p();
        float o = (float) this.f17327a.mo12264o();
        float f = 1.0f;
        if (l == Utils.FLOAT_EPSILON || k == Utils.FLOAT_EPSILON || p == Utils.FLOAT_EPSILON || o == Utils.FLOAT_EPSILON) {
            this.f17330d = 1.0f;
            this.f17329c = 1.0f;
            this.f17328b = 1.0f;
            return this;
        }
        this.f17328b = this.f17327a.mo12263n();
        this.f17329c = this.f17327a.mo12262m();
        float e = p86.mo24481e();
        if (!p86.m24755c(e, Utils.FLOAT_EPSILON)) {
            if (this.f17327a.mo12258i() == Settings.Fit.OUTSIDE) {
                Matrix matrix = f17325e;
                matrix.setRotate(-e);
                RectF rectF = f17326f;
                rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, p, o);
                matrix.mapRect(rectF);
                p = rectF.width();
                o = rectF.height();
            } else {
                Matrix matrix2 = f17325e;
                matrix2.setRotate(e);
                RectF rectF2 = f17326f;
                rectF2.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, l, k);
                matrix2.mapRect(rectF2);
                l = rectF2.width();
                k = rectF2.height();
            }
        }
        int i = C3213a.f17331a[this.f17327a.mo12258i().ordinal()];
        if (i == 1) {
            this.f17330d = p / l;
        } else if (i == 2) {
            this.f17330d = o / k;
        } else if (i == 3) {
            this.f17330d = Math.min(p / l, o / k);
        } else if (i != 4) {
            float f2 = this.f17328b;
            if (f2 > Utils.FLOAT_EPSILON) {
                f = f2;
            }
            this.f17330d = f;
        } else {
            this.f17330d = Math.max(p / l, o / k);
        }
        if (this.f17328b <= Utils.FLOAT_EPSILON) {
            this.f17328b = this.f17330d;
        }
        if (this.f17329c <= Utils.FLOAT_EPSILON) {
            this.f17329c = this.f17330d;
        }
        if (this.f17330d > this.f17329c) {
            if (this.f17327a.mo12236B()) {
                this.f17329c = this.f17330d;
            } else {
                this.f17330d = this.f17329c;
            }
        }
        float f3 = this.f17328b;
        float f4 = this.f17329c;
        if (f3 > f4) {
            this.f17328b = f4;
        }
        if (this.f17330d < this.f17328b) {
            if (this.f17327a.mo12236B()) {
                this.f17328b = this.f17330d;
            } else {
                this.f17330d = this.f17328b;
            }
        }
        return this;
    }
}
