package net.safemoon.androidwallet.model.transaction.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/InputAccount;", "", "account", "", "postBalance", "", "preBalance", "signer", "", "writable", "(Ljava/lang/String;JJZZ)V", "getAccount", "()Ljava/lang/String;", "getPostBalance", "()J", "getPreBalance", "getSigner", "()Z", "getWritable", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: InputAccount.kt */
public final class InputAccount {
    private final String account;
    private final long postBalance;
    private final long preBalance;
    private final boolean signer;
    private final boolean writable;

    public InputAccount(String str, long j, long j2, boolean z, boolean z2) {
        vx2.m53591g(str, "account");
        this.account = str;
        this.postBalance = j;
        this.preBalance = j2;
        this.signer = z;
        this.writable = z2;
    }

    public static /* synthetic */ InputAccount copy$default(InputAccount inputAccount, String str, long j, long j2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputAccount.account;
        }
        if ((i & 2) != 0) {
            j = inputAccount.postBalance;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = inputAccount.preBalance;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            z = inputAccount.signer;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = inputAccount.writable;
        }
        return inputAccount.copy(str, j3, j4, z3, z2);
    }

    public final String component1() {
        return this.account;
    }

    public final long component2() {
        return this.postBalance;
    }

    public final long component3() {
        return this.preBalance;
    }

    public final boolean component4() {
        return this.signer;
    }

    public final boolean component5() {
        return this.writable;
    }

    public final InputAccount copy(String str, long j, long j2, boolean z, boolean z2) {
        vx2.m53591g(str, "account");
        return new InputAccount(str, j, j2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputAccount)) {
            return false;
        }
        InputAccount inputAccount = (InputAccount) obj;
        return vx2.m53586b(this.account, inputAccount.account) && this.postBalance == inputAccount.postBalance && this.preBalance == inputAccount.preBalance && this.signer == inputAccount.signer && this.writable == inputAccount.writable;
    }

    public final String getAccount() {
        return this.account;
    }

    public final long getPostBalance() {
        return this.postBalance;
    }

    public final long getPreBalance() {
        return this.preBalance;
    }

    public final boolean getSigner() {
        return this.signer;
    }

    public final boolean getWritable() {
        return this.writable;
    }

    public int hashCode() {
        int hashCode = ((((this.account.hashCode() * 31) + au0.m10781a(this.postBalance)) * 31) + au0.m10781a(this.preBalance)) * 31;
        boolean z = this.signer;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.writable;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.account;
        long j = this.postBalance;
        long j2 = this.preBalance;
        boolean z = this.signer;
        boolean z2 = this.writable;
        return "InputAccount(account=" + str + ", postBalance=" + j + ", preBalance=" + j2 + ", signer=" + z + ", writable=" + z2 + ")";
    }
}
