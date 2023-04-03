package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000.ik3;
import p000.mk3;

/* renamed from: cc0 */
/* compiled from: CctTransportBackend */
public final class cc0 implements gx6 {

    /* renamed from: a */
    public final p11 f21670a;

    /* renamed from: b */
    public final ConnectivityManager f21671b;

    /* renamed from: c */
    public final Context f21672c;

    /* renamed from: d */
    public final URL f21673d;

    /* renamed from: e */
    public final ah0 f21674e;

    /* renamed from: f */
    public final ah0 f21675f;

    /* renamed from: g */
    public final int f21676g;

    /* renamed from: cc0$a */
    /* compiled from: CctTransportBackend */
    public static final class C3928a {

        /* renamed from: a */
        public final URL f21677a;

        /* renamed from: b */
        public final e00 f21678b;

        /* renamed from: c */
        public final String f21679c;

        public C3928a(URL url, e00 e00, String str) {
            this.f21677a = url;
            this.f21678b = e00;
            this.f21679c = str;
        }

        /* renamed from: a */
        public C3928a mo29927a(URL url) {
            return new C3928a(url, this.f21678b, this.f21679c);
        }
    }

    /* renamed from: cc0$b */
    /* compiled from: CctTransportBackend */
    public static final class C3929b {

        /* renamed from: a */
        public final int f21680a;

        /* renamed from: b */
        public final URL f21681b;

        /* renamed from: c */
        public final long f21682c;

        public C3929b(int i, URL url, long j) {
            this.f21680a = i;
            this.f21681b = url;
            this.f21682c = j;
        }
    }

    public cc0(Context context, ah0 ah0, ah0 ah02, int i) {
        this.f21670a = e00.m43749b();
        this.f21672c = context;
        this.f21671b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f21673d = m32920n(n70.f31980c);
        this.f21674e = ah02;
        this.f21675f = ah0;
        this.f21676g = i;
    }

    /* renamed from: f */
    public static int m32913f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    public static int m32914g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.NetworkType.NONE.getValue();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    public static int m32915h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            xk3.m54422c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m32916j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    public static long m32917k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* renamed from: l */
    public static /* synthetic */ C3928a m32918l(C3928a aVar, C3929b bVar) {
        URL url = bVar.f21681b;
        if (url == null) {
            return null;
        }
        xk3.m54420a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo29927a(bVar.f21681b);
    }

