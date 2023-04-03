package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: lc6 */
/* compiled from: SubripDecoder */
public final class lc6 extends z26 {

    /* renamed from: q */
    public static final Pattern f14485q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    public static final Pattern f14486r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    public final StringBuilder f14487o = new StringBuilder();

    /* renamed from: p */
    public final ArrayList<String> f14488p = new ArrayList<>();

    public lc6() {
        super("SubripDecoder");
    }

    /* renamed from: D */
    public static float m21398D(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: E */
    public static long m21399E(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        long parseLong = j + (Long.parseLong((String) C2725kr.m20985e(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) C2725kr.m20985e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        cl3 cl3 = new cl3();
        gm4 gm4 = new gm4(bArr, i);
        while (true) {
            String p = gm4.mo20691p();
            int i2 = 0;
            if (p == null) {
                break;
            } else if (p.length() != 0) {
                try {
                    Integer.parseInt(p);
                    String p2 = gm4.mo20691p();
                    if (p2 == null) {
                        gk3.m18132i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f14485q.matcher(p2);
                    if (matcher.matches()) {
                        cl3.mo12103a(m21399E(matcher, 1));
                        cl3.mo12103a(m21399E(matcher, 6));
                        this.f14487o.setLength(0);
                        this.f14488p.clear();
                        for (String p3 = gm4.mo20691p(); !TextUtils.isEmpty(p3); p3 = gm4.mo20691p()) {
                            if (this.f14487o.length() > 0) {
                                this.f14487o.append("<br>");
                            }
                            this.f14487o.append(mo22720F(p3, this.f14488p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f14487o.toString());
                        String str = null;
                        while (true) {
                            if (i2 >= this.f14488p.size()) {
                                break;
                            }
                            String str2 = this.f14488p.get(i2);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(mo22719C(fromHtml, str));
                        arrayList.add(dx0.f10933Q);
                    } else {
                        gk3.m18132i("SubripDecoder", "Skipping invalid timing: " + p2);
                    }
                } catch (NumberFormatException unused) {
                    gk3.m18132i("SubripDecoder", "Skipping invalid index: " + p);
                }
            }
        }
        return new mc6((dx0[]) arrayList.toArray(new dx0[0]), cl3.mo12106d());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.dx0 mo22719C(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            dx0$b r1 = new dx0$b
            r1.<init>()
            r2 = r17
            dx0$b r1 = r1.mo18993o(r2)
            if (r0 != 0) goto L_0x0014
            dx0 r0 = r1.mo18979a()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L_0x007b
            r2 = r15
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = r4
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = r3
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r12)
            if (r2 == 0) goto L_0x007b
            r2 = r5
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r3) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r5) goto L_0x008d
            if (r2 == r4) goto L_0x008d
            r4 = 5
            if (r2 == r4) goto L_0x008d
            r1.mo18990l(r3)
            goto L_0x0095
        L_0x008d:
            r1.mo18990l(r15)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.mo18990l(r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e6
            r0 = r5
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e6
            r0 = r15
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = r3
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r3) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r5) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.mo18987i(r3)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.mo18987i(r0)
            goto L_0x0101
        L_0x00fe:
            r1.mo18987i(r15)
        L_0x0101:
            int r0 = r1.mo18982d()
            float r0 = m21398D(r0)
            dx0$b r0 = r1.mo18989k(r0)
            int r1 = r1.mo18981c()
            float r1 = m21398D(r1)
            r2 = 0
            dx0$b r0 = r0.mo18986h(r1, r2)
            dx0 r0 = r0.mo18979a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lc6.mo22719C(android.text.Spanned, java.lang.String):dx0");
    }

    /* renamed from: F */
    public final String mo22720F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f14486r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }
}
