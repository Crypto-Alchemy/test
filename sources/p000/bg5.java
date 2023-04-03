package p000;

import java.util.Objects;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: bg5 */
/* compiled from: Response */
public final class bg5<T> {

    /* renamed from: a */
    public final Response f36805a;

    /* renamed from: b */
    public final T f36806b;

    /* renamed from: c */
    public final ResponseBody f36807c;

    public bg5(Response response, T t, ResponseBody responseBody) {
        this.f36805a = response;
        this.f36806b = t;
        this.f36807c = responseBody;
    }

    /* renamed from: c */
    public static <T> bg5<T> m55958c(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new bg5<>(response, (Object) null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: h */
    public static <T> bg5<T> m55959h(T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new bg5<>(response, t, (ResponseBody) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T mo50578a() {
        return this.f36806b;
    }

    /* renamed from: b */
    public int mo50579b() {
        return this.f36805a.code();
    }

    /* renamed from: d */
    public ResponseBody mo50580d() {
        return this.f36807c;
    }

    /* renamed from: e */
    public boolean mo50581e() {
        return this.f36805a.isSuccessful();
    }

    /* renamed from: f */
    public String mo50582f() {
        return this.f36805a.message();
    }

    /* renamed from: g */
    public Response mo50583g() {
        return this.f36805a;
    }

    public String toString() {
        return this.f36805a.toString();
    }
}
