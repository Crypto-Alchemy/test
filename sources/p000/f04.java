package p000;

import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;

/* renamed from: f04 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f04 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MultipleWalletConnect f37693a;

    /* renamed from: d */
    public final /* synthetic */ RoomConnectedInfo f37694d;

    public /* synthetic */ f04(MultipleWalletConnect multipleWalletConnect, RoomConnectedInfo roomConnectedInfo) {
        this.f37693a = multipleWalletConnect;
        this.f37694d = roomConnectedInfo;
    }

    public final void run() {
        MultipleWalletConnect.m69340x(this.f37693a, this.f37694d);
    }
}
