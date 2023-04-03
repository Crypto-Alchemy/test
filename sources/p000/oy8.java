package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: oy8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class oy8 extends vt8 {

    /* renamed from: c */
    public final SSLSocketFactory f32501c = null;

    public oy8(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: f */
    public final boolean mo29669f() {
        return false;
    }

    /* renamed from: l */
    public final HttpURLConnection mo46566l(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f32501c;
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
