package net.safemoon.androidwallet.fragments;

import com.bumptech.glide.C1710a;
import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/cmcTokenInfo/TokenDetail;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/cmcTokenInfo/TokenDetail;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomContractFragment.kt */
public final class AddCustomContractFragment$onViewCreated$2$7 extends Lambda implements rc2<TokenDetail, r37> {
    public final /* synthetic */ a92 $this_apply;
    public final /* synthetic */ AddCustomContractFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCustomContractFragment$onViewCreated$2$7(a92 a92, AddCustomContractFragment addCustomContractFragment) {
        super(1);
        this.$this_apply = a92;
        this.this$0 = addCustomContractFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenDetail) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenDetail tokenDetail) {
        if (tokenDetail != null) {
            me5 u = C1710a.m12225u(this.$this_apply.f20837f);
            Integer num = tokenDetail.f42452id;
            vx2.m53590f(num, "it.id");
            ((be5) u.mo23163x(C9384u3.m72568i(num.intValue(), tokenDetail.symbol, this.this$0.mo57382E().mo61165x())).mo22581g0(MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE)).mo11567a(qe5.m25623x0()).mo11553K0(this.$this_apply.f20837f);
            return;
        }
        this.$this_apply.f20837f.setImageResource(R.drawable.ic_default_empty_coin);
    }
}
