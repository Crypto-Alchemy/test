package net.safemoon.androidwallet.fragments.collectibles;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.nft.NFTBalance;
import net.safemoon.androidwallet.model.nft.NFTType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/NFTBalance;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/nft/NFTBalance;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: NftDetailFragment.kt */
public final class NftDetailFragment$onViewCreated$8 extends Lambda implements rc2<NFTBalance, r37> {
    public final /* synthetic */ NftDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NftDetailFragment$onViewCreated$8(NftDetailFragment nftDetailFragment) {
        super(1);
        this.this$0 = nftDetailFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NFTBalance) obj);
        return r37.f33317a;
    }

    public final void invoke(NFTBalance nFTBalance) {
        ac7 ac7;
        ac7 ac72;
        String str;
        int i = 0;
        if (nFTBalance != null) {
            C6277na B = this.this$0.f42319C;
            if (B != null && (ac72 = B.f32025f) != null) {
                NftDetailFragment nftDetailFragment = this.this$0;
                boolean z = true;
                ac72.f20898b.setEnabled(nFTBalance.getBalance() > 0);
                Chip chip = ac72.f20909m;
                vx2.m53590f(chip, "txtError");
                if (nFTBalance.getBalance() > 0) {
                    z = false;
                }
                if (!z) {
                    i = 8;
                }
                chip.setVisibility(i);
                if (nFTBalance.getBalance() <= 0) {
                    Chip chip2 = ac72.f20909m;
                    if (nFTBalance.getType() == NFTType.ERC721) {
                        str = nftDetailFragment.getString(R.string.nft_transfer_balance_error_erc721);
                    } else {
                        str = nftDetailFragment.getString(R.string.nft_transfer_balance_error_erc1155);
                    }
                    chip2.setText(str);
                    return;
                }
                return;
            }
            return;
        }
        C6277na B2 = this.this$0.f42319C;
        MaterialButton materialButton = (B2 == null || (ac7 = B2.f32025f) == null) ? null : ac7.f20898b;
        if (materialButton != null) {
            materialButton.setEnabled(false);
        }
    }
}
