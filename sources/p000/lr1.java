package p000;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: lr1 */
/* compiled from: ErrorType.kt */
public final class lr1 extends d36 {

    /* renamed from: d */
    public final yz6 f40680d;

    /* renamed from: e */
    public final MemberScope f40681e;

    /* renamed from: g */
    public final ErrorTypeKind f40682g;

    /* renamed from: k */
    public final List<f17> f40683k;

    /* renamed from: r */
    public final boolean f40684r;

    /* renamed from: s */
    public final String[] f40685s;

    /* renamed from: x */
    public final String f40686x;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr1(yz6 yz6, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yz6, memberScope, errorTypeKind, (i & 8) != 0 ? ck0.m33062j() : list, (i & 16) != 0 ? false : z, strArr);
    }

    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return this.f40683k;
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return rz6.f44504d.mo65783h();
    }

    /* renamed from: H0 */
    public yz6 mo51134H0() {
        return this.f40680d;
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return this.f40684r;
    }

    /* renamed from: O0 */
    public d36 mo51137L0(boolean z) {
        yz6 H0 = mo51134H0();
        MemberScope m = mo51146m();
        ErrorTypeKind errorTypeKind = this.f40682g;
        List<f17> F0 = mo51132F0();
        String[] strArr = this.f40685s;
        return new lr1(H0, m, errorTypeKind, F0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return this;
    }

    /* renamed from: Q0 */
    public final String mo55967Q0() {
        return this.f40686x;
    }

    /* renamed from: R0 */
    public final ErrorTypeKind mo55968R0() {
        return this.f40682g;
    }

    /* renamed from: S0 */
    public lr1 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        return this.f40681e;
    }

    public lr1(yz6 yz6, MemberScope memberScope, ErrorTypeKind errorTypeKind, List<? extends f17> list, boolean z, String... strArr) {
        vx2.m53591g(yz6, "constructor");
        vx2.m53591g(memberScope, "memberScope");
        vx2.m53591g(errorTypeKind, "kind");
        vx2.m53591g(list, "arguments");
        vx2.m53591g(strArr, "formatParams");
        this.f40680d = yz6;
        this.f40681e = memberScope;
        this.f40682g = errorTypeKind;
        this.f40683k = list;
        this.f40684r = z;
        this.f40685s = strArr;
        cb6 cb6 = cb6.f21669a;
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        vx2.m53590f(format, "format(format, *args)");
        this.f40686x = format;
    }
}
