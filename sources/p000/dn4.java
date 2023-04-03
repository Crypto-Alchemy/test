package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0017"}, mo44877d2 = {"Ldn4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "peerIcon", "b", "peerName", "c", "peerUri", "d", "getPeerDescription", "peerDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "e", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dn4 */
/* compiled from: PeerUI.kt */
public final class dn4 {

    /* renamed from: e */
    public static final C6991a f37347e = new C6991a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final dn4 f37348f = new dn4("", "", "", "");

    /* renamed from: a */
    public final String f37349a;

    /* renamed from: b */
    public final String f37350b;

    /* renamed from: c */
    public final String f37351c;

    /* renamed from: d */
    public final String f37352d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Ldn4$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dn4$a */
    /* compiled from: PeerUI.kt */
    public static final class C6991a {
        public C6991a() {
        }

        public /* synthetic */ C6991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public dn4(String str, String str2, String str3, String str4) {
        vx2.m53591g(str, "peerIcon");
        vx2.m53591g(str2, "peerName");
        vx2.m53591g(str3, "peerUri");
        vx2.m53591g(str4, "peerDescription");
        this.f37349a = str;
        this.f37350b = str2;
        this.f37351c = str3;
        this.f37352d = str4;
    }

    /* renamed from: a */
    public final String mo51235a() {
        return this.f37349a;
    }

    /* renamed from: b */
    public final String mo51236b() {
        return this.f37350b;
    }

    /* renamed from: c */
    public final String mo51237c() {
        return this.f37351c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn4)) {
            return false;
        }
        dn4 dn4 = (dn4) obj;
        return vx2.m53586b(this.f37349a, dn4.f37349a) && vx2.m53586b(this.f37350b, dn4.f37350b) && vx2.m53586b(this.f37351c, dn4.f37351c) && vx2.m53586b(this.f37352d, dn4.f37352d);
    }

    public int hashCode() {
        return (((((this.f37349a.hashCode() * 31) + this.f37350b.hashCode()) * 31) + this.f37351c.hashCode()) * 31) + this.f37352d.hashCode();
    }

    public String toString() {
        String str = this.f37349a;
        String str2 = this.f37350b;
        String str3 = this.f37351c;
        String str4 = this.f37352d;
        return "PeerUI(peerIcon=" + str + ", peerName=" + str2 + ", peerUri=" + str3 + ", peerDescription=" + str4 + ")";
    }
}
