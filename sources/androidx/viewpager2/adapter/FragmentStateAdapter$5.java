package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;

class FragmentStateAdapter$5 implements C0715e {

    /* renamed from: a */
    public final /* synthetic */ Handler f7398a;

    /* renamed from: d */
    public final /* synthetic */ Runnable f7399d;

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f7398a.removeCallbacks(this.f7399d);
            ug3.getLifecycle().mo6297c(this);
        }
    }
}
