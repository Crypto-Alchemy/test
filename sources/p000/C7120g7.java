package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* renamed from: g7 */
/* compiled from: StubTypes.kt */
public abstract class C7120g7 extends d36 {

    /* renamed from: k */
    public static final C7121a f37979k = new C7121a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public final n64 f37980d;

    /* renamed from: e */
    public final boolean f37981e;

    /* renamed from: g */
    public final MemberScope f37982g;

    /* renamed from: g7$a */
    /* compiled from: StubTypes.kt */
    public static final class C7121a {
        public C7121a() {
        }

        public /* synthetic */ C7121a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C7120g7(n64 n64, boolean z) {
        vx2.m53591g(n64, "originalTypeVariable");
        this.f37980d = n64;
        this.f37981e = z;
        this.f37982g = nr1.m70032b(ErrorScopeKind.STUB_TYPE_SCOPE, n64.toString());
    }

    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return ck0.m33062j();
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return rz6.f44504d.mo65783h();
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return this.f37981e;
    }

    /* renamed from: O0 */
    public d36 mo51137L0(boolean z) {
        if (z == mo51135I0()) {
            return this;
        }
        return mo51446R0(z);
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return this;
    }

    /* renamed from: Q0 */
    public final n64 mo51871Q0() {
        return this.f37980d;
    }

    /* renamed from: R0 */
    public abstract C7120g7 mo51446R0(boolean z);

    /* renamed from: S0 */
    public C7120g7 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        return this.f37982g;
    }
}
