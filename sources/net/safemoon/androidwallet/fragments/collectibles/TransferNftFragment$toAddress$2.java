package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$toAddress$2 extends Lambda implements pc2<String> {
    public final /* synthetic */ TransferNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$toAddress$2(TransferNftFragment transferNftFragment) {
        super(0);
        this.this$0 = transferNftFragment;
    }

    public final String invoke() {
        return this.this$0.requireArguments().getString(Address.TYPE_NAME);
    }
}
