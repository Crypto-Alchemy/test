package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.creageek.segmentedbutton.SegmentedButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: go */
/* compiled from: AppTopBarBinding */
public final class C5872go {

    /* renamed from: a */
    public final ConstraintLayout f29297a;

    /* renamed from: b */
    public final ImageView f29298b;

    /* renamed from: c */
    public final ImageView f29299c;

    /* renamed from: d */
    public final ImageView f29300d;

    /* renamed from: e */
    public final TextView f29301e;

    /* renamed from: f */
    public final RadioButton f29302f;

    /* renamed from: g */
    public final RadioButton f29303g;

    /* renamed from: h */
    public final RadioButton f29304h;

    /* renamed from: i */
    public final RadioButton f29305i;

    /* renamed from: j */
    public final SegmentedButton f29306j;

    /* renamed from: k */
    public final MaterialTextView f29307k;

    public C5872go(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, SegmentedButton segmentedButton, MaterialTextView materialTextView) {
        this.f29297a = constraintLayout;
        this.f29298b = imageView;
        this.f29299c = imageView2;
        this.f29300d = imageView3;
        this.f29301e = textView;
        this.f29302f = radioButton;
        this.f29303g = radioButton2;
        this.f29304h = radioButton3;
        this.f29305i = radioButton4;
        this.f29306j = segmentedButton;
        this.f29307k = materialTextView;
    }

    /* renamed from: a */
    public static C5872go m44795a(View view) {
        int i = R.id.ivNotification;
        ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivNotification);
        if (imageView != null) {
            i = R.id.ivTokenList;
            ImageView imageView2 = (ImageView) ca7.m11819a(view, R.id.ivTokenList);
            if (imageView2 != null) {
                i = R.id.iv_token_list_add_new;
                ImageView imageView3 = (ImageView) ca7.m11819a(view, R.id.iv_token_list_add_new);
                if (imageView3 != null) {
                    i = R.id.leftText;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.leftText);
                    if (textView != null) {
                        i = R.id.rbCalculate;
                        RadioButton radioButton = (RadioButton) ca7.m11819a(view, R.id.rbCalculate);
                        if (radioButton != null) {
                            i = R.id.rbNftS;
                            RadioButton radioButton2 = (RadioButton) ca7.m11819a(view, R.id.rbNftS);
                            if (radioButton2 != null) {
                                i = R.id.rbReflections;
                                RadioButton radioButton3 = (RadioButton) ca7.m11819a(view, R.id.rbReflections);
                                if (radioButton3 != null) {
                                    i = R.id.rbTokens;
                                    RadioButton radioButton4 = (RadioButton) ca7.m11819a(view, R.id.rbTokens);
                                    if (radioButton4 != null) {
                                        i = R.id.segmentedGroup;
                                        SegmentedButton segmentedButton = (SegmentedButton) ca7.m11819a(view, R.id.segmentedGroup);
                                        if (segmentedButton != null) {
                                            i = R.id.txtUnReadCount;
                                            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtUnReadCount);
                                            if (materialTextView != null) {
                                                return new C5872go((ConstraintLayout) view, imageView, imageView2, imageView3, textView, radioButton, radioButton2, radioButton3, radioButton4, segmentedButton, materialTextView);
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
