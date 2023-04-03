package p000;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: r76 */
/* compiled from: SsaStyle */
public final class r76 {

    /* renamed from: a */
    public final String f17170a;

    /* renamed from: b */
    public final int f17171b;

    /* renamed from: c */
    public final Integer f17172c;

    /* renamed from: d */
    public final Integer f17173d;

    /* renamed from: e */
    public final float f17174e;

    /* renamed from: f */
    public final boolean f17175f;

    /* renamed from: g */
    public final boolean f17176g;

    /* renamed from: h */
    public final boolean f17177h;

    /* renamed from: i */
    public final boolean f17178i;

    /* renamed from: j */
    public final int f17179j;

    /* renamed from: r76$a */
    /* compiled from: SsaStyle */
    public static final class C3186a {

        /* renamed from: a */
        public final int f17180a;

        /* renamed from: b */
        public final int f17181b;

        /* renamed from: c */
        public final int f17182c;

        /* renamed from: d */
        public final int f17183d;

        /* renamed from: e */
        public final int f17184e;

        /* renamed from: f */
        public final int f17185f;

        /* renamed from: g */
        public final int f17186g;

        /* renamed from: h */
        public final int f17187h;

        /* renamed from: i */
        public final int f17188i;

        /* renamed from: j */
        public final int f17189j;

        /* renamed from: k */
        public final int f17190k;

