package p000;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lh87;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: h87 */
/* compiled from: InspectableValue.kt */
public final class h87 {

    /* renamed from: a */
    public final String f12782a;

    /* renamed from: b */
    public final Object f12783b;

    public h87(String str, Object obj) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        this.f12782a = str;
        this.f12783b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h87)) {
            return false;
        }
        h87 h87 = (h87) obj;
        return vx2.m53586b(this.f12782a, h87.f12782a) && vx2.m53586b(this.f12783b, h87.f12783b);
    }

    public int hashCode() {
        int hashCode = this.f12782a.hashCode() * 31;
        Object obj = this.f12783b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f12782a + ", value=" + this.f12783b + ')';
    }
}
