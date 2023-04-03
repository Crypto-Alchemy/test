package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wk3 */
/* compiled from: LoggerHelper */
public class wk3 {
    /* renamed from: a */
    public static String m53942a(String str) {
        if (kb6.m46951d(str)) {
            return "Zendesk";
        }
        if (str.length() > 23) {
            return str.substring(0, 23);
        }
        return str;
    }

    /* renamed from: b */
    public static char m53943b(int i) {
        if (i == 2) {
            return 'V';
        }
        if (i == 3) {
            return 'D';
        }
        if (i == 5) {
            return 'W';
        }
        if (i != 6) {
            return i != 7 ? 'I' : 'A';
        }
        return 'E';
    }

    /* renamed from: c */
    public static List<String> m53944c(String str, int i) {
        int min;
        ArrayList arrayList = new ArrayList();
        if (i < 1) {
            if (!kb6.m46949b(str)) {
                arrayList.add("");
                return arrayList;
            }
            arrayList.add(str);
            return arrayList;
        } else if (!kb6.m46949b(str)) {
            arrayList.add("");
            return arrayList;
        } else if (str.length() < i) {
            arrayList.add(str);
            return arrayList;
        } else {
            int i2 = 0;
            int length = str.length();
            while (i2 < length) {
                int indexOf = str.indexOf(kb6.f30798b, i2);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i2 + i);
                    arrayList.add(str.substring(i2, min));
                    if (min >= indexOf) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
            return arrayList;
        }
    }
}
