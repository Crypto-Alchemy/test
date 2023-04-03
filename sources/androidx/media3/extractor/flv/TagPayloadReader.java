package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;

public abstract class TagPayloadReader {

    /* renamed from: a */
    public final zs6 f5546a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    public TagPayloadReader(zs6 zs6) {
        this.f5546a = zs6;
    }

    /* renamed from: a */
    public final boolean mo7879a(gm4 gm4, long j) throws ParserException {
        if (!mo7880b(gm4) || !mo7881c(gm4, j)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public abstract boolean mo7880b(gm4 gm4) throws ParserException;

    /* renamed from: c */
    public abstract boolean mo7881c(gm4 gm4, long j) throws ParserException;
}
