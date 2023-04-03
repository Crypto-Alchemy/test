package p000;

import android.view.View;
import android.widget.LinearLayout;
import net.safemoon.androidwallet.fragments.preference.DefaultDateFormatFragment;

/* renamed from: k71 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k71 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f38871a;

    /* renamed from: d */
    public final /* synthetic */ jz2 f38872d;

    /* renamed from: e */
    public final /* synthetic */ DefaultDateFormatFragment f38873e;

    /* renamed from: g */
    public final /* synthetic */ String f38874g;

    public /* synthetic */ k71(LinearLayout linearLayout, jz2 jz2, DefaultDateFormatFragment defaultDateFormatFragment, String str) {
        this.f38871a = linearLayout;
        this.f38872d = jz2;
        this.f38873e = defaultDateFormatFragment;
        this.f38874g = str;
    }

    public final void onClick(View view) {
        DefaultDateFormatFragment.m68038v(this.f38871a, this.f38872d, this.f38873e, this.f38874g, view);
    }
}
