package net.safemoon.androidwallet.viewmodels.p021wc;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.dq6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/net/Uri;", "it", "Lr37;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1$onReject$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class C8912xe9038a2a extends Lambda implements rc2<Uri, r37> {
    public static final C8912xe9038a2a INSTANCE = new C8912xe9038a2a();

    public C8912xe9038a2a() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Uri) obj);
        return r37.f33317a;
    }

    public final void invoke(Uri uri) {
        vx2.m53591g(uri, "it");
        dq6.C6999b e = dq6.f37375a.mo51267e("Khang");
        String path = uri.getPath();
        e.mo51264a("onReject " + path, new Object[0]);
    }
}
