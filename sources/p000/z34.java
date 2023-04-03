package p000;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: z34 */
/* compiled from: NativeSessionFileGzipper */
public class z34 {
    /* renamed from: a */
    public static void m54945a(InputStream inputStream, File file) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            CommonUtils.m38403f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        CommonUtils.m38403f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.m38403f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m54946b(File file, List<y34> list) {
        for (y34 next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo43103h();
                if (inputStream != null) {
                    m54945a(inputStream, new File(file, next.mo43105j()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.m38403f(inputStream);
                throw th;
            }
            CommonUtils.m38403f(inputStream);
        }
    }
}
