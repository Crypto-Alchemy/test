package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.a */
/* compiled from: CompositeOnPageChangeCallback */
public final class C1503a extends ViewPager2.C1494i {

    /* renamed from: a */
    public final List<ViewPager2.C1494i> f7442a;

    public C1503a(int i) {
        this.f7442a = new ArrayList(i);
    }

    /* renamed from: a */
    public void mo10796a(int i) {
        try {
            for (ViewPager2.C1494i a : this.f7442a) {
                a.mo10796a(i);
            }
        } catch (ConcurrentModificationException e) {
            mo10826e(e);
        }
    }

    /* renamed from: b */
    public void mo10817b(int i, float f, int i2) {
        try {
            for (ViewPager2.C1494i b : this.f7442a) {
                b.mo10817b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            mo10826e(e);
        }
    }

    /* renamed from: c */
    public void mo10797c(int i) {
        try {
            for (ViewPager2.C1494i c : this.f7442a) {
                c.mo10797c(i);
            }
        } catch (ConcurrentModificationException e) {
            mo10826e(e);
        }
    }

    /* renamed from: d */
    public void mo10825d(ViewPager2.C1494i iVar) {
        this.f7442a.add(iVar);
    }

    /* renamed from: e */
    public final void mo10826e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
