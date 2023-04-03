package p000;

/* renamed from: i52 */
/* compiled from: FlowableDistinctUntilChanged */
public final class i52<T, K> extends C5753e6<T, T> {

    /* renamed from: e */
    public final jd2<? super T, K> f29808e;

    /* renamed from: g */
    public final e10<? super K, ? super K> f29809g;

    /* renamed from: i52$a */
    /* compiled from: FlowableDistinctUntilChanged */
    public static final class C5944a<T, K> extends C6753yz<T, T> {

        /* renamed from: r */
        public final jd2<? super T, K> f29810r;

        /* renamed from: s */
        public final e10<? super K, ? super K> f29811s;

        /* renamed from: x */
        public K f29812x;

        /* renamed from: y */
        public boolean f29813y;

        public C5944a(mo0<? super T> mo0, jd2<? super T, K> jd2, e10<? super K, ? super K> e10) {
            super(mo0);
            this.f29810r = jd2;
            this.f29811s = e10;
        }

        /* renamed from: b */
        public boolean mo43464b(T t) {
            if (this.f35966g) {
                return false;
            }
            if (this.f35967k != 0) {
                return this.f35963a.mo43464b(t);
            }
            try {
                K apply = this.f29810r.apply(t);
                if (this.f29813y) {
                    boolean a = this.f29811s.mo28956a(this.f29812x, apply);
                    this.f29812x = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f29813y = true;
                    this.f29812x = apply;
                }
                this.f35963a.onNext(t);
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
            while (true) {
                T poll = this.f35965e.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f29810r.apply(poll);
                if (!this.f29813y) {
                    this.f29813y = true;
                    this.f29812x = apply;
                    return poll;
                } else if (!this.f29811s.mo28956a(this.f29812x, apply)) {
                    this.f29812x = apply;
                    return poll;
                } else {
                    this.f29812x = apply;
                    if (this.f35967k != 1) {
                        this.f35964d.request(1);
                    }
                }
            }
        }

        public int requestFusion(int i) {
            return mo49765e(i);
        }
    }

    /* renamed from: i52$b */
    /* compiled from: FlowableDistinctUntilChanged */
    public static final class C5945b<T, K> extends C6783zz<T, T> implements mo0<T> {

        /* renamed from: r */
        public final jd2<? super T, K> f29814r;

        /* renamed from: s */
        public final e10<? super K, ? super K> f29815s;

        /* renamed from: x */
        public K f29816x;

        /* renamed from: y */
        public boolean f29817y;

        public C5945b(nc6<? super T> nc6, jd2<? super T, K> jd2, e10<? super K, ? super K> e10) {
            super(nc6);
            this.f29814r = jd2;
            this.f29815s = e10;
        }

        /* renamed from: b */
        public boolean mo43464b(T t) {
            if (this.f36322g) {
                return false;
            }
            if (this.f36323k != 0) {
                this.f36319a.onNext(t);
                return true;
            }
            try {
                K apply = this.f29814r.apply(t);
                if (this.f29817y) {
                    boolean a = this.f29815s.mo28956a(this.f29816x, apply);
                    this.f29816x = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f29817y = true;
                    this.f29816x = apply;
                }
                this.f36319a.onNext(t);
                return true;
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
            while (true) {
                T poll = this.f36321e.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f29814r.apply(poll);
                if (!this.f29817y) {
                    this.f29817y = true;
                    this.f29816x = apply;
                    return poll;
                } else if (!this.f29815s.mo28956a(this.f29816x, apply)) {
                    this.f29816x = apply;
                    return poll;
                } else {
                    this.f29816x = apply;
                    if (this.f36323k != 1) {
                        this.f36320d.request(1);
                    }
                }
            }
        }

        public int requestFusion(int i) {
            return mo50009e(i);
        }
    }

    public i52(g52<T> g52, jd2<? super T, K> jd2, e10<? super K, ? super K> e10) {
        super(g52);
        this.f29808e = jd2;
        this.f29809g = e10;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        if (nc6 instanceof mo0) {
            this.f28406d.mo42759J(new C5944a((mo0) nc6, this.f29808e, this.f29809g));
        } else {
            this.f28406d.mo42759J(new C5945b(nc6, this.f29808e, this.f29809g));
        }
    }
}
