package p000;

import androidx.media3.extractor.flv.TagPayloadReader;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: qn5 */
/* compiled from: ScriptTagPayloadReader */
public final class qn5 extends TagPayloadReader {

    /* renamed from: b */
    public long f16988b = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: c */
    public long[] f16989c = new long[0];

    /* renamed from: d */
    public long[] f16990d = new long[0];

    public qn5() {
        super(new cl1());
    }

    /* renamed from: g */
    public static Boolean m25786g(gm4 gm4) {
        boolean z = true;
        if (gm4.mo20662D() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    public static Object m25787h(gm4 gm4, int i) {
        if (i == 0) {
            return m25789j(gm4);
        }
        if (i == 1) {
            return m25786g(gm4);
        }
        if (i == 2) {
            return m25793n(gm4);
        }
        if (i == 3) {
            return m25791l(gm4);
        }
        if (i == 8) {
            return m25790k(gm4);
        }
        if (i == 10) {
            return m25792m(gm4);
        }
        if (i != 11) {
            return null;
        }
        return m25788i(gm4);
    }

    /* renamed from: i */
    public static Date m25788i(gm4 gm4) {
        Date date = new Date((long) m25789j(gm4).doubleValue());
        gm4.mo20675Q(2);
        return date;
    }

    /* renamed from: j */
    public static Double m25789j(gm4 gm4) {
        return Double.valueOf(Double.longBitsToDouble(gm4.mo20698w()));
    }

    /* renamed from: k */
    public static HashMap<String, Object> m25790k(gm4 gm4) {
        int H = gm4.mo20666H();
        HashMap<String, Object> hashMap = new HashMap<>(H);
        for (int i = 0; i < H; i++) {
            String n = m25793n(gm4);
            Object h = m25787h(gm4, m25794o(gm4));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    public static HashMap<String, Object> m25791l(gm4 gm4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n = m25793n(gm4);
            int o = m25794o(gm4);
            if (o == 9) {
                return hashMap;
            }
            Object h = m25787h(gm4, o);
            if (h != null) {
                hashMap.put(n, h);
            }
        }
    }

    /* renamed from: m */
    public static ArrayList<Object> m25792m(gm4 gm4) {
        int H = gm4.mo20666H();
        ArrayList<Object> arrayList = new ArrayList<>(H);
        for (int i = 0; i < H; i++) {
            Object h = m25787h(gm4, m25794o(gm4));
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static String m25793n(gm4 gm4) {
        int J = gm4.mo20668J();
        int e = gm4.mo20680e();
        gm4.mo20675Q(J);
        return new String(gm4.mo20679d(), e, J);
    }

    /* renamed from: o */
    public static int m25794o(gm4 gm4) {
        return gm4.mo20662D();
    }

    /* renamed from: b */
    public boolean mo7880b(gm4 gm4) {
        return true;
    }

    /* renamed from: c */
    public boolean mo7881c(gm4 gm4, long j) {
        if (m25794o(gm4) != 2 || !"onMetaData".equals(m25793n(gm4)) || gm4.mo20676a() == 0 || m25794o(gm4) != 8) {
            return false;
        }
        HashMap<String, Object> k = m25790k(gm4);
        Object obj = k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > Utils.DOUBLE_EPSILON) {
                this.f16988b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f16989c = new long[size];
                this.f16990d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f16989c = new long[0];
                        this.f16990d = new long[0];
                    } else {
                        this.f16989c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f16990d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f16989c = new long[0];
                this.f16990d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: d */
    public long mo25178d() {
        return this.f16988b;
    }

    /* renamed from: e */
    public long[] mo25179e() {
        return this.f16990d;
    }

    /* renamed from: f */
    public long[] mo25180f() {
        return this.f16989c;
    }
}
