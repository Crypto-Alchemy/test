package p000;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: w56 */
/* compiled from: Sonic */
public final class w56 {

    /* renamed from: a */
    public final int f18997a;

    /* renamed from: b */
    public final int f18998b;

    /* renamed from: c */
    public final float f18999c;

    /* renamed from: d */
    public final float f19000d;

    /* renamed from: e */
    public final float f19001e;

    /* renamed from: f */
    public final int f19002f;

    /* renamed from: g */
    public final int f19003g;

    /* renamed from: h */
    public final int f19004h;

    /* renamed from: i */
    public final short[] f19005i;

    /* renamed from: j */
    public short[] f19006j;

    /* renamed from: k */
    public int f19007k;

    /* renamed from: l */
    public short[] f19008l;

    /* renamed from: m */
    public int f19009m;

    /* renamed from: n */
    public short[] f19010n;

    /* renamed from: o */
    public int f19011o;

    /* renamed from: p */
    public int f19012p;

    /* renamed from: q */
    public int f19013q;

    /* renamed from: r */
    public int f19014r;

    /* renamed from: s */
    public int f19015s;

    /* renamed from: t */
    public int f19016t;

    /* renamed from: u */
    public int f19017u;

    /* renamed from: v */
    public int f19018v;

    public w56(int i, int i2, float f, float f2, int i3) {
        this.f18997a = i;
        this.f18998b = i2;
        this.f18999c = f;
        this.f19000d = f2;
        this.f19001e = ((float) i) / ((float) i3);
        this.f19002f = i / 400;
        int i4 = i / 65;
        this.f19003g = i4;
        int i5 = i4 * 2;
        this.f19004h = i5;
        this.f19005i = new short[i5];
        this.f19006j = new short[(i5 * i2)];
        this.f19008l = new short[(i5 * i2)];
        this.f19010n = new short[(i5 * i2)];
    }

