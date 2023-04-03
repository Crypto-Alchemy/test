package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

@Metadata(mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b6\b\b\u0018\u00002\u00020\u0001:\u0002HIBµ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0013\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0013\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003JÞ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b&\u0010\u001bR \u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b)\u0010\u001bR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u001bR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u001bR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b0\u0010\u001bR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b1\u0010\u001b¨\u0006J"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails;", "", "blockHeight", "", "blockIndex", "doubleSpend", "", "fee", "hash", "", "inputs", "", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input;", "lockTime", "out", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Out;", "relayedBy", "size", "time", "txIndex", "", "ver", "vinSz", "voutSz", "weight", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBlockHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBlockIndex", "getDoubleSpend", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFee", "getHash", "()Ljava/lang/String;", "getInputs", "()Ljava/util/List;", "getLockTime", "getOut", "getRelayedBy", "getSize", "getTime", "getTxIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVer", "getVinSz", "getVoutSz", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails;", "equals", "other", "hashCode", "toString", "Input", "Out", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BtcTxDetails.kt */
public final class BtcTxDetails {
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

    @Keep
    @Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001#B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input;", "", "index", "", "prevOut", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut;", "script", "", "sequence", "", "witness", "(Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrevOut", "()Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut;", "getScript", "()Ljava/lang/String;", "getSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWitness", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input;", "equals", "", "other", "hashCode", "toString", "PrevOut", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: BtcTxDetails.kt */
    public static final class Input {
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

        @Keep
        @Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b#\b\b\u0018\u00002\u00020\u0001:\u0001/B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014Jv\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R \u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0014¨\u00060"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut;", "", "addr", "", "n", "", "script", "spendingOutpoints", "", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut$SpendingOutpoint;", "spent", "", "txIndex", "", "type", "value", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAddr", "()Ljava/lang/String;", "getN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScript", "getSpendingOutpoints", "()Ljava/util/List;", "getSpent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTxIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut;", "equals", "other", "hashCode", "toString", "SpendingOutpoint", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* compiled from: BtcTxDetails.kt */
        public static final class PrevOut {
            @SerializedName("addr")
            private final String addr;
            @SerializedName("n")

            /* renamed from: n */
            private final Integer f42465n;
            @SerializedName("script")
            private final String script;
            @SerializedName("spending_outpoints")
            private final List<SpendingOutpoint> spendingOutpoints;
            @SerializedName("spent")
            private final Boolean spent;
            @SerializedName("tx_index")
            private final Long txIndex;
            @SerializedName("type")
            private final Integer type;
            @SerializedName("value")
            private final Integer value;

            @Keep
            @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut$SpendingOutpoint;", "", "n", "", "txIndex", "", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "getN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTxIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Input$PrevOut$SpendingOutpoint;", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
            /* compiled from: BtcTxDetails.kt */
            public static final class SpendingOutpoint {
                @SerializedName("n")

                /* renamed from: n */
                private final Integer f42466n;
                @SerializedName("tx_index")
                private final Long txIndex;

                public SpendingOutpoint(Integer num, Long l) {
                    this.f42466n = num;
                    this.txIndex = l;
                }

                public static /* synthetic */ SpendingOutpoint copy$default(SpendingOutpoint spendingOutpoint, Integer num, Long l, int i, Object obj) {
                    if ((i & 1) != 0) {
                        num = spendingOutpoint.f42466n;
                    }
                    if ((i & 2) != 0) {
                        l = spendingOutpoint.txIndex;
                    }
                    return spendingOutpoint.copy(num, l);
                }

                public final Integer component1() {
                    return this.f42466n;
                }

                public final Long component2() {
                    return this.txIndex;
                }

                public final SpendingOutpoint copy(Integer num, Long l) {
                    return new SpendingOutpoint(num, l);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SpendingOutpoint)) {
                        return false;
                    }
                    SpendingOutpoint spendingOutpoint = (SpendingOutpoint) obj;
                    return vx2.m53586b(this.f42466n, spendingOutpoint.f42466n) && vx2.m53586b(this.txIndex, spendingOutpoint.txIndex);
                }

                public final Integer getN() {
                    return this.f42466n;
                }

                public final Long getTxIndex() {
                    return this.txIndex;
                }

                public int hashCode() {
                    Integer num = this.f42466n;
                    int i = 0;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    Long l = this.txIndex;
                    if (l != null) {
                        i = l.hashCode();
                    }
                    return hashCode + i;
                }

                public String toString() {
                    Integer num = this.f42466n;
                    Long l = this.txIndex;
                    return "SpendingOutpoint(n=" + num + ", txIndex=" + l + ")";
                }
            }

