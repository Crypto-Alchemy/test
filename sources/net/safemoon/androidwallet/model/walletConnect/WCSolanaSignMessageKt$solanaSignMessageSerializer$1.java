package net.safemoon.androidwallet.model.walletConnect;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lae1;", "it", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "invoke", "(Lae1;)Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WCSolanaSignMessage.kt */
public final class WCSolanaSignMessageKt$solanaSignMessageSerializer$1 extends Lambda implements rc2<ae1, WCSolanaSignMessage> {
    public static final WCSolanaSignMessageKt$solanaSignMessageSerializer$1 INSTANCE = new WCSolanaSignMessageKt$solanaSignMessageSerializer$1();

    public WCSolanaSignMessageKt$solanaSignMessageSerializer$1() {
        super(1);
    }

    public final WCSolanaSignMessage invoke(ae1 ae1) {
        vx2.m53591g(ae1, "it");
        return new WCSolanaSignMessage(xn1.m30231h(xn1.m30225b(ae1.mo165b(), WCSolanaSignMessageKey.PUBKEY.getKey())), xn1.m30231h(xn1.m30225b(ae1.mo165b(), WCSolanaSignMessageKey.MESSAGE.getKey())));
    }
}
