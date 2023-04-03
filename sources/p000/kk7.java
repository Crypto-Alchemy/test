package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: kk7 */
/* compiled from: WebvttCssParser */
public final class kk7 {

    /* renamed from: c */
    public static final Pattern f14141c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f14142d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final gm4 f14143a = new gm4();

    /* renamed from: b */
    public final StringBuilder f14144b = new StringBuilder();

    /* renamed from: b */
    public static boolean m20802b(gm4 gm4) {
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        byte[] d = gm4.mo20679d();
        if (e + 2 > f) {
            return false;
        }
        int i = e + 1;
        if (d[e] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (d[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= f) {
                gm4.mo20675Q(f - gm4.mo20680e());
                return true;
            } else if (((char) d[i2]) == '*' && ((char) d[i3]) == '/') {
                i2 = i3 + 1;
                f = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    public static boolean m20803c(gm4 gm4) {
        char k = m20810k(gm4, gm4.mo20680e());
        if (k != 9 && k != 10 && k != 12 && k != 13 && k != ' ') {
            return false;
        }
        gm4.mo20675Q(1);
        return true;
    }

    /* renamed from: e */
    public static void m20804e(String str, lk7 lk7) {
        Matcher matcher = f14142d.matcher(C5876gr.m44841e(str));
        if (!matcher.matches()) {
            gk3.m18132i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C2725kr.m20985e(matcher.group(2));
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                lk7.mo22808t(3);
                break;
            case 1:
                lk7.mo22808t(2);
                break;
            case 2:
                lk7.mo22808t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        lk7.mo22807s(Float.parseFloat((String) C2725kr.m20985e(matcher.group(1))));
    }

    /* renamed from: f */
    public static String m20805f(gm4 gm4, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        while (e < f && !z) {
            char c = (char) gm4.mo20679d()[e];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                e++;
                sb.append(c);
            }
        }
        gm4.mo20675Q(e - gm4.mo20680e());
        return sb.toString();
    }

    /* renamed from: g */
    public static String m20806g(gm4 gm4, StringBuilder sb) {
        m20813n(gm4);
        if (gm4.mo20676a() == 0) {
            return null;
        }
        String f = m20805f(gm4, sb);
        if (!"".equals(f)) {
            return f;
        }
        return "" + ((char) gm4.mo20662D());
    }

    /* renamed from: h */
    public static String m20807h(gm4 gm4, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int e = gm4.mo20680e();
            String g = m20806g(gm4, sb);
            if (g == null) {
                return null;
            }
            if ("}".equals(g) || ";".equals(g)) {
                gm4.mo20674P(e);
                z = true;
            } else {
                sb2.append(g);
            }
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public static String m20808i(gm4 gm4, StringBuilder sb) {
        String str;
        m20813n(gm4);
        if (gm4.mo20676a() < 5 || !"::cue".equals(gm4.mo20659A(5))) {
            return null;
        }
        int e = gm4.mo20680e();
        String g = m20806g(gm4, sb);
        if (g == null) {
            return null;
        }
        if ("{".equals(g)) {
            gm4.mo20674P(e);
            return "";
        }
        if ("(".equals(g)) {
            str = m20811l(gm4);
        } else {
            str = null;
        }
        if (!")".equals(m20806g(gm4, sb))) {
            return null;
        }
        return str;
    }

    /* renamed from: j */
    public static void m20809j(gm4 gm4, lk7 lk7, StringBuilder sb) {
        m20813n(gm4);
        String f = m20805f(gm4, sb);
        if (!"".equals(f) && ":".equals(m20806g(gm4, sb))) {
            m20813n(gm4);
            String h = m20807h(gm4, sb);
            if (h != null && !"".equals(h)) {
                int e = gm4.mo20680e();
                String g = m20806g(gm4, sb);
                if (!";".equals(g)) {
                    if ("}".equals(g)) {
                        gm4.mo20674P(e);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f)) {
                    lk7.mo22805q(bl0.m11437b(h));
                } else if ("background-color".equals(f)) {
                    lk7.mo22802n(bl0.m11437b(h));
                } else {
                    boolean z = true;
                    if ("ruby-position".equals(f)) {
                        if ("over".equals(h)) {
                            lk7.mo22810v(1);
                        } else if ("under".equals(h)) {
                            lk7.mo22810v(2);
                        }
                    } else if ("text-combine-upright".equals(f)) {
                        if (!"all".equals(h) && !h.startsWith("digits")) {
                            z = false;
                        }
                        lk7.mo22804p(z);
                    } else if ("text-decoration".equals(f)) {
                        if ("underline".equals(h)) {
                            lk7.mo22788A(true);
                        }
                    } else if ("font-family".equals(f)) {
                        lk7.mo22806r(h);
                    } else if ("font-weight".equals(f)) {
                        if ("bold".equals(h)) {
                            lk7.mo22803o(true);
                        }
                    } else if ("font-style".equals(f)) {
                        if ("italic".equals(h)) {
                            lk7.mo22809u(true);
                        }
                    } else if ("font-size".equals(f)) {
                        m20804e(h, lk7);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static char m20810k(gm4 gm4, int i) {
        return (char) gm4.mo20679d()[i];
    }

    /* renamed from: l */
    public static String m20811l(gm4 gm4) {
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        boolean z = false;
        while (e < f && !z) {
            int i = e + 1;
            if (((char) gm4.mo20679d()[e]) == ')') {
                z = true;
            } else {
                z = false;
            }
            e = i;
        }
        return gm4.mo20659A((e - 1) - gm4.mo20680e()).trim();
    }

    /* renamed from: m */
    public static void m20812m(gm4 gm4) {
        do {
        } while (!TextUtils.isEmpty(gm4.mo20691p()));
    }

    /* renamed from: n */
    public static void m20813n(gm4 gm4) {
        while (true) {
            boolean z = true;
            while (gm4.mo20676a() > 0 && z) {
                if (!m20803c(gm4) && !m20802b(gm4)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo22343a(lk7 lk7, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f14141c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    lk7.mo22814z((String) C2725kr.m20985e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] L0 = w67.m29317L0(str, "\\.");
            String str2 = L0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                lk7.mo22813y(str2.substring(0, indexOf2));
                lk7.mo22812x(str2.substring(indexOf2 + 1));
            } else {
                lk7.mo22813y(str2);
            }
            if (L0.length > 1) {
                lk7.mo22811w((String[]) w67.m29301D0(L0, 1, L0.length));
            }
        }
    }

    /* renamed from: d */
    public List<lk7> mo22344d(gm4 gm4) {
        boolean z;
        this.f14144b.setLength(0);
        int e = gm4.mo20680e();
        m20812m(gm4);
        this.f14143a.mo20672N(gm4.mo20679d(), gm4.mo20680e());
        this.f14143a.mo20674P(e);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i = m20808i(this.f14143a, this.f14144b);
            if (i == null || !"{".equals(m20806g(this.f14143a, this.f14144b))) {
                return arrayList;
            }
            lk7 lk7 = new lk7();
            mo22343a(lk7, i);
            String str = null;
            boolean z2 = false;
            while (!z2) {
                int e2 = this.f14143a.mo20680e();
                String g = m20806g(this.f14143a, this.f14144b);
                if (g == null || "}".equals(g)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f14143a.mo20674P(e2);
                    m20809j(this.f14143a, lk7, this.f14144b);
                }
                str = g;
                z2 = z;
            }
            if ("}".equals(str)) {
                arrayList.add(lk7);
            }
        }
    }
}
