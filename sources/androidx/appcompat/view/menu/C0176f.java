package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0147a;
import androidx.appcompat.view.menu.C0182i;
import androidx.media3.common.PlaybackException;

/* renamed from: androidx.appcompat.view.menu.f */
/* compiled from: MenuDialogHelper */
public class C0176f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0182i.C0183a {

    /* renamed from: a */
    public C0173e f793a;

    /* renamed from: d */
    public C0147a f794d;

    /* renamed from: e */
    public C0170c f795e;

    /* renamed from: g */
    public C0182i.C0183a f796g;

    public C0176f(C0173e eVar) {
        this.f793a = eVar;
    }

    /* renamed from: a */
    public void mo1458a() {
        C0147a aVar = this.f794d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo1168b(C0173e eVar, boolean z) {
        if (z || eVar == this.f793a) {
            mo1458a();
        }
        C0182i.C0183a aVar = this.f796g;
        if (aVar != null) {
            aVar.mo1168b(eVar, z);
        }
    }

    /* renamed from: c */
    public boolean mo1169c(C0173e eVar) {
        C0182i.C0183a aVar = this.f796g;
        if (aVar != null) {
            return aVar.mo1169c(eVar);
        }
        return false;
    }

    /* renamed from: d */
    public void mo1459d(IBinder iBinder) {
        C0173e eVar = this.f793a;
        C0147a.C0148a aVar = new C0147a.C0148a(eVar.mo1454w());
        C0170c cVar = new C0170c(aVar.getContext(), i45.abc_list_menu_item_layout);
        this.f795e = cVar;
        cVar.mo1307e(this);
        this.f793a.mo1410b(this.f795e);
        aVar.mo1196a(this.f795e.mo1353a(), this);
        View A = eVar.mo1374A();
        if (A != null) {
            aVar.mo1198c(A);
        } else {
            aVar.mo1200d(eVar.mo1456y()).setTitle(eVar.mo1457z());
        }
        aVar.mo1205h(this);
        C0147a create = aVar.create();
        this.f794d = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f794d.getWindow().getAttributes();
        attributes.type = PlaybackException.ERROR_CODE_TIMEOUT;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f794d.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f793a.mo1386N((C0177g) this.f795e.mo1353a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f795e.mo1304b(this.f793a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f794d.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f794d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f793a.mo1419e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f793a.performShortcut(i, keyEvent, 0);
    }
}
