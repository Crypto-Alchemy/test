package p000;

import p018io.reactivex.exceptions.CompositeException;

/* renamed from: j52 */
/* compiled from: FlowableDoOnEach */
public final class j52<T> extends C5753e6<T, T> {

    /* renamed from: e */
    public final wq0<? super T> f30217e;

    /* renamed from: g */
    public final wq0<? super Throwable> f30218g;

    /* renamed from: k */
    public final C3803a9 f30219k;

    /* renamed from: r */
    public final C3803a9 f30220r;

    /* renamed from: j52$a */
    /* compiled from: FlowableDoOnEach */
    public static final class C6020a<T> extends C6753yz<T, T> {

        /* renamed from: r */
        public final wq0<? super T> f30221r;

        /* renamed from: s */
        public final wq0<? super Throwable> f30222s;

        /* renamed from: x */
        public final C3803a9 f30223x;

        /* renamed from: y */
        public final C3803a9 f30224y;

        public C6020a(mo0<? super T> mo0, wq0<? super T> wq0, wq0<? super Throwable> wq02, C3803a9 a9Var, C3803a9 a9Var2) {
            super(mo0);
            this.f30221r = wq0;
            this.f30222s = wq02;
            this.f30223x = a9Var;
            this.f30224y = a9Var2;
        }

        /* renamed from: b */
        public boolean mo43464b(T t) {
            if (this.f35966g) {
                return false;
            }
            try {
                this.f30221r.accept(t);
                return this.f35963a.mo43464b(t);
            } catch (Throwable th) {
                mo49764d(th);
                return false;
            }
        }

        public void onComplete() {
            if (!this.f35966g) {
                try {
                    this.f30223x.run();
                    this.f35966g = true;
                    this.f35963a.onComplete();
                    try {
                        this.f30224y.run();
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        ti5.m52312m(th);
                    }
                } catch (Throwable th2) {
                    mo49764d(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f35966g) {
                ti5.m52312m(th);
                return;
            }
            boolean z = true;
            this.f35966g = true;
            try {
                this.f30222s.accept(th);
            } catch (Throwable th2) {
                ou1.m49570a(th2);
                this.f35963a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f35963a.onError(th);
            }
            try {
                this.f30224y.run();
            } catch (Throwable th3) {
                ou1.m49570a(th3);
                ti5.m52312m(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f35966g) {
                if (this.f35967k != 0) {
                    this.f35963a.onNext(null);
                    return;
                }
                try {
                    this.f30221r.accept(t);
                    this.f35963a.onNext(t);
                } catch (Throwable th) {
                    mo49764d(th);
                }
            }
        }

        public T poll() throws Exception {
            try {
                T poll = this.f35965e.poll();
                if (poll != null) {
                    try {
                        this.f30221r.accept(poll);
                        this.f30224y.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f35967k == 1) {
                    this.f30223x.run();
                    this.f30224y.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public int requestFusion(int i) {
            return mo49765e(i);
        }
    }

    /* renamed from: j52$b */
    /* compiled from: FlowableDoOnEach */
    public static final class C6021b<T> extends C6783zz<T, T> {

        /* renamed from: r */
        public final wq0<? super T> f30225r;

        /* renamed from: s */
        public final wq0<? super Throwable> f30226s;

        /* renamed from: x */
        public final C3803a9 f30227x;

        /* renamed from: y */
        public final C3803a9 f30228y;

        public C6021b(nc6<? super T> nc6, wq0<? super T> wq0, wq0<? super Throwable> wq02, C3803a9 a9Var, C3803a9 a9Var2) {
            super(nc6);
            this.f30225r = wq0;
            this.f30226s = wq02;
            this.f30227x = a9Var;
            this.f30228y = a9Var2;
        }

        public void onComplete() {
            if (!this.f36322g) {
                try {
                    this.f30227x.run();
                    this.f36322g = true;
                    this.f36319a.onComplete();
                    try {
                        this.f30228y.run();
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        ti5.m52312m(th);
                    }
                } catch (Throwable th2) {
                    mo50008d(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f36322g) {
                ti5.m52312m(th);
                return;
            }
            boolean z = true;
            this.f36322g = true;
            try {
                this.f30226s.accept(th);
            } catch (Throwable th2) {
                ou1.m49570a(th2);
                this.f36319a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f36319a.onError(th);
            }
            try {
                this.f30228y.run();
            } catch (Throwable th3) {
                ou1.m49570a(th3);
                ti5.m52312m(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f36322g) {
                if (this.f36323k != 0) {
                    this.f36319a.onNext(null);
                    return;
                }
                try {
                    this.f30225r.accept(t);
                    this.f36319a.onNext(t);
                } catch (Throwable th) {
                    mo50008d(th);
                }
            }
        }

        public T poll() throws Exception {
            try {
                T poll = this.f36321e.poll();
                if (poll != null) {
                    try {
                        this.f30225r.accept(poll);
                        this.f30228y.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f36323k == 1) {
                    this.f30227x.run();
                    this.f30228y.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        public int requestFusion(int i) {
            return mo50009e(i);
        }
    }

    public j52(g52<T> g52, wq0<? super T> wq0, wq0<? super Throwable> wq02, C3803a9 a9Var, C3803a9 a9Var2) {
        super(g52);
        this.f30217e = wq0;
        this.f30218g = wq02;
        this.f30219k = a9Var;
        this.f30220r = a9Var2;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        if (nc6 instanceof mo0) {
            this.f28406d.mo42759J(new C6020a((mo0) nc6, this.f30217e, this.f30218g, this.f30219k, this.f30220r));
            return;
        }
        this.f28406d.mo42759J(new C6021b(nc6, this.f30217e, this.f30218g, this.f30219k, this.f30220r));
    }
}
