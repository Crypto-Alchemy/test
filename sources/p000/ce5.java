package p000;

import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* renamed from: ce5 */
/* compiled from: RequestBuilder */
public final class ce5 {

    /* renamed from: l */
    public static final char[] f37116l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f37117m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f37118a;

    /* renamed from: b */
    public final HttpUrl f37119b;

    /* renamed from: c */
    public String f37120c;

    /* renamed from: d */
    public HttpUrl.Builder f37121d;

    /* renamed from: e */
    public final Request.Builder f37122e = new Request.Builder();

    /* renamed from: f */
    public final Headers.Builder f37123f;

    /* renamed from: g */
    public MediaType f37124g;

    /* renamed from: h */
    public final boolean f37125h;

    /* renamed from: i */
    public MultipartBody.Builder f37126i;

    /* renamed from: j */
    public FormBody.Builder f37127j;

    /* renamed from: k */
    public RequestBody f37128k;

    /* renamed from: ce5$a */
    /* compiled from: RequestBuilder */
    public static class C6938a extends RequestBody {

        /* renamed from: a */
        public final RequestBody f37129a;

        /* renamed from: b */
        public final MediaType f37130b;

        public C6938a(RequestBody requestBody, MediaType mediaType) {
            this.f37129a = requestBody;
            this.f37130b = mediaType;
        }

        public long contentLength() throws IOException {
            return this.f37129a.contentLength();
        }

        public MediaType contentType() {
            return this.f37130b;
        }

        public void writeTo(v40 v40) throws IOException {
            this.f37129a.writeTo(v40);
        }
    }

    public ce5(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f37118a = str;
        this.f37119b = httpUrl;
        this.f37120c = str2;
        this.f37124g = mediaType;
        this.f37125h = z;
        if (headers != null) {
            this.f37123f = headers.newBuilder();
        } else {
            this.f37123f = new Headers.Builder();
        }
        if (z2) {
            this.f37127j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f37126i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: i */
    public static String m56415i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                m40 m40 = new m40();
                m40.mo56052d0(str, 0, i);
                m56416j(m40, str, i, length, z);
                return m40.mo56048b1();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m56416j(m40 m40, String str, int i, int i2, boolean z) {
        m40 m402 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (m402 == null) {
                        m402 = new m40();
                    }
                    m402.mo56104x0(codePointAt);
                    while (!m402.mo56024I0()) {
                        byte readByte = m402.readByte() & 255;
                        m40.writeByte(37);
                        char[] cArr = f37116l;
                        m40.writeByte(cArr[(readByte >> 4) & 15]);
                        m40.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    m40.mo56104x0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public void mo50874a(String str, String str2, boolean z) {
        if (z) {
            this.f37127j.addEncoded(str, str2);
        } else {
            this.f37127j.add(str, str2);
        }
    }

    /* renamed from: b */
    public void mo50875b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f37124g = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f37123f.add(str, str2);
        }
    }

    /* renamed from: c */
    public void mo50876c(Headers headers) {
        this.f37123f.addAll(headers);
    }

    /* renamed from: d */
    public void mo50877d(Headers headers, RequestBody requestBody) {
        this.f37126i.addPart(headers, requestBody);
    }

    /* renamed from: e */
    public void mo50878e(MultipartBody.Part part) {
        this.f37126i.addPart(part);
    }

    /* renamed from: f */
    public void mo50879f(String str, String str2, boolean z) {
        if (this.f37120c != null) {
            String i = m56415i(str2, z);
            String str3 = this.f37120c;
            String replace = str3.replace("{" + str + "}", i);
            if (!f37117m.matcher(replace).matches()) {
                this.f37120c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    public void mo50880g(String str, String str2, boolean z) {
        String str3 = this.f37120c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f37119b.newBuilder(str3);
            this.f37121d = newBuilder;
            if (newBuilder != null) {
                this.f37120c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f37119b + ", Relative: " + this.f37120c);
            }
        }
        if (z) {
            this.f37121d.addEncodedQueryParameter(str, str2);
        } else {
            this.f37121d.addQueryParameter(str, str2);
        }
    }

    /* renamed from: h */
    public <T> void mo50881h(Class<T> cls, T t) {
        this.f37122e.tag(cls, t);
    }

    /* renamed from: k */
    public Request.Builder mo50882k() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.f37121d;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f37119b.resolve(this.f37120c);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f37119b + ", Relative: " + this.f37120c);
            }
        }
        C6938a aVar = this.f37128k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f37127j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f37126i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f37125h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f37124g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new C6938a(aVar, mediaType);
            } else {
                this.f37123f.add("Content-Type", mediaType.toString());
            }
        }
        return this.f37122e.url(httpUrl).headers(this.f37123f.build()).method(this.f37118a, aVar);
    }

    /* renamed from: l */
    public void mo50883l(RequestBody requestBody) {
        this.f37128k = requestBody;
    }

    /* renamed from: m */
    public void mo50884m(Object obj) {
        this.f37120c = obj.toString();
    }
}
