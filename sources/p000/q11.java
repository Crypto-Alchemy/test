package p000;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: q11 */
/* compiled from: DataFetchProducer */
public class q11 extends jj3 {
    public q11(qs4 qs4) {
        super(y90.m30486a(), qs4);
    }

    /* renamed from: f */
    public static byte[] m25320f(String str) {
        au4.m10787b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (m25321g(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        au4.m10792g(decode);
        return decode.getBytes();
    }

    /* renamed from: g */
    public static boolean m25321g(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }

    /* renamed from: c */
    public gp1 mo19919c(ImageRequest imageRequest) throws IOException {
        byte[] f = m25320f(imageRequest.mo13458u().toString());
        return mo21936b(new ByteArrayInputStream(f), f.length);
    }

    /* renamed from: e */
    public String mo19920e() {
        return "DataFetchProducer";
    }
}
