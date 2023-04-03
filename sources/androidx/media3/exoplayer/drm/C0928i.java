package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.C0921g;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000.d21;
import p000.x11;

/* renamed from: androidx.media3.exoplayer.drm.i */
/* compiled from: HttpMediaDrmCallback */
public final class C0928i implements C0929j {

    /* renamed from: a */
    public final x11.C3565a f5024a;

    /* renamed from: b */
    public final String f5025b;

    /* renamed from: c */
    public final boolean f5026c;

    /* renamed from: d */
    public final Map<String, String> f5027d;

    public C0928i(String str, boolean z, x11.C3565a aVar) {
        boolean z2;
        if (!z || !TextUtils.isEmpty(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        this.f5024a = aVar;
        this.f5025b = str;
        this.f5026c = z;
        this.f5027d = new HashMap();
    }

    /* renamed from: c */
    public static byte[] m6693c(x11.C3565a aVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        a21 a21;
        n96 n96 = new n96(aVar.mo21778a());
        d21 a = new d21.C2129b().mo18412j(str).mo18407e(map).mo18406d(2).mo18405c(bArr).mo18404b(1).mo18403a();
        int i = 0;
        d21 d21 = a;
        while (true) {
            try {
                a21 = new a21(n96, d21);
                byte[] Q0 = w67.m29327Q0(a21);
                w67.m29368n(a21);
                return Q0;
            } catch (HttpDataSource$InvalidResponseCodeException e) {
                String d = m6694d(e, i);
                if (d != null) {
                    i++;
                    d21 = d21.mo18397a().mo18412j(d).mo18403a();
                    w67.m29368n(a21);
                } else {
                    throw e;
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(a, (Uri) C2725kr.m20985e(n96.mo23540p()), n96.mo7616d(), n96.mo23539o(), e2);
            } catch (Throwable th) {
                w67.m29368n(a21);
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static String m6694d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i) {
        boolean z;
        Map<String, List<String>> map;
        List list;
        int i2 = httpDataSource$InvalidResponseCodeException.responseCode;
        if ((i2 == 307 || i2 == 308) && i < 5) {
            z = true;
        } else {
            z = false;
        }
        if (z && (map = httpDataSource$InvalidResponseCodeException.headerFields) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public byte[] mo7417a(UUID uuid, C0921g.C0922a aVar) throws MediaDrmCallbackException {
        String str;
        String b = aVar.mo7411b();
        if (this.f5026c || TextUtils.isEmpty(b)) {
            b = this.f5025b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = l70.f14427e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (l70.f14425c.equals(uuid)) {
                str = Constants.APPLICATION_JSON;
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f5027d) {
                hashMap.putAll(this.f5027d);
            }
            return m6693c(this.f5024a, b, aVar.mo7410a(), hashMap);
        }
        throw new MediaDrmCallbackException(new d21.C2129b().mo18411i(Uri.EMPTY).mo18403a(), Uri.EMPTY, ImmutableMap.m36661of(), 0, new IllegalStateException("No license URL"));
    }

    /* renamed from: b */
    public byte[] mo7418b(UUID uuid, C0921g.C0925d dVar) throws MediaDrmCallbackException {
        return m6693c(this.f5024a, dVar.mo7414b() + "&signedRequest=" + w67.m29296B(dVar.mo7413a()), (byte[]) null, Collections.emptyMap());
    }

    /* renamed from: e */
    public void mo7419e(String str, String str2) {
        C2725kr.m20985e(str);
        C2725kr.m20985e(str2);
        synchronized (this.f5027d) {
            this.f5027d.put(str, str2);
        }
    }
}
