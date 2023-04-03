package net.safemoon.androidwallet.fragments.contact;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bumptech.glide.C1710a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BaseContactFragment.kt */
public final class BaseContactFragment$setupNetworkTypeView$1 extends Lambda implements rc2<List<? extends TokenType>, r37> {
    public final /* synthetic */ BaseContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContactFragment$setupNetworkTypeView$1(BaseContactFragment baseContactFragment) {
        super(1);
        this.this$0 = baseContactFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends TokenType>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<? extends TokenType> list) {
        this.this$0.mo58070K().f21177c.removeAllViews();
        if (list != null) {
            BaseContactFragment baseContactFragment = this.this$0;
            for (TokenType tokenType : list) {
                wy2 a = wy2.m54132a(LayoutInflater.from(baseContactFragment.requireContext()).inflate(R.layout.item_chain_network_vertical, (ViewGroup) null, false));
                vx2.m53590f(a, "bind(network)");
                a.mo49319b().setTag(Integer.valueOf(tokenType.getChainId()));
                C1710a.m12224t(baseContactFragment.requireContext()).mo23162w(Integer.valueOf(tokenType.getIcon())).mo11553K0(a.f35483b);
                baseContactFragment.mo58070K().f21177c.addView(a.mo49319b());
            }
        }
    }
}
