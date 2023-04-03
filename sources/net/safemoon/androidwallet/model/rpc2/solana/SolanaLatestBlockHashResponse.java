package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaResponse;", "()V", "result", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$Result;", "getResult", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$Result;", "setResult", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$Result;)V", "Result", "ResultValue", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaLatestBlockHashResponse.kt */
public final class SolanaLatestBlockHashResponse extends SolanaResponse {
    @SerializedName("result")
    @Expose
    private Result result = new Result((ResultValue) null, 1, (DefaultConstructorMarker) null);

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$Result;", "", "value", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$ResultValue;", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$ResultValue;)V", "getValue", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$ResultValue;", "setValue", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaLatestBlockHashResponse.kt */
    public static final class Result {
        @SerializedName("value")
        @Expose
        private ResultValue value;

        public Result() {
            this((ResultValue) null, 1, (DefaultConstructorMarker) null);
        }

        public Result(ResultValue resultValue) {
            this.value = resultValue;
        }

        public static /* synthetic */ Result copy$default(Result result, ResultValue resultValue, int i, Object obj) {
            if ((i & 1) != 0) {
                resultValue = result.value;
            }
            return result.copy(resultValue);
        }

        public final ResultValue component1() {
            return this.value;
        }

        public final Result copy(ResultValue resultValue) {
            return new Result(resultValue);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && vx2.m53586b(this.value, ((Result) obj).value);
        }

        public final ResultValue getValue() {
            return this.value;
        }

        public int hashCode() {
            ResultValue resultValue = this.value;
            if (resultValue == null) {
                return 0;
            }
            return resultValue.hashCode();
        }

        public final void setValue(ResultValue resultValue) {
            this.value = resultValue;
        }

        public String toString() {
            ResultValue resultValue = this.value;
            return "Result(value=" + resultValue + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Result(ResultValue resultValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ResultValue((String) null, 1, (DefaultConstructorMarker) null) : resultValue);
        }
    }

    @Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse$ResultValue;", "", "blockhash", "", "(Ljava/lang/String;)V", "getBlockhash", "()Ljava/lang/String;", "setBlockhash", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaLatestBlockHashResponse.kt */
    public static final class ResultValue {
        @SerializedName("blockhash")
        @Expose
        private String blockhash;

        public ResultValue() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public ResultValue(String str) {
            this.blockhash = str;
        }

        public static /* synthetic */ ResultValue copy$default(ResultValue resultValue, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resultValue.blockhash;
            }
            return resultValue.copy(str);
        }

        public final String component1() {
            return this.blockhash;
        }

        public final ResultValue copy(String str) {
            return new ResultValue(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResultValue) && vx2.m53586b(this.blockhash, ((ResultValue) obj).blockhash);
        }

        public final String getBlockhash() {
            return this.blockhash;
        }

        public int hashCode() {
            String str = this.blockhash;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setBlockhash(String str) {
            this.blockhash = str;
        }

        public String toString() {
            String str = this.blockhash;
            return "ResultValue(blockhash=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResultValue(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public final Result getResult() {
        return this.result;
    }

    public final void setResult(Result result2) {
        this.result = result2;
    }
}
