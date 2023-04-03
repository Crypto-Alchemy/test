package p000;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.b83;

/* renamed from: ss3 */
/* compiled from: MemberSignature.kt */
public final class ss3 {

    /* renamed from: b */
    public static final C9315a f44599b = new C9315a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f44600a;

    /* renamed from: ss3$a */
    /* compiled from: MemberSignature.kt */
    public static final class C9315a {
        public C9315a() {
        }

        public /* synthetic */ C9315a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ss3 mo65902a(String str, String str2) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "desc");
            return new ss3(str + '#' + str2, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final ss3 mo65903b(b83 b83) {
            vx2.m53591g(b83, "signature");
            if (b83 instanceof b83.C6855b) {
                return mo65905d(b83.mo50521c(), b83.mo50520b());
            }
            if (b83 instanceof b83.C6854a) {
                return mo65902a(b83.mo50521c(), b83.mo50520b());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: c */
        public final ss3 mo65904c(t24 t24, JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            vx2.m53591g(t24, "nameResolver");
            vx2.m53591g(jvmMethodSignature, "signature");
            return mo65905d(t24.getString(jvmMethodSignature.getName()), t24.getString(jvmMethodSignature.getDesc()));
        }

        /* renamed from: d */
        public final ss3 mo65905d(String str, String str2) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "desc");
            return new ss3(str + str2, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public final ss3 mo65906e(ss3 ss3, int i) {
            vx2.m53591g(ss3, "signature");
            return new ss3(ss3.mo65898a() + '@' + i, (DefaultConstructorMarker) null);
        }
    }

    public ss3(String str) {
        this.f44600a = str;
    }

    public /* synthetic */ ss3(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public final String mo65898a() {
        return this.f44600a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss3) && vx2.m53586b(this.f44600a, ((ss3) obj).f44600a);
    }

    public int hashCode() {
        return this.f44600a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f44600a + ')';
    }
}
