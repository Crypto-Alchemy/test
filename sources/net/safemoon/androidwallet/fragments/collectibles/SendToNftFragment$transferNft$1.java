package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendToNftFragment.kt */
public final class SendToNftFragment$transferNft$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ String $address;
    public final /* synthetic */ SendToNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendToNftFragment$transferNft$1(SendToNftFragment sendToNftFragment, String str) {
        super(0);
        this.this$0 = sendToNftFragment;
        this.$address = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r3 = r3.mo61104n();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r4 = this;
            net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment r0 = r4.this$0
            java.lang.String r1 = r4.$address
            net.safemoon.androidwallet.model.nft.NFTData r2 = r0.mo58015U()
            net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment r3 = r4.this$0
            net.safemoon.androidwallet.viewmodels.ContactViewModel r3 = r3.f42337k
            if (r3 == 0) goto L_0x001d
            k04 r3 = r3.mo61104n()
            if (r3 == 0) goto L_0x001d
            java.lang.Object r3 = r3.getValue()
            net.safemoon.androidwallet.model.contact.abstraction.IContact r3 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r3
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            fv5$a r1 = p000.fv5.m57932a(r1, r2, r3)
            java.lang.String r2 = "actionNftTransfer(addres…?.selectedContact?.value)"
            p000.vx2.m53590f(r1, r2)
            r0.mo50753j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$transferNft$1.invoke():void");
    }
}
