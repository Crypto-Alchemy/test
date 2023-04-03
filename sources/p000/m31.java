package p000;

import androidx.media3.decoder.DecoderException;

/* renamed from: m31 */
/* compiled from: Decoder */
public interface m31<I, O, E extends DecoderException> {
    /* renamed from: a */
    void mo18654a();

    /* renamed from: c */
    O mo18656c() throws DecoderException;

    /* renamed from: d */
    void mo19501d(I i) throws DecoderException;

    /* renamed from: e */
    I mo19502e() throws DecoderException;

    void flush();
}
