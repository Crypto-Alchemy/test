package p000;

import com.walletconnect.android.CoreClient;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.hg7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, mo44877d2 = {"Lig7;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lig7$a;", "Lig7$b;", "Lig7$c;", "Lig7$d;", "Lig7$e;", "Lig7$f;", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ig7 */
/* compiled from: Wallet.kt */
public abstract class ig7 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lig7$a;", "Lig7;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lhg7$f;", "a", "Lhg7$f;", "b", "()Lhg7$f;", "payloadParams", "Ljava/lang/String;", "()Ljava/lang/String;", "issuer", "<init>", "(Lhg7$f;Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ig7$a */
    /* compiled from: Wallet.kt */
    public static final class C5960a extends ig7 {

        /* renamed from: a */
        public final hg7.C5909f f29929a;

        /* renamed from: b */
        public final String f29930b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5960a(hg7.C5909f fVar, String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(fVar, "payloadParams");
            vx2.m53591g(str, "issuer");
            this.f29929a = fVar;
            this.f29930b = str;
        }

        /* renamed from: a */
        public final String mo43592a() {
            return this.f29930b;
        }

        /* renamed from: b */
        public final hg7.C5909f mo43593b() {
            return this.f29929a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5960a)) {
                return false;
            }
            C5960a aVar = (C5960a) obj;
            return vx2.m53586b(this.f29929a, aVar.f29929a) && vx2.m53586b(this.f29930b, aVar.f29930b);
        }

        public int hashCode() {
            return (this.f29929a.hashCode() * 31) + this.f29930b.hashCode();
        }

        public String toString() {
            hg7.C5909f fVar = this.f29929a;
            String str = this.f29930b;
            return "FormatMessage(payloadParams=" + fVar + ", issuer=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lig7$b;", "Lig7;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/walletconnect/android/CoreClient;", "a", "Lcom/walletconnect/android/CoreClient;", "()Lcom/walletconnect/android/CoreClient;", "core", "<init>", "(Lcom/walletconnect/android/CoreClient;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ig7$b */
    /* compiled from: Wallet.kt */
    public static final class C5961b extends ig7 {

        /* renamed from: a */
        public final CoreClient f29931a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5961b(CoreClient coreClient) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(coreClient, ZendeskCoreSettingsStorage.CORE_KEY);
            this.f29931a = coreClient;
        }

        /* renamed from: a */
        public final CoreClient mo43597a() {
            return this.f29931a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5961b) && vx2.m53586b(this.f29931a, ((C5961b) obj).f29931a);
        }

        public int hashCode() {
            return this.f29931a.hashCode();
        }

        public String toString() {
            CoreClient coreClient = this.f29931a;
            return "Init(core=" + coreClient + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lig7$c;", "Lig7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "uri", "<init>", "(Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ig7$c */
    /* compiled from: Wallet.kt */
    public static final class C5962c extends ig7 {

        /* renamed from: a */
        public final String f29932a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5962c(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "uri");
            this.f29932a = str;
        }

        /* renamed from: a */
        public final String mo43601a() {
            return this.f29932a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5962c) && vx2.m53586b(this.f29932a, ((C5962c) obj).f29932a);
        }

        public int hashCode() {
            return this.f29932a.hashCode();
        }

        public String toString() {
            String str = this.f29932a;
            return "Pair(uri=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0018"}, mo44877d2 = {"Lig7$d;", "Lig7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "proposerPublicKey", "", "Lhg7$e$b;", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "c", "relayProtocol", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ig7$d */
    /* compiled from: Wallet.kt */
    public static final class C5963d extends ig7 {

        /* renamed from: a */
        public final String f29933a;

        /* renamed from: b */
        public final Map<String, hg7.C5904e.C5907b> f29934b;

        /* renamed from: c */
        public final String f29935c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C5963d(String str, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map, (i & 4) != 0 ? null : str2);
        }

        /* renamed from: a */
        public final Map<String, hg7.C5904e.C5907b> mo43605a() {
            return this.f29934b;
        }

        /* renamed from: b */
        public final String mo43606b() {
            return this.f29933a;
        }

        /* renamed from: c */
        public final String mo43607c() {
            return this.f29935c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5963d)) {
                return false;
            }
            C5963d dVar = (C5963d) obj;
            return vx2.m53586b(this.f29933a, dVar.f29933a) && vx2.m53586b(this.f29934b, dVar.f29934b) && vx2.m53586b(this.f29935c, dVar.f29935c);
        }

        public int hashCode() {
            int hashCode = ((this.f29933a.hashCode() * 31) + this.f29934b.hashCode()) * 31;
            String str = this.f29935c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f29933a;
            Map<String, hg7.C5904e.C5907b> map = this.f29934b;
            String str2 = this.f29935c;
            return "SessionApprove(proposerPublicKey=" + str + ", namespaces=" + map + ", relayProtocol=" + str2 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5963d(String str, Map<String, hg7.C5904e.C5907b> map, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "proposerPublicKey");
            vx2.m53591g(map, "namespaces");
            this.f29933a = str;
            this.f29934b = map;
            this.f29935c = str2;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lig7$e;", "Lig7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "sessionTopic", "<init>", "(Ljava/lang/String;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ig7$e */
    /* compiled from: Wallet.kt */
    public static final class C5964e extends ig7 {

        /* renamed from: a */
        public final String f29936a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5964e(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "sessionTopic");
            this.f29936a = str;
        }

        /* renamed from: a */
        public final String mo43611a() {
            return this.f29936a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5964e) && vx2.m53586b(this.f29936a, ((C5964e) obj).f29936a);
        }

        public int hashCode() {
            return this.f29936a.hashCode();
        }

        public String toString() {
            String str = this.f29936a;
            return "SessionDisconnect(sessionTopic=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lig7$f;", "Lig7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "sessionTopic", "Lhg7$d;", "Lhg7$d;", "()Lhg7$d;", "jsonRpcResponse", "<init>", "(Ljava/lang/String;Lhg7$d;)V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ig7$f */
    /* compiled from: Wallet.kt */
    public static final class C5965f extends ig7 {

        /* renamed from: a */
        public final String f29937a;

        /* renamed from: b */
        public final hg7.C5901d f29938b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5965f(String str, hg7.C5901d dVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "sessionTopic");
            vx2.m53591g(dVar, "jsonRpcResponse");
            this.f29937a = str;
            this.f29938b = dVar;
        }

        /* renamed from: a */
        public final hg7.C5901d mo43615a() {
            return this.f29938b;
        }

        /* renamed from: b */
        public final String mo43616b() {
            return this.f29937a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5965f)) {
                return false;
            }
            C5965f fVar = (C5965f) obj;
            return vx2.m53586b(this.f29937a, fVar.f29937a) && vx2.m53586b(this.f29938b, fVar.f29938b);
        }

        public int hashCode() {
            return (this.f29937a.hashCode() * 31) + this.f29938b.hashCode();
        }

        public String toString() {
            String str = this.f29937a;
            hg7.C5901d dVar = this.f29938b;
            return "SessionRequestResponse(sessionTopic=" + str + ", jsonRpcResponse=" + dVar + ")";
        }
    }

    public ig7() {
    }

    public /* synthetic */ ig7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
