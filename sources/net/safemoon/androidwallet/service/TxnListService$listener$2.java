package net.safemoon.androidwallet.service;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TxnListService.kt */
public final class TxnListService$listener$2 extends Lambda implements pc2<SharedPreferences.OnSharedPreferenceChangeListener> {
    public final /* synthetic */ TxnListService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TxnListService$listener$2(TxnListService txnListService) {
        super(0);
        this.this$0 = txnListService;
    }

    /* renamed from: b */
    public static final void m68278b(TxnListService txnListService, SharedPreferences sharedPreferences, String str) {
        vx2.m53591g(txnListService, "this$0");
        if (sharedPreferences.contains(str)) {
            txnListService.mo60829o(30);
        }
    }

    public final SharedPreferences.OnSharedPreferenceChangeListener invoke() {
        return new C8627a(this.this$0);
    }
}
