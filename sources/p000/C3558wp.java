package p000;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: wp */
/* compiled from: ArcCurveFit */
public class C3558wp extends ux0 {

    /* renamed from: a */
    public final double[] f19193a;

    /* renamed from: b */
    public C3559a[] f19194b;

    /* renamed from: c */
    public boolean f19195c = true;

    /* renamed from: wp$a */
    /* compiled from: ArcCurveFit */
    public static class C3559a {

        /* renamed from: s */
        public static double[] f19196s = new double[91];

        /* renamed from: a */
        public double[] f19197a;

        /* renamed from: b */
        public double f19198b;

        /* renamed from: c */
        public double f19199c;

        /* renamed from: d */
        public double f19200d;

        /* renamed from: e */
        public double f19201e;

        /* renamed from: f */
        public double f19202f;

        /* renamed from: g */
        public double f19203g;

        /* renamed from: h */
        public double f19204h;

        /* renamed from: i */
        public double f19205i;

        /* renamed from: j */
        public double f19206j;

        /* renamed from: k */
        public double f19207k;

        /* renamed from: l */
        public double f19208l;

        /* renamed from: m */
        public double f19209m;

        /* renamed from: n */
        public double f19210n;

        /* renamed from: o */
        public double f19211o;

        /* renamed from: p */
        public double f19212p;

        /* renamed from: q */
        public boolean f19213q;

        /* renamed from: r */
        public boolean f19214r = false;

        public C3559a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            int i3 = i;
            double d9 = d;
            double d10 = d2;
            double d11 = d3;
            double d12 = d4;
            double d13 = d5;
            double d14 = d6;
            boolean z = false;
            int i4 = 1;
            this.f19213q = i3 == 1 ? true : z;
            this.f19199c = d9;
            this.f19200d = d10;
            this.f19205i = 1.0d / (d10 - d9);
            if (3 == i3) {
                this.f19214r = true;
            }
            double d15 = d13 - d11;
            double d16 = d14 - d12;
            if (this.f19214r || Math.abs(d15) < 0.001d || Math.abs(d16) < 0.001d) {
                this.f19214r = true;
                this.f19201e = d11;
                this.f19202f = d13;
                this.f19203g = d12;
                this.f19204h = d6;
                double hypot = Math.hypot(d16, d15);
                this.f19198b = hypot;
                this.f19210n = hypot * this.f19205i;
                double d17 = this.f19200d;
                double d18 = this.f19199c;
                this.f19208l = d15 / (d17 - d18);
                this.f19209m = d16 / (d17 - d18);
                return;
            }
            this.f19197a = new double[101];
            boolean z2 = this.f19213q;
            if (z2) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            this.f19206j = d15 * ((double) i2);
            this.f19207k = d16 * ((double) (!z2 ? -1 : i4));
            if (z2) {
                d7 = d13;
            } else {
                d7 = d11;
            }
            this.f19208l = d7;
            if (z2) {
                d8 = d12;
            } else {
                d8 = d6;
            }
            this.f19209m = d8;
            mo27580a(d3, d4, d5, d6);
            this.f19210n = this.f19198b * this.f19205i;
        }

