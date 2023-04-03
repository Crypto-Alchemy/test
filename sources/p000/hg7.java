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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, mo44877d2 = {"Lhg7;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Lhg7$a;", "Lcom/walletconnect/web3/wallet/client/Wallet$Model$Cacao$Signature;", "Lhg7$b;", "Lhg7$c;", "Lhg7$d;", "Lhg7$e;", "Lhg7$f;", "Lhg7$g;", "Lhg7$h;", "Lhg7$i;", "Lhg7$j;", "Lhg7$j$a;", "Lhg7$k;", "Lhg7$l;", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hg7 */
/* compiled from: Wallet.kt */
public abstract class hg7 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lhg7$a;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "id", "Lhg7$f;", "b", "Lhg7$f;", "()Lhg7$f;", "payloadParams", "<init>", "(JLhg7$f;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$a */
    /* compiled from: Wallet.kt */
    public static final class C5898a extends hg7 {

        /* renamed from: a */
        public final long f29575a;

        /* renamed from: b */
        public final C5909f f29576b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5898a(long j, C5909f fVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(fVar, "payloadParams");
            this.f29575a = j;
            this.f29576b = fVar;
        }

        /* renamed from: a */
        public final long mo43184a() {
            return this.f29575a;
        }

        /* renamed from: b */
        public final C5909f mo43185b() {
            return this.f29576b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5898a)) {
                return false;
            }
            C5898a aVar = (C5898a) obj;
            return this.f29575a == aVar.f29575a && vx2.m53586b(this.f29576b, aVar.f29576b);
        }

        public int hashCode() {
            return (au0.m10781a(this.f29575a) * 31) + this.f29576b.hashCode();
        }

        public String toString() {
            long j = this.f29575a;
            C5909f fVar = this.f29576b;
            return "AuthRequest(id=" + j + ", payloadParams=" + fVar + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Lhg7$b;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "isAvailable", "()Z", "<init>", "(Z)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$b */
    /* compiled from: Wallet.kt */
    public static final class C5899b extends hg7 {

        /* renamed from: a */
        public final boolean f29577a;

        public C5899b(boolean z) {
            super((DefaultConstructorMarker) null);
            this.f29577a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5899b) && this.f29577a == ((C5899b) obj).f29577a;
        }

        public int hashCode() {
            boolean z = this.f29577a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f29577a;
            return "ConnectionState(isAvailable=" + z + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lhg7$c;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$c */
    /* compiled from: Wallet.kt */
    public static final class C5900c extends hg7 {

        /* renamed from: a */
        public final Throwable f29578a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5900c(Throwable th) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(th, "throwable");
            this.f29578a = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5900c) && vx2.m53586b(this.f29578a, ((C5900c) obj).f29578a);
        }

        public int hashCode() {
            return this.f29578a.hashCode();
        }

        public String toString() {
            Throwable th = this.f29578a;
            return "Error(throwable=" + th + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\nB\t\b\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u000b\f¨\u0006\r"}, mo44877d2 = {"Lhg7$d;", "Lhg7;", "", "a", "Ljava/lang/String;", "getJsonrpc", "()Ljava/lang/String;", "jsonrpc", "<init>", "()V", "b", "Lhg7$d$a;", "Lhg7$d$b;", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$d */
    /* compiled from: Wallet.kt */
    public static abstract class C5901d extends hg7 {

        /* renamed from: a */
        public final String f29579a;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lhg7$d$a;", "Lhg7$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "b", "J", "()J", "id", "c", "I", "a", "()I", "code", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(JILjava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$d$a */
        /* compiled from: Wallet.kt */
        public static final class C5902a extends C5901d {

            /* renamed from: b */
            public final long f29580b;

            /* renamed from: c */
            public final int f29581c;

            /* renamed from: d */
            public final String f29582d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5902a(long j, int i, String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f29580b = j;
                this.f29581c = i;
                this.f29582d = str;
            }

            /* renamed from: a */
            public final int mo43195a() {
                return this.f29581c;
            }

            /* renamed from: b */
            public long mo43196b() {
                return this.f29580b;
            }

            /* renamed from: c */
            public final String mo43197c() {
                return this.f29582d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5902a)) {
                    return false;
                }
                C5902a aVar = (C5902a) obj;
                return mo43196b() == aVar.mo43196b() && this.f29581c == aVar.f29581c && vx2.m53586b(this.f29582d, aVar.f29582d);
            }

            public int hashCode() {
                return (((au0.m10781a(mo43196b()) * 31) + this.f29581c) * 31) + this.f29582d.hashCode();
            }

            public String toString() {
                long b = mo43196b();
                int i = this.f29581c;
                String str = this.f29582d;
                return "JsonRpcError(id=" + b + ", code=" + i + ", message=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lhg7$d$b;", "Lhg7$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "b", "J", "a", "()J", "id", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "result", "<init>", "(JLjava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$d$b */
        /* compiled from: Wallet.kt */
        public static final class C5903b extends C5901d {

            /* renamed from: b */
            public final long f29583b;

            /* renamed from: c */
            public final String f29584c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5903b(long j, String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "result");
                this.f29583b = j;
                this.f29584c = str;
            }

            /* renamed from: a */
            public long mo43201a() {
                return this.f29583b;
            }

            /* renamed from: b */
            public final String mo43202b() {
                return this.f29584c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5903b)) {
                    return false;
                }
                C5903b bVar = (C5903b) obj;
                return mo43201a() == bVar.mo43201a() && vx2.m53586b(this.f29584c, bVar.f29584c);
            }

            public int hashCode() {
                return (au0.m10781a(mo43201a()) * 31) + this.f29584c.hashCode();
            }

            public String toString() {
                long a = mo43201a();
                String str = this.f29584c;
                return "JsonRpcResult(id=" + a + ", result=" + str + ")";
            }
        }

        public C5901d() {
            super((DefaultConstructorMarker) null);
            this.f29579a = WCClientKt.JSONRPC_VERSION;
        }

        public /* synthetic */ C5901d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lhg7$e;", "Lhg7;", "<init>", "()V", "a", "b", "Lhg7$e$a;", "Lhg7$e$b;", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$e */
    /* compiled from: Wallet.kt */
    public static abstract class C5904e extends hg7 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u000bBA\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\r¨\u0006\u0019"}, mo44877d2 = {"Lhg7$e$a;", "Lhg7$e;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "chains", "b", "c", "methods", "events", "Lhg7$e$a$a;", "d", "getExtensions", "extensions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$e$a */
        /* compiled from: Wallet.kt */
        public static final class C5905a extends C5904e {

            /* renamed from: a */
            public final List<String> f29585a;

            /* renamed from: b */
            public final List<String> f29586b;

            /* renamed from: c */
            public final List<String> f29587c;

            /* renamed from: d */
            public final List<C5906a> f29588d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, mo44877d2 = {"Lhg7$e$a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "getChains", "()Ljava/util/List;", "chains", "b", "getMethods", "methods", "c", "getEvents", "events", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: hg7$e$a$a */
            /* compiled from: Wallet.kt */
            public static final class C5906a {

                /* renamed from: a */
                public final List<String> f29589a;

                /* renamed from: b */
                public final List<String> f29590b;

                /* renamed from: c */
                public final List<String> f29591c;

                public C5906a(List<String> list, List<String> list2, List<String> list3) {
                    vx2.m53591g(list, "chains");
                    vx2.m53591g(list2, "methods");
                    vx2.m53591g(list3, "events");
                    this.f29589a = list;
                    this.f29590b = list2;
                    this.f29591c = list3;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5906a)) {
                        return false;
                    }
                    C5906a aVar = (C5906a) obj;
                    return vx2.m53586b(this.f29589a, aVar.f29589a) && vx2.m53586b(this.f29590b, aVar.f29590b) && vx2.m53586b(this.f29591c, aVar.f29591c);
                }

                public int hashCode() {
                    return (((this.f29589a.hashCode() * 31) + this.f29590b.hashCode()) * 31) + this.f29591c.hashCode();
                }

                public String toString() {
                    List<String> list = this.f29589a;
                    List<String> list2 = this.f29590b;
                    List<String> list3 = this.f29591c;
                    return "Extension(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5905a(List<String> list, List<String> list2, List<String> list3, List<C5906a> list4) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(list, "chains");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f29585a = list;
                this.f29586b = list2;
                this.f29587c = list3;
                this.f29588d = list4;
            }

            /* renamed from: a */
            public final List<String> mo43206a() {
                return this.f29585a;
            }

            /* renamed from: b */
            public final List<String> mo43207b() {
                return this.f29587c;
            }

            /* renamed from: c */
            public final List<String> mo43208c() {
                return this.f29586b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5905a)) {
                    return false;
                }
                C5905a aVar = (C5905a) obj;
                return vx2.m53586b(this.f29585a, aVar.f29585a) && vx2.m53586b(this.f29586b, aVar.f29586b) && vx2.m53586b(this.f29587c, aVar.f29587c) && vx2.m53586b(this.f29588d, aVar.f29588d);
            }

            public int hashCode() {
                int hashCode = ((((this.f29585a.hashCode() * 31) + this.f29586b.hashCode()) * 31) + this.f29587c.hashCode()) * 31;
                List<C5906a> list = this.f29588d;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                List<String> list = this.f29585a;
                List<String> list2 = this.f29586b;
                List<String> list3 = this.f29587c;
                List<C5906a> list4 = this.f29588d;
                return "Proposal(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u000bBA\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, mo44877d2 = {"Lhg7$e$b;", "Lhg7$e;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "b", "d", "methods", "c", "events", "Lhg7$e$b$a;", "extensions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$e$b */
        /* compiled from: Wallet.kt */
        public static final class C5907b extends C5904e {

            /* renamed from: a */
            public final List<String> f29592a;

            /* renamed from: b */
            public final List<String> f29593b;

            /* renamed from: c */
            public final List<String> f29594c;

            /* renamed from: d */
            public final List<C5908a> f29595d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, mo44877d2 = {"Lhg7$e$b$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "b", "c", "methods", "events", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: hg7$e$b$a */
            /* compiled from: Wallet.kt */
            public static final class C5908a {

                /* renamed from: a */
                public final List<String> f29596a;

                /* renamed from: b */
                public final List<String> f29597b;

                /* renamed from: c */
                public final List<String> f29598c;

                public C5908a(List<String> list, List<String> list2, List<String> list3) {
                    vx2.m53591g(list, "accounts");
                    vx2.m53591g(list2, "methods");
                    vx2.m53591g(list3, "events");
                    this.f29596a = list;
                    this.f29597b = list2;
                    this.f29598c = list3;
                }

                /* renamed from: a */
                public final List<String> mo43222a() {
                    return this.f29596a;
                }

                /* renamed from: b */
                public final List<String> mo43223b() {
                    return this.f29598c;
                }

                /* renamed from: c */
                public final List<String> mo43224c() {
                    return this.f29597b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5908a)) {
                        return false;
                    }
                    C5908a aVar = (C5908a) obj;
                    return vx2.m53586b(this.f29596a, aVar.f29596a) && vx2.m53586b(this.f29597b, aVar.f29597b) && vx2.m53586b(this.f29598c, aVar.f29598c);
                }

                public int hashCode() {
                    return (((this.f29596a.hashCode() * 31) + this.f29597b.hashCode()) * 31) + this.f29598c.hashCode();
                }

                public String toString() {
                    List<String> list = this.f29596a;
                    List<String> list2 = this.f29597b;
                    List<String> list3 = this.f29598c;
                    return "Extension(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5907b(List<String> list, List<String> list2, List<String> list3, List<C5908a> list4) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(list, "accounts");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f29592a = list;
                this.f29593b = list2;
                this.f29594c = list3;
                this.f29595d = list4;
            }

            /* renamed from: a */
            public final List<String> mo43215a() {
                return this.f29592a;
            }

            /* renamed from: b */
            public final List<String> mo43216b() {
                return this.f29594c;
            }

            /* renamed from: c */
            public final List<C5908a> mo43217c() {
                return this.f29595d;
            }

            /* renamed from: d */
            public final List<String> mo43218d() {
                return this.f29593b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5907b)) {
                    return false;
                }
                C5907b bVar = (C5907b) obj;
                return vx2.m53586b(this.f29592a, bVar.f29592a) && vx2.m53586b(this.f29593b, bVar.f29593b) && vx2.m53586b(this.f29594c, bVar.f29594c) && vx2.m53586b(this.f29595d, bVar.f29595d);
            }

            public int hashCode() {
                int hashCode = ((((this.f29592a.hashCode() * 31) + this.f29593b.hashCode()) * 31) + this.f29594c.hashCode()) * 31;
                List<C5908a> list = this.f29595d;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                List<String> list = this.f29592a;
                List<String> list2 = this.f29593b;
                List<String> list3 = this.f29594c;
                List<C5908a> list4 = this.f29595d;
                return "Session(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
            }
        }

        public C5904e() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5904e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b \u0010\rR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b\u001e\u0010%¨\u0006)"}, mo44877d2 = {"Lhg7$f;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "type", "b", "chainId", "c", "domain", "d", "aud", "e", "l", "version", "f", "g", "nonce", "iat", "h", "nbf", "i", "exp", "j", "statement", "requestId", "", "Ljava/util/List;", "()Ljava/util/List;", "resources", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$f */
    /* compiled from: Wallet.kt */
    public static final class C5909f extends hg7 {

        /* renamed from: a */
        public final String f29599a;

        /* renamed from: b */
        public final String f29600b;

        /* renamed from: c */
        public final String f29601c;

        /* renamed from: d */
        public final String f29602d;

        /* renamed from: e */
        public final String f29603e;

        /* renamed from: f */
        public final String f29604f;

        /* renamed from: g */
        public final String f29605g;

        /* renamed from: h */
        public final String f29606h;

        /* renamed from: i */
        public final String f29607i;

        /* renamed from: j */
        public final String f29608j;

        /* renamed from: k */
        public final String f29609k;

        /* renamed from: l */
        public final List<String> f29610l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5909f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "type");
            vx2.m53591g(str2, "chainId");
            vx2.m53591g(str3, "domain");
            vx2.m53591g(str4, "aud");
            vx2.m53591g(str5, "version");
            vx2.m53591g(str6, "nonce");
            vx2.m53591g(str7, "iat");
            this.f29599a = str;
            this.f29600b = str2;
            this.f29601c = str3;
            this.f29602d = str4;
            this.f29603e = str5;
            this.f29604f = str6;
            this.f29605g = str7;
            this.f29606h = str8;
            this.f29607i = str9;
            this.f29608j = str10;
            this.f29609k = str11;
            this.f29610l = list;
        }

        /* renamed from: a */
        public final String mo43228a() {
            return this.f29602d;
        }

        /* renamed from: b */
        public final String mo43229b() {
            return this.f29600b;
        }

        /* renamed from: c */
        public final String mo43230c() {
            return this.f29601c;
        }

        /* renamed from: d */
        public final String mo43231d() {
            return this.f29607i;
        }

        /* renamed from: e */
        public final String mo43232e() {
            return this.f29605g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5909f)) {
                return false;
            }
            C5909f fVar = (C5909f) obj;
            return vx2.m53586b(this.f29599a, fVar.f29599a) && vx2.m53586b(this.f29600b, fVar.f29600b) && vx2.m53586b(this.f29601c, fVar.f29601c) && vx2.m53586b(this.f29602d, fVar.f29602d) && vx2.m53586b(this.f29603e, fVar.f29603e) && vx2.m53586b(this.f29604f, fVar.f29604f) && vx2.m53586b(this.f29605g, fVar.f29605g) && vx2.m53586b(this.f29606h, fVar.f29606h) && vx2.m53586b(this.f29607i, fVar.f29607i) && vx2.m53586b(this.f29608j, fVar.f29608j) && vx2.m53586b(this.f29609k, fVar.f29609k) && vx2.m53586b(this.f29610l, fVar.f29610l);
        }

        /* renamed from: f */
        public final String mo43234f() {
            return this.f29606h;
        }

        /* renamed from: g */
        public final String mo43235g() {
            return this.f29604f;
        }

        /* renamed from: h */
        public final String mo43236h() {
            return this.f29609k;
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.f29599a.hashCode() * 31) + this.f29600b.hashCode()) * 31) + this.f29601c.hashCode()) * 31) + this.f29602d.hashCode()) * 31) + this.f29603e.hashCode()) * 31) + this.f29604f.hashCode()) * 31) + this.f29605g.hashCode()) * 31;
            String str = this.f29606h;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f29607i;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f29608j;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f29609k;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<String> list = this.f29610l;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode5 + i;
        }

        /* renamed from: i */
        public final List<String> mo43238i() {
            return this.f29610l;
        }

        /* renamed from: j */
        public final String mo43239j() {
            return this.f29608j;
        }

        /* renamed from: k */
        public final String mo43240k() {
            return this.f29599a;
        }

        /* renamed from: l */
        public final String mo43241l() {
            return this.f29603e;
        }

        public String toString() {
            String str = this.f29599a;
            String str2 = this.f29600b;
            String str3 = this.f29601c;
            String str4 = this.f29602d;
            String str5 = this.f29603e;
            String str6 = this.f29604f;
            String str7 = this.f29605g;
            String str8 = this.f29606h;
            String str9 = this.f29607i;
            String str10 = this.f29608j;
            String str11 = this.f29609k;
            List<String> list = this.f29610l;
            return "PayloadParams(type=" + str + ", chainId=" + str2 + ", domain=" + str3 + ", aud=" + str4 + ", version=" + str5 + ", nonce=" + str6 + ", iat=" + str7 + ", nbf=" + str8 + ", exp=" + str9 + ", statement=" + str10 + ", requestId=" + str11 + ", resources=" + list + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\n\u0010\u001dR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u0017\u0010\r¨\u0006#"}, mo44877d2 = {"Lhg7$g;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "topic", "", "b", "J", "getExpiry", "()J", "expiry", "", "Lhg7$e$b;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "Ltt0$a;", "Ltt0$a;", "()Ltt0$a;", "metaData", "e", "redirect", "<init>", "(Ljava/lang/String;JLjava/util/Map;Ltt0$a;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$g */
    /* compiled from: Wallet.kt */
    public static final class C5910g extends hg7 {

        /* renamed from: a */
        public final String f29611a;

        /* renamed from: b */
        public final long f29612b;

        /* renamed from: c */
        public final Map<String, C5904e.C5907b> f29613c;

        /* renamed from: d */
        public final tt0.C6536a f29614d;

        /* renamed from: e */
        public final String f29615e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5910g(String str, long j, Map<String, C5904e.C5907b> map, tt0.C6536a aVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(map, "namespaces");
            String str2 = null;
            this.f29611a = str;
            this.f29612b = j;
            this.f29613c = map;
            this.f29614d = aVar;
            this.f29615e = aVar != null ? aVar.mo48172d() : str2;
        }

        /* renamed from: a */
        public final tt0.C6536a mo43243a() {
            return this.f29614d;
        }

        /* renamed from: b */
        public final Map<String, C5904e.C5907b> mo43244b() {
            return this.f29613c;
        }

        /* renamed from: c */
        public final String mo43245c() {
            return this.f29615e;
        }

        /* renamed from: d */
        public final String mo43246d() {
            return this.f29611a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5910g)) {
                return false;
            }
            C5910g gVar = (C5910g) obj;
            return vx2.m53586b(this.f29611a, gVar.f29611a) && this.f29612b == gVar.f29612b && vx2.m53586b(this.f29613c, gVar.f29613c) && vx2.m53586b(this.f29614d, gVar.f29614d);
        }

        public int hashCode() {
            int hashCode = ((((this.f29611a.hashCode() * 31) + au0.m10781a(this.f29612b)) * 31) + this.f29613c.hashCode()) * 31;
            tt0.C6536a aVar = this.f29614d;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.f29611a;
            long j = this.f29612b;
            Map<String, C5904e.C5907b> map = this.f29613c;
            tt0.C6536a aVar = this.f29614d;
            return "Session(topic=" + str + ", expiry=" + j + ", namespaces=" + map + ", metaData=" + aVar + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lhg7$h;", "Lhg7;", "<init>", "()V", "a", "b", "Lhg7$h$a;", "Lhg7$h$b;", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$h */
    /* compiled from: Wallet.kt */
    public static abstract class C5911h extends hg7 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lhg7$h$a;", "Lhg7$h;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/Throwable;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$h$a */
        /* compiled from: Wallet.kt */
        public static final class C5912a extends C5911h {

            /* renamed from: a */
            public final Throwable f29616a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5912a(Throwable th) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(th, "error");
                this.f29616a = th;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5912a) && vx2.m53586b(this.f29616a, ((C5912a) obj).f29616a);
            }

            public int hashCode() {
                return this.f29616a.hashCode();
            }

            public String toString() {
                Throwable th = this.f29616a;
                return "Error(error=" + th + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, mo44877d2 = {"Lhg7$h$b;", "Lhg7$h;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "topic", "b", "getReason", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$h$b */
        /* compiled from: Wallet.kt */
        public static final class C5913b extends C5911h {

            /* renamed from: a */
            public final String f29617a;

            /* renamed from: b */
            public final String f29618b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5913b(String str, String str2) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "topic");
                vx2.m53591g(str2, "reason");
                this.f29617a = str;
                this.f29618b = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5913b)) {
                    return false;
                }
                C5913b bVar = (C5913b) obj;
                return vx2.m53586b(this.f29617a, bVar.f29617a) && vx2.m53586b(this.f29618b, bVar.f29618b);
            }

            public int hashCode() {
                return (this.f29617a.hashCode() * 31) + this.f29618b.hashCode();
            }

            public String toString() {
                String str = this.f29617a;
                String str2 = this.f29618b;
                return "Success(topic=" + str + ", reason=" + str2 + ")";
            }
        }

        public C5911h() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5911h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\r¨\u0006*"}, mo44877d2 = {"Lhg7$i;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "pairingTopic", "b", "c", "name", "description", "g", "url", "", "Ljava/net/URI;", "e", "Ljava/util/List;", "()Ljava/util/List;", "icons", "", "Lhg7$e$a;", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "requiredNamespaces", "proposerPublicKey", "h", "getRelayProtocol", "relayProtocol", "i", "getRelayData", "relayData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$i */
    /* compiled from: Wallet.kt */
    public static final class C5914i extends hg7 {

        /* renamed from: a */
        public final String f29619a;

        /* renamed from: b */
        public final String f29620b;

        /* renamed from: c */
        public final String f29621c;

        /* renamed from: d */
        public final String f29622d;

        /* renamed from: e */
        public final List<URI> f29623e;

        /* renamed from: f */
        public final Map<String, C5904e.C5905a> f29624f;

        /* renamed from: g */
        public final String f29625g;

        /* renamed from: h */
        public final String f29626h;

        /* renamed from: i */
        public final String f29627i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5914i(String str, String str2, String str3, String str4, List<URI> list, Map<String, C5904e.C5905a> map, String str5, String str6, String str7) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "pairingTopic");
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            vx2.m53591g(str3, "description");
            vx2.m53591g(str4, "url");
            vx2.m53591g(list, "icons");
            vx2.m53591g(map, "requiredNamespaces");
            vx2.m53591g(str5, "proposerPublicKey");
            vx2.m53591g(str6, "relayProtocol");
            this.f29619a = str;
            this.f29620b = str2;
            this.f29621c = str3;
            this.f29622d = str4;
            this.f29623e = list;
            this.f29624f = map;
            this.f29625g = str5;
            this.f29626h = str6;
            this.f29627i = str7;
        }

        /* renamed from: a */
        public final String mo43256a() {
            return this.f29621c;
        }

        /* renamed from: b */
        public final List<URI> mo43257b() {
            return this.f29623e;
        }

        /* renamed from: c */
        public final String mo43258c() {
            return this.f29620b;
        }

        /* renamed from: d */
        public final String mo43259d() {
            return this.f29619a;
        }

        /* renamed from: e */
        public final String mo43260e() {
            return this.f29625g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5914i)) {
                return false;
            }
            C5914i iVar = (C5914i) obj;
            return vx2.m53586b(this.f29619a, iVar.f29619a) && vx2.m53586b(this.f29620b, iVar.f29620b) && vx2.m53586b(this.f29621c, iVar.f29621c) && vx2.m53586b(this.f29622d, iVar.f29622d) && vx2.m53586b(this.f29623e, iVar.f29623e) && vx2.m53586b(this.f29624f, iVar.f29624f) && vx2.m53586b(this.f29625g, iVar.f29625g) && vx2.m53586b(this.f29626h, iVar.f29626h) && vx2.m53586b(this.f29627i, iVar.f29627i);
        }

        /* renamed from: f */
        public final Map<String, C5904e.C5905a> mo43262f() {
            return this.f29624f;
        }

        /* renamed from: g */
        public final String mo43263g() {
            return this.f29622d;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((this.f29619a.hashCode() * 31) + this.f29620b.hashCode()) * 31) + this.f29621c.hashCode()) * 31) + this.f29622d.hashCode()) * 31) + this.f29623e.hashCode()) * 31) + this.f29624f.hashCode()) * 31) + this.f29625g.hashCode()) * 31) + this.f29626h.hashCode()) * 31;
            String str = this.f29627i;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f29619a;
            String str2 = this.f29620b;
            String str3 = this.f29621c;
            String str4 = this.f29622d;
            List<URI> list = this.f29623e;
            Map<String, C5904e.C5905a> map = this.f29624f;
            String str5 = this.f29625g;
            String str6 = this.f29626h;
            String str7 = this.f29627i;
            return "SessionProposal(pairingTopic=" + str + ", name=" + str2 + ", description=" + str3 + ", url=" + str4 + ", icons=" + list + ", requiredNamespaces=" + map + ", proposerPublicKey=" + str5 + ", relayProtocol=" + str6 + ", relayData=" + str7 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\nB+\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Lhg7$j;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "topic", "b", "chainId", "Ltt0$a;", "c", "Ltt0$a;", "()Ltt0$a;", "peerMetaData", "Lhg7$j$a;", "Lhg7$j$a;", "()Lhg7$j$a;", "request", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltt0$a;Lhg7$j$a;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$j */
    /* compiled from: Wallet.kt */
    public static final class C5915j extends hg7 {

        /* renamed from: a */
        public final String f29628a;

        /* renamed from: b */
        public final String f29629b;

        /* renamed from: c */
        public final tt0.C6536a f29630c;

        /* renamed from: d */
        public final C5916a f29631d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lhg7$j$a;", "Lhg7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "id", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "method", "c", "params", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$j$a */
        /* compiled from: Wallet.kt */
        public static final class C5916a extends hg7 {

            /* renamed from: a */
            public final long f29632a;

            /* renamed from: b */
            public final String f29633b;

            /* renamed from: c */
            public final String f29634c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5916a(long j, String str, String str2) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "method");
                vx2.m53591g(str2, "params");
                this.f29632a = j;
                this.f29633b = str;
                this.f29634c = str2;
            }

            /* renamed from: a */
            public final long mo43273a() {
                return this.f29632a;
            }

            /* renamed from: b */
            public final String mo43274b() {
                return this.f29633b;
            }

            /* renamed from: c */
            public final String mo43275c() {
                return this.f29634c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5916a)) {
                    return false;
                }
                C5916a aVar = (C5916a) obj;
                return this.f29632a == aVar.f29632a && vx2.m53586b(this.f29633b, aVar.f29633b) && vx2.m53586b(this.f29634c, aVar.f29634c);
            }

            public int hashCode() {
                return (((au0.m10781a(this.f29632a) * 31) + this.f29633b.hashCode()) * 31) + this.f29634c.hashCode();
            }

            public String toString() {
                long j = this.f29632a;
                String str = this.f29633b;
                String str2 = this.f29634c;
                return "JSONRPCRequest(id=" + j + ", method=" + str + ", params=" + str2 + ")";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5915j(String str, String str2, tt0.C6536a aVar, C5916a aVar2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(aVar2, "request");
            this.f29628a = str;
            this.f29629b = str2;
            this.f29630c = aVar;
            this.f29631d = aVar2;
        }

        /* renamed from: a */
        public final String mo43266a() {
            return this.f29629b;
        }

        /* renamed from: b */
        public final tt0.C6536a mo43267b() {
            return this.f29630c;
        }

        /* renamed from: c */
        public final C5916a mo43268c() {
            return this.f29631d;
        }

        /* renamed from: d */
        public final String mo43269d() {
            return this.f29628a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5915j)) {
                return false;
            }
            C5915j jVar = (C5915j) obj;
            return vx2.m53586b(this.f29628a, jVar.f29628a) && vx2.m53586b(this.f29629b, jVar.f29629b) && vx2.m53586b(this.f29630c, jVar.f29630c) && vx2.m53586b(this.f29631d, jVar.f29631d);
        }

        public int hashCode() {
            int hashCode = this.f29628a.hashCode() * 31;
            String str = this.f29629b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            tt0.C6536a aVar = this.f29630c;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f29631d.hashCode();
        }

        public String toString() {
            String str = this.f29628a;
            String str2 = this.f29629b;
            tt0.C6536a aVar = this.f29630c;
            C5916a aVar2 = this.f29631d;
            return "SessionRequest(topic=" + str + ", chainId=" + str2 + ", peerMetaData=" + aVar + ", request=" + aVar2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lhg7$k;", "Lhg7;", "<init>", "()V", "a", "b", "Lhg7$k$a;", "Lhg7$k$b;", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$k */
    /* compiled from: Wallet.kt */
    public static abstract class C5917k extends hg7 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lhg7$k$a;", "Lhg7$k;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "<init>", "(Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$k$a */
        /* compiled from: Wallet.kt */
        public static final class C5918a extends C5917k {

            /* renamed from: a */
            public final String f29635a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5918a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "errorMessage");
                this.f29635a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5918a) && vx2.m53586b(this.f29635a, ((C5918a) obj).f29635a);
            }

            public int hashCode() {
                return this.f29635a.hashCode();
            }

            public String toString() {
                String str = this.f29635a;
                return "Error(errorMessage=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lhg7$k$b;", "Lhg7$k;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "topic", "", "Lhg7$e$b;", "b", "Ljava/util/Map;", "getNamespaces", "()Ljava/util/Map;", "namespaces", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$k$b */
        /* compiled from: Wallet.kt */
        public static final class C5919b extends C5917k {

            /* renamed from: a */
            public final String f29636a;

            /* renamed from: b */
            public final Map<String, C5904e.C5907b> f29637b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5919b(String str, Map<String, C5904e.C5907b> map) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "topic");
                vx2.m53591g(map, "namespaces");
                this.f29636a = str;
                this.f29637b = map;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5919b)) {
                    return false;
                }
                C5919b bVar = (C5919b) obj;
                return vx2.m53586b(this.f29636a, bVar.f29636a) && vx2.m53586b(this.f29637b, bVar.f29637b);
            }

            public int hashCode() {
                return (this.f29636a.hashCode() * 31) + this.f29637b.hashCode();
            }

            public String toString() {
                String str = this.f29636a;
                Map<String, C5904e.C5907b> map = this.f29637b;
                return "Result(topic=" + str + ", namespaces=" + map + ")";
            }
        }

        public C5917k() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5917k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lhg7$l;", "Lhg7;", "<init>", "()V", "a", "b", "Lhg7$l$a;", "Lhg7$l$b;", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: hg7$l */
    /* compiled from: Wallet.kt */
    public static abstract class C5920l extends hg7 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lhg7$l$a;", "Lhg7$l;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "<init>", "(Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$l$a */
        /* compiled from: Wallet.kt */
        public static final class C5921a extends C5920l {

            /* renamed from: a */
            public final String f29638a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5921a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "errorMessage");
                this.f29638a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5921a) && vx2.m53586b(this.f29638a, ((C5921a) obj).f29638a);
            }

            public int hashCode() {
                return this.f29638a.hashCode();
            }

            public String toString() {
                String str = this.f29638a;
                return "Error(errorMessage=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lhg7$l$b;", "Lhg7$l;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lhg7$g;", "a", "Lhg7$g;", "()Lhg7$g;", "session", "<init>", "(Lhg7$g;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: hg7$l$b */
        /* compiled from: Wallet.kt */
        public static final class C5922b extends C5920l {

            /* renamed from: a */
            public final C5910g f29639a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5922b(C5910g gVar) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(gVar, "session");
                this.f29639a = gVar;
            }

            /* renamed from: a */
            public final C5910g mo43288a() {
                return this.f29639a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5922b) && vx2.m53586b(this.f29639a, ((C5922b) obj).f29639a);
            }

            public int hashCode() {
                return this.f29639a.hashCode();
            }

            public String toString() {
                C5910g gVar = this.f29639a;
                return "Result(session=" + gVar + ")";
            }
        }

        public C5920l() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5920l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private hg7() {
    }

    public /* synthetic */ hg7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
