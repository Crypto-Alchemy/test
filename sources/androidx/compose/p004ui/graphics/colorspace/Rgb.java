package androidx.compose.p004ui.graphics.colorspace;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\nBu\b\u0000\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0*\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0*\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010<\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>B1\b\u0010\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010?\u001a\u00020\u001a\u0012\u0006\u0010<\u001a\u00020\u0002¢\u0006\u0004\b=\u0010@BA\b\u0010\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010A\u001a\u00020+\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010<\u001a\u00020\u0002¢\u0006\u0004\b=\u0010BB!\b\u0010\u0012\u0006\u0010C\u001a\u00020\u0000\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b=\u0010DJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010)\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0*8\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u00103\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0*8\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b1\u0010/R#\u00105\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b,\u0010/R\u001a\u00107\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b\u001b\u00108¨\u0006E"}, mo44877d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Lcl0;", "", "component", "", "e", "d", "", "v", "i", "a", "", "other", "", "equals", "hashCode", "Ltk7;", "Ltk7;", "r", "()Ltk7;", "whitePoint", "f", "F", "min", "g", "max", "Lfw6;", "h", "Lfw6;", "getTransferParameters", "()Lfw6;", "transferParameters", "[F", "getPrimaries$ui_graphics_release", "()[F", "primaries", "j", "q", "transform", "k", "n", "inverseTransform", "Lkotlin/Function1;", "", "l", "Lrc2;", "p", "()Lrc2;", "oetfOrig", "m", "o", "oetf", "eotfOrig", "eotf", "Z", "isWideGamut", "()Z", "isSrgb", "", "name", "id", "<init>", "(Ljava/lang/String;[FLtk7;[FLrc2;Lrc2;FFLfw6;I)V", "function", "(Ljava/lang/String;[FLtk7;Lfw6;I)V", "gamma", "(Ljava/lang/String;[FLtk7;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLtk7;)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb */
/* compiled from: Rgb.kt */
public final class Rgb extends cl0 {

    /* renamed from: r */
    public static final C0370a f1687r = new C0370a((DefaultConstructorMarker) null);

    /* renamed from: s */
    public static final rc2<Double, Double> f1688s = Rgb$Companion$DoubleIdentity$1.INSTANCE;

    /* renamed from: e */
    public final tk7 f1689e;

    /* renamed from: f */
    public final float f1690f;

    /* renamed from: g */
    public final float f1691g;

    /* renamed from: h */
    public final fw6 f1692h;

    /* renamed from: i */
    public final float[] f1693i;

    /* renamed from: j */
    public final float[] f1694j;

    /* renamed from: k */
    public final float[] f1695k;

    /* renamed from: l */
    public final rc2<Double, Double> f1696l;

    /* renamed from: m */
    public final rc2<Double, Double> f1697m;

    /* renamed from: n */
    public final rc2<Double, Double> f1698n;

    /* renamed from: o */
    public final rc2<Double, Double> f1699o;

    /* renamed from: p */
    public final boolean f1700p;

    /* renamed from: q */
    public final boolean f1701q;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$JX\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J8\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, mo44877d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$a;", "", "", "primaries", "Ltk7;", "whitePoint", "Lkotlin/Function1;", "", "OETF", "EOTF", "", "min", "max", "", "id", "", "j", "point", "a", "b", "f", "k", "e", "ax", "ay", "bx", "by", "i", "p1", "p2", "h", "l", "g", "DoubleIdentity", "Lrc2;", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$a */
    /* compiled from: Rgb.kt */
    public static final class C0370a {
        public C0370a() {
        }

        public /* synthetic */ C0370a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public final float mo3304e(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < Utils.FLOAT_EPSILON) {
                return -f7;
            }
            return f7;
        }

