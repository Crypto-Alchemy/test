package p000;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: kj3 */
/* compiled from: LocalFileFetchProducer */
public class kj3 extends jj3 {
    public kj3(Executor executor, qs4 qs4) {
        super(executor, qs4);
    }

    /* renamed from: c */
    public gp1 mo19919c(ImageRequest imageRequest) throws IOException {
        return mo21937d(new FileInputStream(imageRequest.mo13456t().toString()), (int) imageRequest.mo13456t().length());
    }

    /* renamed from: e */
    public String mo19920e() {
        return "LocalFileFetchProducer";
    }
}
