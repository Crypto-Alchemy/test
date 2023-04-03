package p000;

import com.walletconnect.android.CoreClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.C6121jt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lkt;", "", "<init>", "()V", "a", "b", "Lkt$a;", "Lkt$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kt */
/* compiled from: Auth.kt */
public abstract class C6197kt {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lkt$a;", "Lkt;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljt$c;", "a", "Ljt$c;", "b", "()Ljt$c;", "payloadParams", "Ljava/lang/String;", "()Ljava/lang/String;", "issuer", "<init>", "(Ljt$c;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kt$a */
    /* compiled from: Auth.kt */
    public static final class C6198a extends C6197kt {

        /* renamed from: a */
        public final C6121jt.C6124c f31052a;

        /* renamed from: b */
        public final String f31053b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6198a(C6121jt.C6124c cVar, String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(cVar, "payloadParams");
            vx2.m53591g(str, "issuer");
            this.f31052a = cVar;
            this.f31053b = str;
        }

        /* renamed from: a */
        public final String mo45279a() {
            return this.f31053b;
        }

        /* renamed from: b */
        public final C6121jt.C6124c mo45280b() {
            return this.f31052a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6198a)) {
                return false;
            }
            C6198a aVar = (C6198a) obj;
            return vx2.m53586b(this.f31052a, aVar.f31052a) && vx2.m53586b(this.f31053b, aVar.f31053b);
        }

        public int hashCode() {
            return (this.f31052a.hashCode() * 31) + this.f31053b.hashCode();
        }

        public String toString() {
            C6121jt.C6124c cVar = this.f31052a;
            String str = this.f31053b;
            return "FormatMessage(payloadParams=" + cVar + ", issuer=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lkt$b;", "Lkt;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/walletconnect/android/CoreClient;", "a", "Lcom/walletconnect/android/CoreClient;", "getCore", "()Lcom/walletconnect/android/CoreClient;", "core", "<init>", "(Lcom/walletconnect/android/CoreClient;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kt$b */
    /* compiled from: Auth.kt */
    public static final class C6199b extends C6197kt {

        /* renamed from: a */
        public final CoreClient f31054a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6199b(CoreClient coreClient) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(coreClient, ZendeskCoreSettingsStorage.CORE_KEY);
            this.f31054a = coreClient;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6199b) && vx2.m53586b(this.f31054a, ((C6199b) obj).f31054a);
        }

        public int hashCode() {
            return this.f31054a.hashCode();
        }

        public String toString() {
            CoreClient coreClient = this.f31054a;
            return "Init(core=" + coreClient + ")";
        }
    }

    public C6197kt() {
    }

    public /* synthetic */ C6197kt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
