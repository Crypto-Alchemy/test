package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(d97 d97) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4004a = (AudioAttributes) d97.mo18626r(audioAttributesImplApi21.f4004a, 1);
        audioAttributesImplApi21.f4005b = d97.mo18624p(audioAttributesImplApi21.f4005b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, d97 d97) {
        d97.mo18632x(false, false);
        d97.mo18602H(audioAttributesImplApi21.f4004a, 1);
        d97.mo18600F(audioAttributesImplApi21.f4005b, 2);
    }
}
