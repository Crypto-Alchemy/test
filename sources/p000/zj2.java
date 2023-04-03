package p000;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: zj2 */
/* compiled from: GsonRequestBodyConverter */
public final class zj2<T> implements pt0<T, RequestBody> {

    /* renamed from: c */
    public static final MediaType f46400c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f46401d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Gson f46402a;

    /* renamed from: b */
    public final TypeAdapter<T> f46403b;

    public zj2(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f46402a = gson;
        this.f46403b = typeAdapter;
    }

    /* renamed from: b */
    public RequestBody mo50216a(T t) throws IOException {
        m40 m40 = new m40();
        JsonWriter newJsonWriter = this.f46402a.newJsonWriter(new OutputStreamWriter(m40.mo56073n1(), f46401d));
        this.f46403b.write(newJsonWriter, t);
        newJsonWriter.close();
        return RequestBody.create(f46400c, m40.mo56042V0());
    }
}
