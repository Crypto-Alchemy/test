package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p000.C3418uk;

/* renamed from: wk */
/* compiled from: AnimationBackendDelegateWithInactivityCheck */
public class C3553wk<T extends C3418uk> extends C3491vk<T> {

    /* renamed from: e */
    public final vx3 f19140e;

    /* renamed from: f */
    public final ScheduledExecutorService f19141f;

    /* renamed from: g */
    public boolean f19142g = false;

    /* renamed from: h */
    public long f19143h;

    /* renamed from: i */
    public long f19144i = 2000;

    /* renamed from: j */
    public long f19145j = 1000;

    /* renamed from: k */
    public C3555b f19146k;

    /* renamed from: l */
    public final Runnable f19147l = new C3554a();

    /* renamed from: wk$a */
    /* compiled from: AnimationBackendDelegateWithInactivityCheck */
    public class C3554a implements Runnable {
        public C3554a() {
        }

        public void run() {
            synchronized (C3553wk.this) {
                boolean unused = C3553wk.this.f19142g = false;
                if (!C3553wk.this.mo27550p()) {
                    C3553wk.this.mo27551q();
                } else if (C3553wk.this.f19146k != null) {
                    C3553wk.this.f19146k.mo27407h();
                }
            }
        }
    }

    /* renamed from: wk$b */
    /* compiled from: AnimationBackendDelegateWithInactivityCheck */
    public interface C3555b {
        /* renamed from: h */
        void mo27407h();
    }

    public C3553wk(T t, C3555b bVar, vx3 vx3, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f19146k = bVar;
        this.f19140e = vx3;
        this.f19141f = scheduledExecutorService;
    }

    /* renamed from: n */
    public static <T extends C3418uk> C3491vk<T> m29613n(T t, C3555b bVar, vx3 vx3, ScheduledExecutorService scheduledExecutorService) {
        return new C3553wk(t, bVar, vx3, scheduledExecutorService);
    }

    /* renamed from: o */
    public static <T extends C3418uk & C3555b> C3491vk<T> m29614o(T t, vx3 vx3, ScheduledExecutorService scheduledExecutorService) {
        return m29613n(t, (C3555b) t, vx3, scheduledExecutorService);
    }

    /* renamed from: g */
    public boolean mo26815g(Drawable drawable, Canvas canvas, int i) {
        this.f19143h = this.f19140e.now();
        boolean g = super.mo26815g(drawable, canvas, i);
        mo27551q();
        return g;
    }

    /* renamed from: p */
    public final boolean mo27550p() {
        if (this.f19140e.now() - this.f19143h > this.f19144i) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final synchronized void mo27551q() {
        if (!this.f19142g) {
            this.f19142g = true;
            this.f19141f.schedule(this.f19147l, this.f19145j, TimeUnit.MILLISECONDS);
        }
    }
}
