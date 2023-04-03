package p000;

/* renamed from: qg5 */
/* compiled from: RetrofitZendeskCallbackAdapter */
public class qg5<E, F> implements p90<E> {

    /* renamed from: c */
    public static final C6410b f33093c = new C6409a();

    /* renamed from: a */
    public final op7<F> f33094a;

    /* renamed from: b */
    public final C6410b<E, F> f33095b;

    /* renamed from: qg5$a */
    /* compiled from: RetrofitZendeskCallbackAdapter */
    public static final class C6409a<E> implements C6410b<E, E> {
        public E extract(E e) {
            return e;
        }
    }

    /* renamed from: qg5$b */
    /* compiled from: RetrofitZendeskCallbackAdapter */
    public interface C6410b<E, F> {
        F extract(E e);
    }

    public qg5(op7<F> op7, C6410b<E, F> bVar) {
        this.f33094a = op7;
        this.f33095b = bVar;
    }

    /* renamed from: a */
    public void mo47103a(k90<E> k90, Throwable th) {
        op7<F> op7 = this.f33094a;
        if (op7 != null) {
            op7.onError(pg5.m49942b(th));
        }
    }

    /* renamed from: b */
    public void mo47104b(k90<E> k90, bg5<E> bg5) {
        if (this.f33094a == null) {
            return;
        }
        if (bg5.mo50581e()) {
            this.f33094a.onSuccess(this.f33095b.extract(bg5.mo50578a()));
        } else {
            this.f33094a.onError(pg5.m49941a(bg5));
        }
    }

    public qg5(op7<F> op7) {
        this(op7, f33093c);
    }
}
