package com.onesignal;

import java.io.IOException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.onesignal.z0 */
/* compiled from: OneSignalRestClient */
public class C5355z0 {

    /* renamed from: com.onesignal.z0$a */
    /* compiled from: OneSignalRestClient */
    public class C5356a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f26611a;

        /* renamed from: d */
        public final /* synthetic */ JSONObject f26612d;

        /* renamed from: e */
        public final /* synthetic */ C5362g f26613e;

        public C5356a(String str, JSONObject jSONObject, C5362g gVar) {
            this.f26611a = str;
            this.f26612d = jSONObject;
            this.f26613e = gVar;
        }

        public void run() {
            C5355z0.m41443h(this.f26611a, "PUT", this.f26612d, this.f26613e, 120000, (String) null);
        }
    }

    /* renamed from: com.onesignal.z0$b */
    /* compiled from: OneSignalRestClient */
    public class C5357b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f26614a;

        /* renamed from: d */
        public final /* synthetic */ JSONObject f26615d;

        /* renamed from: e */
        public final /* synthetic */ C5362g f26616e;

        public C5357b(String str, JSONObject jSONObject, C5362g gVar) {
            this.f26614a = str;
            this.f26615d = jSONObject;
            this.f26616e = gVar;
        }

        public void run() {
            C5355z0.m41443h(this.f26614a, "POST", this.f26615d, this.f26616e, 120000, (String) null);
        }
    }

    /* renamed from: com.onesignal.z0$c */
    /* compiled from: OneSignalRestClient */
    public class C5358c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f26617a;

        /* renamed from: d */
        public final /* synthetic */ C5362g f26618d;

        /* renamed from: e */
        public final /* synthetic */ String f26619e;

        public C5358c(String str, C5362g gVar, String str2) {
            this.f26617a = str;
            this.f26618d = gVar;
            this.f26619e = str2;
        }

        public void run() {
            C5355z0.m41443h(this.f26617a, (String) null, (JSONObject) null, this.f26618d, 60000, this.f26619e);
        }
    }

    /* renamed from: com.onesignal.z0$d */
    /* compiled from: OneSignalRestClient */
    public class C5359d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Thread[] f26620a;

        /* renamed from: d */
        public final /* synthetic */ String f26621d;

        /* renamed from: e */
        public final /* synthetic */ String f26622e;

        /* renamed from: g */
        public final /* synthetic */ JSONObject f26623g;

        /* renamed from: k */
        public final /* synthetic */ C5362g f26624k;

        /* renamed from: r */
        public final /* synthetic */ int f26625r;

        /* renamed from: s */
        public final /* synthetic */ String f26626s;

        public C5359d(Thread[] threadArr, String str, String str2, JSONObject jSONObject, C5362g gVar, int i, String str3) {
            this.f26620a = threadArr;
            this.f26621d = str;
            this.f26622e = str2;
            this.f26623g = jSONObject;
            this.f26624k = gVar;
            this.f26625r = i;
            this.f26626s = str3;
        }

        public void run() {
            this.f26620a[0] = C5355z0.m41449n(this.f26621d, this.f26622e, this.f26623g, this.f26624k, this.f26625r, this.f26626s);
        }
    }

    /* renamed from: com.onesignal.z0$e */
    /* compiled from: OneSignalRestClient */
    public class C5360e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5362g f26627a;

        /* renamed from: d */
        public final /* synthetic */ String f26628d;

        public C5360e(C5362g gVar, String str) {
            this.f26627a = gVar;
            this.f26628d = str;
        }

        public void run() {
            this.f26627a.mo38415b(this.f26628d);
        }
    }

    /* renamed from: com.onesignal.z0$f */
    /* compiled from: OneSignalRestClient */
    public class C5361f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5362g f26629a;

        /* renamed from: d */
        public final /* synthetic */ int f26630d;

        /* renamed from: e */
        public final /* synthetic */ String f26631e;

        /* renamed from: g */
        public final /* synthetic */ Throwable f26632g;

        public C5361f(C5362g gVar, int i, String str, Throwable th) {
            this.f26629a = gVar;
            this.f26630d = i;
            this.f26631e = str;
            this.f26632g = th;
        }

        public void run() {
            this.f26629a.mo38414a(this.f26630d, this.f26631e, this.f26632g);
        }
    }

    /* renamed from: com.onesignal.z0$g */
    /* compiled from: OneSignalRestClient */
    public static abstract class C5362g {
        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
        }

        /* renamed from: b */
        public void mo38415b(String str) {
        }
    }

    /* renamed from: c */
    public static Thread m41438c(C5362g gVar, int i, String str, Throwable th) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new C5361f(gVar, i, str, th), "OS_REST_FAILURE_CALLBACK");
        thread.start();
        return thread;
    }

    /* renamed from: d */
    public static Thread m41439d(C5362g gVar, String str) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new C5360e(gVar, str), "OS_REST_SUCCESS_CALLBACK");
        thread.start();
        return thread;
    }

    /* renamed from: e */
    public static void m41440e(String str, C5362g gVar, String str2) {
        new Thread(new C5358c(str, gVar, str2), "OS_REST_ASYNC_GET").start();
    }

    /* renamed from: f */
    public static void m41441f(String str, C5362g gVar, String str2) {
        m41443h(str, (String) null, (JSONObject) null, gVar, 60000, str2);
    }

    /* renamed from: g */
    public static int m41442g(int i) {
        return i + 5000;
    }

    /* renamed from: h */
    public static void m41443h(String str, String str2, JSONObject jSONObject, C5362g gVar, int i, String str3) {
        String str4 = str2;
        if (OSUtils.m40259H()) {
            throw new OSThrowable$OSMainThreadException("Method: " + str2 + " was called from the Main Thread!");
        } else if (str4 == null || !OneSignal.m40339L1((String) null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new C5359d(threadArr, str, str2, jSONObject, gVar, i, str3), "OS_HTTPConnection");
            thread.start();
            try {
                thread.join((long) m41442g(i));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                Thread thread2 = threadArr[0];
                if (thread2 != null) {
                    thread2.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    public static HttpURLConnection m41444i(String str) throws IOException {
        return (HttpURLConnection) new URL("https://api.onesignal.com/" + str).openConnection();
    }

    /* renamed from: j */
    public static void m41445j(String str, JSONObject jSONObject, C5362g gVar) {
        new Thread(new C5357b(str, jSONObject, gVar), "OS_REST_ASYNC_POST").start();
    }

    /* renamed from: k */
    public static void m41446k(String str, JSONObject jSONObject, C5362g gVar) {
        m41443h(str, "POST", jSONObject, gVar, 120000, (String) null);
    }

    /* renamed from: l */
    public static void m41447l(String str, JSONObject jSONObject, C5362g gVar) {
        new Thread(new C5356a(str, jSONObject, gVar), "OS_REST_ASYNC_PUT").start();
    }

    /* renamed from: m */
    public static void m41448m(String str, JSONObject jSONObject, C5362g gVar) {
        m41443h(str, "PUT", jSONObject, gVar, 120000, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ac, code lost:
        if (r9 == null) goto L_0x02af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x026a A[Catch:{ all -> 0x02b0 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Thread m41449n(java.lang.String r16, java.lang.String r17, org.json.JSONObject r18, com.onesignal.C5355z0.C5362g r19, int r20, java.lang.String r21) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = "OneSignalRestClient: "
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L_0x0017
            r6 = 10000(0x2710, float:1.4013E-41)
            android.net.TrafficStats.setThreadStatsTag(r6)
        L_0x0017:
            r6 = 0
            r7 = -1
            com.onesignal.OneSignal$LOG_LEVEL r8 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ all -> 0x0264 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0264 }
            r9.<init>()     // Catch:{ all -> 0x0264 }
            java.lang.String r10 = "OneSignalRestClient: Making request to: https://api.onesignal.com/"
            r9.append(r10)     // Catch:{ all -> 0x0264 }
            r9.append(r0)     // Catch:{ all -> 0x0264 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0264 }
            com.onesignal.OneSignal.m40376a(r8, r9)     // Catch:{ all -> 0x0264 }
            java.net.HttpURLConnection r9 = m41444i(r16)     // Catch:{ all -> 0x0264 }
            r10 = 0
            r9.setUseCaches(r10)     // Catch:{ all -> 0x0262 }
            r9.setConnectTimeout(r3)     // Catch:{ all -> 0x0262 }
            r9.setReadTimeout(r3)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = "SDK-Version"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r10.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.String r11 = "onesignal/android/"
            r10.append(r11)     // Catch:{ all -> 0x0262 }
            java.lang.String r11 = com.onesignal.OneSignal.m40428r0()     // Catch:{ all -> 0x0262 }
            r10.append(r11)     // Catch:{ all -> 0x0262 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0262 }
            r9.setRequestProperty(r3, r10)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = "Accept"
            java.lang.String r10 = "application/vnd.onesignal.v1+json"
            r9.setRequestProperty(r3, r10)     // Catch:{ all -> 0x0262 }
            r3 = 1
            if (r18 == 0) goto L_0x0064
            r9.setDoInput(r3)     // Catch:{ all -> 0x0262 }
        L_0x0064:
            if (r1 == 0) goto L_0x0073
            java.lang.String r10 = "Content-Type"
            java.lang.String r11 = "application/json; charset=UTF-8"
            r9.setRequestProperty(r10, r11)     // Catch:{ all -> 0x0262 }
            r9.setRequestMethod(r1)     // Catch:{ all -> 0x0262 }
            r9.setDoOutput(r3)     // Catch:{ all -> 0x0262 }
        L_0x0073:
            java.lang.String r3 = "UTF-8"
            if (r18 == 0) goto L_0x00a4
            java.lang.String r10 = p000.vz2.m53663g(r18)     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r11.<init>()     // Catch:{ all -> 0x0262 }
            r11.append(r5)     // Catch:{ all -> 0x0262 }
            r11.append(r1)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = " SEND JSON: "
            r11.append(r12)     // Catch:{ all -> 0x0262 }
            r11.append(r10)     // Catch:{ all -> 0x0262 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal.m40376a(r8, r11)     // Catch:{ all -> 0x0262 }
            byte[] r10 = r10.getBytes(r3)     // Catch:{ all -> 0x0262 }
            int r11 = r10.length     // Catch:{ all -> 0x0262 }
            r9.setFixedLengthStreamingMode(r11)     // Catch:{ all -> 0x0262 }
            java.io.OutputStream r11 = r9.getOutputStream()     // Catch:{ all -> 0x0262 }
            r11.write(r10)     // Catch:{ all -> 0x0262 }
        L_0x00a4:
            java.lang.String r10 = "PREFS_OS_ETAG_PREFIX_"
            if (r4 == 0) goto L_0x00d8
            java.lang.String r11 = com.onesignal.C5342x0.f26571a     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r12.<init>()     // Catch:{ all -> 0x0262 }
            r12.append(r10)     // Catch:{ all -> 0x0262 }
            r12.append(r4)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0262 }
            java.lang.String r11 = com.onesignal.C5342x0.m41395f(r11, r12, r6)     // Catch:{ all -> 0x0262 }
            if (r11 == 0) goto L_0x00d8
            java.lang.String r12 = "if-none-match"
            r9.setRequestProperty(r12, r11)     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r12.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.String r13 = "OneSignalRestClient: Adding header if-none-match: "
            r12.append(r13)     // Catch:{ all -> 0x0262 }
            r12.append(r11)     // Catch:{ all -> 0x0262 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal.m40376a(r8, r11)     // Catch:{ all -> 0x0262 }
        L_0x00d8:
            int r7 = r9.getResponseCode()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal$LOG_LEVEL r11 = com.onesignal.OneSignal.LOG_LEVEL.VERBOSE     // Catch:{ all -> 0x025e }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x025e }
            r12.<init>()     // Catch:{ all -> 0x025e }
            java.lang.String r13 = "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/"
            r12.append(r13)     // Catch:{ all -> 0x025e }
            r12.append(r0)     // Catch:{ all -> 0x025e }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x025e }
            com.onesignal.OneSignal.m40376a(r11, r12)     // Catch:{ all -> 0x025e }
            r11 = 200(0xc8, float:2.8E-43)
            java.lang.String r12 = " RECEIVED JSON: "
            java.lang.String r13 = ""
            java.lang.String r14 = "GET"
            java.lang.String r15 = "\\A"
            java.lang.String r6 = "PREFS_OS_HTTP_CACHE_PREFIX_"
            if (r7 == r11) goto L_0x01bd
            r11 = 202(0xca, float:2.83E-43)
            if (r7 == r11) goto L_0x01bd
            r10 = 304(0x130, float:4.26E-43)
            if (r7 == r10) goto L_0x0183
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r4.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.String r6 = "OneSignalRestClient: Failed request to: https://api.onesignal.com/"
            r4.append(r6)     // Catch:{ all -> 0x0262 }
            r4.append(r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal.m40376a(r8, r0)     // Catch:{ all -> 0x0262 }
            java.io.InputStream r0 = r9.getErrorStream()     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x0126
            java.io.InputStream r0 = r9.getInputStream()     // Catch:{ all -> 0x0262 }
        L_0x0126:
            if (r0 == 0) goto L_0x015a
            java.util.Scanner r4 = new java.util.Scanner     // Catch:{ all -> 0x0262 }
            r4.<init>(r0, r3)     // Catch:{ all -> 0x0262 }
            java.util.Scanner r0 = r4.useDelimiter(r15)     // Catch:{ all -> 0x0262 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x013b
            java.lang.String r13 = r4.next()     // Catch:{ all -> 0x0262 }
        L_0x013b:
            r4.close()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal$LOG_LEVEL r0 = com.onesignal.OneSignal.LOG_LEVEL.WARN     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            r3.append(r5)     // Catch:{ all -> 0x0262 }
            r3.append(r1)     // Catch:{ all -> 0x0262 }
            r3.append(r12)     // Catch:{ all -> 0x0262 }
            r3.append(r13)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal.m40376a(r0, r3)     // Catch:{ all -> 0x0262 }
            r3 = 0
            goto L_0x017d
        L_0x015a:
            com.onesignal.OneSignal$LOG_LEVEL r0 = com.onesignal.OneSignal.LOG_LEVEL.WARN     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            r3.append(r5)     // Catch:{ all -> 0x0262 }
            r3.append(r1)     // Catch:{ all -> 0x0262 }
            java.lang.String r4 = " HTTP Code: "
            r3.append(r4)     // Catch:{ all -> 0x0262 }
            r3.append(r7)     // Catch:{ all -> 0x0262 }
            java.lang.String r4 = " No response body!"
            r3.append(r4)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal.m40376a(r0, r3)     // Catch:{ all -> 0x0262 }
            r3 = 0
            r13 = 0
        L_0x017d:
            java.lang.Thread r0 = m41438c(r2, r7, r13, r3)     // Catch:{ all -> 0x0262 }
            goto L_0x0256
        L_0x0183:
            java.lang.String r0 = com.onesignal.C5342x0.f26571a     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            r3.append(r6)     // Catch:{ all -> 0x0262 }
            r3.append(r4)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0262 }
            r4 = 0
            java.lang.String r0 = com.onesignal.C5342x0.m41395f(r0, r3, r4)     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            r3.append(r5)     // Catch:{ all -> 0x0262 }
            if (r1 != 0) goto L_0x01a4
            goto L_0x01a5
        L_0x01a4:
            r14 = r1
        L_0x01a5:
            r3.append(r14)     // Catch:{ all -> 0x0262 }
            java.lang.String r4 = " - Using Cached response due to 304: "
            r3.append(r4)     // Catch:{ all -> 0x0262 }
            r3.append(r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0262 }
            com.onesignal.OneSignal.m40376a(r8, r3)     // Catch:{ all -> 0x0262 }
            java.lang.Thread r0 = m41439d(r2, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0256
        L_0x01bd:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x025e }
            r11.<init>()     // Catch:{ all -> 0x025e }
            r18 = r7
            java.lang.String r7 = "OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/"
            r11.append(r7)     // Catch:{ all -> 0x025a }
            r11.append(r0)     // Catch:{ all -> 0x025a }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x025a }
            com.onesignal.OneSignal.m40376a(r8, r0)     // Catch:{ all -> 0x025a }
            java.io.InputStream r0 = r9.getInputStream()     // Catch:{ all -> 0x025a }
            java.util.Scanner r7 = new java.util.Scanner     // Catch:{ all -> 0x025a }
            r7.<init>(r0, r3)     // Catch:{ all -> 0x025a }
            java.util.Scanner r0 = r7.useDelimiter(r15)     // Catch:{ all -> 0x025a }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x025a }
            if (r0 == 0) goto L_0x01ea
            java.lang.String r13 = r7.next()     // Catch:{ all -> 0x025a }
        L_0x01ea:
            r7.close()     // Catch:{ all -> 0x025a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r0.<init>()     // Catch:{ all -> 0x025a }
            r0.append(r5)     // Catch:{ all -> 0x025a }
            if (r1 != 0) goto L_0x01f8
            goto L_0x01f9
        L_0x01f8:
            r14 = r1
        L_0x01f9:
            r0.append(r14)     // Catch:{ all -> 0x025a }
            r0.append(r12)     // Catch:{ all -> 0x025a }
            r0.append(r13)     // Catch:{ all -> 0x025a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x025a }
            com.onesignal.OneSignal.m40376a(r8, r0)     // Catch:{ all -> 0x025a }
            if (r4 == 0) goto L_0x0252
            java.lang.String r0 = "etag"
            java.lang.String r0 = r9.getHeaderField(r0)     // Catch:{ all -> 0x025a }
            if (r0 == 0) goto L_0x0252
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r3.<init>()     // Catch:{ all -> 0x025a }
            java.lang.String r7 = "OneSignalRestClient: Response has etag of "
            r3.append(r7)     // Catch:{ all -> 0x025a }
            r3.append(r0)     // Catch:{ all -> 0x025a }
            java.lang.String r7 = " so caching the response."
            r3.append(r7)     // Catch:{ all -> 0x025a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x025a }
            com.onesignal.OneSignal.m40376a(r8, r3)     // Catch:{ all -> 0x025a }
            java.lang.String r3 = com.onesignal.C5342x0.f26571a     // Catch:{ all -> 0x025a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r7.<init>()     // Catch:{ all -> 0x025a }
            r7.append(r10)     // Catch:{ all -> 0x025a }
            r7.append(r4)     // Catch:{ all -> 0x025a }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x025a }
            com.onesignal.C5342x0.m41402m(r3, r7, r0)     // Catch:{ all -> 0x025a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r0.<init>()     // Catch:{ all -> 0x025a }
            r0.append(r6)     // Catch:{ all -> 0x025a }
            r0.append(r4)     // Catch:{ all -> 0x025a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x025a }
            com.onesignal.C5342x0.m41402m(r3, r0, r13)     // Catch:{ all -> 0x025a }
        L_0x0252:
            java.lang.Thread r0 = m41439d(r2, r13)     // Catch:{ all -> 0x025a }
        L_0x0256:
            r9.disconnect()
            goto L_0x02af
        L_0x025a:
            r0 = move-exception
            r7 = r18
            goto L_0x0266
        L_0x025e:
            r0 = move-exception
            r18 = r7
            goto L_0x0266
        L_0x0262:
            r0 = move-exception
            goto L_0x0266
        L_0x0264:
            r0 = move-exception
            r9 = 0
        L_0x0266:
            boolean r3 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x02b0 }
            if (r3 != 0) goto L_0x0289
            boolean r3 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x02b0 }
            if (r3 == 0) goto L_0x026f
            goto L_0x0289
        L_0x026f:
            com.onesignal.OneSignal$LOG_LEVEL r3 = com.onesignal.OneSignal.LOG_LEVEL.WARN     // Catch:{ all -> 0x02b0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b0 }
            r4.<init>()     // Catch:{ all -> 0x02b0 }
            r4.append(r5)     // Catch:{ all -> 0x02b0 }
            r4.append(r1)     // Catch:{ all -> 0x02b0 }
            java.lang.String r1 = " Error thrown from network stack. "
            r4.append(r1)     // Catch:{ all -> 0x02b0 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x02b0 }
            com.onesignal.OneSignal.m40379b(r3, r1, r0)     // Catch:{ all -> 0x02b0 }
            goto L_0x02a7
        L_0x0289:
            com.onesignal.OneSignal$LOG_LEVEL r1 = com.onesignal.OneSignal.LOG_LEVEL.INFO     // Catch:{ all -> 0x02b0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b0 }
            r3.<init>()     // Catch:{ all -> 0x02b0 }
            java.lang.String r4 = "OneSignalRestClient: Could not send last request, device is offline. Throwable: "
            r3.append(r4)     // Catch:{ all -> 0x02b0 }
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x02b0 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x02b0 }
            r3.append(r4)     // Catch:{ all -> 0x02b0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02b0 }
            com.onesignal.OneSignal.m40376a(r1, r3)     // Catch:{ all -> 0x02b0 }
        L_0x02a7:
            r1 = 0
            java.lang.Thread r0 = m41438c(r2, r7, r1, r0)     // Catch:{ all -> 0x02b0 }
            if (r9 == 0) goto L_0x02af
            goto L_0x0256
        L_0x02af:
            return r0
        L_0x02b0:
            r0 = move-exception
            if (r9 == 0) goto L_0x02b6
            r9.disconnect()
        L_0x02b6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5355z0.m41449n(java.lang.String, java.lang.String, org.json.JSONObject, com.onesignal.z0$g, int, java.lang.String):java.lang.Thread");
    }
}
