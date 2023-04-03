package net.safemoon.androidwallet.activity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTSecurityQuestionsActivity.kt */
public final class AKTSecurityQuestionsActivity$onCreate$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ AKTSecurityQuestionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSecurityQuestionsActivity$onCreate$1(AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity) {
        super(1);
        this.this$0 = aKTSecurityQuestionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        boolean z;
        vx2.m53591g(list, "list");
        AKTSecurityQuestionsActivity aKTSecurityQuestionsActivity = this.this$0;
        boolean z2 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String u5b64 = ((Wallet) it.next()).getU5B64();
                if (u5b64 == null || u5b64.length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        aKTSecurityQuestionsActivity.f41354e1 = z2;
    }
}
