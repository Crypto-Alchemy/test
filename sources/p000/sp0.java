package p000;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.hg7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo44877d2 = {"Lsp0;", "", "<init>", "()V", "a", "Lsp0$a;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sp0 */
/* compiled from: ConnectionUI.kt */
public abstract class sp0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lsp0$a;", "Lsp0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "topic", "", "Lhg7$e$b;", "b", "Ljava/util/Map;", "getNamespaces", "()Ljava/util/Map;", "namespaces", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sp0$a */
    /* compiled from: ConnectionUI.kt */
    public static final class C9312a extends sp0 {

        /* renamed from: a */
        public final String f44589a;

        /* renamed from: b */
        public final Map<String, hg7.C5904e.C5907b> f44590b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9312a(String str, Map<String, hg7.C5904e.C5907b> map) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(map, "namespaces");
            this.f44589a = str;
            this.f44590b = map;
        }

        /* renamed from: a */
        public final String mo65883a() {
            return this.f44589a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9312a)) {
                return false;
            }
            C9312a aVar = (C9312a) obj;
            return vx2.m53586b(this.f44589a, aVar.f44589a) && vx2.m53586b(this.f44590b, aVar.f44590b);
        }

        public int hashCode() {
            return (this.f44589a.hashCode() * 31) + this.f44590b.hashCode();
        }

        public String toString() {
            String str = this.f44589a;
            Map<String, hg7.C5904e.C5907b> map = this.f44590b;
            return "Sign(topic=" + str + ", namespaces=" + map + ")";
        }
    }

    public sp0() {
    }

    public /* synthetic */ sp0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
