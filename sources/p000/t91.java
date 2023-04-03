package p000;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Pair;
import net.safemoon.androidwallet.fragments.preference.DefaultScreenFragment;

/* renamed from: t91 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t91 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f44692a;

    /* renamed from: d */
    public final /* synthetic */ jz2 f44693d;

    /* renamed from: e */
    public final /* synthetic */ Pair f44694e;

    public /* synthetic */ t91(LinearLayout linearLayout, jz2 jz2, Pair pair) {
        this.f44692a = linearLayout;
        this.f44693d = jz2;
        this.f44694e = pair;
    }

    public final void onClick(View view) {
        DefaultScreenFragment.m68058v(this.f44692a, this.f44693d, this.f44694e, view);
    }
}
