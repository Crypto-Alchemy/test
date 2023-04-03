package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: nk3 */
/* compiled from: LogResponse */
public abstract class nk3 {
    /* renamed from: a */
    public static nk3 m48814a(long j) {
        return new C5939hv(j);
    }

    /* renamed from: b */
    public static nk3 m48815b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m48814a(Long.parseLong(jsonReader.nextString()));
                } else {
                    nk3 a = m48814a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo43397c();
}
