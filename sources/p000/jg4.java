package p000;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: jg4 */
/* compiled from: OkHttpCall */
public final class jg4<T> implements k90<T> {

    /* renamed from: a */
    public final fe5 f38661a;

    /* renamed from: d */
    public final Object[] f38662d;

    /* renamed from: e */
    public final Call.Factory f38663e;

    /* renamed from: g */
    public final pt0<ResponseBody, T> f38664g;

    /* renamed from: k */
    public volatile boolean f38665k;

    /* renamed from: r */
    public Call f38666r;

    /* renamed from: s */
    public Throwable f38667s;

    /* renamed from: x */
    public boolean f38668x;

    /* renamed from: jg4$a */
    /* compiled from: OkHttpCall */
    public class C7276a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ p90 f38669a;

        public C7276a(p90 p90) {
            this.f38669a = p90;
        }

        /* renamed from: a */
        public final void mo52687a(Throwable th) {
            try {
                this.f38669a.mo47103a(jg4.this, th);
            } catch (Throwable th2) {
                t77.m72188s(th2);
                th2.printStackTrace();
            }
        }

        public void onFailure(Call call, IOException iOException) {
            mo52687a(iOException);
        }

        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f38669a.mo47104b(jg4.this, jg4.this.mo52686f(response));
                } catch (Throwable th) {
                    t77.m72188s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                t77.m72188s(th2);
                mo52687a(th2);
            }
        }
    }

    /* renamed from: jg4$b */
    /* compiled from: OkHttpCall */
    public static final class C7277b extends ResponseBody {

        /* renamed from: a */
        public final ResponseBody f38671a;

        /* renamed from: d */
        public final w40 f38672d;

        /* renamed from: e */
        public IOException f38673e;

        /* renamed from: jg4$b$a */
        /* compiled from: OkHttpCall */
        public class C7278a extends q82 {
            public C7278a(z56 z56) {
                super(z56);
            }

            public long read(m40 m40, long j) throws IOException {
                try {
                    return super.read(m40, j);
                } catch (IOException e) {
                    C7277b.this.f38673e = e;
                    throw e;
                }
            }
        }

        public C7277b(ResponseBody responseBody) {
            this.f38671a = responseBody;
            this.f38672d = sg4.m71929d(new C7278a(responseBody.source()));
        }

        /* renamed from: a */
        public void mo52688a() throws IOException {
            IOException iOException = this.f38673e;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f38671a.close();
        }

        public long contentLength() {
            return this.f38671a.contentLength();
        }

        public MediaType contentType() {
            return this.f38671a.contentType();
        }

        public w40 source() {
            return this.f38672d;
        }
    }

    /* renamed from: jg4$c */
    /* compiled from: OkHttpCall */
    public static final class C7279c extends ResponseBody {

        /* renamed from: a */
        public final MediaType f38675a;

        /* renamed from: d */
        public final long f38676d;

        public C7279c(MediaType mediaType, long j) {
            this.f38675a = mediaType;
            this.f38676d = j;
        }

        public long contentLength() {
            return this.f38676d;
        }

        public MediaType contentType() {
            return this.f38675a;
        }

        public w40 source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public jg4(fe5 fe5, Object[] objArr, Call.Factory factory, pt0<ResponseBody, T> pt0) {
        this.f38661a = fe5;
        this.f38662d = objArr;
        this.f38663e = factory;
        this.f38664g = pt0;
    }

    /* renamed from: X */
    public void mo50512X(p90<T> p90) {
        Call call;
        Throwable th;
        Objects.requireNonNull(p90, "callback == null");
        synchronized (this) {
            if (!this.f38668x) {
                this.f38668x = true;
                call = this.f38666r;
                th = this.f38667s;
                if (call == null && th == null) {
                    try {
                        Call b = mo52684b();
                        this.f38666r = b;
                        call = b;
                    } catch (Throwable th2) {
                        th = th2;
                        t77.m72188s(th);
                        this.f38667s = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            p90.mo47103a(this, th);
            return;
        }
        if (this.f38665k) {
            call.cancel();
        }
        call.enqueue(new C7276a(p90));
    }

    /* renamed from: a */
    public jg4<T> clone() {
        return new jg4<>(this.f38661a, this.f38662d, this.f38663e, this.f38664g);
    }

    /* renamed from: b */
    public final Call mo52684b() throws IOException {
        Call newCall = this.f38663e.newCall(this.f38661a.mo51646a(this.f38662d));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public void cancel() {
        Call call;
        this.f38665k = true;
        synchronized (this) {
            call = this.f38666r;
        }
        if (call != null) {
            call.cancel();
        }
    }

    /* renamed from: d */
    public final Call mo52685d() throws IOException {
        Call call = this.f38666r;
        if (call != null) {
            return call;
        }
        Throwable th = this.f38667s;
        if (th == null) {
            try {
                Call b = mo52684b();
                this.f38666r = b;
                return b;
            } catch (IOException | Error | RuntimeException e) {
                t77.m72188s(e);
                this.f38667s = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public bg5<T> execute() throws IOException {
        Call d;
        synchronized (this) {
            if (!this.f38668x) {
                this.f38668x = true;
                d = mo52685d();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f38665k) {
            d.cancel();
        }
        return mo52686f(d.execute());
    }

    /* renamed from: f */
    public bg5<T> mo52686f(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new C7279c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return bg5.m55958c(t77.m72170a(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return bg5.m55959h(null, build);
        } else {
            C7277b bVar = new C7277b(body);
            try {
                return bg5.m55959h(this.f38664g.mo50216a(bVar), build);
            } catch (RuntimeException e) {
                bVar.mo52688a();
                throw e;
            }
        }
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.f38665k) {
            return true;
        }
        synchronized (this) {
            Call call = this.f38666r;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return mo52685d().request();
    }
}
