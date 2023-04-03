package net.safemoon.androidwallet.service;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TxnListService.kt */
public final class TxnListService$preference$2 extends Lambda implements pc2<SharedPreferences> {
    public final /* synthetic */ TxnListService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TxnListService$preference$2(TxnListService txnListService) {
        super(0);
        this.this$0 = txnListService;
    }

    public final SharedPreferences invoke() {
        return this.this$0.getSharedPreferences("TXLIST", 0);
    }
}
