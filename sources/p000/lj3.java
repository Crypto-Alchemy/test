package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: lj3 */
/* compiled from: LocalResourceFetchProducer */
public class lj3 extends jj3 {

    /* renamed from: c */
    public final Resources f14529c;

    public lj3(Executor executor, qs4 qs4, Resources resources) {
        super(executor, qs4);
        this.f14529c = resources;
    }

    /* renamed from: g */
    public static int m21461g(ImageRequest imageRequest) {
        String path = imageRequest.mo13458u().getPath();
        au4.m10792g(path);
        return Integer.parseInt(path.substring(1));
    }

    /* renamed from: c */
    public gp1 mo19919c(ImageRequest imageRequest) throws IOException {
        return mo21937d(this.f14529c.openRawResource(m21461g(imageRequest)), mo22771f(imageRequest));
    }

    /* renamed from: e */
    public String mo19920e() {
        return "LocalResourceFetchProducer";
    }

    /* renamed from: f */
    public final int mo22771f(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openRawResourceFd = this.f14529c.openRawResourceFd(m21461g(imageRequest));
            int length = (int) openRawResourceFd.getLength();
            try {
                openRawResourceFd.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
