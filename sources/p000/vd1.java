package p000;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: vd1 */
/* compiled from: DeserializedPackageFragment.kt */
public abstract class vd1 extends gk4 {

    /* renamed from: s */
    public final da6 f45276s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vd1(u82 u82, da6 da6, mx3 mx3) {
        super(mx3, u82);
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(mx3, "module");
        this.f45276s = da6;
    }

    /* renamed from: A0 */
    public abstract hf0 mo55125A0();

    /* renamed from: E0 */
    public boolean mo66490E0(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        MemberScope m = mo51712m();
        if (!(m instanceof DeserializedMemberScope) || !((DeserializedMemberScope) m).mo55202q().contains(r24)) {
            return false;
        }
        return true;
    }

    /* renamed from: F0 */
    public abstract void mo55126F0(id1 id1);
}
