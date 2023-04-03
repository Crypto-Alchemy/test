package net.safemoon.androidwallet.model.transaction.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/ParamsX;", "", "Account0", "", "Account1", "Account2", "Account3", "Account4", "Account5", "Account6", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount0", "()Ljava/lang/String;", "getAccount1", "getAccount2", "getAccount3", "getAccount4", "getAccount5", "getAccount6", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ParamsX.kt */
public final class ParamsX {
    private final String Account0;
    private final String Account1;
    private final String Account2;
    private final String Account3;
    private final String Account4;
    private final String Account5;
    private final String Account6;

    public ParamsX(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        vx2.m53591g(str, "Account0");
        vx2.m53591g(str2, "Account1");
        vx2.m53591g(str3, "Account2");
        vx2.m53591g(str4, "Account3");
        vx2.m53591g(str5, "Account4");
        vx2.m53591g(str6, "Account5");
        vx2.m53591g(str7, "Account6");
        this.Account0 = str;
        this.Account1 = str2;
        this.Account2 = str3;
        this.Account3 = str4;
        this.Account4 = str5;
        this.Account5 = str6;
        this.Account6 = str7;
    }

    public static /* synthetic */ ParamsX copy$default(ParamsX paramsX, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paramsX.Account0;
        }
        if ((i & 2) != 0) {
            str2 = paramsX.Account1;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = paramsX.Account2;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = paramsX.Account3;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = paramsX.Account4;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = paramsX.Account5;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = paramsX.Account6;
        }
        return paramsX.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.Account0;
    }

    public final String component2() {
        return this.Account1;
    }

    public final String component3() {
        return this.Account2;
    }

    public final String component4() {
        return this.Account3;
    }

    public final String component5() {
        return this.Account4;
    }

    public final String component6() {
        return this.Account5;
    }

    public final String component7() {
        return this.Account6;
    }

    public final ParamsX copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        vx2.m53591g(str, "Account0");
        vx2.m53591g(str2, "Account1");
        vx2.m53591g(str3, "Account2");
        vx2.m53591g(str4, "Account3");
        vx2.m53591g(str5, "Account4");
        vx2.m53591g(str6, "Account5");
        String str8 = str7;
        vx2.m53591g(str8, "Account6");
        return new ParamsX(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamsX)) {
            return false;
        }
        ParamsX paramsX = (ParamsX) obj;
        return vx2.m53586b(this.Account0, paramsX.Account0) && vx2.m53586b(this.Account1, paramsX.Account1) && vx2.m53586b(this.Account2, paramsX.Account2) && vx2.m53586b(this.Account3, paramsX.Account3) && vx2.m53586b(this.Account4, paramsX.Account4) && vx2.m53586b(this.Account5, paramsX.Account5) && vx2.m53586b(this.Account6, paramsX.Account6);
    }

    public final String getAccount0() {
        return this.Account0;
    }

    public final String getAccount1() {
        return this.Account1;
    }

    public final String getAccount2() {
        return this.Account2;
    }

    public final String getAccount3() {
        return this.Account3;
    }

    public final String getAccount4() {
        return this.Account4;
    }

    public final String getAccount5() {
        return this.Account5;
    }

    public final String getAccount6() {
        return this.Account6;
    }

    public int hashCode() {
        return (((((((((((this.Account0.hashCode() * 31) + this.Account1.hashCode()) * 31) + this.Account2.hashCode()) * 31) + this.Account3.hashCode()) * 31) + this.Account4.hashCode()) * 31) + this.Account5.hashCode()) * 31) + this.Account6.hashCode();
    }

    public String toString() {
        String str = this.Account0;
        String str2 = this.Account1;
        String str3 = this.Account2;
        String str4 = this.Account3;
        String str5 = this.Account4;
        String str6 = this.Account5;
        String str7 = this.Account6;
        return "ParamsX(Account0=" + str + ", Account1=" + str2 + ", Account2=" + str3 + ", Account3=" + str4 + ", Account4=" + str5 + ", Account5=" + str6 + ", Account6=" + str7 + ")";
    }
}