        /* renamed from: f */
        public final boolean mo3305f(double d, rc2<? super Double, Double> rc2, rc2<? super Double, Double> rc22) {
            if (Math.abs(rc2.invoke(Double.valueOf(d)).doubleValue() - rc22.invoke(Double.valueOf(d)).doubleValue()) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final float[] mo3306g(float[] fArr, tk7 tk7) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float a = tk7.mo26499a();
            float b = tk7.mo26500b();
            float f7 = (float) 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (a / b) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - a) / b) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }

        /* renamed from: h */
        public final boolean mo3307h(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (mo3308i(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < Utils.FLOAT_EPSILON || mo3308i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < Utils.FLOAT_EPSILON || mo3308i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < Utils.FLOAT_EPSILON || mo3308i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < Utils.FLOAT_EPSILON || mo3308i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < Utils.FLOAT_EPSILON || mo3308i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < Utils.FLOAT_EPSILON) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public final float mo3308i(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: j */
        public final boolean mo3309j(float[] fArr, tk7 tk7, rc2<? super Double, Double> rc2, rc2<? super Double, Double> rc22, float f, float f2, int i) {
            boolean z;
            boolean z2;
            if (i == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.f1663a;
            if (!dl0.m15156g(fArr, colorSpaces.mo3280d()) || !dl0.m15155f(tk7, jq2.f13799a.mo22046e())) {
                return false;
            }
            if (f == Utils.FLOAT_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (f2 == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            Rgb c = colorSpaces.mo3279c();
            for (double d = Utils.DOUBLE_EPSILON; d <= 1.0d; d += 0.00392156862745098d) {
                if (!mo3305f(d, rc2, c.mo3295p()) || !mo3305f(d, rc22, c.mo3292m())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: k */
        public final boolean mo3310k(float[] fArr, float f, float f2) {
            float e = mo3304e(fArr);
            ColorSpaces colorSpaces = ColorSpaces.f1663a;
            if ((e / mo3304e(colorSpaces.mo3278b()) <= 0.9f || !mo3307h(fArr, colorSpaces.mo3280d())) && (f >= Utils.FLOAT_EPSILON || f2 <= 1.0f)) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        public final float[] mo3311l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                C6706xq.m54497k(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r16, float[] r17, p000.tk7 r18, float[] r19, p000.rc2<? super java.lang.Double, java.lang.Double> r20, p000.rc2<? super java.lang.Double, java.lang.Double> r21, float r22, float r23, p000.fw6 r24, int r25) {
        /*
            r15 = this;
            r6 = r15
            r7 = r17
            r9 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            java.lang.String r0 = "name"
            r1 = r16
            p000.vx2.m53591g(r1, r0)
            java.lang.String r0 = "primaries"
            p000.vx2.m53591g(r7, r0)
            java.lang.String r0 = "whitePoint"
            p000.vx2.m53591g(r9, r0)
            java.lang.String r0 = "oetf"
            p000.vx2.m53591g(r10, r0)
            java.lang.String r0 = "eotf"
            p000.vx2.m53591g(r11, r0)
            al0$a r0 = p000.al0.f181a
            long r2 = r0.mo358b()
            r5 = 0
            r0 = r15
            r4 = r25
            r0.<init>(r1, r2, r4, r5)
            r6.f1689e = r9
            r6.f1690f = r12
            r6.f1691g = r13
            r0 = r24
            r6.f1692h = r0
            r6.f1696l = r10
            androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            r0.<init>(r15)
            r6.f1697m = r0
            r6.f1698n = r11
            androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            r0.<init>(r15)
            r6.f1699o = r0
            int r0 = r7.length
            r1 = 9
            r2 = 6
            if (r0 == r2) goto L_0x0065
            int r0 = r7.length
            if (r0 != r1) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r0.<init>(r1)
            throw r0
        L_0x0065:
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ba
            androidx.compose.ui.graphics.colorspace.Rgb$a r0 = f1687r
            float[] r2 = r0.mo3311l(r7)
            r6.f1693i = r2
            if (r8 != 0) goto L_0x007a
            float[] r1 = r0.mo3306g(r2, r9)
            r6.f1694j = r1
            goto L_0x007f
        L_0x007a:
            int r3 = r8.length
            if (r3 != r1) goto L_0x00a2
            r6.f1694j = r8
        L_0x007f:
            float[] r1 = r6.f1694j
            float[] r1 = p000.dl0.m15159j(r1)
            r6.f1695k = r1
            boolean r1 = r0.mo3310k(r2, r12, r13)
            r6.f1700p = r1
            r7 = r0
            r8 = r2
            r9 = r18
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r25
            boolean r0 = r7.mo3309j(r8, r9, r10, r11, r12, r13, r14)
            r6.f1701q = r0
            return
        L_0x00a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Transform must have 9 entries! Has "
            r1.append(r2)
            int r2 = r8.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid range: min="
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ", max="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "; min must be strictly < max"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], tk7, float[], rc2, rc2, float, float, fw6, int):void");
    }

    /* renamed from: a */
    public float[] mo3284a(float[] fArr) {
        vx2.m53591g(fArr, "v");
        dl0.m15162m(this.f1695k, fArr);
        fArr[0] = (float) this.f1697m.invoke(Double.valueOf((double) fArr[0])).doubleValue();
        fArr[1] = (float) this.f1697m.invoke(Double.valueOf((double) fArr[1])).doubleValue();
        fArr[2] = (float) this.f1697m.invoke(Double.valueOf((double) fArr[2])).doubleValue();
        return fArr;
    }

    /* renamed from: d */
    public float mo3285d(int i) {
        return this.f1691g;
    }

    /* renamed from: e */
    public float mo3286e(int i) {
        return this.f1690f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vx2.m53586b(ua5.m52727b(Rgb.class), ua5.m52727b(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f1690f, this.f1690f) != 0 || Float.compare(rgb.f1691g, this.f1691g) != 0 || !vx2.m53586b(this.f1689e, rgb.f1689e) || !Arrays.equals(this.f1693i, rgb.f1693i)) {
            return false;
        }
        fw6 fw6 = this.f1692h;
        if (fw6 != null) {
            return vx2.m53586b(fw6, rgb.f1692h);
        }
        if (rgb.f1692h == null) {
            return true;
        }
        if (!vx2.m53586b(this.f1696l, rgb.f1696l)) {
            return false;
        }
        return vx2.m53586b(this.f1698n, rgb.f1698n);
    }

    /* renamed from: h */
    public boolean mo3288h() {
        return this.f1701q;
    }

    public int hashCode() {
        boolean z;
        int i;
        int i2;
        int hashCode = ((((super.hashCode() * 31) + this.f1689e.hashCode()) * 31) + Arrays.hashCode(this.f1693i)) * 31;
        float f = this.f1690f;
        boolean z2 = true;
        int i3 = 0;
        if (f == Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        float f2 = this.f1691g;
        if (f2 != Utils.FLOAT_EPSILON) {
            z2 = false;
        }
        if (!z2) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        fw6 fw6 = this.f1692h;
        if (fw6 != null) {
            i3 = fw6.hashCode();
        }
        int i6 = i5 + i3;
        if (this.f1692h == null) {
            return (((i6 * 31) + this.f1696l.hashCode()) * 31) + this.f1698n.hashCode();
        }
        return i6;
    }

    /* renamed from: i */
    public float[] mo3290i(float[] fArr) {
        vx2.m53591g(fArr, "v");
        fArr[0] = (float) this.f1699o.invoke(Double.valueOf((double) fArr[0])).doubleValue();
        fArr[1] = (float) this.f1699o.invoke(Double.valueOf((double) fArr[1])).doubleValue();
        fArr[2] = (float) this.f1699o.invoke(Double.valueOf((double) fArr[2])).doubleValue();
        return dl0.m15162m(this.f1694j, fArr);
    }

    /* renamed from: l */
    public final rc2<Double, Double> mo3291l() {
        return this.f1699o;
    }

    /* renamed from: m */
    public final rc2<Double, Double> mo3292m() {
        return this.f1698n;
    }

    /* renamed from: n */
    public final float[] mo3293n() {
        return this.f1695k;
    }

    /* renamed from: o */
    public final rc2<Double, Double> mo3294o() {
        return this.f1697m;
    }

    /* renamed from: p */
    public final rc2<Double, Double> mo3295p() {
        return this.f1696l;
    }

    /* renamed from: q */
    public final float[] mo3296q() {
        return this.f1694j;
    }

    /* renamed from: r */
    public final tk7 mo3297r() {
        return this.f1689e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r13, float[] r14, p000.tk7 r15, p000.fw6 r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            p000.vx2.m53591g(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            p000.vx2.m53591g(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            p000.vx2.m53591g(r15, r0)
            java.lang.String r0 = "function"
            p000.vx2.m53591g(r9, r0)
            double r4 = r16.mo20249e()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0027
            r0 = r4
            goto L_0x0028
        L_0x0027:
            r0 = r5
        L_0x0028:
            if (r0 == 0) goto L_0x003d
            double r10 = r16.mo20251f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r0 = r4
            goto L_0x0035
        L_0x0034:
            r0 = r5
        L_0x0035:
            if (r0 == 0) goto L_0x003d
            androidx.compose.ui.graphics.colorspace.Rgb$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$1
            r0.<init>(r9)
            goto L_0x0042
        L_0x003d:
            androidx.compose.ui.graphics.colorspace.Rgb$2 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$2
            r0.<init>(r9)
        L_0x0042:
            r8 = r0
            double r10 = r16.mo20249e()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            r0 = r4
            goto L_0x004e
        L_0x004d:
            r0 = r5
        L_0x004e:
            if (r0 == 0) goto L_0x0062
            double r10 = r16.mo20251f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r4 = r5
        L_0x005a:
            if (r4 == 0) goto L_0x0062
            androidx.compose.ui.graphics.colorspace.Rgb$3 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$3
            r0.<init>(r9)
            goto L_0x0067
        L_0x0062:
            androidx.compose.ui.graphics.colorspace.Rgb$4 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$4
            r0.<init>(r9)
        L_0x0067:
            r6 = r0
            r7 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r8
            r8 = r10
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], tk7, fw6, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r23, float[] r24, p000.tk7 r25, double r26, float r28, float r29, int r30) {
        /*
            r22 = this;
            r1 = r26
            java.lang.String r0 = "name"
            r15 = r23
            p000.vx2.m53591g(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r24
            p000.vx2.m53591g(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r25
            p000.vx2.m53591g(r14, r0)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0021
            r5 = r3
            goto L_0x0022
        L_0x0021:
            r5 = r4
        L_0x0022:
            if (r5 == 0) goto L_0x0027
            rc2<java.lang.Double, java.lang.Double> r5 = f1688s
            goto L_0x002c
        L_0x0027:
            androidx.compose.ui.graphics.colorspace.Rgb$5 r5 = new androidx.compose.ui.graphics.colorspace.Rgb$5
            r5.<init>(r1)
        L_0x002c:
            r17 = r5
            if (r0 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r3 = r4
        L_0x0032:
            if (r3 == 0) goto L_0x0037
            rc2<java.lang.Double, java.lang.Double> r0 = f1688s
            goto L_0x003c
        L_0x0037:
            androidx.compose.ui.graphics.colorspace.Rgb$6 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$6
            r0.<init>(r1)
        L_0x003c:
            r18 = r0
            fw6 r19 = new fw6
            r0 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r20 = 0
            r13 = r20
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r26
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r5 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r17
            r7 = r18
            r8 = r28
            r9 = r29
            r10 = r19
            r11 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], tk7, double, float, float, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb rgb, float[] fArr, tk7 tk7) {
        this(rgb.mo12101g(), rgb.f1693i, tk7, fArr, rgb.f1696l, rgb.f1698n, rgb.f1690f, rgb.f1691g, rgb.f1692h, -1);
        vx2.m53591g(rgb, "colorSpace");
        vx2.m53591g(fArr, "transform");
        vx2.m53591g(tk7, "whitePoint");
    }
}
