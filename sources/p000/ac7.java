package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.CustomVideoPlayer;
import net.safemoon.androidwallet.views.zoomImage.ZoomageView;

/* renamed from: ac7 */
/* compiled from: ViewDetailNfcBinding */
public final class ac7 {

    /* renamed from: a */
    public final NestedScrollView f20897a;

    /* renamed from: b */
    public final MaterialButton f20898b;

    /* renamed from: c */
    public final TextView f20899c;

    /* renamed from: d */
    public final FrameLayout f20900d;

    /* renamed from: e */
    public final TextView f20901e;

    /* renamed from: f */
    public final TextView f20902f;

    /* renamed from: g */
    public final RecyclerView f20903g;

    /* renamed from: h */
    public final TextView f20904h;

    /* renamed from: i */
    public final RelativeLayout f20905i;

    /* renamed from: j */
    public final View f20906j;

    /* renamed from: k */
    public final TextView f20907k;

    /* renamed from: l */
    public final TextView f20908l;

    /* renamed from: m */
    public final Chip f20909m;

    /* renamed from: n */
    public final ConstraintLayout f20910n;

    /* renamed from: o */
    public final CustomVideoPlayer f20911o;

    /* renamed from: p */
    public final ZoomageView f20912p;

    public ac7(NestedScrollView nestedScrollView, MaterialButton materialButton, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, RecyclerView recyclerView, TextView textView4, RelativeLayout relativeLayout, View view, TextView textView5, TextView textView6, Chip chip, ConstraintLayout constraintLayout, CustomVideoPlayer customVideoPlayer, ZoomageView zoomageView) {
        this.f20897a = nestedScrollView;
        this.f20898b = materialButton;
        this.f20899c = textView;
        this.f20900d = frameLayout;
        this.f20901e = textView2;
        this.f20902f = textView3;
        this.f20903g = recyclerView;
        this.f20904h = textView4;
        this.f20905i = relativeLayout;
        this.f20906j = view;
        this.f20907k = textView5;
        this.f20908l = textView6;
        this.f20909m = chip;
        this.f20910n = constraintLayout;
        this.f20911o = customVideoPlayer;
        this.f20912p = zoomageView;
    }

    /* renamed from: a */
    public static ac7 m31775a(View view) {
        View view2 = view;
        int i = R.id.btnSend;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnSend);
        if (materialButton != null) {
            i = R.id.contract_address;
            TextView textView = (TextView) ca7.m11819a(view2, R.id.contract_address);
            if (textView != null) {
                i = R.id.main_media_frame;
                FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view2, R.id.main_media_frame);
                if (frameLayout != null) {
                    i = R.id.network;
                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.network);
                    if (textView2 != null) {
                        i = R.id.nftSource;
                        TextView textView3 = (TextView) ca7.m11819a(view2, R.id.nftSource);
                        if (textView3 != null) {
                            i = R.id.propertyRecycle;
                            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.propertyRecycle);
                            if (recyclerView != null) {
                                i = R.id.token_id;
                                TextView textView4 = (TextView) ca7.m11819a(view2, R.id.token_id);
                                if (textView4 != null) {
                                    i = R.id.tokenIdWrapper;
                                    RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view2, R.id.tokenIdWrapper);
                                    if (relativeLayout != null) {
                                        i = R.id.tokenIdWrapperDivider;
                                        View a = ca7.m11819a(view2, R.id.tokenIdWrapperDivider);
                                        if (a != null) {
                                            i = R.id.token_standard;
                                            TextView textView5 = (TextView) ca7.m11819a(view2, R.id.token_standard);
                                            if (textView5 != null) {
                                                i = R.id.txtDescription;
                                                TextView textView6 = (TextView) ca7.m11819a(view2, R.id.txtDescription);
                                                if (textView6 != null) {
                                                    i = R.id.txtError;
                                                    Chip chip = (Chip) ca7.m11819a(view2, R.id.txtError);
                                                    if (chip != null) {
                                                        i = R.id.videoParent;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.videoParent);
                                                        if (constraintLayout != null) {
                                                            i = R.id.videoView;
                                                            CustomVideoPlayer customVideoPlayer = (CustomVideoPlayer) ca7.m11819a(view2, R.id.videoView);
                                                            if (customVideoPlayer != null) {
                                                                i = R.id.zoom_image;
                                                                ZoomageView zoomageView = (ZoomageView) ca7.m11819a(view2, R.id.zoom_image);
                                                                if (zoomageView != null) {
                                                                    return new ac7((NestedScrollView) view2, materialButton, textView, frameLayout, textView2, textView3, recyclerView, textView4, relativeLayout, a, textView5, textView6, chip, constraintLayout, customVideoPlayer, zoomageView);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
