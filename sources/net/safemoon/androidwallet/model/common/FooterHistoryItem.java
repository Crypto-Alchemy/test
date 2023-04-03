package net.safemoon.androidwallet.model.common;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/FooterHistoryItem;", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getType", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: FooterHistoryItem.kt */
public final class FooterHistoryItem extends HistoryListItem {
    private String title;

    public final String getTitle() {
        return this.title;
    }

    public int getType() {
        return 1;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
