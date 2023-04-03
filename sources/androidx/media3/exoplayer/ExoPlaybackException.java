package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C0785d;
import androidx.media3.common.C0792h;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import okhttp3.internal.p023ws.WebSocketProtocol;

public final class ExoPlaybackException extends PlaybackException {
    public static final C0785d.C0786a<ExoPlaybackException> CREATOR = new iv1();
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final boolean isRecoverable;
    public final nr3 mediaPeriodId;
    public final C0792h rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (C0792h) null, 4, false);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, (Throwable) null, str, 1001, (String) null, -1, (C0792h) null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, C0792h hVar, int i2, boolean z, int i3) {
        int i4;
        if (hVar == null) {
            i4 = 4;
        } else {
            i4 = i2;
        }
        return new ExoPlaybackException(1, th, (String) null, i3, str, i, hVar, i4, z);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    /* renamed from: d */
    public static /* synthetic */ ExoPlaybackException m5960d(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    /* renamed from: e */
    public static String m5961e(int i, String str, String str2, int i2, C0792h hVar, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            str3 = str2 + " error, index=" + i2 + ", format=" + hVar + ", format_supported=" + w67.m29332T(i3);
        } else if (i != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public ExoPlaybackException copyWithMediaPeriodId(nr3 nr3) {
        return new ExoPlaybackException((String) w67.m29360j(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, nr3, this.timestampMs, this.isRecoverable);
    }

    public boolean errorInfoEquals(PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) w67.m29360j(playbackException);
        if (this.type == exoPlaybackException.type && w67.m29346c(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && w67.m29346c(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && w67.m29346c(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable) {
            return true;
        }
        return false;
    }

    public Exception getRendererException() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        C2725kr.m20987g(z);
        return (Exception) C2725kr.m20985e(getCause());
    }

    public IOException getSourceException() {
        boolean z;
        if (this.type == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        return (IOException) C2725kr.m20985e(getCause());
    }

    public RuntimeException getUnexpectedException() {
        boolean z;
        if (this.type == 2) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        return (RuntimeException) C2725kr.m20985e(getCause());
    }

    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(PlaybackException.keyForField(1001), this.type);
        bundle.putString(PlaybackException.keyForField(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW), this.rendererName);
        bundle.putInt(PlaybackException.keyForField(PlaybackException.ERROR_CODE_TIMEOUT), this.rendererIndex);
        if (this.rendererFormat != null) {
            bundle.putBundle(PlaybackException.keyForField(PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK), this.rendererFormat.toBundle());
        }
        bundle.putInt(PlaybackException.keyForField(WebSocketProtocol.CLOSE_NO_STATUS_CODE), this.rendererFormatSupport);
        bundle.putBoolean(PlaybackException.keyForField(1006), this.isRecoverable);
        return bundle;
    }

    public ExoPlaybackException(int i, Throwable th, String str, int i2, String str2, int i3, C0792h hVar, int i4, boolean z) {
        this(m5961e(i, str, str2, i3, hVar, i4), th, i2, i, str2, i3, hVar, i4, (nr3) null, SystemClock.elapsedRealtime(), z);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    public ExoPlaybackException(Bundle bundle) {
        super(bundle);
        C0792h hVar;
        this.type = bundle.getInt(PlaybackException.keyForField(1001), 2);
        this.rendererName = bundle.getString(PlaybackException.keyForField(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW));
        this.rendererIndex = bundle.getInt(PlaybackException.keyForField(PlaybackException.ERROR_CODE_TIMEOUT), -1);
        Bundle bundle2 = bundle.getBundle(PlaybackException.keyForField(PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK));
        if (bundle2 == null) {
            hVar = null;
        } else {
            hVar = C0792h.f4172u1.mo104a(bundle2);
        }
        this.rendererFormat = hVar;
        this.rendererFormatSupport = bundle.getInt(PlaybackException.keyForField(WebSocketProtocol.CLOSE_NO_STATUS_CODE), 4);
        this.isRecoverable = bundle.getBoolean(PlaybackException.keyForField(1006), false);
        this.mediaPeriodId = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, C0792h hVar, int i4, nr3 nr3, long j, boolean z) {
        super(str, th, i, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        C2725kr.m20981a(!z2 || i5 == 1);
        C2725kr.m20981a((th != null || i5 == 3) ? true : z3);
        this.type = i5;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = hVar;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = nr3;
        this.isRecoverable = z2;
    }
}
