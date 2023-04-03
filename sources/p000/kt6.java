package p000;

import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.swap.PairsData;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001BI\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010$\u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\f\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\"\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"\"\u0004\b\u001d\u0010#¨\u0006'"}, mo44877d2 = {"Lkt6;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/swap/PairsData;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "d", "()Ljava/util/ArrayList;", "route", "b", "Ljava/lang/String;", "getTokenIn", "()Ljava/lang/String;", "tokenIn", "c", "getTokenOut", "tokenOut", "Ljava/math/BigInteger;", "Ljava/math/BigInteger;", "()Ljava/math/BigInteger;", "amountIn", "e", "amountOut", "", "f", "D", "()D", "(D)V", "priceImpact", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;D)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kt6 */
/* compiled from: TradeStructure.kt */
public final class kt6 {

    /* renamed from: a */
    public final ArrayList<PairsData> f40528a;

    /* renamed from: b */
    public final String f40529b;

    /* renamed from: c */
    public final String f40530c;

    /* renamed from: d */
    public final BigInteger f40531d;

    /* renamed from: e */
    public final BigInteger f40532e;

    /* renamed from: f */
    public double f40533f;

    public kt6(ArrayList<PairsData> arrayList, String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, double d) {
        vx2.m53591g(arrayList, "route");
        vx2.m53591g(str, "tokenIn");
        vx2.m53591g(str2, "tokenOut");
        vx2.m53591g(bigInteger, "amountIn");
        vx2.m53591g(bigInteger2, "amountOut");
        this.f40528a = arrayList;
        this.f40529b = str;
        this.f40530c = str2;
        this.f40531d = bigInteger;
        this.f40532e = bigInteger2;
        this.f40533f = d;
    }

    /* renamed from: a */
    public final BigInteger mo55776a() {
        return this.f40531d;
    }

    /* renamed from: b */
    public final BigInteger mo55777b() {
        return this.f40532e;
    }

    /* renamed from: c */
    public final double mo55778c() {
        return this.f40533f;
    }

    /* renamed from: d */
    public final ArrayList<PairsData> mo55779d() {
        return this.f40528a;
    }

    /* renamed from: e */
    public final void mo55780e(double d) {
        this.f40533f = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt6)) {
            return false;
        }
        kt6 kt6 = (kt6) obj;
        return vx2.m53586b(this.f40528a, kt6.f40528a) && vx2.m53586b(this.f40529b, kt6.f40529b) && vx2.m53586b(this.f40530c, kt6.f40530c) && vx2.m53586b(this.f40531d, kt6.f40531d) && vx2.m53586b(this.f40532e, kt6.f40532e) && Double.compare(this.f40533f, kt6.f40533f) == 0;
    }

    public int hashCode() {
        return (((((((((this.f40528a.hashCode() * 31) + this.f40529b.hashCode()) * 31) + this.f40530c.hashCode()) * 31) + this.f40531d.hashCode()) * 31) + this.f40532e.hashCode()) * 31) + Double.doubleToLongBits(this.f40533f);
    }

    public String toString() {
        ArrayList<PairsData> arrayList = this.f40528a;
        String str = this.f40529b;
        String str2 = this.f40530c;
        BigInteger bigInteger = this.f40531d;
        BigInteger bigInteger2 = this.f40532e;
        double d = this.f40533f;
        return "TradeStructure(route=" + arrayList + ", tokenIn=" + str + ", tokenOut=" + str2 + ", amountIn=" + bigInteger + ", amountOut=" + bigInteger2 + ", priceImpact=" + d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt6(ArrayList arrayList, String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, str, str2, bigInteger, bigInteger2, (i & 32) != 0 ? 0.0d : d);
    }
}
