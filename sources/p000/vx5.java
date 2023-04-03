package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lvx5;", "", "<init>", "()V", "a", "b", "Lvx5$a;", "Lvx5$b;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vx5 */
/* compiled from: SessionRequestUI.kt */
public abstract class vx5 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u000b\u0010\u0013R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013¨\u0006#"}, mo44877d2 = {"Lvx5$a;", "Lvx5;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ldn4;", "a", "Ldn4;", "getPeerUI", "()Ldn4;", "peerUI", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "topic", "", "J", "()J", "requestId", "d", "getParam", "param", "e", "chain", "f", "getMethod", "method", "<init>", "(Ldn4;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: vx5$a */
    /* compiled from: SessionRequestUI.kt */
    public static final class C9471a extends vx5 {

        /* renamed from: a */
        public final dn4 f45396a;

        /* renamed from: b */
        public final String f45397b;

        /* renamed from: c */
        public final long f45398c;

        /* renamed from: d */
        public final String f45399d;

        /* renamed from: e */
        public final String f45400e;

        /* renamed from: f */
        public final String f45401f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9471a(dn4 dn4, String str, long j, String str2, String str3, String str4) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(dn4, "peerUI");
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, "param");
            vx2.m53591g(str4, "method");
            this.f45396a = dn4;
            this.f45397b = str;
            this.f45398c = j;
            this.f45399d = str2;
            this.f45400e = str3;
            this.f45401f = str4;
        }

        /* renamed from: a */
        public final String mo66588a() {
            return this.f45400e;
        }

        /* renamed from: b */
        public final long mo66589b() {
            return this.f45398c;
        }

        /* renamed from: c */
        public final String mo66590c() {
            return this.f45397b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9471a)) {
                return false;
            }
            C9471a aVar = (C9471a) obj;
            return vx2.m53586b(this.f45396a, aVar.f45396a) && vx2.m53586b(this.f45397b, aVar.f45397b) && this.f45398c == aVar.f45398c && vx2.m53586b(this.f45399d, aVar.f45399d) && vx2.m53586b(this.f45400e, aVar.f45400e) && vx2.m53586b(this.f45401f, aVar.f45401f);
        }

        public int hashCode() {
            int hashCode = ((((((this.f45396a.hashCode() * 31) + this.f45397b.hashCode()) * 31) + au0.m10781a(this.f45398c)) * 31) + this.f45399d.hashCode()) * 31;
            String str = this.f45400e;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f45401f.hashCode();
        }

        public String toString() {
            dn4 dn4 = this.f45396a;
            String str = this.f45397b;
            long j = this.f45398c;
            String str2 = this.f45399d;
            String str3 = this.f45400e;
            String str4 = this.f45401f;
            return "Content(peerUI=" + dn4 + ", topic=" + str + ", requestId=" + j + ", param=" + str2 + ", chain=" + str3 + ", method=" + str4 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lvx5$b;", "Lvx5;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: vx5$b */
    /* compiled from: SessionRequestUI.kt */
    public static final class C9472b extends vx5 {

        /* renamed from: a */
        public static final C9472b f45402a = new C9472b();

        public C9472b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public vx5() {
    }

    public /* synthetic */ vx5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
