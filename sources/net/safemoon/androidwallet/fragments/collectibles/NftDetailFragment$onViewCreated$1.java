package net.safemoon.androidwallet.fragments.collectibles;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.views.zoomImage.ZoomageView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/NftDetailFragment$onViewCreated$1", "Lle5;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Lpl6;", "target", "", "isFirstResource", "d", "resource", "Lcom/bumptech/glide/load/DataSource;", "dataSource", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NftDetailFragment.kt */
public final class NftDetailFragment$onViewCreated$1 implements le5<Drawable> {

    /* renamed from: a */
    public final /* synthetic */ ZoomageView f42334a;

    /* renamed from: d */
    public final /* synthetic */ NftDetailFragment f42335d;

    public NftDetailFragment$onViewCreated$1(ZoomageView zoomageView, NftDetailFragment nftDetailFragment) {
        this.f42334a = zoomageView;
        this.f42335d = nftDetailFragment;
    }

    /* renamed from: e */
    public static final void m67805e(NftDetailFragment nftDetailFragment, ZoomageView zoomageView, Drawable drawable) {
        float f;
        float f2;
        vx2.m53591g(nftDetailFragment, "this$0");
        if (nftDetailFragment.isVisible()) {
            zoomageView.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            if (drawable != null) {
                f = (float) drawable.getIntrinsicWidth();
            } else {
                f = 0.0f;
            }
            if (drawable != null) {
                f2 = (float) drawable.getIntrinsicHeight();
            } else {
                f2 = 0.0f;
            }
            matrix.setRectToRect(new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, f2), new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) zoomageView.getWidth(), (float) zoomageView.getHeight()), Matrix.ScaleToFit.CENTER);
            zoomageView.setImageMatrix(matrix);
        }
    }

    /* renamed from: f */
    public static final boolean m67806f(NftDetailFragment nftDetailFragment, View view) {
        vx2.m53591g(nftDetailFragment, "this$0");
        y23 unused = d50.m56748b(vg3.m28804a(nftDetailFragment), (CoroutineContext) null, (CoroutineStart) null, new NftDetailFragment$onViewCreated$1$onResourceReady$2$1(nftDetailFragment, (ns0<? super NftDetailFragment$onViewCreated$1$onResourceReady$2$1>) null), 3, (Object) null);
        return false;
    }

    /* renamed from: c */
    public boolean mo21096i(Drawable drawable, Object obj, pl6<Drawable> pl6, DataSource dataSource, boolean z) {
        ZoomageView zoomageView = this.f42334a;
        zoomageView.postDelayed(new b74(this.f42335d, zoomageView, drawable), 100);
        this.f42334a.setOnLongClickListener(new c74(this.f42335d));
        return false;
    }

    /* renamed from: d */
    public boolean mo21092d(GlideException glideException, Object obj, pl6<Drawable> pl6, boolean z) {
        return false;
    }
}
