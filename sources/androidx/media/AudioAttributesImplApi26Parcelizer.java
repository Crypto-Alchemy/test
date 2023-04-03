package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(d97 d97) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4004a = (AudioAttributes) d97.mo18626r(audioAttributesImplApi26.f4004a, 1);
        audioAttributesImplApi26.f4005b = d97.mo18624p(audioAttributesImplApi26.f4005b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, d97 d97) {
        d97.mo18632x(false, false);
        d97.mo18602H(audioAttributesImplApi26.f4004a, 1);
        d97.mo18600F(audioAttributesImplApi26.f4005b, 2);
    }
}
