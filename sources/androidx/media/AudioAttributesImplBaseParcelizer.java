package androidx.media;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(d97 d97) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4006a = d97.mo18624p(audioAttributesImplBase.f4006a, 1);
        audioAttributesImplBase.f4007b = d97.mo18624p(audioAttributesImplBase.f4007b, 2);
        audioAttributesImplBase.f4008c = d97.mo18624p(audioAttributesImplBase.f4008c, 3);
        audioAttributesImplBase.f4009d = d97.mo18624p(audioAttributesImplBase.f4009d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, d97 d97) {
        d97.mo18632x(false, false);
        d97.mo18600F(audioAttributesImplBase.f4006a, 1);
        d97.mo18600F(audioAttributesImplBase.f4007b, 2);
        d97.mo18600F(audioAttributesImplBase.f4008c, 3);
        d97.mo18600F(audioAttributesImplBase.f4009d, 4);
    }
}
