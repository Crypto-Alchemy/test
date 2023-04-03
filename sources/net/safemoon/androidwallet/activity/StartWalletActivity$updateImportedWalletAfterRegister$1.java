package net.safemoon.androidwallet.activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: StartWalletActivity.kt */
public final class StartWalletActivity$updateImportedWalletAfterRegister$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ StartWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartWalletActivity$updateImportedWalletAfterRegister$1(StartWalletActivity startWalletActivity) {
        super(1);
        this.this$0 = startWalletActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        vx2.m53591g(list, "list");
        final int size = list.size();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        for (Wallet next : list) {
            String u5b64 = next.getU5B64();
            if (u5b64 == null || u5b64.length() == 0) {
                final StartWalletActivity startWalletActivity = this.this$0;
                this.this$0.f8530x.mo61251J(next, ref$IntRef.element + 1, new pc2<r37>() {
                    public final void invoke() {
                        Ref$IntRef ref$IntRef = ref$IntRef;
                        int i = ref$IntRef.element + 1;
                        ref$IntRef.element = i;
                        if (i == size) {
                            startWalletActivity.mo56889R0();
                        }
                    }
                });
            } else {
                ref$IntRef.element++;
            }
        }
        if (size == ref$IntRef.element) {
            this.this$0.mo56889R0();
        }
    }
}
