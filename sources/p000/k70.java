package p000;

import androidx.media3.common.C0792h;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* renamed from: k70 */
/* compiled from: C2Mp3TimestampTracker */
public final class k70 {

    /* renamed from: a */
    public long f13987a;

    /* renamed from: b */
    public long f13988b;

    /* renamed from: c */
    public boolean f13989c;

    /* renamed from: a */
    public final long mo22199a(long j) {
        return this.f13987a + Math.max(0, ((this.f13988b - 529) * 1000000) / j);
    }

    /* renamed from: b */
    public long mo22200b(C0792h hVar) {
        return mo22199a((long) hVar.f4187b1);
    }

    /* renamed from: c */
    public void mo22201c() {
        this.f13987a = 0;
        this.f13988b = 0;
        this.f13989c = false;
    }

    /* renamed from: d */
    public long mo22202d(C0792h hVar, DecoderInputBuffer decoderInputBuffer) {
        if (this.f13988b == 0) {
            this.f13987a = decoderInputBuffer.f4594k;
        }
        if (this.f13989c) {
            return decoderInputBuffer.f4594k;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C2725kr.m20985e(decoderInputBuffer.f4592e);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int m = kz3.m21180m(b);
        if (m == -1) {
            this.f13989c = true;
            this.f13988b = 0;
            this.f13987a = decoderInputBuffer.f4594k;
            gk3.m18132i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return decoderInputBuffer.f4594k;
        }
        long a = mo22199a((long) hVar.f4187b1);
        this.f13988b += (long) m;
        return a;
    }
}
