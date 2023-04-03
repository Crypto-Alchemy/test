package p000;

import java.util.List;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.fragments.ReflectionsFragment;

/* renamed from: vb5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class vb5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReflectionsFragment f45256a;

    /* renamed from: d */
    public final /* synthetic */ List f45257d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerTouchListener f45258e;

    public /* synthetic */ vb5(ReflectionsFragment reflectionsFragment, List list, RecyclerTouchListener recyclerTouchListener) {
        this.f45256a = reflectionsFragment;
        this.f45257d = list;
        this.f45258e = recyclerTouchListener;
    }

    public final void run() {
        ReflectionsFragment.m66830J(this.f45256a, this.f45257d, this.f45258e);
    }
}
