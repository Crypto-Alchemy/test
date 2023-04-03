package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lmt;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getId", "()J", "id", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(JLjava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mt */
/* compiled from: Web3WalletEvent.kt */
public final class C7914mt implements tj7 {

    /* renamed from: a */
    public final long f41008a;

    /* renamed from: b */
    public final String f41009b;

    public C7914mt(long j, String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        this.f41008a = j;
        this.f41009b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7914mt)) {
            return false;
        }
        C7914mt mtVar = (C7914mt) obj;
        return this.f41008a == mtVar.f41008a && vx2.m53586b(this.f41009b, mtVar.f41009b);
    }

    public int hashCode() {
        return (au0.m10781a(this.f41008a) * 31) + this.f41009b.hashCode();
    }

    public String toString() {
        long j = this.f41008a;
        String str = this.f41009b;
        return "OnRequest(id=" + j + ", message=" + str + ")";
    }
}
