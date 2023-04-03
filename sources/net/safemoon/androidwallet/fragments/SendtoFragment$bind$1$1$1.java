package net.safemoon.androidwallet.fragments;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.swap.TransferFee;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/TransferFee;", "kotlin.jvm.PlatformType", "tf", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/swap/TransferFee;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$bind$1$1$1 extends Lambda implements rc2<TransferFee, r37> {
    public final /* synthetic */ UserTokenItemDisplayModel $it;
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$bind$1$1$1(SendtoFragment sendtoFragment, UserTokenItemDisplayModel userTokenItemDisplayModel) {
        super(1);
        this.this$0 = sendtoFragment;
        this.$it = userTokenItemDisplayModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TransferFee) obj);
        return r37.f33317a;
    }

    public final void invoke(TransferFee transferFee) {
        Map map;
        SendtoFragment sendtoFragment = this.this$0;
        Double transferFee2 = transferFee.getTransferFee();
        if ((transferFee2 != null ? transferFee2.doubleValue() : 0.0d) > Utils.DOUBLE_EPSILON) {
            String contractAddress = this.$it.getContractAddress();
            Double transferFee3 = transferFee.getTransferFee();
            vx2.m53588d(transferFee3);
            map = ao3.m31894f(wy6.m54142a(contractAddress, transferFee3));
        } else {
            map = C6177b.m47361i();
        }
        sendtoFragment.f42119U = map;
        ta2 G = this.this$0.f42125y;
        vx2.m53588d(G);
        MaterialCheckBox materialCheckBox = G.f34184g;
        vx2.m53590f(materialCheckBox, "binding!!.chkFullAmountRecipient");
        materialCheckBox.setVisibility(this.this$0.mo57679l0() ? 0 : 8);
    }
}
