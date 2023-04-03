package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uq2 */
/* compiled from: ImageHeaderParserRegistry */
public final class uq2 {

    /* renamed from: a */
    public final List<ImageHeaderParser> f18555a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo26843a(ImageHeaderParser imageHeaderParser) {
        this.f18555a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo26844b() {
        return this.f18555a;
    }
}
