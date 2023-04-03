package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: pi2 */
/* compiled from: GradientColorInflaterCompat */
public final class pi2 {
    /* renamed from: a */
    public static C3071a m24955a(C3071a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C3071a(i, i3, i2);
        }
        return new C3071a(i, i2);
    }

    /* renamed from: b */
    public static Shader m24956b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray k = e27.m15652k(resources, theme2, attributeSet, e65.GradientColor);
            float f = e27.m15647f(k, xmlPullParser2, "startX", e65.GradientColor_android_startX, Utils.FLOAT_EPSILON);
            float f2 = e27.m15647f(k, xmlPullParser2, "startY", e65.GradientColor_android_startY, Utils.FLOAT_EPSILON);
            float f3 = e27.m15647f(k, xmlPullParser2, "endX", e65.GradientColor_android_endX, Utils.FLOAT_EPSILON);
            float f4 = e27.m15647f(k, xmlPullParser2, "endY", e65.GradientColor_android_endY, Utils.FLOAT_EPSILON);
            float f5 = e27.m15647f(k, xmlPullParser2, "centerX", e65.GradientColor_android_centerX, Utils.FLOAT_EPSILON);
            float f6 = e27.m15647f(k, xmlPullParser2, "centerY", e65.GradientColor_android_centerY, Utils.FLOAT_EPSILON);
            int g = e27.m15648g(k, xmlPullParser2, "type", e65.GradientColor_android_type, 0);
            int b = e27.m15643b(k, xmlPullParser2, "startColor", e65.GradientColor_android_startColor, 0);
            boolean j = e27.m15651j(xmlPullParser2, "centerColor");
            int b2 = e27.m15643b(k, xmlPullParser2, "centerColor", e65.GradientColor_android_centerColor, 0);
            int b3 = e27.m15643b(k, xmlPullParser2, "endColor", e65.GradientColor_android_endColor, 0);
            int g2 = e27.m15648g(k, xmlPullParser2, "tileMode", e65.GradientColor_android_tileMode, 0);
            float f7 = f5;
            float f8 = e27.m15647f(k, xmlPullParser2, "gradientRadius", e65.GradientColor_android_gradientRadius, Utils.FLOAT_EPSILON);
            k.recycle();
            C3071a a = m24955a(m24957c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g == 1) {
                float f9 = f7;
                if (f8 > Utils.FLOAT_EPSILON) {
                    int[] iArr = a.f16492a;
                    return new RadialGradient(f9, f6, f8, iArr, a.f16493b, m24958d(g2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g != 2) {
                return new LinearGradient(f, f2, f3, f4, a.f16492a, a.f16493b, m24958d(g2));
            } else {
                return new SweepGradient(f7, f6, a.f16492a, a.f16493b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.pi2.C3071a m24957c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p000.e65.GradientColorItem
            android.content.res.TypedArray r3 = p000.e27.m15652k(r9, r12, r11, r3)
            int r5 = p000.e65.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = p000.e65.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            pi2$a r9 = new pi2$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pi2.m24957c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):pi2$a");
    }

    /* renamed from: d */
    public static Shader.TileMode m24958d(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: pi2$a */
    /* compiled from: GradientColorInflaterCompat */
    public static final class C3071a {

        /* renamed from: a */
        public final int[] f16492a;

        /* renamed from: b */
        public final float[] f16493b;

        public C3071a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f16492a = new int[size];
            this.f16493b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f16492a[i] = list.get(i).intValue();
                this.f16493b[i] = list2.get(i).floatValue();
            }
        }

        public C3071a(int i, int i2) {
            this.f16492a = new int[]{i, i2};
            this.f16493b = new float[]{Utils.FLOAT_EPSILON, 1.0f};
        }

        public C3071a(int i, int i2, int i3) {
            this.f16492a = new int[]{i, i2, i3};
            this.f16493b = new float[]{Utils.FLOAT_EPSILON, 0.5f, 1.0f};
        }
    }
}
