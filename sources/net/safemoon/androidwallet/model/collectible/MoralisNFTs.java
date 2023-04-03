package net.safemoon.androidwallet.model.collectible;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0019\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jd\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\b\u0010-\u001a\u00020\u0007H\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R.\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015¨\u0006."}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/MoralisNFTs;", "", "total", "", "page", "pageSize", "cursor", "", "result", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/collectible/MoralisNft;", "Lkotlin/collections/ArrayList;", "status", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getCursor", "()Ljava/lang/String;", "setCursor", "(Ljava/lang/String;)V", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPageSize", "setPageSize", "getResult", "()Ljava/util/ArrayList;", "setResult", "(Ljava/util/ArrayList;)V", "getStatus", "setStatus", "getTotal", "setTotal", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/collectible/MoralisNFTs;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: MoralisNFTs.kt */
public final class MoralisNFTs {
    @SerializedName("cursor")
    private String cursor;
    @SerializedName("page")
    private Integer page;
    @SerializedName("page_size")
    private Integer pageSize;
    @SerializedName("result")
    private ArrayList<MoralisNft> result;
    @SerializedName("status")
    private String status;
    @SerializedName("total")
    private Integer total;

    public MoralisNFTs() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, (ArrayList) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public MoralisNFTs(Integer num, Integer num2, Integer num3, String str, ArrayList<MoralisNft> arrayList, String str2) {
        vx2.m53591g(arrayList, "result");
        this.total = num;
        this.page = num2;
        this.pageSize = num3;
        this.cursor = str;
        this.result = arrayList;
        this.status = str2;
    }

    public static /* synthetic */ MoralisNFTs copy$default(MoralisNFTs moralisNFTs, Integer num, Integer num2, Integer num3, String str, ArrayList<MoralisNft> arrayList, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = moralisNFTs.total;
        }
        if ((i & 2) != 0) {
            num2 = moralisNFTs.page;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            num3 = moralisNFTs.pageSize;
        }
        Integer num5 = num3;
        if ((i & 8) != 0) {
            str = moralisNFTs.cursor;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            arrayList = moralisNFTs.result;
        }
        ArrayList<MoralisNft> arrayList2 = arrayList;
        if ((i & 32) != 0) {
            str2 = moralisNFTs.status;
        }
        return moralisNFTs.copy(num, num4, num5, str3, arrayList2, str2);
    }

    public final Integer component1() {
        return this.total;
    }

    public final Integer component2() {
        return this.page;
    }

    public final Integer component3() {
        return this.pageSize;
    }

    public final String component4() {
        return this.cursor;
    }

    public final ArrayList<MoralisNft> component5() {
        return this.result;
    }

    public final String component6() {
        return this.status;
    }

    public final MoralisNFTs copy(Integer num, Integer num2, Integer num3, String str, ArrayList<MoralisNft> arrayList, String str2) {
        vx2.m53591g(arrayList, "result");
        return new MoralisNFTs(num, num2, num3, str, arrayList, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoralisNFTs)) {
            return false;
        }
        MoralisNFTs moralisNFTs = (MoralisNFTs) obj;
        return vx2.m53586b(this.total, moralisNFTs.total) && vx2.m53586b(this.page, moralisNFTs.page) && vx2.m53586b(this.pageSize, moralisNFTs.pageSize) && vx2.m53586b(this.cursor, moralisNFTs.cursor) && vx2.m53586b(this.result, moralisNFTs.result) && vx2.m53586b(this.status, moralisNFTs.status);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final ArrayList<MoralisNft> getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.total;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.page;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pageSize;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.cursor;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.result.hashCode()) * 31;
        String str2 = this.status;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setCursor(String str) {
        this.cursor = str;
    }

    public final void setPage(Integer num) {
        this.page = num;
    }

    public final void setPageSize(Integer num) {
        this.pageSize = num;
    }

    public final void setResult(ArrayList<MoralisNft> arrayList) {
        vx2.m53591g(arrayList, "<set-?>");
        this.result = arrayList;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MoralisNFTs(java.lang.Integer r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.util.ArrayList r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0026
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0026:
            r4 = r10
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002d
            r12 = r0
            goto L_0x002e
        L_0x002d:
            r12 = r11
        L_0x002e:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.collectible.MoralisNFTs.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.ArrayList, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
