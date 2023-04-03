package p000;

import androidx.media3.common.C0792h;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;

/* renamed from: cu1 */
/* compiled from: EventSampleStream */
public final class cu1 implements yk5 {

    /* renamed from: a */
    public final C0792h f10287a;

    /* renamed from: d */
    public final au1 f10288d = new au1();

    /* renamed from: e */
    public long[] f10289e;

    /* renamed from: g */
    public boolean f10290g;

    /* renamed from: k */
    public ju1 f10291k;

    /* renamed from: r */
    public boolean f10292r;

    /* renamed from: s */
    public int f10293s;

    /* renamed from: x */
    public long f10294x = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    public cu1(ju1 ju1, C0792h hVar, boolean z) {
        this.f10287a = hVar;
        this.f10291k = ju1;
        this.f10289e = ju1.f13846b;
        mo18286d(ju1, z);
    }

    /* renamed from: a */
    public String mo18284a() {
        return this.f10291k.mo22087a();
    }

    /* renamed from: b */
    public void mo7593b() throws IOException {
    }

    /* renamed from: c */
    public void mo18285c(long j) {
        boolean z = true;
        int e = w67.m29350e(this.f10289e, j, true, false);
        this.f10293s = e;
        if (!this.f10290g || e != this.f10289e.length) {
            z = false;
        }
        if (!z) {
            j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        this.f10294x = j;
    }

    /* renamed from: d */
    public void mo18286d(ju1 ju1, boolean z) {
        long j;
        int i = this.f10293s;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f10289e[i - 1];
        }
        this.f10290g = z;
        this.f10291k = ju1;
        long[] jArr = ju1.f13846b;
        this.f10289e = jArr;
        long j2 = this.f10294x;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            mo18285c(j2);
        } else if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f10293s = w67.m29350e(jArr, j, false, false);
        }
    }

    /* renamed from: f */
    public int mo7594f(long j) {
        int max = Math.max(this.f10293s, w67.m29350e(this.f10289e, j, true, false));
        int i = max - this.f10293s;
        this.f10293s = max;
        return i;
    }

    /* renamed from: g */
    public boolean mo7595g() {
        return true;
    }

    /* renamed from: p */
    public int mo7596p(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
        boolean z;
        int i2 = this.f10293s;
        if (i2 == this.f10289e.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f10290g) {
            decoderInputBuffer.mo23896u(4);
            return -4;
        } else if ((i & 2) != 0 || !this.f10292r) {
            c82.f8368b = this.f10287a;
            this.f10292r = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.f10293s = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] a = this.f10288d.mo11145a(this.f10291k.f13845a[i2]);
                decoderInputBuffer.mo6970w(a.length);
                decoderInputBuffer.f4592e.put(a);
            }
            decoderInputBuffer.f4594k = this.f10289e[i2];
            decoderInputBuffer.mo23896u(1);
            return -4;
        }
    }
}
