package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.utils.Utils;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.c */
/* compiled from: ScrollEventAdapter */
public final class C1505c extends RecyclerView.C1251r {

    /* renamed from: a */
    public ViewPager2.C1494i f7445a;

    /* renamed from: b */
    public final ViewPager2 f7446b;

    /* renamed from: c */
    public final RecyclerView f7447c;

    /* renamed from: d */
    public final LinearLayoutManager f7448d;

    /* renamed from: e */
    public int f7449e;

    /* renamed from: f */
    public int f7450f;

    /* renamed from: g */
    public C1506a f7451g = new C1506a();

    /* renamed from: h */
    public int f7452h;

    /* renamed from: i */
    public int f7453i;

    /* renamed from: j */
    public boolean f7454j;

    /* renamed from: k */
    public boolean f7455k;

    /* renamed from: l */
    public boolean f7456l;

    /* renamed from: m */
    public boolean f7457m;

    /* renamed from: androidx.viewpager2.widget.c$a */
    /* compiled from: ScrollEventAdapter */
    public static final class C1506a {

        /* renamed from: a */
        public int f7458a;

        /* renamed from: b */
        public float f7459b;

        /* renamed from: c */
        public int f7460c;

        /* renamed from: a */
        public void mo10844a() {
            this.f7458a = -1;
            this.f7459b = Utils.FLOAT_EPSILON;
            this.f7460c = 0;
        }
    }

    public C1505c(ViewPager2 viewPager2) {
        this.f7446b = viewPager2;
        RecyclerView recyclerView = viewPager2.f7401A;
        this.f7447c = recyclerView;
        this.f7448d = (LinearLayoutManager) recyclerView.getLayoutManager();
        mo10840l();
    }

    /* renamed from: a */
    public final void mo10829a(int i, float f, int i2) {
        ViewPager2.C1494i iVar = this.f7445a;
        if (iVar != null) {
            iVar.mo10817b(i, f, i2);
        }
    }

    /* renamed from: b */
    public final void mo10830b(int i) {
        ViewPager2.C1494i iVar = this.f7445a;
        if (iVar != null) {
            iVar.mo10797c(i);
        }
    }

    /* renamed from: c */
    public final void mo10831c(int i) {
        if ((this.f7449e != 3 || this.f7450f != 0) && this.f7450f != i) {
            this.f7450f = i;
            ViewPager2.C1494i iVar = this.f7445a;
            if (iVar != null) {
                iVar.mo10796a(i);
            }
        }
    }

    /* renamed from: d */
    public final int mo10832d() {
        return this.f7448d.mo8913h2();
    }

    /* renamed from: e */
    public double mo10833e() {
        mo10843o();
        C1506a aVar = this.f7451g;
        return ((double) aVar.f7458a) + ((double) aVar.f7459b);
    }

    /* renamed from: f */
    public int mo10834f() {
        return this.f7450f;
    }

    /* renamed from: g */
    public boolean mo10835g() {
        return this.f7457m;
    }

