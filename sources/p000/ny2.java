package p000;

import com.walletconnect.android.internal.common.model.Tags;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\n\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lny2;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/walletconnect/android/internal/common/model/Tags;", "a", "Lcom/walletconnect/android/internal/common/model/Tags;", "b", "()Lcom/walletconnect/android/internal/common/model/Tags;", "tag", "Lky6;", "Lky6;", "c", "()Lky6;", "ttl", "Z", "()Z", "prompt", "<init>", "(Lcom/walletconnect/android/internal/common/model/Tags;Lky6;Z)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ny2 */
/* compiled from: IrnParams.kt */
public final class ny2 {

    /* renamed from: a */
    public final Tags f32221a;

    /* renamed from: b */
    public final ky6 f32222b;

    /* renamed from: c */
    public final boolean f32223c;

    public ny2(Tags tags, ky6 ky6, boolean z) {
        vx2.m53591g(tags, "tag");
        vx2.m53591g(ky6, ENS.FUNC_TTL);
        this.f32221a = tags;
        this.f32222b = ky6;
        this.f32223c = z;
    }

    /* renamed from: a */
    public final boolean mo46252a() {
        return this.f32223c;
    }

    /* renamed from: b */
    public final Tags mo46253b() {
        return this.f32221a;
    }

    /* renamed from: c */
    public final ky6 mo46254c() {
        return this.f32222b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny2)) {
            return false;
        }
        ny2 ny2 = (ny2) obj;
        return this.f32221a == ny2.f32221a && vx2.m53586b(this.f32222b, ny2.f32222b) && this.f32223c == ny2.f32223c;
    }

    public int hashCode() {
        int hashCode = ((this.f32221a.hashCode() * 31) + this.f32222b.hashCode()) * 31;
        boolean z = this.f32223c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        Tags tags = this.f32221a;
        ky6 ky6 = this.f32222b;
        boolean z = this.f32223c;
        return "IrnParams(tag=" + tags + ", ttl=" + ky6 + ", prompt=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny2(Tags tags, ky6 ky6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tags, ky6, (i & 4) != 0 ? false : z);
    }
}
