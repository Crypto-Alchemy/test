package androidx.compose.p004ui.graphics.colorspace;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bQ\u0010RR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001e\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010!\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R\u0017\u0010$\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R\u0017\u0010'\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R\u0017\u0010*\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R\u0017\u0010-\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0014R\u0017\u00100\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u0010\u0014R\u0017\u00103\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b2\u0010\u0014R\u0017\u00106\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u0010\u0014R\u0017\u00109\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u0010\u0013\u001a\u0004\b8\u0010\u0014R\u0017\u0010<\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b:\u0010\u0013\u001a\u0004\b;\u0010\u0014R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010E\u001a\u00020=8\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR\u001a\u0010G\u001a\u00020\u00118\u0000X\u0004¢\u0006\f\n\u0004\bF\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0017\u0010J\u001a\u00020=8\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR \u0010P\u001a\b\u0012\u0004\u0012\u00020=0K8\u0000X\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006S"}, mo44877d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "", "b", "[F", "d", "()[F", "SrgbPrimaries", "c", "Ntsc1953Primaries", "Lfw6;", "Lfw6;", "getSrgbTransferParameters$ui_graphics_release", "()Lfw6;", "SrgbTransferParameters", "e", "NoneTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "f", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "g", "getLinearSrgb", "LinearSrgb", "h", "getExtendedSrgb", "ExtendedSrgb", "i", "getLinearExtendedSrgb", "LinearExtendedSrgb", "j", "getBt709", "Bt709", "k", "getBt2020", "Bt2020", "l", "getDciP3", "DciP3", "m", "getDisplayP3", "DisplayP3", "n", "getNtsc1953", "Ntsc1953", "o", "getSmpteC", "SmpteC", "p", "getAdobeRgb", "AdobeRgb", "q", "getProPhotoRgb", "ProPhotoRgb", "r", "getAces", "Aces", "s", "getAcescg", "Acescg", "Lcl0;", "t", "Lcl0;", "getCieXyz", "()Lcl0;", "CieXyz", "u", "getCieLab", "CieLab", "v", "Unspecified", "w", "getOklab", "Oklab", "", "x", "[Lcl0;", "a", "()[Lcl0;", "ColorSpacesArray", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaces */
/* compiled from: ColorSpaces.kt */
public final class ColorSpaces {

    /* renamed from: a */
    public static final ColorSpaces f1663a = new ColorSpaces();

    /* renamed from: b */
    public static final float[] f1664b;

    /* renamed from: c */
    public static final float[] f1665c;

    /* renamed from: d */
    public static final fw6 f1666d;

    /* renamed from: e */
    public static final fw6 f1667e;

    /* renamed from: f */
    public static final Rgb f1668f;

    /* renamed from: g */
    public static final Rgb f1669g;

    /* renamed from: h */
    public static final Rgb f1670h;

    /* renamed from: i */
    public static final Rgb f1671i;

    /* renamed from: j */
    public static final Rgb f1672j;

    /* renamed from: k */
    public static final Rgb f1673k;

    /* renamed from: l */
    public static final Rgb f1674l;

    /* renamed from: m */
    public static final Rgb f1675m;

    /* renamed from: n */
    public static final Rgb f1676n;

    /* renamed from: o */
    public static final Rgb f1677o;

    /* renamed from: p */
    public static final Rgb f1678p;

    /* renamed from: q */
    public static final Rgb f1679q;

    /* renamed from: r */
    public static final Rgb f1680r;

    /* renamed from: s */
    public static final Rgb f1681s;

    /* renamed from: t */
    public static final cl0 f1682t;

    /* renamed from: u */
    public static final cl0 f1683u;

    /* renamed from: v */
    public static final Rgb f1684v;

    /* renamed from: w */
    public static final cl0 f1685w;

    /* renamed from: x */
    public static final cl0[] f1686x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f1664b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f1665c = fArr2;
        fw6 fw6 = new fw6(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 96, (DefaultConstructorMarker) null);
        f1666d = fw6;
        fw6 fw62 = new fw6(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 96, (DefaultConstructorMarker) null);
        f1667e = fw62;
        jq2 jq2 = jq2.f13799a;
        float[] fArr3 = fArr;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr3, jq2.mo22046e(), fw6, 0);
        f1668f = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr3, jq2.mo22046e(), 1.0d, Utils.FLOAT_EPSILON, 1.0f, 1);
        f1669g = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr3, jq2.mo22046e(), (float[]) null, ColorSpaces$ExtendedSrgb$1.INSTANCE, ColorSpaces$ExtendedSrgb$2.INSTANCE, -0.799f, 2.399f, fw6, 2);
        f1670h = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr3, jq2.mo22046e(), 1.0d, -0.5f, 7.499f, 3);
        f1671i = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, jq2.mo22046e(), new fw6(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 96, (DefaultConstructorMarker) null), 4);
        f1672j = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, jq2.mo22046e(), new fw6(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 96, (DefaultConstructorMarker) null), 5);
        f1673k = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new tk7(0.314f, 0.351f), 2.6d, Utils.FLOAT_EPSILON, 1.0f, 6);
        f1674l = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, jq2.mo22046e(), fw6, 7);
        f1675m = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, jq2.mo22042a(), new fw6(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 96, (DefaultConstructorMarker) null), 8);
        f1676n = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, jq2.mo22046e(), new fw6(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 96, (DefaultConstructorMarker) null), 9);
        f1677o = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, jq2.mo22046e(), 2.2d, Utils.FLOAT_EPSILON, 1.0f, 10);
        f1678p = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, jq2.mo22043b(), new fw6(1.8d, 1.0d, Utils.DOUBLE_EPSILON, 0.0625d, 0.031248d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 96, (DefaultConstructorMarker) null), 11);
        f1679q = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, Utils.FLOAT_EPSILON, 1.0f, 1.0E-4f, -0.077f}, jq2.mo22045d(), 1.0d, -65504.0f, 65504.0f, 12);
        f1680r = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, jq2.mo22045d(), 1.0d, -65504.0f, 65504.0f, 13);
        f1681s = rgb14;
        ip7 ip7 = new ip7("Generic XYZ", 14);
        f1682t = ip7;
        td3 td3 = new td3("Generic L*a*b*", 15);
        f1683u = td3;
        float[] fArr4 = fArr;
        Rgb rgb15 = new Rgb("None", fArr4, jq2.mo22046e(), fw62, 16);
        f1684v = rgb15;
        vg4 vg4 = new vg4("Oklab", 17);
        f1685w = vg4;
        f1686x = new cl0[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, ip7, td3, rgb15, vg4};
    }

    /* renamed from: a */
    public final cl0[] mo3277a() {
        return f1686x;
    }

    /* renamed from: b */
    public final float[] mo3278b() {
        return f1665c;
    }

    /* renamed from: c */
    public final Rgb mo3279c() {
        return f1668f;
    }

    /* renamed from: d */
    public final float[] mo3280d() {
        return f1664b;
    }

    /* renamed from: e */
    public final Rgb mo3281e() {
        return f1684v;
    }
}
