package p000;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kb6 */
/* compiled from: StringUtils */
public class kb6 {

    /* renamed from: a */
    public static Map<Character, String> f30797a;

    /* renamed from: b */
    public static final String f30798b = System.getProperty("line.separator");

    static {
        HashMap hashMap = new HashMap();
        f30797a = hashMap;
        hashMap.put('\'', "\\'");
        f30797a.put(Character.valueOf(JsonFactory.DEFAULT_QUOTE_CHAR), "\\\"");
        f30797a.put('\\', "\\\\");
        f30797a.put('/', "\\/");
        f30797a.put(8, "\\b");
        f30797a.put(10, "\\n");
        f30797a.put(9, "\\t");
        f30797a.put(12, "\\f");
        f30797a.put(13, "\\r");
    }

    /* renamed from: a */
    public static List<String> m46948a(String str) {
        if (!m46949b(str)) {
            return kj0.m47121l(new ArrayList(0));
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (m46949b(str2)) {
                arrayList.add(str2);
            }
        }
        return kj0.m47121l(arrayList);
    }

    /* renamed from: b */
    public static boolean m46949b(String str) {
        if (str == null || str.trim().length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m46950c(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String d : strArr) {
            if (m46951d(d)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m46951d(String str) {
        return !m46949b(str);
    }

    /* renamed from: e */
    public static boolean m46952e(String str) {
        if (m46951d(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static String m46953f(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (m46949b(list.get(i))) {
                sb.append(list.get(i));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static String m46954g(String... strArr) {
        List list;
        if (strArr == null) {
            list = null;
        } else {
            list = Arrays.asList(strArr);
        }
        return m46953f(list);
    }

    /* renamed from: h */
    public static String m46955h(List<? extends Number> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Number number : list) {
                if (number != null) {
                    arrayList.add(number.toString());
                }
            }
        } else {
            arrayList = null;
        }
        return m46953f(arrayList);
    }
}
