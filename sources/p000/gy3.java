package p000;

import com.squareup.moshi.C5391d;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: gy3 */
/* compiled from: MoshiRequestBodyConverter */
public final class gy3<T> implements pt0<T, RequestBody> {

    /* renamed from: b */
    public static final MediaType f38123b = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: a */
    public final C5391d<T> f38124a;

    public gy3(C5391d<T> dVar) {
        this.f38124a = dVar;
    }

    /* renamed from: b */
    public RequestBody mo50216a(T t) throws IOException {
        m40 m40 = new m40();
        this.f38124a.mo39347j(q73.m50360l(m40), t);
        return RequestBody.create(f38123b, m40.mo56042V0());
    }
}
