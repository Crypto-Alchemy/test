package p000;

import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: x23 */
/* compiled from: JfifUtil */
public class x23 {
    /* renamed from: a */
    public static int m29842a(int i) {
        return aq6.m10693a(i);
    }

    /* renamed from: b */
    public static int m29843b(InputStream inputStream) {
        try {
            int d = m29845d(inputStream);
            if (d == 0) {
                return 0;
            }
            return aq6.m10696d(inputStream, d);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m29844c(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case MlKitException.CODE_SCANNER_CANCELLED /*201*/:
            case MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED /*202*/:
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /*203*/:
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /*205*/:
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /*206*/:
            case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /*207*/:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static int m29845d(InputStream inputStream) throws IOException {
        int a;
        if (m29846e(inputStream, 225) && (a = ra6.m26140a(inputStream, 2, false) - 2) > 6) {
            int a2 = ra6.m26140a(inputStream, 4, false);
            int a3 = ra6.m26140a(inputStream, 2, false);
            int i = (a - 4) - 2;
            if (a2 == 1165519206 && a3 == 0) {
                return i;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m29846e(InputStream inputStream, int i) throws IOException {
        au4.m10792g(inputStream);
        while (ra6.m26140a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = ra6.m26140a(inputStream, 1, false);
            }
            if ((i != 192 || !m29844c(i2)) && i2 != i) {
                if (!(i2 == 216 || i2 == 1)) {
                    if (i2 == 217 || i2 == 218) {
                        break;
                    }
                    inputStream.skip((long) (ra6.m26140a(inputStream, 2, false) - 2));
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
