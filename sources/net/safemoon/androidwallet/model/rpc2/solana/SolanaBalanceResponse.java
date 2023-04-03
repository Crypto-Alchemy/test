package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceResponse;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaResponse;", "()V", "result", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceResponse$Result;", "getResult", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceResponse$Result;", "setResult", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceResponse$Result;)V", "Result", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaBalanceResponse.kt */
public final class SolanaBalanceResponse extends SolanaResponse {
    @SerializedName("result")
    @Expose
    private Result result = new Result((Long) null, 1, (DefaultConstructorMarker) null);

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceResponse$Result;", "", "value", "", "(Ljava/lang/Long;)V", "getValue", "()Ljava/lang/Long;", "setValue", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceResponse$Result;", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceResponse.kt */
    public static final class Result {
        @SerializedName("value")
        @Expose
        private Long value;

        public Result() {
            this((Long) null, 1, (DefaultConstructorMarker) null);
        }

        public Result(Long l) {
            this.value = l;
        }

        public static /* synthetic */ Result copy$default(Result result, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                l = result.value;
            }
            return result.copy(l);
        }

        public final Long component1() {
            return this.value;
        }

        public final Result copy(Long l) {
            return new Result(l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && vx2.m53586b(this.value, ((Result) obj).value);
        }

        public final Long getValue() {
            return this.value;
        }

        public int hashCode() {
            Long l = this.value;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final void setValue(Long l) {
            this.value = l;
        }

        public String toString() {
            Long l = this.value;
            return "Result(value=" + l + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Result(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l);
        }
    }

    public final Result getResult() {
        return this.result;
    }

    public final void setResult(Result result2) {
        this.result = result2;
    }
}
