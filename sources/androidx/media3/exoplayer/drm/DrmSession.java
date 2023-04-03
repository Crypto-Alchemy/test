package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.C0909b;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.errorCode = i;
        }
    }

    /* renamed from: a */
    UUID mo7319a();

    /* renamed from: b */
    boolean mo7320b();

    /* renamed from: c */
    hw0 mo7321c();

    /* renamed from: d */
    void mo7322d(C0909b.C0910a aVar);

    /* renamed from: e */
    Map<String, String> mo7323e();

    /* renamed from: f */
    void mo7324f(C0909b.C0910a aVar);

    /* renamed from: g */
    boolean mo7325g(String str);

    DrmSessionException getError();

    int getState();
}
