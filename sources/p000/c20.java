package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* renamed from: c20 */
/* compiled from: BitmapDrawableEncoder */
public class c20 implements jf5<BitmapDrawable> {

    /* renamed from: a */
    public final t20 f8318a;

    /* renamed from: b */
    public final jf5<Bitmap> f8319b;

    public c20(t20 t20, jf5<Bitmap> jf5) {
        this.f8318a = t20;
        this.f8319b = jf5;
    }

    /* renamed from: b */
    public EncodeStrategy mo11956b(xi4 xi4) {
        return this.f8319b.mo11956b(xi4);
    }

    /* renamed from: c */
    public boolean mo11955a(bf5<BitmapDrawable> bf5, File file, xi4 xi4) {
        return this.f8319b.mo11955a(new y20(bf5.get().getBitmap(), this.f8318a), file, xi4);
    }
}
