package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;
import java.util.regex.Pattern;

/* renamed from: qd7 */
/* compiled from: ViewPosition */
public class qd7 {

    /* renamed from: e */
    public static final Pattern f16918e = Pattern.compile("#");

    /* renamed from: f */
    public static final int[] f16919f = new int[2];

    /* renamed from: g */
    public static final Matrix f16920g = new Matrix();

    /* renamed from: h */
    public static final Rect f16921h = new Rect();

    /* renamed from: a */
    public final Rect f16922a = new Rect();

    /* renamed from: b */
    public final Rect f16923b = new Rect();

    /* renamed from: c */
    public final Rect f16924c = new Rect();

    /* renamed from: d */
    public final Rect f16925d = new Rect();

    /* renamed from: a */
    public static void m25603a(qd7 qd7, Point point) {
        Rect rect = qd7.f16922a;
        int i = point.x;
        int i2 = point.y;
        rect.set(i, i2, i + 1, i2 + 1);
        qd7.f16923b.set(qd7.f16922a);
        qd7.f16924c.set(qd7.f16922a);
        qd7.f16925d.set(qd7.f16922a);
    }

    /* renamed from: b */
    public static boolean m25604b(qd7 qd7, View view) {
        return qd7.mo25073e(view);
    }

    /* renamed from: c */
    public static float m25605c(Object obj) {
        if (!(obj instanceof View)) {
            return 1.0f;
        }
        View view = (View) obj;
        return view.getScaleX() * m25605c(view.getParent());
    }

    /* renamed from: d */
    public static float m25606d(Object obj) {
        if (!(obj instanceof View)) {
            return 1.0f;
        }
        View view = (View) obj;
        return view.getScaleY() * m25606d(view.getParent());
    }

    /* renamed from: f */
    public static qd7 m25607f() {
        return new qd7();
    }

    /* renamed from: e */
    public final boolean mo25073e(View view) {
        if (view.getWindowToken() == null) {
            return false;
        }
        Matrix matrix = f16920g;
        matrix.setScale(m25605c(view), m25606d(view), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        Rect rect = f16921h;
        rect.set(this.f16922a);
        int[] iArr = f16919f;
        view.getLocationInWindow(iArr);
        this.f16922a.set(0, 0, view.getWidth(), view.getHeight());
        cp3.m14356e(matrix, this.f16922a);
        this.f16922a.offset(iArr[0], iArr[1]);
        this.f16923b.set(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
        cp3.m14356e(matrix, this.f16923b);
        this.f16923b.offset(iArr[0], iArr[1]);
        if (!view.getGlobalVisibleRect(this.f16924c)) {
            this.f16924c.set(this.f16922a.centerX(), this.f16922a.centerY(), this.f16922a.centerX() + 1, this.f16922a.centerY() + 1);
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                this.f16925d.set(this.f16923b);
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                ds2.m15371a(imageView.getScaleType(), intrinsicWidth, intrinsicHeight, this.f16923b.width(), this.f16923b.height(), imageView.getImageMatrix(), matrix);
                this.f16925d.set(0, 0, intrinsicWidth, intrinsicHeight);
                cp3.m14356e(matrix, this.f16925d);
                Rect rect2 = this.f16925d;
                Rect rect3 = this.f16923b;
                rect2.offset(rect3.left, rect3.top);
            }
        } else {
            this.f16925d.set(this.f16923b);
        }
        return !rect.equals(this.f16922a);
    }

    /* renamed from: g */
    public String mo25074g() {
        return TextUtils.join("#", new String[]{this.f16922a.flattenToString(), this.f16923b.flattenToString(), this.f16924c.flattenToString(), this.f16925d.flattenToString()});
    }
}
