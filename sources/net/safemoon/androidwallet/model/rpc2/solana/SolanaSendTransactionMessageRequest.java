package net.safemoon.androidwallet.model.rpc2.solana;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaSendTransactionMessageRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaRequest;", "signTransaction", "", "(Ljava/lang/String;)V", "getSignTransaction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaSendTransactionMessageRequest.kt */
public final class SolanaSendTransactionMessageRequest extends SolanaRequest {
    private final String signTransaction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SolanaSendTransactionMessageRequest(String str) {
        super("sendTransaction", ck0.m33058f(str, new SolanaConfiguration(0, 1, (DefaultConstructorMarker) null)));
        vx2.m53591g(str, "signTransaction");
        this.signTransaction = str;
    }

    public static /* synthetic */ SolanaSendTransactionMessageRequest copy$default(SolanaSendTransactionMessageRequest solanaSendTransactionMessageRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaSendTransactionMessageRequest.signTransaction;
        }
        return solanaSendTransactionMessageRequest.copy(str);
    }

    public final String component1() {
        return this.signTransaction;
    }

    public final SolanaSendTransactionMessageRequest copy(String str) {
        vx2.m53591g(str, "signTransaction");
        return new SolanaSendTransactionMessageRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolanaSendTransactionMessageRequest) && vx2.m53586b(this.signTransaction, ((SolanaSendTransactionMessageRequest) obj).signTransaction);
    }

    public final String getSignTransaction() {
        return this.signTransaction;
    }

    public int hashCode() {
        return this.signTransaction.hashCode();
    }

    public String toString() {
        String str = this.signTransaction;
        return "SolanaSendTransactionMessageRequest(signTransaction=" + str + ")";
    }
}
