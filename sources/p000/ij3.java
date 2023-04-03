package p000;

import android.content.ContentResolver;
import android.graphics.Rect;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: ij3 */
/* compiled from: LocalContentUriThumbnailFetchProducer */
public class ij3 extends jj3 implements wp6<gp1> {

    /* renamed from: d */
    public static final Class<?> f13278d = ij3.class;

    /* renamed from: e */
    public static final String[] f13279e = {"_id", "_data"};

    /* renamed from: f */
    public static final String[] f13280f = {"_data"};

    /* renamed from: g */
    public static final Rect f13281g = new Rect(0, 0, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, 384);

    /* renamed from: h */
    public static final Rect f13282h = new Rect(0, 0, 96, 96);

    /* renamed from: c */
    public final ContentResolver f13283c;

    public ij3(Executor executor, qs4 qs4, ContentResolver contentResolver) {
        super(executor, qs4);
        this.f13283c = contentResolver;
    }

    /* renamed from: c */
    public gp1 mo19919c(ImageRequest imageRequest) throws IOException {
        Uri u = imageRequest.mo13458u();
        if (!i57.m19424g(u)) {
            return null;
        }
        imageRequest.mo13453q();
        return mo21549f(u, (te5) null);
    }

    /* renamed from: e */
    public String mo19920e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* renamed from: f */
    public final gp1 mo21549f(Uri uri, te5 te5) throws IOException {
        return null;
    }
}
