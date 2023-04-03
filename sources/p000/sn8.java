package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: sn8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class sn8 extends t49 {

    /* renamed from: d */
    public final SSLSocketFactory f33974d = null;

    public sn8(s59 s59) {
        super(s59);
    }

    /* renamed from: h */
    public final boolean mo43450h() {
        return false;
    }

    /* renamed from: j */
    public final boolean mo47844j() {
        mo47982g();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f34342a.mo45271q().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final HttpURLConnection mo47845k(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f33974d;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            this.f34342a.mo45274y();
            httpURLConnection.setConnectTimeout(60000);
            this.f34342a.mo45274y();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
