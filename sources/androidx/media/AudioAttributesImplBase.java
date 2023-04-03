package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f4006a = 0;

    /* renamed from: b */
    public int f4007b = 0;

    /* renamed from: c */
    public int f4008c = 0;

    /* renamed from: d */
    public int f4009d = -1;

    /* renamed from: a */
    public int mo6433a() {
        return this.f4007b;
    }

    /* renamed from: b */
    public int mo6434b() {
        int i = this.f4008c;
        int c = mo6435c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo6435c() {
        int i = this.f4009d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m5163a(false, this.f4008c, this.f4006a);
    }

    /* renamed from: d */
    public int mo6436d() {
        return this.f4006a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4007b == audioAttributesImplBase.mo6433a() && this.f4008c == audioAttributesImplBase.mo6434b() && this.f4006a == audioAttributesImplBase.mo6436d() && this.f4009d == audioAttributesImplBase.f4009d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4007b), Integer.valueOf(this.f4008c), Integer.valueOf(this.f4006a), Integer.valueOf(this.f4009d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4009d != -1) {
            sb.append(" stream=");
            sb.append(this.f4009d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m5164b(this.f4006a));
        sb.append(" content=");
        sb.append(this.f4007b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4008c).toUpperCase());
        return sb.toString();
    }
}
