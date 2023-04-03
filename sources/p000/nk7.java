package p000;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.dx0;

/* renamed from: nk7 */
/* compiled from: WebvttCueParser */
public final class nk7 {

    /* renamed from: a */
    public static final Pattern f15583a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f15584b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map<String, Integer> f15585c;

    /* renamed from: d */
    public static final Map<String, Integer> f15586d;

    /* renamed from: nk7$b */
    /* compiled from: WebvttCueParser */
    public static class C2907b {

        /* renamed from: c */
        public static final Comparator<C2907b> f15587c = new ok7();

        /* renamed from: a */
        public final C2908c f15588a;

        /* renamed from: b */
        public final int f15589b;

        public C2907b(C2908c cVar, int i) {
            this.f15588a = cVar;
            this.f15589b = i;
        }
    }

    /* renamed from: nk7$c */
    /* compiled from: WebvttCueParser */
    public static final class C2908c {

        /* renamed from: a */
        public final String f15590a;

        /* renamed from: b */
        public final int f15591b;

        /* renamed from: c */
        public final String f15592c;

        /* renamed from: d */
        public final Set<String> f15593d;

        public C2908c(String str, int i, String str2, Set<String> set) {
            this.f15591b = i;
            this.f15590a = str;
            this.f15592c = str2;
            this.f15593d = set;
        }

        /* renamed from: a */
        public static C2908c m23287a(String str, int i) {
            String str2;
            String trim = str.trim();
            C2725kr.m20981a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] L0 = w67.m29317L0(trim, "\\.");
            String str3 = L0[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < L0.length; i2++) {
                hashSet.add(L0[i2]);
            }
            return new C2908c(str3, i, str2, hashSet);
        }