    /* renamed from: p */
    public static void m29263p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo27432a(float f, int i) {
        int i2;
        int i3;
        if (this.f19009m != i) {
            int i4 = this.f18997a;
            int i5 = (int) (((float) i4) / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            mo27446o(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f19011o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f19012p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f19013q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f19008l = mo27437f(this.f19008l, this.f19009m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f18998b;
                            if (i9 >= i10) {
                                break;
                            }
                            this.f19008l[(this.f19009m * i10) + i9] = mo27445n(this.f19010n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                        this.f19013q++;
                        this.f19009m++;
                    }
                    int i11 = i2 + 1;
                    this.f19012p = i11;
                    if (i11 == i4) {
                        this.f19012p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C2725kr.m20987g(z);
                        this.f19013q = 0;
                    }
                    i6++;
                } else {
                    mo27451u(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo27433b(float f) {
        int m;
        int i = this.f19007k;
        if (i >= this.f19004h) {
            int i2 = 0;
            do {
                if (this.f19014r > 0) {
                    m = mo27434c(i2);
                } else {
                    int g = mo27438g(this.f19006j, i2);
                    if (((double) f) > 1.0d) {
                        m = g + mo27453w(this.f19006j, i2, f, g);
                    } else {
                        m = mo27444m(this.f19006j, i2, f, g);
                    }
                }
                i2 += m;
            } while (this.f19004h + i2 <= i);
            mo27452v(i2);
        }
    }

    /* renamed from: c */
    public final int mo27434c(int i) {
        int min = Math.min(this.f19004h, this.f19014r);
        mo27435d(this.f19006j, i, min);
        this.f19014r -= min;
        return min;
    }

    /* renamed from: d */
    public final void mo27435d(short[] sArr, int i, int i2) {
        short[] f = mo27437f(this.f19008l, this.f19009m, i2);
        this.f19008l = f;
        int i3 = this.f18998b;
        System.arraycopy(sArr, i * i3, f, this.f19009m * i3, i3 * i2);
        this.f19009m += i2;
    }

    /* renamed from: e */
    public final void mo27436e(short[] sArr, int i, int i2) {
        int i3 = this.f19004h / i2;
        int i4 = this.f18998b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f19005i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    public final short[] mo27437f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f18998b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    public final int mo27438g(short[] sArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.f18997a;
        if (i5 > 4000) {
            i2 = i5 / 4000;
        } else {
            i2 = 1;
        }
        if (this.f18998b == 1 && i2 == 1) {
            i3 = mo27439h(sArr, i, this.f19002f, this.f19003g);
        } else {
            mo27436e(sArr, i, i2);
            int h = mo27439h(this.f19005i, 0, this.f19002f / i2, this.f19003g / i2);
            if (i2 != 1) {
                int i6 = h * i2;
                int i7 = i2 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f19002f;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.f19003g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.f18998b == 1) {
                    i3 = mo27439h(sArr, i, i8, i9);
                } else {
                    mo27436e(sArr, i, 1);
                    i3 = mo27439h(this.f19005i, 0, i8, i9);
                }
            } else {
                i3 = h;
            }
        }
        if (mo27447q(this.f19017u, this.f19018v)) {
            i4 = this.f19015s;
        } else {
            i4 = i3;
        }
        this.f19016t = this.f19017u;
        this.f19015s = i3;
        return i4;
    }

    /* renamed from: h */
    public final int mo27439h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f18998b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f19017u = i5 / i7;
        this.f19018v = i8 / i6;
        return i7;
    }

    /* renamed from: i */
    public void mo27440i() {
        this.f19007k = 0;
        this.f19009m = 0;
        this.f19011o = 0;
        this.f19012p = 0;
        this.f19013q = 0;
        this.f19014r = 0;
        this.f19015s = 0;
        this.f19016t = 0;
        this.f19017u = 0;
        this.f19018v = 0;
    }

    /* renamed from: j */
    public void mo27441j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f18998b, this.f19009m);
        shortBuffer.put(this.f19008l, 0, this.f18998b * min);
        int i = this.f19009m - min;
        this.f19009m = i;
        short[] sArr = this.f19008l;
        int i2 = this.f18998b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: k */
    public int mo27442k() {
        return this.f19009m * this.f18998b * 2;
    }

    /* renamed from: l */
    public int mo27443l() {
        return this.f19007k * this.f18998b * 2;
    }

    /* renamed from: m */
    public final int mo27444m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f19014r = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] f2 = mo27437f(this.f19008l, this.f19009m, i4);
        this.f19008l = f2;
        int i5 = this.f18998b;
        System.arraycopy(sArr, i * i5, f2, this.f19009m * i5, i5 * i2);
        m29263p(i3, this.f18998b, this.f19008l, this.f19009m + i2, sArr, i + i2, sArr, i);
        this.f19009m += i4;
        return i3;
    }

    /* renamed from: n */
    public final short mo27445n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f18998b];
        int i4 = this.f19013q * i2;
        int i5 = this.f19012p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: o */
    public final void mo27446o(int i) {
        int i2 = this.f19009m - i;
        short[] f = mo27437f(this.f19010n, this.f19011o, i2);
        this.f19010n = f;
        short[] sArr = this.f19008l;
        int i3 = this.f18998b;
        System.arraycopy(sArr, i * i3, f, this.f19011o * i3, i3 * i2);
        this.f19009m = i;
        this.f19011o += i2;
    }

    /* renamed from: q */
    public final boolean mo27447q(int i, int i2) {
        if (i == 0 || this.f19015s == 0 || i2 > i * 3 || i * 2 <= this.f19016t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final void mo27448r() {
        int i = this.f19009m;
        float f = this.f18999c;
        float f2 = this.f19000d;
        float f3 = f / f2;
        float f4 = this.f19001e * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            mo27433b(f3);
        } else {
            mo27435d(this.f19006j, 0, this.f19007k);
            this.f19007k = 0;
        }
        if (f4 != 1.0f) {
            mo27432a(f4, i);
        }
    }

    /* renamed from: s */
    public void mo27449s() {
        int i;
        int i2 = this.f19007k;
        float f = this.f18999c;
        float f2 = this.f19000d;
        int i3 = this.f19009m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f19011o)) / (this.f19001e * f2)) + 0.5f));
        this.f19006j = mo27437f(this.f19006j, i2, (this.f19004h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f19004h;
            int i5 = this.f18998b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f19006j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f19007k += i * 2;
        mo27448r();
        if (this.f19009m > i3) {
            this.f19009m = i3;
        }
        this.f19007k = 0;
        this.f19014r = 0;
        this.f19011o = 0;
    }

    /* renamed from: t */
    public void mo27450t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f18998b;
        int i2 = remaining / i;
        short[] f = mo27437f(this.f19006j, this.f19007k, i2);
        this.f19006j = f;
        shortBuffer.get(f, this.f19007k * this.f18998b, ((i * i2) * 2) / 2);
        this.f19007k += i2;
        mo27448r();
    }

    /* renamed from: u */
    public final void mo27451u(int i) {
        if (i != 0) {
            short[] sArr = this.f19010n;
            int i2 = this.f18998b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f19011o - i) * i2);
            this.f19011o -= i;
        }
    }

    /* renamed from: v */
    public final void mo27452v(int i) {
        int i2 = this.f19007k - i;
        short[] sArr = this.f19006j;
        int i3 = this.f18998b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f19007k = i2;
    }

    /* renamed from: w */
    public final int mo27453w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f19014r = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] f2 = mo27437f(this.f19008l, this.f19009m, i3);
        this.f19008l = f2;
        m29263p(i3, this.f18998b, f2, this.f19009m, sArr, i, sArr, i + i2);
        this.f19009m += i3;
        return i3;
    }
}
