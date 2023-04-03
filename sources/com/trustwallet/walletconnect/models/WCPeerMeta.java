package com.trustwallet.walletconnect.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "", "name", "", "url", "description", "icons", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getIcons", "()Ljava/util/List;", "getName", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCPeerMeta.kt */
public final class WCPeerMeta {
    private final String description;
    private final List<String> icons;
    private final String name;
    private final String url;

    public WCPeerMeta(String str, String str2, String str3, List<String> list) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "url");
        vx2.m53591g(list, "icons");
        this.name = str;
        this.url = str2;
        this.description = str3;
        this.icons = list;
    }

    public static /* synthetic */ WCPeerMeta copy$default(WCPeerMeta wCPeerMeta, String str, String str2, String str3, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCPeerMeta.name;
        }
        if ((i & 2) != 0) {
            str2 = wCPeerMeta.url;
        }
        if ((i & 4) != 0) {
            str3 = wCPeerMeta.description;
        }
        if ((i & 8) != 0) {
            list = wCPeerMeta.icons;
        }
        return wCPeerMeta.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.description;
    }

    public final List<String> component4() {
        return this.icons;
    }

    public final WCPeerMeta copy(String str, String str2, String str3, List<String> list) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "url");
        vx2.m53591g(list, "icons");
        return new WCPeerMeta(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCPeerMeta)) {
            return false;
        }
        WCPeerMeta wCPeerMeta = (WCPeerMeta) obj;
        return vx2.m53586b(this.name, wCPeerMeta.name) && vx2.m53586b(this.url, wCPeerMeta.url) && vx2.m53586b(this.description, wCPeerMeta.description) && vx2.m53586b(this.icons, wCPeerMeta.icons);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getIcons() {
        return this.icons;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.url.hashCode()) * 31;
        String str = this.description;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.icons.hashCode();
    }

    public String toString() {
        return "WCPeerMeta(name=" + this.name + ", url=" + this.url + ", description=" + this.description + ", icons=" + this.icons + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WCPeerMeta(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? bk0.m32598e("") : list);
    }
}
