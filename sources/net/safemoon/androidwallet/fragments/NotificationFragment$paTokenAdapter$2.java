package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import p000.qa4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lrj4;", "invoke", "()Lrj4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: NotificationFragment.kt */
public final class NotificationFragment$paTokenAdapter$2 extends Lambda implements pc2<rj4> {
    public final /* synthetic */ NotificationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationFragment$paTokenAdapter$2(NotificationFragment notificationFragment) {
        super(0);
        this.this$0 = notificationFragment;
    }

    public final rj4 invoke() {
        final NotificationFragment notificationFragment = this.this$0;
        return new rj4(new rc2<PAToken, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PAToken) obj);
                return r37.f33317a;
            }

            public final void invoke(PAToken pAToken) {
                vx2.m53591g(pAToken, "it");
                NotificationFragment notificationFragment = notificationFragment;
                qa4.C9206a a = qa4.m71200a(pAToken);
                vx2.m53590f(a, "actionToCryptoPriceAlertFragment(it)");
                notificationFragment.mo50753j(a);
            }
        });
    }
}
