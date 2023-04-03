package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.a */
/* compiled from: SnackbarManager */
public class C4385a {

    /* renamed from: e */
    public static C4385a f24333e;

    /* renamed from: a */
    public final Object f24334a = new Object();

    /* renamed from: b */
    public final Handler f24335b = new Handler(Looper.getMainLooper(), new C4386a());

    /* renamed from: c */
    public C4388c f24336c;

    /* renamed from: d */
    public C4388c f24337d;

    /* renamed from: com.google.android.material.snackbar.a$a */
    /* compiled from: SnackbarManager */
    public class C4386a implements Handler.Callback {
        public C4386a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C4385a.this.mo33569d((C4388c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    /* compiled from: SnackbarManager */
    public interface C4387b {
        /* renamed from: a */
        void mo33541a(int i);

        /* renamed from: c */
        void mo33542c();
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    /* compiled from: SnackbarManager */
    public static class C4388c {

        /* renamed from: a */
        public final WeakReference<C4387b> f24339a;

        /* renamed from: b */
        public int f24340b;

        /* renamed from: c */
        public boolean f24341c;

        public C4388c(int i, C4387b bVar) {
            this.f24339a = new WeakReference<>(bVar);
            this.f24340b = i;
        }

        /* renamed from: a */
        public boolean mo33581a(C4387b bVar) {
            if (bVar == null || this.f24339a.get() != bVar) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: c */
    public static C4385a m35967c() {
        if (f24333e == null) {
            f24333e = new C4385a();
        }
        return f24333e;
    }

    /* renamed from: a */
    public final boolean mo33567a(C4388c cVar, int i) {
        C4387b bVar = cVar.f24339a.get();
        if (bVar == null) {
            return false;
        }
        this.f24335b.removeCallbacksAndMessages(cVar);
        bVar.mo33541a(i);
        return true;
    }

    /* renamed from: b */
    public void mo33568b(C4387b bVar, int i) {
        synchronized (this.f24334a) {
            if (mo33571f(bVar)) {
                mo33567a(this.f24336c, i);
            } else if (mo33572g(bVar)) {
                mo33567a(this.f24337d, i);
            }
        }
    }

    /* renamed from: d */
    public void mo33569d(C4388c cVar) {
        synchronized (this.f24334a) {
            if (this.f24336c == cVar || this.f24337d == cVar) {
                mo33567a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo33570e(C4387b bVar) {
        boolean z;
        synchronized (this.f24334a) {
            if (!mo33571f(bVar)) {
                if (!mo33572g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo33571f(C4387b bVar) {
        C4388c cVar = this.f24336c;
        if (cVar == null || !cVar.mo33581a(bVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo33572g(C4387b bVar) {
        C4388c cVar = this.f24337d;
        if (cVar == null || !cVar.mo33581a(bVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo33573h(C4387b bVar) {
        synchronized (this.f24334a) {
            if (mo33571f(bVar)) {
                this.f24336c = null;
                if (this.f24337d != null) {
                    mo33579n();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo33574i(C4387b bVar) {
        synchronized (this.f24334a) {
            if (mo33571f(bVar)) {
                mo33577l(this.f24336c);
            }
        }
    }

    /* renamed from: j */
    public void mo33575j(C4387b bVar) {
        synchronized (this.f24334a) {
            if (mo33571f(bVar)) {
                C4388c cVar = this.f24336c;
                if (!cVar.f24341c) {
                    cVar.f24341c = true;
                    this.f24335b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo33576k(C4387b bVar) {
        synchronized (this.f24334a) {
            if (mo33571f(bVar)) {
                C4388c cVar = this.f24336c;
                if (cVar.f24341c) {
                    cVar.f24341c = false;
                    mo33577l(cVar);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo33577l(C4388c cVar) {
        int i = cVar.f24340b;
        if (i != -2) {
            if (i <= 0) {
                if (i == -1) {
                    i = 1500;
                } else {
                    i = 2750;
                }
            }
            this.f24335b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f24335b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: m */
    public void mo33578m(int i, C4387b bVar) {
        synchronized (this.f24334a) {
            if (mo33571f(bVar)) {
                C4388c cVar = this.f24336c;
                cVar.f24340b = i;
                this.f24335b.removeCallbacksAndMessages(cVar);
                mo33577l(this.f24336c);
                return;
            }
            if (mo33572g(bVar)) {
                this.f24337d.f24340b = i;
            } else {
                this.f24337d = new C4388c(i, bVar);
            }
            C4388c cVar2 = this.f24336c;
            if (cVar2 == null || !mo33567a(cVar2, 4)) {
                this.f24336c = null;
                mo33579n();
            }
        }
    }

    /* renamed from: n */
    public final void mo33579n() {
        C4388c cVar = this.f24337d;
        if (cVar != null) {
            this.f24336c = cVar;
            this.f24337d = null;
            C4387b bVar = cVar.f24339a.get();
            if (bVar != null) {
                bVar.mo33542c();
            } else {
                this.f24336c = null;
            }
        }
    }
}
