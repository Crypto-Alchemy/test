package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.C0798k;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import com.google.common.primitives.Ints;
import java.util.Map;
import p000.m81;
import p000.x11;

/* renamed from: androidx.media3.exoplayer.drm.a */
/* compiled from: DefaultDrmSessionManagerProvider */
public final class C0908a implements rk1 {

    /* renamed from: a */
    public final Object f5001a = new Object();

    /* renamed from: b */
    public C0798k.C0805f f5002b;

    /* renamed from: c */
    public C0912c f5003c;

    /* renamed from: d */
    public x11.C3565a f5004d;

    /* renamed from: e */
    public String f5005e;

    /* renamed from: a */
    public C0912c mo7378a(C0798k kVar) {
        C0912c cVar;
        C2725kr.m20985e(kVar.f4244d);
        C0798k.C0805f fVar = kVar.f4244d.f4309c;
        if (fVar == null || w67.f19021a < 18) {
            return C0912c.f5011a;
        }
        synchronized (this.f5001a) {
            if (!w67.m29346c(fVar, this.f5002b)) {
                this.f5002b = fVar;
                this.f5003c = mo7379b(fVar);
            }
            cVar = (C0912c) C2725kr.m20985e(this.f5003c);
        }
        return cVar;
    }

    /* renamed from: b */
    public final C0912c mo7379b(C0798k.C0805f fVar) {
        String str;
        x11.C3565a aVar = this.f5004d;
        if (aVar == null) {
            aVar = new m81.C2814b().mo23080c(this.f5005e);
        }
        Uri uri = fVar.f4278c;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        C0928i iVar = new C0928i(str, fVar.f4283h, aVar);
        c47<Map.Entry<String, String>> it = fVar.f4280e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            iVar.mo7419e((String) next.getKey(), (String) next.getValue());
        }
        DefaultDrmSessionManager a = new DefaultDrmSessionManager.C0902b().mo7372e(fVar.f4276a, C0926h.f5020d).mo7369b(fVar.f4281f).mo7370c(fVar.f4282g).mo7371d(Ints.m37052k(fVar.f4285j)).mo7368a(iVar);
        a.mo7356G(0, fVar.mo6772c());
        return a;
    }
}
