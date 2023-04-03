package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e27 */
/* compiled from: TypedArrayUtils */
public class e27 {
    /* renamed from: a */
    public static boolean m15642a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m15651j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m15643b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m15651j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m15644c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m15651j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return el0.m16167d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m15645d(typedValue);
        }
    }

    /* renamed from: d */
    public static ColorStateList m15645d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static pm0 m15646e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m15651j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return pm0.m25035b(typedValue.data);
            }
            pm0 g = pm0.m25038g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return pm0.m25035b(i2);
    }

    /* renamed from: f */
    public static float m15647f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m15651j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m15648g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m15651j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m15649h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m15651j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m15650i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m15651j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m15651j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static TypedArray m15652k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m15653l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m15651j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
