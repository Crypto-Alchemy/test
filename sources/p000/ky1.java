package p000;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: ky1 */
/* compiled from: ExtractorUtil */
public final class ky1 {
    @Pure
    /* renamed from: a */
    public static void m21099a(boolean z, String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedContainer(str, (Throwable) null);
        }
    }

    /* renamed from: b */
    public static boolean m21100b(iy1 iy1, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return iy1.mo84c(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public static int m21101c(iy1 iy1, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int j = iy1.mo91j(bArr, i + i3, i2 - i3);
            if (j == -1) {
                break;
            }
            i3 += j;
        }
        return i3;
    }

    /* renamed from: d */
    public static boolean m21102d(iy1 iy1, byte[] bArr, int i, int i2) throws IOException {
        try {
            iy1.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m21103e(iy1 iy1, int i) throws IOException {
        try {
            iy1.mo92k(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
