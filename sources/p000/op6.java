package p000;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: op6 */
/* compiled from: ThrottlingProducer */
public class op6<T> implements vv4<T> {

    /* renamed from: a */
    public final vv4<T> f15961a;

    /* renamed from: b */
    public final int f15962b;

    /* renamed from: c */
    public int f15963c = 0;

    /* renamed from: d */
    public final ConcurrentLinkedQueue<Pair<vq0<T>, wv4>> f15964d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    public final Executor f15965e;

    /* renamed from: op6$b */
    /* compiled from: ThrottlingProducer */
    public class C2980b extends sb1<T, T> {

        /* renamed from: op6$b$a */
        /* compiled from: ThrottlingProducer */
        public class C2981a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Pair f15967a;

            public C2981a(Pair pair) {
                this.f15967a = pair;
            }

            public void run() {
                op6 op6 = op6.this;
                Pair pair = this.f15967a;
                op6.mo24036e((vq0) pair.first, (wv4) pair.second);
            }
        }

        /* renamed from: g */
        public void mo13424g() {
            mo25710p().mo27292a();
            mo24037q();
        }

        /* renamed from: h */
        public void mo11351h(Throwable th) {
            mo25710p().mo27293b(th);
            mo24037q();
        }

        /* renamed from: i */
        public void mo11352i(T t, int i) {
            mo25710p().mo27294c(t, i);
            if (C3766zx.m31566e(i)) {
                mo24037q();
            }
        }

        /* renamed from: q */
        public final void mo24037q() {
            Pair pair;
            synchronized (op6.this) {
                pair = (Pair) op6.this.f15964d.poll();
                if (pair == null) {
                    op6.m23941c(op6.this);
                }
            }
            if (pair != null) {
                op6.this.f15965e.execute(new C2981a(pair));
            }
        }

        public C2980b(vq0<T> vq0) {
            super(vq0);
        }
    }

    public op6(int i, Executor executor, vv4<T> vv4) {
        this.f15962b = i;
        this.f15965e = (Executor) au4.m10792g(executor);
        this.f15961a = (vv4) au4.m10792g(vv4);
    }

    /* renamed from: c */
    public static /* synthetic */ int m23941c(op6 op6) {
        int i = op6.f15963c;
        op6.f15963c = i - 1;
        return i;
    }

    /* renamed from: a */
    public void mo11350a(vq0<T> vq0, wv4 wv4) {
        boolean z;
        wv4.mo20281g().mo11176k(wv4, "ThrottlingProducer");
        synchronized (this) {
            int i = this.f15963c;
            z = true;
            if (i >= this.f15962b) {
                this.f15964d.add(Pair.create(vq0, wv4));
            } else {
                this.f15963c = i + 1;
                z = false;
            }
        }
        if (!z) {
            mo24036e(vq0, wv4);
        }
    }

    /* renamed from: e */
    public void mo24036e(vq0<T> vq0, wv4 wv4) {
        wv4.mo20281g().mo11170a(wv4, "ThrottlingProducer", (Map<String, String>) null);
        this.f15961a.mo11350a(new C2980b(vq0), wv4);
    }
}
