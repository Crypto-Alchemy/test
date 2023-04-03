package p000;

import android.graphics.drawable.Drawable;
import net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment;
import net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1;
import net.safemoon.androidwallet.views.zoomImage.ZoomageView;

/* renamed from: b74 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b74 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ NftDetailFragment f36704a;

    /* renamed from: d */
    public final /* synthetic */ ZoomageView f36705d;

    /* renamed from: e */
    public final /* synthetic */ Drawable f36706e;

    public /* synthetic */ b74(NftDetailFragment nftDetailFragment, ZoomageView zoomageView, Drawable drawable) {
        this.f36704a = nftDetailFragment;
        this.f36705d = zoomageView;
        this.f36706e = drawable;
    }

    public final void run() {
        NftDetailFragment$onViewCreated$1.m67805e(this.f36704a, this.f36705d, this.f36706e);
    }
}
