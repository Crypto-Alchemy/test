package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.C0792h;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.DrmSession;

/* renamed from: androidx.media3.exoplayer.drm.c */
/* compiled from: DrmSessionManager */
public interface C0912c {

    /* renamed from: a */
    public static final C0912c f5011a;
    @Deprecated

    /* renamed from: b */
    public static final C0912c f5012b;

    /* renamed from: androidx.media3.exoplayer.drm.c$a */
    /* compiled from: DrmSessionManager */
    public class C0913a implements C0912c {
        /* renamed from: a */
        public /* synthetic */ void mo7358a() {
            ok1.m23848c(this);
        }

        /* renamed from: b */
        public void mo7359b(Looper looper, br4 br4) {
        }

        /* renamed from: c */
        public DrmSession mo7360c(C0909b.C0910a aVar, C0792h hVar) {
            if (hVar.f4178L == null) {
                return null;
            }
            return new C0920f(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED));
        }

        /* renamed from: d */
        public int mo7361d(C0792h hVar) {
            if (hVar.f4178L != null) {
                return 1;
            }
            return 0;
        }

        /* renamed from: e */
        public /* synthetic */ void mo7362e() {
            ok1.m23847b(this);
        }

        /* renamed from: f */
        public /* synthetic */ C0914b mo7363f(C0909b.C0910a aVar, C0792h hVar) {
            return ok1.m23846a(this, aVar, hVar);
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.c$b */
    /* compiled from: DrmSessionManager */
    public interface C0914b {

        /* renamed from: a */
        public static final C0914b f5013a = new pk1();

        /* renamed from: a */
        void mo7375a();
    }

    static {
        C0913a aVar = new C0913a();
        f5011a = aVar;
        f5012b = aVar;
    }

    /* renamed from: a */
    void mo7358a();

    /* renamed from: b */
    void mo7359b(Looper looper, br4 br4);

    /* renamed from: c */
    DrmSession mo7360c(C0909b.C0910a aVar, C0792h hVar);

    /* renamed from: d */
    int mo7361d(C0792h hVar);

    /* renamed from: e */
    void mo7362e();

    /* renamed from: f */
    C0914b mo7363f(C0909b.C0910a aVar, C0792h hVar);
}
