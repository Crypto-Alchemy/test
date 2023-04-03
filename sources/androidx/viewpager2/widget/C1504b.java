package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.b */
/* compiled from: PageTransformerAdapter */
public final class C1504b extends ViewPager2.C1494i {

    /* renamed from: a */
    public final LinearLayoutManager f7443a;

    /* renamed from: b */
    public ViewPager2.C1499k f7444b;

    public C1504b(LinearLayoutManager linearLayoutManager) {
        this.f7443a = linearLayoutManager;
    }

    /* renamed from: a */
    public void mo10796a(int i) {
    }

    /* renamed from: b */
    public void mo10817b(int i, float f, int i2) {
        if (this.f7444b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f7443a.mo9234U()) {
                View T = this.f7443a.mo9231T(i3);
                if (T != null) {
                    this.f7444b.mo10822a(T, ((float) (this.f7443a.mo9271o0(T) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f7443a.mo9234U())}));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo10797c(int i) {
    }

    /* renamed from: d */
    public ViewPager2.C1499k mo10827d() {
        return this.f7444b;
    }

    /* renamed from: e */
    public void mo10828e(ViewPager2.C1499k kVar) {
        this.f7444b = kVar;
    }
}
