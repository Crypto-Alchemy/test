package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: fs2 */
/* compiled from: ImageViewTargetFactory */
public class fs2 {
    /* renamed from: a */
    public <Z> he7<ImageView, Z> mo20138a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new k20(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new mj1(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
