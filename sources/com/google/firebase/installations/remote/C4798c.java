package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: com.google.firebase.installations.remote.c */
/* compiled from: FirebaseInstallationServiceClient */
public class C4798c {

    /* renamed from: e */
    public static final Pattern f25384e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    public static final Charset f25385f = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f25386a;

    /* renamed from: b */
    public final ly4<q57> f25387b;

    /* renamed from: c */
    public final ly4<HeartBeatInfo> f25388c;

    /* renamed from: d */
    public final ie5 f25389d = new ie5();

    public C4798c(Context context, ly4<q57> ly4, ly4<HeartBeatInfo> ly42) {
        this.f25386a = context;
        this.f25387b = ly4;
        this.f25388c = ly42;
    }

    /* renamed from: a */
    public static String m38551a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    public static JSONObject m38552b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static JSONObject m38553c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: h */
    public static byte[] m38554h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    public static boolean m38555i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    public static void m38556j() {
    }

    /* renamed from: k */
    public static void m38557k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(m38559o(httpURLConnection))) {
            m38551a(str, str2, str3);
        }
    }

    /* renamed from: m */
    public static long m38558m(String str) {
        cu4.m43212b(f25384e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m38559o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f25385f
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.C4798c.m38559o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: s */
    public static void m38560s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: d */
    public InstallationResponse mo36187d(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        InstallationResponse n;
        if (this.f25389d.mo43581b()) {
            int i = 0;
            URL g = mo36190g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = mo36191l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    mo36194q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f25389d.mo43583f(responseCode);
                    if (m38555i(responseCode)) {
                        n = mo36192n(l);
                    } else {
                        m38557k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m38556j();
                            n = InstallationResponse.m38513a().mo36172e(InstallationResponse.ResponseCode.BAD_CONFIG).mo36168a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    /* renamed from: e */
    public TokenResult mo36188e(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        TokenResult p;
        if (this.f25389d.mo43581b()) {
            int i = 0;
            URL g = mo36190g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = mo36191l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty(Constants.AUTHORIZATION_HEADER, "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    mo36195r(l);
                    int responseCode = l.getResponseCode();
                    this.f25389d.mo43583f(responseCode);
                    if (m38555i(responseCode)) {
                        p = mo36193p(l);
                    } else {
                        m38557k(l, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    m38556j();
                                    p = TokenResult.m38525a().mo36178b(TokenResult.ResponseCode.BAD_CONFIG).mo36177a();
                                } else {
                                    l.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        p = TokenResult.m38525a().mo36178b(TokenResult.ResponseCode.AUTH_ERROR).mo36177a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    /* renamed from: f */
    public final String mo36189f() {
        try {
            Context context = this.f25386a;
            byte[] a = C6533tj.m52320a(context, context.getPackageName());
            if (a != null) {
                return am2.m31869b(a, false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get fingerprint hash for package: ");
            sb.append(this.f25386a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.f25386a.getPackageName());
            return null;
        }
    }

    /* renamed from: g */
    public final URL mo36190g(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    public final HttpURLConnection mo36191l(URL url, String str) throws FirebaseInstallationsException {
        HeartBeatInfo.HeartBeat a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", Constants.APPLICATION_JSON);
            httpURLConnection.addRequestProperty(Constants.ACCEPT_HEADER, Constants.APPLICATION_JSON);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f25386a.getPackageName());
            if (!(this.f25388c.get() == null || this.f25387b.get() == null || (a = this.f25388c.get().mo36104a("fire-installations-id")) == HeartBeatInfo.HeartBeat.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f25387b.get().mo46970a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.getCode()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", mo36189f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    public final InstallationResponse mo36192n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f25385f));
        TokenResult.C4791a a = TokenResult.m38525a();
        InstallationResponse.C4790a a2 = InstallationResponse.m38513a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(PublicResolver.FUNC_NAME)) {
                a2.mo36173f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo36170c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo36171d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo36179c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo36180d(m38558m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo36169b(a.mo36177a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo36172e(InstallationResponse.ResponseCode.OK).mo36168a();
    }

    /* renamed from: p */
    public final TokenResult mo36193p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f25385f));
        TokenResult.C4791a a = TokenResult.m38525a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo36179c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo36180d(m38558m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo36178b(TokenResult.ResponseCode.OK).mo36177a();
    }

    /* renamed from: q */
    public final void mo36194q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m38560s(httpURLConnection, m38554h(m38552b(str, str2)));
    }

    /* renamed from: r */
    public final void mo36195r(HttpURLConnection httpURLConnection) throws IOException {
        m38560s(httpURLConnection, m38554h(m38553c()));
    }
}
