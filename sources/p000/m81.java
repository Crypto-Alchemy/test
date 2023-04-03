package p000;

import android.net.Uri;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.C4632i;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import p000.x11;

/* renamed from: m81 */
/* compiled from: DefaultHttpDataSource */
public class m81 extends C3009oy {

    /* renamed from: e */
    public final boolean f14860e;

    /* renamed from: f */
    public final int f14861f;

    /* renamed from: g */
    public final int f14862g;

    /* renamed from: h */
    public final String f14863h;

    /* renamed from: i */
    public final bn2 f14864i;

    /* renamed from: j */
    public final bn2 f14865j;

    /* renamed from: k */
    public final boolean f14866k;

    /* renamed from: l */
    public ku4<String> f14867l;

    /* renamed from: m */
    public d21 f14868m;

    /* renamed from: n */
    public HttpURLConnection f14869n;

    /* renamed from: o */
    public InputStream f14870o;

    /* renamed from: p */
    public boolean f14871p;

    /* renamed from: q */
    public int f14872q;

    /* renamed from: r */
    public long f14873r;

    /* renamed from: s */
    public long f14874s;

    /* renamed from: m81$b */
    /* compiled from: DefaultHttpDataSource */
    public static final class C2814b implements x11.C3565a {

        /* renamed from: a */
        public final bn2 f14875a = new bn2();

        /* renamed from: b */
        public ov6 f14876b;

        /* renamed from: c */
        public ku4<String> f14877c;

        /* renamed from: d */
        public String f14878d;

        /* renamed from: e */
        public int f14879e = 8000;

        /* renamed from: f */
        public int f14880f = 8000;

        /* renamed from: g */
        public boolean f14881g;

        /* renamed from: h */
        public boolean f14882h;

        /* renamed from: b */
        public m81 mo21778a() {
            m81 m81 = new m81(this.f14878d, this.f14879e, this.f14880f, this.f14881g, this.f14875a, this.f14877c, this.f14882h);
            ov6 ov6 = this.f14876b;
            if (ov6 != null) {
                m81.mo7617g(ov6);
            }
            return m81;
        }

        /* renamed from: c */
        public C2814b mo23080c(String str) {
            this.f14878d = str;
            return this;
        }
    }

    /* renamed from: m81$c */
    /* compiled from: DefaultHttpDataSource */
    public static class C2815c extends l82<String, List<String>> {

        /* renamed from: a */
        public final Map<String, List<String>> f14883a;

        public C2815c(Map<String, List<String>> map) {
            this.f14883a = map;
        }

