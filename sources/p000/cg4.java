package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: cg4 */
/* compiled from: OkCacheControl */
public class cg4 {

    /* renamed from: a */
    public C6943d f37134a;

    /* renamed from: b */
    public long f37135b;

    /* renamed from: c */
    public TimeUnit f37136c;

    /* renamed from: d */
    public OkHttpClient.Builder f37137d;

    /* renamed from: e */
    public C6942c f37138e;

    /* renamed from: cg4$a */
    /* compiled from: OkCacheControl */
    public class C6940a implements Interceptor {

        /* renamed from: a */
        public final /* synthetic */ C6945f f37139a;

        /* renamed from: b */
        public final /* synthetic */ C6946g f37140b;

        public C6940a(C6945f fVar, C6946g gVar) {
            this.f37139a = fVar;
            this.f37140b = gVar;
        }

        public Response intercept(Interceptor.Chain chain) throws IOException {
            return this.f37140b.mo50893a(chain.proceed(this.f37139a.mo50896a(chain.request())));
        }
    }

    /* renamed from: cg4$b */
    /* compiled from: OkCacheControl */
    public static class C6941b extends C6946g {

        /* renamed from: a */
        public C6942c f37141a;

        public C6941b(C6942c cVar) {
            super();
            this.f37141a = cVar;
        }

        /* renamed from: a */
        public Response mo50893a(Response response) {
            Response.Builder removeHeader = response.newBuilder().removeHeader("Pragma").removeHeader("Cache-Control");
            return removeHeader.header("Cache-Control", "max-age=" + this.f37141a.mo50894a()).build();
        }
    }

    /* renamed from: cg4$c */
    /* compiled from: OkCacheControl */
    public interface C6942c {
        /* renamed from: a */
        long mo50894a();
    }

    /* renamed from: cg4$d */
    /* compiled from: OkCacheControl */
    public interface C6943d {
        /* renamed from: a */
        boolean mo50895a();
    }

    /* renamed from: cg4$e */
    /* compiled from: OkCacheControl */
    public static class C6944e extends C6945f {

        /* renamed from: a */
        public C6943d f37142a;

        public C6944e(C6943d dVar) {
            super();
            this.f37142a = dVar;
        }

        /* renamed from: a */
        public Request mo50896a(Request request) {
            Request.Builder newBuilder = request.newBuilder();
            if (!this.f37142a.mo50895a()) {
                newBuilder.cacheControl(CacheControl.FORCE_CACHE);
            }
            return newBuilder.build();
        }
    }

    /* renamed from: cg4$f */
    /* compiled from: OkCacheControl */
    public static class C6945f {
        public C6945f() {
        }

        /* renamed from: a */
        public Request mo50896a(Request request) {
            return request;
        }
    }

    /* renamed from: cg4$g */
    /* compiled from: OkCacheControl */
    public static class C6946g {
        public C6946g() {
        }

        /* renamed from: a */
        public Response mo50893a(Response response) {
            return response;
        }
    }

    /* renamed from: cg4$h */
    /* compiled from: OkCacheControl */
    public static class C6947h implements C6942c {

        /* renamed from: a */
        public TimeUnit f37143a;

        /* renamed from: b */
        public long f37144b;

        public C6947h(long j, TimeUnit timeUnit) {
            this.f37143a = timeUnit;
            this.f37144b = j;
        }

        /* renamed from: a */
        public long mo50894a() {
            return this.f37143a.toSeconds(this.f37144b);
        }
    }

    public cg4(OkHttpClient.Builder builder) {
        this.f37137d = builder;
    }

    /* renamed from: b */
    public static Interceptor m56430b(C6945f fVar, C6946g gVar) {
        return new C6940a(fVar, gVar);
    }

    /* renamed from: c */
    public static cg4 m56431c(OkHttpClient.Builder builder) {
        return new cg4(builder);
    }

    /* renamed from: a */
    public OkHttpClient.Builder mo50891a() {
        C6946g gVar;
        C6945f fVar;
        if (this.f37134a == null && this.f37136c == null && this.f37138e == null) {
            return this.f37137d;
        }
        TimeUnit timeUnit = this.f37136c;
        if (timeUnit != null) {
            this.f37138e = new C6947h(this.f37135b, timeUnit);
        }
        C6942c cVar = this.f37138e;
        if (cVar != null) {
            gVar = new C6941b(cVar);
        } else {
            gVar = new C6946g();
        }
        C6943d dVar = this.f37134a;
        if (dVar != null) {
            fVar = new C6944e(dVar);
        } else {
            fVar = new C6945f();
        }
        Interceptor b = m56430b(fVar, gVar);
        this.f37137d.addNetworkInterceptor(b);
        if (this.f37134a != null) {
            this.f37137d.addInterceptor(b);
        }
        return this.f37137d;
    }

    /* renamed from: d */
    public cg4 mo50892d(long j, TimeUnit timeUnit) {
        this.f37138e = null;
        this.f37135b = j;
        this.f37136c = timeUnit;
        return this;
    }
}
