package p000;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: r11 */
/* compiled from: DataFetcher */
public interface r11<T> {

    /* renamed from: r11$a */
    /* compiled from: DataFetcher */
    public interface C3179a<T> {
        /* renamed from: c */
        void mo12485c(Exception exc);

        /* renamed from: f */
        void mo12487f(T t);
    }

    /* renamed from: a */
    Class<T> mo11939a();

    /* renamed from: b */
    void mo11940b();

    void cancel();

    /* renamed from: d */
    void mo11943d(Priority priority, C3179a<? super T> aVar);

    /* renamed from: e */
    DataSource mo11944e();
}
