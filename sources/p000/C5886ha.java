package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: ha */
/* compiled from: ActivityImportWordBinding */
public final class C5886ha {

    /* renamed from: a */
    public final ConstraintLayout f29482a;

    /* renamed from: b */
    public final MaterialButton f29483b;

    /* renamed from: c */
    public final MaterialButton f29484c;

    /* renamed from: d */
    public final MaterialButton f29485d;

    /* renamed from: e */
    public final AppCompatImageView f29486e;

    /* renamed from: f */
    public final ConstraintLayout f29487f;

    /* renamed from: g */
    public final Flow f29488g;

    /* renamed from: h */
    public final LinearLayout f29489h;

    /* renamed from: i */
    public final ImageView f29490i;

    /* renamed from: j */
    public final ScrollView f29491j;

    public C5886ha(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, Flow flow, LinearLayout linearLayout, ImageView imageView, ScrollView scrollView) {
        this.f29482a = constraintLayout;
        this.f29483b = materialButton;
        this.f29484c = materialButton2;
        this.f29485d = materialButton3;
        this.f29486e = appCompatImageView;
        this.f29487f = constraintLayout2;
        this.f29488g = flow;
        this.f29489h = linearLayout;
        this.f29490i = imageView;
        this.f29491j = scrollView;
    }

    /* renamed from: a */
    public static C5886ha m45075a(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
            if (materialButton2 != null) {
                i = R.id.btnPaste;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.btnPaste);
                if (materialButton3 != null) {
                    i = R.id.btnScanQr;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnScanQr);
                    if (appCompatImageView != null) {
                        i = R.id.clWordParent;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view, R.id.clWordParent);
                        if (constraintLayout != null) {
                            i = R.id.flowWidget;
                            Flow flow = (Flow) ca7.m11819a(view, R.id.flowWidget);
                            if (flow != null) {
                                i = R.id.headerParent;
                                LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.headerParent);
                                if (linearLayout != null) {
                                    i = R.id.imageView4;
                                    ImageView imageView = (ImageView) ca7.m11819a(view, R.id.imageView4);
                                    if (imageView != null) {
                                        i = R.id.scrollView4;
                                        ScrollView scrollView = (ScrollView) ca7.m11819a(view, R.id.scrollView4);
                                        if (scrollView != null) {
                                            return new C5886ha((ConstraintLayout) view, materialButton, materialButton2, materialButton3, appCompatImageView, constraintLayout, flow, linearLayout, imageView, scrollView);
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

    /* renamed from: c */
    public static C5886ha m45076c(LayoutInflater layoutInflater) {
        return m45077d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C5886ha m45077d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_import_word, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m45075a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo43112b() {
        return this.f29482a;
    }
}
