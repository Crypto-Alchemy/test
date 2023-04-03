package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000.xl5;

/* renamed from: u21 */
/* compiled from: DebugControllerOverlayDrawable */
public class u21 extends Drawable implements xq2 {

    /* renamed from: A */
    public int f18339A;

    /* renamed from: B */
    public int f18340B = 80;

    /* renamed from: C */
    public final Paint f18341C = new Paint(1);

    /* renamed from: H */
    public final Matrix f18342H = new Matrix();

    /* renamed from: I */
    public final Rect f18343I = new Rect();

    /* renamed from: L */
    public final RectF f18344L = new RectF();

    /* renamed from: M */
    public int f18345M;

    /* renamed from: P */
    public int f18346P;

    /* renamed from: Q */
    public int f18347Q;

    /* renamed from: U */
    public int f18348U;

    /* renamed from: X */
    public int f18349X;

    /* renamed from: Y */
    public long f18350Y;

    /* renamed from: Z */
    public String f18351Z;

    /* renamed from: a */
    public String f18352a;

    /* renamed from: d */
    public String f18353d;

    /* renamed from: e */
    public int f18354e;

    /* renamed from: e0 */
    public int f18355e0 = -1;

    /* renamed from: g */
    public int f18356g;

    /* renamed from: k */
    public int f18357k;

    /* renamed from: k0 */
    public int f18358k0 = 0;

    /* renamed from: r */
    public String f18359r;

    /* renamed from: s */
    public xl5.C3616b f18360s;

    /* renamed from: x */
    public HashMap<String, String> f18361x = new HashMap<>();

    /* renamed from: y */
    public int f18362y;

    public u21() {
        mo26632h();
    }

    /* renamed from: f */
    public static String m28026f(String str, Object... objArr) {
        if (objArr == null) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public void mo26624a(long j) {
        this.f18350Y = j;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo26625b(Canvas canvas, String str, Object obj) {
        mo26627d(canvas, str, String.valueOf(obj), -1);
    }

    /* renamed from: c */
    public final void mo26626c(Canvas canvas, String str, String str2) {
        mo26627d(canvas, str, str2, -1);
    }

    /* renamed from: d */
    public final void mo26627d(Canvas canvas, String str, String str2, int i) {
        String str3 = str + ": ";
        float measureText = this.f18341C.measureText(str3);
        float measureText2 = this.f18341C.measureText(str2);
        this.f18341C.setColor(1711276032);
        int i2 = this.f18348U;
        int i3 = this.f18349X;
        canvas.drawRect((float) (i2 - 4), (float) (i3 + 8), ((float) i2) + measureText + measureText2 + 4.0f, (float) (i3 + this.f18347Q + 8), this.f18341C);
        this.f18341C.setColor(-1);
        canvas.drawText(str3, (float) this.f18348U, (float) this.f18349X, this.f18341C);
        this.f18341C.setColor(i);
        canvas.drawText(str2, ((float) this.f18348U) + measureText, (float) this.f18349X, this.f18341C);
        this.f18349X += this.f18347Q;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f18341C.setStyle(Paint.Style.STROKE);
        this.f18341C.setStrokeWidth(2.0f);
        this.f18341C.setColor(-26624);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f18341C);
        this.f18341C.setStyle(Paint.Style.FILL);
        this.f18341C.setColor(this.f18358k0);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f18341C);
        this.f18341C.setStyle(Paint.Style.FILL);
        this.f18341C.setStrokeWidth(Utils.FLOAT_EPSILON);
        this.f18341C.setColor(-1);
        this.f18348U = this.f18345M;
        this.f18349X = this.f18346P;
        String str = this.f18353d;
        if (str != null) {
            mo26626c(canvas, "IDs", m28026f("%s, %s", this.f18352a, str));
        } else {
            mo26626c(canvas, "ID", this.f18352a);
        }
        mo26626c(canvas, "D", m28026f("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        mo26627d(canvas, "I", m28026f("%dx%d", Integer.valueOf(this.f18354e), Integer.valueOf(this.f18356g)), mo26629e(this.f18354e, this.f18356g, this.f18360s));
        mo26626c(canvas, "I", m28026f("%d KiB", Integer.valueOf(this.f18357k / RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE)));
        String str2 = this.f18359r;
        if (str2 != null) {
            mo26626c(canvas, "i format", str2);
        }
        int i = this.f18362y;
        if (i > 0) {
            mo26626c(canvas, "anim", m28026f("f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.f18339A)));
        }
        xl5.C3616b bVar = this.f18360s;
        if (bVar != null) {
            mo26625b(canvas, "scale", bVar);
        }
        long j = this.f18350Y;
        if (j >= 0) {
            mo26626c(canvas, "t", m28026f("%d ms", Long.valueOf(j)));
        }
        String str3 = this.f18351Z;
        if (str3 != null) {
            mo26627d(canvas, "origin", str3, this.f18355e0);
        }
        for (Map.Entry next : this.f18361x.entrySet()) {
            mo26626c(canvas, (String) next.getKey(), (String) next.getValue());
        }
    }

    /* renamed from: e */
    public int mo26629e(int i, int i2, xl5.C3616b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (bVar != null) {
                Rect rect = this.f18343I;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f18342H.reset();
                bVar.mo27804a(this.f18342H, this.f18343I, i, i2, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                RectF rectF = this.f18344L;
                rectF.top = Utils.FLOAT_EPSILON;
                rectF.left = Utils.FLOAT_EPSILON;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                this.f18342H.mapRect(rectF);
                width = Math.min(width, (int) this.f18344L.width());
                height = Math.min(height, (int) this.f18344L.height());
            }
            float f = (float) width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = (float) abs;
            if (f7 < f2 && ((float) abs2) < f5) {
                return -16711936;
            }
            if (f7 >= f3 || ((float) abs2) >= f6) {
                return -65536;
            }
            return -256;
        }
        return -65536;
    }

    /* renamed from: g */
    public final void mo26630g(Rect rect, int i, int i2) {
        int i3;
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f18341C.setTextSize((float) min);
        int i4 = min + 8;
        this.f18347Q = i4;
        int i5 = this.f18340B;
        if (i5 == 80) {
            this.f18347Q = i4 * -1;
        }
        this.f18345M = rect.left + 10;
        if (i5 == 80) {
            i3 = rect.bottom - 10;
        } else {
            i3 = rect.top + 10 + 10;
        }
        this.f18346P = i3;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void mo26632h() {
        this.f18354e = -1;
        this.f18356g = -1;
        this.f18357k = -1;
        this.f18361x = new HashMap<>();
        this.f18362y = -1;
        this.f18339A = -1;
        this.f18359r = null;
        mo26633i((String) null);
        this.f18350Y = -1;
        this.f18351Z = null;
        this.f18355e0 = -1;
        invalidateSelf();
    }

    /* renamed from: i */
    public void mo26633i(String str) {
        if (str == null) {
            str = "none";
        }
        this.f18352a = str;
        invalidateSelf();
    }

    /* renamed from: j */
    public void mo26634j(int i, int i2) {
        this.f18354e = i;
        this.f18356g = i2;
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo26635k(int i) {
        this.f18357k = i;
    }

    /* renamed from: l */
    public void mo26636l(String str, int i) {
        this.f18351Z = str;
        this.f18355e0 = i;
        invalidateSelf();
    }

    /* renamed from: m */
    public void mo26637m(xl5.C3616b bVar) {
        this.f18360s = bVar;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo26630g(rect, 9, 8);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