        public C3186a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f17180a = i;
            this.f17181b = i2;
            this.f17182c = i3;
            this.f17183d = i4;
            this.f17184e = i5;
            this.f17185f = i6;
            this.f17186g = i7;
            this.f17187h = i8;
            this.f17188i = i9;
            this.f17189j = i10;
            this.f17190k = i11;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p000.r76.C3186a m26109a(java.lang.String r17) {
            /*
                r0 = 7
                r1 = r17
                java.lang.String r1 = r1.substring(r0)
                java.lang.String r2 = ","
                java.lang.String[] r1 = android.text.TextUtils.split(r1, r2)
                r2 = 0
                r3 = -1
                r4 = r2
                r6 = r3
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
            L_0x001a:
                int r5 = r1.length
                if (r4 >= r5) goto L_0x00c1
                r5 = r1[r4]
                java.lang.String r5 = r5.trim()
                java.lang.String r5 = p000.C5876gr.m44841e(r5)
                r5.hashCode()
                int r16 = r5.hashCode()
                switch(r16) {
                    case -1178781136: goto L_0x009b;
                    case -1026963764: goto L_0x0090;
                    case -192095652: goto L_0x0085;
                    case -70925746: goto L_0x007a;
                    case 3029637: goto L_0x006f;
                    case 3373707: goto L_0x0064;
                    case 366554320: goto L_0x0059;
                    case 767321349: goto L_0x004e;
                    case 1767875043: goto L_0x0041;
                    case 1988365454: goto L_0x0034;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r0 = r3
                goto L_0x00a5
            L_0x0034:
                java.lang.String r0 = "outlinecolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x003d
                goto L_0x0031
            L_0x003d:
                r0 = 9
                goto L_0x00a5
            L_0x0041:
                java.lang.String r0 = "alignment"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x004a
                goto L_0x0031
            L_0x004a:
                r0 = 8
                goto L_0x00a5
            L_0x004e:
                java.lang.String r0 = "borderstyle"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0057
                goto L_0x0031
            L_0x0057:
                r0 = 7
                goto L_0x00a5
            L_0x0059:
                java.lang.String r0 = "fontsize"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0062
                goto L_0x0031
            L_0x0062:
                r0 = 6
                goto L_0x00a5
            L_0x0064:
                java.lang.String r0 = "name"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x006d
                goto L_0x0031
            L_0x006d:
                r0 = 5
                goto L_0x00a5
            L_0x006f:
                java.lang.String r0 = "bold"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0078
                goto L_0x0031
            L_0x0078:
                r0 = 4
                goto L_0x00a5
            L_0x007a:
                java.lang.String r0 = "primarycolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0083
                goto L_0x0031
            L_0x0083:
                r0 = 3
                goto L_0x00a5
            L_0x0085:
                java.lang.String r0 = "strikeout"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x008e
                goto L_0x0031
            L_0x008e:
                r0 = 2
                goto L_0x00a5
            L_0x0090:
                java.lang.String r0 = "underline"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0099
                goto L_0x0031
            L_0x0099:
                r0 = 1
                goto L_0x00a5
            L_0x009b:
                java.lang.String r0 = "italic"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x00a4
                goto L_0x0031
            L_0x00a4:
                r0 = r2
            L_0x00a5:
                switch(r0) {
                    case 0: goto L_0x00bb;
                    case 1: goto L_0x00b9;
                    case 2: goto L_0x00b7;
                    case 3: goto L_0x00b5;
                    case 4: goto L_0x00b3;
                    case 5: goto L_0x00b1;
                    case 6: goto L_0x00af;
                    case 7: goto L_0x00ad;
                    case 8: goto L_0x00ab;
                    case 9: goto L_0x00a9;
                    default: goto L_0x00a8;
                }
            L_0x00a8:
                goto L_0x00bc
            L_0x00a9:
                r9 = r4
                goto L_0x00bc
            L_0x00ab:
                r7 = r4
                goto L_0x00bc
            L_0x00ad:
                r15 = r4
                goto L_0x00bc
            L_0x00af:
                r10 = r4
                goto L_0x00bc
            L_0x00b1:
                r6 = r4
                goto L_0x00bc
            L_0x00b3:
                r11 = r4
                goto L_0x00bc
            L_0x00b5:
                r8 = r4
                goto L_0x00bc
            L_0x00b7:
                r14 = r4
                goto L_0x00bc
            L_0x00b9:
                r13 = r4
                goto L_0x00bc
            L_0x00bb:
                r12 = r4
            L_0x00bc:
                int r4 = r4 + 1
                r0 = 7
                goto L_0x001a
            L_0x00c1:
                if (r6 == r3) goto L_0x00cd
                r76$a r0 = new r76$a
                int r1 = r1.length
                r5 = r0
                r16 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                goto L_0x00ce
            L_0x00cd:
                r0 = 0
            L_0x00ce:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C3186a.m26109a(java.lang.String):r76$a");
        }
    }

    /* renamed from: r76$b */
    /* compiled from: SsaStyle */
    public static final class C3187b {

        /* renamed from: c */
        public static final Pattern f17191c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        public static final Pattern f17192d = Pattern.compile(w67.m29294A("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        public static final Pattern f17193e = Pattern.compile(w67.m29294A("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        public static final Pattern f17194f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f17195a;

        /* renamed from: b */
        public final PointF f17196b;

        public C3187b(int i, PointF pointF) {
            this.f17195a = i;
            this.f17196b = pointF;
        }

        /* renamed from: a */
        public static int m26110a(String str) {
            Matcher matcher = f17194f.matcher(str);
            if (matcher.find()) {
                return r76.m26104e((String) C2725kr.m20985e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|6|(1:8)|9|10|(2:12|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p000.r76.C3187b m26111b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f17191c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = r0
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x0029
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = p000.C2725kr.m20985e(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = m26112c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = m26110a(r3)     // Catch:{ RuntimeException -> 0x0009 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                r76$b r5 = new r76$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C3187b.m26111b(java.lang.String):r76$b");
        }

        /* renamed from: c */
        public static PointF m26112c(String str) {
            String str2;
            String str3;
            Matcher matcher = f17192d.matcher(str);
            Matcher matcher2 = f17193e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    gk3.m18129f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C2725kr.m20985e(str2)).trim()), Float.parseFloat(((String) C2725kr.m20985e(str3)).trim()));
        }

        /* renamed from: d */
        public static String m26113d(String str) {
            return f17191c.matcher(str).replaceAll("");
        }
    }

    public r76(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f17170a = str;
        this.f17171b = i;
        this.f17172c = num;
        this.f17173d = num2;
        this.f17174e = f;
        this.f17175f = z;
        this.f17176g = z2;
        this.f17177h = z3;
        this.f17178i = z4;
        this.f17179j = i2;
    }

    /* renamed from: b */
    public static r76 m26101b(String str, C3186a aVar) {
        int i;
        Integer num;
        Integer num2;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        String str2 = str;
        C3186a aVar2 = aVar;
        C2725kr.m20981a(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        int length = split.length;
        int i3 = aVar2.f17190k;
        if (length != i3) {
            gk3.m18132i("SsaStyle", w67.m29294A("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i3), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            String trim = split[aVar2.f17180a].trim();
            int i4 = aVar2.f17181b;
            if (i4 != -1) {
                i = m26104e(split[i4].trim());
            } else {
                i = -1;
            }
            int i5 = aVar2.f17182c;
            if (i5 != -1) {
                num = m26107h(split[i5].trim());
            } else {
                num = null;
            }
            int i6 = aVar2.f17183d;
            if (i6 != -1) {
                num2 = m26107h(split[i6].trim());
            } else {
                num2 = null;
            }
            int i7 = aVar2.f17184e;
            if (i7 != -1) {
                f = m26108i(split[i7].trim());
            } else {
                f = -3.4028235E38f;
            }
            int i8 = aVar2.f17185f;
            if (i8 == -1 || !m26105f(split[i8].trim())) {
                z = false;
            } else {
                z = true;
            }
            int i9 = aVar2.f17186g;
            if (i9 == -1 || !m26105f(split[i9].trim())) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i10 = aVar2.f17187h;
            if (i10 == -1 || !m26105f(split[i10].trim())) {
                z3 = false;
            } else {
                z3 = true;
            }
            int i11 = aVar2.f17188i;
            if (i11 == -1 || !m26105f(split[i11].trim())) {
                z4 = false;
            } else {
                z4 = true;
            }
            int i12 = aVar2.f17189j;
            if (i12 != -1) {
                i2 = m26106g(split[i12].trim());
            } else {
                i2 = -1;
            }
            return new r76(trim, i, num, num2, f, z, z2, z3, z4, i2);
        } catch (RuntimeException e) {
            gk3.m18133j("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m26102c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static boolean m26103d(int i) {
        return i == 1 || i == 3;
    }

    /* renamed from: e */
    public static int m26104e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m26102c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        gk3.m18132i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: f */
    public static boolean m26105f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            gk3.m18133j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: g */
    public static int m26106g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m26103d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        gk3.m18132i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    /* renamed from: h */
    public static Integer m26107h(String str) {
        long j;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            if (j <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20981a(z);
            int d = Ints.m37045d(((j >> 24) & 255) ^ 255);
            int d2 = Ints.m37045d((j >> 16) & 255);
            return Integer.valueOf(Color.argb(d, Ints.m37045d(j & 255), Ints.m37045d((j >> 8) & 255), d2));
        } catch (IllegalArgumentException e) {
            gk3.m18133j("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: i */
    public static float m26108i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            gk3.m18133j("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
