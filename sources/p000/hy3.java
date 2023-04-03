package p000;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import okhttp3.ResponseBody;
import okio.ByteString;

/* renamed from: hy3 */
/* compiled from: MoshiResponseBodyConverter */
public final class hy3<T> implements pt0<ResponseBody, T> {

    /* renamed from: b */
    public static final ByteString f38285b = ByteString.decodeHex("EFBBBF");

    /* renamed from: a */
    public final C5391d<T> f38286a;

    public hy3(C5391d<T> dVar) {
        this.f38286a = dVar;
    }

    /* renamed from: b */
    public T mo50216a(ResponseBody responseBody) throws IOException {
        w40 source = responseBody.source();
        try {
            ByteString byteString = f38285b;
            if (source.mo56046a0(0, byteString)) {
                source.skip((long) byteString.size());
            }
            JsonReader p = JsonReader.m41502p(source);
            T b = this.f38286a.mo39346b(p);
            if (p.mo39290q() == JsonReader.Token.END_DOCUMENT) {
                return b;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
