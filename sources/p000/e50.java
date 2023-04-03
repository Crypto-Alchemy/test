package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.pt0;

/* renamed from: e50 */
/* compiled from: BuiltInConverters */
public final class e50 extends pt0.C9195a {

    /* renamed from: a */
    public boolean f37476a = true;

    /* renamed from: e50$a */
    /* compiled from: BuiltInConverters */
    public static final class C7020a implements pt0<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C7020a f37477a = new C7020a();

        /* renamed from: b */
        public ResponseBody mo50216a(ResponseBody responseBody) throws IOException {
            try {
                return t77.m72170a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: e50$b */
    /* compiled from: BuiltInConverters */
    public static final class C7021b implements pt0<RequestBody, RequestBody> {

        /* renamed from: a */
        public static final C7021b f37478a = new C7021b();

        /* renamed from: b */
        public RequestBody mo50216a(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: e50$c */
    /* compiled from: BuiltInConverters */
    public static final class C7022c implements pt0<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C7022c f37479a = new C7022c();

        /* renamed from: b */
        public ResponseBody mo50216a(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: e50$d */
    /* compiled from: BuiltInConverters */
    public static final class C7023d implements pt0<Object, String> {

        /* renamed from: a */
        public static final C7023d f37480a = new C7023d();

        /* renamed from: b */
        public String mo50216a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: e50$e */
    /* compiled from: BuiltInConverters */
    public static final class C7024e implements pt0<ResponseBody, r37> {

        /* renamed from: a */
        public static final C7024e f37481a = new C7024e();

        /* renamed from: b */
        public r37 mo50216a(ResponseBody responseBody) {
            responseBody.close();
            return r37.f33317a;
        }
    }

    /* renamed from: e50$f */
    /* compiled from: BuiltInConverters */
    public static final class C7025f implements pt0<ResponseBody, Void> {

        /* renamed from: a */
        public static final C7025f f37482a = new C7025f();

        /* renamed from: b */
        public Void mo50216a(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    /* renamed from: c */
    public pt0<?, RequestBody> mo51276c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, og5 og5) {
        if (RequestBody.class.isAssignableFrom(t77.m72177h(type))) {
            return C7021b.f37478a;
        }
        return null;
    }

    /* renamed from: d */
    public pt0<ResponseBody, ?> mo51277d(Type type, Annotation[] annotationArr, og5 og5) {
        if (type == ResponseBody.class) {
            if (t77.m72181l(annotationArr, xa6.class)) {
                return C7022c.f37479a;
            }
            return C7020a.f37477a;
        } else if (type == Void.class) {
            return C7025f.f37482a;
        } else {
            if (!this.f37476a || type != r37.class) {
                return null;
            }
            try {
                return C7024e.f37481a;
            } catch (NoClassDefFoundError unused) {
                this.f37476a = false;
                return null;
            }
        }
    }
}
