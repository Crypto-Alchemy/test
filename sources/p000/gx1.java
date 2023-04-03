package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: gx1 */
/* compiled from: ExpandableWidgetHelper */
public final class gx1 {

    /* renamed from: a */
    public final View f29385a;

    /* renamed from: b */
    public boolean f29386b = false;

    /* renamed from: c */
    public int f29387c = 0;

    public gx1(fx1 fx1) {
        this.f29385a = (View) fx1;
    }

    /* renamed from: a */
    public final void mo43019a() {
        ViewParent parent = this.f29385a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f29385a);
        }
    }

    /* renamed from: b */
    public int mo43020b() {
        return this.f29387c;
    }

    /* renamed from: c */
    public boolean mo43021c() {
        return this.f29386b;
    }

    /* renamed from: d */
    public void mo43022d(Bundle bundle) {
        this.f29386b = bundle.getBoolean("expanded", false);
        this.f29387c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f29386b) {
            mo43019a();
        }
    }

    /* renamed from: e */
    public Bundle mo43023e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f29386b);
        bundle.putInt("expandedComponentIdHint", this.f29387c);
        return bundle;
    }

    /* renamed from: f */
    public void mo43024f(int i) {
        this.f29387c = i;
    }
}
