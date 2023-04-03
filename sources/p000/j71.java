package p000;

import android.content.Context;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.ContentDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.m81;
import p000.x11;

/* renamed from: j71 */
/* compiled from: DefaultDataSource */
public final class j71 implements x11 {

    /* renamed from: a */
    public final Context f13535a;

    /* renamed from: b */
    public final List<ov6> f13536b = new ArrayList();

    /* renamed from: c */
    public final x11 f13537c;

    /* renamed from: d */
    public x11 f13538d;

    /* renamed from: e */
    public x11 f13539e;

    /* renamed from: f */
    public x11 f13540f;

    /* renamed from: g */
    public x11 f13541g;

    /* renamed from: h */
    public x11 f13542h;

    /* renamed from: i */
    public x11 f13543i;

    /* renamed from: j */
    public x11 f13544j;

    /* renamed from: k */
    public x11 f13545k;

    /* renamed from: j71$a */
    /* compiled from: DefaultDataSource */
    public static final class C2584a implements x11.C3565a {

        /* renamed from: a */
        public final Context f13546a;

        /* renamed from: b */
        public final x11.C3565a f13547b;

        /* renamed from: c */
        public ov6 f13548c;

        public C2584a(Context context) {
            this(context, new m81.C2814b());
        }

        /* renamed from: b */
        public j71 mo21778a() {
            j71 j71 = new j71(this.f13546a, this.f13547b.mo21778a());
            ov6 ov6 = this.f13548c;
            if (ov6 != null) {
                j71.mo7617g(ov6);
            }
            return j71;
        }

        public C2584a(Context context, x11.C3565a aVar) {
            this.f13546a = context.getApplicationContext();
            this.f13547b = aVar;
        }
    }

    public j71(Context context, x11 x11) {
        this.f13535a = context.getApplicationContext();
        this.f13537c = (x11) C2725kr.m20985e(x11);
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws IOException {
        boolean z;
        if (this.f13545k == null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        String scheme = d21.f10437a.getScheme();
        if (w67.m29379s0(d21.f10437a)) {
            String path = d21.f10437a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f13545k = mo21773s();
            } else {
                this.f13545k = mo21770p();
            }
        } else if ("asset".equals(scheme)) {
            this.f13545k = mo21770p();
        } else if (PublicResolver.FUNC_CONTENT.equals(scheme)) {
            this.f13545k = mo21771q();
        } else if ("rtmp".equals(scheme)) {
            this.f13545k = mo21775u();
        } else if ("udp".equals(scheme)) {
            this.f13545k = mo21776v();
        } else if ("data".equals(scheme)) {
            this.f13545k = mo21772r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f13545k = mo21774t();
        } else {
            this.f13545k = this.f13537c;
        }
        return this.f13545k.mo6964b(d21);
    }

    public void close() throws IOException {
        x11 x11 = this.f13545k;
        if (x11 != null) {
            try {
                x11.close();
            } finally {
                this.f13545k = null;
            }
        }
    }

    /* renamed from: d */
    public Map<String, List<String>> mo7616d() {
        x11 x11 = this.f13545k;
        if (x11 == null) {
            return Collections.emptyMap();
        }
        return x11.mo7616d();
    }

    /* renamed from: g */
    public void mo7617g(ov6 ov6) {
        C2725kr.m20985e(ov6);
        this.f13537c.mo7617g(ov6);
        this.f13536b.add(ov6);
        mo21777w(this.f13538d, ov6);
        mo21777w(this.f13539e, ov6);
        mo21777w(this.f13540f, ov6);
        mo21777w(this.f13541g, ov6);
        mo21777w(this.f13542h, ov6);
        mo21777w(this.f13543i, ov6);
        mo21777w(this.f13544j, ov6);
    }

    /* renamed from: m */
    public Uri mo6966m() {
        x11 x11 = this.f13545k;
        if (x11 == null) {
            return null;
        }
        return x11.mo6966m();
    }

    /* renamed from: o */
    public final void mo21769o(x11 x11) {
        for (int i = 0; i < this.f13536b.size(); i++) {
            x11.mo7617g(this.f13536b.get(i));
        }
    }

    /* renamed from: p */
    public final x11 mo21770p() {
        if (this.f13539e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f13535a);
            this.f13539e = assetDataSource;
            mo21769o(assetDataSource);
        }
        return this.f13539e;
    }

    /* renamed from: q */
    public final x11 mo21771q() {
        if (this.f13540f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f13535a);
            this.f13540f = contentDataSource;
            mo21769o(contentDataSource);
        }
        return this.f13540f;
    }

    /* renamed from: r */
    public final x11 mo21772r() {
        if (this.f13543i == null) {
            v11 v11 = new v11();
            this.f13543i = v11;
            mo21769o(v11);
        }
        return this.f13543i;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((x11) C2725kr.m20985e(this.f13545k)).read(bArr, i, i2);
    }

    /* renamed from: s */
    public final x11 mo21773s() {
        if (this.f13538d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f13538d = fileDataSource;
            mo21769o(fileDataSource);
        }
        return this.f13538d;
    }

    /* renamed from: t */
    public final x11 mo21774t() {
        if (this.f13544j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f13535a);
            this.f13544j = rawResourceDataSource;
            mo21769o(rawResourceDataSource);
        }
        return this.f13544j;
    }

    /* renamed from: u */
    public final x11 mo21775u() {
        if (this.f13541g == null) {
            try {
                x11 x11 = (x11) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f13541g = x11;
                mo21769o(x11);
            } catch (ClassNotFoundException unused) {
                gk3.m18132i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f13541g == null) {
                this.f13541g = this.f13537c;
            }
        }
        return this.f13541g;
    }

    /* renamed from: v */
    public final x11 mo21776v() {
        if (this.f13542h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f13542h = udpDataSource;
            mo21769o(udpDataSource);
        }
        return this.f13542h;
    }

    /* renamed from: w */
    public final void mo21777w(x11 x11, ov6 ov6) {
        if (x11 != null) {
            x11.mo7617g(ov6);
        }
    }
}
