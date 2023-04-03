package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.source.e */
/* compiled from: IcyDataSource */
public final class C0964e implements x11 {

    /* renamed from: a */
    public final x11 f5233a;

    /* renamed from: b */
    public final int f5234b;

    /* renamed from: c */
    public final C0965a f5235c;

    /* renamed from: d */
    public final byte[] f5236d;

    /* renamed from: e */
    public int f5237e;

    /* renamed from: androidx.media3.exoplayer.source.e$a */
    /* compiled from: IcyDataSource */
    public interface C0965a {
        /* renamed from: b */
        void mo7619b(gm4 gm4);
    }

    public C0964e(x11 x11, int i, C0965a aVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f5233a = x11;
        this.f5234b = i;
        this.f5235c = aVar;
        this.f5236d = new byte[1];
        this.f5237e = i;
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) {
        throw new UnsupportedOperationException();
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public Map<String, List<String>> mo7616d() {
        return this.f5233a.mo7616d();
    }

    /* renamed from: g */
    public void mo7617g(ov6 ov6) {
        C2725kr.m20985e(ov6);
        this.f5233a.mo7617g(ov6);
    }

    /* renamed from: m */
    public Uri mo6966m() {
        return this.f5233a.mo6966m();
    }

    /* renamed from: o */
    public final boolean mo7618o() throws IOException {
        if (this.f5233a.read(this.f5236d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f5236d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.f5233a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f5235c.mo7619b(new gm4(bArr, i));
        }
        return true;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f5237e == 0) {
            if (!mo7618o()) {
                return -1;
            }
            this.f5237e = this.f5234b;
        }
        int read = this.f5233a.read(bArr, i, Math.min(this.f5237e, i2));
        if (read != -1) {
            this.f5237e -= read;
        }
        return read;
    }
}
