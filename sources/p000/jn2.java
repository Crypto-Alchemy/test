package p000;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p000.q54;

/* renamed from: jn2 */
/* compiled from: HttpUrlConnectionNetworkFetcher */
public class jn2 extends C2126cz<C2619c> {

    /* renamed from: a */
    public int f13708a;

    /* renamed from: b */
    public String f13709b;

    /* renamed from: c */
    public final Map<String, String> f13710c;

    /* renamed from: d */
    public final ExecutorService f13711d;

    /* renamed from: e */
    public final vx3 f13712e;

    /* renamed from: jn2$a */
    /* compiled from: HttpUrlConnectionNetworkFetcher */
    public class C2617a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2619c f13713a;

        /* renamed from: d */
        public final /* synthetic */ q54.C3123a f13714d;

        public C2617a(C2619c cVar, q54.C3123a aVar) {
            this.f13713a = cVar;
            this.f13714d = aVar;
        }

        public void run() {
            jn2.this.mo21981j(this.f13713a, this.f13714d);
        }
    }

    /* renamed from: jn2$b */
    /* compiled from: HttpUrlConnectionNetworkFetcher */
    public class C2618b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ Future f13716a;

        /* renamed from: b */
        public final /* synthetic */ q54.C3123a f13717b;

        public C2618b(Future future, q54.C3123a aVar) {
            this.f13716a = future;
            this.f13717b = aVar;
        }

        /* renamed from: b */
        public void mo13412b() {
            if (this.f13716a.cancel(false)) {
                this.f13717b.mo24447a();
            }
        }
    }

    /* renamed from: jn2$c */
    /* compiled from: HttpUrlConnectionNetworkFetcher */
    public static class C2619c extends qz1 {

        /* renamed from: f */
        public long f13719f;

        /* renamed from: g */
        public long f13720g;

        /* renamed from: h */
        public long f13721h;

        public C2619c(vq0<gp1> vq0, wv4 wv4) {
            super(vq0, wv4);
        }
    }

    public jn2(int i) {
        this((String) null, (Map<String, String>) null, RealtimeSinceBootClock.get());
        this.f13708a = i;
    }

    /* renamed from: h */
    public static String m20245h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: l */
    public static boolean m20246l(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: m */
    public static boolean m20247m(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: o */
    public static HttpURLConnection m20248o(Uri uri) throws IOException {
        return (HttpURLConnection) i57.m19431n(uri).openConnection();
    }

    /* renamed from: f */
    public C2619c mo21974a(vq0<gp1> vq0, wv4 wv4) {
        return new C2619c(vq0, wv4);
    }

    /* renamed from: g */
    public final HttpURLConnection mo21979g(Uri uri, int i) throws IOException {
        Uri uri2;
        String str;
        HttpURLConnection o = m20248o(uri);
        String str2 = this.f13709b;
        if (str2 != null) {
            o.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, str2);
        }
        Map<String, String> map = this.f13710c;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                o.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        o.setConnectTimeout(this.f13708a);
        int responseCode = o.getResponseCode();
        if (m20247m(responseCode)) {
            return o;
        }
        if (m20246l(responseCode)) {
            String headerField = o.getHeaderField("Location");
            o.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i > 0 && uri2 != null && !hf4.m18860a(uri2.getScheme(), scheme)) {
                return mo21979g(uri2, i - 1);
            }
            if (i == 0) {
                str = m20245h("URL %s follows too many redirects", uri.toString());
            } else {
                str = m20245h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(str);
        }
        o.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
    }

    /* renamed from: i */
    public void mo21976d(C2619c cVar, q54.C3123a aVar) {
        long unused = cVar.f13719f = this.f13712e.now();
        cVar.mo25289b().mo20292o(new C2618b(this.f13711d.submit(new C2617a(cVar, aVar)), aVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v7 ?
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.collectCodeVars(ProcessVariables.java:122)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:45)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031 A[SYNTHETIC, Splitter:B:20:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[SYNTHETIC, Splitter:B:27:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    public void mo21981j(p000.jn2.C2619c r5, p000.q54.C3123a r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.mo25294g()     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            r2 = 5
            java.net.HttpURLConnection r1 = r4.mo21979g(r1, r2)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            vx3 r2 = r4.f13712e     // Catch:{ IOException -> 0x0025 }
            long r2 = r2.now()     // Catch:{ IOException -> 0x0025 }
            long unused = r5.f13720g = r2     // Catch:{ IOException -> 0x0025 }
            if (r1 == 0) goto L_0x001d
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ IOException -> 0x0025 }
            r5 = -1
            r6.mo24449c(r0, r5)     // Catch:{ IOException -> 0x0025 }
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r0.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            if (r1 == 0) goto L_0x0039
            goto L_0x0036
        L_0x0025:
            r5 = move-exception
            goto L_0x002c
        L_0x0027:
            r5 = move-exception
            r1 = r0
            goto L_0x003b
        L_0x002a:
            r5 = move-exception
            r1 = r0
        L_0x002c:
            r6.mo24448b(r5)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            if (r1 == 0) goto L_0x0039
        L_0x0036:
            r1.disconnect()
        L_0x0039:
            return
        L_0x003a:
            r5 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.disconnect()
        L_0x0045:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jn2.mo21981j(jn2$c, q54$a):void");
    }

    /* renamed from: k */
    public Map<String, String> mo21975c(C2619c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f13720g - cVar.f13719f));
        hashMap.put("fetch_time", Long.toString(cVar.f13721h - cVar.f13720g));
        hashMap.put("total_time", Long.toString(cVar.f13721h - cVar.f13719f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    /* renamed from: n */
    public void mo21977e(C2619c cVar, int i) {
        long unused = cVar.f13721h = this.f13712e.now();
    }

    public jn2(String str, Map<String, String> map, vx3 vx3) {
        this.f13711d = Executors.newFixedThreadPool(3);
        this.f13712e = vx3;
        this.f13710c = map;
        this.f13709b = str;
    }
}
