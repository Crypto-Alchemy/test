package p000;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: z11 */
/* compiled from: DataSource */
public interface z11<T> {
    /* renamed from: a */
    boolean mo13189a();

    /* renamed from: b */
    boolean mo13190b();

    /* renamed from: c */
    Throwable mo13191c();

    boolean close();

    /* renamed from: d */
    float mo13193d();

    /* renamed from: e */
    void mo13194e(e21<T> e21, Executor executor);

    /* renamed from: f */
    boolean mo13195f();

    Map<String, Object> getExtras();

    T getResult();
}