    /* renamed from: h */
    public boolean mo10836h() {
        if (this.f7450f == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo10837i() {
        int i = this.f7449e;
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo10838j() {
        this.f7456l = true;
    }

    /* renamed from: k */
    public void mo10839k(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f7449e = i2;
        boolean z2 = false;
        this.f7457m = false;
        if (this.f7453i != i) {
            z2 = true;
        }
        this.f7453i = i;
        mo10831c(2);
        if (z2) {
            mo10830b(i);
        }
    }

    /* renamed from: l */
    public final void mo10840l() {
        this.f7449e = 0;
        this.f7450f = 0;
        this.f7451g.mo10844a();
        this.f7452h = -1;
        this.f7453i = -1;
        this.f7454j = false;
        this.f7455k = false;
        this.f7457m = false;
        this.f7456l = false;
    }

    /* renamed from: m */
    public void mo10841m(ViewPager2.C1494i iVar) {
        this.f7445a = iVar;
    }

    /* renamed from: n */
    public final void mo10842n(boolean z) {
        int i;
        this.f7457m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f7449e = i;
        int i2 = this.f7453i;
        if (i2 != -1) {
            this.f7452h = i2;
            this.f7453i = -1;
        } else if (this.f7452h == -1) {
            this.f7452h = mo10832d();
        }
        mo10831c(1);
    }

    /* renamed from: o */
    public final void mo10843o() {
        boolean z;
        int i;
        float f;
        C1506a aVar = this.f7451g;
        int h2 = this.f7448d.mo8913h2();
        aVar.f7458a = h2;
        if (h2 == -1) {
            aVar.mo10844a();
            return;
        }
        View N = this.f7448d.mo8888N(h2);
        if (N == null) {
            aVar.mo10844a();
            return;
        }
        int l0 = this.f7448d.mo9263l0(N);
        int q0 = this.f7448d.mo9276q0(N);
        int t0 = this.f7448d.mo9283t0(N);
        int S = this.f7448d.mo9229S(N);
        ViewGroup.LayoutParams layoutParams = N.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l0 += marginLayoutParams.leftMargin;
            q0 += marginLayoutParams.rightMargin;
            t0 += marginLayoutParams.topMargin;
            S += marginLayoutParams.bottomMargin;
        }
        int height = N.getHeight() + t0 + S;
        int width = N.getWidth() + l0 + q0;
        if (this.f7448d.mo8930v2() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = (N.getLeft() - l0) - this.f7447c.getPaddingLeft();
            if (this.f7446b.mo10755d()) {
                i = -i;
            }
            height = width;
        } else {
            i = (N.getTop() - t0) - this.f7447c.getPaddingTop();
        }
        int i2 = -i;
        aVar.f7460c = i2;
        if (i2 >= 0) {
            if (height == 0) {
                f = Utils.FLOAT_EPSILON;
            } else {
                f = ((float) i2) / ((float) height);
            }
            aVar.f7459b = f;
        } else if (new C3730zj(this.f7448d).mo28452d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f7460c)}));
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f7449e == 1 && this.f7450f == 1) && i == 1) {
            mo10842n(false);
        } else if (!mo10837i() || i != 2) {
            if (mo10837i() && i == 0) {
                mo10843o();
                if (!this.f7455k) {
                    int i2 = this.f7451g.f7458a;
                    if (i2 != -1) {
                        mo10829a(i2, Utils.FLOAT_EPSILON, 0);
                    }
                } else {
                    C1506a aVar = this.f7451g;
                    if (aVar.f7460c == 0) {
                        int i3 = this.f7452h;
                        int i4 = aVar.f7458a;
                        if (i3 != i4) {
                            mo10830b(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    mo10831c(0);
                    mo10840l();
                }
            }
            if (this.f7449e == 2 && i == 0 && this.f7456l) {
                mo10843o();
                C1506a aVar2 = this.f7451g;
                if (aVar2.f7460c == 0) {
                    int i5 = this.f7453i;
                    int i6 = aVar2.f7458a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        mo10830b(i6);
                    }
                    mo10831c(0);
                    mo10840l();
                }
            }
        } else if (this.f7455k) {
            mo10831c(2);
            this.f7454j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5 == r3.f7446b.mo10755d()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f7455k = r4
            r3.mo10843o()
            boolean r0 = r3.f7454j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r3.f7454j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = r4
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f7446b
            boolean r6 = r6.mo10755d()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r4
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.c$a r5 = r3.f7451g
            int r6 = r5.f7460c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f7458a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.c$a r5 = r3.f7451g
            int r5 = r5.f7458a
        L_0x0033:
            r3.f7453i = r5
            int r6 = r3.f7452h
            if (r6 == r5) goto L_0x004b
            r3.mo10830b(r5)
            goto L_0x004b
        L_0x003d:
            int r5 = r3.f7449e
            if (r5 != 0) goto L_0x004b
            androidx.viewpager2.widget.c$a r5 = r3.f7451g
            int r5 = r5.f7458a
            if (r5 != r1) goto L_0x0048
            r5 = r2
        L_0x0048:
            r3.mo10830b(r5)
        L_0x004b:
            androidx.viewpager2.widget.c$a r5 = r3.f7451g
            int r6 = r5.f7458a
            if (r6 != r1) goto L_0x0052
            r6 = r2
        L_0x0052:
            float r0 = r5.f7459b
            int r5 = r5.f7460c
            r3.mo10829a(r6, r0, r5)
            androidx.viewpager2.widget.c$a r5 = r3.f7451g
            int r6 = r5.f7458a
            int r0 = r3.f7453i
            if (r6 == r0) goto L_0x0063
            if (r0 != r1) goto L_0x0071
        L_0x0063:
            int r5 = r5.f7460c
            if (r5 != 0) goto L_0x0071
            int r5 = r3.f7450f
            if (r5 == r4) goto L_0x0071
            r3.mo10831c(r2)
            r3.mo10840l()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1505c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
