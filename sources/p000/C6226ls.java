package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.p011rd.animation.type.AnimationType;
import com.p011rd.draw.data.Orientation;
import com.p011rd.draw.data.RtlMode;

/* renamed from: ls */
/* compiled from: AttributeController */
public class C6226ls {

    /* renamed from: a */
    public zt2 f31389a;

    public C6226ls(zt2 zt2) {
        this.f31389a = zt2;
    }

    /* renamed from: a */
    public final AnimationType mo45498a(int i) {
        switch (i) {
            case 0:
                return AnimationType.NONE;
            case 1:
                return AnimationType.COLOR;
            case 2:
                return AnimationType.SCALE;
            case 3:
                return AnimationType.WORM;
            case 4:
                return AnimationType.SLIDE;
            case 5:
                return AnimationType.FILL;
            case 6:
                return AnimationType.THIN_WORM;
            case 7:
                return AnimationType.DROP;
            case 8:
                return AnimationType.SWAP;
            case 9:
                return AnimationType.SCALE_DOWN;
            default:
                return AnimationType.NONE;
        }
    }

    /* renamed from: b */
    public final RtlMode mo45499b(int i) {
        if (i == 0) {
            return RtlMode.On;
        }
        if (i == 1) {
            return RtlMode.Off;
        }
        if (i != 2) {
            return RtlMode.Auto;
        }
        return RtlMode.Auto;
    }

    /* renamed from: c */
    public void mo45500c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x55.PageIndicatorView, 0, 0);
        mo45503f(obtainStyledAttributes);
        mo45502e(obtainStyledAttributes);
        mo45501d(obtainStyledAttributes);
        mo45504g(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void mo45501d(TypedArray typedArray) {
        boolean z = typedArray.getBoolean(x55.PageIndicatorView_piv_interactiveAnimation, false);
        long j = (long) typedArray.getInt(x55.PageIndicatorView_piv_animationDuration, 350);
        if (j < 0) {
            j = 0;
        }
        AnimationType a = mo45498a(typedArray.getInt(x55.PageIndicatorView_piv_animationType, AnimationType.NONE.ordinal()));
        RtlMode b = mo45499b(typedArray.getInt(x55.PageIndicatorView_piv_rtl_mode, RtlMode.Off.ordinal()));
        boolean z2 = typedArray.getBoolean(x55.PageIndicatorView_piv_fadeOnIdle, false);
        long j2 = (long) typedArray.getInt(x55.PageIndicatorView_piv_idleDuration, 3000);
        this.f31389a.mo49918A(j);
        this.f31389a.mo49927J(z);
        this.f31389a.mo49919B(a);
        this.f31389a.mo49936S(b);
        this.f31389a.mo49923F(z2);
        this.f31389a.mo49926I(j2);
    }

    /* renamed from: e */
    public final void mo45502e(TypedArray typedArray) {
        int color = typedArray.getColor(x55.PageIndicatorView_piv_unselectedColor, Color.parseColor("#33ffffff"));
        int color2 = typedArray.getColor(x55.PageIndicatorView_piv_selectedColor, Color.parseColor("#ffffff"));
        this.f31389a.mo49942Y(color);
        this.f31389a.mo49938U(color2);
    }

    /* renamed from: f */
    public final void mo45503f(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(x55.PageIndicatorView_piv_viewPager, -1);
        boolean z = typedArray.getBoolean(x55.PageIndicatorView_piv_autoVisibility, true);
        int i = 0;
        boolean z2 = typedArray.getBoolean(x55.PageIndicatorView_piv_dynamicCount, false);
        int i2 = typedArray.getInt(x55.PageIndicatorView_piv_count, -1);
        if (i2 == -1) {
            i2 = 3;
        }
        int i3 = typedArray.getInt(x55.PageIndicatorView_piv_select, 0);
        if (i3 >= 0 && (i2 <= 0 || i3 <= i2 - 1)) {
            i = i3;
        }
        this.f31389a.mo49943Z(resourceId);
        this.f31389a.mo49920C(z);
        this.f31389a.mo49922E(z2);
        this.f31389a.mo49921D(i2);
        this.f31389a.mo49939V(i);
        this.f31389a.mo49940W(i);
        this.f31389a.mo49928K(i);
    }

    /* renamed from: g */
    public final void mo45504g(TypedArray typedArray) {
        int i = x55.PageIndicatorView_piv_orientation;
        Orientation orientation = Orientation.HORIZONTAL;
        if (typedArray.getInt(i, orientation.ordinal()) != 0) {
            orientation = Orientation.VERTICAL;
        }
        int dimension = (int) typedArray.getDimension(x55.PageIndicatorView_piv_radius, (float) gc1.m44677a(6));
        int i2 = 0;
        if (dimension < 0) {
            dimension = 0;
        }
        int dimension2 = (int) typedArray.getDimension(x55.PageIndicatorView_piv_padding, (float) gc1.m44677a(8));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f = typedArray.getFloat(x55.PageIndicatorView_piv_scaleFactor, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension3 = (int) typedArray.getDimension(x55.PageIndicatorView_piv_strokeWidth, (float) gc1.m44677a(1));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        if (this.f31389a.mo49946b() == AnimationType.FILL) {
            i2 = dimension3;
        }
        this.f31389a.mo49935R(dimension);
        this.f31389a.mo49929L(orientation);
        this.f31389a.mo49930M(dimension2);
        this.f31389a.mo49937T(f);
        this.f31389a.mo49941X(i2);
    }
}
