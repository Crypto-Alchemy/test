package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0004\b@\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0014\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u0012\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0001\t\u0001\u00020\bø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo44877d2 = {"Lo42;", "", "", "e", "(S)F", "value", "a", "(F)S", "", "halfValue", "d", "(S)S", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: o42 */
/* compiled from: Float16.kt */
public final class o42 implements Comparable<o42> {

    /* renamed from: A */
    public static final short f15789A = m23656d(31744);

    /* renamed from: B */
    public static final short f15790B = m23656d(0);

    /* renamed from: C */
    public static final short f15791C = m23655a(1.0f);

    /* renamed from: H */
    public static final short f15792H = m23655a(-1.0f);

    /* renamed from: I */
    public static final float f15793I = Float.intBitsToFloat(1056964608);

    /* renamed from: a */
    public static final C2938a f15794a = new C2938a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final short f15795d = m23656d(5120);

    /* renamed from: e */
    public static final short f15796e = m23656d(-1025);

    /* renamed from: g */
    public static final short f15797g = m23656d(31743);

    /* renamed from: k */
    public static final short f15798k = m23656d(1024);

    /* renamed from: r */
    public static final short f15799r = m23656d(1);

    /* renamed from: s */
    public static final short f15800s = m23656d(32256);

    /* renamed from: x */
    public static final short f15801x = m23656d(-1024);

    /* renamed from: y */
    public static final short f15802y = m23656d(Short.MIN_VALUE);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u001d\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\b\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, mo44877d2 = {"Lo42$a;", "", "", "f", "", "b", "", "FP16_COMBINED", "I", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "F", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "MaxExponent", "MinExponent", "Lo42;", "NegativeOne", "S", "One", "Size", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: o42$a */
    /* compiled from: Float16.kt */
    public static final class C2938a {
        public C2938a() {
        }

        public /* synthetic */ C2938a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final short mo23897b(float f) {
            int i;
            int i2;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = floatToRawIntBits >>> 31;
            int i4 = (floatToRawIntBits >>> 23) & 255;
            int i5 = floatToRawIntBits & 8388607;
            int i6 = 0;
            if (i4 == 255) {
                if (i5 != 0) {
                    i6 = 512;
                }
                i = i6;
                i6 = 31;
                i2 = i | (i3 << 15) | (i6 << 10);
            } else {
                int i7 = (i4 - 127) + 15;
                if (i7 >= 31) {
                    i6 = 49;
                    i = 0;
                } else if (i7 > 0) {
                    int i8 = i5 >> 13;
                    if ((i5 & 4096) != 0) {
                        i2 = (((i7 << 10) | i8) + 1) | (i3 << 15);
                    } else {
                        i = i8;
                        i6 = i7;
                    }
                } else if (i7 >= -10) {
                    int i9 = (i5 | 8388608) >> (1 - i7);
                    if ((i9 & 4096) != 0) {
                        i9 += 8192;
                    }
                    i = i9 >> 13;
                } else {
                    i = 0;
                }
                i2 = i | (i3 << 15) | (i6 << 10);
            }
            return (short) i2;
        }
    }

    static {
        q42 q42 = q42.f32916a;
    }

    /* renamed from: a */
    public static short m23655a(float f) {
        return m23656d(f15794a.mo23897b(f));
    }

    /* renamed from: d */
    public static short m23656d(short s) {
        return s;
    }

    /* renamed from: e */
    public static final float m23657e(short s) {
        int i;
        int i2;
        short s2 = s & 65535;
        short s3 = 32768 & s2;
        int i3 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        int i4 = 0;
        if (i3 != 0) {
            int i5 = s4 << 13;
            if (i3 == 31) {
                i2 = 255;
                if (i5 != 0) {
                    i5 |= 4194304;
                }
            } else {
                i2 = (i3 - 15) + 127;
            }
            int i6 = i5;
            i4 = i2;
            i = i6;
        } else if (s4 != 0) {
            q42 q42 = q42.f32916a;
            float intBitsToFloat = Float.intBitsToFloat(s4 + 1056964608) - f15793I;
            if (s3 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i = 0;
        }
        int i7 = i | (s3 << 16) | (i4 << 23);
        q42 q422 = q42.f32916a;
        return Float.intBitsToFloat(i7);
    }
}
