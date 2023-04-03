package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: yq2 */
/* compiled from: ImageMatrixProperty */
public class yq2 extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f35914a = new Matrix();

    public yq2() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f35914a.set(imageView.getImageMatrix());
        return this.f35914a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
