package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Ltt0;", "", "<init>", "()V", "a", "b", "c", "d", "Ltt0$a;", "Ltt0$b;", "Ltt0$c;", "Ltt0$d;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tt0 */
/* compiled from: Core.kt */
public abstract class tt0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u001b"}, mo44877d2 = {"Ltt0$a;", "Ltt0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "b", "description", "e", "url", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "icons", "redirect", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tt0$a */
    /* compiled from: Core.kt */
    public static final class C6536a extends tt0 {

        /* renamed from: a */
        public final String f34324a;

        /* renamed from: b */
        public final String f34325b;

        /* renamed from: c */
        public final String f34326c;

        /* renamed from: d */
        public final List<String> f34327d;

        /* renamed from: e */
        public final String f34328e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6536a(String str, String str2, String str3, List<String> list, String str4) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "description");
            vx2.m53591g(str3, "url");
            vx2.m53591g(list, "icons");
            this.f34324a = str;
            this.f34325b = str2;
            this.f34326c = str3;
            this.f34327d = list;
            this.f34328e = str4;
        }

        /* renamed from: a */
        public final String mo48169a() {
            return this.f34325b;
        }

        /* renamed from: b */
        public final List<String> mo48170b() {
            return this.f34327d;
        }

        /* renamed from: c */
        public final String mo48171c() {
            return this.f34324a;
        }

        /* renamed from: d */
        public final String mo48172d() {
            return this.f34328e;
        }

        /* renamed from: e */
        public final String mo48173e() {
            return this.f34326c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6536a)) {
                return false;
            }
            C6536a aVar = (C6536a) obj;
            return vx2.m53586b(this.f34324a, aVar.f34324a) && vx2.m53586b(this.f34325b, aVar.f34325b) && vx2.m53586b(this.f34326c, aVar.f34326c) && vx2.m53586b(this.f34327d, aVar.f34327d) && vx2.m53586b(this.f34328e, aVar.f34328e);
        }

        public int hashCode() {
            int hashCode = ((((((this.f34324a.hashCode() * 31) + this.f34325b.hashCode()) * 31) + this.f34326c.hashCode()) * 31) + this.f34327d.hashCode()) * 31;
            String str = this.f34328e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f34324a;
            String str2 = this.f34325b;
            String str3 = this.f34326c;
            List<String> list = this.f34327d;
            String str4 = this.f34328e;
            return "AppMetaData(name=" + str + ", description=" + str2 + ", url=" + str3 + ", icons=" + list + ", redirect=" + str4 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, mo44877d2 = {"Ltt0$b;", "Ltt0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "topic", "b", "getReason", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tt0$b */
    /* compiled from: Core.kt */
    public static final class C6537b extends tt0 {

        /* renamed from: a */
        public final String f34329a;

        /* renamed from: b */
        public final String f34330b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6537b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, "reason");
            this.f34329a = str;
            this.f34330b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6537b)) {
                return false;
            }
            C6537b bVar = (C6537b) obj;
            return vx2.m53586b(this.f34329a, bVar.f34329a) && vx2.m53586b(this.f34330b, bVar.f34330b);
        }

        public int hashCode() {
            return (this.f34329a.hashCode() * 31) + this.f34330b.hashCode();
        }

        public String toString() {
            String str = this.f34329a;
            String str2 = this.f34330b;
            return "DeletedPairing(topic=" + str + ", reason=" + str2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Ltt0$c;", "Ltt0;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tt0$c */
    /* compiled from: Core.kt */
    public static final class C6538c extends tt0 {

        /* renamed from: a */
        public final Throwable f34331a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6538c(Throwable th) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(th, "throwable");
            this.f34331a = th;
        }

        /* renamed from: a */
        public final Throwable mo48180a() {
            return this.f34331a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6538c) && vx2.m53586b(this.f34331a, ((C6538c) obj).f34331a);
        }

        public int hashCode() {
            return this.f34331a.hashCode();
        }

        public String toString() {
            Throwable th = this.f34331a;
            return "Error(throwable=" + th + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\fR\u0017\u0010%\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\f¨\u0006,"}, mo44877d2 = {"Ltt0$d;", "Ltt0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "topic", "", "b", "J", "getExpiry", "()J", "expiry", "Ltt0$a;", "c", "Ltt0$a;", "getPeerAppMetaData", "()Ltt0$a;", "peerAppMetaData", "d", "getRelayProtocol", "relayProtocol", "e", "getRelayData", "relayData", "f", "getUri", "uri", "g", "Z", "isActive", "()Z", "h", "getRegisteredMethods", "registeredMethods", "<init>", "(Ljava/lang/String;JLtt0$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tt0$d */
    /* compiled from: Core.kt */
    public static final class C6539d extends tt0 {

        /* renamed from: a */
        public final String f34332a;

        /* renamed from: b */
        public final long f34333b;

        /* renamed from: c */
        public final C6536a f34334c;

        /* renamed from: d */
        public final String f34335d;

        /* renamed from: e */
        public final String f34336e;

        /* renamed from: f */
        public final String f34337f;

        /* renamed from: g */
        public final boolean f34338g;

        /* renamed from: h */
        public final String f34339h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6539d(String str, long j, C6536a aVar, String str2, String str3, String str4, boolean z, String str5) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, "relayProtocol");
            vx2.m53591g(str4, "uri");
            vx2.m53591g(str5, "registeredMethods");
            this.f34332a = str;
            this.f34333b = j;
            this.f34334c = aVar;
            this.f34335d = str2;
            this.f34336e = str3;
            this.f34337f = str4;
            this.f34338g = z;
            this.f34339h = str5;
        }

        /* renamed from: a */
        public final String mo48184a() {
            return this.f34332a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6539d)) {
                return false;
            }
            C6539d dVar = (C6539d) obj;
            return vx2.m53586b(this.f34332a, dVar.f34332a) && this.f34333b == dVar.f34333b && vx2.m53586b(this.f34334c, dVar.f34334c) && vx2.m53586b(this.f34335d, dVar.f34335d) && vx2.m53586b(this.f34336e, dVar.f34336e) && vx2.m53586b(this.f34337f, dVar.f34337f) && this.f34338g == dVar.f34338g && vx2.m53586b(this.f34339h, dVar.f34339h);
        }

        public int hashCode() {
            int hashCode = ((this.f34332a.hashCode() * 31) + au0.m10781a(this.f34333b)) * 31;
            C6536a aVar = this.f34334c;
            int i = 0;
            int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f34335d.hashCode()) * 31;
            String str = this.f34336e;
            if (str != null) {
                i = str.hashCode();
            }
            int hashCode3 = (((hashCode2 + i) * 31) + this.f34337f.hashCode()) * 31;
            boolean z = this.f34338g;
            if (z) {
                z = true;
            }
            return ((hashCode3 + (z ? 1 : 0)) * 31) + this.f34339h.hashCode();
        }

        public String toString() {
            String str = this.f34332a;
            long j = this.f34333b;
            C6536a aVar = this.f34334c;
            String str2 = this.f34335d;
            String str3 = this.f34336e;
            String str4 = this.f34337f;
            boolean z = this.f34338g;
            String str5 = this.f34339h;
            return "Pairing(topic=" + str + ", expiry=" + j + ", peerAppMetaData=" + aVar + ", relayProtocol=" + str2 + ", relayData=" + str3 + ", uri=" + str4 + ", isActive=" + z + ", registeredMethods=" + str5 + ")";
        }
    }

    public tt0() {
    }

    public /* synthetic */ tt0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
