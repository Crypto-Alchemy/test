package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/history/SolSplFromExplorer;", "", "succcess", "", "data", "Lnet/safemoon/androidwallet/model/transaction/history/ExplorerData;", "(Ljava/lang/Boolean;Lnet/safemoon/androidwallet/model/transaction/history/ExplorerData;)V", "getData", "()Lnet/safemoon/androidwallet/model/transaction/history/ExplorerData;", "setData", "(Lnet/safemoon/androidwallet/model/transaction/history/ExplorerData;)V", "getSucccess", "()Ljava/lang/Boolean;", "setSucccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lnet/safemoon/androidwallet/model/transaction/history/ExplorerData;)Lnet/safemoon/androidwallet/model/transaction/history/SolSplFromExplorer;", "equals", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolSplFromExplorer.kt */
public final class SolSplFromExplorer {
    @SerializedName("data")
    private ExplorerData data;
    @SerializedName("succcess")
    private Boolean succcess;

    public SolSplFromExplorer() {
        this((Boolean) null, (ExplorerData) null, 3, (DefaultConstructorMarker) null);
    }

    public SolSplFromExplorer(Boolean bool, ExplorerData explorerData) {
        this.succcess = bool;
        this.data = explorerData;
    }

    public static /* synthetic */ SolSplFromExplorer copy$default(SolSplFromExplorer solSplFromExplorer, Boolean bool, ExplorerData explorerData, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = solSplFromExplorer.succcess;
        }
        if ((i & 2) != 0) {
            explorerData = solSplFromExplorer.data;
        }
        return solSplFromExplorer.copy(bool, explorerData);
    }

    public final Boolean component1() {
        return this.succcess;
    }

    public final ExplorerData component2() {
        return this.data;
    }

    public final SolSplFromExplorer copy(Boolean bool, ExplorerData explorerData) {
        return new SolSplFromExplorer(bool, explorerData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolSplFromExplorer)) {
            return false;
        }
        SolSplFromExplorer solSplFromExplorer = (SolSplFromExplorer) obj;
        return vx2.m53586b(this.succcess, solSplFromExplorer.succcess) && vx2.m53586b(this.data, solSplFromExplorer.data);
    }

    public final ExplorerData getData() {
        return this.data;
    }

    public final Boolean getSucccess() {
        return this.succcess;
    }

    public int hashCode() {
        Boolean bool = this.succcess;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ExplorerData explorerData = this.data;
        if (explorerData != null) {
            i = explorerData.hashCode();
        }
        return hashCode + i;
    }

    public final void setData(ExplorerData explorerData) {
        this.data = explorerData;
    }

    public final void setSucccess(Boolean bool) {
        this.succcess = bool;
    }

    public String toString() {
        Boolean bool = this.succcess;
        ExplorerData explorerData = this.data;
        return "SolSplFromExplorer(succcess=" + bool + ", data=" + explorerData + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SolSplFromExplorer(Boolean bool, ExplorerData explorerData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? new ExplorerData((C8604Tx) null, (Integer) null, 3, (DefaultConstructorMarker) null) : explorerData);
    }
}
