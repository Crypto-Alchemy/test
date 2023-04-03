package p000;

/* renamed from: py */
/* compiled from: BaseDataSubscriber */
public abstract class C3102py<T> implements e21<T> {
    /* renamed from: b */
    public void mo18427b(z11<T> z11) {
        try {
            mo11418e(z11);
        } finally {
            z11.close();
        }
    }

    /* renamed from: c */
    public void mo18428c(z11<T> z11) {
    }

    /* renamed from: d */
    public void mo18429d(z11<T> z11) {
        boolean b = z11.mo13190b();
        try {
            mo11419f(z11);
        } finally {
            if (b) {
                z11.close();
            }
        }
    }

    /* renamed from: e */
    public abstract void mo11418e(z11<T> z11);

    /* renamed from: f */
    public abstract void mo11419f(z11<T> z11);
}
