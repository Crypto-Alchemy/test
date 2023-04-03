package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p000.dx0;

/* renamed from: my6 */
/* compiled from: TtmlNode */
public final class my6 {

    /* renamed from: a */
    public final String f15280a;

    /* renamed from: b */
    public final String f15281b;

    /* renamed from: c */
    public final boolean f15282c;

    /* renamed from: d */
    public final long f15283d;

    /* renamed from: e */
    public final long f15284e;

    /* renamed from: f */
    public final py6 f15285f;

    /* renamed from: g */
    public final String[] f15286g;

    /* renamed from: h */
    public final String f15287h;

    /* renamed from: i */
    public final String f15288i;

    /* renamed from: j */
    public final my6 f15289j;

    /* renamed from: k */
    public final HashMap<String, Integer> f15290k;

    /* renamed from: l */
    public final HashMap<String, Integer> f15291l;

    /* renamed from: m */
    public List<my6> f15292m;

    public my6(String str, String str2, long j, long j2, py6 py6, String[] strArr, String str3, String str4, my6 my6) {
        boolean z;
        this.f15280a = str;
        this.f15281b = str2;
        this.f15288i = str4;
        this.f15285f = py6;
        this.f15286g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f15282c = z;
        this.f15283d = j;
        this.f15284e = j2;
        this.f15287h = (String) C2725kr.m20985e(str3);
        this.f15289j = my6;
        this.f15290k = new HashMap<>();
        this.f15291l = new HashMap<>();
    }

    /* renamed from: c */
    public static my6 m22676c(String str, long j, long j2, py6 py6, String[] strArr, String str2, String str3, my6 my6) {
        return new my6(str, (String) null, j, j2, py6, strArr, str2, str3, my6);
    }

    /* renamed from: d */
    public static my6 m22677d(String str) {
        return new my6((String) null, oy6.m24448b(str), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, (py6) null, (String[]) null, "", (String) null, (my6) null);
    }

