package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0179h;

/* renamed from: it4 */
/* compiled from: PopupMenu */
public class it4 {

    /* renamed from: a */
    public final Context f13386a;

    /* renamed from: b */
    public final C0173e f13387b;

    /* renamed from: c */
    public final View f13388c;

    /* renamed from: d */
    public final C0179h f13389d;

    /* renamed from: e */
    public C2573d f13390e;

    /* renamed from: f */
    public C2572c f13391f;

    /* renamed from: it4$a */
    /* compiled from: PopupMenu */
    public class C2570a implements C0173e.C0174a {
        public C2570a() {
        }

        /* renamed from: a */
        public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
            C2573d dVar = it4.this.f13390e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo1100b(C0173e eVar) {
        }
    }

    /* renamed from: it4$b */
    /* compiled from: PopupMenu */
    public class C2571b implements PopupWindow.OnDismissListener {
        public C2571b() {
        }

        public void onDismiss() {
            it4 it4 = it4.this;
            C2572c cVar = it4.f13391f;
            if (cVar != null) {
                cVar.mo21639a(it4);
            }
        }
    }

    /* renamed from: it4$c */
    /* compiled from: PopupMenu */
    public interface C2572c {
        /* renamed from: a */
        void mo21639a(it4 it4);
    }

    /* renamed from: it4$d */
    /* compiled from: PopupMenu */
    public interface C2573d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public it4(Context context, View view) {
        this(context, view, 0);
    }

    /* renamed from: a */
    public Menu mo21632a() {
        return this.f13387b;
    }

    /* renamed from: b */
    public MenuInflater mo21633b() {
        return new yd6(this.f13386a);
    }

    /* renamed from: c */
    public void mo21634c(int i) {
        mo21633b().inflate(i, this.f13387b);
    }

    /* renamed from: d */
    public void mo21635d(int i) {
        this.f13389d.mo1553h(i);
    }

    /* renamed from: e */
    public void mo21636e(C2573d dVar) {
        this.f13390e = dVar;
    }

    /* renamed from: f */
    public void mo21637f() {
        this.f13389d.mo1556k();
    }

    public it4(Context context, View view, int i) {
        this(context, view, i, m15.popupMenuStyle, 0);
    }

    public it4(Context context, View view, int i, int i2, int i3) {
        this.f13386a = context;
        this.f13388c = view;
        C0173e eVar = new C0173e(context);
        this.f13387b = eVar;
        eVar.mo1394V(new C2570a());
        C0179h hVar = new C0179h(context, eVar, view, false, i2, i3);
        this.f13389d = hVar;
        hVar.mo1553h(i);
        hVar.mo1554i(new C2571b());
    }
}
