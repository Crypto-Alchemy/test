package p018io.reactivex.internal.operators.flowable;

/* renamed from: io.reactivex.internal.operators.flowable.a */
/* compiled from: FlowableMap */
public final class C5985a<T, U> extends C5753e6<T, U> {

    /* renamed from: e */
    public final jd2<? super T, ? extends U> f30041e;

    /* renamed from: io.reactivex.internal.operators.flowable.a$a */
    /* compiled from: FlowableMap */
    public static final class C5986a<T, U> extends C6753yz<T, U> {

        /* renamed from: r */
        public final jd2<? super T, ? extends U> f30042r;

        public C5986a(mo0<? super U> mo0, jd2<? super T, ? extends U> jd2) {
            super(mo0);
            this.f30042r = jd2;
        }

        /* renamed from: b */
        public boolean mo43464b(T t) {
            if (this.f35966g) {
                return false;
            }
            try {
                return this.f35963a.mo43464b(af4.m31828d(this.f30042r.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo49764d(th);
                return true;
            }
        }

        public void onNext(T t) {
            if (!this.f35966g) {
                if (this.f35967k != 0) {
                    this.f35963a.onNext(null);
                    return;
                }
                try {
                    this.f35963a.onNext(af4.m31828d(this.f30042r.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo49764d(th);
                }
            }
        }

        public U poll() throws Exception {
            T poll = this.f35965e.poll();
            if (poll != null) {
                return af4.m31828d(this.f30042r.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public int requestFusion(int i) {
            return mo49765e(i);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.a$b */
    /* compiled from: FlowableMap */
    public static final class C5987b<T, U> extends C6783zz<T, U> {

        /* renamed from: r */
        public final jd2<? super T, ? extends U> f30043r;

        public C5987b(nc6<? super U> nc6, jd2<? super T, ? extends U> jd2) {
            super(nc6);
            this.f30043r = jd2;
        }

        public void onNext(T t) {
            if (!this.f36322g) {
                if (this.f36323k != 0) {
                    this.f36319a.onNext(null);
                    return;
                }
                try {
                    this.f36319a.onNext(af4.m31828d(this.f30043r.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo50008d(th);
                }
            }
        }

        public U poll() throws Exception {
            T poll = this.f36321e.poll();
            if (poll != null) {
                return af4.m31828d(this.f30043r.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public int requestFusion(int i) {
            return mo50009e(i);
        }
    }

    public C5985a(g52<T> g52, jd2<? super T, ? extends U> jd2) {
        super(g52);
        this.f30041e = jd2;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super U> nc6) {
        if (nc6 instanceof mo0) {
            this.f28406d.mo42759J(new C5986a((mo0) nc6, this.f30041e));
        } else {
            this.f28406d.mo42759J(new C5987b(nc6, this.f30041e));
        }
    }
}
