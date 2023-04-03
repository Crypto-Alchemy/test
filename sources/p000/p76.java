package p000;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.dx0;
import p000.r76;

/* renamed from: p76 */
/* compiled from: SsaDecoder */
public final class p76 extends z26 {

    /* renamed from: t */
    public static final Pattern f16340t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    public final boolean f16341o;

    /* renamed from: p */
    public final q76 f16342p;

    /* renamed from: q */
    public Map<String, r76> f16343q;

    /* renamed from: r */
    public float f16344r = -3.4028235E38f;

    /* renamed from: s */
    public float f16345s = -3.4028235E38f;

    public p76(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f16341o = false;
            this.f16342p = null;
            return;
        }
        this.f16341o = true;
        String B = w67.m29296B(list.get(0));
        C2725kr.m20981a(B.startsWith("Format:"));
        this.f16342p = (q76) C2725kr.m20985e(q76.m25534a(B));
        mo24473H(new gm4(list.get(1)));
    }

    /* renamed from: C */
    public static int m24730C(long j, List<Long> list, List<List<dx0>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    /* renamed from: D */
    public static float m24731D(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: E */
    public static dx0 m24732E(String str, r76 r76, r76.C3187b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        dx0.C2206b o = new dx0.C2206b().mo18993o(spannableString);
        if (r76 != null) {
            if (r76.f17172c != null) {
                spannableString.setSpan(new ForegroundColorSpan(r76.f17172c.intValue()), 0, spannableString.length(), 33);
            }
            if (r76.f17179j == 3 && r76.f17173d != null) {
                spannableString.setSpan(new BackgroundColorSpan(r76.f17173d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = r76.f17174e;
            if (!(f3 == -3.4028235E38f || f2 == -3.4028235E38f)) {
                o.mo18995q(f3 / f2, 1);
            }
            boolean z = r76.f17175f;
            if (z && r76.f17176g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (r76.f17176g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (r76.f17177h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (r76.f17178i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f17195a;
        if (i == -1) {
            if (r76 != null) {
                i = r76.f17171b;
            } else {
                i = -1;
            }
        }
        o.mo18994p(m24737N(i)).mo18990l(m24736M(i)).mo18987i(m24735L(i));
        PointF pointF = bVar.f17196b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            o.mo18989k(m24731D(o.mo18982d()));
            o.mo18986h(m24731D(o.mo18981c()), 0);
        } else {
            o.mo18989k(pointF.x / f);
            o.mo18986h(bVar.f17196b.y / f2, 0);
        }
        return o.mo18979a();
    }

    /* renamed from: J */
    public static Map<String, r76> m24733J(gm4 gm4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r76.C3186a aVar = null;
        while (true) {
            String p = gm4.mo20691p();
            if (p == null || (gm4.mo20676a() != 0 && gm4.mo20683h() == 91)) {
                return linkedHashMap;
            }
            if (p.startsWith("Format:")) {
                aVar = r76.C3186a.m26109a(p);
            } else if (p.startsWith("Style:")) {
                if (aVar == null) {
                    gk3.m18132i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + p);
                } else {
                    r76 b = r76.m26101b(p, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.f17170a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: K */
    public static long m24734K(String str) {
        Matcher matcher = f16340t.matcher(str.trim());
        if (!matcher.matches()) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return (Long.parseLong((String) w67.m29360j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) w67.m29360j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) w67.m29360j(matcher.group(3))) * 1000000) + (Long.parseLong((String) w67.m29360j(matcher.group(4))) * 10000);
    }

    /* renamed from: L */
    public static int m24735L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                gk3.m18132i("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: M */
    public static int m24736M(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                gk3.m18132i("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: N */
    public static Layout.Alignment m24737N(int i) {
        switch (i) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                gk3.m18132i("SsaDecoder", "Unknown alignment: " + i);
                return null;
        }
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        gm4 gm4 = new gm4(bArr, i);
        if (!this.f16341o) {
            mo24473H(gm4);
        }
        mo24472G(gm4, arrayList, arrayList2);
        return new s76(arrayList, arrayList2);
    }

    /* renamed from: F */
    public final void mo24471F(String str, q76 q76, List<List<dx0>> list, List<Long> list2) {
        r76 r76;
        int i;
        C2725kr.m20981a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", q76.f16856e);
        if (split.length != q76.f16856e) {
            gk3.m18132i("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long K = m24734K(split[q76.f16852a]);
        if (K == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            gk3.m18132i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long K2 = m24734K(split[q76.f16853b]);
        if (K2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            gk3.m18132i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, r76> map = this.f16343q;
        if (map == null || (i = q76.f16854c) == -1) {
            r76 = null;
        } else {
            r76 = map.get(split[i].trim());
        }
        String str2 = split[q76.f16855d];
        dx0 E = m24732E(r76.C3187b.m26113d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), r76, r76.C3187b.m26111b(str2), this.f16344r, this.f16345s);
        int C = m24730C(K2, list2, list);
        for (int C2 = m24730C(K, list2, list); C2 < C; C2++) {
            list.get(C2).add(E);
        }
    }

    /* renamed from: G */
    public final void mo24472G(gm4 gm4, List<List<dx0>> list, List<Long> list2) {
        q76 q76;
        if (this.f16341o) {
            q76 = this.f16342p;
        } else {
            q76 = null;
        }
        while (true) {
            String p = gm4.mo20691p();
            if (p == null) {
                return;
            }
            if (p.startsWith("Format:")) {
                q76 = q76.m25534a(p);
            } else if (p.startsWith("Dialogue:")) {
                if (q76 == null) {
                    gk3.m18132i("SsaDecoder", "Skipping dialogue line before complete format: " + p);
                } else {
                    mo24471F(p, q76, list, list2);
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo24473H(gm4 gm4) {
        while (true) {
            String p = gm4.mo20691p();
            if (p == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(p)) {
                mo24474I(gm4);
            } else if ("[V4+ Styles]".equalsIgnoreCase(p)) {
                this.f16343q = m24733J(gm4);
            } else if ("[V4 Styles]".equalsIgnoreCase(p)) {
                gk3.m18129f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(p)) {
                return;
            }
        }
    }

    /* renamed from: I */
    public final void mo24474I(gm4 gm4) {
        while (true) {
            String p = gm4.mo20691p();
            if (p == null) {
                return;
            }
            if (gm4.mo20676a() == 0 || gm4.mo20683h() != 91) {
                String[] split = p.split(":");
                if (split.length == 2) {
                    String e = C5876gr.m44841e(split[0].trim());
                    e.hashCode();
                    if (e.equals("playresx")) {
                        this.f16344r = Float.parseFloat(split[1].trim());
                    } else if (e.equals("playresy")) {
                        try {
                            this.f16345s = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
