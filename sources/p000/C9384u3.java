package p000;

import android.app.Application;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import p000.og5;

/* renamed from: u3 */
/* compiled from: APIClient */
public class C9384u3 {

    /* renamed from: a */
    public static String f44859a = "";

    /* renamed from: b */
    public static String f44860b = "";

    /* renamed from: c */
    public static String f44861c = "";

    /* renamed from: d */
    public static String f44862d = "";

    /* renamed from: e */
    public static String f44863e = "";

    /* renamed from: f */
    public static String f44864f = "";

    /* renamed from: g */
    public static String f44865g = "";

    /* renamed from: h */
    public static String f44866h = "";

    /* renamed from: i */
    public static String f44867i = "";

    /* renamed from: j */
    public static String f44868j = "";

    /* renamed from: k */
    public static Application f44869k;

    /* renamed from: l */
    public static og5 f44870l;

    /* renamed from: m */
    public static og5 f44871m;

    /* renamed from: n */
    public static og5 f44872n;

    /* renamed from: o */
    public static final HashMap<Integer, og5> f44873o = new HashMap<>();

    /* renamed from: p */
    public static og5 f44874p = null;

    /* renamed from: q */
    public static og5 f44875q = null;

    /* renamed from: r */
    public static og5 f44876r = null;

    /* renamed from: s */
    public static og5 f44877s = null;

    /* renamed from: t */
    public static og5 f44878t = null;

    /* renamed from: u */
    public static final HashMap<Integer, og5> f44879u = new HashMap<>();

    /* renamed from: v */
    public static final HttpLoggingInterceptor.Level f44880v = HttpLoggingInterceptor.Level.NONE;

    /* renamed from: f */
    public static i30 m72565f(TokenType tokenType) {
        og5 og5;
        OkHttpClient okHttpClient;
        File file;
        HashMap<Integer, og5> hashMap = f44873o;
        if (hashMap.containsKey(Integer.valueOf(tokenType.getChainId()))) {
            og5 = hashMap.get(Integer.valueOf(tokenType.getChainId()));
        } else {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(f44880v);
            if (tokenType.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                if (f44869k != null) {
                    file = new File(f44869k.getCacheDir(), "http-cache");
                } else {
                    file = new File("/data/user/0/net.safemoon.androidwallet/cache", "http-cache");
                }
                Cache cache = new Cache(file, (long) 10485760);
                OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                okHttpClient = cg4.m56431c(addInterceptor.readTimeout(30, timeUnit).connectTimeout(30, timeUnit).addInterceptor(new C9155p3())).mo50892d(1, TimeUnit.MINUTES).mo50891a().cache(cache).build();
            } else {
                okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
            }
            og5 d = new og5.C9026b().mo62921b(tokenType.getScanApi()).mo62920a(yj2.m74453f()).mo62925f(okHttpClient).mo62923d();
            hashMap.put(Integer.valueOf(tokenType.getChainId()), d);
            og5 = d;
        }
        return (i30) og5.mo62909b(i30.class);
    }

    /* renamed from: g */
    public static p70 m72566g() {
        File file;
        if (f44872n == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(f44880v);
            if (f44869k != null) {
                file = new File(f44869k.getCacheDir(), "http-cache");
            } else {
                file = new File("/data/user/0/net.safemoon.androidwallet/cache", "http-cache");
            }
            Cache cache = new Cache(file, (long) 10485760);
            OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f44872n = new og5.C9026b().mo62921b("https://pro-api.coinmarketcap.com").mo62920a(yj2.m74453f()).mo62925f(cg4.m56431c(addInterceptor.readTimeout(30, timeUnit).connectTimeout(30, timeUnit).addInterceptor(new C9202q3())).mo50892d(10, TimeUnit.MINUTES).mo50891a().cache(cache).build()).mo62923d();
        }
        return (p70) f44872n.mo62909b(p70.class);
    }

    /* renamed from: h */
    public static Object m72567h(int i, String str) {
        return q70.m71192h("https://s2.coinmarketcap.com/static/img/coins/128x128/" + i + ".png", str, m72575p());
    }

    /* renamed from: i */
    public static Object m72568i(int i, String str, TokenType tokenType) {
        return q70.m71192h("https://s2.coinmarketcap.com/static/img/coins/128x128/" + i + ".png", str, tokenType);
    }

