package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.contact.room.RoomContact;

@Metadata(mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0005\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0005\"\u0004\b \u0010\u0007R\u001a\u0010!\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0005\"\u0004\b#\u0010\u0007¨\u0006$"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/ContactViewModel$1$1$1$1$1", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "chainAddress", "", "getChainAddress", "()I", "setChainAddress", "(I)V", "contactCreate", "", "getContactCreate", "()Ljava/lang/Long;", "setContactCreate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "id", "getId", "setId", "lastSent", "getLastSent", "setLastSent", "linkId", "getLinkId", "setLinkId", "name", "getName", "setName", "profilePath", "getProfilePath", "setProfilePath", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ContactViewModel.kt */
public final class ContactViewModel$1$1$1$1$1 implements IContact {
    private String address;
    private int chainAddress;
    private Long contactCreate;

    /* renamed from: id */
    private int f42667id;
    private Long lastSent;
    private String linkId;
    private String name;
    private String profilePath;

    public ContactViewModel$1$1$1$1$1(RoomContact roomContact) {
        this.f42667id = roomContact.getId();
        this.name = roomContact.getName();
        this.address = roomContact.getAddress();
        this.chainAddress = roomContact.getChainAddress();
        this.profilePath = roomContact.getProfilePath();
        this.lastSent = roomContact.getLastSent();
        this.contactCreate = roomContact.getContactCreate();
        this.linkId = roomContact.getLinkId();
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
        return this.f42667id;
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
        this.f42667id = i;
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
}
