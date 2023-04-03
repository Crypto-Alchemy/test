package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.carousel.ContactCarouselView;

/* renamed from: ra2 */
/* compiled from: FragmentSendToNftBinding */
public final class ra2 {

    /* renamed from: a */
    public final ConstraintLayout f33371a;

    /* renamed from: b */
    public final MaterialButton f33372b;

    /* renamed from: c */
    public final MaterialButton f33373c;

    /* renamed from: d */
    public final RecyclerView f33374d;

    /* renamed from: e */
    public final ContactCarouselView f33375e;

    /* renamed from: f */
    public final AppCompatEditText f33376f;

    /* renamed from: g */
    public final AppCompatImageView f33377g;

    /* renamed from: h */
    public final LinearLayoutCompat f33378h;

    /* renamed from: i */
    public final AppCompatImageView f33379i;

    /* renamed from: j */
    public final ScrollView f33380j;

    /* renamed from: k */
    public final LinearLayout f33381k;

    /* renamed from: l */
    public final AppCompatEditText f33382l;

    /* renamed from: m */
    public final b36 f33383m;

    /* renamed from: n */
    public final id7 f33384n;

    public ra2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, RecyclerView recyclerView, ContactCarouselView contactCarouselView, AppCompatEditText appCompatEditText, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, ScrollView scrollView, LinearLayout linearLayout, AppCompatEditText appCompatEditText2, b36 b36, id7 id7) {
        this.f33371a = constraintLayout;
        this.f33372b = materialButton;
        this.f33373c = materialButton2;
        this.f33374d = recyclerView;
        this.f33375e = contactCarouselView;
        this.f33376f = appCompatEditText;
        this.f33377g = appCompatImageView;
        this.f33378h = linearLayoutCompat;
        this.f33379i = appCompatImageView2;
        this.f33380j = scrollView;
        this.f33381k = linearLayout;
        this.f33382l = appCompatEditText2;
        this.f33383m = b36;
        this.f33384n = id7;
    }

    /* renamed from: a */
    public static ra2 m51005a(View view) {
        View view2 = view;
        int i = R.id.btnAddContact;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnAddContact);
        if (materialButton != null) {
            i = R.id.btnSend;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnSend);
            if (materialButton2 != null) {
                i = R.id.contacts;
                RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.contacts);
                if (recyclerView != null) {
                    i = R.id.cvRecentContact;
                    ContactCarouselView contactCarouselView = (ContactCarouselView) ca7.m11819a(view2, R.id.cvRecentContact);
                    if (contactCarouselView != null) {
                        i = R.id.etContactAddress;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) ca7.m11819a(view2, R.id.etContactAddress);
                        if (appCompatEditText != null) {
                            i = R.id.imgWallets;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imgWallets);
                            if (appCompatImageView != null) {
                                i = R.id.lContactAddressContainer;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.lContactAddressContainer);
                                if (linearLayoutCompat != null) {
                                    i = R.id.nftDetailImage;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.nftDetailImage);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.scroll_layout;
                                        ScrollView scrollView = (ScrollView) ca7.m11819a(view2, R.id.scroll_layout);
                                        if (scrollView != null) {
                                            i = R.id.searchBox;
                                            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.searchBox);
                                            if (linearLayout != null) {
                                                i = R.id.searchField;
                                                AppCompatEditText appCompatEditText2 = (AppCompatEditText) ca7.m11819a(view2, R.id.searchField);
                                                if (appCompatEditText2 != null) {
                                                    i = R.id.toolbarWrapper;
                                                    View a = ca7.m11819a(view2, R.id.toolbarWrapper);
                                                    if (a != null) {
                                                        b36 a2 = b36.m32346a(a);
                                                        i = R.id.view_til_end_layout;
                                                        View a3 = ca7.m11819a(view2, R.id.view_til_end_layout);
                                                        if (a3 != null) {
                                                            return new ra2((ConstraintLayout) view2, materialButton, materialButton2, recyclerView, contactCarouselView, appCompatEditText, appCompatImageView, linearLayoutCompat, appCompatImageView2, scrollView, linearLayout, appCompatEditText2, a2, id7.m45672a(a3));
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

    /* renamed from: c */
    public static ra2 m51006c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_send_to_nft, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m51005a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo47351b() {
        return this.f33371a;
    }
}
