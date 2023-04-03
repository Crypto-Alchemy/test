package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: n96 */
/* compiled from: StatsDataSource */
public final class n96 implements x11 {

    /* renamed from: a */
    public final x11 f15381a;

    /* renamed from: b */
    public long f15382b;

    /* renamed from: c */
    public Uri f15383c = Uri.EMPTY;

    /* renamed from: d */
    public Map<String, List<String>> f15384d = Collections.emptyMap();

    public n96(x11 x11) {
        this.f15381a = (x11) C2725kr.m20985e(x11);
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws IOException {
        this.f15383c = d21.f10437a;
        this.f15384d = Collections.emptyMap();
        long b = this.f15381a.mo6964b(d21);
        this.f15383c = (Uri) C2725kr.m20985e(mo6966m());
        this.f15384d = mo7616d();
        return b;
    }

    public void close() throws IOException {
        this.f15381a.close();
    }

    /* renamed from: d */
    public Map<String, List<String>> mo7616d() {
        return this.f15381a.mo7616d();
    }

    /* renamed from: g */
    public void mo7617g(ov6 ov6) {
        C2725kr.m20985e(ov6);
        this.f15381a.mo7617g(ov6);
    }

    /* renamed from: m */
    public Uri mo6966m() {
        return this.f15381a.mo6966m();
    }

    /* renamed from: o */
    public long mo23539o() {
        return this.f15382b;
    }

    /* renamed from: p */
    public Uri mo23540p() {
        return this.f15383c;
    }

    /* renamed from: q */
    public Map<String, List<String>> mo23541q() {
        return this.f15384d;
    }

    /* renamed from: r */
    public void mo23542r() {
        this.f15382b = 0;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f15381a.read(bArr, i, i2);
        if (read != -1) {
            this.f15382b += (long) read;
        }
        return read;
    }
}
