package p000;

import androidx.media3.common.ParserException;

/* renamed from: l5 */
/* compiled from: AacUtil */
public final class C2740l5 {

    /* renamed from: a */
    public static final int[] f14412a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f14413b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: l5$b */
    /* compiled from: AacUtil */
    public static final class C2742b {

        /* renamed from: a */
        public final int f14414a;

        /* renamed from: b */
        public final int f14415b;

        /* renamed from: c */
        public final String f14416c;

        public C2742b(int i, int i2, String str) {
            this.f14414a = i;
            this.f14415b = i2;
            this.f14416c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m21227a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    public static int m21228b(fm4 fm4) {
        int h = fm4.mo20004h(5);
        if (h == 31) {
            return fm4.mo20004h(6) + 32;
        }
        return h;
    }

    /* renamed from: c */
    public static int m21229c(fm4 fm4) throws ParserException {
        int h = fm4.mo20004h(4);
        if (h == 15) {
            return fm4.mo20004h(24);
        }
        if (h < 13) {
            return f14412a[h];
        }
        throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
    }

    /* renamed from: d */
    public static C2742b m21230d(fm4 fm4, boolean z) throws ParserException {
        int b = m21228b(fm4);
        int c = m21229c(fm4);
        int h = fm4.mo20004h(4);
        String str = "mp4a.40." + b;
        if (b == 5 || b == 29) {
            c = m21229c(fm4);
            b = m21228b(fm4);
            if (b == 22) {
                h = fm4.mo20004h(4);
            }
        }
        if (z) {
            if (!(b == 1 || b == 2 || b == 3 || b == 4 || b == 6 || b == 7 || b == 17)) {
                switch (b) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + b);
                }
            }
            m21232f(fm4, b, h);
            switch (b) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = fm4.mo20004h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = f14413b[h];
        if (i != -1) {
            return new C2742b(c, i, str);
        }
        throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
    }

    /* renamed from: e */
    public static C2742b m21231e(byte[] bArr) throws ParserException {
        return m21230d(new fm4(bArr), false);
    }

    /* renamed from: f */
    public static void m21232f(fm4 fm4, int i, int i2) {
        if (fm4.mo20003g()) {
            gk3.m18132i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (fm4.mo20003g()) {
            fm4.mo20014r(14);
        }
        boolean g = fm4.mo20003g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                fm4.mo20014r(3);
            }
            if (g) {
                if (i == 22) {
                    fm4.mo20014r(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    fm4.mo20014r(3);
                }
                fm4.mo20014r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
