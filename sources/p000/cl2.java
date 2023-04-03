package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: cl2 */
/* compiled from: HandshakedataImpl1 */
public class cl2 implements yk2 {

    /* renamed from: a */
    public byte[] f37164a;

    /* renamed from: b */
    public TreeMap<String, String> f37165b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: b */
    public boolean mo50616b(String str) {
        return this.f37165b.containsKey(str);
    }

    /* renamed from: d */
    public Iterator<String> mo50617d() {
        return Collections.unmodifiableSet(this.f37165b.keySet()).iterator();
    }

    public byte[] getContent() {
        return this.f37164a;
    }

    /* renamed from: h */
    public String mo50619h(String str) {
        String str2 = this.f37165b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public void put(String str, String str2) {
        this.f37165b.put(str, str2);
    }
}
