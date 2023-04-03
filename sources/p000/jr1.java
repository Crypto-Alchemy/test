package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: jr1 */
/* compiled from: ErrorScope.kt */
public class jr1 implements MemberScope {

    /* renamed from: b */
    public final ErrorScopeKind f38772b;

    /* renamed from: c */
    public final String f38773c;

    public jr1(ErrorScopeKind errorScopeKind, String... strArr) {
        vx2.m53591g(errorScopeKind, "kind");
        vx2.m53591g(strArr, "formatParams");
        this.f38772b = errorScopeKind;
        String debugMessage = errorScopeKind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        vx2.m53590f(format, "format(this, *args)");
        this.f38773c = format;
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        return ny5.m49095e();
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        return ny5.m49095e();
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        String format = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{r24}, 1));
        vx2.m53590f(format, "format(this, *args)");
        r24 m = r24.m71447m(format);
        vx2.m53590f(m, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new br1(m);
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        return ck0.m33062j();
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return ny5.m49095e();
    }

    /* renamed from: h */
    public Set<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return my5.m48548d(new cr1(nr1.f43548a.mo62788h()));
    }

    /* renamed from: i */
    public Set<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return nr1.f43548a.mo62790j();
    }

    /* renamed from: j */
    public final String mo52770j() {
        return this.f38773c;
    }

    public String toString() {
        return "ErrorScope{" + this.f38773c + '}';
    }
}
