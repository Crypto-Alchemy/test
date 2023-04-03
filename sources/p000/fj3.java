package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: fj3 */
/* compiled from: LocalAssetFetchProducer */
public class fj3 extends jj3 {

    /* renamed from: c */
    public final AssetManager f11839c;

    public fj3(Executor executor, qs4 qs4, AssetManager assetManager) {
        super(executor, qs4);
        this.f11839c = assetManager;
    }

    /* renamed from: f */
    public static String m17010f(ImageRequest imageRequest) {
        return imageRequest.mo13458u().getPath().substring(1);
    }

    /* renamed from: c */
    public gp1 mo19919c(ImageRequest imageRequest) throws IOException {
        return mo21937d(this.f11839c.open(m17010f(imageRequest), 2), mo19921g(imageRequest));
    }

    /* renamed from: e */
    public String mo19920e() {
        return "LocalAssetFetchProducer";
    }

    /* renamed from: g */
    public final int mo19921g(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openFd = this.f11839c.openFd(m17010f(imageRequest));
            int length = (int) openFd.getLength();
            try {
                openFd.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (IOException unused2) {
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