    /* renamed from: j */
    public static li0 m72569j() {
        if (f44875q == null) {
            new HttpLoggingInterceptor().setLevel(f44880v);
            OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new C9301s3());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f44875q = new og5.C9026b().mo62921b("https://api.opensea.io/").mo62920a(yj2.m74453f()).mo62925f(addInterceptor.readTimeout(30, timeUnit).connectTimeout(30, timeUnit).build()).mo62923d();
        }
        return (li0) f44875q.mo62909b(li0.class);
    }

    /* renamed from: k */
    public static jl1 m72570k() {
        if (f44878t == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(f44880v);
            f44878t = new og5.C9026b().mo62921b("https://anydummy.com").mo62920a(new dr6()).mo62920a(yj2.m74453f()).mo62925f(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()).mo62923d();
        }
        return (jl1) f44878t.mo62909b(jl1.class);
    }

    /* renamed from: l */
    public static ho3 m72571l() {
        if (f44871m == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(f44880v);
            OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f44871m = new og5.C9026b().mo62921b("https://marketdata.safemoon.com").mo62920a(yj2.m74453f()).mo62925f(addInterceptor.readTimeout(30, timeUnit).connectTimeout(30, timeUnit).build()).mo62923d();
        }
        return (ho3) f44871m.mo62909b(ho3.class);
    }

    /* renamed from: m */
    public static cy3 m72572m() {
        if (f44876r == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(f44880v);
            OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new C9325t3()).addInterceptor(httpLoggingInterceptor);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f44876r = new og5.C9026b().mo62921b("https://deep-index.moralis.io/").mo62920a(yj2.m74453f()).mo62925f(addInterceptor.readTimeout(30, timeUnit).connectTimeout(30, timeUnit).build()).mo62923d();
        }
        return (cy3) f44876r.mo62909b(cy3.class);
    }

    /* renamed from: n */
    public static n65 m72573n(TokenType tokenType) {
        og5 og5;
        HashMap<Integer, og5> hashMap = f44879u;
        if (hashMap.containsKey(Integer.valueOf(tokenType.getCoinType().getValue()))) {
            og5 = hashMap.get(Integer.valueOf(tokenType.getCoinType().getValue()));
        } else {
            GsonBuilder excludeFieldsWithoutExposeAnnotation = new GsonBuilder().excludeFieldsWithoutExposeAnnotation();
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            og5 d = new og5.C9026b().mo62921b(ol0.m70384z(tokenType.getChainId())).mo62920a(new dr6()).mo62920a(yj2.m74454g(excludeFieldsWithoutExposeAnnotation.create())).mo62925f(addInterceptor.writeTimeout(60, timeUnit).readTimeout(60, timeUnit).connectTimeout(60, timeUnit).build()).mo62923d();
            hashMap.put(Integer.valueOf(tokenType.getCoinType().getValue()), d);
            og5 = d;
        }
        return (n65) og5.mo62909b(n65.class);
    }

    /* renamed from: o */
    public static tk5 m72574o() {
        if (f44870l == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(f44880v);
            OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f44870l = new og5.C9026b().mo62921b("https://mainnet.safemoon.com/").mo62920a(yj2.m74453f()).mo62925f(addInterceptor.readTimeout(30, timeUnit).connectTimeout(30, timeUnit).build()).mo62923d();
        }
        return (tk5) f44870l.mo62909b(tk5.class);
    }

    /* renamed from: p */
    public static TokenType m72575p() {
        return TokenType.fromValue(f06.m57519j(f44869k, "DEFAULT_GATEWAY", TokenType.BEP_20.getName()));
    }

    /* renamed from: q */
    public static v56 m72576q() {
        if (f44877s == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new C9232r3()).addInterceptor(httpLoggingInterceptor);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f44877s = new og5.C9026b().mo62921b("https://solana-gateway.moralis.io/").mo62920a(yj2.m74453f()).mo62925f(addInterceptor.readTimeout(30, timeUnit).connectTimeout(30, timeUnit).build()).mo62923d();
        }
        return (v56) f44877s.mo62909b(v56.class);
    }

    /* renamed from: r */
    public static lt6 m72577r() {
        if (f44874p == null) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(f44880v);
            f44874p = new og5.C9026b().mo62921b("https://symbol-search.tradingview.com").mo62920a(yj2.m74453f()).mo62925f(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()).mo62923d();
        }
        return (lt6) f44874p.mo62909b(lt6.class);
    }

    /* renamed from: s */
    public static void m72578s(Application application) {
        f44869k = application;
    }

    /* renamed from: u */
    public static /* synthetic */ Response m72580u(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder method = request.newBuilder().header(Constants.USER_AGENT_HEADER_KEY, "Android-Agent").method(request.method(), request.body());
        method.header("X-CMC_PRO_API_KEY", f44863e);
        return chain.proceed(method.build());
    }

    /* renamed from: v */
    public static /* synthetic */ Response m72581v(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        if (!y40.f35761c.booleanValue()) {
            newBuilder.header("X-API-KEY", f44859a);
        }
        return chain.proceed(newBuilder.build());
    }

    /* renamed from: w */
    public static /* synthetic */ Response m72582w(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        if (!y40.f35761c.booleanValue()) {
            newBuilder.header("X-API-KEY", f44860b);
        }
        return chain.proceed(newBuilder.build());
    }

    /* renamed from: x */
    public static /* synthetic */ Response m72583x(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        if (!y40.f35761c.booleanValue()) {
            newBuilder.header("X-API-KEY", f44860b);
        }
        return chain.proceed(newBuilder.build());
    }
}
