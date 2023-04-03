package androidx.media3.extractor.text;

import androidx.media3.decoder.DecoderException;

public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(String str) {
        super(str);
    }

    public SubtitleDecoderException(Throwable th) {
        super(th);
    }

    public SubtitleDecoderException(String str, Throwable th) {
        super(str, th);
    }
}