        /* renamed from: d */
        public static /* synthetic */ boolean m22088d(Map.Entry entry) {
            if (entry.getKey() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public static /* synthetic */ boolean m22089e(String str) {
            return str != null;
        }

        /* renamed from: c */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public boolean containsKey(Object obj) {
            if (obj == null || !super.containsKey(obj)) {
                return false;
            }
            return true;
        }

        public boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        public Set<Map.Entry<String, List<String>>> entrySet() {
            return C4632i.m37031b(super.entrySet(), new n81());
        }

        public boolean equals(Object obj) {
            if (obj == null || !super.standardEquals(obj)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return super.standardHashCode();
        }

        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            if (super.size() != 1 || !super.containsKey((Object) null)) {
                return false;
            }
            return true;
        }

        public Set<String> keySet() {
            return C4632i.m37031b(super.keySet(), new o81());
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }

        public Map<String, List<String>> delegate() {
            return this.f14883a;
        }
    }

    /* renamed from: u */
    public static boolean m22071u(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: x */
    public static void m22072x(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = w67.f19021a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C2725kr.m20985e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: A */
    public final void mo23072A(long j, d21 d21) throws IOException {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                int read = ((InputStream) w67.m29360j(this.f14870o)).read(bArr, 0, (int) Math.min(j, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new HttpDataSource$HttpDataSourceException((IOException) new InterruptedIOException(), d21, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED, 1);
                } else if (read != -1) {
                    j -= (long) read;
                    mo24279o(read);
                } else {
                    throw new HttpDataSource$HttpDataSourceException(d21, 2008, 1);
                }
            }
        }
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws HttpDataSource$HttpDataSourceException {
        byte[] bArr;
        DataSourceException dataSourceException;
        this.f14868m = d21;
        long j = 0;
        this.f14874s = 0;
        this.f14873r = 0;
        mo24281q(d21);
        try {
            HttpURLConnection v = mo23075v(d21);
            this.f14869n = v;
            this.f14872q = v.getResponseCode();
            String responseMessage = v.getResponseMessage();
            int i = this.f14872q;
            long j2 = -1;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = v.getHeaderFields();
                if (this.f14872q == 416) {
                    if (d21.f10443g == ln2.m21630c(v.getHeaderField("Content-Range"))) {
                        this.f14871p = true;
                        mo24282r(d21);
                        long j3 = d21.f10444h;
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = v.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = w67.m29327Q0(errorStream);
                    } catch (IOException unused) {
                        bArr = w67.f19026f;
                    }
                } else {
                    bArr = w67.f19026f;
                }
                byte[] bArr2 = bArr;
                mo23073s();
                if (this.f14872q == 416) {
                    dataSourceException = new DataSourceException(2008);
                } else {
                    dataSourceException = null;
                }
                throw new HttpDataSource$InvalidResponseCodeException(this.f14872q, responseMessage, dataSourceException, headerFields, d21, bArr2);
            }
            String contentType = v.getContentType();
            ku4<String> ku4 = this.f14867l;
            if (ku4 == null || ku4.apply(contentType)) {
                if (this.f14872q == 200) {
                    long j4 = d21.f10443g;
                    if (j4 != 0) {
                        j = j4;
                    }
                }
                boolean u = m22071u(v);
                if (!u) {
                    long j5 = d21.f10444h;
                    if (j5 != -1) {
                        this.f14873r = j5;
                    } else {
                        long b = ln2.m21629b(v.getHeaderField("Content-Length"), v.getHeaderField("Content-Range"));
                        if (b != -1) {
                            j2 = b - j;
                        }
                        this.f14873r = j2;
                    }
                } else {
                    this.f14873r = d21.f10444h;
                }
                try {
                    this.f14870o = v.getInputStream();
                    if (u) {
                        this.f14870o = new GZIPInputStream(this.f14870o);
                    }
                    this.f14871p = true;
                    mo24282r(d21);
                    try {
                        mo23072A(j, d21);
                        return this.f14873r;
                    } catch (IOException e) {
                        mo23073s();
                        if (e instanceof HttpDataSource$HttpDataSourceException) {
                            throw ((HttpDataSource$HttpDataSourceException) e);
                        }
                        throw new HttpDataSource$HttpDataSourceException(e, d21, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED, 1);
                    }
                } catch (IOException e2) {
                    mo23073s();
                    throw new HttpDataSource$HttpDataSourceException(e2, d21, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED, 1);
                }
            } else {
                mo23073s();
                throw new HttpDataSource$InvalidContentTypeException(contentType, d21);
            }
        } catch (IOException e3) {
            mo23073s();
            throw HttpDataSource$HttpDataSourceException.createForIOException(e3, d21, 1);
        }
    }

    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f14870o;
            if (inputStream != null) {
                long j = this.f14873r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f14874s;
                }
                m22072x(this.f14869n, j2);
                inputStream.close();
            }
            this.f14870o = null;
            mo23073s();
            if (this.f14871p) {
                this.f14871p = false;
                mo24280p();
            }
        } catch (IOException e) {
            throw new HttpDataSource$HttpDataSourceException(e, (d21) w67.m29360j(this.f14868m), (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED, 3);
        } catch (Throwable th) {
            this.f14870o = null;
            mo23073s();
            if (this.f14871p) {
                this.f14871p = false;
                mo24280p();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public Map<String, List<String>> mo7616d() {
        HttpURLConnection httpURLConnection = this.f14869n;
        if (httpURLConnection == null) {
            return ImmutableMap.m36661of();
        }
        return new C2815c(httpURLConnection.getHeaderFields());
    }

    /* renamed from: m */
    public Uri mo6966m() {
        HttpURLConnection httpURLConnection = this.f14869n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            return mo23078z(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.createForIOException(e, (d21) w67.m29360j(this.f14868m), 2);
        }
    }

    /* renamed from: s */
    public final void mo23073s() {
        HttpURLConnection httpURLConnection = this.f14869n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                gk3.m18127d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f14869n = null;
        }
    }

    /* renamed from: t */
    public final URL mo23074t(URL url, String str, d21 d21) throws HttpDataSource$HttpDataSourceException {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, d21, (int) PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
                } else if (this.f14860e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", d21, (int) PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
                }
            } catch (MalformedURLException e) {
                throw new HttpDataSource$HttpDataSourceException((IOException) e, d21, (int) PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
        } else {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", d21, (int) PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
        }
    }

    /* renamed from: v */
    public final HttpURLConnection mo23075v(d21 d21) throws IOException {
        HttpURLConnection w;
        boolean z;
        d21 d212 = d21;
        URL url = new URL(d212.f10437a.toString());
        int i = d212.f10439c;
        byte[] bArr = d212.f10440d;
        long j = d212.f10443g;
        long j2 = d212.f10444h;
        boolean d = d212.mo18399d(1);
        if (!this.f14860e && !this.f14866k) {
            return mo23076w(url, i, bArr, j, j2, d, true, d212.f10441e);
        }
        URL url2 = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j3 = j;
                long j4 = j;
                int i5 = i2;
                int i6 = i4;
                URL url3 = url2;
                long j5 = j2;
                w = mo23076w(url2, i2, bArr2, j3, j2, d, false, d212.f10441e);
                int responseCode = w.getResponseCode();
                String headerField = w.getHeaderField("Location");
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    w.disconnect();
                    url2 = mo23074t(url3, headerField, d212);
                    i2 = i5;
                } else if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return w;
                } else {
                    w.disconnect();
                    if (!this.f14866k || responseCode != 302) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        bArr2 = null;
                        i2 = 1;
                    } else {
                        i2 = i5;
                    }
                    url2 = mo23074t(url3, headerField, d212);
                }
                i3 = i6;
                j = j4;
                j2 = j5;
            } else {
                throw new HttpDataSource$HttpDataSourceException((IOException) new NoRouteToHostException("Too many redirects: " + i4), d212, (int) PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 1);
            }
        }
        return w;
    }

    /* renamed from: w */
    public final HttpURLConnection mo23076w(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String str;
        boolean z3;
        HttpURLConnection y = mo23077y(url);
        y.setConnectTimeout(this.f14861f);
        y.setReadTimeout(this.f14862g);
        HashMap hashMap = new HashMap();
        bn2 bn2 = this.f14864i;
        if (bn2 != null) {
            hashMap.putAll(bn2.mo11708a());
        }
        hashMap.putAll(this.f14865j.mo11708a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            y.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = ln2.m21628a(j, j2);
        if (a != null) {
            y.setRequestProperty("Range", a);
        }
        String str2 = this.f14863h;
        if (str2 != null) {
            y.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, str2);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        y.setRequestProperty("Accept-Encoding", str);
        y.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.setDoOutput(z3);
        y.setRequestMethod(d21.m14663c(i));
        if (bArr != null) {
            y.setFixedLengthStreamingMode(bArr.length);
            y.connect();
            OutputStream outputStream = y.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            y.connect();
        }
        return y;
    }

    /* renamed from: y */
    public HttpURLConnection mo23077y(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: z */
    public final int mo23078z(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14873r;
        if (j != -1) {
            long j2 = j - this.f14874s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = ((InputStream) w67.m29360j(this.f14870o)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f14874s += (long) read;
        mo24279o(read);
        return read;
    }

    public m81(String str, int i, int i2, boolean z, bn2 bn2, ku4<String> ku4, boolean z2) {
        super(true);
        this.f14863h = str;
        this.f14861f = i;
        this.f14862g = i2;
        this.f14860e = z;
        this.f14864i = bn2;
        this.f14867l = ku4;
        this.f14865j = new bn2();
        this.f14866k = z2;
    }
}
