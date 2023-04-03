package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f4004a;

    /* renamed from: b */
    public int f4005b;

    public AudioAttributesImplApi21() {
        this.f4005b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f4004a.equals(((AudioAttributesImplApi21) obj).f4004a);
    }

    public int hashCode() {
        return this.f4004a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4004a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f4004a = audioAttributes;
        this.f4005b = i;
    }
}
