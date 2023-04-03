package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.common.primitives.Ints;

/* renamed from: androidx.media3.exoplayer.audio.e */
/* compiled from: DefaultAudioTrackBufferSizeProvider */
public class C0866e implements DefaultAudioSink.C0851d {

    /* renamed from: b */
    public final int f4736b;

    /* renamed from: c */
    public final int f4737c;

    /* renamed from: d */
    public final int f4738d;

    /* renamed from: e */
    public final int f4739e;

    /* renamed from: f */
    public final int f4740f;

    /* renamed from: g */
    public final int f4741g;

    /* renamed from: androidx.media3.exoplayer.audio.e$a */
    /* compiled from: DefaultAudioTrackBufferSizeProvider */
    public static class C0867a {

        /* renamed from: a */
        public int f4742a = 250000;

        /* renamed from: b */
        public int f4743b = 750000;

        /* renamed from: c */
        public int f4744c = 4;

        /* renamed from: d */
        public int f4745d = 250000;

        /* renamed from: e */
        public int f4746e = 50000000;

        /* renamed from: f */
        public int f4747f = 2;

        /* renamed from: g */
        public C0866e mo7132g() {
            return new C0866e(this);
        }
    }

    public C0866e(C0867a aVar) {
        this.f4736b = aVar.f4742a;
        this.f4737c = aVar.f4743b;
        this.f4738d = aVar.f4744c;
        this.f4739e = aVar.f4745d;
        this.f4740f = aVar.f4746e;
        this.f4741g = aVar.f4747f;
    }

    /* renamed from: b */
    public static int m6191b(int i, int i2, int i3) {
        return Ints.m37045d(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* renamed from: d */
    public static int m6192d(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return NodeSerialization.LONGEST_EAGER_ALLOC;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public int mo7053a(int i, int i2, int i3, int i4, int i5, double d) {
        return (((Math.max(i, (int) (((double) mo7128c(i, i2, i3, i4, i5)) * d)) + i4) - 1) / i4) * i4;
    }

    /* renamed from: c */
    public int mo7128c(int i, int i2, int i3, int i4, int i5) {
        if (i3 == 0) {
            return mo7131g(i, i5, i4);
        }
        if (i3 == 1) {
            return mo7129e(i2);
        }
        if (i3 == 2) {
            return mo7130f(i2);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public int mo7129e(int i) {
        return Ints.m37045d((((long) this.f4740f) * ((long) m6192d(i))) / 1000000);
    }

    /* renamed from: f */
    public int mo7130f(int i) {
        int i2 = this.f4739e;
        if (i == 5) {
            i2 *= this.f4741g;
        }
        return Ints.m37045d((((long) i2) * ((long) m6192d(i))) / 1000000);
    }

    /* renamed from: g */
    public int mo7131g(int i, int i2, int i3) {
        return w67.m29374q(i * this.f4738d, m6191b(this.f4736b, i2, i3), m6191b(this.f4737c, i2, i3));
    }
}
