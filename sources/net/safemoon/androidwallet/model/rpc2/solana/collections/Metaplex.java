package net.safemoon.androidwallet.model.rpc2.solana.collections;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0019\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0010Jp\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\b\u00103\u001a\u00020\u0003H\u0016R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019¨\u00064"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Metaplex;", "", "metadataUri", "", "updateAuthority", "sellerFeeBasisPoints", "", "primarySaleHappened", "owners", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Owners;", "Lkotlin/collections/ArrayList;", "isMutable", "", "masterEdition", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setMutable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMasterEdition", "setMasterEdition", "getMetadataUri", "()Ljava/lang/String;", "setMetadataUri", "(Ljava/lang/String;)V", "getOwners", "()Ljava/util/ArrayList;", "setOwners", "(Ljava/util/ArrayList;)V", "getPrimarySaleHappened", "()Ljava/lang/Integer;", "setPrimarySaleHappened", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSellerFeeBasisPoints", "setSellerFeeBasisPoints", "getUpdateAuthority", "setUpdateAuthority", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lnet/safemoon/androidwallet/model/rpc2/solana/collections/Metaplex;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaNft.kt */
public final class Metaplex {
    @SerializedName("isMutable")
    private Boolean isMutable;
    @SerializedName("masterEdition")
    private Boolean masterEdition;
    @SerializedName("metadataUri")
    private String metadataUri;
    @SerializedName("owners")
    private ArrayList<Owners> owners;
    @SerializedName("primarySaleHappened")
    private Integer primarySaleHappened;
    @SerializedName("sellerFeeBasisPoints")
    private Integer sellerFeeBasisPoints;
    @SerializedName("updateAuthority")
    private String updateAuthority;

    public Metaplex() {
        this((String) null, (String) null, (Integer) null, (Integer) null, (ArrayList) null, (Boolean) null, (Boolean) null, 127, (DefaultConstructorMarker) null);
    }

    public Metaplex(String str, String str2, Integer num, Integer num2, ArrayList<Owners> arrayList, Boolean bool, Boolean bool2) {
        vx2.m53591g(arrayList, "owners");
        this.metadataUri = str;
        this.updateAuthority = str2;
        this.sellerFeeBasisPoints = num;
        this.primarySaleHappened = num2;
        this.owners = arrayList;
        this.isMutable = bool;
        this.masterEdition = bool2;
    }

    public static /* synthetic */ Metaplex copy$default(Metaplex metaplex, String str, String str2, Integer num, Integer num2, ArrayList<Owners> arrayList, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metaplex.metadataUri;
        }
        if ((i & 2) != 0) {
            str2 = metaplex.updateAuthority;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = metaplex.sellerFeeBasisPoints;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = metaplex.primarySaleHappened;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            arrayList = metaplex.owners;
        }
        ArrayList<Owners> arrayList2 = arrayList;
        if ((i & 32) != 0) {
            bool = metaplex.isMutable;
        }
        Boolean bool3 = bool;
        if ((i & 64) != 0) {
            bool2 = metaplex.masterEdition;
        }
        return metaplex.copy(str, str3, num3, num4, arrayList2, bool3, bool2);
    }

    public final String component1() {
        return this.metadataUri;
    }

    public final String component2() {
        return this.updateAuthority;
    }

    public final Integer component3() {
        return this.sellerFeeBasisPoints;
    }

    public final Integer component4() {
        return this.primarySaleHappened;
    }

    public final ArrayList<Owners> component5() {
        return this.owners;
    }

    public final Boolean component6() {
        return this.isMutable;
    }

    public final Boolean component7() {
        return this.masterEdition;
    }

    public final Metaplex copy(String str, String str2, Integer num, Integer num2, ArrayList<Owners> arrayList, Boolean bool, Boolean bool2) {
        vx2.m53591g(arrayList, "owners");
        return new Metaplex(str, str2, num, num2, arrayList, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metaplex)) {
            return false;
        }
        Metaplex metaplex = (Metaplex) obj;
        return vx2.m53586b(this.metadataUri, metaplex.metadataUri) && vx2.m53586b(this.updateAuthority, metaplex.updateAuthority) && vx2.m53586b(this.sellerFeeBasisPoints, metaplex.sellerFeeBasisPoints) && vx2.m53586b(this.primarySaleHappened, metaplex.primarySaleHappened) && vx2.m53586b(this.owners, metaplex.owners) && vx2.m53586b(this.isMutable, metaplex.isMutable) && vx2.m53586b(this.masterEdition, metaplex.masterEdition);
    }

    public final Boolean getMasterEdition() {
        return this.masterEdition;
    }

    public final String getMetadataUri() {
        return this.metadataUri;
    }

    public final ArrayList<Owners> getOwners() {
        return this.owners;
    }

    public final Integer getPrimarySaleHappened() {
        return this.primarySaleHappened;
    }

    public final Integer getSellerFeeBasisPoints() {
        return this.sellerFeeBasisPoints;
    }

    public final String getUpdateAuthority() {
        return this.updateAuthority;
    }

    public int hashCode() {
        String str = this.metadataUri;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.updateAuthority;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sellerFeeBasisPoints;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.primarySaleHappened;
        int hashCode4 = (((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.owners.hashCode()) * 31;
        Boolean bool = this.isMutable;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.masterEdition;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode5 + i;
    }

    public final Boolean isMutable() {
        return this.isMutable;
    }

    public final void setMasterEdition(Boolean bool) {
        this.masterEdition = bool;
    }

    public final void setMetadataUri(String str) {
        this.metadataUri = str;
    }

    public final void setMutable(Boolean bool) {
        this.isMutable = bool;
    }

    public final void setOwners(ArrayList<Owners> arrayList) {
        vx2.m53591g(arrayList, "<set-?>");
        this.owners = arrayList;
    }

    public final void setPrimarySaleHappened(Integer num) {
        this.primarySaleHappened = num;
    }

    public final void setSellerFeeBasisPoints(Integer num) {
        this.sellerFeeBasisPoints = num;
    }

    public final void setUpdateAuthority(String str) {
        this.updateAuthority = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Metaplex(java.lang.String r7, java.lang.String r8, java.lang.Integer r9, java.lang.Integer r10, java.util.ArrayList r11, java.lang.Boolean r12, java.lang.Boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0026
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0026:
            r4 = r11
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002d
            r5 = r0
            goto L_0x002e
        L_0x002d:
            r5 = r12
        L_0x002e:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0034
            r14 = r0
            goto L_0x0035
        L_0x0034:
            r14 = r13
        L_0x0035:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.rpc2.solana.collections.Metaplex.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.ArrayList, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
