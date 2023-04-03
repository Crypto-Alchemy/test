package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: hs2 */
/* compiled from: ImageViewUtils */
public class hs2 {

    /* renamed from: a */
    public static boolean f13059a = true;

    /* renamed from: a */
    public static void m19250a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            m19251b(imageView, matrix);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m19251b(ImageView imageView, Matrix matrix) {
        if (f13059a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f13059a = false;
            }
        }
    }
}