        /* renamed from: a */
        public final void mo27580a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = Utils.DOUBLE_EPSILON;
            double d9 = Utils.DOUBLE_EPSILON;
            double d10 = Utils.DOUBLE_EPSILON;
            while (true) {
                double[] dArr = f19196s;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f19196s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                double d12 = sin;
                d8 = d5;
                d9 = d12;
            }
            double d13 = d8;
            this.f19198b = d13;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f19196s;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d13;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f19197a;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f19196s, length);
                    if (binarySearch >= 0) {
                        this.f19197a[i3] = ((double) binarySearch) / ((double) (f19196s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f19197a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f19196s;
                        double d14 = dArr4[i5];
                        this.f19197a[i3] = (((double) i5) + ((length - d14) / (dArr4[i4 - 1] - d14))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public double mo27581b() {
            double d = this.f19206j * this.f19212p;
            double hypot = this.f19210n / Math.hypot(d, (-this.f19207k) * this.f19211o);
            if (this.f19213q) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: c */
        public double mo27582c() {
            double d = this.f19206j * this.f19212p;
            double d2 = (-this.f19207k) * this.f19211o;
            double hypot = this.f19210n / Math.hypot(d, d2);
            if (this.f19213q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        /* renamed from: d */
        public double mo27583d(double d) {
            return this.f19208l;
        }

        /* renamed from: e */
        public double mo27584e(double d) {
            return this.f19209m;
        }

        /* renamed from: f */
        public double mo27585f(double d) {
            double d2 = (d - this.f19199c) * this.f19205i;
            double d3 = this.f19201e;
            return d3 + (d2 * (this.f19202f - d3));
        }

        /* renamed from: g */
        public double mo27586g(double d) {
            double d2 = (d - this.f19199c) * this.f19205i;
            double d3 = this.f19203g;
            return d3 + (d2 * (this.f19204h - d3));
        }

        /* renamed from: h */
        public double mo27587h() {
            return this.f19208l + (this.f19206j * this.f19211o);
        }

        /* renamed from: i */
        public double mo27588i() {
            return this.f19209m + (this.f19207k * this.f19212p);
        }

        /* renamed from: j */
        public double mo27589j(double d) {
            if (d <= Utils.DOUBLE_EPSILON) {
                return Utils.DOUBLE_EPSILON;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f19197a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = length - ((double) i);
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* renamed from: k */
        public void mo27590k(double d) {
            double d2;
            if (this.f19213q) {
                d2 = this.f19200d - d;
            } else {
                d2 = d - this.f19199c;
            }
            double j = mo27589j(d2 * this.f19205i) * 1.5707963267948966d;
            this.f19211o = Math.sin(j);
            this.f19212p = Math.cos(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r5 == 1) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3558wp(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f19195c = r2
            r0.f19193a = r1
            int r3 = r1.length
            int r3 = r3 - r2
            wp$a[] r3 = new p000.C3558wp.C3559a[r3]
            r0.f19194b = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L_0x0016:
            wp$a[] r7 = r0.f19194b
            int r8 = r7.length
            if (r4 >= r8) goto L_0x004f
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L_0x002f
            if (r8 == r2) goto L_0x002c
            if (r8 == r10) goto L_0x002a
            if (r8 == r9) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            if (r5 != r2) goto L_0x002c
        L_0x002a:
            r5 = r10
            goto L_0x002d
        L_0x002c:
            r5 = r2
        L_0x002d:
            r6 = r5
            goto L_0x0030
        L_0x002f:
            r6 = r9
        L_0x0030:
            wp$a r22 = new wp$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0016
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3558wp.<init>(int[], double[], double[][]):void");
    }

    /* renamed from: c */
    public double mo22300c(double d, int i) {
        double g;
        double e;
        double i2;
        double c;
        double g2;
        double e2;
        int i3 = 0;
        if (this.f19195c) {
            C3559a[] aVarArr = this.f19194b;
            C3559a aVar = aVarArr[0];
            double d2 = aVar.f19199c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f19214r) {
                    if (i == 0) {
                        g2 = aVar.mo27585f(d2);
                        e2 = this.f19194b[0].mo27583d(d2);
                    } else {
                        g2 = aVar.mo27586g(d2);
                        e2 = this.f19194b[0].mo27584e(d2);
                    }
                    return g2 + (d3 * e2);
                }
                aVar.mo27590k(d2);
                if (i == 0) {
                    i2 = this.f19194b[0].mo27587h();
                    c = this.f19194b[0].mo27581b();
                } else {
                    i2 = this.f19194b[0].mo27588i();
                    c = this.f19194b[0].mo27582c();
                }
                return i2 + (d3 * c);
            } else if (d > aVarArr[aVarArr.length - 1].f19200d) {
                double d4 = aVarArr[aVarArr.length - 1].f19200d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (i == 0) {
                    g = aVarArr[length].mo27585f(d4);
                    e = this.f19194b[length].mo27583d(d4);
                } else {
                    g = aVarArr[length].mo27586g(d4);
                    e = this.f19194b[length].mo27584e(d4);
                }
                return g + (d5 * e);
            }
        } else {
            C3559a[] aVarArr2 = this.f19194b;
            double d6 = aVarArr2[0].f19199c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].f19200d) {
                d = aVarArr2[aVarArr2.length - 1].f19200d;
            }
        }
        while (true) {
            C3559a[] aVarArr3 = this.f19194b;
            if (i3 >= aVarArr3.length) {
                return Double.NaN;
            }
            C3559a aVar2 = aVarArr3[i3];
            if (d > aVar2.f19200d) {
                i3++;
            } else if (!aVar2.f19214r) {
                aVar2.mo27590k(d);
                if (i == 0) {
                    return this.f19194b[i3].mo27587h();
                }
                return this.f19194b[i3].mo27588i();
            } else if (i == 0) {
                return aVar2.mo27585f(d);
            } else {
                return aVar2.mo27586g(d);
            }
        }
    }

    /* renamed from: d */
    public void mo22301d(double d, double[] dArr) {
        if (this.f19195c) {
            C3559a[] aVarArr = this.f19194b;
            C3559a aVar = aVarArr[0];
            double d2 = aVar.f19199c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f19214r) {
                    dArr[0] = aVar.mo27585f(d2) + (this.f19194b[0].mo27583d(d2) * d3);
                    dArr[1] = this.f19194b[0].mo27586g(d2) + (d3 * this.f19194b[0].mo27584e(d2));
                    return;
                }
                aVar.mo27590k(d2);
                dArr[0] = this.f19194b[0].mo27587h() + (this.f19194b[0].mo27581b() * d3);
                dArr[1] = this.f19194b[0].mo27588i() + (d3 * this.f19194b[0].mo27582c());
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f19200d) {
                double d4 = aVarArr[aVarArr.length - 1].f19200d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                C3559a aVar2 = aVarArr[length];
                if (aVar2.f19214r) {
                    dArr[0] = aVar2.mo27585f(d4) + (this.f19194b[length].mo27583d(d4) * d5);
                    dArr[1] = this.f19194b[length].mo27586g(d4) + (d5 * this.f19194b[length].mo27584e(d4));
                    return;
                }
                aVar2.mo27590k(d);
                dArr[0] = this.f19194b[length].mo27587h() + (this.f19194b[length].mo27581b() * d5);
                dArr[1] = this.f19194b[length].mo27588i() + (d5 * this.f19194b[length].mo27582c());
                return;
            }
        } else {
            C3559a[] aVarArr2 = this.f19194b;
            double d6 = aVarArr2[0].f19199c;
            if (d < d6) {
                d = d6;
            }
            if (d > aVarArr2[aVarArr2.length - 1].f19200d) {
                d = aVarArr2[aVarArr2.length - 1].f19200d;
            }
        }
        int i = 0;
        while (true) {
            C3559a[] aVarArr3 = this.f19194b;
            if (i < aVarArr3.length) {
                C3559a aVar3 = aVarArr3[i];
                if (d > aVar3.f19200d) {
                    i++;
                } else if (aVar3.f19214r) {
                    dArr[0] = aVar3.mo27585f(d);
                    dArr[1] = this.f19194b[i].mo27586g(d);
                    return;
                } else {
                    aVar3.mo27590k(d);
                    dArr[0] = this.f19194b[i].mo27587h();
                    dArr[1] = this.f19194b[i].mo27588i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo22302e(double d, float[] fArr) {
        if (this.f19195c) {
            C3559a[] aVarArr = this.f19194b;
            C3559a aVar = aVarArr[0];
            double d2 = aVar.f19199c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.f19214r) {
                    fArr[0] = (float) (aVar.mo27585f(d2) + (this.f19194b[0].mo27583d(d2) * d3));
                    fArr[1] = (float) (this.f19194b[0].mo27586g(d2) + (d3 * this.f19194b[0].mo27584e(d2)));
                    return;
                }
                aVar.mo27590k(d2);
                fArr[0] = (float) (this.f19194b[0].mo27587h() + (this.f19194b[0].mo27581b() * d3));
                fArr[1] = (float) (this.f19194b[0].mo27588i() + (d3 * this.f19194b[0].mo27582c()));
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f19200d) {
                double d4 = aVarArr[aVarArr.length - 1].f19200d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                C3559a aVar2 = aVarArr[length];
                if (aVar2.f19214r) {
                    fArr[0] = (float) (aVar2.mo27585f(d4) + (this.f19194b[length].mo27583d(d4) * d5));
                    fArr[1] = (float) (this.f19194b[length].mo27586g(d4) + (d5 * this.f19194b[length].mo27584e(d4)));
                    return;
                }
                aVar2.mo27590k(d);
                fArr[0] = (float) this.f19194b[length].mo27587h();
                fArr[1] = (float) this.f19194b[length].mo27588i();
                return;
            }
        } else {
            C3559a[] aVarArr2 = this.f19194b;
            double d6 = aVarArr2[0].f19199c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].f19200d) {
                d = aVarArr2[aVarArr2.length - 1].f19200d;
            }
        }
        int i = 0;
        while (true) {
            C3559a[] aVarArr3 = this.f19194b;
            if (i < aVarArr3.length) {
                C3559a aVar3 = aVarArr3[i];
                if (d > aVar3.f19200d) {
                    i++;
                } else if (aVar3.f19214r) {
                    fArr[0] = (float) aVar3.mo27585f(d);
                    fArr[1] = (float) this.f19194b[i].mo27586g(d);
                    return;
                } else {
                    aVar3.mo27590k(d);
                    fArr[0] = (float) this.f19194b[i].mo27587h();
                    fArr[1] = (float) this.f19194b[i].mo27588i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public double mo22303f(double d, int i) {
        C3559a[] aVarArr = this.f19194b;
        int i2 = 0;
        double d2 = aVarArr[0].f19199c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].f19200d) {
            d = aVarArr[aVarArr.length - 1].f19200d;
        }
        while (true) {
            C3559a[] aVarArr2 = this.f19194b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            C3559a aVar = aVarArr2[i2];
            if (d > aVar.f19200d) {
                i2++;
            } else if (!aVar.f19214r) {
                aVar.mo27590k(d);
                if (i == 0) {
                    return this.f19194b[i2].mo27581b();
                }
                return this.f19194b[i2].mo27582c();
            } else if (i == 0) {
                return aVar.mo27583d(d);
            } else {
                return aVar.mo27584e(d);
            }
        }
    }

    /* renamed from: g */
    public void mo22304g(double d, double[] dArr) {
        C3559a[] aVarArr = this.f19194b;
        double d2 = aVarArr[0].f19199c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].f19200d) {
            d = aVarArr[aVarArr.length - 1].f19200d;
        }
        int i = 0;
        while (true) {
            C3559a[] aVarArr2 = this.f19194b;
            if (i < aVarArr2.length) {
                C3559a aVar = aVarArr2[i];
                if (d > aVar.f19200d) {
                    i++;
                } else if (aVar.f19214r) {
                    dArr[0] = aVar.mo27583d(d);
                    dArr[1] = this.f19194b[i].mo27584e(d);
                    return;
                } else {
                    aVar.mo27590k(d);
                    dArr[0] = this.f19194b[i].mo27581b();
                    dArr[1] = this.f19194b[i].mo27582c();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public double[] mo22305h() {
        return this.f19193a;
    }
}
