package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.dx0;

/* renamed from: fc0 */
/* compiled from: Cea708Decoder */
public final class fc0 extends hc0 {

    /* renamed from: g */
    public final gm4 f11713g = new gm4();

    /* renamed from: h */
    public final fm4 f11714h = new fm4();

    /* renamed from: i */
    public int f11715i = -1;

    /* renamed from: j */
    public final boolean f11716j;

    /* renamed from: k */
    public final int f11717k;

    /* renamed from: l */
    public final C2286b[] f11718l;

    /* renamed from: m */
    public C2286b f11719m;

    /* renamed from: n */
    public List<dx0> f11720n;

    /* renamed from: o */
    public List<dx0> f11721o;

    /* renamed from: p */
    public C2287c f11722p;

    /* renamed from: q */
    public int f11723q;

    /* renamed from: fc0$a */
    /* compiled from: Cea708Decoder */
    public static final class C2285a {

        /* renamed from: c */
        public static final Comparator<C2285a> f11724c = new ec0();

        /* renamed from: a */
        public final dx0 f11725a;

        /* renamed from: b */
        public final int f11726b;

        public C2285a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            dx0.C2206b n = new dx0.C2206b().mo18993o(charSequence).mo18994p(alignment).mo18986h(f, i).mo18987i(i2).mo18989k(f2).mo18990l(i3).mo18992n(f3);
            if (z) {
                n.mo18997s(i4);
            }
            this.f11725a = n.mo18979a();
            this.f11726b = i5;
        }
    }

    /* renamed from: fc0$b */
    /* compiled from: Cea708Decoder */
    public static final class C2286b {

        /* renamed from: A */
        public static final int[] f11727A = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: B */
        public static final int[] f11728B = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: C */
        public static final boolean[] f11729C = {false, false, false, true, true, true, false};

        /* renamed from: D */
        public static final int[] f11730D;

        /* renamed from: E */
        public static final int[] f11731E = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: F */
        public static final int[] f11732F = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: G */
        public static final int[] f11733G;

        /* renamed from: w */
        public static final int f11734w = m16880h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f11735x;

        /* renamed from: y */
        public static final int f11736y;

        /* renamed from: z */
        public static final int[] f11737z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a */
        public final List<SpannableString> f11738a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f11739b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f11740c;

        /* renamed from: d */
        public boolean f11741d;

        /* renamed from: e */
        public int f11742e;

        /* renamed from: f */
        public boolean f11743f;

        /* renamed from: g */
        public int f11744g;

        /* renamed from: h */
        public int f11745h;

        /* renamed from: i */
        public int f11746i;

        /* renamed from: j */
        public int f11747j;

        /* renamed from: k */
        public boolean f11748k;

        /* renamed from: l */
        public int f11749l;

        /* renamed from: m */
        public int f11750m;

        /* renamed from: n */
        public int f11751n;

        /* renamed from: o */
        public int f11752o;

        /* renamed from: p */
        public int f11753p;

        /* renamed from: q */
        public int f11754q;

        /* renamed from: r */
        public int f11755r;

        /* renamed from: s */
        public int f11756s;

        /* renamed from: t */
        public int f11757t;

        /* renamed from: u */
        public int f11758u;

        /* renamed from: v */
        public int f11759v;

        static {
            int h = m16880h(0, 0, 0, 0);
            f11735x = h;
            int h2 = m16880h(0, 0, 0, 3);
            f11736y = h2;
            f11730D = new int[]{h, h2, h, h, h2, h, h};
            f11733G = new int[]{h, h, h, h, h, h2, h2};
        }

        public C2286b() {
            mo19877l();
        }

        /* renamed from: g */
        public static int m16879g(int i, int i2, int i3) {
            return m16880h(i, i2, i3, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m16880h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p000.C2725kr.m20983c(r4, r0, r1)
                p000.C2725kr.m20983c(r5, r0, r1)
                p000.C2725kr.m20983c(r6, r0, r1)
                p000.C2725kr.m20983c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = r0
                goto L_0x0022
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0022
            L_0x0021:
                r7 = r2
            L_0x0022:
                if (r4 <= r1) goto L_0x0026
                r4 = r2
                goto L_0x0027
            L_0x0026:
                r4 = r0
            L_0x0027:
                if (r5 <= r1) goto L_0x002b
                r5 = r2
                goto L_0x002c
            L_0x002b:
                r5 = r0
            L_0x002c:
                if (r6 <= r1) goto L_0x002f
                r0 = r2
            L_0x002f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fc0.C2286b.m16880h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void mo19868a(char c) {
            if (c == 10) {
                this.f11738a.add(mo19871d());
                this.f11739b.clear();
                if (this.f11753p != -1) {
                    this.f11753p = 0;
                }
                if (this.f11754q != -1) {
                    this.f11754q = 0;
                }
                if (this.f11755r != -1) {
                    this.f11755r = 0;
                }
                if (this.f11757t != -1) {
                    this.f11757t = 0;
                }
                while (true) {
                    if ((this.f11748k && this.f11738a.size() >= this.f11747j) || this.f11738a.size() >= 15) {
                        this.f11738a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f11739b.append(c);
            }
        }

        /* renamed from: b */
        public void mo19869b() {
            int length = this.f11739b.length();
            if (length > 0) {
                this.f11739b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.fc0.C2285a mo19870c() {
            /*
                r15 = this;
                boolean r0 = r15.mo19875j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = r0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f11738a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f11738a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo19871d()
                r2.append(r1)
                int r1 = r15.f11749l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f11749l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f11743f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f11745h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f11744g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f11745h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f11744g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f11746i
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0091
                r8 = r0
                goto L_0x0098
            L_0x0091:
                int r8 = r1 / 3
                if (r8 != r5) goto L_0x0097
                r8 = r5
                goto L_0x0098
            L_0x0097:
                r8 = r3
            L_0x0098:
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x009e
                r9 = r0
                goto L_0x00a4
            L_0x009e:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a3
                r9 = r5
                goto L_0x00a4
            L_0x00a3:
                r9 = r3
            L_0x00a4:
                int r1 = r15.f11752o
                int r3 = f11735x
                if (r1 == r3) goto L_0x00ab
                r0 = r5
            L_0x00ab:
                fc0$a r13 = new fc0$a
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.f11752o
                int r14 = r15.f11742e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fc0.C2286b.mo19870c():fc0$a");
        }

        /* renamed from: d */
        public SpannableString mo19871d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f11739b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f11753p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f11753p, length, 33);
                }
                if (this.f11754q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f11754q, length, 33);
                }
                if (this.f11755r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f11756s), this.f11755r, length, 33);
                }
                if (this.f11757t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f11758u), this.f11757t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void mo19872e() {
            this.f11738a.clear();
            this.f11739b.clear();
            this.f11753p = -1;
            this.f11754q = -1;
            this.f11755r = -1;
            this.f11757t = -1;
            this.f11759v = 0;
        }

        /* renamed from: f */
        public void mo19873f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f11740c = true;
            this.f11741d = z;
            this.f11748k = z5;
            this.f11742e = i;
            this.f11743f = z4;
            this.f11744g = i2;
            this.f11745h = i3;
            this.f11746i = i6;
            int i11 = i4 + 1;
            if (this.f11747j != i11) {
                this.f11747j = i11;
                while (true) {
                    if ((!z5 || this.f11738a.size() < this.f11747j) && this.f11738a.size() < 15) {
                        break;
                    }
                    this.f11738a.remove(0);
                }
            }
            if (!(i9 == 0 || this.f11750m == i9)) {
                this.f11750m = i9;
                int i12 = i9 - 1;
                mo19882q(f11730D[i12], f11736y, f11729C[i12], 0, f11727A[i12], f11728B[i12], f11737z[i12]);
            }
            if (i10 != 0 && this.f11751n != i10) {
                this.f11751n = i10;
                int i13 = i10 - 1;
                mo19878m(0, 1, 1, false, false, f11732F[i13], f11731E[i13]);
                mo19879n(f11734w, f11733G[i13], f11735x);
            }
        }

        /* renamed from: i */
        public boolean mo19874i() {
            return this.f11740c;
        }

        /* renamed from: j */
        public boolean mo19875j() {
            if (!mo19874i() || (this.f11738a.isEmpty() && this.f11739b.length() == 0)) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public boolean mo19876k() {
            return this.f11741d;
        }

        /* renamed from: l */
        public void mo19877l() {
            mo19872e();
            this.f11740c = false;
            this.f11741d = false;
            this.f11742e = 4;
            this.f11743f = false;
            this.f11744g = 0;
            this.f11745h = 0;
            this.f11746i = 0;
            this.f11747j = 15;
            this.f11748k = true;
            this.f11749l = 0;
            this.f11750m = 0;
            this.f11751n = 0;
            int i = f11735x;
            this.f11752o = i;
            this.f11756s = f11734w;
            this.f11758u = i;
        }

        /* renamed from: m */
        public void mo19878m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f11753p != -1) {
                if (!z) {
                    this.f11739b.setSpan(new StyleSpan(2), this.f11753p, this.f11739b.length(), 33);
                    this.f11753p = -1;
                }
            } else if (z) {
                this.f11753p = this.f11739b.length();
            }
            if (this.f11754q != -1) {
                if (!z2) {
                    this.f11739b.setSpan(new UnderlineSpan(), this.f11754q, this.f11739b.length(), 33);
                    this.f11754q = -1;
                }
            } else if (z2) {
                this.f11754q = this.f11739b.length();
            }
        }

        /* renamed from: n */
        public void mo19879n(int i, int i2, int i3) {
            if (!(this.f11755r == -1 || this.f11756s == i)) {
                this.f11739b.setSpan(new ForegroundColorSpan(this.f11756s), this.f11755r, this.f11739b.length(), 33);
            }
            if (i != f11734w) {
                this.f11755r = this.f11739b.length();
                this.f11756s = i;
            }
            if (!(this.f11757t == -1 || this.f11758u == i2)) {
                this.f11739b.setSpan(new BackgroundColorSpan(this.f11758u), this.f11757t, this.f11739b.length(), 33);
            }
            if (i2 != f11735x) {
                this.f11757t = this.f11739b.length();
                this.f11758u = i2;
            }
        }

        /* renamed from: o */
        public void mo19880o(int i, int i2) {
            if (this.f11759v != i) {
                mo19868a(10);
            }
            this.f11759v = i;
        }

        /* renamed from: p */
        public void mo19881p(boolean z) {
            this.f11741d = z;
        }

        /* renamed from: q */
        public void mo19882q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f11752o = i;
            this.f11749l = i6;
        }
    }

    /* renamed from: fc0$c */
    /* compiled from: Cea708Decoder */
    public static final class C2287c {

        /* renamed from: a */
        public final int f11760a;

        /* renamed from: b */
        public final int f11761b;

        /* renamed from: c */
        public final byte[] f11762c;

        /* renamed from: d */
        public int f11763d = 0;

        public C2287c(int i, int i2) {
            this.f11760a = i;
            this.f11761b = i2;
            this.f11762c = new byte[((i2 * 2) - 1)];
        }
    }

    public fc0(int i, List<byte[]> list) {
        boolean z = true;
        this.f11717k = i == -1 ? 1 : i;
        this.f11716j = (list == null || !yh0.m30589f(list)) ? false : z;
        this.f11718l = new C2286b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f11718l[i2] = new C2286b();
        }
        this.f11719m = this.f11718l[0];
    }

    /* renamed from: A */
    public final void mo19851A() {
        this.f11719m.mo19878m(this.f11714h.mo20004h(4), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20003g(), this.f11714h.mo20003g(), this.f11714h.mo20004h(3), this.f11714h.mo20004h(3));
    }

    /* renamed from: B */
    public final void mo19852B() {
        int h = C2286b.m16880h(this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2));
        int h2 = C2286b.m16880h(this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2));
        this.f11714h.mo20014r(2);
        this.f11719m.mo19879n(h, h2, C2286b.m16879g(this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2)));
    }

    /* renamed from: C */
    public final void mo19853C() {
        this.f11714h.mo20014r(4);
        int h = this.f11714h.mo20004h(4);
        this.f11714h.mo20014r(2);
        this.f11719m.mo19880o(h, this.f11714h.mo20004h(6));
    }

    /* renamed from: D */
    public final void mo19854D() {
        int h = C2286b.m16880h(this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2));
        int h2 = this.f11714h.mo20004h(2);
        int g = C2286b.m16879g(this.f11714h.mo20004h(2), this.f11714h.mo20004h(2), this.f11714h.mo20004h(2));
        if (this.f11714h.mo20003g()) {
            h2 |= 4;
        }
        boolean g2 = this.f11714h.mo20003g();
        int h3 = this.f11714h.mo20004h(2);
        int h4 = this.f11714h.mo20004h(2);
        int h5 = this.f11714h.mo20004h(2);
        this.f11714h.mo20014r(8);
        this.f11719m.mo19882q(h, g, g2, h2, h3, h4, h5);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    /* renamed from: E */
    public final void mo19855E() {
        C2287c cVar = this.f11722p;
        if (cVar.f11763d != (cVar.f11761b * 2) - 1) {
            gk3.m18125b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f11722p.f11761b * 2) - 1) + ", but current index is " + this.f11722p.f11763d + " (sequence number " + this.f11722p.f11760a + ");");
        }
        boolean z = false;
        fm4 fm4 = this.f11714h;
        C2287c cVar2 = this.f11722p;
        fm4.mo20011o(cVar2.f11762c, cVar2.f11763d);
        while (true) {
            if (this.f11714h.mo19998b() <= 0) {
                break;
            }
            int h = this.f11714h.mo20004h(3);
            int h2 = this.f11714h.mo20004h(5);
            if (h == 7) {
                this.f11714h.mo20014r(2);
                h = this.f11714h.mo20004h(6);
                if (h < 7) {
                    gk3.m18132i("Cea708Decoder", "Invalid extended service number: " + h);
                }
            }
            if (h2 == 0) {
                if (h != 0) {
                    gk3.m18132i("Cea708Decoder", "serviceNumber is non-zero (" + h + ") when blockSize is 0");
                }
            } else if (h != this.f11717k) {
                this.f11714h.mo20015s(h2);
            } else {
                int e = this.f11714h.mo20001e() + (h2 * 8);
                while (this.f11714h.mo20001e() < e) {
                    int h3 = this.f11714h.mo20004h(8);
                    if (h3 == 16) {
                        int h4 = this.f11714h.mo20004h(8);
                        if (h4 <= 31) {
                            mo19861t(h4);
                        } else if (h4 <= 127) {
                            mo19866y(h4);
                        } else if (h4 <= 159) {
                            mo19862u(h4);
                        } else if (h4 <= 255) {
                            mo19867z(h4);
                        } else {
                            gk3.m18132i("Cea708Decoder", "Invalid extended command: " + h4);
                        }
                    } else if (h3 <= 31) {
                        mo19859r(h3);
                    } else if (h3 <= 127) {
                        mo19864w(h3);
                    } else if (h3 <= 159) {
                        mo19860s(h3);
                    } else if (h3 <= 255) {
                        mo19865x(h3);
                    } else {
                        gk3.m18132i("Cea708Decoder", "Invalid base command: " + h3);
                    }
                    z = true;
                }
            }
        }
        if (z) {
            this.f11720n = mo19858q();
        }
    }

    /* renamed from: F */
    public final void mo19856F() {
        for (int i = 0; i < 8; i++) {
            this.f11718l[i].mo19877l();
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo18654a() {
        super.mo18654a();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo18655b(long j) {
        super.mo18655b(j);
    }

    /* renamed from: f */
    public xc6 mo18657f() {
        List<dx0> list = this.f11720n;
        this.f11721o = list;
        return new ic0((List) C2725kr.m20985e(list));
    }

    public void flush() {
        super.flush();
        this.f11720n = null;
        this.f11721o = null;
        this.f11723q = 0;
        this.f11719m = this.f11718l[0];
        mo19856F();
        this.f11722p = null;
    }

    /* renamed from: g */
    public void mo18659g(bd6 bd6) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C2725kr.m20985e(bd6.f4592e);
        this.f11713g.mo20672N(byteBuffer.array(), byteBuffer.limit());
        while (this.f11713g.mo20676a() >= 3) {
            int D = this.f11713g.mo20662D() & 7;
            int i = D & 3;
            boolean z2 = false;
            if ((D & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte D2 = (byte) this.f11713g.mo20662D();
            byte D3 = (byte) this.f11713g.mo20662D();
            if ((i == 2 || i == 3) && z) {
                if (i == 3) {
                    mo19857p();
                    int i2 = (D2 & 192) >> 6;
                    int i3 = this.f11715i;
                    if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                        mo19856F();
                        gk3.m18132i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f11715i + " current=" + i2);
                    }
                    this.f11715i = i2;
                    byte b = D2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    C2287c cVar = new C2287c(i2, b);
                    this.f11722p = cVar;
                    byte[] bArr = cVar.f11762c;
                    int i4 = cVar.f11763d;
                    cVar.f11763d = i4 + 1;
                    bArr[i4] = D3;
                } else {
                    if (i == 2) {
                        z2 = true;
                    }
                    C2725kr.m20981a(z2);
                    C2287c cVar2 = this.f11722p;
                    if (cVar2 == null) {
                        gk3.m18126c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f11762c;
                        int i5 = cVar2.f11763d;
                        int i6 = i5 + 1;
                        bArr2[i5] = D2;
                        cVar2.f11763d = i6 + 1;
                        bArr2[i6] = D3;
                    }
                }
                C2287c cVar3 = this.f11722p;
                if (cVar3.f11763d == (cVar3.f11761b * 2) - 1) {
                    mo19857p();
                }
            }
        }
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ bd6 mo18660h() throws SubtitleDecoderException {
        return super.mo19502e();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ cd6 mo18661i() throws SubtitleDecoderException {
        return super.mo18656c();
    }

    /* renamed from: l */
    public boolean mo18662l() {
        if (this.f11720n != this.f11721o) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo18663m(bd6 bd6) throws SubtitleDecoderException {
        super.mo19501d(bd6);
    }

    /* renamed from: p */
    public final void mo19857p() {
        if (this.f11722p != null) {
            mo19855E();
            this.f11722p = null;
        }
    }

    /* renamed from: q */
    public final List<dx0> mo19858q() {
        C2285a c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f11718l[i].mo19875j() && this.f11718l[i].mo19876k() && (c = this.f11718l[i].mo19870c()) != null) {
                arrayList.add(c);
            }
        }
        Collections.sort(arrayList, C2285a.f11724c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C2285a) arrayList.get(i2)).f11725a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: r */
    public final void mo19859r(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f11720n = mo19858q();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    mo19856F();
                    return;
                case 13:
                    this.f11719m.mo19868a(10);
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        gk3.m18132i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f11714h.mo20014r(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        gk3.m18132i("Cea708Decoder", "Invalid C0 command: " + i);
                        return;
                    } else {
                        gk3.m18132i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f11714h.mo20014r(16);
                        return;
                    }
            }
        } else {
            this.f11719m.mo19869b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f11714h.mo20003g() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f11718l[8 - r2].mo19877l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f11714h.mo20003g() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f11718l[8 - r2].mo19881p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f11714h.mo20003g() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f11718l[8 - r2].mo19872e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19860s(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            p000.gk3.m18132i(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.mo19863v(r5)
            int r0 = r4.f11723q
            if (r0 == r5) goto L_0x0117
            r4.f11723q = r5
            fc0$b[] r0 = r4.f11718l
            r5 = r0[r5]
            r4.f11719m = r5
            goto L_0x0117
        L_0x0033:
            fc0$b r5 = r4.f11719m
            boolean r5 = r5.mo19874i()
            if (r5 != 0) goto L_0x0044
            fm4 r5 = r4.f11714h
            r0 = 32
            r5.mo20014r(r0)
            goto L_0x0117
        L_0x0044:
            r4.mo19854D()
            goto L_0x0117
        L_0x0049:
            fc0$b r5 = r4.f11719m
            boolean r5 = r5.mo19874i()
            if (r5 != 0) goto L_0x0058
            fm4 r5 = r4.f11714h
            r5.mo20014r(r0)
            goto L_0x0117
        L_0x0058:
            r4.mo19853C()
            goto L_0x0117
        L_0x005d:
            fc0$b r5 = r4.f11719m
            boolean r5 = r5.mo19874i()
            if (r5 != 0) goto L_0x006e
            fm4 r5 = r4.f11714h
            r0 = 24
            r5.mo20014r(r0)
            goto L_0x0117
        L_0x006e:
            r4.mo19852B()
            goto L_0x0117
        L_0x0073:
            fc0$b r5 = r4.f11719m
            boolean r5 = r5.mo19874i()
            if (r5 != 0) goto L_0x0082
            fm4 r5 = r4.f11714h
            r5.mo20014r(r0)
            goto L_0x0117
        L_0x0082:
            r4.mo19851A()
            goto L_0x0117
        L_0x0087:
            r4.mo19856F()
            goto L_0x0117
        L_0x008c:
            fm4 r5 = r4.f11714h
            r5.mo20014r(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            fm4 r5 = r4.f11714h
            boolean r5 = r5.mo20003g()
            if (r5 == 0) goto L_0x00a6
            fc0$b[] r5 = r4.f11718l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo19877l()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = r2
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            fm4 r0 = r4.f11714h
            boolean r0 = r0.mo20003g()
            if (r0 == 0) goto L_0x00c2
            fc0$b[] r0 = r4.f11718l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo19876k()
            r3 = r3 ^ r2
            r0.mo19881p(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            fm4 r5 = r4.f11714h
            boolean r5 = r5.mo20003g()
            if (r5 == 0) goto L_0x00d9
            fc0$b[] r5 = r4.f11718l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo19881p(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = r2
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            fm4 r0 = r4.f11714h
            boolean r0 = r0.mo20003g()
            if (r0 == 0) goto L_0x00f0
            fc0$b[] r0 = r4.f11718l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo19881p(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            fm4 r5 = r4.f11714h
            boolean r5 = r5.mo20003g()
            if (r5 == 0) goto L_0x0106
            fc0$b[] r5 = r4.f11718l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo19872e()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f11723q
            if (r0 == r5) goto L_0x0117
            r4.f11723q = r5
            fc0$b[] r0 = r4.f11718l
            r5 = r0[r5]
            r4.f11719m = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fc0.mo19860s(int):void");
    }

    /* renamed from: t */
    public final void mo19861t(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f11714h.mo20014r(8);
            } else if (i <= 23) {
                this.f11714h.mo20014r(16);
            } else if (i <= 31) {
                this.f11714h.mo20014r(24);
            }
        }
    }

    /* renamed from: u */
    public final void mo19862u(int i) {
        if (i <= 135) {
            this.f11714h.mo20014r(32);
        } else if (i <= 143) {
            this.f11714h.mo20014r(40);
        } else if (i <= 159) {
            this.f11714h.mo20014r(2);
            this.f11714h.mo20014r(this.f11714h.mo20004h(6) * 8);
        }
    }

    /* renamed from: v */
    public final void mo19863v(int i) {
        C2286b bVar = this.f11718l[i];
        this.f11714h.mo20014r(2);
        boolean g = this.f11714h.mo20003g();
        boolean g2 = this.f11714h.mo20003g();
        boolean g3 = this.f11714h.mo20003g();
        int h = this.f11714h.mo20004h(3);
        boolean g4 = this.f11714h.mo20003g();
        int h2 = this.f11714h.mo20004h(7);
        int h3 = this.f11714h.mo20004h(8);
        int h4 = this.f11714h.mo20004h(4);
        int h5 = this.f11714h.mo20004h(4);
        this.f11714h.mo20014r(2);
        int h6 = this.f11714h.mo20004h(6);
        this.f11714h.mo20014r(2);
        bVar.mo19873f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f11714h.mo20004h(3), this.f11714h.mo20004h(3));
    }

    /* renamed from: w */
    public final void mo19864w(int i) {
        if (i == 127) {
            this.f11719m.mo19868a(9835);
        } else {
            this.f11719m.mo19868a((char) (i & 255));
        }
    }

    /* renamed from: x */
    public final void mo19865x(int i) {
        this.f11719m.mo19868a((char) (i & 255));
    }

    /* renamed from: y */
    public final void mo19866y(int i) {
        if (i == 32) {
            this.f11719m.mo19868a(' ');
        } else if (i == 33) {
            this.f11719m.mo19868a(160);
        } else if (i == 37) {
            this.f11719m.mo19868a(8230);
        } else if (i == 42) {
            this.f11719m.mo19868a(352);
        } else if (i == 44) {
            this.f11719m.mo19868a(338);
        } else if (i == 63) {
            this.f11719m.mo19868a(376);
        } else if (i == 57) {
            this.f11719m.mo19868a(8482);
        } else if (i == 58) {
            this.f11719m.mo19868a(353);
        } else if (i == 60) {
            this.f11719m.mo19868a(339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f11719m.mo19868a(9608);
                    return;
                case 49:
                    this.f11719m.mo19868a(8216);
                    return;
                case 50:
                    this.f11719m.mo19868a(8217);
                    return;
                case 51:
                    this.f11719m.mo19868a(8220);
                    return;
                case 52:
                    this.f11719m.mo19868a(8221);
                    return;
                case 53:
                    this.f11719m.mo19868a(8226);
                    return;
                default:
                    switch (i) {
                        case 118:
                            this.f11719m.mo19868a(8539);
                            return;
                        case 119:
                            this.f11719m.mo19868a(8540);
                            return;
                        case 120:
                            this.f11719m.mo19868a(8541);
                            return;
                        case 121:
                            this.f11719m.mo19868a(8542);
                            return;
                        case 122:
                            this.f11719m.mo19868a(9474);
                            return;
                        case 123:
                            this.f11719m.mo19868a(9488);
                            return;
                        case 124:
                            this.f11719m.mo19868a(9492);
                            return;
                        case 125:
                            this.f11719m.mo19868a(9472);
                            return;
                        case 126:
                            this.f11719m.mo19868a(9496);
                            return;
                        case 127:
                            this.f11719m.mo19868a(9484);
                            return;
                        default:
                            gk3.m18132i("Cea708Decoder", "Invalid G2 character: " + i);
                            return;
                    }
            }
        } else {
            this.f11719m.mo19868a(8480);
        }
    }

    /* renamed from: z */
    public final void mo19867z(int i) {
        if (i == 160) {
            this.f11719m.mo19868a(13252);
            return;
        }
        gk3.m18132i("Cea708Decoder", "Invalid G3 character: " + i);
        this.f11719m.mo19868a('_');
    }
}
