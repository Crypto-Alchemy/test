package p000;

import androidx.media3.common.PlaybackException;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: r40 */
/* compiled from: BufferRecycler */
public class r40 {

    /* renamed from: c */
    public static final int[] f17117c = {8000, 8000, PlaybackException.ERROR_CODE_IO_UNSPECIFIED, PlaybackException.ERROR_CODE_IO_UNSPECIFIED};

    /* renamed from: d */
    public static final int[] f17118d = {4000, 4000, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE};

    /* renamed from: a */
    public final AtomicReferenceArray<byte[]> f17119a;

    /* renamed from: b */
    public final AtomicReferenceArray<char[]> f17120b;

    public r40() {
        this(4, 4);
    }

    /* renamed from: a */
    public final byte[] mo25316a(int i) {
        return mo25317b(i, 0);
    }

    /* renamed from: b */
    public byte[] mo25317b(int i, int i2) {
        int f = mo25321f(i);
        if (i2 < f) {
            i2 = f;
        }
        byte[] andSet = this.f17119a.getAndSet(i, (Object) null);
        if (andSet == null || andSet.length < i2) {
            return mo25320e(i2);
        }
        return andSet;
    }

    /* renamed from: c */
    public final char[] mo25318c(int i) {
        return mo25319d(i, 0);
    }

    /* renamed from: d */
    public char[] mo25319d(int i, int i2) {
        int h = mo25323h(i);
        if (i2 < h) {
            i2 = h;
        }
        char[] andSet = this.f17120b.getAndSet(i, (Object) null);
        if (andSet == null || andSet.length < i2) {
            return mo25322g(i2);
        }
        return andSet;
    }

    /* renamed from: e */
    public byte[] mo25320e(int i) {
        return new byte[i];
    }

    /* renamed from: f */
    public int mo25321f(int i) {
        return f17117c[i];
    }

    /* renamed from: g */
    public char[] mo25322g(int i) {
        return new char[i];
    }

    /* renamed from: h */
    public int mo25323h(int i) {
        return f17118d[i];
    }

    /* renamed from: i */
    public void mo25324i(int i, byte[] bArr) {
        this.f17119a.set(i, bArr);
    }

    /* renamed from: j */
    public void mo25325j(int i, char[] cArr) {
        this.f17120b.set(i, cArr);
    }

    public r40(int i, int i2) {
        this.f17119a = new AtomicReferenceArray<>(i);
        this.f17120b = new AtomicReferenceArray<>(i2);
    }
}
