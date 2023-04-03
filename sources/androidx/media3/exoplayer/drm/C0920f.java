package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Map;
import java.util.UUID;

/* renamed from: androidx.media3.exoplayer.drm.f */
/* compiled from: ErrorStateDrmSession */
public final class C0920f implements DrmSession {

    /* renamed from: a */
    public final DrmSession.DrmSessionException f5014a;

    public C0920f(DrmSession.DrmSessionException drmSessionException) {
        this.f5014a = (DrmSession.DrmSessionException) C2725kr.m20985e(drmSessionException);
    }

    /* renamed from: a */
    public final UUID mo7319a() {
        return l70.f14423a;
    }

    /* renamed from: b */
    public boolean mo7320b() {
        return false;
    }

    /* renamed from: c */
    public hw0 mo7321c() {
        return null;
    }

    /* renamed from: d */
    public void mo7322d(C0909b.C0910a aVar) {
    }

    /* renamed from: e */
    public Map<String, String> mo7323e() {
        return null;
    }

    /* renamed from: f */
    public void mo7324f(C0909b.C0910a aVar) {
    }

    /* renamed from: g */
    public boolean mo7325g(String str) {
        return false;
    }

    public DrmSession.DrmSessionException getError() {
        return this.f5014a;
    }

    public int getState() {
        return 1;
    }
}
