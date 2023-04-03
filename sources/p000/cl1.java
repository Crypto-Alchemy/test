package p000;

import androidx.media3.common.C0792h;
import java.io.EOFException;
import java.io.IOException;
import p000.zs6;

/* renamed from: cl1 */
/* compiled from: DummyTrackOutput */
public final class cl1 implements zs6 {

    /* renamed from: a */
    public final byte[] f8459a = new byte[4096];

    /* renamed from: a */
    public /* synthetic */ void mo7300a(gm4 gm4, int i) {
        ys6.m30779b(this, gm4, i);
    }

    /* renamed from: b */
    public void mo7301b(long j, int i, int i2, int i3, zs6.C3758a aVar) {
    }

    /* renamed from: c */
    public void mo7302c(gm4 gm4, int i, int i2) {
        gm4.mo20675Q(i);
    }

    /* renamed from: d */
    public void mo7303d(C0792h hVar) {
    }

    /* renamed from: e */
    public /* synthetic */ int mo7304e(u11 u11, int i, boolean z) {
        return ys6.m30778a(this, u11, i, z);
    }

    /* renamed from: f */
    public int mo7305f(u11 u11, int i, boolean z, int i2) throws IOException {
        int read = u11.read(this.f8459a, 0, Math.min(this.f8459a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
