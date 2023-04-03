package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p000.ig2;

/* renamed from: d86 */
/* compiled from: StandardGifDecoder */
public class d86 implements ig2 {

    /* renamed from: u */
    public static final String f10553u = "d86";

    /* renamed from: a */
    public int[] f10554a;

    /* renamed from: b */
    public final int[] f10555b;

    /* renamed from: c */
    public final ig2.C2541a f10556c;

    /* renamed from: d */
    public ByteBuffer f10557d;

    /* renamed from: e */
    public byte[] f10558e;

    /* renamed from: f */
    public short[] f10559f;

    /* renamed from: g */
    public byte[] f10560g;

    /* renamed from: h */
    public byte[] f10561h;

    /* renamed from: i */
    public byte[] f10562i;

    /* renamed from: j */
    public int[] f10563j;

    /* renamed from: k */
    public int f10564k;

    /* renamed from: l */
    public rg2 f10565l;

    /* renamed from: m */
    public Bitmap f10566m;

    /* renamed from: n */
    public boolean f10567n;

    /* renamed from: o */
    public int f10568o;

    /* renamed from: p */
    public int f10569p;

    /* renamed from: q */
    public int f10570q;

    /* renamed from: r */
    public int f10571r;

    /* renamed from: s */
    public Boolean f10572s;

    /* renamed from: t */
    public Bitmap.Config f10573t;

    public d86(ig2.C2541a aVar, rg2 rg2, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo18589q(rg2, byteBuffer, i);
    }

