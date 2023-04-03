package p000;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;

/* renamed from: ak2 */
/* compiled from: GsonResponseBodyConverter */
public final class ak2<T> implements pt0<ResponseBody, T> {

    /* renamed from: a */
    public final Gson f36481a;

    /* renamed from: b */
    public final TypeAdapter<T> f36482b;

    public ak2(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f36481a = gson;
        this.f36482b = typeAdapter;
    }

    /* renamed from: b */
    public T mo50216a(ResponseBody responseBody) throws IOException {
        JsonReader newJsonReader = this.f36481a.newJsonReader(responseBody.charStream());
        try {
            T read = this.f36482b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
