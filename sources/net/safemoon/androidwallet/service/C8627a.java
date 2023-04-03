package net.safemoon.androidwallet.service;

import android.content.SharedPreferences;

/* renamed from: net.safemoon.androidwallet.service.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8627a implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TxnListService f42562a;

    public /* synthetic */ C8627a(TxnListService txnListService) {
        this.f42562a = txnListService;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        TxnListService$listener$2.m68278b(this.f42562a, sharedPreferences, str);
    }
}
