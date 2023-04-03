package net.safemoon.androidwallet.fragments.collectibles;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/TYPE_DELETE_NFT;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/collectible/TYPE_DELETE_NFT;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CollectibleFragment.kt */
public final class CollectibleFragment$onViewCreated$7 extends Lambda implements rc2<TYPE_DELETE_NFT, r37> {
    public final /* synthetic */ CollectibleFragment this$0;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$onViewCreated$7$a */
    /* compiled from: CollectibleFragment.kt */
    public /* synthetic */ class C8536a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42310a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT[] r0 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r1 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r1 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.HIDE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f42310a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.CollectibleFragment$onViewCreated$7.C8536a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleFragment$onViewCreated$7(CollectibleFragment collectibleFragment) {
        super(1);
        this.this$0 = collectibleFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TYPE_DELETE_NFT) obj);
        return r37.f33317a;
    }

    public final void invoke(TYPE_DELETE_NFT type_delete_nft) {
        int i;
        Integer num;
        TextView textView;
        AppCompatImageView appCompatImageView;
        h92 K = this.this$0.mo57958K();
        if (!(K == null || (appCompatImageView = K.f29467b) == null)) {
            appCompatImageView.setImageResource(type_delete_nft.getValue() == 0 ? R.drawable.custom_eye : R.drawable.ic_back);
        }
        if (type_delete_nft == null) {
            i = -1;
        } else {
            i = C8536a.f42310a[type_delete_nft.ordinal()];
        }
        if (i == 1) {
            num = Integer.valueOf(R.string.title_collections);
        } else if (i != 2) {
            num = null;
        } else {
            num = Integer.valueOf(R.string.title_hidden_collections);
        }
        if (num != null) {
            CollectibleFragment collectibleFragment = this.this$0;
            int intValue = num.intValue();
            h92 K2 = collectibleFragment.mo57958K();
            if (K2 != null && (textView = K2.f29477l) != null) {
                textView.setText(intValue);
            }
        }
    }
}
