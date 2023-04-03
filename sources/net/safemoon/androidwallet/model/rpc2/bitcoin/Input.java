package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Input;", "", "index", "", "prevOut", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/PrevOut;", "script", "", "sequence", "", "witness", "(Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/bitcoin/PrevOut;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrevOut", "()Lnet/safemoon/androidwallet/model/rpc2/bitcoin/PrevOut;", "getScript", "()Ljava/lang/String;", "getSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWitness", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/bitcoin/PrevOut;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Input;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BlockChainTransactionList.kt */
public final class Input {
    @SerializedName("index")
    private final Integer index;
    @SerializedName("prev_out")
    private final PrevOut prevOut;
    @SerializedName("script")
    private final String script;
    @SerializedName("sequence")
    private final Long sequence;
    @SerializedName("witness")
    private final String witness;

    public Input(Integer num, PrevOut prevOut2, String str, Long l, String str2) {
        this.index = num;
        this.prevOut = prevOut2;
        this.script = str;
        this.sequence = l;
        this.witness = str2;
    }

    public static /* synthetic */ Input copy$default(Input input, Integer num, PrevOut prevOut2, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = input.index;
        }
        if ((i & 2) != 0) {
            prevOut2 = input.prevOut;
        }
        PrevOut prevOut3 = prevOut2;
        if ((i & 4) != 0) {
            str = input.script;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            l = input.sequence;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str2 = input.witness;
        }
        return input.copy(num, prevOut3, str3, l2, str2);
    }

    public final Integer component1() {
        return this.index;
    }

    public final PrevOut component2() {
        return this.prevOut;
    }

    public final String component3() {
        return this.script;
    }

    public final Long component4() {
        return this.sequence;
    }

    public final String component5() {
        return this.witness;
    }

    public final Input copy(Integer num, PrevOut prevOut2, String str, Long l, String str2) {
        return new Input(num, prevOut2, str, l, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Input)) {
            return false;
        }
        Input input = (Input) obj;
        return vx2.m53586b(this.index, input.index) && vx2.m53586b(this.prevOut, input.prevOut) && vx2.m53586b(this.script, input.script) && vx2.m53586b(this.sequence, input.sequence) && vx2.m53586b(this.witness, input.witness);
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final PrevOut getPrevOut() {
        return this.prevOut;
    }

    public final String getScript() {
        return this.script;
    }

    public final Long getSequence() {
        return this.sequence;
    }

    public final String getWitness() {
        return this.witness;
    }

    public int hashCode() {
        Integer num = this.index;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        PrevOut prevOut2 = this.prevOut;
        int hashCode2 = (hashCode + (prevOut2 == null ? 0 : prevOut2.hashCode())) * 31;
        String str = this.script;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.sequence;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.witness;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Integer num = this.index;
        PrevOut prevOut2 = this.prevOut;
        String str = this.script;
        Long l = this.sequence;
        String str2 = this.witness;
        return "Input(index=" + num + ", prevOut=" + prevOut2 + ", script=" + str + ", sequence=" + l + ", witness=" + str2 + ")";
    }
}
