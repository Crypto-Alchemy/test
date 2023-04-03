package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.trustwallet.walletconnect.WCClientKt;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, mo44877d2 = {"La16;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "La16$a;", "La16$b;", "La16$c;", "La16$d;", "La16$e;", "La16$f;", "La16$g;", "La16$h;", "La16$h$a;", "La16$i;", "La16$j;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: a16 */
/* compiled from: Sign.kt */
public abstract class a16 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"La16$a;", "La16;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "()Z", "isAvailable", "<init>", "(Z)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$a */
    /* compiled from: Sign.kt */
    public static final class C3776a extends a16 {

        /* renamed from: a */
        public final boolean f20742a;

        public C3776a(boolean z) {
            super((DefaultConstructorMarker) null);
            this.f20742a = z;
        }

        /* renamed from: a */
        public final boolean mo28690a() {
            return this.f20742a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3776a) && this.f20742a == ((C3776a) obj).f20742a;
        }

        public int hashCode() {
            boolean z = this.f20742a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f20742a;
            return "ConnectionState(isAvailable=" + z + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"La16$b;", "La16;", "<init>", "()V", "a", "b", "La16$b$a;", "La16$b$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$b */
    /* compiled from: Sign.kt */
    public static abstract class C3777b extends a16 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, mo44877d2 = {"La16$b$a;", "La16$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "error", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$b$a */
        /* compiled from: Sign.kt */
        public static final class C3778a extends C3777b {

            /* renamed from: a */
            public final Throwable f20743a;

            /* renamed from: a */
            public final Throwable mo28694a() {
                return this.f20743a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3778a) && vx2.m53586b(this.f20743a, ((C3778a) obj).f20743a);
            }

            public int hashCode() {
                return this.f20743a.hashCode();
            }

            public String toString() {
                Throwable th = this.f20743a;
                return "Error(error=" + th + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, mo44877d2 = {"La16$b$b;", "La16$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "topic", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$b$b */
        /* compiled from: Sign.kt */
        public static final class C3779b extends C3777b {

            /* renamed from: a */
            public final String f20744a;

            /* renamed from: b */
            public final String f20745b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3779b(String str, String str2) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "topic");
                vx2.m53591g(str2, "reason");
                this.f20744a = str;
                this.f20745b = str2;
            }

            /* renamed from: a */
            public final String mo28698a() {
                return this.f20745b;
            }

            /* renamed from: b */
            public final String mo28699b() {
                return this.f20744a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3779b)) {
                    return false;
                }
                C3779b bVar = (C3779b) obj;
                return vx2.m53586b(this.f20744a, bVar.f20744a) && vx2.m53586b(this.f20745b, bVar.f20745b);
            }

            public int hashCode() {
                return (this.f20744a.hashCode() * 31) + this.f20745b.hashCode();
            }

            public String toString() {
                String str = this.f20744a;
                String str2 = this.f20745b;
                return "Success(topic=" + str + ", reason=" + str2 + ")";
            }
        }

        public C3777b() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3777b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"La16$c;", "La16;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$c */
    /* compiled from: Sign.kt */
    public static final class C3780c extends a16 {

        /* renamed from: a */
        public final Throwable f20746a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3780c(Throwable th) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(th, "throwable");
            this.f20746a = th;
        }

        /* renamed from: a */
        public final Throwable mo28703a() {
            return this.f20746a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3780c) && vx2.m53586b(this.f20746a, ((C3780c) obj).f20746a);
        }

        public int hashCode() {
            return this.f20746a.hashCode();
        }

        public String toString() {
            Throwable th = this.f20746a;
            return "Error(throwable=" + th + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\nB\t\b\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u000b\f¨\u0006\r"}, mo44877d2 = {"La16$d;", "La16;", "", "a", "Ljava/lang/String;", "getJsonrpc", "()Ljava/lang/String;", "jsonrpc", "<init>", "()V", "b", "La16$d$a;", "La16$d$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$d */
    /* compiled from: Sign.kt */
    public static abstract class C3781d extends a16 {

        /* renamed from: a */
        public final String f20747a;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"La16$d$a;", "La16$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "b", "J", "a", "()J", "id", "c", "I", "getCode", "()I", "code", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(JILjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$d$a */
        /* compiled from: Sign.kt */
        public static final class C3782a extends C3781d {

            /* renamed from: b */
            public final long f20748b;

            /* renamed from: c */
            public final int f20749c;

            /* renamed from: d */
            public final String f20750d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3782a(long j, int i, String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f20748b = j;
                this.f20749c = i;
                this.f20750d = str;
            }

            /* renamed from: a */
            public long mo28707a() {
                return this.f20748b;
            }

            /* renamed from: b */
            public final String mo28708b() {
                return this.f20750d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3782a)) {
                    return false;
                }
                C3782a aVar = (C3782a) obj;
                return mo28707a() == aVar.mo28707a() && this.f20749c == aVar.f20749c && vx2.m53586b(this.f20750d, aVar.f20750d);
            }

            public int hashCode() {
                return (((au0.m10781a(mo28707a()) * 31) + this.f20749c) * 31) + this.f20750d.hashCode();
            }

            public String toString() {
                long a = mo28707a();
                int i = this.f20749c;
                String str = this.f20750d;
                return "JsonRpcError(id=" + a + ", code=" + i + ", message=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"La16$d$b;", "La16$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "b", "J", "a", "()J", "id", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "result", "<init>", "(JLjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$d$b */
        /* compiled from: Sign.kt */
        public static final class C3783b extends C3781d {

            /* renamed from: b */
            public final long f20751b;

            /* renamed from: c */
            public final String f20752c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3783b(long j, String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "result");
                this.f20751b = j;
                this.f20752c = str;
            }

            /* renamed from: a */
            public long mo28712a() {
                return this.f20751b;
            }

            /* renamed from: b */
            public final String mo28713b() {
                return this.f20752c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3783b)) {
                    return false;
                }
                C3783b bVar = (C3783b) obj;
                return mo28712a() == bVar.mo28712a() && vx2.m53586b(this.f20752c, bVar.f20752c);
            }

            public int hashCode() {
                return (au0.m10781a(mo28712a()) * 31) + this.f20752c.hashCode();
            }

            public String toString() {
                long a = mo28712a();
                String str = this.f20752c;
                return "JsonRpcResult(id=" + a + ", result=" + str + ")";
            }
        }

        public C3781d() {
            super((DefaultConstructorMarker) null);
            this.f20747a = WCClientKt.JSONRPC_VERSION;
        }

        public /* synthetic */ C3781d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"La16$e;", "La16;", "<init>", "()V", "a", "b", "La16$e$a;", "La16$e$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$e */
    /* compiled from: Sign.kt */
    public static abstract class C3784e extends a16 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u000bBA\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, mo44877d2 = {"La16$e$a;", "La16$e;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "chains", "b", "d", "methods", "c", "events", "La16$e$a$a;", "extensions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$e$a */
        /* compiled from: Sign.kt */
        public static final class C3785a extends C3784e {

            /* renamed from: a */
            public final List<String> f20753a;

            /* renamed from: b */
            public final List<String> f20754b;

            /* renamed from: c */
            public final List<String> f20755c;

            /* renamed from: d */
            public final List<C3786a> f20756d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, mo44877d2 = {"La16$e$a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "chains", "b", "c", "methods", "events", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: a16$e$a$a */
            /* compiled from: Sign.kt */
            public static final class C3786a {

                /* renamed from: a */
                public final List<String> f20757a;

                /* renamed from: b */
                public final List<String> f20758b;

                /* renamed from: c */
                public final List<String> f20759c;

                public C3786a(List<String> list, List<String> list2, List<String> list3) {
                    vx2.m53591g(list, "chains");
                    vx2.m53591g(list2, "methods");
                    vx2.m53591g(list3, "events");
                    this.f20757a = list;
                    this.f20758b = list2;
                    this.f20759c = list3;
                }

                /* renamed from: a */
                public final List<String> mo28724a() {
                    return this.f20757a;
                }

                /* renamed from: b */
                public final List<String> mo28725b() {
                    return this.f20759c;
                }

                /* renamed from: c */
                public final List<String> mo28726c() {
                    return this.f20758b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3786a)) {
                        return false;
                    }
                    C3786a aVar = (C3786a) obj;
                    return vx2.m53586b(this.f20757a, aVar.f20757a) && vx2.m53586b(this.f20758b, aVar.f20758b) && vx2.m53586b(this.f20759c, aVar.f20759c);
                }

                public int hashCode() {
                    return (((this.f20757a.hashCode() * 31) + this.f20758b.hashCode()) * 31) + this.f20759c.hashCode();
                }

                public String toString() {
                    List<String> list = this.f20757a;
                    List<String> list2 = this.f20758b;
                    List<String> list3 = this.f20759c;
                    return "Extension(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3785a(List<String> list, List<String> list2, List<String> list3, List<C3786a> list4) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(list, "chains");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f20753a = list;
                this.f20754b = list2;
                this.f20755c = list3;
                this.f20756d = list4;
            }

            /* renamed from: a */
            public final List<String> mo28717a() {
                return this.f20753a;
            }

            /* renamed from: b */
            public final List<String> mo28718b() {
                return this.f20755c;
            }

            /* renamed from: c */
            public final List<C3786a> mo28719c() {
                return this.f20756d;
            }

            /* renamed from: d */
            public final List<String> mo28720d() {
                return this.f20754b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3785a)) {
                    return false;
                }
                C3785a aVar = (C3785a) obj;
                return vx2.m53586b(this.f20753a, aVar.f20753a) && vx2.m53586b(this.f20754b, aVar.f20754b) && vx2.m53586b(this.f20755c, aVar.f20755c) && vx2.m53586b(this.f20756d, aVar.f20756d);
            }

            public int hashCode() {
                int hashCode = ((((this.f20753a.hashCode() * 31) + this.f20754b.hashCode()) * 31) + this.f20755c.hashCode()) * 31;
                List<C3786a> list = this.f20756d;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                List<String> list = this.f20753a;
                List<String> list2 = this.f20754b;
                List<String> list3 = this.f20755c;
                List<C3786a> list4 = this.f20756d;
                return "Proposal(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u000bBA\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, mo44877d2 = {"La16$e$b;", "La16$e;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "b", "d", "methods", "c", "events", "La16$e$b$a;", "extensions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$e$b */
        /* compiled from: Sign.kt */
        public static final class C3787b extends C3784e {

            /* renamed from: a */
            public final List<String> f20760a;

            /* renamed from: b */
            public final List<String> f20761b;

            /* renamed from: c */
            public final List<String> f20762c;

            /* renamed from: d */
            public final List<C3788a> f20763d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, mo44877d2 = {"La16$e$b$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "b", "c", "methods", "events", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: a16$e$b$a */
            /* compiled from: Sign.kt */
            public static final class C3788a {

                /* renamed from: a */
                public final List<String> f20764a;

                /* renamed from: b */
                public final List<String> f20765b;

                /* renamed from: c */
                public final List<String> f20766c;

                public C3788a(List<String> list, List<String> list2, List<String> list3) {
                    vx2.m53591g(list, "accounts");
                    vx2.m53591g(list2, "methods");
                    vx2.m53591g(list3, "events");
                    this.f20764a = list;
                    this.f20765b = list2;
                    this.f20766c = list3;
                }

                /* renamed from: a */
                public final List<String> mo28737a() {
                    return this.f20764a;
                }

                /* renamed from: b */
                public final List<String> mo28738b() {
                    return this.f20766c;
                }

                /* renamed from: c */
                public final List<String> mo28739c() {
                    return this.f20765b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3788a)) {
                        return false;
                    }
                    C3788a aVar = (C3788a) obj;
                    return vx2.m53586b(this.f20764a, aVar.f20764a) && vx2.m53586b(this.f20765b, aVar.f20765b) && vx2.m53586b(this.f20766c, aVar.f20766c);
                }

                public int hashCode() {
                    return (((this.f20764a.hashCode() * 31) + this.f20765b.hashCode()) * 31) + this.f20766c.hashCode();
                }

                public String toString() {
                    List<String> list = this.f20764a;
                    List<String> list2 = this.f20765b;
                    List<String> list3 = this.f20766c;
                    return "Extension(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3787b(List<String> list, List<String> list2, List<String> list3, List<C3788a> list4) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(list, "accounts");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f20760a = list;
                this.f20761b = list2;
                this.f20762c = list3;
                this.f20763d = list4;
            }

            /* renamed from: a */
            public final List<String> mo28730a() {
                return this.f20760a;
            }

            /* renamed from: b */
            public final List<String> mo28731b() {
                return this.f20762c;
            }

            /* renamed from: c */
            public final List<C3788a> mo28732c() {
                return this.f20763d;
            }

            /* renamed from: d */
            public final List<String> mo28733d() {
                return this.f20761b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3787b)) {
                    return false;
                }
                C3787b bVar = (C3787b) obj;
                return vx2.m53586b(this.f20760a, bVar.f20760a) && vx2.m53586b(this.f20761b, bVar.f20761b) && vx2.m53586b(this.f20762c, bVar.f20762c) && vx2.m53586b(this.f20763d, bVar.f20763d);
            }

            public int hashCode() {
                int hashCode = ((((this.f20760a.hashCode() * 31) + this.f20761b.hashCode()) * 31) + this.f20762c.hashCode()) * 31;
                List<C3788a> list = this.f20763d;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                List<String> list = this.f20760a;
                List<String> list2 = this.f20761b;
                List<String> list3 = this.f20762c;
                List<C3788a> list4 = this.f20763d;
                return "Session(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
            }
        }

        public C3784e() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3784e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\r¨\u0006#"}, mo44877d2 = {"La16$f;", "La16;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "topic", "", "b", "J", "()J", "expiry", "", "La16$e$b;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "Ltt0$a;", "Ltt0$a;", "()Ltt0$a;", "metaData", "e", "getRedirect", "redirect", "<init>", "(Ljava/lang/String;JLjava/util/Map;Ltt0$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$f */
    /* compiled from: Sign.kt */
    public static final class C3789f extends a16 {

        /* renamed from: a */
        public final String f20767a;

        /* renamed from: b */
        public final long f20768b;

        /* renamed from: c */
        public final Map<String, C3784e.C3787b> f20769c;

        /* renamed from: d */
        public final tt0.C6536a f20770d;

        /* renamed from: e */
        public final String f20771e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3789f(String str, long j, Map<String, C3784e.C3787b> map, tt0.C6536a aVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(map, "namespaces");
            String str2 = null;
            this.f20767a = str;
            this.f20768b = j;
            this.f20769c = map;
            this.f20770d = aVar;
            this.f20771e = aVar != null ? aVar.mo48172d() : str2;
        }

        /* renamed from: a */
        public final long mo28743a() {
            return this.f20768b;
        }

        /* renamed from: b */
        public final tt0.C6536a mo28744b() {
            return this.f20770d;
        }

        /* renamed from: c */
        public final Map<String, C3784e.C3787b> mo28745c() {
            return this.f20769c;
        }

        /* renamed from: d */
        public final String mo28746d() {
            return this.f20767a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3789f)) {
                return false;
            }
            C3789f fVar = (C3789f) obj;
            return vx2.m53586b(this.f20767a, fVar.f20767a) && this.f20768b == fVar.f20768b && vx2.m53586b(this.f20769c, fVar.f20769c) && vx2.m53586b(this.f20770d, fVar.f20770d);
        }

        public int hashCode() {
            int hashCode = ((((this.f20767a.hashCode() * 31) + au0.m10781a(this.f20768b)) * 31) + this.f20769c.hashCode()) * 31;
            tt0.C6536a aVar = this.f20770d;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.f20767a;
            long j = this.f20768b;
            Map<String, C3784e.C3787b> map = this.f20769c;
            tt0.C6536a aVar = this.f20770d;
            return "Session(topic=" + str + ", expiry=" + j + ", namespaces=" + map + ", metaData=" + aVar + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\"\u0010\rR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u001d\u0010\r¨\u0006("}, mo44877d2 = {"La16$g;", "La16;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "pairingTopic", "b", "c", "name", "description", "i", "url", "", "Ljava/net/URI;", "e", "Ljava/util/List;", "()Ljava/util/List;", "icons", "", "La16$e$a;", "f", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "requiredNamespaces", "g", "proposerPublicKey", "relayProtocol", "relayData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$g */
    /* compiled from: Sign.kt */
    public static final class C3790g extends a16 {

        /* renamed from: a */
        public final String f20772a;

        /* renamed from: b */
        public final String f20773b;

        /* renamed from: c */
        public final String f20774c;

        /* renamed from: d */
        public final String f20775d;

        /* renamed from: e */
        public final List<URI> f20776e;

        /* renamed from: f */
        public final Map<String, C3784e.C3785a> f20777f;

        /* renamed from: g */
        public final String f20778g;

        /* renamed from: h */
        public final String f20779h;

        /* renamed from: i */
        public final String f20780i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3790g(String str, String str2, String str3, String str4, List<URI> list, Map<String, C3784e.C3785a> map, String str5, String str6, String str7) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "pairingTopic");
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            vx2.m53591g(str3, "description");
            vx2.m53591g(str4, "url");
            vx2.m53591g(list, "icons");
            vx2.m53591g(map, "requiredNamespaces");
            vx2.m53591g(str5, "proposerPublicKey");
            vx2.m53591g(str6, "relayProtocol");
            this.f20772a = str;
            this.f20773b = str2;
            this.f20774c = str3;
            this.f20775d = str4;
            this.f20776e = list;
            this.f20777f = map;
            this.f20778g = str5;
            this.f20779h = str6;
            this.f20780i = str7;
        }

        /* renamed from: a */
        public final String mo28750a() {
            return this.f20774c;
        }

        /* renamed from: b */
        public final List<URI> mo28751b() {
            return this.f20776e;
        }

        /* renamed from: c */
        public final String mo28752c() {
            return this.f20773b;
        }

        /* renamed from: d */
        public final String mo28753d() {
            return this.f20772a;
        }

        /* renamed from: e */
        public final String mo28754e() {
            return this.f20778g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3790g)) {
                return false;
            }
            C3790g gVar = (C3790g) obj;
            return vx2.m53586b(this.f20772a, gVar.f20772a) && vx2.m53586b(this.f20773b, gVar.f20773b) && vx2.m53586b(this.f20774c, gVar.f20774c) && vx2.m53586b(this.f20775d, gVar.f20775d) && vx2.m53586b(this.f20776e, gVar.f20776e) && vx2.m53586b(this.f20777f, gVar.f20777f) && vx2.m53586b(this.f20778g, gVar.f20778g) && vx2.m53586b(this.f20779h, gVar.f20779h) && vx2.m53586b(this.f20780i, gVar.f20780i);
        }

        /* renamed from: f */
        public final String mo28756f() {
            return this.f20780i;
        }

        /* renamed from: g */
        public final String mo28757g() {
            return this.f20779h;
        }

        /* renamed from: h */
        public final Map<String, C3784e.C3785a> mo28758h() {
            return this.f20777f;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((this.f20772a.hashCode() * 31) + this.f20773b.hashCode()) * 31) + this.f20774c.hashCode()) * 31) + this.f20775d.hashCode()) * 31) + this.f20776e.hashCode()) * 31) + this.f20777f.hashCode()) * 31) + this.f20778g.hashCode()) * 31) + this.f20779h.hashCode()) * 31;
            String str = this.f20780i;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        /* renamed from: i */
        public final String mo28760i() {
            return this.f20775d;
        }

        public String toString() {
            String str = this.f20772a;
            String str2 = this.f20773b;
            String str3 = this.f20774c;
            String str4 = this.f20775d;
            List<URI> list = this.f20776e;
            Map<String, C3784e.C3785a> map = this.f20777f;
            String str5 = this.f20778g;
            String str6 = this.f20779h;
            String str7 = this.f20780i;
            return "SessionProposal(pairingTopic=" + str + ", name=" + str2 + ", description=" + str3 + ", url=" + str4 + ", icons=" + list + ", requiredNamespaces=" + map + ", proposerPublicKey=" + str5 + ", relayProtocol=" + str6 + ", relayData=" + str7 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\nB+\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"La16$h;", "La16;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "topic", "b", "chainId", "Ltt0$a;", "c", "Ltt0$a;", "()Ltt0$a;", "peerMetaData", "La16$h$a;", "La16$h$a;", "()La16$h$a;", "request", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltt0$a;La16$h$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$h */
    /* compiled from: Sign.kt */
    public static final class C3791h extends a16 {

        /* renamed from: a */
        public final String f20781a;

        /* renamed from: b */
        public final String f20782b;

        /* renamed from: c */
        public final tt0.C6536a f20783c;

        /* renamed from: d */
        public final C3792a f20784d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"La16$h$a;", "La16;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "id", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "method", "c", "params", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$h$a */
        /* compiled from: Sign.kt */
        public static final class C3792a extends a16 {

            /* renamed from: a */
            public final long f20785a;

            /* renamed from: b */
            public final String f20786b;

            /* renamed from: c */
            public final String f20787c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3792a(long j, String str, String str2) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "method");
                vx2.m53591g(str2, "params");
                this.f20785a = j;
                this.f20786b = str;
                this.f20787c = str2;
            }

            /* renamed from: a */
            public final long mo28769a() {
                return this.f20785a;
            }

            /* renamed from: b */
            public final String mo28770b() {
                return this.f20786b;
            }

            /* renamed from: c */
            public final String mo28771c() {
                return this.f20787c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3792a)) {
                    return false;
                }
                C3792a aVar = (C3792a) obj;
                return this.f20785a == aVar.f20785a && vx2.m53586b(this.f20786b, aVar.f20786b) && vx2.m53586b(this.f20787c, aVar.f20787c);
            }

            public int hashCode() {
                return (((au0.m10781a(this.f20785a) * 31) + this.f20786b.hashCode()) * 31) + this.f20787c.hashCode();
            }

            public String toString() {
                long j = this.f20785a;
                String str = this.f20786b;
                String str2 = this.f20787c;
                return "JSONRPCRequest(id=" + j + ", method=" + str + ", params=" + str2 + ")";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3791h(String str, String str2, tt0.C6536a aVar, C3792a aVar2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(aVar2, "request");
            this.f20781a = str;
            this.f20782b = str2;
            this.f20783c = aVar;
            this.f20784d = aVar2;
        }

        /* renamed from: a */
        public final String mo28762a() {
            return this.f20782b;
        }

        /* renamed from: b */
        public final tt0.C6536a mo28763b() {
            return this.f20783c;
        }

        /* renamed from: c */
        public final C3792a mo28764c() {
            return this.f20784d;
        }

        /* renamed from: d */
        public final String mo28765d() {
            return this.f20781a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3791h)) {
                return false;
            }
            C3791h hVar = (C3791h) obj;
            return vx2.m53586b(this.f20781a, hVar.f20781a) && vx2.m53586b(this.f20782b, hVar.f20782b) && vx2.m53586b(this.f20783c, hVar.f20783c) && vx2.m53586b(this.f20784d, hVar.f20784d);
        }

        public int hashCode() {
            int hashCode = this.f20781a.hashCode() * 31;
            String str = this.f20782b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            tt0.C6536a aVar = this.f20783c;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f20784d.hashCode();
        }

        public String toString() {
            String str = this.f20781a;
            String str2 = this.f20782b;
            tt0.C6536a aVar = this.f20783c;
            C3792a aVar2 = this.f20784d;
            return "SessionRequest(topic=" + str + ", chainId=" + str2 + ", peerMetaData=" + aVar + ", request=" + aVar2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"La16$i;", "La16;", "<init>", "()V", "a", "b", "La16$i$a;", "La16$i$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$i */
    /* compiled from: Sign.kt */
    public static abstract class C3793i extends a16 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"La16$i$a;", "La16$i;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "errorMessage", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$i$a */
        /* compiled from: Sign.kt */
        public static final class C3794a extends C3793i {

            /* renamed from: a */
            public final String f20788a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3794a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "errorMessage");
                this.f20788a = str;
            }

            /* renamed from: a */
            public final String mo28775a() {
                return this.f20788a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3794a) && vx2.m53586b(this.f20788a, ((C3794a) obj).f20788a);
            }

            public int hashCode() {
                return this.f20788a.hashCode();
            }

            public String toString() {
                String str = this.f20788a;
                return "Error(errorMessage=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"La16$i$b;", "La16$i;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "topic", "", "La16$e$b;", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$i$b */
        /* compiled from: Sign.kt */
        public static final class C3795b extends C3793i {

            /* renamed from: a */
            public final String f20789a;

            /* renamed from: b */
            public final Map<String, C3784e.C3787b> f20790b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3795b(String str, Map<String, C3784e.C3787b> map) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "topic");
                vx2.m53591g(map, "namespaces");
                this.f20789a = str;
                this.f20790b = map;
            }

            /* renamed from: a */
            public final Map<String, C3784e.C3787b> mo28779a() {
                return this.f20790b;
            }

            /* renamed from: b */
            public final String mo28780b() {
                return this.f20789a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3795b)) {
                    return false;
                }
                C3795b bVar = (C3795b) obj;
                return vx2.m53586b(this.f20789a, bVar.f20789a) && vx2.m53586b(this.f20790b, bVar.f20790b);
            }

            public int hashCode() {
                return (this.f20789a.hashCode() * 31) + this.f20790b.hashCode();
            }

            public String toString() {
                String str = this.f20789a;
                Map<String, C3784e.C3787b> map = this.f20790b;
                return "Result(topic=" + str + ", namespaces=" + map + ")";
            }
        }

        public C3793i() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3793i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"La16$j;", "La16;", "<init>", "()V", "a", "b", "La16$j$a;", "La16$j$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a16$j */
    /* compiled from: Sign.kt */
    public static abstract class C3796j extends a16 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"La16$j$a;", "La16$j;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "errorMessage", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$j$a */
        /* compiled from: Sign.kt */
        public static final class C3797a extends C3796j {

            /* renamed from: a */
            public final String f20791a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3797a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "errorMessage");
                this.f20791a = str;
            }

            /* renamed from: a */
            public final String mo28784a() {
                return this.f20791a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3797a) && vx2.m53586b(this.f20791a, ((C3797a) obj).f20791a);
            }

            public int hashCode() {
                return this.f20791a.hashCode();
            }

            public String toString() {
                String str = this.f20791a;
                return "Error(errorMessage=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"La16$j$b;", "La16$j;", "", "toString", "", "hashCode", "", "other", "", "equals", "La16$f;", "a", "La16$f;", "()La16$f;", "session", "<init>", "(La16$f;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: a16$j$b */
        /* compiled from: Sign.kt */
        public static final class C3798b extends C3796j {

            /* renamed from: a */
            public final C3789f f20792a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3798b(C3789f fVar) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(fVar, "session");
                this.f20792a = fVar;
            }

            /* renamed from: a */
            public final C3789f mo28788a() {
                return this.f20792a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3798b) && vx2.m53586b(this.f20792a, ((C3798b) obj).f20792a);
            }

            public int hashCode() {
                return this.f20792a.hashCode();
            }

            public String toString() {
                C3789f fVar = this.f20792a;
                return "Result(session=" + fVar + ")";
            }
        }

        public C3796j() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C3796j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a16() {
    }

    public /* synthetic */ a16(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
