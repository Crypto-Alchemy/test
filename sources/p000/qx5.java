package p000;

import java.util.Map;
import kotlin.Metadata;
import p000.hg7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lqx5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ldn4;", "a", "Ldn4;", "()Ldn4;", "peerUI", "", "Lhg7$e$a;", "b", "Ljava/util/Map;", "getNamespaces", "()Ljava/util/Map;", "namespaces", "<init>", "(Ldn4;Ljava/util/Map;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qx5 */
/* compiled from: SessionProposalUI.kt */
public final class qx5 {

    /* renamed from: a */
    public final dn4 f44262a;

    /* renamed from: b */
    public final Map<String, hg7.C5904e.C5905a> f44263b;

    public qx5(dn4 dn4, Map<String, hg7.C5904e.C5905a> map) {
        vx2.m53591g(dn4, "peerUI");
        vx2.m53591g(map, "namespaces");
        this.f44262a = dn4;
        this.f44263b = map;
    }

    /* renamed from: a */
    public final dn4 mo65544a() {
        return this.f44262a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx5)) {
            return false;
        }
        qx5 qx5 = (qx5) obj;
        return vx2.m53586b(this.f44262a, qx5.f44262a) && vx2.m53586b(this.f44263b, qx5.f44263b);
    }

    public int hashCode() {
        return (this.f44262a.hashCode() * 31) + this.f44263b.hashCode();
    }

    public String toString() {
        dn4 dn4 = this.f44262a;
        Map<String, hg7.C5904e.C5905a> map = this.f44263b;
        return "SessionProposalUI(peerUI=" + dn4 + ", namespaces=" + map + ")";
    }
}
