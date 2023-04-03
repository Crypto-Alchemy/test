package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import com.bumptech.glide.C1710a;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "tt", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectInterfaceV2Fragment.kt */
public final class WalletConnectInterfaceV2Fragment$onViewCreated$2$2 extends Lambda implements rc2<TokenType, r37> {
    public final /* synthetic */ nb2 $this_apply;
    public final /* synthetic */ WalletConnectInterfaceV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectInterfaceV2Fragment$onViewCreated$2$2(WalletConnectInterfaceV2Fragment walletConnectInterfaceV2Fragment, nb2 nb2) {
        super(1);
        this.this$0 = walletConnectInterfaceV2Fragment;
        this.$this_apply = nb2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenType) obj);
        return r37.f33317a;
    }

    public final void invoke(TokenType tokenType) {
        if (tokenType != null) {
            WalletConnectInterfaceV2Fragment walletConnectInterfaceV2Fragment = this.this$0;
            nb2 nb2 = this.$this_apply;
            C1710a.m12225u(walletConnectInterfaceV2Fragment.mo57333O().f32066f).mo23162w(Integer.valueOf(tokenType.getIcon())).mo11567a(qe5.m25623x0()).mo11553K0(walletConnectInterfaceV2Fragment.mo57333O().f32066f);
            Context requireContext = walletConnectInterfaceV2Fragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            Wallet c = ol0.m70351c(requireContext);
            if (c != null) {
                nb2.f32077q.setText(c.displayName());
                MaterialTextView materialTextView = nb2.f32076p;
                String address = c.getAddress(tokenType.getCoinType().getValue());
                materialTextView.setText(address != null ? ol0.m70353d(address) : null);
            }
        }
    }
}
