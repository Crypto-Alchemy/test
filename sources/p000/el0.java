package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: el0 */
/* compiled from: ColorStateListInflaterCompat */
public final class el0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f11235a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m16164a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m16165b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el0.m16164a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: b */
    public static ColorStateList m16165b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m16168e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    public static TypedValue m16166c() {
        ThreadLocal<TypedValue> threadLocal = f11235a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: d */
    public static ColorStateList m16167d(Resources resources, int i, Resources.Theme theme) {
        try {
            return m16164a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m16168e(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r8 = 0
        L_0x0013:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x00ec
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x0022
            r11 = 3
            if (r9 == r11) goto L_0x00ec
        L_0x0022:
            r11 = 2
            if (r9 != r11) goto L_0x00e7
            if (r10 > r3) goto L_0x00e7
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0035
            goto L_0x00e7
        L_0x0035:
            int[] r9 = p000.e65.ColorStateListItem
            android.content.res.TypedArray r9 = m16171h(r0, r2, r1, r9)
            int r10 = p000.e65.ColorStateListItem_android_color
            r11 = -1
            int r12 = r9.getResourceId(r10, r11)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r11) goto L_0x0061
            boolean r11 = m16169f(r0, r12)
            if (r11 != 0) goto L_0x0061
            android.content.res.XmlResourceParser r10 = r0.getXml(r12)     // Catch:{ Exception -> 0x005a }
            android.content.res.ColorStateList r10 = m16164a(r0, r10, r2)     // Catch:{ Exception -> 0x005a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x005a }
            goto L_0x0065
        L_0x005a:
            int r10 = p000.e65.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r13)
            goto L_0x0065
        L_0x0061:
            int r10 = r9.getColor(r10, r13)
        L_0x0065:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = p000.e65.ColorStateListItem_android_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0074
            float r11 = r9.getFloat(r12, r11)
            goto L_0x0080
        L_0x0074:
            int r12 = p000.e65.ColorStateListItem_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0080
            float r11 = r9.getFloat(r12, r11)
        L_0x0080:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r13) goto L_0x0095
            int r12 = p000.e65.ColorStateListItem_android_lStar
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0095
            float r12 = r9.getFloat(r12, r14)
            goto L_0x009b
        L_0x0095:
            int r12 = p000.e65.ColorStateListItem_lStar
            float r12 = r9.getFloat(r12, r14)
        L_0x009b:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r13 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x00a6:
            if (r14 >= r9) goto L_0x00d2
            int r4 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r7) goto L_0x00cc
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r7) goto L_0x00cc
            int r7 = p000.g15.alpha
            if (r4 == r7) goto L_0x00cc
            int r7 = p000.g15.lStar
            if (r4 == r7) goto L_0x00cc
            int r7 = r15 + 1
            r0 = 0
            boolean r16 = r1.getAttributeBooleanValue(r14, r0)
            if (r16 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            int r4 = -r4
        L_0x00c9:
            r13[r15] = r4
            r15 = r7
        L_0x00cc:
            int r14 = r14 + 1
            r4 = 1
            r0 = r17
            goto L_0x00a6
        L_0x00d2:
            int[] r0 = android.util.StateSet.trimStateSet(r13, r15)
            int r4 = m16170g(r10, r11, r12)
            int[] r5 = p000.wj2.m29605a(r5, r8, r4)
            java.lang.Object[] r0 = p000.wj2.m29606b(r6, r8, r0)
            r6 = r0
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        L_0x00e7:
            r4 = 1
            r0 = r17
            goto L_0x0013
        L_0x00ec:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el0.m16168e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    public static boolean m16169f(Resources resources, int i) {
        TypedValue c = m16166c();
        resources.getValue(i, c, true);
        int i2 = c.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static int m16170g(int i, float f, float f2) {
        boolean z;
        if (f2 < Utils.FLOAT_EPSILON || f2 > 100.0f) {
            z = false;
        } else {
            z = true;
        }
        if (f == 1.0f && !z) {
            return i;
        }
        int b = ep3.m16274b((int) ((((float) Color.alpha(i)) * f) + 0.5f), 0, 255);
        if (z) {
            z90 c = z90.m31070c(i);
            i = z90.m31074m(c.mo28389j(), c.mo28388i(), f2);
        }
        return (i & 16777215) | (b << 24);
    }

    /* renamed from: h */
    public static TypedArray m16171h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
