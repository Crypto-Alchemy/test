package net.safemoon.androidwallet.viewmodels.wcv2.common;

import android.app.Application;
import com.walletconnect.android.CoreClient;
import com.walletconnect.android.relay.ConnectionType;
import com.walletconnect.web3.wallet.client.Web3Wallet;
import kotlin.Metadata;
import p000.ig7;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/WCCommon;", "", "Landroid/app/Application;", "application", "Lr37;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WCCommon.kt */
public final class WCCommon {

    /* renamed from: a */
    public static final WCCommon f43197a = new WCCommon();

    /* renamed from: a */
    public final void mo62055a(Application application) {
        vx2.m53591g(application, "application");
        String str = "wss://" + "relay.walletconnect.com" + "?projectId=" + C9384u3.f44867i;
        tt0.C6536a aVar = new tt0.C6536a("Safemoon Wallet", "Safemoon Wallet Implementation", "net.safemoon.androidwallet", bk0.m32598e("https://raw.githubusercontent.com/WalletConnect/walletconnect-assets/master/Icon/Gradient/Icon.png"), "kotlin-web3wallet:/request");
        CoreClient coreClient = CoreClient.f27008a;
        CoreClient.m41990e(coreClient, aVar, str, ConnectionType.AUTOMATIC, application, (fc5) null, WCCommon$initialWalletConnectV2$1.INSTANCE, 16, (Object) null);
        Web3Wallet.f27840a.mo41553h(new ig7.C5961b(coreClient), WCCommon$initialWalletConnectV2$2.INSTANCE);
    }
}