        /* renamed from: b */
        public static C2908c m23288b() {
            return new C2908c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: nk7$d */
    /* compiled from: WebvttCueParser */
    public static final class C2909d implements Comparable<C2909d> {

        /* renamed from: a */
        public final int f15594a;

        /* renamed from: d */
        public final lk7 f15595d;

        public C2909d(int i, lk7 lk7) {
            this.f15594a = i;
            this.f15595d = lk7;
        }

        /* renamed from: a */
        public int compareTo(C2909d dVar) {
            return Integer.compare(this.f15594a, dVar.f15594a);
        }
    }

    /* renamed from: nk7$e */
    /* compiled from: WebvttCueParser */
    public static final class C2910e {

        /* renamed from: a */
        public long f15596a = 0;

        /* renamed from: b */
        public long f15597b = 0;

        /* renamed from: c */
        public CharSequence f15598c;

        /* renamed from: d */
        public int f15599d = 2;

        /* renamed from: e */
        public float f15600e = -3.4028235E38f;

        /* renamed from: f */
        public int f15601f = 1;

        /* renamed from: g */
        public int f15602g = 0;

        /* renamed from: h */
        public float f15603h = -3.4028235E38f;

        /* renamed from: i */
        public int f15604i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f15605j = 1.0f;

        /* renamed from: k */
        public int f15606k = Integer.MIN_VALUE;

        /* renamed from: b */
        public static float m23290b(float f, int i) {
            int i2 = (f > -3.4028235E38f ? 1 : (f == -3.4028235E38f ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= Utils.FLOAT_EPSILON && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        public static Layout.Alignment m23291c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            gk3.m18132i("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        public static float m23292d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i != 1) {
                if (i == 2) {
                    return f;
                }
                throw new IllegalStateException(String.valueOf(i));
            } else if (f <= 0.5f) {
                return f * 2.0f;
            } else {
                return (1.0f - f) * 2.0f;
            }
        }

        /* renamed from: e */
        public static float m23293e(int i) {
            return i != 4 ? i != 5 ? 0.5f : 1.0f : Utils.FLOAT_EPSILON;
        }

        /* renamed from: f */
        public static int m23294f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public mk7 mo23719a() {
            return new mk7(mo23720g().mo18979a(), this.f15596a, this.f15597b);
        }

        /* renamed from: g */
        public dx0.C2206b mo23720g() {
            float f = this.f15603h;
            if (f == -3.4028235E38f) {
                f = m23293e(this.f15599d);
            }
            int i = this.f15604i;
            if (i == Integer.MIN_VALUE) {
                i = m23294f(this.f15599d);
            }
            dx0.C2206b r = new dx0.C2206b().mo18994p(m23291c(this.f15599d)).mo18986h(m23290b(this.f15600e, this.f15601f), this.f15601f).mo18987i(this.f15602g).mo18989k(f).mo18990l(i).mo18992n(Math.min(this.f15605j, m23292d(i, f))).mo18996r(this.f15606k);
            CharSequence charSequence = this.f15598c;
            if (charSequence != null) {
                r.mo18993o(charSequence);
            }
            return r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f15585c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f15586d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static void m23259a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String next : set) {
            Map<String, Integer> map = f15585c;
            if (map.containsKey(next)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(next).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f15586d;
                if (map2.containsKey(next)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(next).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m23260b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                gk3.m18132i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    /* renamed from: c */
    public static void m23261c(SpannableStringBuilder spannableStringBuilder, String str, C2908c cVar, List<C2907b> list, List<lk7> list2) {
        int i = m23267i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C2907b.f15587c);
        int i2 = cVar.f15591b;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(((C2907b) arrayList.get(i4)).f15588a.f15590a)) {
                C2907b bVar = (C2907b) arrayList.get(i4);
                int g = m23265g(m23267i(list2, str, bVar.f15588a), i, 1);
                int i5 = bVar.f15588a.f15591b - i3;
                int d = bVar.f15589b - i3;
                CharSequence subSequence = spannableStringBuilder.subSequence(i5, d);
                spannableStringBuilder.delete(i5, d);
                spannableStringBuilder.setSpan(new ji5(subSequence.toString(), g), i2, i5, 33);
                i3 += subSequence.length();
                i2 = i5;
            }
        }
    }

    /* renamed from: d */
    public static void m23262d(String str, C2908c cVar, List<C2907b> list, SpannableStringBuilder spannableStringBuilder, List<lk7> list2) {
        int i = cVar.f15591b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f15590a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                m23259a(spannableStringBuilder, cVar.f15593d, i, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                m23261c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<C2909d> h = m23266h(list2, str, cVar);
        for (int i2 = 0; i2 < h.size(); i2++) {
            m23263e(spannableStringBuilder, h.get(i2).f15595d, i, length);
        }
    }

    /* renamed from: e */
    public static void m23263e(SpannableStringBuilder spannableStringBuilder, lk7 lk7, int i, int i2) {
        if (lk7 != null) {
            if (lk7.mo22797i() != -1) {
                d66.m14819a(spannableStringBuilder, new StyleSpan(lk7.mo22797i()), i, i2, 33);
            }
            if (lk7.mo22800l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (lk7.mo22801m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (lk7.mo22799k()) {
                d66.m14819a(spannableStringBuilder, new ForegroundColorSpan(lk7.mo22791c()), i, i2, 33);
            }
            if (lk7.mo22798j()) {
                d66.m14819a(spannableStringBuilder, new BackgroundColorSpan(lk7.mo22789a()), i, i2, 33);
            }
            if (lk7.mo22792d() != null) {
                d66.m14819a(spannableStringBuilder, new TypefaceSpan(lk7.mo22792d()), i, i2, 33);
            }
            int f = lk7.mo22794f();
            if (f == 1) {
                d66.m14819a(spannableStringBuilder, new AbsoluteSizeSpan((int) lk7.mo22793e(), true), i, i2, 33);
            } else if (f == 2) {
                d66.m14819a(spannableStringBuilder, new RelativeSizeSpan(lk7.mo22793e()), i, i2, 33);
            } else if (f == 3) {
                d66.m14819a(spannableStringBuilder, new RelativeSizeSpan(lk7.mo22793e() / 100.0f), i, i2, 33);
            }
            if (lk7.mo22790b()) {
                spannableStringBuilder.setSpan(new vm2(), i, i2, 33);
            }
        }
    }

    /* renamed from: f */
    public static int m23264f(String str, int i) {
        int indexOf = str.indexOf(62, i);
        if (indexOf == -1) {
            return str.length();
        }
        return indexOf + 1;
    }

    /* renamed from: g */
    public static int m23265g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static List<C2909d> m23266h(List<lk7> list, String str, C2908c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            lk7 lk7 = list.get(i);
            int h = lk7.mo22796h(str, cVar.f15590a, cVar.f15593d, cVar.f15592c);
            if (h > 0) {
                arrayList.add(new C2909d(h, lk7));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static int m23267i(List<lk7> list, String str, C2908c cVar) {
        List<C2909d> h = m23266h(list, str, cVar);
        for (int i = 0; i < h.size(); i++) {
            lk7 lk7 = h.get(i).f15595d;
            if (lk7.mo22795g() != -1) {
                return lk7.mo22795g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static String m23268j(String str) {
        String trim = str.trim();
        C2725kr.m20981a(!trim.isEmpty());
        return w67.m29319M0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    public static boolean m23269k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    public static dx0 m23270l(CharSequence charSequence) {
        C2910e eVar = new C2910e();
        eVar.f15598c = charSequence;
        return eVar.mo23720g().mo18979a();
    }

    /* renamed from: m */
    public static mk7 m23271m(gm4 gm4, List<lk7> list) {
        String p = gm4.mo20691p();
        if (p == null) {
            return null;
        }
        Pattern pattern = f15583a;
        Matcher matcher = pattern.matcher(p);
        if (matcher.matches()) {
            return m23272n((String) null, matcher, gm4, list);
        }
        String p2 = gm4.mo20691p();
        if (p2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(p2);
        if (matcher2.matches()) {
            return m23272n(p.trim(), matcher2, gm4, list);
        }
        return null;
    }

    /* renamed from: n */
    public static mk7 m23272n(String str, Matcher matcher, gm4 gm4, List<lk7> list) {
        C2910e eVar = new C2910e();
        try {
            eVar.f15596a = qk7.m25744c((String) C2725kr.m20985e(matcher.group(1)));
            eVar.f15597b = qk7.m25744c((String) C2725kr.m20985e(matcher.group(2)));
            m23274p((String) C2725kr.m20985e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String p = gm4.mo20691p();
            while (!TextUtils.isEmpty(p)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(p.trim());
                p = gm4.mo20691p();
            }
            eVar.f15598c = m23275q(str, sb.toString(), list);
            return eVar.mo23719a();
        } catch (NumberFormatException unused) {
            gk3.m18132i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: o */
    public static dx0.C2206b m23273o(String str) {
        C2910e eVar = new C2910e();
        m23274p(str, eVar);
        return eVar.mo23720g();
    }

    /* renamed from: p */
    public static void m23274p(String str, C2910e eVar) {
        Matcher matcher = f15584b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C2725kr.m20985e(matcher.group(1));
            String str3 = (String) C2725kr.m20985e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m23277s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f15599d = m23280v(str3);
                } else if ("position".equals(str2)) {
                    m23279u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f15605j = qk7.m25743b(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f15606k = m23281w(str3);
                } else {
                    gk3.m18132i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                gk3.m18132i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: q */
    public static SpannedString m23275q(String str, String str2, List<lk7> list) {
        boolean z;
        boolean z2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m23260b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    if (str2.charAt(i2) == '/') {
                        z = true;
                    } else {
                        z = false;
                    }
                    i2 = m23264f(str2, i2);
                    int i4 = i2 - 2;
                    if (str2.charAt(i4) == '/') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String j = m23268j(substring);
                        if (m23269k(j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C2908c cVar = (C2908c) arrayDeque.pop();
                                    m23262d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C2907b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f15590a.equals(j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C2908c.m23287a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m23262d(str, (C2908c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m23262d(str, C2908c.m23288b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    public static int m23276r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                gk3.m18132i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    public static void m23277s(String str, C2910e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f15602g = m23276r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f15600e = qk7.m25743b(str);
            eVar.f15601f = 0;
            return;
        }
        eVar.f15600e = (float) Integer.parseInt(str);
        eVar.f15601f = 1;
    }

    /* renamed from: t */
    public static int m23278t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                gk3.m18132i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    public static void m23279u(String str, C2910e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f15604i = m23278t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f15603h = qk7.m25743b(str);
    }

    /* renamed from: v */
    public static int m23280v(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                gk3.m18132i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    public static int m23281w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        gk3.m18132i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
