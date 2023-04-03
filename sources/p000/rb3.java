package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rb3 */
/* compiled from: KeysMap */
public class rb3 {

    /* renamed from: a */
    public final Map<String, String> f33391a = new HashMap();

    /* renamed from: b */
    public int f33392b;

    /* renamed from: c */
    public int f33393c;

    public rb3(int i, int i2) {
        this.f33392b = i;
        this.f33393c = i2;
    }

    /* renamed from: a */
    public Map<String, String> mo47369a() {
        return Collections.unmodifiableMap(this.f33391a);
    }

    /* renamed from: b */
    public String mo47370b(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        int length = trim.length();
        int i = this.f33393c;
        if (length > i) {
            return trim.substring(0, i);
        }
        return trim;
    }

    /* renamed from: c */
    public final String mo47371c(String str) {
        if (str != null) {
            return mo47370b(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public void mo47372d(Map<String, String> map) {
        mo47373e(map);
    }

    /* renamed from: e */
    public final synchronized void mo47373e(Map<String, String> map) {
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            String c = mo47371c((String) next.getKey());
            if (next.getValue() == null) {
                str = "";
            } else {
                str = mo47370b((String) next.getValue());
            }
            if (this.f33391a.containsKey(c)) {
                hashMap.put(c, str);
            } else {
                hashMap2.put(c, str);
            }
        }
        this.f33391a.putAll(hashMap);
        int size = this.f33391a.size() + hashMap2.size();
        int i = this.f33392b;
        if (size > i) {
            int size2 = i - this.f33391a.size();
            rk3 f = rk3.m51112f();
            f.mo47429i("Exceeded maximum number of custom attributes (" + this.f33392b + ").");
            hashMap2.keySet().retainAll(new ArrayList(hashMap2.keySet()).subList(0, size2));
        }
        this.f33391a.putAll(hashMap2);
    }
}