            public PrevOut(String str, Integer num, String str2, List<SpendingOutpoint> list, Boolean bool, Long l, Integer num2, Integer num3) {
                this.addr = str;
                this.f42465n = num;
                this.script = str2;
                this.spendingOutpoints = list;
                this.spent = bool;
                this.txIndex = l;
                this.type = num2;
                this.value = num3;
            }

            public static /* synthetic */ PrevOut copy$default(PrevOut prevOut, String str, Integer num, String str2, List list, Boolean bool, Long l, Integer num2, Integer num3, int i, Object obj) {
                PrevOut prevOut2 = prevOut;
                int i2 = i;
                return prevOut.copy((i2 & 1) != 0 ? prevOut2.addr : str, (i2 & 2) != 0 ? prevOut2.f42465n : num, (i2 & 4) != 0 ? prevOut2.script : str2, (i2 & 8) != 0 ? prevOut2.spendingOutpoints : list, (i2 & 16) != 0 ? prevOut2.spent : bool, (i2 & 32) != 0 ? prevOut2.txIndex : l, (i2 & 64) != 0 ? prevOut2.type : num2, (i2 & 128) != 0 ? prevOut2.value : num3);
            }

            public final String component1() {
                return this.addr;
            }

            public final Integer component2() {
                return this.f42465n;
            }

            public final String component3() {
                return this.script;
            }

            public final List<SpendingOutpoint> component4() {
                return this.spendingOutpoints;
            }

            public final Boolean component5() {
                return this.spent;
            }

            public final Long component6() {
                return this.txIndex;
            }

            public final Integer component7() {
                return this.type;
            }

            public final Integer component8() {
                return this.value;
            }

