package net.safemoon.androidwallet.model.nft;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\u0002\u0010\bR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/DeleteNftIdList;", "", "walletAddress", "", "ownerIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ownerIdsForever", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getOwnerIds", "()Ljava/util/ArrayList;", "setOwnerIds", "(Ljava/util/ArrayList;)V", "getOwnerIdsForever", "setOwnerIdsForever", "getWalletAddress", "()Ljava/lang/String;", "setWalletAddress", "(Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: DeleteNftIdList.kt */
public final class DeleteNftIdList {
    @SerializedName("ownerIds")
    private ArrayList<String> ownerIds;
    @SerializedName("ownerIdsForever")
    private ArrayList<String> ownerIdsForever;
    @SerializedName("walletAddress")
    private String walletAddress;

    public DeleteNftIdList() {
        this((String) null, (ArrayList) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    public DeleteNftIdList(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        vx2.m53591g(arrayList, "ownerIds");
        vx2.m53591g(arrayList2, "ownerIdsForever");
        this.walletAddress = str;
        this.ownerIds = arrayList;
        this.ownerIdsForever = arrayList2;
    }

    public final ArrayList<String> getOwnerIds() {
        return this.ownerIds;
    }

    public final ArrayList<String> getOwnerIdsForever() {
        return this.ownerIdsForever;
    }

    public final String getWalletAddress() {
        return this.walletAddress;
    }

    public final void setOwnerIds(ArrayList<String> arrayList) {
        vx2.m53591g(arrayList, "<set-?>");
        this.ownerIds = arrayList;
    }

    public final void setOwnerIdsForever(ArrayList<String> arrayList) {
        vx2.m53591g(arrayList, "<set-?>");
        this.ownerIdsForever = arrayList;
    }

    public final void setWalletAddress(String str) {
        this.walletAddress = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeleteNftIdList(String str, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new ArrayList() : arrayList2);
    }
}
