package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ta6 */
/* compiled from: StreamUtil */
public class ta6 {
    /* renamed from: a */
    public static long m27664a(InputStream inputStream, long j) throws IOException {
        boolean z;
        au4.m10792g(inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
