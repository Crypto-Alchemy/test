package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0001\u0010\u0001\u00020\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Lty4;", "Lba3;", "", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Ljava/lang/String;)I", "", "other", "", "d", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "keyAsHex", "c", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ty4 */
/* compiled from: Key.kt */
public final class ty4 implements ba3 {

    /* renamed from: a */
    public final String f34421a;

    public /* synthetic */ ty4(String str) {
        this.f34421a = str;
    }

    /* renamed from: b */
    public static final /* synthetic */ ty4 m52568b(String str) {
        return new ty4(str);
    }

    /* renamed from: c */
    public static String m52569c(String str) {
        vx2.m53591g(str, "keyAsHex");
        return str;
    }

    /* renamed from: d */
    public static boolean m52570d(String str, Object obj) {
        return (obj instanceof ty4) && vx2.m53586b(str, ((ty4) obj).mo48276h());
    }

    /* renamed from: e */
    public static final boolean m52571e(String str, String str2) {
        return vx2.m53586b(str, str2);
    }

    /* renamed from: f */
    public static int m52572f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m52573g(String str) {
        return "PublicKey(keyAsHex=" + str + ")";
    }

    /* renamed from: a */
    public String mo29510a() {
        return this.f34421a;
    }

    public boolean equals(Object obj) {
        return m52570d(this.f34421a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo48276h() {
        return this.f34421a;
    }

    public int hashCode() {
        return m52572f(this.f34421a);
    }

    public String toString() {
        return m52573g(this.f34421a);
    }
}
