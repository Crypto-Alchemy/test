package p000;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

/* renamed from: xb4 */
/* compiled from: NullSafeJsonAdapter */
public final class xb4<T> extends C5391d<T> {

    /* renamed from: a */
    public final C5391d<T> f35591a;

    public xb4(C5391d<T> dVar) {
        this.f35591a = dVar;
    }

    /* renamed from: b */
    public T mo39346b(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo39290q() == JsonReader.Token.NULL) {
            return jsonReader.mo39288m();
        }
        return this.f35591a.mo39346b(jsonReader);
    }

    /* renamed from: j */
    public void mo39347j(q73 q73, T t) throws IOException {
        if (t == null) {
            q73.mo39400k();
        } else {
            this.f35591a.mo39347j(q73, t);
        }
    }

    public String toString() {
        return this.f35591a + ".nullSafe()";
    }
}
