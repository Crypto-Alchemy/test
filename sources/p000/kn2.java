package p000;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p000.r11;

/* renamed from: kn2 */
/* compiled from: HttpUrlFetcher */
public class kn2 implements r11<InputStream> {

    /* renamed from: s */
    public static final C2718b f14216s = new C2717a();

    /* renamed from: a */
    public final dh2 f14217a;

    /* renamed from: d */
    public final int f14218d;

    /* renamed from: e */
    public final C2718b f14219e;

    /* renamed from: g */
    public HttpURLConnection f14220g;

    /* renamed from: k */
    public InputStream f14221k;

    /* renamed from: r */
    public volatile boolean f14222r;

    /* renamed from: kn2$a */
    /* compiled from: HttpUrlFetcher */
    public static class C2717a implements C2718b {
        /* renamed from: a */
        public HttpURLConnection mo22416a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: kn2$b */
    /* compiled from: HttpUrlFetcher */
    public interface C2718b {
        /* renamed from: a */
        HttpURLConnection mo22416a(URL url) throws IOException;
    }

    public kn2(dh2 dh2, int i) {
        this(dh2, i, f14216s);
    }

    /* renamed from: f */
    public static int m20916f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public static boolean m20917h(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m20918i(int i) {
        if (i / 100 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Class<InputStream> mo11939a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo11940b() {
        InputStream inputStream = this.f14221k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f14220g;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f14220g = null;
    }

    /* renamed from: c */
    public final HttpURLConnection mo22413c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a = this.f14219e.mo22416a(url);
            for (Map.Entry next : map.entrySet()) {
                a.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            a.setConnectTimeout(this.f14218d);
            a.setReadTimeout(this.f14218d);
            a.setUseCaches(false);
            a.setDoInput(true);
            a.setInstanceFollowRedirects(false);
            return a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    public void cancel() {
        this.f14222r = true;
    }

    /* renamed from: d */
    public void mo11943d(Priority priority, r11.C3179a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = ok3.m23850b();
        try {
            aVar.mo12487f(mo22415j(this.f14217a.mo18781i(), 0, (URL) null, this.f14217a.mo18777e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(ok3.m23849a(b));
            }
        } catch (IOException e) {
            boolean isLoggable = Log.isLoggable("HttpUrlFetcher", 3);
            aVar.mo12485c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(ok3.m23849a(b));
            }
            throw th;
        }
    }

    /* renamed from: e */
    public DataSource mo11944e() {
        return DataSource.REMOTE;
    }

    /* renamed from: g */
    public final InputStream mo22414g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f14221k = sr0.m27081b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.f14221k = httpURLConnection.getInputStream();
            }
            return this.f14221k;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m20916f(httpURLConnection), e);
        }
    }

    /* renamed from: j */
    public final InputStream mo22415j(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = mo22413c(url, map);
            this.f14220g = c;
            try {
                c.connect();
                this.f14221k = this.f14220g.getInputStream();
                if (this.f14222r) {
                    return null;
                }
                int f = m20916f(this.f14220g);
                if (m20917h(f)) {
                    return mo22414g(this.f14220g);
                }
                if (m20918i(f)) {
                    String headerField = this.f14220g.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            mo11940b();
                            return mo22415j(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new HttpException("Bad redirect url: " + headerField, f, e);
                        }
                    } else {
                        throw new HttpException("Received empty or null redirect url", f);
                    }
                } else if (f == -1) {
                    throw new HttpException(f);
                } else {
                    try {
                        throw new HttpException(this.f14220g.getResponseMessage(), f);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", f, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", m20916f(this.f14220g), e3);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
    }

    public kn2(dh2 dh2, int i, C2718b bVar) {
        this.f14217a = dh2;
        this.f14218d = i;
        this.f14219e = bVar;
    }
}
