package p000;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.widgets.C0484b;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xk7 */
/* compiled from: WidgetGroup */
public class xk7 {

    /* renamed from: g */
    public static int f19863g;

    /* renamed from: a */
    public ArrayList<ConstraintWidget> f19864a = new ArrayList<>();

    /* renamed from: b */
    public int f19865b;

    /* renamed from: c */
    public boolean f19866c = false;

    /* renamed from: d */
    public int f19867d;

    /* renamed from: e */
    public ArrayList<C3612a> f19868e = null;

    /* renamed from: f */
    public int f19869f = -1;

    /* renamed from: xk7$a */
    /* compiled from: WidgetGroup */
    public class C3612a {

        /* renamed from: a */
        public WeakReference<ConstraintWidget> f19870a;

        /* renamed from: b */
        public int f19871b;

        /* renamed from: c */
        public int f19872c;

        /* renamed from: d */
        public int f19873d;

        /* renamed from: e */
        public int f19874e;

        /* renamed from: f */
        public int f19875f;

        /* renamed from: g */
        public int f19876g;

        public C3612a(ConstraintWidget constraintWidget, C0467c cVar, int i) {
            this.f19870a = new WeakReference<>(constraintWidget);
            this.f19871b = cVar.mo4284x(constraintWidget.f2392P);
            this.f19872c = cVar.mo4284x(constraintWidget.f2394Q);
            this.f19873d = cVar.mo4284x(constraintWidget.f2396R);
            this.f19874e = cVar.mo4284x(constraintWidget.f2398S);
            this.f19875f = cVar.mo4284x(constraintWidget.f2400T);
            this.f19876g = i;
        }
    }

    public xk7(int i) {
        int i2 = f19863g;
        f19863g = i2 + 1;
        this.f19865b = i2;
        this.f19867d = i;
    }

    /* renamed from: a */
    public boolean mo27776a(ConstraintWidget constraintWidget) {
        if (this.f19864a.contains(constraintWidget)) {
            return false;
        }
        this.f19864a.add(constraintWidget);
        return true;
    }

    /* renamed from: b */
    public void mo27777b(ArrayList<xk7> arrayList) {
        int size = this.f19864a.size();
        if (this.f19869f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                xk7 xk7 = arrayList.get(i);
                if (this.f19869f == xk7.f19865b) {
                    mo27782g(this.f19867d, xk7);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int mo27778c() {
        return this.f19865b;
    }

    /* renamed from: d */
    public int mo27779d() {
        return this.f19867d;
    }

    /* renamed from: e */
    public final String mo27780e() {
        int i = this.f19867d;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return "Both";
        }
        return "Unknown";
    }

    /* renamed from: f */
    public int mo27781f(C0467c cVar, int i) {
        if (this.f19864a.size() == 0) {
            return 0;
        }
        return mo27785j(cVar, this.f19864a, i);
    }

    /* renamed from: g */
    public void mo27782g(int i, xk7 xk7) {
        Iterator<ConstraintWidget> it = this.f19864a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            xk7.mo27776a(next);
            if (i == 0) {
                next.f2397R0 = xk7.mo27778c();
            } else {
                next.f2399S0 = xk7.mo27778c();
            }
        }
        this.f19869f = xk7.f19865b;
    }

    /* renamed from: h */
    public void mo27783h(boolean z) {
        this.f19866c = z;
    }

    /* renamed from: i */
    public void mo27784i(int i) {
        this.f19867d = i;
    }

    /* renamed from: j */
    public final int mo27785j(C0467c cVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int x;
        int x2;
        C0486d dVar = (C0486d) arrayList.get(0).mo4351M();
        cVar.mo4262D();
        dVar.mo4394g(cVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo4394g(cVar, false);
        }
        if (i == 0 && dVar.f2529f1 > 0) {
            C0484b.m3630b(dVar, cVar, arrayList, 0);
        }
        if (i == 1 && dVar.f2530g1 > 0) {
            C0484b.m3630b(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.mo4286z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f19868e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f19868e.add(new C3612a(arrayList.get(i3), cVar, i));
        }
        if (i == 0) {
            x = cVar.mo4284x(dVar.f2392P);
            x2 = cVar.mo4284x(dVar.f2396R);
            cVar.mo4262D();
        } else {
            x = cVar.mo4284x(dVar.f2394Q);
            x2 = cVar.mo4284x(dVar.f2398S);
            cVar.mo4262D();
        }
        return x2 - x;
    }

    public String toString() {
        String str = mo27780e() + " [" + this.f19865b + "] <";
        Iterator<ConstraintWidget> it = this.f19864a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().mo4433v();
        }
        return str + " >";
    }
}
