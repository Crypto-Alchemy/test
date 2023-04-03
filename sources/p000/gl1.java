package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.dx0;

/* renamed from: gl1 */
/* compiled from: DvbParser */
public final class gl1 {

    /* renamed from: h */
    public static final byte[] f12417h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f12418i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f12419j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f12420a;

    /* renamed from: b */
    public final Paint f12421b;

    /* renamed from: c */
    public final Canvas f12422c = new Canvas();

    /* renamed from: d */
    public final C2395b f12423d = new C2395b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    public final C2394a f12424e = new C2394a(0, m18171c(), m18172d(), m18173e());

    /* renamed from: f */
    public final C2401h f12425f;

    /* renamed from: g */
    public Bitmap f12426g;

    /* renamed from: gl1$a */
    /* compiled from: DvbParser */
    public static final class C2394a {

        /* renamed from: a */
        public final int f12427a;

        /* renamed from: b */
        public final int[] f12428b;

        /* renamed from: c */
        public final int[] f12429c;

        /* renamed from: d */
        public final int[] f12430d;

        public C2394a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f12427a = i;
            this.f12428b = iArr;
            this.f12429c = iArr2;
            this.f12430d = iArr3;
        }
    }

    /* renamed from: gl1$b */
    /* compiled from: DvbParser */
    public static final class C2395b {

        /* renamed from: a */
        public final int f12431a;

        /* renamed from: b */
        public final int f12432b;

        /* renamed from: c */
        public final int f12433c;

        /* renamed from: d */
        public final int f12434d;

        /* renamed from: e */
        public final int f12435e;

        /* renamed from: f */
        public final int f12436f;

        public C2395b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f12431a = i;
            this.f12432b = i2;
            this.f12433c = i3;
            this.f12434d = i4;
            this.f12435e = i5;
            this.f12436f = i6;
        }
    }

    /* renamed from: gl1$c */
    /* compiled from: DvbParser */
    public static final class C2396c {

        /* renamed from: a */
        public final int f12437a;

        /* renamed from: b */
        public final boolean f12438b;

        /* renamed from: c */
        public final byte[] f12439c;

        /* renamed from: d */
        public final byte[] f12440d;

        public C2396c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f12437a = i;
            this.f12438b = z;
            this.f12439c = bArr;
            this.f12440d = bArr2;
        }
    }

    /* renamed from: gl1$d */
    /* compiled from: DvbParser */
    public static final class C2397d {

        /* renamed from: a */
        public final int f12441a;

        /* renamed from: b */
        public final int f12442b;

        /* renamed from: c */
        public final int f12443c;

        /* renamed from: d */
        public final SparseArray<C2398e> f12444d;

        public C2397d(int i, int i2, int i3, SparseArray<C2398e> sparseArray) {
            this.f12441a = i;
            this.f12442b = i2;
            this.f12443c = i3;
            this.f12444d = sparseArray;
        }
    }

    /* renamed from: gl1$e */
    /* compiled from: DvbParser */
    public static final class C2398e {

        /* renamed from: a */
        public final int f12445a;

        /* renamed from: b */
        public final int f12446b;

        public C2398e(int i, int i2) {
            this.f12445a = i;
            this.f12446b = i2;
        }
    }

    /* renamed from: gl1$f */
    /* compiled from: DvbParser */
    public static final class C2399f {

        /* renamed from: a */
        public final int f12447a;

        /* renamed from: b */
        public final boolean f12448b;

        /* renamed from: c */
        public final int f12449c;

        /* renamed from: d */
        public final int f12450d;

        /* renamed from: e */
        public final int f12451e;

        /* renamed from: f */
        public final int f12452f;

        /* renamed from: g */
        public final int f12453g;

        /* renamed from: h */
        public final int f12454h;

        /* renamed from: i */
        public final int f12455i;

        /* renamed from: j */
        public final int f12456j;

        /* renamed from: k */
        public final SparseArray<C2400g> f12457k;

        public C2399f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C2400g> sparseArray) {
            this.f12447a = i;
            this.f12448b = z;
            this.f12449c = i2;
            this.f12450d = i3;
            this.f12451e = i4;
            this.f12452f = i5;
            this.f12453g = i6;
            this.f12454h = i7;
            this.f12455i = i8;
            this.f12456j = i9;
            this.f12457k = sparseArray;
        }

        /* renamed from: a */
        public void mo20636a(C2399f fVar) {
            SparseArray<C2400g> sparseArray = fVar.f12457k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f12457k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* renamed from: gl1$g */
    /* compiled from: DvbParser */
    public static final class C2400g {

        /* renamed from: a */
        public final int f12458a;

        /* renamed from: b */
        public final int f12459b;

        /* renamed from: c */
        public final int f12460c;

        /* renamed from: d */
        public final int f12461d;

        /* renamed from: e */
        public final int f12462e;

        /* renamed from: f */
        public final int f12463f;

        public C2400g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f12458a = i;
            this.f12459b = i2;
            this.f12460c = i3;
            this.f12461d = i4;
            this.f12462e = i5;
            this.f12463f = i6;
        }
    }

    /* renamed from: gl1$h */
    /* compiled from: DvbParser */
    public static final class C2401h {

        /* renamed from: a */
        public final int f12464a;

        /* renamed from: b */
        public final int f12465b;

        /* renamed from: c */
        public final SparseArray<C2399f> f12466c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C2394a> f12467d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C2396c> f12468e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C2394a> f12469f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C2396c> f12470g = new SparseArray<>();

        /* renamed from: h */
        public C2395b f12471h;

        /* renamed from: i */
        public C2397d f12472i;

        public C2401h(int i, int i2) {
            this.f12464a = i;
            this.f12465b = i2;
        }

        /* renamed from: a */
        public void mo20637a() {
            this.f12466c.clear();
            this.f12467d.clear();
            this.f12468e.clear();
            this.f12469f.clear();
            this.f12470g.clear();
            this.f12471h = null;
            this.f12472i = null;
        }
    }

    public gl1(int i, int i2) {
        Paint paint = new Paint();
        this.f12420a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f12421b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f12425f = new C2401h(i, i2);
    }

    /* renamed from: a */
    public static byte[] m18170a(int i, int i2, fm4 fm4) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) fm4.mo20004h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    public static int[] m18171c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    public static int[] m18172d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = m18174f(255, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = m18174f(255, i, i2, i7);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public static int[] m18173e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = m18174f(63, i17, i18, i20);
            } else {
                int i21 = i19 & 136;
                int i22 = 170;
                int i23 = 85;
                if (i21 == 0) {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i24 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i25 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m18174f(255, i24, i25, i23 + i22);
                } else if (i21 != 8) {
                    int i26 = 43;
                    if (i21 == 128) {
                        if ((i19 & 1) != 0) {
                            i9 = 43;
                        } else {
                            i9 = 0;
                        }
                        int i27 = i9 + 127;
                        if ((i19 & 16) != 0) {
                            i10 = 85;
                        } else {
                            i10 = 0;
                        }
                        int i28 = i27 + i10;
                        if ((i19 & 2) != 0) {
                            i11 = 43;
                        } else {
                            i11 = 0;
                        }
                        int i29 = i11 + 127;
                        if ((i19 & 32) != 0) {
                            i12 = 85;
                        } else {
                            i12 = 0;
                        }
                        int i30 = i29 + i12;
                        if ((i19 & 4) == 0) {
                            i26 = 0;
                        }
                        int i31 = i26 + 127;
                        if ((i19 & 64) == 0) {
                            i23 = 0;
                        }
                        iArr[i19] = m18174f(255, i28, i30, i31 + i23);
                    } else if (i21 == 136) {
                        if ((i19 & 1) != 0) {
                            i13 = 43;
                        } else {
                            i13 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        int i32 = i13 + i14;
                        if ((i19 & 2) != 0) {
                            i15 = 43;
                        } else {
                            i15 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        int i33 = i15 + i16;
                        if ((i19 & 4) == 0) {
                            i26 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i23 = 0;
                        }
                        iArr[i19] = m18174f(255, i32, i33, i26 + i23);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i5 = 85;
                    } else {
                        i5 = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i6 = 170;
                    } else {
                        i6 = 0;
                    }
                    int i34 = i5 + i6;
                    if ((i19 & 2) != 0) {
                        i7 = 85;
                    } else {
                        i7 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i8 = 170;
                    } else {
                        i8 = 0;
                    }
                    int i35 = i7 + i8;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m18174f(127, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    public static int m18174f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m18175g(p000.fm4 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 2
            int r4 = r13.mo20004h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
            r12 = r5
            goto L_0x0060
        L_0x0014:
            boolean r4 = r13.mo20003g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.mo20004h(r6)
            int r4 = r4 + r6
            int r3 = r13.mo20004h(r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0060
        L_0x0028:
            boolean r4 = r13.mo20003g()
            if (r4 == 0) goto L_0x0032
            r11 = r2
            r12 = r5
        L_0x0030:
            r4 = r9
            goto L_0x0060
        L_0x0032:
            int r4 = r13.mo20004h(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005b
            if (r4 == r3) goto L_0x004f
            if (r4 == r6) goto L_0x0042
            r11 = r2
        L_0x003f:
            r4 = r9
            r12 = r4
            goto L_0x0060
        L_0x0042:
            r4 = 8
            int r4 = r13.mo20004h(r4)
            int r4 = r4 + 29
            int r3 = r13.mo20004h(r3)
            goto L_0x0024
        L_0x004f:
            r4 = 4
            int r4 = r13.mo20004h(r4)
            int r4 = r4 + 12
            int r3 = r13.mo20004h(r3)
            goto L_0x0024
        L_0x005b:
            r11 = r2
            r12 = r3
            goto L_0x0030
        L_0x005e:
            r11 = r5
            goto L_0x003f
        L_0x0060:
            if (r12 == 0) goto L_0x007e
            if (r8 == 0) goto L_0x007e
            if (r15 == 0) goto L_0x0068
            byte r4 = r15[r4]
        L_0x0068:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007e:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0082
            return r10
        L_0x0082:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gl1.m18175g(fm4, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m18176h(p000.fm4 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 4
            int r4 = r13.mo20004h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0016
            r11 = r2
            r12 = r6
            goto L_0x0069
        L_0x0016:
            boolean r4 = r13.mo20003g()
            r7 = 3
            if (r4 != 0) goto L_0x002b
            int r3 = r13.mo20004h(r7)
            if (r3 == 0) goto L_0x0029
            int r5 = r3 + 2
        L_0x0025:
            r11 = r2
            r12 = r5
        L_0x0027:
            r4 = r9
            goto L_0x0069
        L_0x0029:
            r11 = r6
            goto L_0x004b
        L_0x002b:
            boolean r4 = r13.mo20003g()
            if (r4 != 0) goto L_0x003e
            int r4 = r13.mo20004h(r5)
            int r5 = r4 + 4
            int r4 = r13.mo20004h(r3)
        L_0x003b:
            r11 = r2
            r12 = r5
            goto L_0x0069
        L_0x003e:
            int r4 = r13.mo20004h(r5)
            if (r4 == 0) goto L_0x0066
            if (r4 == r6) goto L_0x0025
            if (r4 == r5) goto L_0x005b
            if (r4 == r7) goto L_0x004e
            r11 = r2
        L_0x004b:
            r4 = r9
            r12 = r4
            goto L_0x0069
        L_0x004e:
            r4 = 8
            int r4 = r13.mo20004h(r4)
            int r5 = r4 + 25
            int r4 = r13.mo20004h(r3)
            goto L_0x003b
        L_0x005b:
            int r4 = r13.mo20004h(r3)
            int r5 = r4 + 9
            int r4 = r13.mo20004h(r3)
            goto L_0x003b
        L_0x0066:
            r11 = r2
            r12 = r6
            goto L_0x0027
        L_0x0069:
            if (r12 == 0) goto L_0x0085
            if (r8 == 0) goto L_0x0085
            if (r15 == 0) goto L_0x0071
            byte r4 = r15[r4]
        L_0x0071:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0085:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0089
            return r10
        L_0x0089:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gl1.m18176h(fm4, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m18177i(p000.fm4 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 8
            int r4 = r13.mo20004h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r5
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.mo20003g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.mo20004h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = r9
            goto L_0x0035
        L_0x0026:
            r11 = r5
            r4 = r9
            r12 = r4
            goto L_0x0035
        L_0x002a:
            int r4 = r13.mo20004h(r6)
            int r3 = r13.mo20004h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gl1.m18177i(fm4, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: j */
    public static void m18178j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i4 = i;
        byte[] bArr6 = bArr;
        fm4 fm4 = new fm4(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        byte[] bArr9 = null;
        while (fm4.mo19998b() != 0) {
            int h = fm4.mo20004h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                i5 = m18175g(fm4, iArr, bArr2, i5, i6, paint, canvas);
                                fm4.mo19999c();
                                break;
                            } else if (bArr9 == null) {
                                bArr3 = f12417h;
                            } else {
                                bArr3 = bArr9;
                            }
                        } else if (bArr7 == null) {
                            bArr3 = f12418i;
                        } else {
                            bArr3 = bArr7;
                        }
                        bArr2 = bArr3;
                        i5 = m18175g(fm4, iArr, bArr2, i5, i6, paint, canvas);
                        fm4.mo19999c();
                    case 17:
                        if (i4 == 3) {
                            if (bArr8 == null) {
                                bArr5 = f12419j;
                            } else {
                                bArr5 = bArr8;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        i5 = m18176h(fm4, iArr, bArr4, i5, i6, paint, canvas);
                        fm4.mo19999c();
                        break;
                    case 18:
                        i5 = m18177i(fm4, iArr, (byte[]) null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (h) {
                            case 32:
                                bArr9 = m18170a(4, 4, fm4);
                                break;
                            case 33:
                                bArr7 = m18170a(4, 8, fm4);
                                break;
                            case 34:
                                bArr8 = m18170a(16, 8, fm4);
                                break;
                        }
                }
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: k */
    public static void m18179k(C2396c cVar, C2394a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f12430d;
        } else if (i == 2) {
            iArr = aVar.f12429c;
        } else {
            iArr = aVar.f12428b;
        }
        int[] iArr2 = iArr;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m18178j(cVar.f12439c, iArr2, i4, i5, i3, paint2, canvas2);
        m18178j(cVar.f12440d, iArr2, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: l */
    public static C2394a m18180l(fm4 fm4, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        fm4 fm42 = fm4;
        int i7 = 8;
        int h = fm42.mo20004h(8);
        fm42.mo20014r(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m18171c();
        int[] d = m18172d();
        int[] e = m18173e();
        while (i9 > 0) {
            int h2 = fm42.mo20004h(i7);
            int h3 = fm42.mo20004h(i7);
            int i10 = i9 - 2;
            if ((h3 & 128) != 0) {
                iArr = c;
            } else if ((h3 & 64) != 0) {
                iArr = d;
            } else {
                iArr = e;
            }
            if ((h3 & 1) != 0) {
                i5 = fm42.mo20004h(i7);
                i4 = fm42.mo20004h(i7);
                i3 = fm42.mo20004h(i7);
                i2 = fm42.mo20004h(i7);
                i6 = i10 - 4;
            } else {
                i3 = fm42.mo20004h(4) << 4;
                i6 = i10 - 2;
                int h4 = fm42.mo20004h(4) << 4;
                i2 = fm42.mo20004h(i8) << 6;
                i5 = fm42.mo20004h(6) << i8;
                i4 = h4;
            }
            if (i5 == 0) {
                i2 = 255;
                i4 = 0;
                i3 = 0;
            }
            double d2 = (double) i5;
            double d3 = (double) (i4 - 128);
            double d4 = (double) (i3 - 128);
            iArr[h2] = m18174f((byte) (255 - (i2 & 255)), w67.m29374q((int) (d2 + (1.402d * d3)), 0, 255), w67.m29374q((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), w67.m29374q((int) (d2 + (d4 * 1.772d)), 0, 255));
            i9 = i6;
            h = h;
            i7 = 8;
            i8 = 2;
        }
        return new C2394a(h, c, d, e);
    }

    /* renamed from: m */
    public static C2395b m18181m(fm4 fm4) {
        int i;
        int i2;
        int i3;
        int i4;
        fm4.mo20014r(4);
        boolean g = fm4.mo20003g();
        fm4.mo20014r(3);
        int h = fm4.mo20004h(16);
        int h2 = fm4.mo20004h(16);
        if (g) {
            int h3 = fm4.mo20004h(16);
            int h4 = fm4.mo20004h(16);
            int h5 = fm4.mo20004h(16);
            i = fm4.mo20004h(16);
            i3 = h4;
            i2 = h5;
            i4 = h3;
        } else {
            i4 = 0;
            i2 = 0;
            i3 = h;
            i = h2;
        }
        return new C2395b(h, h2, i4, i3, i2, i);
    }

    /* renamed from: n */
    public static C2396c m18182n(fm4 fm4) {
        byte[] bArr;
        int h = fm4.mo20004h(16);
        fm4.mo20014r(4);
        int h2 = fm4.mo20004h(2);
        boolean g = fm4.mo20003g();
        fm4.mo20014r(1);
        byte[] bArr2 = w67.f19026f;
        if (h2 == 1) {
            fm4.mo20014r(fm4.mo20004h(8) * 16);
        } else if (h2 == 0) {
            int h3 = fm4.mo20004h(16);
            int h4 = fm4.mo20004h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                fm4.mo20007k(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                fm4.mo20007k(bArr, 0, h4);
                return new C2396c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C2396c(h, g, bArr2, bArr);
    }

    /* renamed from: o */
    public static C2397d m18183o(fm4 fm4, int i) {
        int h = fm4.mo20004h(8);
        int h2 = fm4.mo20004h(4);
        int h3 = fm4.mo20004h(2);
        fm4.mo20014r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = fm4.mo20004h(8);
            fm4.mo20014r(8);
            i2 -= 6;
            sparseArray.put(h4, new C2398e(fm4.mo20004h(16), fm4.mo20004h(16)));
        }
        return new C2397d(h, h2, h3, sparseArray);
    }

    /* renamed from: p */
    public static C2399f m18184p(fm4 fm4, int i) {
        int i2;
        int i3;
        fm4 fm42 = fm4;
        int h = fm42.mo20004h(8);
        fm42.mo20014r(4);
        boolean g = fm4.mo20003g();
        fm42.mo20014r(3);
        int i4 = 16;
        int h2 = fm42.mo20004h(16);
        int h3 = fm42.mo20004h(16);
        int h4 = fm42.mo20004h(3);
        int h5 = fm42.mo20004h(3);
        int i5 = 2;
        fm42.mo20014r(2);
        int h6 = fm42.mo20004h(8);
        int h7 = fm42.mo20004h(8);
        int h8 = fm42.mo20004h(4);
        int h9 = fm42.mo20004h(2);
        fm42.mo20014r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = fm42.mo20004h(i4);
            int h11 = fm42.mo20004h(i5);
            int h12 = fm42.mo20004h(i5);
            int h13 = fm42.mo20004h(12);
            int i7 = h9;
            fm42.mo20014r(4);
            int h14 = fm42.mo20004h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = fm42.mo20004h(8);
                i2 = fm42.mo20004h(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            sparseArray.put(h10, new C2400g(h11, h12, h13, h14, i3, i2));
            h9 = i7;
            i5 = 2;
            i4 = 16;
        }
        return new C2399f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
    }

    /* renamed from: q */
    public static void m18185q(fm4 fm4, C2401h hVar) {
        C2399f fVar;
        int h = fm4.mo20004h(8);
        int h2 = fm4.mo20004h(16);
        int h3 = fm4.mo20004h(16);
        int d = fm4.mo20000d() + h3;
        if (h3 * 8 > fm4.mo19998b()) {
            gk3.m18132i("DvbParser", "Data field length exceeds limit");
            fm4.mo20014r(fm4.mo19998b());
            return;
        }
        switch (h) {
            case 16:
                if (h2 == hVar.f12464a) {
                    C2397d dVar = hVar.f12472i;
                    C2397d o = m18183o(fm4, h3);
                    if (o.f12443c == 0) {
                        if (!(dVar == null || dVar.f12442b == o.f12442b)) {
                            hVar.f12472i = o;
                            break;
                        }
                    } else {
                        hVar.f12472i = o;
                        hVar.f12466c.clear();
                        hVar.f12467d.clear();
                        hVar.f12468e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C2397d dVar2 = hVar.f12472i;
                if (h2 == hVar.f12464a && dVar2 != null) {
                    C2399f p = m18184p(fm4, h3);
                    if (dVar2.f12443c == 0 && (fVar = hVar.f12466c.get(p.f12447a)) != null) {
                        p.mo20636a(fVar);
                    }
                    hVar.f12466c.put(p.f12447a, p);
                    break;
                }
            case 18:
                if (h2 != hVar.f12464a) {
                    if (h2 == hVar.f12465b) {
                        C2394a l = m18180l(fm4, h3);
                        hVar.f12469f.put(l.f12427a, l);
                        break;
                    }
                } else {
                    C2394a l2 = m18180l(fm4, h3);
                    hVar.f12467d.put(l2.f12427a, l2);
                    break;
                }
                break;
            case 19:
                if (h2 != hVar.f12464a) {
                    if (h2 == hVar.f12465b) {
                        C2396c n = m18182n(fm4);
                        hVar.f12470g.put(n.f12437a, n);
                        break;
                    }
                } else {
                    C2396c n2 = m18182n(fm4);
                    hVar.f12468e.put(n2.f12437a, n2);
                    break;
                }
                break;
            case 20:
                if (h2 == hVar.f12464a) {
                    hVar.f12471h = m18181m(fm4);
                    break;
                }
                break;
        }
        fm4.mo20015s(d - fm4.mo20000d());
    }

    /* renamed from: b */
    public List<dx0> mo20634b(byte[] bArr, int i) {
        int i2;
        C2396c cVar;
        int i3;
        SparseArray<C2400g> sparseArray;
        Paint paint;
        fm4 fm4 = new fm4(bArr, i);
        while (fm4.mo19998b() >= 48 && fm4.mo20004h(8) == 15) {
            m18185q(fm4, this.f12425f);
        }
        C2401h hVar = this.f12425f;
        C2397d dVar = hVar.f12472i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C2395b bVar = hVar.f12471h;
        if (bVar == null) {
            bVar = this.f12423d;
        }
        Bitmap bitmap = this.f12426g;
        if (!(bitmap != null && bVar.f12431a + 1 == bitmap.getWidth() && bVar.f12432b + 1 == this.f12426g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f12431a + 1, bVar.f12432b + 1, Bitmap.Config.ARGB_8888);
            this.f12426g = createBitmap;
            this.f12422c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C2398e> sparseArray2 = dVar.f12444d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f12422c.save();
            C2398e valueAt = sparseArray2.valueAt(i4);
            C2399f fVar = this.f12425f.f12466c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f12445a + bVar.f12433c;
            int i6 = valueAt.f12446b + bVar.f12435e;
            this.f12422c.clipRect(i5, i6, Math.min(fVar.f12449c + i5, bVar.f12434d), Math.min(fVar.f12450d + i6, bVar.f12436f));
            C2394a aVar = this.f12425f.f12467d.get(fVar.f12453g);
            if (aVar == null && (aVar = this.f12425f.f12469f.get(fVar.f12453g)) == null) {
                aVar = this.f12424e;
            }
            SparseArray<C2400g> sparseArray3 = fVar.f12457k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C2400g valueAt2 = sparseArray3.valueAt(i7);
                C2396c cVar2 = this.f12425f.f12468e.get(keyAt);
                if (cVar2 == null) {
                    cVar = this.f12425f.f12470g.get(keyAt);
                } else {
                    cVar = cVar2;
                }
                if (cVar != null) {
                    if (cVar.f12438b) {
                        paint = null;
                    } else {
                        paint = this.f12420a;
                    }
                    int i8 = i6 + valueAt2.f12461d;
                    i3 = i7;
                    int i9 = i8;
                    sparseArray = sparseArray3;
                    m18179k(cVar, aVar, fVar.f12452f, valueAt2.f12460c + i5, i9, paint, this.f12422c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f12448b) {
                int i10 = fVar.f12452f;
                if (i10 == 3) {
                    i2 = aVar.f12430d[fVar.f12454h];
                } else if (i10 == 2) {
                    i2 = aVar.f12429c[fVar.f12455i];
                } else {
                    i2 = aVar.f12428b[fVar.f12456j];
                }
                this.f12421b.setColor(i2);
                this.f12422c.drawRect((float) i5, (float) i6, (float) (fVar.f12449c + i5), (float) (fVar.f12450d + i6), this.f12421b);
            }
            arrayList.add(new dx0.C2206b().mo18984f(Bitmap.createBitmap(this.f12426g, i5, i6, fVar.f12449c, fVar.f12450d)).mo18989k(((float) i5) / ((float) bVar.f12431a)).mo18990l(0).mo18986h(((float) i6) / ((float) bVar.f12432b), 0).mo18987i(0).mo18992n(((float) fVar.f12449c) / ((float) bVar.f12431a)).mo18985g(((float) fVar.f12450d) / ((float) bVar.f12432b)).mo18979a());
            this.f12422c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f12422c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void mo20635r() {
        this.f12425f.mo20637a();
    }
}
