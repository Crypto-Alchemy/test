package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: b83 */
/* compiled from: JvmMemberSignature.kt */
public abstract class b83 {

    /* renamed from: b83$a */
    /* compiled from: JvmMemberSignature.kt */
    public static final class C6854a extends b83 {

        /* renamed from: a */
        public final String f36707a;

        /* renamed from: b */
        public final String f36708b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6854a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "desc");
            this.f36707a = str;
            this.f36708b = str2;
        }

        /* renamed from: a */
        public String mo50519a() {
            return mo50521c() + ':' + mo50520b();
        }

        /* renamed from: b */
        public String mo50520b() {
            return this.f36708b;
        }

        /* renamed from: c */
        public String mo50521c() {
            return this.f36707a;
        }

        /* renamed from: d */
        public final String mo50523d() {
            return mo50521c();
        }

        /* renamed from: e */
        public final String mo50524e() {
            return mo50520b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6854a)) {
                return false;
            }
            C6854a aVar = (C6854a) obj;
            return vx2.m53586b(mo50521c(), aVar.mo50521c()) && vx2.m53586b(mo50520b(), aVar.mo50520b());
        }

        public int hashCode() {
            return (mo50521c().hashCode() * 31) + mo50520b().hashCode();
        }
    }

    /* renamed from: b83$b */
    /* compiled from: JvmMemberSignature.kt */
    public static final class C6855b extends b83 {

        /* renamed from: a */
        public final String f36709a;

        /* renamed from: b */
        public final String f36710b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6855b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "desc");
            this.f36709a = str;
            this.f36710b = str2;
        }

        /* renamed from: a */
        public String mo50519a() {
            return mo50521c() + mo50520b();
        }

        /* renamed from: b */
        public String mo50520b() {
            return this.f36710b;
        }

        /* renamed from: c */
        public String mo50521c() {
            return this.f36709a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6855b)) {
                return false;
            }
            C6855b bVar = (C6855b) obj;
            return vx2.m53586b(mo50521c(), bVar.mo50521c()) && vx2.m53586b(mo50520b(), bVar.mo50520b());
        }

        public int hashCode() {
            return (mo50521c().hashCode() * 31) + mo50520b().hashCode();
        }
    }

    public b83() {
    }

    public /* synthetic */ b83(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo50519a();

    /* renamed from: b */
    public abstract String mo50520b();

    /* renamed from: c */
    public abstract String mo50521c();

    public final String toString() {
        return mo50519a();
    }
}
