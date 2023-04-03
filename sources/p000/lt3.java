package p000;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: lt3 */
/* compiled from: MenuHostHelper */
public class lt3 {

    /* renamed from: a */
    public final Runnable f14726a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<eu3> f14727b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<eu3, C2788a> f14728c = new HashMap();

    /* renamed from: lt3$a */
    /* compiled from: MenuHostHelper */
    public static class C2788a {

        /* renamed from: a */
        public final Lifecycle f14729a;

        /* renamed from: b */
        public C0715e f14730b;

        public C2788a(Lifecycle lifecycle, C0715e eVar) {
            this.f14729a = lifecycle;
            this.f14730b = eVar;
            lifecycle.mo6295a(eVar);
        }

        /* renamed from: a */
        public void mo22975a() {
            this.f14729a.mo6297c(this.f14730b);
            this.f14730b = null;
        }
    }

    public lt3(Runnable runnable) {
        this.f14726a = runnable;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m21854f(eu3 eu3, ug3 ug3, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            mo22974l(eu3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m21855g(Lifecycle.State state, eu3 eu3, ug3 ug3, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            mo22967c(eu3);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            mo22974l(eu3);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f14727b.remove(eu3);
            this.f14726a.run();
        }
    }

    /* renamed from: c */
    public void mo22967c(eu3 eu3) {
        this.f14727b.add(eu3);
        this.f14726a.run();
    }

    /* renamed from: d */
    public void mo22968d(eu3 eu3, ug3 ug3) {
        mo22967c(eu3);
        Lifecycle lifecycle = ug3.getLifecycle();
        C2788a remove = this.f14728c.remove(eu3);
        if (remove != null) {
            remove.mo22975a();
        }
        this.f14728c.put(eu3, new C2788a(lifecycle, new jt3(this, eu3)));
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public void mo22969e(eu3 eu3, ug3 ug3, Lifecycle.State state) {
        Lifecycle lifecycle = ug3.getLifecycle();
        C2788a remove = this.f14728c.remove(eu3);
        if (remove != null) {
            remove.mo22975a();
        }
        this.f14728c.put(eu3, new C2788a(lifecycle, new kt3(this, state, eu3)));
    }

    /* renamed from: h */
    public void mo22970h(Menu menu, MenuInflater menuInflater) {
        Iterator<eu3> it = this.f14727b.iterator();
        while (it.hasNext()) {
            it.next().mo6038d(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void mo22971i(Menu menu) {
        Iterator<eu3> it = this.f14727b.iterator();
        while (it.hasNext()) {
            it.next().mo6035a(menu);
        }
    }

    /* renamed from: j */
    public boolean mo22972j(MenuItem menuItem) {
        Iterator<eu3> it = this.f14727b.iterator();
        while (it.hasNext()) {
            if (it.next().mo6037c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo22973k(Menu menu) {
        Iterator<eu3> it = this.f14727b.iterator();
        while (it.hasNext()) {
            it.next().mo6036b(menu);
        }
    }

    /* renamed from: l */
    public void mo22974l(eu3 eu3) {
        this.f14727b.remove(eu3);
        C2788a remove = this.f14728c.remove(eu3);
        if (remove != null) {
            remove.mo22975a();
        }
        this.f14726a.run();
    }
}
