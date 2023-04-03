package p000;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h80 */
/* compiled from: CacheKeyUtil */
public final class h80 {
    /* renamed from: a */
    public static String m18649a(f80 f80) {
        try {
            if (f80 instanceof lz3) {
                return m18651c(((lz3) f80).mo22991c().get(0));
            }
            return m18651c(f80);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static List<String> m18650b(f80 f80) {
        ArrayList arrayList;
        String str;
        try {
            if (f80 instanceof lz3) {
                List<f80> c = ((lz3) f80).mo22991c();
                arrayList = new ArrayList(c.size());
                for (int i = 0; i < c.size(); i++) {
                    arrayList.add(m18651c(c.get(i)));
                }
            } else {
                arrayList = new ArrayList(1);
                if (f80.mo11961b()) {
                    str = f80.mo11960a();
                } else {
                    str = m18651c(f80);
                }
                arrayList.add(str);
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m18651c(f80 f80) throws UnsupportedEncodingException {
        return yr5.m30772a(f80.mo11960a().getBytes("UTF-8"));
    }
}
