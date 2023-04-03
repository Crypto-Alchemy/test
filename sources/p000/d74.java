package p000;

import android.graphics.drawable.Drawable;
import net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment;
import net.safemoon.androidwallet.views.zoomImage.ZoomageView;

/* renamed from: d74 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d74 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ NftDetailFragment f37256a;

    /* renamed from: d */
    public final /* synthetic */ ZoomageView f37257d;

    /* renamed from: e */
    public final /* synthetic */ Drawable f37258e;

    public /* synthetic */ d74(NftDetailFragment nftDetailFragment, ZoomageView zoomageView, Drawable drawable) {
        this.f37256a = nftDetailFragment;
        this.f37257d = zoomageView;
        this.f37258e = drawable;
    }

    public final void run() {
        NftDetailFragment.C8541c.m67799c(this.f37256a, this.f37257d, this.f37258e);
    }
}
