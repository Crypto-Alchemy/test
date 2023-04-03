package p000;

import java.math.BigInteger;
import java.util.Date;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Ldg5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Date;", "a", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "date", "Ljava/math/BigInteger;", "Ljava/math/BigInteger;", "()Ljava/math/BigInteger;", "block", "<init>", "(Ljava/util/Date;Ljava/math/BigInteger;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dg5 */
/* compiled from: BlockTime.kt */
public final class dg5 {

    /* renamed from: a */
    public final Date f37278a;

    /* renamed from: b */
    public final BigInteger f37279b;

    public dg5(Date date, BigInteger bigInteger) {
        vx2.m53591g(date, "date");
        vx2.m53591g(bigInteger, "block");
        this.f37278a = date;
        this.f37279b = bigInteger;
    }

    /* renamed from: a */
    public final BigInteger mo51187a() {
        return this.f37279b;
    }

    /* renamed from: b */
    public final Date mo51188b() {
        return this.f37278a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg5)) {
            return false;
        }
        dg5 dg5 = (dg5) obj;
        return vx2.m53586b(this.f37278a, dg5.f37278a) && vx2.m53586b(this.f37279b, dg5.f37279b);
    }

    public int hashCode() {
        return (this.f37278a.hashCode() * 31) + this.f37279b.hashCode();
    }

    public String toString() {
        Date date = this.f37278a;
        BigInteger bigInteger = this.f37279b;
        return "Result(date=" + date + ", block=" + bigInteger + ")";
    }
}
