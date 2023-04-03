package net.safemoon.androidwallet.model.contact;

import android.net.Uri;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R6\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u001dj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014`\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/contact/RequestContact;", "", "()V", "contactCreate", "", "getContactCreate", "()Ljava/lang/Long;", "setContactCreate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "id", "", "getId", "()I", "setId", "(I)V", "lastSent", "getLastSent", "setLastSent", "linkId", "", "getLinkId", "()Ljava/lang/String;", "setLinkId", "(Ljava/lang/String;)V", "name", "getName", "setName", "networks", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getNetworks", "()Ljava/util/HashMap;", "setNetworks", "(Ljava/util/HashMap;)V", "oldProfilePath", "getOldProfilePath", "setOldProfilePath", "profilePath", "Landroid/net/Uri;", "getProfilePath", "()Landroid/net/Uri;", "setProfilePath", "(Landroid/net/Uri;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RequestContact.kt */
public final class RequestContact {
    private Long contactCreate;

    /* renamed from: id */
    private int f42456id;
    private Long lastSent;
    private String linkId;
    private String name;
    private HashMap<Integer, String> networks = new HashMap<>();
    private String oldProfilePath;
    private Uri profilePath;

    public final Long getContactCreate() {
        return this.contactCreate;
    }

    public final int getId() {
        return this.f42456id;
    }

    public final Long getLastSent() {
        return this.lastSent;
    }

    public final String getLinkId() {
        return this.linkId;
    }

    public final String getName() {
        return this.name;
    }

    public final HashMap<Integer, String> getNetworks() {
        return this.networks;
    }

    public final String getOldProfilePath() {
        return this.oldProfilePath;
    }

    public final Uri getProfilePath() {
        return this.profilePath;
    }

    public final void setContactCreate(Long l) {
        this.contactCreate = l;
    }

    public final void setId(int i) {
        this.f42456id = i;
    }

    public final void setLastSent(Long l) {
        this.lastSent = l;
    }

    public final void setLinkId(String str) {
        this.linkId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNetworks(HashMap<Integer, String> hashMap) {
        vx2.m53591g(hashMap, "<set-?>");
        this.networks = hashMap;
    }

    public final void setOldProfilePath(String str) {
        this.oldProfilePath = str;
    }

    public final void setProfilePath(Uri uri) {
        this.profilePath = uri;
    }
}
