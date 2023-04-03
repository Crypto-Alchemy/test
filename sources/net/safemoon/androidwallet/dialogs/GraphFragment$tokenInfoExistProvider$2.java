package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.provider.TokenInfoExistProvider;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/provider/TokenInfoExistProvider;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: GraphFragment.kt */
public final class GraphFragment$tokenInfoExistProvider$2 extends Lambda implements pc2<TokenInfoExistProvider> {
    public final /* synthetic */ GraphFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphFragment$tokenInfoExistProvider$2(GraphFragment graphFragment) {
        super(0);
        this.this$0 = graphFragment;
    }

    public final TokenInfoExistProvider invoke() {
        Context requireContext = this.this$0.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        return new TokenInfoExistProvider(requireContext);
    }
}