    /* renamed from: e */
    public static void m22678e(SpannableStringBuilder spannableStringBuilder) {
        for (zb1 zb1 : (zb1[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zb1.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zb1), spannableStringBuilder.getSpanEnd(zb1), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == 10) {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == 10) {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* renamed from: k */
    public static SpannableStringBuilder m22679k(String str, Map<String, dx0.C2206b> map) {
        if (!map.containsKey(str)) {
            dx0.C2206b bVar = new dx0.C2206b();
            bVar.mo18993o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C2725kr.m20985e(map.get(str).mo18983e());
    }

    /* renamed from: a */
    public void mo23422a(my6 my6) {
        if (this.f15292m == null) {
            this.f15292m = new ArrayList();
        }
        this.f15292m.add(my6);
    }

    /* renamed from: b */
    public final void mo23423b(Map<String, py6> map, dx0.C2206b bVar, int i, int i2, int i3) {
        py6 f = oy6.m24452f(this.f15285f, this.f15286g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.mo18983e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.mo18993o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f != null) {
            oy6.m24447a(spannableStringBuilder2, i, i2, f, this.f15289j, map, i3);
            if ("p".equals(this.f15280a)) {
                if (f.mo24850k() != Float.MAX_VALUE) {
                    bVar.mo18991m((f.mo24850k() * -90.0f) / 100.0f);
                }
                if (f.mo24852m() != null) {
                    bVar.mo18994p(f.mo24852m());
                }
                if (f.mo24847h() != null) {
                    bVar.mo18988j(f.mo24847h());
                }
            }
        }
    }

    /* renamed from: f */
    public my6 mo23424f(int i) {
        List<my6> list = this.f15292m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo23425g() {
        List<my6> list = this.f15292m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<dx0> mo23426h(long j, Map<String, py6> map, Map<String, ny6> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        mo23431n(j, this.f15287h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        mo23433p(j2, false, this.f15287h, treeMap);
        mo23432o(j2, map, map2, this.f15287h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                ny6 ny6 = (ny6) C2725kr.m20985e(map2.get(pair.first));
                arrayList2.add(new dx0.C2206b().mo18984f(decodeByteArray).mo18989k(ny6.f15728b).mo18990l(0).mo18986h(ny6.f15729c, 0).mo18987i(ny6.f15731e).mo18992n(ny6.f15732f).mo18985g(ny6.f15733g).mo18996r(ny6.f15736j).mo18979a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ny6 ny62 = (ny6) C2725kr.m20985e(map2.get(entry.getKey()));
            dx0.C2206b bVar = (dx0.C2206b) entry.getValue();
            m22678e((SpannableStringBuilder) C2725kr.m20985e(bVar.mo18983e()));
            bVar.mo18986h(ny62.f15729c, ny62.f15730d);
            bVar.mo18987i(ny62.f15731e);
            bVar.mo18989k(ny62.f15728b);
            bVar.mo18992n(ny62.f15732f);
            bVar.mo18995q(ny62.f15735i, ny62.f15734h);
            bVar.mo18996r(ny62.f15736j);
            arrayList2.add(bVar.mo18979a());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void mo23427i(TreeSet<Long> treeSet, boolean z) {
        boolean z2;
        boolean equals = "p".equals(this.f15280a);
        boolean equals2 = "div".equals(this.f15280a);
        if (z || equals || (equals2 && this.f15288i != null)) {
            long j = this.f15283d;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f15284e;
            if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f15292m != null) {
            for (int i = 0; i < this.f15292m.size(); i++) {
                my6 my6 = this.f15292m.get(i);
                if (z || equals) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                my6.mo23427i(treeSet, z2);
            }
        }
    }

    /* renamed from: j */
    public long[] mo23428j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        mo23427i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] mo23429l() {
        return this.f15286g;
    }

    /* renamed from: m */
    public boolean mo23430m(long j) {
        long j2 = this.f15283d;
        if ((j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || this.f15284e != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) && ((j2 > j || this.f15284e != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) && ((j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j >= this.f15284e) && (j2 > j || j >= this.f15284e)))) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void mo23431n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f15287h)) {
            str = this.f15287h;
        }
        if (!mo23430m(j) || !"div".equals(this.f15280a) || this.f15288i == null) {
            for (int i = 0; i < mo23425g(); i++) {
                mo23424f(i).mo23431n(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f15288i));
    }

    /* renamed from: o */
    public final void mo23432o(long j, Map<String, py6> map, Map<String, ny6> map2, String str, Map<String, dx0.C2206b> map3) {
        String str2;
        int i;
        if (mo23430m(j)) {
            if ("".equals(this.f15287h)) {
                str2 = str;
            } else {
                str2 = this.f15287h;
            }
            Iterator<Map.Entry<String, Integer>> it = this.f15291l.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                if (this.f15290k.containsKey(str3)) {
                    i = this.f15290k.get(str3).intValue();
                }
                int i2 = i;
                int intValue = ((Integer) next.getValue()).intValue();
                if (i2 != intValue) {
                    Map<String, py6> map4 = map;
                    mo23423b(map4, (dx0.C2206b) C2725kr.m20985e(map3.get(str3)), i2, intValue, ((ny6) C2725kr.m20985e(map2.get(str2))).f15736j);
                } else {
                    Map<String, ny6> map5 = map2;
                    Map<String, dx0.C2206b> map6 = map3;
                }
            }
            Map<String, ny6> map7 = map2;
            Map<String, dx0.C2206b> map8 = map3;
            while (i < mo23425g()) {
                mo23424f(i).mo23432o(j, map, map2, str2, map3);
                i++;
                Map<String, ny6> map9 = map2;
            }
        }
    }

    /* renamed from: p */
    public final void mo23433p(long j, boolean z, String str, Map<String, dx0.C2206b> map) {
        boolean z2;
        this.f15290k.clear();
        this.f15291l.clear();
        if (!"metadata".equals(this.f15280a)) {
            if (!"".equals(this.f15287h)) {
                str = this.f15287h;
            }
            if (this.f15282c && z) {
                m22679k(str, map).append((CharSequence) C2725kr.m20985e(this.f15281b));
            } else if ("br".equals(this.f15280a) && z) {
                m22679k(str, map).append(10);
            } else if (mo23430m(j)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f15290k.put((String) next.getKey(), Integer.valueOf(((CharSequence) C2725kr.m20985e(((dx0.C2206b) next.getValue()).mo18983e())).length()));
                }
                boolean equals = "p".equals(this.f15280a);
                for (int i = 0; i < mo23425g(); i++) {
                    my6 f = mo23424f(i);
                    if (z || equals) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    f.mo23433p(j, z2, str, map);
                }
                if (equals) {
                    oy6.m24449c(m22679k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f15291l.put((String) next2.getKey(), Integer.valueOf(((CharSequence) C2725kr.m20985e(((dx0.C2206b) next2.getValue()).mo18983e())).length()));
                }
            }
        }
    }
}
