package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo44877d2 = {"Ljt;", "", "<init>", "()V", "a", "b", "c", "Lcom/walletconnect/auth/client/Auth$Model$Cacao$Signature;", "Ljt$a;", "Ljt$b;", "Ljt$c;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jt */
/* compiled from: Auth.kt */
public abstract class C6121jt {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Ljt$a;", "Ljt;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "isAvailable", "()Z", "<init>", "(Z)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: jt$a */
    /* compiled from: Auth.kt */
    public static final class C6122a extends C6121jt {

        /* renamed from: a */
        public final boolean f30585a;

        public C6122a(boolean z) {
            super((DefaultConstructorMarker) null);
            this.f30585a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6122a) && this.f30585a == ((C6122a) obj).f30585a;
        }

        public int hashCode() {
            boolean z = this.f30585a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f30585a;
            return "ConnectionState(isAvailable=" + z + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Ljt$b;", "Ljt;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: jt$b */
    /* compiled from: Auth.kt */
    public static final class C6123b extends C6121jt {

        /* renamed from: a */
        public final Throwable f30586a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6123b(Throwable th) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(th, "throwable");
            this.f30586a = th;
        }

        /* renamed from: a */
        public final Throwable mo44577a() {
            return this.f30586a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6123b) && vx2.m53586b(this.f30586a, ((C6123b) obj).f30586a);
        }

        public int hashCode() {
            return this.f30586a.hashCode();
        }

        public String toString() {
            Throwable th = this.f30586a;
            return "Error(throwable=" + th + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b \u0010\rR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b\u001e\u0010%¨\u0006)"}, mo44877d2 = {"Ljt$c;", "Ljt;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "type", "b", "chainId", "c", "domain", "d", "aud", "e", "l", "version", "f", "g", "nonce", "iat", "h", "nbf", "i", "exp", "j", "statement", "requestId", "", "Ljava/util/List;", "()Ljava/util/List;", "resources", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: jt$c */
    /* compiled from: Auth.kt */
    public static final class C6124c extends C6121jt {

        /* renamed from: a */
        public final String f30587a;

        /* renamed from: b */
        public final String f30588b;

        /* renamed from: c */
        public final String f30589c;

        /* renamed from: d */
        public final String f30590d;

        /* renamed from: e */
        public final String f30591e;

        /* renamed from: f */
        public final String f30592f;

        /* renamed from: g */
        public final String f30593g;

        /* renamed from: h */
        public final String f30594h;

        /* renamed from: i */
        public final String f30595i;

        /* renamed from: j */
        public final String f30596j;

        /* renamed from: k */
        public final String f30597k;

        /* renamed from: l */
        public final List<String> f30598l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6124c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "type");
            vx2.m53591g(str2, "chainId");
            vx2.m53591g(str3, "domain");
            vx2.m53591g(str4, "aud");
            vx2.m53591g(str5, "version");
            vx2.m53591g(str6, "nonce");
            vx2.m53591g(str7, "iat");
            this.f30587a = str;
            this.f30588b = str2;
            this.f30589c = str3;
            this.f30590d = str4;
            this.f30591e = str5;
            this.f30592f = str6;
            this.f30593g = str7;
            this.f30594h = str8;
            this.f30595i = str9;
            this.f30596j = str10;
            this.f30597k = str11;
            this.f30598l = list;
        }

        /* renamed from: a */
        public final String mo44581a() {
            return this.f30590d;
        }

        /* renamed from: b */
        public final String mo44582b() {
            return this.f30588b;
        }

        /* renamed from: c */
        public final String mo44583c() {
            return this.f30589c;
        }

        /* renamed from: d */
        public final String mo44584d() {
            return this.f30595i;
        }

        /* renamed from: e */
        public final String mo44585e() {
            return this.f30593g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6124c)) {
                return false;
            }
            C6124c cVar = (C6124c) obj;
            return vx2.m53586b(this.f30587a, cVar.f30587a) && vx2.m53586b(this.f30588b, cVar.f30588b) && vx2.m53586b(this.f30589c, cVar.f30589c) && vx2.m53586b(this.f30590d, cVar.f30590d) && vx2.m53586b(this.f30591e, cVar.f30591e) && vx2.m53586b(this.f30592f, cVar.f30592f) && vx2.m53586b(this.f30593g, cVar.f30593g) && vx2.m53586b(this.f30594h, cVar.f30594h) && vx2.m53586b(this.f30595i, cVar.f30595i) && vx2.m53586b(this.f30596j, cVar.f30596j) && vx2.m53586b(this.f30597k, cVar.f30597k) && vx2.m53586b(this.f30598l, cVar.f30598l);
        }

        /* renamed from: f */
        public final String mo44587f() {
            return this.f30594h;
        }

        /* renamed from: g */
        public final String mo44588g() {
            return this.f30592f;
        }

        /* renamed from: h */
        public final String mo44589h() {
            return this.f30597k;
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.f30587a.hashCode() * 31) + this.f30588b.hashCode()) * 31) + this.f30589c.hashCode()) * 31) + this.f30590d.hashCode()) * 31) + this.f30591e.hashCode()) * 31) + this.f30592f.hashCode()) * 31) + this.f30593g.hashCode()) * 31;
            String str = this.f30594h;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f30595i;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f30596j;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f30597k;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<String> list = this.f30598l;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode5 + i;
        }

        /* renamed from: i */
        public final List<String> mo44591i() {
            return this.f30598l;
        }

        /* renamed from: j */
        public final String mo44592j() {
            return this.f30596j;
        }

        /* renamed from: k */
        public final String mo44593k() {
            return this.f30587a;
        }

        /* renamed from: l */
        public final String mo44594l() {
            return this.f30591e;
        }

        public String toString() {
            String str = this.f30587a;
            String str2 = this.f30588b;
            String str3 = this.f30589c;
            String str4 = this.f30590d;
            String str5 = this.f30591e;
            String str6 = this.f30592f;
            String str7 = this.f30593g;
            String str8 = this.f30594h;
            String str9 = this.f30595i;
            String str10 = this.f30596j;
            String str11 = this.f30597k;
            List<String> list = this.f30598l;
            return "PayloadParams(type=" + str + ", chainId=" + str2 + ", domain=" + str3 + ", aud=" + str4 + ", version=" + str5 + ", nonce=" + str6 + ", iat=" + str7 + ", nbf=" + str8 + ", exp=" + str9 + ", statement=" + str10 + ", requestId=" + str11 + ", resources=" + list + ")";
        }
    }

    private C6121jt() {
    }

    public /* synthetic */ C6121jt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
