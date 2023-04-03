package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* renamed from: jb0 */
/* compiled from: CapturedTypeConstructor.kt */
public final class jb0 extends d36 implements nb0 {

    /* renamed from: d */
    public final f17 f38634d;

    /* renamed from: e */
    public final kb0 f38635e;

    /* renamed from: g */
    public final boolean f38636g;

    /* renamed from: k */
    public final rz6 f38637k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb0(f17 f17, kb0 kb0, boolean z, rz6 rz6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f17, (i & 2) != 0 ? new lb0(f17) : kb0, (i & 4) != 0 ? false : z, (i & 8) != 0 ? rz6.f44504d.mo65783h() : rz6);
    }

    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return ck0.m33062j();
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return this.f38637k;
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return this.f38636g;
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return new jb0(this.f38634d, mo51134H0(), mo51135I0(), rz6);
    }

    /* renamed from: Q0 */
    public kb0 mo51134H0() {
        return this.f38635e;
    }

    /* renamed from: R0 */
    public jb0 mo51121O0(boolean z) {
        if (z == mo51135I0()) {
            return this;
        }
        return new jb0(this.f38634d, mo51134H0(), z, mo51133G0());
    }

    /* renamed from: S0 */
    public jb0 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        f17 a = this.f38634d.mo51407a(bd3);
        vx2.m53590f(a, "typeProjection.refine(kotlinTypeRefiner)");
        return new jb0(a, mo51134H0(), mo51135I0(), mo51133G0());
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        return nr1.m70031a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f38634d);
        sb.append(')');
        if (mo51135I0()) {
            str = "?";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public jb0(f17 f17, kb0 kb0, boolean z, rz6 rz6) {
        vx2.m53591g(f17, "typeProjection");
        vx2.m53591g(kb0, "constructor");
        vx2.m53591g(rz6, "attributes");
        this.f38634d = f17;
        this.f38635e = kb0;
        this.f38636g = z;
        this.f38637k = rz6;
    }
}
