package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import p000.e87;

/* renamed from: wx */
/* compiled from: BaseAnimation */
public abstract class C6678wx<T extends Animator> {

    /* renamed from: a */
    public long f35461a = 350;

    /* renamed from: b */
    public e87.C5755a f35462b;

    /* renamed from: c */
    public T f35463c;

    public C6678wx(e87.C5755a aVar) {
        this.f35462b = aVar;
        this.f35463c = mo28832a();
    }

    /* renamed from: a */
    public abstract T mo28832a();

    /* renamed from: b */
    public C6678wx mo49306b(long j) {
        this.f35461a = j;
        T t = this.f35463c;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    /* renamed from: c */
    public void mo49307c() {
        T t = this.f35463c;
        if (t != null && t.isStarted()) {
            this.f35463c.end();
        }
    }

    /* renamed from: d */
    public abstract C6678wx mo28833d(float f);

    /* renamed from: e */
    public void mo49308e() {
        T t = this.f35463c;
        if (t != null && !t.isRunning()) {
            this.f35463c.start();
        }
    }
}
