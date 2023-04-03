package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: ex3 */
/* compiled from: ModuleAwareClassDescriptor.kt */
public abstract class ex3 implements if0 {

    /* renamed from: a */
    public static final C7057a f37676a = new C7057a((DefaultConstructorMarker) null);

    /* renamed from: ex3$a */
    /* compiled from: ModuleAwareClassDescriptor.kt */
    public static final class C7057a {
        public C7057a() {
        }

        public /* synthetic */ C7057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MemberScope mo51547a(if0 if0, p17 p17, bd3 bd3) {
            ex3 ex3;
            MemberScope Q;
            vx2.m53591g(if0, "<this>");
            vx2.m53591g(p17, "typeSubstitution");
            vx2.m53591g(bd3, "kotlinTypeRefiner");
            if (if0 instanceof ex3) {
                ex3 = (ex3) if0;
            } else {
                ex3 = null;
            }
            if (ex3 != null && (Q = ex3.mo50707Q(p17, bd3)) != null) {
                return Q;
            }
            MemberScope D = if0.mo52459D(p17);
            vx2.m53590f(D, "this.getMemberScope(\n   …ubstitution\n            )");
            return D;
        }

        /* renamed from: b */
        public final MemberScope mo51548b(if0 if0, bd3 bd3) {
            ex3 ex3;
            MemberScope b0;
            vx2.m53591g(if0, "<this>");
            vx2.m53591g(bd3, "kotlinTypeRefiner");
            if (if0 instanceof ex3) {
                ex3 = (ex3) if0;
            } else {
                ex3 = null;
            }
            if (ex3 != null && (b0 = ex3.mo51546b0(bd3)) != null) {
                return b0;
            }
            MemberScope S = if0.mo52462S();
            vx2.m53590f(S, "this.unsubstitutedMemberScope");
            return S;
        }
    }

    /* renamed from: Q */
    public abstract MemberScope mo50707Q(p17 p17, bd3 bd3);

    /* renamed from: b0 */
    public abstract MemberScope mo51546b0(bd3 bd3);
}
