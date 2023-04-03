package p000;

/* renamed from: o52 */
/* compiled from: FlowableFilter */
public final class o52<T> extends C5753e6<T, T> {

    /* renamed from: e */
    public final iu4<? super T> f32280e;

    /* renamed from: o52$a */
    /* compiled from: FlowableFilter */
    public static final class C6303a<T> extends C6753yz<T, T> {

        /* renamed from: r */
        public final iu4<? super T> f32281r;

        public C6303a(mo0<? super T> mo0, iu4<? super T> iu4) {
            super(mo0);
            this.f32281r = iu4;
        }

        /* renamed from: b */
        public boolean mo43464b(T t) {
            if (this.f35966g) {
                return false;
            }
            if (this.f35967k != 0) {
                return this.f35963a.mo43464b(null);
            }
            try {
                if (!this.f32281r.test(t) || !this.f35963a.mo43464b(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                mo49764d(th);
                return true;
            }
        }

        public void onNext(T t) {
            if (!mo43464b(t)) {
                this.f35964d.request(1);
            }
        }

        public T poll() throws Exception {
            r05<T> r05 = this.f35965e;
            iu4<? super T> iu4 = this.f32281r;
            while (true) {
                T poll = r05.poll();
                if (poll == null) {
                    return null;
                }
                if (iu4.test(poll)) {
                    return poll;
                }
                if (this.f35967k == 2) {
                    r05.request(1);
                }
            }
        }

        public int requestFusion(int i) {
            return mo49765e(i);
        }
    }

    /* renamed from: o52$b */
    /* compiled from: FlowableFilter */
    public static final class C6304b<T> extends C6783zz<T, T> implements mo0<T> {

        /* renamed from: r */
        public final iu4<? super T> f32282r;

        public C6304b(nc6<? super T> nc6, iu4<? super T> iu4) {
            super(nc6);
            this.f32282r = iu4;
        }

        /* renamed from: b */
        public boolean mo43464b(T t) {
            if (this.f36322g) {
                return false;
            }
            if (this.f36323k != 0) {
                this.f36319a.onNext(null);
                return true;
            }
            try {
                boolean test = this.f32282r.test(t);
                if (test) {
                    this.f36319a.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                mo50008d(th);
                return true;
            }
        }

        public void onNext(T t) {
            if (!mo43464b(t)) {
                this.f36320d.request(1);
            }
        }

        public T poll() throws Exception {
            r05<T> r05 = this.f36321e;
            iu4<? super T> iu4 = this.f32282r;
            while (true) {
                T poll = r05.poll();
                if (poll == null) {
                    return null;
                }
                if (iu4.test(poll)) {
                    return poll;
                }
                if (this.f36323k == 2) {
                    r05.request(1);
                }
            }
        }

        public int requestFusion(int i) {
            return mo50009e(i);
        }
    }

    public o52(g52<T> g52, iu4<? super T> iu4) {
        super(g52);
        this.f32280e = iu4;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        if (nc6 instanceof mo0) {
            this.f28406d.mo42759J(new C6303a((mo0) nc6, this.f32280e));
        } else {
            this.f28406d.mo42759J(new C6304b(nc6, this.f32280e));
        }
    }
}
