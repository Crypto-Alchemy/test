package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0184j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* compiled from: BaseMenuPresenter */
public abstract class C0163a implements C0182i {

    /* renamed from: A */
    public int f701A;

    /* renamed from: a */
    public Context f702a;

    /* renamed from: d */
    public Context f703d;

    /* renamed from: e */
    public C0173e f704e;

    /* renamed from: g */
    public LayoutInflater f705g;

    /* renamed from: k */
    public LayoutInflater f706k;

    /* renamed from: r */
    public C0182i.C0183a f707r;

    /* renamed from: s */
    public int f708s;

    /* renamed from: x */
    public int f709x;

    /* renamed from: y */
    public C0184j f710y;

    public C0163a(Context context, int i, int i2) {
        this.f702a = context;
        this.f705g = LayoutInflater.from(context);
        this.f708s = i;
        this.f709x = i2;
    }

    /* renamed from: b */
    public void mo1304b(C0173e eVar, boolean z) {
        C0182i.C0183a aVar = this.f707r;
        if (aVar != null) {
            aVar.mo1168b(eVar, z);
        }
    }

    /* renamed from: c */
    public void mo1305c(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f710y).addView(view, i);
    }

    /* renamed from: d */
    public boolean mo1306d(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: e */
    public void mo1307e(C0182i.C0183a aVar) {
        this.f707r = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1308g(androidx.appcompat.view.menu.C0189l r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.i$a r0 = r1.f707r
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f704e
        L_0x0009:
            boolean r2 = r0.mo1169c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0163a.mo1308g(androidx.appcompat.view.menu.l):boolean");
    }

    public int getId() {
        return this.f701A;
    }

    /* renamed from: i */
    public void mo1310i(boolean z) {
        C0177g gVar;
        ViewGroup viewGroup = (ViewGroup) this.f710y;
        if (viewGroup != null) {
            C0173e eVar = this.f704e;
            int i = 0;
            if (eVar != null) {
                eVar.mo1451t();
                ArrayList<C0177g> G = this.f704e.mo1379G();
                int size = G.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0177g gVar2 = G.get(i3);
                    if (mo1320t(i2, gVar2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C0184j.C0185a) {
                            gVar = ((C0184j.C0185a) childAt).getItemData();
                        } else {
                            gVar = null;
                        }
                        View q = mo1317q(gVar2, childAt, viewGroup);
                        if (gVar2 != gVar) {
                            q.setPressed(false);
                            q.jumpDrawablesToCurrentState();
                        }
                        if (q != childAt) {
                            mo1305c(q, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1315o(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: k */
    public boolean mo1311k(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: l */
    public void mo1312l(Context context, C0173e eVar) {
        this.f703d = context;
        this.f706k = LayoutInflater.from(context);
        this.f704e = eVar;
    }

    /* renamed from: m */
    public abstract void mo1313m(C0177g gVar, C0184j.C0185a aVar);

    /* renamed from: n */
    public C0184j.C0185a mo1314n(ViewGroup viewGroup) {
        return (C0184j.C0185a) this.f705g.inflate(this.f709x, viewGroup, false);
    }

    /* renamed from: o */
    public boolean mo1315o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: p */
    public C0182i.C0183a mo1316p() {
        return this.f707r;
    }

    /* renamed from: q */
    public View mo1317q(C0177g gVar, View view, ViewGroup viewGroup) {
        C0184j.C0185a aVar;
        if (view instanceof C0184j.C0185a) {
            aVar = (C0184j.C0185a) view;
        } else {
            aVar = mo1314n(viewGroup);
        }
        mo1313m(gVar, aVar);
        return (View) aVar;
    }

    /* renamed from: r */
    public C0184j mo1318r(ViewGroup viewGroup) {
        if (this.f710y == null) {
            C0184j jVar = (C0184j) this.f705g.inflate(this.f708s, viewGroup, false);
            this.f710y = jVar;
            jVar.mo1284a(this.f704e);
            mo1310i(true);
        }
        return this.f710y;
    }

    /* renamed from: s */
    public void mo1319s(int i) {
        this.f701A = i;
    }

    /* renamed from: t */
    public abstract boolean mo1320t(int i, C0177g gVar);
}
