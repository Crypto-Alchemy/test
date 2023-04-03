package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.imageview.ShapeableImageView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.CustomVideoPlayer;

/* renamed from: zy2 */
/* compiled from: ItemCollectibleBinding */
public final class zy2 {

    /* renamed from: a */
    public final ConstraintLayout f36305a;

    /* renamed from: b */
    public final ShapeableImageView f36306b;

    /* renamed from: c */
    public final ShapeableImageView f36307c;

    /* renamed from: d */
    public final ImageView f36308d;

    /* renamed from: e */
    public final TextView f36309e;

    /* renamed from: f */
    public final SimpleDraweeView f36310f;

    /* renamed from: g */
    public final CustomVideoPlayer f36311g;

    public zy2(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ImageView imageView, TextView textView, SimpleDraweeView simpleDraweeView, CustomVideoPlayer customVideoPlayer) {
        this.f36305a = constraintLayout;
        this.f36306b = shapeableImageView;
        this.f36307c = shapeableImageView2;
        this.f36308d = imageView;
        this.f36309e = textView;
        this.f36310f = simpleDraweeView;
        this.f36311g = customVideoPlayer;
    }

    /* renamed from: a */
    public static zy2 m55302a(View view) {
        int i = R.id.imgDeleteCollection;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view, R.id.imgDeleteCollection);
        if (shapeableImageView != null) {
            i = R.id.imgHideEye;
            ShapeableImageView shapeableImageView2 = (ShapeableImageView) ca7.m11819a(view, R.id.imgHideEye);
            if (shapeableImageView2 != null) {
                i = R.id.nftIcon;
                ImageView imageView = (ImageView) ca7.m11819a(view, R.id.nftIcon);
                if (imageView != null) {
                    i = R.id.nftName;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.nftName);
                    if (textView != null) {
                        i = R.id.sdvImage;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ca7.m11819a(view, R.id.sdvImage);
                        if (simpleDraweeView != null) {
                            i = R.id.videoPlayer;
                            CustomVideoPlayer customVideoPlayer = (CustomVideoPlayer) ca7.m11819a(view, R.id.videoPlayer);
                            if (customVideoPlayer != null) {
                                return new zy2((ConstraintLayout) view, shapeableImageView, shapeableImageView2, imageView, textView, simpleDraweeView, customVideoPlayer);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static zy2 m55303c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_collectible, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55302a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo49999b() {
        return this.f36305a;
    }
}
