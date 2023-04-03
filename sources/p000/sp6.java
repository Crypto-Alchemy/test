package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: sp6 */
/* compiled from: ThrowingScope.kt */
public final class sp6 extends jr1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sp6(ErrorScopeKind errorScopeKind, String... strArr) {
        super(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        vx2.m53591g(errorScopeKind, "kind");
        vx2.m53591g(strArr, "formatParams");
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        throw new IllegalStateException(mo52770j() + ", required name: " + r24);
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        throw new IllegalStateException(mo52770j());
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public Set<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        throw new IllegalStateException(mo52770j() + ", required name: " + r24);
    }

    /* renamed from: i */
    public Set<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        throw new IllegalStateException(mo52770j() + ", required name: " + r24);
    }

    public String toString() {
        return "ThrowingScope{" + mo52770j() + '}';
    }
}
