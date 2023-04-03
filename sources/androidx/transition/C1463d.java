package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.transition.d */
/* compiled from: TransitionUtils */
public class C1463d {

    /* renamed from: a */
    public static final boolean f7265a = true;

    /* renamed from: b */
    public static final boolean f7266b = true;

    /* renamed from: c */
    public static final boolean f7267c;

    /* renamed from: androidx.transition.d$a */
    /* compiled from: TransitionUtils */
    public static class C1464a implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        public final float[] f7268a = new float[9];

        /* renamed from: b */
        public final float[] f7269b = new float[9];

        /* renamed from: c */
        public final Matrix f7270c = new Matrix();

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f7268a);
            matrix2.getValues(this.f7269b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f7269b;
                float f2 = fArr[i];
                float f3 = this.f7268a[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.f7270c.setValues(this.f7269b);
            return this.f7270c;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f7267c = z;
    }

    /* renamed from: a */
    public static View m10219a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        qe7.m25634j(view, matrix);
        qe7.m25635k(viewGroup, matrix);
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b = m10220b(view, matrix, rectF, viewGroup);
        if (b != null) {
            imageView.setImageBitmap(b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* renamed from: b */
    public static Bitmap m10220b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup2;
        if (f7265a) {
            z2 = !view.isAttachedToWindow();
            if (viewGroup == null) {
                z = false;
            } else {
                z = viewGroup.isAttachedToWindow();
            }
        } else {
            z2 = false;
            z = false;
        }
        boolean z3 = f7266b;
        Bitmap bitmap = null;
        if (!z3 || !z2) {
            i = 0;
            viewGroup2 = null;
        } else if (!z) {
            return null;
        } else {
            viewGroup2 = (ViewGroup) view.getParent();
            i = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int round3 = Math.round(((float) round) * min);
            int round4 = Math.round(((float) round2) * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f7267c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z2) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap;
    }

    /* renamed from: c */
    public static Animator m10221c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
