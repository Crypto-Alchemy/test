package net.safemoon.androidwallet.model.rpc2.doge.details;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/doge/details/Input;", "", "address", "", "pos", "", "previousOutput", "Lnet/safemoon/androidwallet/model/rpc2/doge/details/PreviousOutput;", "scriptSig", "Lnet/safemoon/androidwallet/model/rpc2/doge/details/ScriptSig;", "value", "(Ljava/lang/String;Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/doge/details/PreviousOutput;Lnet/safemoon/androidwallet/model/rpc2/doge/details/ScriptSig;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getPos", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPreviousOutput", "()Lnet/safemoon/androidwallet/model/rpc2/doge/details/PreviousOutput;", "getScriptSig", "()Lnet/safemoon/androidwallet/model/rpc2/doge/details/ScriptSig;", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/doge/details/PreviousOutput;Lnet/safemoon/androidwallet/model/rpc2/doge/details/ScriptSig;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/rpc2/doge/details/Input;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: Input.kt */
public final class Input {
    @SerializedName("address")
    private final String address;
    @SerializedName("pos")
    private final Integer pos;
    @SerializedName("previous_output")
    private final PreviousOutput previousOutput;
    @SerializedName("scriptSig")
    private final ScriptSig scriptSig;
    @SerializedName("value")
    private final String value;

    public Input(String str, Integer num, PreviousOutput previousOutput2, ScriptSig scriptSig2, String str2) {
        vx2.m53591g(str2, "value");
        this.address = str;
        this.pos = num;
        this.previousOutput = previousOutput2;
        this.scriptSig = scriptSig2;
        this.value = str2;
    }

    public static /* synthetic */ Input copy$default(Input input, String str, Integer num, PreviousOutput previousOutput2, ScriptSig scriptSig2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = input.address;
        }
        if ((i & 2) != 0) {
            num = input.pos;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            previousOutput2 = input.previousOutput;
        }
        PreviousOutput previousOutput3 = previousOutput2;
        if ((i & 8) != 0) {
            scriptSig2 = input.scriptSig;
        }
        ScriptSig scriptSig3 = scriptSig2;
        if ((i & 16) != 0) {
            str2 = input.value;
        }
        return input.copy(str, num2, previousOutput3, scriptSig3, str2);
    }

    public final String component1() {
        return this.address;
    }

    public final Integer component2() {
        return this.pos;
    }

    public final PreviousOutput component3() {
        return this.previousOutput;
    }

    public final ScriptSig component4() {
        return this.scriptSig;
    }

    public final String component5() {
        return this.value;
    }

    public final Input copy(String str, Integer num, PreviousOutput previousOutput2, ScriptSig scriptSig2, String str2) {
        vx2.m53591g(str2, "value");
        return new Input(str, num, previousOutput2, scriptSig2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Input)) {
            return false;
        }
        Input input = (Input) obj;
        return vx2.m53586b(this.address, input.address) && vx2.m53586b(this.pos, input.pos) && vx2.m53586b(this.previousOutput, input.previousOutput) && vx2.m53586b(this.scriptSig, input.scriptSig) && vx2.m53586b(this.value, input.value);
    }

    public final String getAddress() {
        return this.address;
    }

    public final Integer getPos() {
        return this.pos;
    }

    public final PreviousOutput getPreviousOutput() {
        return this.previousOutput;
    }

    public final ScriptSig getScriptSig() {
        return this.scriptSig;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.address;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.pos;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        PreviousOutput previousOutput2 = this.previousOutput;
        int hashCode3 = (hashCode2 + (previousOutput2 == null ? 0 : previousOutput2.hashCode())) * 31;
        ScriptSig scriptSig2 = this.scriptSig;
        if (scriptSig2 != null) {
            i = scriptSig2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.value.hashCode();
    }

    public String toString() {
        String str = this.address;
        Integer num = this.pos;
        PreviousOutput previousOutput2 = this.previousOutput;
        ScriptSig scriptSig2 = this.scriptSig;
        String str2 = this.value;
        return "Input(address=" + str + ", pos=" + num + ", previousOutput=" + previousOutput2 + ", scriptSig=" + scriptSig2 + ", value=" + str2 + ")";
    }
}
