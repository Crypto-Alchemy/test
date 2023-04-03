package p000;

import com.walletconnect.android.CoreClient;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.a16;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Lb16;", "", "<init>", "()V", "a", "b", "c", "d", "Lb16$a;", "Lb16$b;", "Lb16$c;", "Lb16$d;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: b16 */
/* compiled from: Sign.kt */
public abstract class b16 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0019"}, mo44877d2 = {"Lb16$a;", "Lb16;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "proposerPublicKey", "", "La16$e$b;", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "c", "getRelayProtocol", "relayProtocol", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: b16$a */
    /* compiled from: Sign.kt */
    public static final class C3871a extends b16 {

        /* renamed from: a */
        public final String f21108a;

        /* renamed from: b */
        public final Map<String, a16.C3784e.C3787b> f21109b;

        /* renamed from: c */
        public final String f21110c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3871a(String str, Map<String, a16.C3784e.C3787b> map, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "proposerPublicKey");
            vx2.m53591g(map, "namespaces");
            this.f21108a = str;
            this.f21109b = map;
            this.f21110c = str2;
        }

        /* renamed from: a */
        public final Map<String, a16.C3784e.C3787b> mo29410a() {
            return this.f21109b;
        }

        /* renamed from: b */
        public final String mo29411b() {
            return this.f21108a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3871a)) {
                return false;
            }
            C3871a aVar = (C3871a) obj;
            return vx2.m53586b(this.f21108a, aVar.f21108a) && vx2.m53586b(this.f21109b, aVar.f21109b) && vx2.m53586b(this.f21110c, aVar.f21110c);
        }

        public int hashCode() {
            int hashCode = ((this.f21108a.hashCode() * 31) + this.f21109b.hashCode()) * 31;
            String str = this.f21110c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f21108a;
            Map<String, a16.C3784e.C3787b> map = this.f21109b;
            String str2 = this.f21110c;
            return "Approve(proposerPublicKey=" + str + ", namespaces=" + map + ", relayProtocol=" + str2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lb16$b;", "Lb16;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "sessionTopic", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: b16$b */
    /* compiled from: Sign.kt */
    public static final class C3872b extends b16 {

        /* renamed from: a */
        public final String f21111a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3872b(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "sessionTopic");
            this.f21111a = str;
        }

        /* renamed from: a */
        public final String mo29415a() {
            return this.f21111a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3872b) && vx2.m53586b(this.f21111a, ((C3872b) obj).f21111a);
        }

        public int hashCode() {
            return this.f21111a.hashCode();
        }

        public String toString() {
            String str = this.f21111a;
            return "Disconnect(sessionTopic=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lb16$c;", "Lb16;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/walletconnect/android/CoreClient;", "a", "Lcom/walletconnect/android/CoreClient;", "getCore", "()Lcom/walletconnect/android/CoreClient;", "core", "<init>", "(Lcom/walletconnect/android/CoreClient;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: b16$c */
    /* compiled from: Sign.kt */
    public static final class C3873c extends b16 {

        /* renamed from: a */
        public final CoreClient f21112a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3873c(CoreClient coreClient) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(coreClient, ZendeskCoreSettingsStorage.CORE_KEY);
            this.f21112a = coreClient;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3873c) && vx2.m53586b(this.f21112a, ((C3873c) obj).f21112a);
        }

        public int hashCode() {
            return this.f21112a.hashCode();
        }

        public String toString() {
            CoreClient coreClient = this.f21112a;
            return "Init(core=" + coreClient + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lb16$d;", "Lb16;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "sessionTopic", "La16$d;", "La16$d;", "()La16$d;", "jsonRpcResponse", "<init>", "(Ljava/lang/String;La16$d;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: b16$d */
    /* compiled from: Sign.kt */
    public static final class C3874d extends b16 {

        /* renamed from: a */
        public final String f21113a;

        /* renamed from: b */
        public final a16.C3781d f21114b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3874d(String str, a16.C3781d dVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "sessionTopic");
            vx2.m53591g(dVar, "jsonRpcResponse");
            this.f21113a = str;
            this.f21114b = dVar;
        }

        /* renamed from: a */
        public final a16.C3781d mo29422a() {
            return this.f21114b;
        }

        /* renamed from: b */
        public final String mo29423b() {
            return this.f21113a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3874d)) {
                return false;
            }
            C3874d dVar = (C3874d) obj;
            return vx2.m53586b(this.f21113a, dVar.f21113a) && vx2.m53586b(this.f21114b, dVar.f21114b);
        }

        public int hashCode() {
            return (this.f21113a.hashCode() * 31) + this.f21114b.hashCode();
        }

        public String toString() {
            String str = this.f21113a;
            a16.C3781d dVar = this.f21114b;
            return "Response(sessionTopic=" + str + ", jsonRpcResponse=" + dVar + ")";
        }
    }

    public b16() {
    }

    public /* synthetic */ b16(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
