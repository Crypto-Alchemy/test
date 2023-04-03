package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1294g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: AsyncDifferConfig */
public final class C1272c<T> {

    /* renamed from: a */
    public final Executor f6605a;

    /* renamed from: b */
    public final Executor f6606b;

    /* renamed from: c */
    public final C1294g.C1300f<T> f6607c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* compiled from: AsyncDifferConfig */
    public static final class C1273a<T> {

        /* renamed from: d */
        public static final Object f6608d = new Object();

        /* renamed from: e */
        public static Executor f6609e;

        /* renamed from: a */
        public Executor f6610a;

        /* renamed from: b */
        public Executor f6611b;

        /* renamed from: c */
        public final C1294g.C1300f<T> f6612c;

        public C1273a(C1294g.C1300f<T> fVar) {
            this.f6612c = fVar;
        }

        /* renamed from: a */
        public C1272c<T> mo9693a() {
            if (this.f6611b == null) {
                synchronized (f6608d) {
                    if (f6609e == null) {
                        f6609e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f6611b = f6609e;
            }
            return new C1272c<>(this.f6610a, this.f6611b, this.f6612c);
        }
    }

    public C1272c(Executor executor, Executor executor2, C1294g.C1300f<T> fVar) {
        this.f6605a = executor;
        this.f6606b = executor2;
        this.f6607c = fVar;
    }

    /* renamed from: a */
    public Executor mo9690a() {
        return this.f6606b;
    }

    /* renamed from: b */
    public C1294g.C1300f<T> mo9691b() {
        return this.f6607c;
    }

    /* renamed from: c */
    public Executor mo9692c() {
        return this.f6605a;
    }
}
