package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0001\u0010\u0001\u00020\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Lxw4;", "", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "d", "(Ljava/lang/String;)I", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "b", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xw4 */
/* compiled from: ProjectId.kt */
public final class xw4 {

    /* renamed from: a */
    public final String f35709a;

    public /* synthetic */ xw4(String str) {
        this.f35709a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ xw4 m54573a(String str) {
        return new xw4(str);
    }

    /* renamed from: b */
    public static String m54574b(String str) {
        vx2.m53591g(str, "value");
        return str;
    }

    /* renamed from: c */
    public static boolean m54575c(String str, Object obj) {
        return (obj instanceof xw4) && vx2.m53586b(str, ((xw4) obj).mo49561f());
    }

    /* renamed from: d */
    public static int m54576d(String str) {
        return str.hashCode();
    }

    /* renamed from: e */
    public static String m54577e(String str) {
        return "ProjectId(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m54575c(this.f35709a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ String mo49561f() {
        return this.f35709a;
    }

    public int hashCode() {
        return m54576d(this.f35709a);
    }

    public String toString() {
        return m54577e(this.f35709a);
    }
}
