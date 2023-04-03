package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C1463d;
import java.util.Map;

public class ChangeImageTransform extends Transition {

    /* renamed from: x1 */
    public static final String[] f7115x1 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: y1 */
    public static final TypeEvaluator<Matrix> f7116y1 = new C1421a();

    /* renamed from: z1 */
    public static final Property<ImageView, Matrix> f7117z1 = new C1422b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    public static class C1421a implements TypeEvaluator<Matrix> {
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    public static class C1422b extends Property<ImageView, Matrix> {
        public C1422b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            hs2.m19250a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    public static /* synthetic */ class C1423c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7118a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7118a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7118a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.C1423c.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: A0 */
    public static Matrix m10006A0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: v0 */
    public static Matrix m10007v0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    /* renamed from: w0 */
    public static Matrix m10008w0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C1423c.f7118a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return m10006A0(imageView);
            }
            if (i == 2) {
                return m10007v0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: M */
    public String[] mo10404M() {
        return f7115x1;
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        mo10447u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        mo10447u0(bx6);
    }

    /* renamed from: t */
    public Animator mo10407t(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        boolean z;
        if (bx6 == null || bx62 == null) {
            return null;
        }
        Rect rect = (Rect) bx6.f8291a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) bx62.f8291a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) bx6.f8291a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) bx62.f8291a.get("android:changeImageTransform:matrix");
        if (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) {
            z = false;
        } else {
            z = true;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) bx62.f8292b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return mo10449z0(imageView);
        }
        if (matrix == null) {
            matrix = kp3.f14265a;
        }
        if (matrix2 == null) {
            matrix2 = kp3.f14265a;
        }
        f7117z1.set(imageView, matrix);
        return mo10448x0(imageView, matrix, matrix2);
    }

    /* renamed from: u0 */
    public final void mo10447u0(bx6 bx6) {
        View view = bx6.f8292b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = bx6.f8291a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", m10008w0(imageView));
            }
        }
    }

    /* renamed from: x0 */
    public final ObjectAnimator mo10448x0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f7117z1, new C1463d.C1464a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: z0 */
    public final ObjectAnimator mo10449z0(ImageView imageView) {
        Property<ImageView, Matrix> property = f7117z1;
        TypeEvaluator<Matrix> typeEvaluator = f7116y1;
        Matrix matrix = kp3.f14265a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
