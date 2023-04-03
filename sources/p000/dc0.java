package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import p000.dx0;

/* renamed from: dc0 */
/* compiled from: Cea608Decoder */
public final class dc0 extends hc0 {

    /* renamed from: A */
    public static final int[] f10588A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    public static final int[] f10589B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    public static final int[] f10590C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    public static final int[] f10591D = {193, MlKitException.CODE_SCANNER_CANCELLED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 235, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    public static final int[] f10592E = {195, 227, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    public static final boolean[] f10593F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y */
    public static final int[] f10594y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    public static final int[] f10595z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g */
    public final gm4 f10596g = new gm4();

    /* renamed from: h */
    public final int f10597h;

    /* renamed from: i */
    public final int f10598i;

    /* renamed from: j */
    public final int f10599j;

    /* renamed from: k */
    public final long f10600k;

    /* renamed from: l */
    public final ArrayList<C2144a> f10601l = new ArrayList<>();

    /* renamed from: m */
    public C2144a f10602m = new C2144a(0, 4);

    /* renamed from: n */
    public List<dx0> f10603n;

    /* renamed from: o */
    public List<dx0> f10604o;

    /* renamed from: p */
    public int f10605p;

    /* renamed from: q */
    public int f10606q;

    /* renamed from: r */
    public boolean f10607r;

    /* renamed from: s */
    public boolean f10608s;

    /* renamed from: t */
    public byte f10609t;

    /* renamed from: u */
    public byte f10610u;

    /* renamed from: v */
    public int f10611v = 0;

    /* renamed from: w */
    public boolean f10612w;

    /* renamed from: x */
    public long f10613x;

    /* renamed from: dc0$a */
    /* compiled from: Cea608Decoder */
    public static final class C2144a {

        /* renamed from: a */
        public final List<C2145a> f10614a = new ArrayList();

        /* renamed from: b */
        public final List<SpannableString> f10615b = new ArrayList();

        /* renamed from: c */
        public final StringBuilder f10616c = new StringBuilder();

        /* renamed from: d */
        public int f10617d;

        /* renamed from: e */
        public int f10618e;

        /* renamed from: f */
        public int f10619f;

        /* renamed from: g */
        public int f10620g;

        /* renamed from: h */
        public int f10621h;

        /* renamed from: dc0$a$a */
        /* compiled from: Cea608Decoder */
        public static class C2145a {

            /* renamed from: a */
            public final int f10622a;

            /* renamed from: b */
            public final boolean f10623b;

            /* renamed from: c */
            public int f10624c;

            public C2145a(int i, boolean z, int i2) {
                this.f10622a = i;
                this.f10623b = z;
                this.f10624c = i2;
            }
        }

        public C2144a(int i, int i2) {
            mo18673j(i);
            this.f10621h = i2;
        }

        /* renamed from: n */
        public static void m14970n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        /* renamed from: o */
        public static void m14971o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: q */
        public static void m14972q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: e */
        public void mo18668e(char c) {
            if (this.f10616c.length() < 32) {
                this.f10616c.append(c);
            }
        }

        /* renamed from: f */
        public void mo18669f() {
            int length = this.f10616c.length();
            if (length > 0) {
                this.f10616c.delete(length - 1, length);
                int size = this.f10614a.size() - 1;
                while (size >= 0) {
                    C2145a aVar = this.f10614a.get(size);
                    int i = aVar.f10624c;
                    if (i == length) {
                        aVar.f10624c = i - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: g */
        public dx0 mo18670g(int i) {
            float f;
            int i2 = this.f10618e + this.f10619f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f10615b.size(); i4++) {
                spannableStringBuilder.append(w67.m29333T0(this.f10615b.get(i4), i3));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(w67.m29333T0(mo18671h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f10620g == 2 && (Math.abs(i5) < 3 || length < 0)) {
                    i = 1;
                } else if (this.f10620g != 2 || i5 <= 0) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.f10617d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f10620g == 1) {
                i6 -= this.f10621h - 1;
            }
            return new dx0.C2206b().mo18993o(spannableStringBuilder).mo18994p(Layout.Alignment.ALIGN_NORMAL).mo18986h((float) i6, 1).mo18989k(f).mo18990l(i).mo18979a();
        }

        /* renamed from: h */
        public final SpannableString mo18671h() {
            int i;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10616c);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = 0;
            boolean z2 = false;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (i2 < this.f10614a.size()) {
                C2145a aVar = this.f10614a.get(i2);
                boolean z3 = aVar.f10623b;
                int i8 = aVar.f10622a;
                if (i8 != 8) {
                    if (i8 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i8 != 7) {
                        i7 = dc0.f10588A[i8];
                    }
                    z2 = z;
                }
                int i9 = aVar.f10624c;
                i2++;
                if (i2 < this.f10614a.size()) {
                    i = this.f10614a.get(i2).f10624c;
                } else {
                    i = length;
                }
                if (i9 != i) {
                    if (i4 != -1 && !z3) {
                        m14972q(spannableStringBuilder, i4, i9);
                        i4 = -1;
                    } else if (i4 == -1 && z3) {
                        i4 = i9;
                    }
                    if (i5 != -1 && !z2) {
                        m14971o(spannableStringBuilder, i5, i9);
                        i5 = -1;
                    } else if (i5 == -1 && z2) {
                        i5 = i9;
                    }
                    if (i7 != i6) {
                        m14970n(spannableStringBuilder, i3, i9, i6);
                        i6 = i7;
                        i3 = i9;
                    }
                }
            }
            if (!(i4 == -1 || i4 == length)) {
                m14972q(spannableStringBuilder, i4, length);
            }
            if (!(i5 == -1 || i5 == length)) {
                m14971o(spannableStringBuilder, i5, length);
            }
            if (i3 != length) {
                m14970n(spannableStringBuilder, i3, length, i6);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: i */
        public boolean mo18672i() {
            if (!this.f10614a.isEmpty() || !this.f10615b.isEmpty() || this.f10616c.length() != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public void mo18673j(int i) {
            this.f10620g = i;
            this.f10614a.clear();
            this.f10615b.clear();
            this.f10616c.setLength(0);
            this.f10617d = 15;
            this.f10618e = 0;
            this.f10619f = 0;
        }

        /* renamed from: k */
        public void mo18674k() {
            this.f10615b.add(mo18671h());
            this.f10616c.setLength(0);
            this.f10614a.clear();
            int min = Math.min(this.f10621h, this.f10617d);
            while (this.f10615b.size() >= min) {
                this.f10615b.remove(0);
            }
        }

        /* renamed from: l */
        public void mo18675l(int i) {
            this.f10620g = i;
        }

        /* renamed from: m */
        public void mo18676m(int i) {
            this.f10621h = i;
        }

        /* renamed from: p */
        public void mo18677p(int i, boolean z) {
            this.f10614a.add(new C2145a(i, z, this.f10616c.length()));
        }
    }

    public dc0(String str, int i, long j) {
        long j2;
        int i2;
        if (j > 0) {
            j2 = j * 1000;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f10600k = j2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f10597h = i2;
        if (i == 1) {
            this.f10599j = 0;
            this.f10598i = 0;
        } else if (i == 2) {
            this.f10599j = 1;
            this.f10598i = 0;
        } else if (i == 3) {
            this.f10599j = 0;
            this.f10598i = 1;
        } else if (i != 4) {
            gk3.m18132i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f10599j = 0;
            this.f10598i = 0;
        } else {
            this.f10599j = 1;
            this.f10598i = 1;
        }
        mo18650N(0);
        mo18649M();
        this.f10612w = true;
        this.f10613x = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: A */
    public static boolean m14929A(byte b) {
        return (b & 224) == 0;
    }

    /* renamed from: B */
    public static boolean m14930B(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: C */
    public static boolean m14931C(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: D */
    public static boolean m14932D(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: E */
    public static boolean m14933E(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: F */
    public static boolean m14934F(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: H */
    public static boolean m14935H(byte b) {
        return (b & 247) == 20;
    }

    /* renamed from: I */
    public static boolean m14936I(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: J */
    public static boolean m14937J(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: K */
    public static boolean m14938K(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: q */
    public static char m14940q(byte b) {
        return (char) f10589B[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: r */
    public static int m14941r(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: t */
    public static char m14942t(byte b) {
        return (char) f10591D[b & 31];
    }

    /* renamed from: u */
    public static char m14943u(byte b) {
        return (char) f10592E[b & 31];
    }

    /* renamed from: v */
    public static char m14944v(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m14942t(b2);
        }
        return m14943u(b2);
    }

    /* renamed from: w */
    public static char m14945w(byte b) {
        return (char) f10590C[b & 15];
    }

    /* renamed from: G */
    public final boolean mo18647G(boolean z, byte b, byte b2) {
        if (!z || !m14934F(b)) {
            this.f10608s = false;
        } else if (this.f10608s && this.f10609t == b && this.f10610u == b2) {
            this.f10608s = false;
            return true;
        } else {
            this.f10608s = true;
            this.f10609t = b;
            this.f10610u = b2;
        }
        return false;
    }

    /* renamed from: L */
    public final void mo18648L(byte b, byte b2) {
        if (m14938K(b)) {
            this.f10612w = false;
        } else if (m14935H(b)) {
            if (!(b2 == 32 || b2 == 47)) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f10612w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f10612w = true;
        }
    }

    /* renamed from: M */
    public final void mo18649M() {
        this.f10602m.mo18673j(this.f10605p);
        this.f10601l.clear();
        this.f10601l.add(this.f10602m);
    }

    /* renamed from: N */
    public final void mo18650N(int i) {
        int i2 = this.f10605p;
        if (i2 != i) {
            this.f10605p = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f10601l.size(); i3++) {
                    this.f10601l.get(i3).mo18675l(i);
                }
                return;
            }
            mo18649M();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f10603n = Collections.emptyList();
            }
        }
    }

    /* renamed from: O */
    public final void mo18651O(int i) {
        this.f10606q = i;
        this.f10602m.mo18676m(i);
    }

    /* renamed from: P */
    public final boolean mo18652P() {
        if (this.f10600k == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || this.f10613x == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || mo21083k() - this.f10613x < this.f10600k) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean mo18653Q(byte b) {
        if (m14929A(b)) {
            this.f10611v = m14941r(b);
        }
        if (this.f10611v == this.f10599j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo18654a() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo18655b(long j) {
        super.mo18655b(j);
    }

    /* renamed from: f */
    public xc6 mo18657f() {
        List<dx0> list = this.f10603n;
        this.f10604o = list;
        return new ic0((List) C2725kr.m20985e(list));
    }

    public void flush() {
        super.flush();
        this.f10603n = null;
        this.f10604o = null;
        mo18650N(0);
        mo18651O(4);
        mo18649M();
        this.f10607r = false;
        this.f10608s = false;
        this.f10609t = 0;
        this.f10610u = 0;
        this.f10611v = 0;
        this.f10612w = true;
        this.f10613x = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0018 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18659g(p000.bd6 r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f4592e
            java.lang.Object r10 = p000.C2725kr.m20985e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            gm4 r0 = r9.f10596g
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.mo20672N(r1, r10)
            r10 = 0
            r0 = 1
            r1 = r10
        L_0x0018:
            gm4 r2 = r9.f10596g
            int r2 = r2.mo20676a()
            int r3 = r9.f10597h
            if (r2 < r3) goto L_0x00f6
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002e
        L_0x0027:
            gm4 r2 = r9.f10596g
            int r2 = r2.mo20662D()
            byte r2 = (byte) r2
        L_0x002e:
            gm4 r3 = r9.f10596g
            int r3 = r3.mo20662D()
            gm4 r4 = r9.f10596g
            int r4 = r4.mo20662D()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0018
        L_0x003f:
            r5 = r2 & 1
            int r6 = r9.f10598i
            if (r5 == r6) goto L_0x0046
            goto L_0x0018
        L_0x0046:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0018
        L_0x0051:
            boolean r7 = r9.f10607r
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0064
            boolean[] r2 = f10593F
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0064
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0064
            r2 = r0
            goto L_0x0065
        L_0x0064:
            r2 = r10
        L_0x0065:
            r9.f10607r = r2
            boolean r2 = r9.mo18647G(r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0018
        L_0x006e:
            boolean r2 = r9.f10607r
            if (r2 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0018
            r9.mo18649M()
        L_0x0077:
            r1 = r0
            goto L_0x0018
        L_0x0079:
            r9.mo18648L(r5, r6)
            boolean r2 = r9.f10612w
            if (r2 != 0) goto L_0x0081
            goto L_0x0018
        L_0x0081:
            boolean r2 = r9.mo18653Q(r5)
            if (r2 != 0) goto L_0x0088
            goto L_0x0018
        L_0x0088:
            boolean r1 = m14929A(r5)
            if (r1 == 0) goto L_0x00df
            boolean r1 = m14936I(r5, r6)
            if (r1 == 0) goto L_0x009e
            dc0$a r1 = r9.f10602m
            char r2 = m14945w(r6)
            r1.mo18668e(r2)
            goto L_0x0077
        L_0x009e:
            boolean r1 = m14930B(r5, r6)
            if (r1 == 0) goto L_0x00b3
            dc0$a r1 = r9.f10602m
            r1.mo18669f()
            dc0$a r1 = r9.f10602m
            char r2 = m14944v(r5, r6)
            r1.mo18668e(r2)
            goto L_0x0077
        L_0x00b3:
            boolean r1 = m14931C(r5, r6)
            if (r1 == 0) goto L_0x00bd
            r9.mo18665x(r6)
            goto L_0x0077
        L_0x00bd:
            boolean r1 = m14933E(r5, r6)
            if (r1 == 0) goto L_0x00c7
            r9.mo18667z(r5, r6)
            goto L_0x0077
        L_0x00c7:
            boolean r1 = m14937J(r5, r6)
            if (r1 == 0) goto L_0x00d5
            dc0$a r1 = r9.f10602m
            int r6 = r6 + -32
            int unused = r1.f10619f = r6
            goto L_0x0077
        L_0x00d5:
            boolean r1 = m14932D(r5, r6)
            if (r1 == 0) goto L_0x0077
            r9.mo18666y(r6)
            goto L_0x0077
        L_0x00df:
            dc0$a r1 = r9.f10602m
            char r2 = m14940q(r5)
            r1.mo18668e(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0077
            dc0$a r1 = r9.f10602m
            char r2 = m14940q(r6)
            r1.mo18668e(r2)
            goto L_0x0077
        L_0x00f6:
            if (r1 == 0) goto L_0x010b
            int r10 = r9.f10605p
            if (r10 == r0) goto L_0x00ff
            r0 = 3
            if (r10 != r0) goto L_0x010b
        L_0x00ff:
            java.util.List r10 = r9.mo18664s()
            r9.f10603n = r10
            long r0 = r9.mo21083k()
            r9.f10613x = r0
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dc0.mo18659g(bd6):void");
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ bd6 mo18660h() throws SubtitleDecoderException {
        return super.mo19502e();
    }

    /* renamed from: i */
    public cd6 mo18656c() throws SubtitleDecoderException {
        cd6 j;
        cd6 i = super.mo18656c();
        if (i != null) {
            return i;
        }
        if (!mo18652P() || (j = mo21082j()) == null) {
            return null;
        }
        this.f10603n = Collections.emptyList();
        this.f10613x = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        cd6 cd6 = j;
        cd6.mo12039w(mo21083k(), mo18657f(), Long.MAX_VALUE);
        return j;
    }

    /* renamed from: l */
    public boolean mo18662l() {
        if (this.f10603n != this.f10604o) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo18663m(bd6 bd6) throws SubtitleDecoderException {
        super.mo19501d(bd6);
    }

    /* renamed from: s */
    public final List<dx0> mo18664s() {
        int size = this.f10601l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            dx0 g = this.f10601l.get(i2).mo18670g(Integer.MIN_VALUE);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.f10951y);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            dx0 dx0 = (dx0) arrayList.get(i3);
            if (dx0 != null) {
                if (dx0.f10951y != i) {
                    dx0 = (dx0) C2725kr.m20985e(this.f10601l.get(i3).mo18670g(i));
                }
                arrayList2.add(dx0);
            }
        }
        return arrayList2;
    }

    /* renamed from: x */
    public final void mo18665x(byte b) {
        boolean z;
        this.f10602m.mo18668e(' ');
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f10602m.mo18677p((b >> 1) & 7, z);
    }

    /* renamed from: y */
    public final void mo18666y(byte b) {
        if (b == 32) {
            mo18650N(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    mo18650N(1);
                    mo18651O(2);
                    return;
                case 38:
                    mo18650N(1);
                    mo18651O(3);
                    return;
                case 39:
                    mo18650N(1);
                    mo18651O(4);
                    return;
                default:
                    int i = this.f10605p;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f10603n = Collections.emptyList();
                                    int i2 = this.f10605p;
                                    if (i2 == 1 || i2 == 3) {
                                        mo18649M();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i == 1 && !this.f10602m.mo18672i()) {
                                        this.f10602m.mo18674k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    mo18649M();
                                    return;
                                case 47:
                                    this.f10603n = mo18664s();
                                    mo18649M();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f10602m.mo18669f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            mo18650N(3);
        }
    }

    /* renamed from: z */
    public final void mo18667z(byte b, byte b2) {
        boolean z;
        boolean z2;
        int i;
        int i2 = f10594y[b & 7];
        boolean z3 = false;
        if ((b2 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2++;
        }
        if (i2 != this.f10602m.f10617d) {
            if (this.f10605p != 1 && !this.f10602m.mo18672i()) {
                C2144a aVar = new C2144a(this.f10605p, this.f10606q);
                this.f10602m = aVar;
                this.f10601l.add(aVar);
            }
            int unused = this.f10602m.f10617d = i2;
        }
        if ((b2 & 16) == 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b2 & 1) == 1) {
            z3 = true;
        }
        int i3 = (b2 >> 1) & 7;
        C2144a aVar2 = this.f10602m;
        if (z2) {
            i = 8;
        } else {
            i = i3;
        }
        aVar2.mo18677p(i, z3);
        if (z2) {
            int unused2 = this.f10602m.f10618e = f10595z[i3];
        }
    }
}
