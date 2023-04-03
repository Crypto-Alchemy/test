package p000;

import java.util.Queue;
import p000.os4;

/* renamed from: uy */
/* compiled from: BaseKeyPool */
public abstract class C3440uy<T extends os4> {

    /* renamed from: a */
    public final Queue<T> f18602a = p67.m24678f(20);

    /* renamed from: a */
    public abstract T mo26938a();

    /* renamed from: b */
    public T mo26939b() {
        T t = (os4) this.f18602a.poll();
        if (t == null) {
            return mo26938a();
        }
        return t;
    }

    /* renamed from: c */
    public void mo26940c(T t) {
        if (this.f18602a.size() < 20) {
            this.f18602a.offer(t);
        }
    }
}
