package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: hz */
/* compiled from: BaseProgressIndicatorSpec */
public abstract class C5943hz {

    /* renamed from: a */
    public int f29758a;

    /* renamed from: b */
    public int f29759b;

    /* renamed from: c */
    public int[] f29760c = new int[0];

    /* renamed from: d */
    public int f29761d;

    /* renamed from: e */
    public int f29762e;

    /* renamed from: f */
    public int f29763f;

    public C5943hz(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(k25.mtrl_progress_track_thickness);
        TypedArray h = wo6.m54004h(context, attributeSet, u55.BaseProgressIndicator, i, i2, new int[0]);
        this.f29758a = to3.m52392c(context, h, u55.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f29759b = Math.min(to3.m52392c(context, h, u55.BaseProgressIndicator_trackCornerRadius, 0), this.f29758a / 2);
        this.f29762e = h.getInt(u55.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f29763f = h.getInt(u55.BaseProgressIndicator_hideAnimationBehavior, 0);
        mo43430c(context, h);
        mo43431d(context, h);
        h.recycle();
    }

    /* renamed from: a */
    public boolean mo43428a() {
        if (this.f29763f != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo43429b() {
        if (this.f29762e != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo43430c(Context context, TypedArray typedArray) {
        int i = u55.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.f29760c = new int[]{ro3.m51196b(context, j15.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f29760c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f29760c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    public final void mo43431d(Context context, TypedArray typedArray) {
        int i = u55.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            this.f29761d = typedArray.getColor(i, -1);
            return;
        }
        this.f29761d = this.f29760c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f29761d = ro3.m51195a(this.f29761d, (int) (f * 255.0f));
    }

    /* renamed from: e */
    public abstract void mo33320e();
}