    /* renamed from: a */
    public int mo18571a() {
        return this.f10565l.f17233c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo18572b() {
        /*
            r8 = this;
            monitor-enter(r8)
            rg2 r0 = r8.f10565l     // Catch:{ all -> 0x00cf }
            int r0 = r0.f17233c     // Catch:{ all -> 0x00cf }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f10564k     // Catch:{ all -> 0x00cf }
            if (r0 >= 0) goto L_0x0032
        L_0x000d:
            java.lang.String r0 = f10553u     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            rg2 r3 = r8.f10565l     // Catch:{ all -> 0x00cf }
            int r3 = r3.f17233c     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            int r3 = r8.f10564k     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
        L_0x0030:
            r8.f10568o = r2     // Catch:{ all -> 0x00cf }
        L_0x0032:
            int r0 = r8.f10568o     // Catch:{ all -> 0x00cf }
            r3 = 0
            if (r0 == r2) goto L_0x00b6
            r4 = 2
            if (r0 != r4) goto L_0x003c
            goto L_0x00b6
        L_0x003c:
            r0 = 0
            r8.f10568o = r0     // Catch:{ all -> 0x00cf }
            byte[] r5 = r8.f10558e     // Catch:{ all -> 0x00cf }
            if (r5 != 0) goto L_0x004d
            ig2$a r5 = r8.f10556c     // Catch:{ all -> 0x00cf }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo21170b(r6)     // Catch:{ all -> 0x00cf }
            r8.f10558e = r5     // Catch:{ all -> 0x00cf }
        L_0x004d:
            rg2 r5 = r8.f10565l     // Catch:{ all -> 0x00cf }
            java.util.List<og2> r5 = r5.f17235e     // Catch:{ all -> 0x00cf }
            int r6 = r8.f10564k     // Catch:{ all -> 0x00cf }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00cf }
            og2 r5 = (p000.og2) r5     // Catch:{ all -> 0x00cf }
            int r6 = r8.f10564k     // Catch:{ all -> 0x00cf }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0069
            rg2 r7 = r8.f10565l     // Catch:{ all -> 0x00cf }
            java.util.List<og2> r7 = r7.f17235e     // Catch:{ all -> 0x00cf }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00cf }
            og2 r6 = (p000.og2) r6     // Catch:{ all -> 0x00cf }
            goto L_0x006a
        L_0x0069:
            r6 = r3
        L_0x006a:
            int[] r7 = r5.f15886k     // Catch:{ all -> 0x00cf }
            if (r7 == 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            rg2 r7 = r8.f10565l     // Catch:{ all -> 0x00cf }
            int[] r7 = r7.f17231a     // Catch:{ all -> 0x00cf }
        L_0x0073:
            r8.f10554a = r7     // Catch:{ all -> 0x00cf }
            if (r7 != 0) goto L_0x0092
            java.lang.String r0 = f10553u     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f10564k     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x008e:
            r8.f10568o = r2     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r3
        L_0x0092:
            boolean r1 = r5.f15881f     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00b0
            int[] r1 = r8.f10555b     // Catch:{ all -> 0x00cf }
            int r2 = r7.length     // Catch:{ all -> 0x00cf }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00cf }
            int[] r1 = r8.f10555b     // Catch:{ all -> 0x00cf }
            r8.f10554a = r1     // Catch:{ all -> 0x00cf }
            int r2 = r5.f15883h     // Catch:{ all -> 0x00cf }
            r1[r2] = r0     // Catch:{ all -> 0x00cf }
            int r0 = r5.f15882g     // Catch:{ all -> 0x00cf }
            if (r0 != r4) goto L_0x00b0
            int r0 = r8.f10564k     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00b0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00cf }
            r8.f10572s = r0     // Catch:{ all -> 0x00cf }
        L_0x00b0:
            android.graphics.Bitmap r0 = r8.mo18590r(r5, r6)     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r0
        L_0x00b6:
            java.lang.String r0 = f10553u     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f10568o     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r8)
            return r3
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d86.mo18572b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    public void mo18573c() {
        this.f10564k = (this.f10564k + 1) % this.f10565l.f17233c;
    }

    public void clear() {
        this.f10565l = null;
        byte[] bArr = this.f10562i;
        if (bArr != null) {
            this.f10556c.mo21173e(bArr);
        }
        int[] iArr = this.f10563j;
        if (iArr != null) {
            this.f10556c.mo21174f(iArr);
        }
        Bitmap bitmap = this.f10566m;
        if (bitmap != null) {
            this.f10556c.mo21169a(bitmap);
        }
        this.f10566m = null;
        this.f10557d = null;
        this.f10572s = null;
        byte[] bArr2 = this.f10558e;
        if (bArr2 != null) {
            this.f10556c.mo21173e(bArr2);
        }
    }

    /* renamed from: d */
    public void mo18575d(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f10573t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: e */
    public int mo18576e() {
        int i;
        if (this.f10565l.f17233c <= 0 || (i = this.f10564k) < 0) {
            return 0;
        }
        return mo18585m(i);
    }

    /* renamed from: f */
    public void mo18577f() {
        this.f10564k = -1;
    }

    /* renamed from: g */
    public int mo18578g() {
        return this.f10564k;
    }

    public ByteBuffer getData() {
        return this.f10557d;
    }

    /* renamed from: h */
    public int mo18580h() {
        return this.f10557d.limit() + this.f10562i.length + (this.f10563j.length * 4);
    }

    /* renamed from: i */
    public final int mo18581i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f10569p + i; i9++) {
            byte[] bArr = this.f10562i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f10554a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f10569p + i11; i12++) {
            byte[] bArr2 = this.f10562i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f10554a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    public final void mo18582j(og2 og2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        og2 og22 = og2;
        int[] iArr = this.f10563j;
        int i6 = og22.f15879d;
        int i7 = this.f10569p;
        int i8 = i6 / i7;
        int i9 = og22.f15877b / i7;
        int i10 = og22.f15878c / i7;
        int i11 = og22.f15876a / i7;
        if (this.f10564k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = this.f10571r;
        int i13 = this.f10570q;
        byte[] bArr = this.f10562i;
        int[] iArr2 = this.f10554a;
        Boolean bool = this.f10572s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i8) {
            Boolean bool2 = bool;
            if (og22.f15880e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 == 3) {
                        i17 = i18;
                        i14 = 4;
                        i16 = 2;
                    } else if (i18 != 4) {
                        i17 = i18;
                    } else {
                        i17 = i18;
                        i16 = 1;
                        i14 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            if (i7 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * og22.f15878c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int i30 = mo18581i(i24, i28, og22.f15878c);
                        if (i30 != 0) {
                            iArr[i29] = i30;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i15++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        Boolean bool3 = bool;
        if (this.f10572s == null) {
            if (bool3 == null) {
                z2 = false;
            } else {
                z2 = bool3.booleanValue();
            }
            this.f10572s = Boolean.valueOf(z2);
        }
    }

    /* renamed from: k */
    public final void mo18583k(og2 og2) {
        boolean z;
        boolean z2;
        og2 og22 = og2;
        int[] iArr = this.f10563j;
        int i = og22.f15879d;
        int i2 = og22.f15877b;
        int i3 = og22.f15878c;
        int i4 = og22.f15876a;
        if (this.f10564k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.f10571r;
        byte[] bArr = this.f10562i;
        int[] iArr2 = this.f10554a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = og22.f15878c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                og2 og23 = og2;
                i = i13;
            }
            int i15 = i;
            i6++;
            og22 = og2;
        }
        Boolean bool = this.f10572s;
        if ((bool == null || !bool.booleanValue()) && (this.f10572s != null || !z || b == -1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f10572s = Boolean.valueOf(z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18584l(p000.og2 r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f10557d
            int r3 = r1.f15885j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            rg2 r1 = r0.f10565l
            int r2 = r1.f17236f
            int r1 = r1.f17237g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f15878c
            int r1 = r1.f15879d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f10562i
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002a
        L_0x0022:
            ig2$a r1 = r0.f10556c
            byte[] r1 = r1.mo21170b(r2)
            r0.f10562i = r1
        L_0x002a:
            byte[] r1 = r0.f10562i
            short[] r3 = r0.f10559f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0036
            short[] r3 = new short[r4]
            r0.f10559f = r3
        L_0x0036:
            short[] r3 = r0.f10559f
            byte[] r5 = r0.f10560g
            if (r5 != 0) goto L_0x0040
            byte[] r5 = new byte[r4]
            r0.f10560g = r5
        L_0x0040:
            byte[] r5 = r0.f10560g
            byte[] r6 = r0.f10561h
            if (r6 != 0) goto L_0x004c
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f10561h = r6
        L_0x004c:
            byte[] r6 = r0.f10561h
            int r7 = r28.mo18588p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x005f:
            if (r14 >= r9) goto L_0x0069
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0069:
            byte[] r14 = r0.f10558e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r24 = r15
        L_0x0082:
            if (r13 >= r2) goto L_0x014b
            if (r16 != 0) goto L_0x0093
            int r16 = r28.mo18587o()
            if (r16 > 0) goto L_0x0091
            r3 = 3
            r0.f10568o = r3
            goto L_0x014b
        L_0x0091:
            r17 = 0
        L_0x0093:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ad:
            if (r4 < r15) goto L_0x0135
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c1
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ad
        L_0x00c1:
            if (r11 != r10) goto L_0x00d8
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0082
        L_0x00d8:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ec
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ad
        L_0x00ec:
            if (r11 < r8) goto L_0x00f5
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f6
        L_0x00f5:
            r7 = r11
        L_0x00f6:
            if (r7 < r9) goto L_0x0101
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f6
        L_0x0101:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0108:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0115
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0108
        L_0x0115:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012c
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012c
            if (r8 >= r6) goto L_0x012c
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012c:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ad
        L_0x0135:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0082
        L_0x014b:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d86.mo18584l(og2):void");
    }

    /* renamed from: m */
    public int mo18585m(int i) {
        if (i >= 0) {
            rg2 rg2 = this.f10565l;
            if (i < rg2.f17233c) {
                return rg2.f17235e.get(i).f15884i;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap mo18586n() {
        Bitmap.Config config;
        Boolean bool = this.f10572s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f10573t;
        }
        Bitmap c = this.f10556c.mo21171c(this.f10571r, this.f10570q, config);
        c.setHasAlpha(true);
        return c;
    }

    /* renamed from: o */
    public final int mo18587o() {
        int p = mo18588p();
        if (p <= 0) {
            return p;
        }
        ByteBuffer byteBuffer = this.f10557d;
        byteBuffer.get(this.f10558e, 0, Math.min(p, byteBuffer.remaining()));
        return p;
    }

    /* renamed from: p */
    public final int mo18588p() {
        return this.f10557d.get() & 255;
    }

    /* renamed from: q */
    public synchronized void mo18589q(rg2 rg2, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f10568o = 0;
            this.f10565l = rg2;
            this.f10564k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f10557d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f10557d.order(ByteOrder.LITTLE_ENDIAN);
            this.f10567n = false;
            Iterator<og2> it = rg2.f17235e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f15882g == 3) {
                        this.f10567n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f10569p = highestOneBit;
            int i2 = rg2.f17236f;
            this.f10571r = i2 / highestOneBit;
            int i3 = rg2.f17237g;
            this.f10570q = i3 / highestOneBit;
            this.f10562i = this.f10556c.mo21170b(i2 * i3);
            this.f10563j = this.f10556c.mo21172d(this.f10571r * this.f10570q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    /* renamed from: r */
    public final Bitmap mo18590r(og2 og2, og2 og22) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f10563j;
        int i3 = 0;
        if (og22 == null) {
            Bitmap bitmap2 = this.f10566m;
            if (bitmap2 != null) {
                this.f10556c.mo21169a(bitmap2);
            }
            this.f10566m = null;
            Arrays.fill(iArr, 0);
        }
        if (og22 != null && og22.f15882g == 3 && this.f10566m == null) {
            Arrays.fill(iArr, 0);
        }
        if (og22 != null && (i2 = og22.f15882g) > 0) {
            if (i2 == 2) {
                if (!og2.f15881f) {
                    rg2 rg2 = this.f10565l;
                    int i4 = rg2.f17242l;
                    if (og2.f15886k == null || rg2.f17240j != og2.f15883h) {
                        i3 = i4;
                    }
                }
                int i5 = og22.f15879d;
                int i6 = this.f10569p;
                int i7 = i5 / i6;
                int i8 = og22.f15877b / i6;
                int i9 = og22.f15878c / i6;
                int i10 = og22.f15876a / i6;
                int i11 = this.f10571r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f10571r;
                }
            } else if (i2 == 3 && (bitmap = this.f10566m) != null) {
                int i16 = this.f10571r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f10570q);
            }
        }
        mo18584l(og2);
        if (og2.f15880e || this.f10569p != 1) {
            mo18582j(og2);
        } else {
            mo18583k(og2);
        }
        if (this.f10567n && ((i = og2.f15882g) == 0 || i == 1)) {
            if (this.f10566m == null) {
                this.f10566m = mo18586n();
            }
            Bitmap bitmap3 = this.f10566m;
            int i17 = this.f10571r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f10570q);
        }
        Bitmap n = mo18586n();
        int i18 = this.f10571r;
        n.setPixels(iArr, 0, i18, 0, 0, i18, this.f10570q);
        return n;
    }

    public d86(ig2.C2541a aVar) {
        this.f10555b = new int[256];
        this.f10573t = Bitmap.Config.ARGB_8888;
        this.f10556c = aVar;
        this.f10565l = new rg2();
    }
}
