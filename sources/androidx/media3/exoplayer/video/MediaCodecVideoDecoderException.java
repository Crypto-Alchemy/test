package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.C0945d;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;

public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th, C0945d dVar, Surface surface) {
        super(th, dVar);
        boolean z;
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        if (surface == null || surface.isValid()) {
            z = true;
        } else {
            z = false;
        }
        this.isSurfaceValid = z;
    }
}
