package net.safemoon.androidwallet.model.swap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR&\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Data;", "Ljava/io/Serializable;", "()V", "keywords", "", "", "getKeywords", "()Ljava/util/List;", "setKeywords", "(Ljava/util/List;)V", "logoURI", "getLogoURI", "()Ljava/lang/String;", "setLogoURI", "(Ljava/lang/String;)V", "name", "getName", "setName", "timestamp", "getTimestamp", "setTimestamp", "tokens", "Lnet/safemoon/androidwallet/model/swap/Swap;", "getTokens", "setTokens", "version", "Lnet/safemoon/androidwallet/model/swap/Version;", "getVersion", "()Lnet/safemoon/androidwallet/model/swap/Version;", "setVersion", "(Lnet/safemoon/androidwallet/model/swap/Version;)V", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AllSwapTokens.kt */
public final class Data implements Serializable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 4935914903518560697L;
    @SerializedName("keywords")
    @Expose
    private List<String> keywords;
    @SerializedName("logoURI")
    @Expose
    private String logoURI;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("tokens")
    @Expose
    private List<? extends Swap> tokens;
    @SerializedName("version")
    @Expose
    private Version version;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Data$Companion;", "", "()V", "serialVersionUID", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: AllSwapTokens.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<String> getKeywords() {
        return this.keywords;
    }

    public final String getLogoURI() {
        return this.logoURI;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final List<Swap> getTokens() {
        return this.tokens;
    }

    public final Version getVersion() {
        return this.version;
    }

    public final void setKeywords(List<String> list) {
        this.keywords = list;
    }

    public final void setLogoURI(String str) {
        this.logoURI = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    public final void setTokens(List<? extends Swap> list) {
        this.tokens = list;
    }

    public final void setVersion(Version version2) {
        this.version = version2;
    }
}
