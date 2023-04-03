package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    public Path f7157a;

    /* renamed from: b */
    public final Path f7158b;

    /* renamed from: c */
    public final Matrix f7159c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f7158b = path;
        this.f7159c = new Matrix();
        path.lineTo(1.0f, Utils.FLOAT_EPSILON);
        this.f7157a = path;
    }

    /* renamed from: b */
    public static float m10059b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: a */
    public Path mo10399a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = m10059b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f7159c.setScale(b, b);
        this.f7159c.postRotate((float) Math.toDegrees(atan2));
        this.f7159c.postTranslate(f, f2);
        Path path = new Path();
        this.f7158b.transform(this.f7159c, path);
        return path;
    }

    /* renamed from: c */
    public void mo10488c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(Utils.FLOAT_EPSILON, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f7159c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / m10059b(f5, f6);
        this.f7159c.postScale(b, b);
        this.f7159c.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f7159c, this.f7158b);
        this.f7157a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f7158b = new Path();
        this.f7159c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11774k);
        try {
            String i = e27.m15650i(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (i != null) {
                mo10488c(xm4.m30210e(i));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
