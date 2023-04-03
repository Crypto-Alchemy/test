package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p000.qz1;

/* renamed from: q54 */
/* compiled from: NetworkFetcher */
public interface q54<FETCH_STATE extends qz1> {

    /* renamed from: q54$a */
    /* compiled from: NetworkFetcher */
    public interface C3123a {
        /* renamed from: a */
        void mo24447a();

        /* renamed from: b */
        void mo24448b(Throwable th);

        /* renamed from: c */
        void mo24449c(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: a */
    FETCH_STATE mo21974a(vq0<gp1> vq0, wv4 wv4);

    /* renamed from: b */
    boolean mo18383b(FETCH_STATE fetch_state);

    /* renamed from: c */
    Map<String, String> mo21975c(FETCH_STATE fetch_state, int i);

    /* renamed from: d */
    void mo21976d(FETCH_STATE fetch_state, C3123a aVar);

    /* renamed from: e */
    void mo21977e(FETCH_STATE fetch_state, int i);
}
