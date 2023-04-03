package net.safemoon.androidwallet.model.nft;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/DeleteNfts;", "", "()V", "data", "Lnet/safemoon/androidwallet/model/nft/DeleteNftIdList;", "getData", "()Lnet/safemoon/androidwallet/model/nft/DeleteNftIdList;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: DeleteNfts.kt */
public final class DeleteNfts {
    @SerializedName("data")
    @Expose
    private final DeleteNftIdList data;

    public final DeleteNftIdList getData() {
        return this.data;
    }
}
