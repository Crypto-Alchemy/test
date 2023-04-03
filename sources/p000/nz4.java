package p000;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: nz4 */
/* compiled from: QualifiedResourceFetchProducer */
public class nz4 extends jj3 {

    /* renamed from: c */
    public final ContentResolver f15746c;

    public nz4(Executor executor, qs4 qs4, ContentResolver contentResolver) {
        super(executor, qs4);
        this.f15746c = contentResolver;
    }

    /* renamed from: c */
    public gp1 mo19919c(ImageRequest imageRequest) throws IOException {
        InputStream openInputStream = this.f15746c.openInputStream(imageRequest.mo13458u());
        au4.m10793h(openInputStream, "ContentResolver returned null InputStream");
        return mo21937d(openInputStream, -1);
    }

    /* renamed from: e */
    public String mo19920e() {
        return "QualifiedResourceFetchProducer";
    }
}
