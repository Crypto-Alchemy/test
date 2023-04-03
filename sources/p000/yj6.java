package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0001\u0010\u0001\u00020\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Lyj6;", "Lba3;", "", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "f", "(Ljava/lang/String;)I", "", "other", "", "d", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "keyAsHex", "c", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yj6 */
/* compiled from: SymmetricKey.kt */
public final class yj6 implements ba3 {

    /* renamed from: a */
    public final String f35893a;

    public /* synthetic */ yj6(String str) {
        this.f35893a = str;
    }

    /* renamed from: b */
    public static final /* synthetic */ yj6 m54788b(String str) {
        return new yj6(str);
    }

    /* renamed from: c */
    public static String m54789c(String str) {
        vx2.m53591g(str, "keyAsHex");
        return str;
    }

    /* renamed from: d */
    public static boolean m54790d(String str, Object obj) {
        return (obj instanceof yj6) && vx2.m53586b(str, ((yj6) obj).mo49686h());
    }

    /* renamed from: e */
    public static final boolean m54791e(String str, String str2) {
        return vx2.m53586b(str, str2);
    }

    /* renamed from: f */
    public static int m54792f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m54793g(String str) {
        return "SymmetricKey(keyAsHex=" + str + ")";
    }

    /* renamed from: a */
    public String mo29510a() {
        return this.f35893a;
    }

    public boolean equals(Object obj) {
        return m54790d(this.f35893a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo49686h() {
        return this.f35893a;
    }

    public int hashCode() {
        return m54792f(this.f35893a);
    }

    public String toString() {
        return m54793g(this.f35893a);
    }
}
