package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import java.util.Collections;
import java.util.List;

/* renamed from: x32 */
/* compiled from: FlacStreamMetadata */
public final class x32 {

    /* renamed from: a */
    public final int f19297a;

    /* renamed from: b */
    public final int f19298b;

    /* renamed from: c */
    public final int f19299c;

    /* renamed from: d */
    public final int f19300d;

    /* renamed from: e */
    public final int f19301e;

    /* renamed from: f */
    public final int f19302f;

    /* renamed from: g */
    public final int f19303g;

    /* renamed from: h */
    public final int f19304h;

    /* renamed from: i */
    public final int f19305i;

    /* renamed from: j */
    public final long f19306j;

    /* renamed from: k */
    public final C3567a f19307k;

    /* renamed from: l */
    public final Metadata f19308l;

    /* renamed from: x32$a */
    /* compiled from: FlacStreamMetadata */
    public static class C3567a {

        /* renamed from: a */
        public final long[] f19309a;

        /* renamed from: b */
        public final long[] f19310b;

        public C3567a(long[] jArr, long[] jArr2) {
            this.f19309a = jArr;
            this.f19310b = jArr2;
        }
    }

    public x32(byte[] bArr, int i) {
        fm4 fm4 = new fm4(bArr);
        fm4.mo20012p(i * 8);
        this.f19297a = fm4.mo20004h(16);
        this.f19298b = fm4.mo20004h(16);
        this.f19299c = fm4.mo20004h(24);
        this.f19300d = fm4.mo20004h(24);
        int h = fm4.mo20004h(20);
        this.f19301e = h;
        this.f19302f = m29851j(h);
        this.f19303g = fm4.mo20004h(3) + 1;
        int h2 = fm4.mo20004h(5) + 1;
        this.f19304h = h2;
        this.f19305i = m29850e(h2);
        this.f19306j = fm4.mo20006j(36);
        this.f19307k = null;
        this.f19308l = null;
    }

    /* renamed from: e */
    public static int m29850e(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    public static int m29851j(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public x32 mo27662a(List<PictureFrame> list) {
        return new x32(this.f19297a, this.f19298b, this.f19299c, this.f19300d, this.f19301e, this.f19303g, this.f19304h, this.f19306j, this.f19307k, mo27668h(new Metadata((List<? extends Metadata.Entry>) list)));
    }

    /* renamed from: b */
    public x32 mo27663b(C3567a aVar) {
        return new x32(this.f19297a, this.f19298b, this.f19299c, this.f19300d, this.f19301e, this.f19303g, this.f19304h, this.f19306j, aVar, this.f19308l);
    }

    /* renamed from: c */
    public x32 mo27664c(List<String> list) {
        return new x32(this.f19297a, this.f19298b, this.f19299c, this.f19300d, this.f19301e, this.f19303g, this.f19304h, this.f19306j, this.f19307k, mo27668h(pf7.m24904c(list)));
    }

    /* renamed from: d */
    public long mo27665d() {
        long j;
        long j2;
        long j3;
        int i = this.f19300d;
        if (i > 0) {
            j2 = (((long) i) + ((long) this.f19299c)) / 2;
            j3 = 1;
        } else {
            int i2 = this.f19297a;
            if (i2 != this.f19298b || i2 <= 0) {
                j = 4096;
            } else {
                j = (long) i2;
            }
            j2 = ((j * ((long) this.f19303g)) * ((long) this.f19304h)) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    /* renamed from: f */
    public long mo27666f() {
        long j = this.f19306j;
        if (j == 0) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return (j * 1000000) / ((long) this.f19301e);
    }

    /* renamed from: g */
    public C0792h mo27667g(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f19300d;
        if (i <= 0) {
            i = -1;
        }
        return new C0792h.C0794b().mo6670e0("audio/flac").mo6662W(i).mo6647H(this.f19303g).mo6671f0(this.f19301e).mo6659T(Collections.singletonList(bArr)).mo6663X(mo27668h(metadata)).mo6644E();
    }

    /* renamed from: h */
    public Metadata mo27668h(Metadata metadata) {
        Metadata metadata2 = this.f19308l;
        if (metadata2 == null) {
            return metadata;
        }
        return metadata2.mo6543b(metadata);
    }

    /* renamed from: i */
    public long mo27669i(long j) {
        return w67.m29376r((j * ((long) this.f19301e)) / 1000000, 0, this.f19306j - 1);
    }

    public x32(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C3567a aVar, Metadata metadata) {
        this.f19297a = i;
        this.f19298b = i2;
        this.f19299c = i3;
        this.f19300d = i4;
        this.f19301e = i5;
        this.f19302f = m29851j(i5);
        this.f19303g = i6;
        this.f19304h = i7;
        this.f19305i = m29850e(i7);
        this.f19306j = j;
        this.f19307k = aVar;
        this.f19308l = metadata;
    }
}