    /* renamed from: m */
    public static InputStream m32919m(InputStream inputStream, String str) throws IOException {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    public static URL m32920n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public mt1 mo29923a(mt1 mt1) {
        NetworkInfo activeNetworkInfo = this.f21671b.getActiveNetworkInfo();
        return mt1.mo45899l().mo45900a("sdk-version", Build.VERSION.SDK_INT).mo45902c("model", Build.MODEL).mo45902c("hardware", Build.HARDWARE).mo45902c("device", Build.DEVICE).mo45902c("product", Build.PRODUCT).mo45902c("os-uild", Build.ID).mo45902c("manufacturer", Build.MANUFACTURER).mo45902c("fingerprint", Build.FINGERPRINT).mo45901b("tz-offset", m32917k()).mo45900a("net-type", m32914g(activeNetworkInfo)).mo45900a("mobile-subtype", m32913f(activeNetworkInfo)).mo45902c("country", Locale.getDefault().getCountry()).mo45902c("locale", Locale.getDefault().getLanguage()).mo45902c("mcc_mnc", m32916j(this.f21672c).getSimOperator()).mo45902c("application_build", Integer.toString(m32915h(this.f21672c))).mo29761d();
    }

    /* renamed from: b */
    public BackendResponse mo29924b(C6639vw vwVar) {
        e00 i = mo29926i(vwVar);
        URL url = this.f21673d;
        String str = null;
        if (vwVar.mo29734c() != null) {
            try {
                n70 c = n70.m48646c(vwVar.mo29734c());
                if (c.mo46005d() != null) {
                    str = c.mo46005d();
                }
                if (c.mo46006e() != null) {
                    url = m32920n(c.mo46006e());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.m33171a();
            }
        }
        try {
            C3929b bVar = (C3929b) ng5.m48767a(5, new C3928a(url, i, str), new ac0(this), new bc0());
            int i2 = bVar.f21680a;
            if (i2 == 200) {
                return BackendResponse.m33172d(bVar.f21682c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    return BackendResponse.m33171a();
                }
            }
            return BackendResponse.m33173e();
        } catch (IOException e) {
            xk3.m54422c("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.m33173e();
        }
    }

    /* renamed from: e */
    public final C3929b mo29925e(C3928a aVar) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        xk3.m54420a("CctTransportBackend", "Making request to: %s", aVar.f21677a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f21677a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f21676g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, String.format("datatransport/%s android/", new Object[]{"3.0.0"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f21679c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f21670a.mo45622b(aVar.f21678b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                xk3.m54424e("CctTransportBackend", "Status Code: " + responseCode);
                xk3.m54424e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                xk3.m54424e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C3929b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C3929b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m32919m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C3929b bVar = new C3929b(responseCode, (URL) null, nk3.m48815b(new BufferedReader(new InputStreamReader(m))).mo43397c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            xk3.m54422c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C3929b(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            xk3.m54422c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C3929b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: i */
    public final e00 mo29926i(C6639vw vwVar) {
        ik3.C5967a aVar;
        HashMap hashMap = new HashMap();
        for (mt1 next : vwVar.mo29733b()) {
            String j = next.mo29758j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            mt1 mt1 = (mt1) ((List) entry.getValue()).get(0);
            mk3.C6252a b = mk3.m48333a().mo43009f(QosTier.DEFAULT).mo43010g(this.f21675f.mo28970a()).mo43011h(this.f21674e.mo28970a()).mo43005b(ClientInfo.m33136a().mo30119c(ClientInfo.ClientType.ANDROID_FIREBASE).mo30118b(C6153kh.m47066a().mo29093m(Integer.valueOf(mt1.mo45896g("sdk-version"))).mo29090j(mt1.mo45895b("model")).mo29086f(mt1.mo45895b("hardware")).mo29084d(mt1.mo45895b("device")).mo29092l(mt1.mo45895b("product")).mo29091k(mt1.mo45895b("os-uild")).mo29088h(mt1.mo45895b("manufacturer")).mo29085e(mt1.mo45895b("fingerprint")).mo29083c(mt1.mo45895b("country")).mo29087g(mt1.mo45895b("locale")).mo29089i(mt1.mo45895b("mcc_mnc")).mo29082b(mt1.mo45895b("application_build")).mo29081a()).mo30117a());
            try {
                b.mo45805i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo45806j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (mt1 mt12 : (List) entry.getValue()) {
                jp1 e = mt12.mo29754e();
                qp1 b2 = e.mo44555b();
                if (b2.equals(qp1.m50725b("proto"))) {
                    aVar = ik3.m45747j(e.mo44554a());
                } else if (b2.equals(qp1.m50725b("json"))) {
                    aVar = ik3.m45746i(new String(e.mo44554a(), Charset.forName("UTF-8")));
                } else {
                    xk3.m54425f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo42674c(mt12.mo29756f()).mo42675d(mt12.mo29759k()).mo42679h(mt12.mo45897h("tz-offset")).mo42676e(NetworkConnectionInfo.m33142a().mo30126c(NetworkConnectionInfo.NetworkType.forNumber(mt12.mo45896g("net-type"))).mo30125b(NetworkConnectionInfo.MobileSubtype.forNumber(mt12.mo45896g("mobile-subtype"))).mo30124a());
                if (mt12.mo29753d() != null) {
                    aVar.mo42673b(mt12.mo29753d());
                }
                arrayList3.add(aVar.mo42672a());
            }
            b.mo43006c(arrayList3);
            arrayList2.add(b.mo43004a());
        }
        return e00.m43748a(arrayList2);
    }

    public cc0(Context context, ah0 ah0, ah0 ah02) {
        this(context, ah0, ah02, 40000);
    }
}
