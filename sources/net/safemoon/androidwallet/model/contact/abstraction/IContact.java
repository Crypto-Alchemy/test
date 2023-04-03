package net.safemoon.androidwallet.model.contact.abstraction;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0018\u0010\u001a\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007R\u0018\u0010\u001d\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007R\u0018\u0010 \u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "Ljava/io/Serializable;", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "chainAddress", "", "getChainAddress", "()I", "setChainAddress", "(I)V", "contactCreate", "", "getContactCreate", "()Ljava/lang/Long;", "setContactCreate", "(Ljava/lang/Long;)V", "id", "getId", "setId", "lastSent", "getLastSent", "setLastSent", "linkId", "getLinkId", "setLinkId", "name", "getName", "setName", "profilePath", "getProfilePath", "setProfilePath", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: IContact.kt */
public interface IContact extends Serializable {
    String getAddress();

    int getChainAddress();

    Long getContactCreate();

    int getId();

    Long getLastSent();

    String getLinkId();

    String getName();

    String getProfilePath();

    void setAddress(String str);

    void setChainAddress(int i);

    void setContactCreate(Long l);

    void setId(int i);

    void setLastSent(Long l);

    void setLinkId(String str);

    void setName(String str);

    void setProfilePath(String str);
}
