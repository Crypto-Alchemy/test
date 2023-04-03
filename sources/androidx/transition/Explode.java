package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.github.mikephil.charting.utils.Utils;

public class Explode extends Visibility {

    /* renamed from: A1 */
    public static final TimeInterpolator f7150A1 = new DecelerateInterpolator();

    /* renamed from: B1 */
    public static final TimeInterpolator f7151B1 = new AccelerateInterpolator();

    /* renamed from: z1 */
    public int[] f7152z1 = new int[2];

    public Explode() {
        mo10533p0(new cf0());
    }

    /* renamed from: F0 */
    public static float m10045F0(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: G0 */
    public static float m10046G0(View view, int i, int i2) {
        return m10045F0((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: u0 */
    private void m10047u0(bx6 bx6) {
        View view = bx6.f8292b;
        view.getLocationOnScreen(this.f7152z1);
        int[] iArr = this.f7152z1;
        int i = iArr[0];
        int i2 = iArr[1];
        bx6.f8291a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: B0 */
    public Animator mo10482B0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        float f;
        float f2;
        if (bx6 == null) {
            return null;
        }
        Rect rect = (Rect) bx6.f8291a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) bx6.f8292b.getTag(e35.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f2 = ((float) (i3 - rect.left)) + translationX;
            int i4 = iArr[1];
            f = ((float) (i4 - rect.top)) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f2 = translationX;
            f = translationY;
        }
        mo10483H0(viewGroup, rect, this.f7152z1);
        int[] iArr2 = this.f7152z1;
        return C1465e.m10223a(view, bx6, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f7151B1, this);
    }

    /* renamed from: H0 */
    public final void mo10483H0(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.f7152z1);
        int[] iArr2 = this.f7152z1;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect y = mo10544y();
        if (y == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = y.centerX();
            i = y.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == Utils.FLOAT_EPSILON && centerY == Utils.FLOAT_EPSILON) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float F0 = m10045F0(centerX2, centerY);
        float G0 = m10046G0(view2, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / F0) * G0);
        iArr[1] = Math.round(G0 * (centerY / F0));
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        super.mo10405i(bx6);
        m10047u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        super.mo10406m(bx6);
        m10047u0(bx6);
    }

    /* renamed from: z0 */
    public Animator mo10484z0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        if (bx62 == null) {
            return null;
        }
        Rect rect = (Rect) bx62.f8291a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        mo10483H0(viewGroup, rect, this.f7152z1);
        int[] iArr = this.f7152z1;
        return C1465e.m10223a(view, bx62, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f7150A1, this);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo10533p0(new cf0());
    }
}
