package p000;

import java.io.IOException;
import okhttp3.internal.p023ws.RealWebSocket;

/* renamed from: p56 */
/* compiled from: Sniffer */
public final class p56 {

    /* renamed from: a */
    public final gm4 f16318a = new gm4(8);

    /* renamed from: b */
    public int f16319b;

    /* renamed from: a */
    public final long mo24450a(iy1 iy1) throws IOException {
        int i = 0;
        iy1.mo94n(this.f16318a.mo20679d(), 0, 1);
        byte b = this.f16318a.mo20679d()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        iy1.mo94n(this.f16318a.mo20679d(), 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f16318a.mo20679d()[i] & 255) + (i4 << 8);
        }
        this.f16319b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: b */
    public boolean mo24451b(iy1 iy1) throws IOException {
        long a;
        int i;
        long length = iy1.getLength();
        int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        long j = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (i2 != 0 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j = length;
        }
        int i3 = (int) j;
        iy1.mo94n(this.f16318a.mo20679d(), 0, 4);
        long F = this.f16318a.mo20664F();
        this.f16319b = 4;
        while (F != 440786851) {
            int i4 = this.f16319b + 1;
            this.f16319b = i4;
            if (i4 == i3) {
                return false;
            }
            iy1.mo94n(this.f16318a.mo20679d(), 0, 1);
            F = ((F << 8) & -256) | ((long) (this.f16318a.mo20679d()[0] & 255));
        }
        long a2 = mo24450a(iy1);
        long j2 = (long) this.f16319b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a2 >= length) {
            return false;
        }
        while (true) {
            int i5 = this.f16319b;
            long j3 = j2 + a2;
            if (((long) i5) < j3) {
                if (mo24450a(iy1) != Long.MIN_VALUE && a >= 0 && a <= 2147483647L) {
                    if (i != 0) {
                        int a3 = (int) (a = mo24450a(iy1));
                        iy1.mo90i(a3);
                        this.f16319b += a3;
                    }
                }
            } else if (((long) i5) == j3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
