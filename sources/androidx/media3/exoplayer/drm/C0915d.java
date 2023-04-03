package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* renamed from: androidx.media3.exoplayer.drm.d */
/* compiled from: DrmUtil */
public final class C0915d {

    /* renamed from: androidx.media3.exoplayer.drm.d$a */
    /* compiled from: DrmUtil */
    public static final class C0916a {
        /* renamed from: a */
        public static boolean m6616a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        /* renamed from: b */
        public static boolean m6617b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.d$b */
    /* compiled from: DrmUtil */
    public static final class C0917b {
        /* renamed from: a */
        public static boolean m6618a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m6619b(Throwable th) {
            return w67.m29328R(w67.m29330S(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.d$c */
    /* compiled from: DrmUtil */
    public static final class C0918c {
        /* renamed from: a */
        public static boolean m6620a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m6615a(Exception exc, int i) {
        int i2 = w67.f19021a;
        if (i2 >= 21 && C0917b.m6618a(exc)) {
            return C0917b.m6619b(exc);
        }
        if (i2 >= 23 && C0918c.m6620a(exc)) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i2 >= 18 && C0916a.m6617b(exc)) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        if (i2 >= 18 && C0916a.m6616a(exc)) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (exc instanceof UnsupportedDrmException) {
            return PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
        }
        if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        if (exc instanceof KeysExpiredException) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 3) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        throw new IllegalArgumentException();
    }
}
