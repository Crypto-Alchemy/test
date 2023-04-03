package p000;

import androidx.compose.p004ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p004ui.graphics.colorspace.Rgb;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.al0;
import p000.zp0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0014\n\u0002\b\n\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007\u001a8\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0019H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0000\u001a\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a \u0010\u0014\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, mo44877d2 = {"Lcl0;", "destination", "Lcd5;", "intent", "Lzp0;", "h", "(Lcl0;Lcl0;I)Lzp0;", "Ltk7;", "whitePoint", "Lkb;", "adaptation", "c", "", "x", "a", "b", "d", "g", "n", "p", "e", "f", "o", "q", "", "", "m", "j", "lhs", "rhs", "k", "l", "matrix", "srcWhitePoint", "dstWhitePoint", "ui-graphics_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: dl0 */
/* compiled from: ColorSpace.kt */
public final class dl0 {
    /* renamed from: a */
    public static final double m15150a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = d;
        if (d8 < Utils.DOUBLE_EPSILON) {
            d7 = -d8;
        } else {
            d7 = d8;
        }
        return Math.copySign(m15163n(d7, d2, d3, d4, d5, d6), d8);
    }

    /* renamed from: b */
    public static final double m15151b(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = d;
        if (d8 < Utils.DOUBLE_EPSILON) {
            d7 = -d8;
        } else {
            d7 = d8;
        }
        return Math.copySign(m15165p(d7, d2, d3, d4, d5, d6), d8);
    }

    /* renamed from: c */
    public static final cl0 m15152c(cl0 cl0, tk7 tk7, C2651kb kbVar) {
        vx2.m53591g(cl0, "<this>");
        vx2.m53591g(tk7, "whitePoint");
        vx2.m53591g(kbVar, "adaptation");
        if (!al0.m355e(cl0.mo12100f(), al0.f181a.mo358b())) {
            return cl0;
        }
        Rgb rgb = (Rgb) cl0;
        if (m15155f(rgb.mo3297r(), tk7)) {
            return cl0;
        }
        return new Rgb(rgb, m15160k(m15154e(kbVar.mo22238b(), rgb.mo3297r().mo26501c(), tk7.mo26501c()), rgb.mo3296q()), tk7);
    }

    /* renamed from: d */
    public static /* synthetic */ cl0 m15153d(cl0 cl0, tk7 tk7, C2651kb kbVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kbVar = C2651kb.f14024b.mo22242a();
        }
        return m15152c(cl0, tk7, kbVar);
    }

    /* renamed from: e */
    public static final float[] m15154e(float[] fArr, float[] fArr2, float[] fArr3) {
        vx2.m53591g(fArr, "matrix");
        vx2.m53591g(fArr2, "srcWhitePoint");
        vx2.m53591g(fArr3, "dstWhitePoint");
        float[] m = m15162m(fArr, fArr2);
        float[] m2 = m15162m(fArr, fArr3);
        return m15160k(m15159j(fArr), m15161l(new float[]{m2[0] / m[0], m2[1] / m[1], m2[2] / m[2]}, fArr));
    }

    /* renamed from: f */
    public static final boolean m15155f(tk7 tk7, tk7 tk72) {
        vx2.m53591g(tk7, "a");
        vx2.m53591g(tk72, "b");
        if (tk7 == tk72) {
            return true;
        }
        if (Math.abs(tk7.mo26499a() - tk72.mo26499a()) >= 0.001f || Math.abs(tk7.mo26500b() - tk72.mo26500b()) >= 0.001f) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m15156g(float[] fArr, float[] fArr2) {
        vx2.m53591g(fArr, "a");
        vx2.m53591g(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static final zp0 m15157h(cl0 cl0, cl0 cl02, int i) {
        vx2.m53591g(cl0, "$this$connect");
        vx2.m53591g(cl02, "destination");
        if (cl0 == cl02) {
            return zp0.f20617g.mo28545c(cl0);
        }
        long f = cl0.mo12100f();
        al0.C0034a aVar = al0.f181a;
        if (!al0.m355e(f, aVar.mo358b()) || !al0.m355e(cl02.mo12100f(), aVar.mo358b())) {
            return new zp0(cl0, cl02, i, (DefaultConstructorMarker) null);
        }
        return new zp0.C3749b((Rgb) cl0, (Rgb) cl02, i, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public static /* synthetic */ zp0 m15158i(cl0 cl0, cl0 cl02, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cl02 = ColorSpaces.f1663a.mo3279c();
        }
        if ((i2 & 2) != 0) {
            i = cd5.f8406a.mo12037b();
        }
        return m15157h(cl0, cl02, i);
    }

    /* renamed from: j */
    public static final float[] m15159j(float[] fArr) {
        float[] fArr2 = fArr;
        vx2.m53591g(fArr2, "m");
        float f = fArr2[0];
        float f2 = fArr2[3];
        float f3 = fArr2[6];
        float f4 = fArr2[1];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[2];
        float f8 = fArr2[5];
        float f9 = fArr2[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f10 / f13;
        fArr3[1] = f11 / f13;
        fArr3[2] = f12 / f13;
        fArr3[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr3[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr3[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr3[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr3[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr3[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr3;
    }

    /* renamed from: k */
    public static final float[] m15160k(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        vx2.m53591g(fArr3, "lhs");
        vx2.m53591g(fArr4, "rhs");
        float f = fArr3[3];
        float f2 = fArr4[1];
        float f3 = fArr3[6];
        float f4 = fArr4[2];
        float f5 = fArr3[1];
        float f6 = fArr4[0];
        float f7 = fArr3[4];
        float f8 = fArr3[7];
        float f9 = fArr3[5];
        float f10 = fArr3[8];
        float f11 = fArr3[0];
        float f12 = fArr4[4];
        float f13 = (fArr4[3] * f11) + (f * f12);
        float f14 = fArr4[5];
        float f15 = fArr3[1];
        float f16 = fArr4[3];
        float f17 = fArr3[2];
        float f18 = f11 * fArr4[6];
        float f19 = fArr3[3];
        float f20 = fArr4[7];
        float f21 = f18 + (f19 * f20);
        float f22 = fArr4[8];
        float f23 = fArr4[6];
        return new float[]{(fArr3[0] * fArr4[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (fArr3[2] * f6) + (fArr4[1] * f9) + (f4 * f10), f13 + (f3 * f14), (f15 * f16) + (f7 * f12) + (f8 * f14), (f16 * f17) + (f9 * fArr4[4]) + (f14 * f10), f21 + (f3 * f22), (f15 * f23) + (fArr3[4] * f20) + (f8 * f22), (f17 * f23) + (fArr3[5] * fArr4[7]) + (f10 * f22)};
    }

    /* renamed from: l */
    public static final float[] m15161l(float[] fArr, float[] fArr2) {
        vx2.m53591g(fArr, "lhs");
        vx2.m53591g(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    /* renamed from: m */
    public static final float[] m15162m(float[] fArr, float[] fArr2) {
        vx2.m53591g(fArr, "lhs");
        vx2.m53591g(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    /* renamed from: n */
    public static final double m15163n(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d >= d5 * d4) {
            return (Math.pow(d, 1.0d / d6) - d3) / d2;
        }
        return d / d4;
    }

    /* renamed from: o */
    public static final double m15164o(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (d >= d5 * d4) {
            return (Math.pow(d - d6, 1.0d / d8) - d3) / d2;
        }
        return (d - d7) / d4;
    }

    /* renamed from: p */
    public static final double m15165p(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d >= d5) {
            return Math.pow((d2 * d) + d3, d6);
        }
        return d * d4;
    }

    /* renamed from: q */
    public static final double m15166q(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (d >= d5) {
            return Math.pow((d2 * d) + d3, d8) + d6;
        }
        return (d4 * d) + d7;
    }
}
