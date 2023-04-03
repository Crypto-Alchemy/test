package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0001\u0010\u0001\u00020\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Ljv4;", "Lba3;", "", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", "e", "(Ljava/lang/String;)I", "", "other", "", "d", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "keyAsHex", "c", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jv4 */
/* compiled from: Key.kt */
public final class jv4 implements ba3 {

    /* renamed from: a */
    public final String f30653a;

    public /* synthetic */ jv4(String str) {
        this.f30653a = str;
    }

    /* renamed from: b */
    public static final /* synthetic */ jv4 m46790b(String str) {
        return new jv4(str);
    }

    /* renamed from: c */
    public static String m46791c(String str) {
        vx2.m53591g(str, "keyAsHex");
        return str;
    }

    /* renamed from: d */
    public static boolean m46792d(String str, Object obj) {
        return (obj instanceof jv4) && vx2.m53586b(str, ((jv4) obj).mo44621g());
    }

    /* renamed from: e */
    public static int m46793e(String str) {
        return str.hashCode();
    }

    /* renamed from: f */
    public static String m46794f(String str) {
        return "PrivateKey(keyAsHex=" + str + ")";
    }

    /* renamed from: a */
    public String mo29510a() {
        return this.f30653a;
    }

    public boolean equals(Object obj) {
        return m46792d(this.f30653a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ String mo44621g() {
        return this.f30653a;
    }

    public int hashCode() {
        return m46793e(this.f30653a);
    }

    public String toString() {
        return m46794f(this.f30653a);
    }
}
