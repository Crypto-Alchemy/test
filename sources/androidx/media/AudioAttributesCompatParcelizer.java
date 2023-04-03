package androidx.media;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(d97 d97) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4003a = (AudioAttributesImpl) d97.mo18630v(audioAttributesCompat.f4003a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, d97 d97) {
        d97.mo18632x(false, false);
        d97.mo18607M(audioAttributesCompat.f4003a, 1);
    }
}
