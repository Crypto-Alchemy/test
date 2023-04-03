package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;

/* renamed from: d64 */
/* compiled from: NewCapturedType.kt */
public final class d64 extends d36 implements nb0 {

    /* renamed from: d */
    public final CaptureStatus f37247d;

    /* renamed from: e */
    public final NewCapturedTypeConstructor f37248e;

    /* renamed from: g */
    public final w47 f37249g;

    /* renamed from: k */
    public final rz6 f37250k;

    /* renamed from: r */
    public final boolean f37251r;

    /* renamed from: s */
    public final boolean f37252s;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d64(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, w47 w47, rz6 rz6, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, w47, (i & 8) != 0 ? rz6.f44504d.mo65783h() : rz6, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return ck0.m33062j();
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return this.f37250k;
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return this.f37251r;
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return new d64(this.f37247d, mo51134H0(), this.f37249g, rz6, mo51135I0(), this.f37252s);
    }

    /* renamed from: Q0 */
    public final CaptureStatus mo51140Q0() {
        return this.f37247d;
    }

    /* renamed from: R0 */
    public NewCapturedTypeConstructor mo51134H0() {
        return this.f37248e;
    }

    /* renamed from: S0 */
    public final w47 mo51142S0() {
        return this.f37249g;
    }

    /* renamed from: T0 */
    public final boolean mo51143T0() {
        return this.f37252s;
    }

    /* renamed from: U0 */
    public d64 mo51121O0(boolean z) {
        return new d64(this.f37247d, mo51134H0(), this.f37249g, mo51133G0(), z, false, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: V0 */
    public d64 mo51138M0(bd3 bd3) {
        w47 w47;
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f37247d;
        NewCapturedTypeConstructor l = mo51134H0().mo51808a(bd3);
        w47 w472 = this.f37249g;
        if (w472 != null) {
            w47 = bd3.mo50562h(w472).mo64506K0();
        } else {
            w47 = null;
        }
        return new d64(captureStatus, l, w47, mo51133G0(), mo51135I0(), false, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        return nr1.m70031a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public d64(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, w47 w47, rz6 rz6, boolean z, boolean z2) {
        vx2.m53591g(captureStatus, "captureStatus");
        vx2.m53591g(newCapturedTypeConstructor, "constructor");
        vx2.m53591g(rz6, "attributes");
        this.f37247d = captureStatus;
        this.f37248e = newCapturedTypeConstructor;
        this.f37249g = w47;
        this.f37250k = rz6;
        this.f37251r = z;
        this.f37252s = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d64(CaptureStatus captureStatus, w47 w47, f17 f17, a17 a17) {
        this(captureStatus, new NewCapturedTypeConstructor(f17, (pc2) null, (NewCapturedTypeConstructor) null, a17, 6, (DefaultConstructorMarker) null), w47, (rz6) null, false, false, 56, (DefaultConstructorMarker) null);
        vx2.m53591g(captureStatus, "captureStatus");
        vx2.m53591g(f17, "projection");
        vx2.m53591g(a17, "typeParameter");
    }
}
