package net.safemoon.androidwallet.model.swap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\b¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Version;", "Ljava/io/Serializable;", "()V", "major", "", "getMajor", "()Ljava/lang/Integer;", "setMajor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "minor", "getMinor", "setMinor", "patch", "getPatch", "setPatch", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AllSwapTokens.kt */
public final class Version implements Serializable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 7759565028657507222L;
    @SerializedName("major")
    @Expose
    private Integer major;
    @SerializedName("minor")
    @Expose
    private Integer minor;
    @SerializedName("patch")
    @Expose
    private Integer patch;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Version$Companion;", "", "()V", "serialVersionUID", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: AllSwapTokens.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Integer getMajor() {
        return this.major;
    }

    public final Integer getMinor() {
        return this.minor;
    }

    public final Integer getPatch() {
        return this.patch;
    }

    public final void setMajor(Integer num) {
        this.major = num;
    }

    public final void setMinor(Integer num) {
        this.minor = num;
    }

    public final void setPatch(Integer num) {
        this.patch = num;
    }
}
