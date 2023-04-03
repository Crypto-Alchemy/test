package net.safemoon.androidwallet.model.rpc2.doge.details;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

@Metadata(mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u00106\u001a\u00020\u0015HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003JÜ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0005HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b#\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001dR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b'\u0010\u001dR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b-\u0010\u001dR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006I"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/doge/details/Transaction;", "", "blockHash", "", "confirmations", "", "fee", "hash", "inputs", "", "Lnet/safemoon/androidwallet/model/rpc2/doge/details/Input;", "inputsN", "inputsValue", "locktime", "outputs", "Lnet/safemoon/androidwallet/model/rpc2/doge/details/Output;", "outputsN", "outputsValue", "price", "size", "time", "", "version", "vsize", "weight", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;)V", "getBlockHash", "()Ljava/lang/String;", "getConfirmations", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFee", "getHash", "getInputs", "()Ljava/util/List;", "getInputsN", "getInputsValue", "getLocktime", "getOutputs", "getOutputsN", "getOutputsValue", "getPrice", "getSize", "getTime", "()J", "getVersion", "getVsize", "getWeight", "()Ljava/lang/Object;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;)Lnet/safemoon/androidwallet/model/rpc2/doge/details/Transaction;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: Transaction.kt */
public final class Transaction {
    @SerializedName("block_hash")
    private final String blockHash;
    @SerializedName("confirmations")
    private final Integer confirmations;
    @SerializedName("fee")
    private final String fee;
    @SerializedName("hash")
    private final String hash;
    @SerializedName("inputs")
    private final List<Input> inputs;
    @SerializedName("inputs_n")
    private final Integer inputsN;
    @SerializedName("inputs_value")
    private final String inputsValue;
    @SerializedName("locktime")
    private final Integer locktime;
    @SerializedName("outputs")
    private final List<Output> outputs;
    @SerializedName("outputs_n")
    private final Integer outputsN;
    @SerializedName("outputs_value")
    private final String outputsValue;
    @SerializedName("price")
    private final String price;
    @SerializedName("size")
    private final Integer size;
    @SerializedName("time")
    private final long time;
    @SerializedName("version")
    private final Integer version;
    @SerializedName("vsize")
    private final Integer vsize;
    @SerializedName("weight")
    private final Object weight;

    public Transaction(String str, Integer num, String str2, String str3, List<Input> list, Integer num2, String str4, Integer num3, List<Output> list2, Integer num4, String str5, String str6, Integer num5, long j, Integer num6, Integer num7, Object obj) {
        vx2.m53591g(str2, "fee");
        vx2.m53591g(str3, "hash");
        vx2.m53591g(list, "inputs");
        vx2.m53591g(list2, "outputs");
        this.blockHash = str;
        this.confirmations = num;
        this.fee = str2;
        this.hash = str3;
        this.inputs = list;
        this.inputsN = num2;
        this.inputsValue = str4;
        this.locktime = num3;
        this.outputs = list2;
        this.outputsN = num4;
        this.outputsValue = str5;
        this.price = str6;
        this.size = num5;
        this.time = j;
        this.version = num6;
        this.vsize = num7;
        this.weight = obj;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, Integer num, String str2, String str3, List list, Integer num2, String str4, Integer num3, List list2, Integer num4, String str5, String str6, Integer num5, long j, Integer num6, Integer num7, Object obj, int i, Object obj2) {
        Transaction transaction2 = transaction;
        int i2 = i;
        return transaction.copy((i2 & 1) != 0 ? transaction2.blockHash : str, (i2 & 2) != 0 ? transaction2.confirmations : num, (i2 & 4) != 0 ? transaction2.fee : str2, (i2 & 8) != 0 ? transaction2.hash : str3, (i2 & 16) != 0 ? transaction2.inputs : list, (i2 & 32) != 0 ? transaction2.inputsN : num2, (i2 & 64) != 0 ? transaction2.inputsValue : str4, (i2 & 128) != 0 ? transaction2.locktime : num3, (i2 & 256) != 0 ? transaction2.outputs : list2, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? transaction2.outputsN : num4, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? transaction2.outputsValue : str5, (i2 & 2048) != 0 ? transaction2.price : str6, (i2 & 4096) != 0 ? transaction2.size : num5, (i2 & 8192) != 0 ? transaction2.time : j, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? transaction2.version : num6, (32768 & i2) != 0 ? transaction2.vsize : num7, (i2 & 65536) != 0 ? transaction2.weight : obj);
    }

    public final String component1() {
        return this.blockHash;
    }

    public final Integer component10() {
        return this.outputsN;
    }

    public final String component11() {
        return this.outputsValue;
    }

    public final String component12() {
        return this.price;
    }

    public final Integer component13() {
        return this.size;
    }

    public final long component14() {
        return this.time;
    }

    public final Integer component15() {
        return this.version;
    }

    public final Integer component16() {
        return this.vsize;
    }

    public final Object component17() {
        return this.weight;
    }

    public final Integer component2() {
        return this.confirmations;
    }

    public final String component3() {
        return this.fee;
    }

    public final String component4() {
        return this.hash;
    }

    public final List<Input> component5() {
        return this.inputs;
    }

    public final Integer component6() {
        return this.inputsN;
    }

    public final String component7() {
        return this.inputsValue;
    }

    public final Integer component8() {
        return this.locktime;
    }

    public final List<Output> component9() {
        return this.outputs;
    }

    public final Transaction copy(String str, Integer num, String str2, String str3, List<Input> list, Integer num2, String str4, Integer num3, List<Output> list2, Integer num4, String str5, String str6, Integer num5, long j, Integer num6, Integer num7, Object obj) {
        String str7 = str;
        vx2.m53591g(str2, "fee");
        vx2.m53591g(str3, "hash");
        vx2.m53591g(list, "inputs");
        vx2.m53591g(list2, "outputs");
        return new Transaction(str, num, str2, str3, list, num2, str4, num3, list2, num4, str5, str6, num5, j, num6, num7, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return vx2.m53586b(this.blockHash, transaction.blockHash) && vx2.m53586b(this.confirmations, transaction.confirmations) && vx2.m53586b(this.fee, transaction.fee) && vx2.m53586b(this.hash, transaction.hash) && vx2.m53586b(this.inputs, transaction.inputs) && vx2.m53586b(this.inputsN, transaction.inputsN) && vx2.m53586b(this.inputsValue, transaction.inputsValue) && vx2.m53586b(this.locktime, transaction.locktime) && vx2.m53586b(this.outputs, transaction.outputs) && vx2.m53586b(this.outputsN, transaction.outputsN) && vx2.m53586b(this.outputsValue, transaction.outputsValue) && vx2.m53586b(this.price, transaction.price) && vx2.m53586b(this.size, transaction.size) && this.time == transaction.time && vx2.m53586b(this.version, transaction.version) && vx2.m53586b(this.vsize, transaction.vsize) && vx2.m53586b(this.weight, transaction.weight);
    }

    public final String getBlockHash() {
        return this.blockHash;
    }

    public final Integer getConfirmations() {
        return this.confirmations;
    }

    public final String getFee() {
        return this.fee;
    }

    public final String getHash() {
        return this.hash;
    }

    public final List<Input> getInputs() {
        return this.inputs;
    }

    public final Integer getInputsN() {
        return this.inputsN;
    }

    public final String getInputsValue() {
        return this.inputsValue;
    }

    public final Integer getLocktime() {
        return this.locktime;
    }

    public final List<Output> getOutputs() {
        return this.outputs;
    }

    public final Integer getOutputsN() {
        return this.outputsN;
    }

    public final String getOutputsValue() {
        return this.outputsValue;
    }

    public final String getPrice() {
        return this.price;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final long getTime() {
        return this.time;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final Integer getVsize() {
        return this.vsize;
    }

    public final Object getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.blockHash;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.confirmations;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.fee.hashCode()) * 31) + this.hash.hashCode()) * 31) + this.inputs.hashCode()) * 31;
        Integer num2 = this.inputsN;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.inputsValue;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.locktime;
        int hashCode5 = (((hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.outputs.hashCode()) * 31;
        Integer num4 = this.outputsN;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.outputsValue;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.price;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.size;
        int hashCode9 = (((hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31) + au0.m10781a(this.time)) * 31;
        Integer num6 = this.version;
        int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.vsize;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Object obj = this.weight;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.blockHash;
        Integer num = this.confirmations;
        String str2 = this.fee;
        String str3 = this.hash;
        List<Input> list = this.inputs;
        Integer num2 = this.inputsN;
        String str4 = this.inputsValue;
        Integer num3 = this.locktime;
        List<Output> list2 = this.outputs;
        Integer num4 = this.outputsN;
        String str5 = this.outputsValue;
        String str6 = this.price;
        Integer num5 = this.size;
        long j = this.time;
        Integer num6 = this.version;
        Integer num7 = this.vsize;
        Object obj = this.weight;
        return "Transaction(blockHash=" + str + ", confirmations=" + num + ", fee=" + str2 + ", hash=" + str3 + ", inputs=" + list + ", inputsN=" + num2 + ", inputsValue=" + str4 + ", locktime=" + num3 + ", outputs=" + list2 + ", outputsN=" + num4 + ", outputsValue=" + str5 + ", price=" + str6 + ", size=" + num5 + ", time=" + j + ", version=" + num6 + ", vsize=" + num7 + ", weight=" + obj + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Transaction(java.lang.String r22, java.lang.Integer r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.Integer r27, java.lang.String r28, java.lang.Integer r29, java.util.List r30, java.lang.Integer r31, java.lang.String r32, java.lang.String r33, java.lang.Integer r34, long r35, java.lang.Integer r37, java.lang.Integer r38, java.lang.Object r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 16
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = p000.ck0.m33062j()
            r7 = r1
            goto L_0x000e
        L_0x000c:
            r7 = r26
        L_0x000e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0018
            java.util.List r0 = p000.ck0.m33062j()
            r11 = r0
            goto L_0x001a
        L_0x0018:
            r11 = r30
        L_0x001a:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r8 = r27
            r9 = r28
            r10 = r29
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r18 = r37
            r19 = r38
            r20 = r39
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.rpc2.doge.details.Transaction.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, java.lang.Integer, java.util.List, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, long, java.lang.Integer, java.lang.Integer, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
