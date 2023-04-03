package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

@Metadata(mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\b\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001bJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rHÆ\u0003Jò\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0005HÖ\u0001J\t\u0010M\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b&\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b+\u0010 R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b/\u0010 R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b0\u0010 R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b2\u0010 R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b3\u0010 R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b4\u0010 R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b5\u0010 ¨\u0006N"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Tx;", "", "balance", "", "blockHeight", "", "blockIndex", "doubleSpend", "", "fee", "hash", "", "inputs", "", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Input;", "lockTime", "out", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Out;", "relayedBy", "result", "size", "time", "txIndex", "ver", "vinSz", "voutSz", "weight", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBlockHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBlockIndex", "getDoubleSpend", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFee", "getHash", "()Ljava/lang/String;", "getInputs", "()Ljava/util/List;", "getLockTime", "getOut", "getRelayedBy", "getResult", "getSize", "getTime", "getTxIndex", "getVer", "getVinSz", "getVoutSz", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Tx;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* renamed from: net.safemoon.androidwallet.model.rpc2.bitcoin.Tx */
/* compiled from: BlockChainTransactionList.kt */
public final class C8602Tx {
    @SerializedName("balance")
    private final Long balance;
    @SerializedName("block_height")
    private final Integer blockHeight;
    @SerializedName("block_index")
    private final Integer blockIndex;
    @SerializedName("double_spend")
    private final Boolean doubleSpend;
    @SerializedName("fee")
    private final Integer fee;
    @SerializedName("hash")
    private final String hash;
    @SerializedName("inputs")
    private final List<Input> inputs;
    @SerializedName("lock_time")
    private final Integer lockTime;
    @SerializedName("out")
    private final List<Out> out;
    @SerializedName("relayed_by")
    private final String relayedBy;
    @SerializedName("result")
    private final Long result;
    @SerializedName("size")
    private final Integer size;
    @SerializedName("time")
    private final Integer time;
    @SerializedName("tx_index")
    private final Long txIndex;
    @SerializedName("ver")
    private final Integer ver;
    @SerializedName("vin_sz")
    private final Integer vinSz;
    @SerializedName("vout_sz")
    private final Integer voutSz;
    @SerializedName("weight")
    private final Integer weight;

    public C8602Tx(Long l, Integer num, Integer num2, Boolean bool, Integer num3, String str, List<Input> list, Integer num4, List<Out> list2, String str2, Long l2, Integer num5, Integer num6, Long l3, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.balance = l;
        this.blockHeight = num;
        this.blockIndex = num2;
        this.doubleSpend = bool;
        this.fee = num3;
        this.hash = str;
        this.inputs = list;
        this.lockTime = num4;
        this.out = list2;
        this.relayedBy = str2;
        this.result = l2;
        this.size = num5;
        this.time = num6;
        this.txIndex = l3;
        this.ver = num7;
        this.vinSz = num8;
        this.voutSz = num9;
        this.weight = num10;
    }

    public static /* synthetic */ C8602Tx copy$default(C8602Tx tx, Long l, Integer num, Integer num2, Boolean bool, Integer num3, String str, List list, Integer num4, List list2, String str2, Long l2, Integer num5, Integer num6, Long l3, Integer num7, Integer num8, Integer num9, Integer num10, int i, Object obj) {
        C8602Tx tx2 = tx;
        int i2 = i;
        return tx.copy((i2 & 1) != 0 ? tx2.balance : l, (i2 & 2) != 0 ? tx2.blockHeight : num, (i2 & 4) != 0 ? tx2.blockIndex : num2, (i2 & 8) != 0 ? tx2.doubleSpend : bool, (i2 & 16) != 0 ? tx2.fee : num3, (i2 & 32) != 0 ? tx2.hash : str, (i2 & 64) != 0 ? tx2.inputs : list, (i2 & 128) != 0 ? tx2.lockTime : num4, (i2 & 256) != 0 ? tx2.out : list2, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? tx2.relayedBy : str2, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? tx2.result : l2, (i2 & 2048) != 0 ? tx2.size : num5, (i2 & 4096) != 0 ? tx2.time : num6, (i2 & 8192) != 0 ? tx2.txIndex : l3, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? tx2.ver : num7, (i2 & 32768) != 0 ? tx2.vinSz : num8, (i2 & 65536) != 0 ? tx2.voutSz : num9, (i2 & 131072) != 0 ? tx2.weight : num10);
    }

    public final Long component1() {
        return this.balance;
    }

    public final String component10() {
        return this.relayedBy;
    }

    public final Long component11() {
        return this.result;
    }

    public final Integer component12() {
        return this.size;
    }

    public final Integer component13() {
        return this.time;
    }

    public final Long component14() {
        return this.txIndex;
    }

    public final Integer component15() {
        return this.ver;
    }

    public final Integer component16() {
        return this.vinSz;
    }

    public final Integer component17() {
        return this.voutSz;
    }

    public final Integer component18() {
        return this.weight;
    }

    public final Integer component2() {
        return this.blockHeight;
    }

    public final Integer component3() {
        return this.blockIndex;
    }

    public final Boolean component4() {
        return this.doubleSpend;
    }

    public final Integer component5() {
        return this.fee;
    }

    public final String component6() {
        return this.hash;
    }

    public final List<Input> component7() {
        return this.inputs;
    }

    public final Integer component8() {
        return this.lockTime;
    }

    public final List<Out> component9() {
        return this.out;
    }

    public final C8602Tx copy(Long l, Integer num, Integer num2, Boolean bool, Integer num3, String str, List<Input> list, Integer num4, List<Out> list2, String str2, Long l2, Integer num5, Integer num6, Long l3, Integer num7, Integer num8, Integer num9, Integer num10) {
        return new C8602Tx(l, num, num2, bool, num3, str, list, num4, list2, str2, l2, num5, num6, l3, num7, num8, num9, num10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8602Tx)) {
            return false;
        }
        C8602Tx tx = (C8602Tx) obj;
        return vx2.m53586b(this.balance, tx.balance) && vx2.m53586b(this.blockHeight, tx.blockHeight) && vx2.m53586b(this.blockIndex, tx.blockIndex) && vx2.m53586b(this.doubleSpend, tx.doubleSpend) && vx2.m53586b(this.fee, tx.fee) && vx2.m53586b(this.hash, tx.hash) && vx2.m53586b(this.inputs, tx.inputs) && vx2.m53586b(this.lockTime, tx.lockTime) && vx2.m53586b(this.out, tx.out) && vx2.m53586b(this.relayedBy, tx.relayedBy) && vx2.m53586b(this.result, tx.result) && vx2.m53586b(this.size, tx.size) && vx2.m53586b(this.time, tx.time) && vx2.m53586b(this.txIndex, tx.txIndex) && vx2.m53586b(this.ver, tx.ver) && vx2.m53586b(this.vinSz, tx.vinSz) && vx2.m53586b(this.voutSz, tx.voutSz) && vx2.m53586b(this.weight, tx.weight);
    }

    public final Long getBalance() {
        return this.balance;
    }

    public final Integer getBlockHeight() {
        return this.blockHeight;
    }

    public final Integer getBlockIndex() {
        return this.blockIndex;
    }

    public final Boolean getDoubleSpend() {
        return this.doubleSpend;
    }

    public final Integer getFee() {
        return this.fee;
    }

    public final String getHash() {
        return this.hash;
    }

    public final List<Input> getInputs() {
        return this.inputs;
    }

    public final Integer getLockTime() {
        return this.lockTime;
    }

    public final List<Out> getOut() {
        return this.out;
    }

    public final String getRelayedBy() {
        return this.relayedBy;
    }

    public final Long getResult() {
        return this.result;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final Integer getTime() {
        return this.time;
    }

    public final Long getTxIndex() {
        return this.txIndex;
    }

    public final Integer getVer() {
        return this.ver;
    }

    public final Integer getVinSz() {
        return this.vinSz;
    }

    public final Integer getVoutSz() {
        return this.voutSz;
    }

    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Long l = this.balance;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.blockHeight;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.blockIndex;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.doubleSpend;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.fee;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.hash;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<Input> list = this.inputs;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.lockTime;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<Out> list2 = this.out;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.relayedBy;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.result;
        int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num5 = this.size;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.time;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l3 = this.txIndex;
        int hashCode14 = (hashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num7 = this.ver;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.vinSz;
        int hashCode16 = (hashCode15 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.voutSz;
        int hashCode17 = (hashCode16 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.weight;
        if (num10 != null) {
            i = num10.hashCode();
        }
        return hashCode17 + i;
    }

    public String toString() {
        Long l = this.balance;
        Integer num = this.blockHeight;
        Integer num2 = this.blockIndex;
        Boolean bool = this.doubleSpend;
        Integer num3 = this.fee;
        String str = this.hash;
        List<Input> list = this.inputs;
        Integer num4 = this.lockTime;
        List<Out> list2 = this.out;
        String str2 = this.relayedBy;
        Long l2 = this.result;
        Integer num5 = this.size;
        Integer num6 = this.time;
        Long l3 = this.txIndex;
        Integer num7 = this.ver;
        Integer num8 = this.vinSz;
        Integer num9 = this.voutSz;
        Integer num10 = this.weight;
        return "Tx(balance=" + l + ", blockHeight=" + num + ", blockIndex=" + num2 + ", doubleSpend=" + bool + ", fee=" + num3 + ", hash=" + str + ", inputs=" + list + ", lockTime=" + num4 + ", out=" + list2 + ", relayedBy=" + str2 + ", result=" + l2 + ", size=" + num5 + ", time=" + num6 + ", txIndex=" + l3 + ", ver=" + num7 + ", vinSz=" + num8 + ", voutSz=" + num9 + ", weight=" + num10 + ")";
    }
}
