package p000;

/* renamed from: kz3 */
/* compiled from: MpegAudioUtil */
public final class kz3 {

    /* renamed from: a */
    public static final String[] f14380a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f14381b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f14382c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f14383d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f14384e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f14385f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f14386g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: kz3$a */
    /* compiled from: MpegAudioUtil */
    public static final class C2735a {

        /* renamed from: a */
        public int f14387a;

        /* renamed from: b */
        public String f14388b;

        /* renamed from: c */
        public int f14389c;

        /* renamed from: d */
        public int f14390d;

        /* renamed from: e */
        public int f14391e;

        /* renamed from: f */
        public int f14392f;

        /* renamed from: g */
        public int f14393g;

        /* renamed from: a */
        public boolean mo22612a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            if (!kz3.m21179l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f14387a = i2;
            this.f14388b = kz3.f14380a[3 - i3];
            int i8 = kz3.f14381b[i5];
            this.f14390d = i8;
            int i9 = 2;
            if (i2 == 2) {
                this.f14390d = i8 / 2;
            } else if (i2 == 0) {
                this.f14390d = i8 / 4;
            }
            int i10 = (i >>> 9) & 1;
            this.f14393g = kz3.m21178k(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = kz3.f14382c[i4 - 1];
                } else {
                    i7 = kz3.f14383d[i4 - 1];
                }
                this.f14392f = i7;
                this.f14389c = (((i7 * 12) / this.f14390d) + i10) * 4;
            } else {
                int i11 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = kz3.f14384e[i4 - 1];
                    } else {
                        i6 = kz3.f14385f[i4 - 1];
                    }
                    this.f14392f = i6;
                    this.f14389c = ((i6 * 144) / this.f14390d) + i10;
                } else {
                    int i12 = kz3.f14386g[i4 - 1];
                    this.f14392f = i12;
                    if (i3 == 1) {
                        i11 = 72;
                    }
                    this.f14389c = ((i11 * i12) / this.f14390d) + i10;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.f14391e = i9;
            return true;
        }
    }

    /* renamed from: j */
    public static int m21177j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!m21179l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f14381b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = f14382c[i4 - 1];
            } else {
                i7 = f14383d[i4 - 1];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 != 3) {
            i6 = f14386g[i4 - 1];
        } else if (i3 == 2) {
            i6 = f14384e[i4 - 1];
        } else {
            i6 = f14385f[i4 - 1];
        }
        int i10 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i8) + i9;
        }
        if (i3 == 1) {
            i10 = 72;
        }
        return ((i10 * i6) / i8) + i9;
    }

    /* renamed from: k */
    public static int m21178k(int i, int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 1152;
            }
            if (i2 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else if (i == 3) {
            return 1152;
        } else {
            return 576;
        }
    }

    /* renamed from: l */
    public static boolean m21179l(int i) {
        return (i & -2097152) == -2097152;
    }

    /* renamed from: m */
    public static int m21180m(int i) {
        int i2;
        int i3;
        if (!m21179l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m21178k(i2, i3);
    }
}