            public final PrevOut copy(String str, Integer num, String str2, List<SpendingOutpoint> list, Boolean bool, Long l, Integer num2, Integer num3) {
                return new PrevOut(str, num, str2, list, bool, l, num2, num3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrevOut)) {
                    return false;
                }
                PrevOut prevOut = (PrevOut) obj;
                return vx2.m53586b(this.addr, prevOut.addr) && vx2.m53586b(this.f42465n, prevOut.f42465n) && vx2.m53586b(this.script, prevOut.script) && vx2.m53586b(this.spendingOutpoints, prevOut.spendingOutpoints) && vx2.m53586b(this.spent, prevOut.spent) && vx2.m53586b(this.txIndex, prevOut.txIndex) && vx2.m53586b(this.type, prevOut.type) && vx2.m53586b(this.value, prevOut.value);
            }

            public final String getAddr() {
                return this.addr;
            }

            public final Integer getN() {
                return this.f42465n;
            }

            public final String getScript() {
                return this.script;
            }

            public final List<SpendingOutpoint> getSpendingOutpoints() {
                return this.spendingOutpoints;
            }

            public final Boolean getSpent() {
                return this.spent;
            }

            public final Long getTxIndex() {
                return this.txIndex;
            }

            public final Integer getType() {
                return this.type;
            }

            public final Integer getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.addr;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.f42465n;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.script;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<SpendingOutpoint> list = this.spendingOutpoints;
                int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                Boolean bool = this.spent;
                int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.txIndex;
                int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
                Integer num2 = this.type;
                int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.value;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                return hashCode7 + i;
            }

            public String toString() {
                String str = this.addr;
                Integer num = this.f42465n;
                String str2 = this.script;
                List<SpendingOutpoint> list = this.spendingOutpoints;
                Boolean bool = this.spent;
                Long l = this.txIndex;
                Integer num2 = this.type;
                Integer num3 = this.value;
                return "PrevOut(addr=" + str + ", n=" + num + ", script=" + str2 + ", spendingOutpoints=" + list + ", spent=" + bool + ", txIndex=" + l + ", type=" + num2 + ", value=" + num3 + ")";
            }
        }

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

    @Keep
    @Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013Jv\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R \u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0013¨\u0006."}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Out;", "", "addr", "", "n", "", "script", "spendingOutpoints", "", "spent", "", "txIndex", "", "type", "value", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAddr", "()Ljava/lang/String;", "getN", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScript", "getSpendingOutpoints", "()Ljava/util/List;", "getSpent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTxIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails$Out;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: BtcTxDetails.kt */
    public static final class Out {
        @SerializedName("addr")
        private final String addr;
        @SerializedName("n")

        /* renamed from: n */
        private final Integer f42467n;
        @SerializedName("script")
        private final String script;
        @SerializedName("spending_outpoints")
        private final List<Object> spendingOutpoints;
        @SerializedName("spent")
        private final Boolean spent;
        @SerializedName("tx_index")
        private final Long txIndex;
        @SerializedName("type")
        private final Integer type;
        @SerializedName("value")
        private final Integer value;

        public Out(String str, Integer num, String str2, List<? extends Object> list, Boolean bool, Long l, Integer num2, Integer num3) {
            this.addr = str;
            this.f42467n = num;
            this.script = str2;
            this.spendingOutpoints = list;
            this.spent = bool;
            this.txIndex = l;
            this.type = num2;
            this.value = num3;
        }

        public static /* synthetic */ Out copy$default(Out out, String str, Integer num, String str2, List list, Boolean bool, Long l, Integer num2, Integer num3, int i, Object obj) {
            Out out2 = out;
            int i2 = i;
            return out.copy((i2 & 1) != 0 ? out2.addr : str, (i2 & 2) != 0 ? out2.f42467n : num, (i2 & 4) != 0 ? out2.script : str2, (i2 & 8) != 0 ? out2.spendingOutpoints : list, (i2 & 16) != 0 ? out2.spent : bool, (i2 & 32) != 0 ? out2.txIndex : l, (i2 & 64) != 0 ? out2.type : num2, (i2 & 128) != 0 ? out2.value : num3);
        }

        public final String component1() {
            return this.addr;
        }

        public final Integer component2() {
            return this.f42467n;
        }

        public final String component3() {
            return this.script;
        }

        public final List<Object> component4() {
            return this.spendingOutpoints;
        }

        public final Boolean component5() {
            return this.spent;
        }

        public final Long component6() {
            return this.txIndex;
        }

        public final Integer component7() {
            return this.type;
        }

        public final Integer component8() {
            return this.value;
        }

        public final Out copy(String str, Integer num, String str2, List<? extends Object> list, Boolean bool, Long l, Integer num2, Integer num3) {
            return new Out(str, num, str2, list, bool, l, num2, num3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Out)) {
                return false;
            }
            Out out = (Out) obj;
            return vx2.m53586b(this.addr, out.addr) && vx2.m53586b(this.f42467n, out.f42467n) && vx2.m53586b(this.script, out.script) && vx2.m53586b(this.spendingOutpoints, out.spendingOutpoints) && vx2.m53586b(this.spent, out.spent) && vx2.m53586b(this.txIndex, out.txIndex) && vx2.m53586b(this.type, out.type) && vx2.m53586b(this.value, out.value);
        }

        public final String getAddr() {
            return this.addr;
        }

        public final Integer getN() {
            return this.f42467n;
        }

        public final String getScript() {
            return this.script;
        }

        public final List<Object> getSpendingOutpoints() {
            return this.spendingOutpoints;
        }

        public final Boolean getSpent() {
            return this.spent;
        }

        public final Long getTxIndex() {
            return this.txIndex;
        }

        public final Integer getType() {
            return this.type;
        }

        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.addr;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f42467n;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.script;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Object> list = this.spendingOutpoints;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.spent;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l = this.txIndex;
            int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num2 = this.type;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.value;
            if (num3 != null) {
                i = num3.hashCode();
            }
            return hashCode7 + i;
        }

        public String toString() {
            String str = this.addr;
            Integer num = this.f42467n;
            String str2 = this.script;
            List<Object> list = this.spendingOutpoints;
            Boolean bool = this.spent;
            Long l = this.txIndex;
            Integer num2 = this.type;
            Integer num3 = this.value;
            return "Out(addr=" + str + ", n=" + num + ", script=" + str2 + ", spendingOutpoints=" + list + ", spent=" + bool + ", txIndex=" + l + ", type=" + num2 + ", value=" + num3 + ")";
        }
    }

    public BtcTxDetails(Integer num, Integer num2, Boolean bool, Integer num3, String str, List<Input> list, Integer num4, List<Out> list2, String str2, Integer num5, Integer num6, Long l, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.blockHeight = num;
        this.blockIndex = num2;
        this.doubleSpend = bool;
        this.fee = num3;
        this.hash = str;
        this.inputs = list;
        this.lockTime = num4;
        this.out = list2;
        this.relayedBy = str2;
        this.size = num5;
        this.time = num6;
        this.txIndex = l;
        this.ver = num7;
        this.vinSz = num8;
        this.voutSz = num9;
        this.weight = num10;
    }

    public static /* synthetic */ BtcTxDetails copy$default(BtcTxDetails btcTxDetails, Integer num, Integer num2, Boolean bool, Integer num3, String str, List list, Integer num4, List list2, String str2, Integer num5, Integer num6, Long l, Integer num7, Integer num8, Integer num9, Integer num10, int i, Object obj) {
        BtcTxDetails btcTxDetails2 = btcTxDetails;
        int i2 = i;
        return btcTxDetails.copy((i2 & 1) != 0 ? btcTxDetails2.blockHeight : num, (i2 & 2) != 0 ? btcTxDetails2.blockIndex : num2, (i2 & 4) != 0 ? btcTxDetails2.doubleSpend : bool, (i2 & 8) != 0 ? btcTxDetails2.fee : num3, (i2 & 16) != 0 ? btcTxDetails2.hash : str, (i2 & 32) != 0 ? btcTxDetails2.inputs : list, (i2 & 64) != 0 ? btcTxDetails2.lockTime : num4, (i2 & 128) != 0 ? btcTxDetails2.out : list2, (i2 & 256) != 0 ? btcTxDetails2.relayedBy : str2, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? btcTxDetails2.size : num5, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? btcTxDetails2.time : num6, (i2 & 2048) != 0 ? btcTxDetails2.txIndex : l, (i2 & 4096) != 0 ? btcTxDetails2.ver : num7, (i2 & 8192) != 0 ? btcTxDetails2.vinSz : num8, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? btcTxDetails2.voutSz : num9, (i2 & 32768) != 0 ? btcTxDetails2.weight : num10);
    }

    public final Integer component1() {
        return this.blockHeight;
    }

    public final Integer component10() {
        return this.size;
    }

    public final Integer component11() {
        return this.time;
    }

    public final Long component12() {
        return this.txIndex;
    }

    public final Integer component13() {
        return this.ver;
    }

    public final Integer component14() {
        return this.vinSz;
    }

    public final Integer component15() {
        return this.voutSz;
    }

    public final Integer component16() {
        return this.weight;
    }

    public final Integer component2() {
        return this.blockIndex;
    }

    public final Boolean component3() {
        return this.doubleSpend;
    }

    public final Integer component4() {
        return this.fee;
    }

    public final String component5() {
        return this.hash;
    }

    public final List<Input> component6() {
        return this.inputs;
    }

    public final Integer component7() {
        return this.lockTime;
    }

    public final List<Out> component8() {
        return this.out;
    }

    public final String component9() {
        return this.relayedBy;
    }

    public final BtcTxDetails copy(Integer num, Integer num2, Boolean bool, Integer num3, String str, List<Input> list, Integer num4, List<Out> list2, String str2, Integer num5, Integer num6, Long l, Integer num7, Integer num8, Integer num9, Integer num10) {
        return new BtcTxDetails(num, num2, bool, num3, str, list, num4, list2, str2, num5, num6, l, num7, num8, num9, num10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BtcTxDetails)) {
            return false;
        }
        BtcTxDetails btcTxDetails = (BtcTxDetails) obj;
        return vx2.m53586b(this.blockHeight, btcTxDetails.blockHeight) && vx2.m53586b(this.blockIndex, btcTxDetails.blockIndex) && vx2.m53586b(this.doubleSpend, btcTxDetails.doubleSpend) && vx2.m53586b(this.fee, btcTxDetails.fee) && vx2.m53586b(this.hash, btcTxDetails.hash) && vx2.m53586b(this.inputs, btcTxDetails.inputs) && vx2.m53586b(this.lockTime, btcTxDetails.lockTime) && vx2.m53586b(this.out, btcTxDetails.out) && vx2.m53586b(this.relayedBy, btcTxDetails.relayedBy) && vx2.m53586b(this.size, btcTxDetails.size) && vx2.m53586b(this.time, btcTxDetails.time) && vx2.m53586b(this.txIndex, btcTxDetails.txIndex) && vx2.m53586b(this.ver, btcTxDetails.ver) && vx2.m53586b(this.vinSz, btcTxDetails.vinSz) && vx2.m53586b(this.voutSz, btcTxDetails.voutSz) && vx2.m53586b(this.weight, btcTxDetails.weight);
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
        Integer num = this.blockHeight;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.blockIndex;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.doubleSpend;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.fee;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.hash;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<Input> list = this.inputs;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.lockTime;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<Out> list2 = this.out;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.relayedBy;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.size;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.time;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.txIndex;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num7 = this.ver;
        int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.vinSz;
        int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.voutSz;
        int hashCode15 = (hashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.weight;
        if (num10 != null) {
            i = num10.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        Integer num = this.blockHeight;
        Integer num2 = this.blockIndex;
        Boolean bool = this.doubleSpend;
        Integer num3 = this.fee;
        String str = this.hash;
        List<Input> list = this.inputs;
        Integer num4 = this.lockTime;
        List<Out> list2 = this.out;
        String str2 = this.relayedBy;
        Integer num5 = this.size;
        Integer num6 = this.time;
        Long l = this.txIndex;
        Integer num7 = this.ver;
        Integer num8 = this.vinSz;
        Integer num9 = this.voutSz;
        Integer num10 = this.weight;
        return "BtcTxDetails(blockHeight=" + num + ", blockIndex=" + num2 + ", doubleSpend=" + bool + ", fee=" + num3 + ", hash=" + str + ", inputs=" + list + ", lockTime=" + num4 + ", out=" + list2 + ", relayedBy=" + str2 + ", size=" + num5 + ", time=" + num6 + ", txIndex=" + l + ", ver=" + num7 + ", vinSz=" + num8 + ", voutSz=" + num9 + ", weight=" + num10 + ")";
    }
}
