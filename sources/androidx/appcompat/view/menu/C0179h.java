package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0182i;

/* renamed from: androidx.appcompat.view.menu.h */
/* compiled from: MenuPopupHelper */
public class C0179h {

    /* renamed from: a */
    public final Context f829a;

    /* renamed from: b */
    public final C0173e f830b;

    /* renamed from: c */
    public final boolean f831c;

    /* renamed from: d */
    public final int f832d;

    /* renamed from: e */
    public final int f833e;

    /* renamed from: f */
    public View f834f;

    /* renamed from: g */
    public int f835g;

    /* renamed from: h */
    public boolean f836h;

    /* renamed from: i */
    public C0182i.C0183a f837i;

    /* renamed from: j */
    public cu3 f838j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f839k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f840l;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* compiled from: MenuPopupHelper */
    public class C0180a implements PopupWindow.OnDismissListener {
        public C0180a() {
        }

        public void onDismiss() {
            C0179h.this.mo1550e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    /* compiled from: MenuPopupHelper */
    public static class C0181b {
        /* renamed from: a */
        public static void m1180a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0179h(Context context, C0173e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [cu3, androidx.appcompat.view.menu.i] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.cu3 mo1546a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f829a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.C0179h.C0181b.m1180a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f829a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p000.n25.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f829a
            android.view.View r3 = r14.f834f
            int r4 = r14.f832d
            int r5 = r14.f833e
            boolean r6 = r14.f831c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r8 = r14.f829a
            androidx.appcompat.view.menu.e r9 = r14.f830b
            android.view.View r10 = r14.f834f
            int r11 = r14.f832d
            int r12 = r14.f833e
            boolean r13 = r14.f831c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.e r1 = r14.f830b
            r0.mo1334m(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f840l
            r0.mo1343w(r1)
            android.view.View r1 = r14.f834f
            r0.mo1339r(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f837i
            r0.mo1307e(r1)
            boolean r1 = r14.f836h
            r0.mo1340t(r1)
            int r1 = r14.f835g
            r0.mo1341u(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0179h.mo1546a():cu3");
    }

    /* renamed from: b */
    public void mo1547b() {
        if (mo1549d()) {
            this.f838j.dismiss();
        }
    }

    /* renamed from: c */
    public cu3 mo1548c() {
        if (this.f838j == null) {
            this.f838j = mo1546a();
        }
        return this.f838j;
    }

    /* renamed from: d */
    public boolean mo1549d() {
        cu3 cu3 = this.f838j;
        if (cu3 == null || !cu3.mo1328a()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo1550e() {
        this.f838j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f839k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1551f(View view) {
        this.f834f = view;
    }

    /* renamed from: g */
    public void mo1552g(boolean z) {
        this.f836h = z;
        cu3 cu3 = this.f838j;
        if (cu3 != null) {
            cu3.mo1340t(z);
        }
    }

    /* renamed from: h */
    public void mo1553h(int i) {
        this.f835g = i;
    }

    /* renamed from: i */
    public void mo1554i(PopupWindow.OnDismissListener onDismissListener) {
        this.f839k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1555j(C0182i.C0183a aVar) {
        this.f837i = aVar;
        cu3 cu3 = this.f838j;
        if (cu3 != null) {
            cu3.mo1307e(aVar);
        }
    }

    /* renamed from: k */
    public void mo1556k() {
        if (!mo1558m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: l */
    public final void mo1557l(int i, int i2, boolean z, boolean z2) {
        cu3 c = mo1548c();
        c.mo1344x(z2);
        if (z) {
            if ((pj2.m24971b(this.f835g, ga7.m17715B(this.f834f)) & 7) == 5) {
                i -= this.f834f.getWidth();
            }
            c.mo1342v(i);
            c.mo1345y(i2);
            int i3 = (int) ((this.f829a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo18290s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo1329c();
    }

    /* renamed from: m */
    public boolean mo1558m() {
        if (mo1549d()) {
            return true;
        }
        if (this.f834f == null) {
            return false;
        }
        mo1557l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1559n(int i, int i2) {
        if (mo1549d()) {
            return true;
        }
        if (this.f834f == null) {
            return false;
        }
        mo1557l(i, i2, true, true);
        return true;
    }

    public C0179h(Context context, C0173e eVar, View view, boolean z, int i, int i2) {
        this.f835g = 8388611;
        this.f840l = new C0180a();
        this.f829a = context;
        this.f830b = eVar;
        this.f834f = view;
        this.f831c = z;
        this.f832d = i;
        this.f833e = i2;
    }
}
