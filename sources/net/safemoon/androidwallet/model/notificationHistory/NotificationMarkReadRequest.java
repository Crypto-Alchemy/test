package net.safemoon.androidwallet.model.notificationHistory;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/notificationHistory/NotificationMarkReadRequest;", "", "()V", "addresses", "", "getAddresses", "()Ljava/lang/String;", "setAddresses", "(Ljava/lang/String;)V", "ids", "", "getIds", "()Ljava/util/List;", "setIds", "(Ljava/util/List;)V", "readAll", "", "getReadAll", "()Ljava/lang/Boolean;", "setReadAll", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NotificationMarkReadRequest.kt */
public final class NotificationMarkReadRequest {
    private String addresses;
    private List<String> ids;
    private Boolean readAll;

    public final String getAddresses() {
        return this.addresses;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final Boolean getReadAll() {
        return this.readAll;
    }

    public final void setAddresses(String str) {
        this.addresses = str;
    }

    public final void setIds(List<String> list) {
        this.ids = list;
    }

    public final void setReadAll(Boolean bool) {
        this.readAll = bool;
    }
}
