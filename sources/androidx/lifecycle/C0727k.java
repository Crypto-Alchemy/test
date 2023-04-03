package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.k */
/* compiled from: ServiceLifecycleDispatcher */
public class C0727k {

    /* renamed from: a */
    public final C0716f f3982a;

    /* renamed from: b */
    public final Handler f3983b = new Handler();

    /* renamed from: c */
    public C0728a f3984c;

    /* renamed from: androidx.lifecycle.k$a */
    /* compiled from: ServiceLifecycleDispatcher */
    public static class C0728a implements Runnable {

        /* renamed from: a */
        public final C0716f f3985a;

        /* renamed from: d */
        public final Lifecycle.Event f3986d;

        /* renamed from: e */
        public boolean f3987e = false;

        public C0728a(C0716f fVar, Lifecycle.Event event) {
            this.f3985a = fVar;
            this.f3986d = event;
        }

        public void run() {
            if (!this.f3987e) {
                this.f3985a.mo6389h(this.f3986d);
                this.f3987e = true;
            }
        }
    }

    public C0727k(ug3 ug3) {
        this.f3982a = new C0716f(ug3);
    }

    /* renamed from: a */
    public Lifecycle mo6414a() {
        return this.f3982a;
    }

    /* renamed from: b */
    public void mo6415b() {
        mo6419f(Lifecycle.Event.ON_START);
    }

    /* renamed from: c */
    public void mo6416c() {
        mo6419f(Lifecycle.Event.ON_CREATE);
    }

    /* renamed from: d */
    public void mo6417d() {
        mo6419f(Lifecycle.Event.ON_STOP);
        mo6419f(Lifecycle.Event.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo6418e() {
        mo6419f(Lifecycle.Event.ON_START);
    }

    /* renamed from: f */
    public final void mo6419f(Lifecycle.Event event) {
        C0728a aVar = this.f3984c;
        if (aVar != null) {
            aVar.run();
        }
        C0728a aVar2 = new C0728a(this.f3982a, event);
        this.f3984c = aVar2;
        this.f3983b.postAtFrontOfQueue(aVar2);
    }
}
