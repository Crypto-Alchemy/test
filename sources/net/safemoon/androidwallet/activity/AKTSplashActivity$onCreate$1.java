package net.safemoon.androidwallet.activity;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTSplashActivity.kt */
public final class AKTSplashActivity$onCreate$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ AKTSplashActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSplashActivity$onCreate$1(AKTSplashActivity aKTSplashActivity) {
        super(1);
        this.this$0 = aKTSplashActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        vx2.m53591g(list, "list");
        for (Wallet next : list) {
            Long l = null;
            if (next.isPrimaryWallet() && vx2.m53586b(next.getName(), "SafeMoon Master Wallet")) {
                this.this$0.mo56798J().mo61249H(next, "Primary Wallet", (pc2<r37>) null);
                Wallet c = ol0.m70351c(this.this$0);
                if (c != null) {
                    l = c.getId();
                }
                if (vx2.m53586b(l, next.getId())) {
                    next.setName("Primary Wallet");
                    f06.m57524o(this.this$0, "SAFEMOON_ACTIVE_WALLET", next.toString());
                }
            } else if (!next.isPrimaryWallet() && sq0.f44593a.mo65889a().contains(next.getName())) {
                String str = next.getName() + " 1";
                this.this$0.mo56798J().mo61249H(next, str, (pc2<r37>) null);
                Wallet c2 = ol0.m70351c(this.this$0);
                if (c2 != null) {
                    l = c2.getId();
                }
                if (vx2.m53586b(l, next.getId())) {
                    next.setName(str);
                    f06.m57524o(this.this$0, "SAFEMOON_ACTIVE_WALLET", next.toString());
                }
            }
        }
        AKTSplashActivity aKTSplashActivity = this.this$0;
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Wallet) it.next()).isPrimaryWallet()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        aKTSplashActivity.f41380e = z;
        this.this$0.mo56801R();
    }
}
