package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;

/* renamed from: pm0 */
/* compiled from: ComplexColorCompat */
public final class pm0 {

    /* renamed from: a */
    public final Shader f16546a;

    /* renamed from: b */
    public final ColorStateList f16547b;

    /* renamed from: c */
    public int f16548c;

    public pm0(Shader shader, ColorStateList colorStateList, int i) {
        this.f16546a = shader;
        this.f16547b = colorStateList;
        this.f16548c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.pm0 m25034a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = p000.el0.m16165b(r4, r5, r0, r6)
            pm0 r4 = m25036c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = p000.pi2.m24956b(r4, r5, r0, r6)
            pm0 r4 = m25037d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pm0.m25034a(android.content.res.Resources, int, android.content.res.Resources$Theme):pm0");
    }

    /* renamed from: b */
    public static pm0 m25035b(int i) {
        return new pm0((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    public static pm0 m25036c(ColorStateList colorStateList) {
        return new pm0((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static pm0 m25037d(Shader shader) {
        return new pm0(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static pm0 m25038g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m25034a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public int mo24645e() {
        return this.f16548c;
    }

    /* renamed from: f */
    public Shader mo24646f() {
        return this.f16546a;
    }

    /* renamed from: h */
    public boolean mo24647h() {
        if (this.f16546a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo24648i() {
        ColorStateList colorStateList;
        if (this.f16546a != null || (colorStateList = this.f16547b) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo24649j(int[] iArr) {
        if (mo24648i()) {
            ColorStateList colorStateList = this.f16547b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f16548c) {
                this.f16548c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo24650k(int i) {
        this.f16548c = i;
    }

    /* renamed from: l */
    public boolean mo24651l() {
        if (mo24647h() || this.f16548c != 0) {
            return true;
        }
        return false;
    }
}
