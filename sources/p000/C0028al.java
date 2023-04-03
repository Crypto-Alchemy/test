package p000;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: al */
/* compiled from: AnimationHandler */
public class C0028al {

    /* renamed from: g */
    public static final ThreadLocal<C0028al> f169g = new ThreadLocal<>();

    /* renamed from: a */
    public final y16<C0030b, Long> f170a = new y16<>();

    /* renamed from: b */
    public final ArrayList<C0030b> f171b = new ArrayList<>();

    /* renamed from: c */
    public final C0029a f172c = new C0029a();

    /* renamed from: d */
    public C0031c f173d;

    /* renamed from: e */
    public long f174e = 0;

    /* renamed from: f */
    public boolean f175f = false;

    /* renamed from: al$a */
    /* compiled from: AnimationHandler */
    public class C0029a {
        public C0029a() {
        }

        /* renamed from: a */
        public void mo353a() {
            C0028al.this.f174e = SystemClock.uptimeMillis();
            C0028al alVar = C0028al.this;
            alVar.mo349c(alVar.f174e);
            if (C0028al.this.f171b.size() > 0) {
                C0028al.this.mo350e().mo355a();
            }
        }
    }

    /* renamed from: al$b */
    /* compiled from: AnimationHandler */
    public interface C0030b {
        /* renamed from: a */
        boolean mo354a(long j);
    }

    /* renamed from: al$c */
    /* compiled from: AnimationHandler */
    public static abstract class C0031c {

        /* renamed from: a */
        public final C0029a f177a;

        public C0031c(C0029a aVar) {
            this.f177a = aVar;
        }

        /* renamed from: a */
        public abstract void mo355a();
    }

    /* renamed from: al$d */
    /* compiled from: AnimationHandler */
    public static class C0032d extends C0031c {

        /* renamed from: b */
        public final Choreographer f178b = Choreographer.getInstance();

        /* renamed from: c */
        public final Choreographer.FrameCallback f179c = new C0033a();

        /* renamed from: al$d$a */
        /* compiled from: AnimationHandler */
        public class C0033a implements Choreographer.FrameCallback {
            public C0033a() {
            }

            public void doFrame(long j) {
                C0032d.this.f177a.mo353a();
            }
        }

        public C0032d(C0029a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo355a() {
            this.f178b.postFrameCallback(this.f179c);
        }
    }

    /* renamed from: d */
    public static C0028al m340d() {
        ThreadLocal<C0028al> threadLocal = f169g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0028al());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public void mo347a(C0030b bVar, long j) {
        if (this.f171b.size() == 0) {
            mo350e().mo355a();
        }
        if (!this.f171b.contains(bVar)) {
            this.f171b.add(bVar);
        }
        if (j > 0) {
            this.f170a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final void mo348b() {
        if (this.f175f) {
            for (int size = this.f171b.size() - 1; size >= 0; size--) {
                if (this.f171b.get(size) == null) {
                    this.f171b.remove(size);
                }
            }
            this.f175f = false;
        }
    }

    /* renamed from: c */
    public void mo349c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f171b.size(); i++) {
            C0030b bVar = this.f171b.get(i);
            if (bVar != null && mo351f(bVar, uptimeMillis)) {
                bVar.mo354a(j);
            }
        }
        mo348b();
    }

    /* renamed from: e */
    public C0031c mo350e() {
        if (this.f173d == null) {
            this.f173d = new C0032d(this.f172c);
        }
        return this.f173d;
    }

    /* renamed from: f */
    public final boolean mo351f(C0030b bVar, long j) {
        Long l = this.f170a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f170a.remove(bVar);
        return true;
    }

    /* renamed from: g */
    public void mo352g(C0030b bVar) {
        this.f170a.remove(bVar);
        int indexOf = this.f171b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f171b.set(indexOf, (Object) null);
            this.f175f = true;
        }
    }
}
