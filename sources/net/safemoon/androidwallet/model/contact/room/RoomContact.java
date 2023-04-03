package net.safemoon.androidwallet.model.contact.room;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010.\u001a\u00020\u0007HÆ\u0003Jb\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\u001e\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013¨\u00067"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/contact/room/RoomContact;", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "origin", "(Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;)V", "id", "", "name", "", "address", "chainAddress", "profilePath", "lastSent", "", "contactCreate", "linkId", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getChainAddress", "()I", "setChainAddress", "(I)V", "getContactCreate", "()Ljava/lang/Long;", "setContactCreate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "setId", "getLastSent", "setLastSent", "getLinkId", "setLinkId", "getName", "setName", "getProfilePath", "setProfilePath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/contact/room/RoomContact;", "equals", "", "other", "", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomContact.kt */
public final class RoomContact implements IContact {
    private String address;
    private int chainAddress;
    private Long contactCreate;

    /* renamed from: id */
    private int f42457id;
    private Long lastSent;
    private String linkId;
    private String name;
    private String profilePath;

    public RoomContact(int i, String str, String str2, int i2, String str3, Long l, Long l2, String str4) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, Address.TYPE_NAME);
        vx2.m53591g(str3, "profilePath");
        vx2.m53591g(str4, "linkId");
        this.f42457id = i;
        this.name = str;
        this.address = str2;
        this.chainAddress = i2;
        this.profilePath = str3;
        this.lastSent = l;
        this.contactCreate = l2;
        this.linkId = str4;
    }

    public static /* synthetic */ RoomContact copy$default(RoomContact roomContact, int i, String str, String str2, int i2, String str3, Long l, Long l2, String str4, int i3, Object obj) {
        int i4 = i3;
        return roomContact.copy((i4 & 1) != 0 ? roomContact.getId() : i, (i4 & 2) != 0 ? roomContact.getName() : str, (i4 & 4) != 0 ? roomContact.getAddress() : str2, (i4 & 8) != 0 ? roomContact.getChainAddress() : i2, (i4 & 16) != 0 ? roomContact.getProfilePath() : str3, (i4 & 32) != 0 ? roomContact.getLastSent() : l, (i4 & 64) != 0 ? roomContact.getContactCreate() : l2, (i4 & 128) != 0 ? roomContact.getLinkId() : str4);
    }

    public final int component1() {
        return getId();
    }

    public final String component2() {
        return getName();
    }

    public final String component3() {
        return getAddress();
    }

    public final int component4() {
        return getChainAddress();
    }

    public final String component5() {
        return getProfilePath();
    }

    public final Long component6() {
        return getLastSent();
    }

    public final Long component7() {
        return getContactCreate();
    }

    public final String component8() {
        return getLinkId();
    }

    public final RoomContact copy(int i, String str, String str2, int i2, String str3, Long l, Long l2, String str4) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, Address.TYPE_NAME);
        vx2.m53591g(str3, "profilePath");
        String str5 = str4;
        vx2.m53591g(str5, "linkId");
        return new RoomContact(i, str, str2, i2, str3, l, l2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomContact)) {
            return false;
        }
        RoomContact roomContact = (RoomContact) obj;
        return getId() == roomContact.getId() && vx2.m53586b(getName(), roomContact.getName()) && vx2.m53586b(getAddress(), roomContact.getAddress()) && getChainAddress() == roomContact.getChainAddress() && vx2.m53586b(getProfilePath(), roomContact.getProfilePath()) && vx2.m53586b(getLastSent(), roomContact.getLastSent()) && vx2.m53586b(getContactCreate(), roomContact.getContactCreate()) && vx2.m53586b(getLinkId(), roomContact.getLinkId());
    }

    public String getAddress() {
        return this.address;
    }

    public int getChainAddress() {
        return this.chainAddress;
    }

    public Long getContactCreate() {
        return this.contactCreate;
    }

    public int getId() {
        return this.f42457id;
    }

    public Long getLastSent() {
        return this.lastSent;
    }

    public String getLinkId() {
        return this.linkId;
    }

    public String getName() {
        return this.name;
    }

    public String getProfilePath() {
        return this.profilePath;
    }

    public int hashCode() {
        int i = 0;
        int id = ((((((((((getId() * 31) + getName().hashCode()) * 31) + getAddress().hashCode()) * 31) + getChainAddress()) * 31) + getProfilePath().hashCode()) * 31) + (getLastSent() == null ? 0 : getLastSent().hashCode())) * 31;
        if (getContactCreate() != null) {
            i = getContactCreate().hashCode();
        }
        return ((id + i) * 31) + getLinkId().hashCode();
    }

    public void setAddress(String str) {
        vx2.m53591g(str, "<set-?>");
        this.address = str;
    }

    public void setChainAddress(int i) {
        this.chainAddress = i;
    }

    public void setContactCreate(Long l) {
        this.contactCreate = l;
    }

    public void setId(int i) {
        this.f42457id = i;
    }

    public void setLastSent(Long l) {
        this.lastSent = l;
    }

    public void setLinkId(String str) {
        vx2.m53591g(str, "<set-?>");
        this.linkId = str;
    }

    public void setName(String str) {
        vx2.m53591g(str, "<set-?>");
        this.name = str;
    }

    public void setProfilePath(String str) {
        vx2.m53591g(str, "<set-?>");
        this.profilePath = str;
    }

    public String toString() {
        int id = getId();
        String name2 = getName();
        String address2 = getAddress();
        int chainAddress2 = getChainAddress();
        String profilePath2 = getProfilePath();
        Long lastSent2 = getLastSent();
        Long contactCreate2 = getContactCreate();
        String linkId2 = getLinkId();
        return "RoomContact(id=" + id + ", name=" + name2 + ", address=" + address2 + ", chainAddress=" + chainAddress2 + ", profilePath=" + profilePath2 + ", lastSent=" + lastSent2 + ", contactCreate=" + contactCreate2 + ", linkId=" + linkId2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomContact(int i, String str, String str2, int i2, String str3, Long l, Long l2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, str, str2, i2, str3, l, l2, str4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoomContact(IContact iContact) {
        this(iContact.getId(), iContact.getName(), iContact.getAddress(), iContact.getChainAddress(), iContact.getProfilePath(), iContact.getLastSent(), iContact.getContactCreate(), iContact.getLinkId());
        vx2.m53591g(iContact, "origin");
    }
}
