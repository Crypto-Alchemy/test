package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {

    /* renamed from: g */
    public static final float f7068g = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    public float f7069a = Utils.FLOAT_EPSILON;

    /* renamed from: b */
    public float f7070b = Utils.FLOAT_EPSILON;

    /* renamed from: c */
    public float f7071c = 70.0f;

    /* renamed from: d */
    public float f7072d = Utils.FLOAT_EPSILON;

    /* renamed from: e */
    public float f7073e = Utils.FLOAT_EPSILON;

    /* renamed from: f */
    public float f7074f = f7068g;

    public ArcMotion() {
    }

    /* renamed from: e */
    public static float m9973e(float f) {
        if (f >= Utils.FLOAT_EPSILON && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public Path mo10399a(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f10 = f3 - f;
        float f11 = f4 - f2;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = (f + f3) / 2.0f;
        float f14 = (f2 + f4) / 2.0f;
        float f15 = 0.25f * f12;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f10) < Math.abs(f11)) {
            float abs = Math.abs(f12 / (f11 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f7073e;
        } else {
            float f16 = f12 / (f10 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f16 + f;
            } else {
                f8 = f3 - f16;
                f9 = f4;
            }
            f5 = this.f7072d;
        }
        float f17 = f15 * f5 * f5;
        float f18 = f13 - f6;
        float f19 = f14 - f7;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = this.f7074f;
        float f22 = f15 * f21 * f21;
        if (f20 >= f17) {
            if (f20 > f22) {
                f17 = f22;
            } else {
                f17 = 0.0f;
            }
        }
        if (f17 != Utils.FLOAT_EPSILON) {
            float sqrt = (float) Math.sqrt((double) (f17 / f20));
            f6 = ((f6 - f13) * sqrt) + f13;
            f7 = f14 + (sqrt * (f7 - f14));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public void mo10400b(float f) {
        this.f7071c = f;
        this.f7074f = m9973e(f);
    }

    /* renamed from: c */
    public void mo10401c(float f) {
        this.f7069a = f;
        this.f7072d = m9973e(f);
    }

    /* renamed from: d */
    public void mo10402d(float f) {
        this.f7070b = f;
        this.f7073e = m9973e(f);
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11773j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo10402d(e27.m15647f(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, Utils.FLOAT_EPSILON));
        mo10401c(e27.m15647f(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, Utils.FLOAT_EPSILON));
        mo10400b(e27.m15647f(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
