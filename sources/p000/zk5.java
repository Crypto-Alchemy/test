package p000;

import java.math.BigInteger;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lzk5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/math/BigInteger;", "a", "Ljava/math/BigInteger;", "b", "()Ljava/math/BigInteger;", "timestamp", "Ljava/lang/String;", "()Ljava/lang/String;", "number", "<init>", "(Ljava/math/BigInteger;Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zk5 */
/* compiled from: BlockTime.kt */
public final class zk5 {

    /* renamed from: a */
    public final BigInteger f46405a;

    /* renamed from: b */
    public final String f46406b;

    public zk5(BigInteger bigInteger, String str) {
        vx2.m53591g(bigInteger, "timestamp");
        vx2.m53591g(str, "number");
        this.f46405a = bigInteger;
        this.f46406b = str;
    }

    /* renamed from: a */
    public final String mo67325a() {
        return this.f46406b;
    }

    /* renamed from: b */
    public final BigInteger mo67326b() {
        return this.f46405a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk5)) {
            return false;
        }
        zk5 zk5 = (zk5) obj;
        return vx2.m53586b(this.f46405a, zk5.f46405a) && vx2.m53586b(this.f46406b, zk5.f46406b);
    }

    public int hashCode() {
        return (this.f46405a.hashCode() * 31) + this.f46406b.hashCode();
    }

    public String toString() {
        BigInteger bigInteger = this.f46405a;
        String str = this.f46406b;
        return "SaveBlocks(timestamp=" + bigInteger + ", number=" + str + ")";
    }
}
