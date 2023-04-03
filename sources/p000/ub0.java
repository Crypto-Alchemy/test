package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ub0 */
/* compiled from: CarouselOffset */
public class ub0 {

    /* renamed from: ub0$a */
    /* compiled from: CarouselOffset */
    public class C6564a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView f34573a;

        /* renamed from: d */
        public final /* synthetic */ boolean f34574d;

        /* renamed from: e */
        public final /* synthetic */ View f34575e;

        /* renamed from: g */
        public final /* synthetic */ int f34576g;

        public C6564a(RecyclerView recyclerView, boolean z, View view, int i) {
            this.f34573a = recyclerView;
            this.f34574d = z;
            this.f34575e = view;
            this.f34576g = i;
        }

        public void onGlobalLayout() {
            if (this.f34573a.getItemDecorationCount() > 0) {
                this.f34573a.mo9020c1(0);
            }
            if (this.f34574d) {
                this.f34573a.mo9071i(new tb0(this.f34575e.getWidth(), this.f34576g), 0);
            } else {
                this.f34573a.mo9071i(new tb0(0, this.f34576g), 0);
            }
            this.f34575e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: a */
    public void mo48382a(RecyclerView recyclerView, View view, int i, boolean z) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C6564a(recyclerView, z, view, i));
    }
}
