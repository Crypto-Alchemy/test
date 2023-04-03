package java8.util.stream;

/* renamed from: java8.util.stream.h */
/* compiled from: Sink */
public interface C6095h<T> extends xq0<T> {

    /* renamed from: java8.util.stream.h$a */
    /* compiled from: Sink */
    public static abstract class C6096a<T, E_OUT> implements C6095h<T> {

        /* renamed from: a */
        public final C6095h<? super E_OUT> f30452a;

        public C6096a(C6095h<? super E_OUT> hVar) {
            this.f30452a = (C6095h) kf4.m47057e(hVar);
        }

        /* renamed from: e */
        public void mo44326e(long j) {
            this.f30452a.mo44326e(j);
        }

        public void end() {
            this.f30452a.end();
        }

        /* renamed from: f */
        public boolean mo44328f() {
            return this.f30452a.mo44328f();
        }
    }

    /* renamed from: e */
    void mo44326e(long j);

    void end();

    /* renamed from: f */
    boolean mo44328f();
}
