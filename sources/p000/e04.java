package p000;

import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;

/* renamed from: e04 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e04 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MultipleWalletConnect.C8886f f37437a;

    /* renamed from: d */
    public final /* synthetic */ MultipleWalletConnect f37438d;

    /* renamed from: e */
    public final /* synthetic */ RoomConnectedInfo f37439e;

    public /* synthetic */ e04(MultipleWalletConnect.C8886f fVar, MultipleWalletConnect multipleWalletConnect, RoomConnectedInfo roomConnectedInfo) {
        this.f37437a = fVar;
        this.f37438d = multipleWalletConnect;
        this.f37439e = roomConnectedInfo;
    }

    public final void run() {
        MultipleWalletConnect.m69339v(this.f37437a, this.f37438d, this.f37439e);
    }
}
