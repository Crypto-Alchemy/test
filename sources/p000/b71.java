package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;
import p000.l90;

/* renamed from: b71 */
/* compiled from: DefaultCallAdapterFactory */
public final class b71 extends l90.C7825a {

    /* renamed from: a */
    public final Executor f36696a;

    /* renamed from: b71$a */
    /* compiled from: DefaultCallAdapterFactory */
    public class C6851a implements l90<Object, k90<?>> {

        /* renamed from: a */
        public final /* synthetic */ Type f36697a;

        /* renamed from: b */
        public final /* synthetic */ Executor f36698b;

        public C6851a(Type type, Executor executor) {
            this.f36697a = type;
            this.f36698b = executor;
        }

        /* renamed from: a */
        public Type mo50509a() {
            return this.f36697a;
        }

        /* renamed from: c */
        public k90<Object> mo50510b(k90<Object> k90) {
            Executor executor = this.f36698b;
            if (executor == null) {
                return k90;
            }
            return new C6852b(executor, k90);
        }
    }

    /* renamed from: b71$b */
    /* compiled from: DefaultCallAdapterFactory */
    public static final class C6852b<T> implements k90<T> {

        /* renamed from: a */
        public final Executor f36700a;

        /* renamed from: d */
        public final k90<T> f36701d;

        /* renamed from: b71$b$a */
        /* compiled from: DefaultCallAdapterFactory */
        public class C6853a implements p90<T> {

            /* renamed from: a */
            public final /* synthetic */ p90 f36702a;

            public C6853a(p90 p90) {
                this.f36702a = p90;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m55799e(p90 p90, Throwable th) {
                p90.mo47103a(C6852b.this, th);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m55800f(p90 p90, bg5 bg5) {
                if (C6852b.this.f36701d.isCanceled()) {
                    p90.mo47103a(C6852b.this, new IOException("Canceled"));
                } else {
                    p90.mo47104b(C6852b.this, bg5);
                }
            }

            /* renamed from: a */
            public void mo47103a(k90<T> k90, Throwable th) {
                C6852b.this.f36700a.execute(new d71(this, this.f36702a, th));
            }

            /* renamed from: b */
            public void mo47104b(k90<T> k90, bg5<T> bg5) {
                C6852b.this.f36700a.execute(new c71(this, this.f36702a, bg5));
            }
        }

        public C6852b(Executor executor, k90<T> k90) {
            this.f36700a = executor;
            this.f36701d = k90;
        }

        /* renamed from: X */
        public void mo50512X(p90<T> p90) {
            Objects.requireNonNull(p90, "callback == null");
            this.f36701d.mo50512X(new C6853a(p90));
        }

        public void cancel() {
            this.f36701d.cancel();
        }

        public bg5<T> execute() throws IOException {
            return this.f36701d.execute();
        }

        public boolean isCanceled() {
            return this.f36701d.isCanceled();
        }

        public Request request() {
            return this.f36701d.request();
        }

        public k90<T> clone() {
            return new C6852b(this.f36700a, this.f36701d.clone());
        }
    }

    public b71(Executor executor) {
        this.f36696a = executor;
    }

    /* renamed from: a */
    public l90<?, ?> mo50508a(Type type, Annotation[] annotationArr, og5 og5) {
        Executor executor = null;
        if (l90.C7825a.m63732c(type) != k90.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g = t77.m72176g(0, (ParameterizedType) type);
            if (!t77.m72181l(annotationArr, y36.class)) {
                executor = this.f36696a;
            }
            return new C6851a(g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
