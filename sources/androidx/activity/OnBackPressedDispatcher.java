package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f360a;

    /* renamed from: b */
    public final ArrayDeque<yg4> f361b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C0715e, la0 {

        /* renamed from: a */
        public final Lifecycle f362a;

        /* renamed from: d */
        public final yg4 f363d;

        /* renamed from: e */
        public la0 f364e;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, yg4 yg4) {
            this.f362a = lifecycle;
            this.f363d = yg4;
            lifecycle.mo6295a(this);
        }

        public void cancel() {
            this.f362a.mo6297c(this);
            this.f363d.mo28063e(this);
            la0 la0 = this.f364e;
            if (la0 != null) {
                la0.cancel();
                this.f364e = null;
            }
        }

        /* renamed from: f */
        public void mo907f(ug3 ug3, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f364e = OnBackPressedDispatcher.this.mo913b(this.f363d);
            } else if (event == Lifecycle.Event.ON_STOP) {
                la0 la0 = this.f364e;
                if (la0 != null) {
                    la0.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0101a implements la0 {

        /* renamed from: a */
        public final yg4 f366a;

        public C0101a(yg4 yg4) {
            this.f366a = yg4;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f361b.remove(this.f366a);
            this.f366a.mo28063e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f360a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo912a(ug3 ug3, yg4 yg4) {
        Lifecycle lifecycle = ug3.getLifecycle();
        if (lifecycle.mo6296b() != Lifecycle.State.DESTROYED) {
            yg4.mo28060a(new LifecycleOnBackPressedCancellable(lifecycle, yg4));
        }
    }

    /* renamed from: b */
    public la0 mo913b(yg4 yg4) {
        this.f361b.add(yg4);
        C0101a aVar = new C0101a(yg4);
        yg4.mo28060a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public boolean mo914c() {
        Iterator<yg4> descendingIterator = this.f361b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().mo28061c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo915d() {
        Iterator<yg4> descendingIterator = this.f361b.descendingIterator();
        while (descendingIterator.hasNext()) {
            yg4 next = descendingIterator.next();
            if (next.mo28061c()) {
                next.mo6034b();
                return;
            }
        }
        Runnable runnable = this.f360a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
