package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: b20 */
/* compiled from: BitmapDrawableDecoder */
public class b20<DataType> implements gf5<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final gf5<DataType, Bitmap> f7920a;

    /* renamed from: b */
    public final Resources f7921b;

    public b20(Resources resources, gf5<DataType, Bitmap> gf5) {
        this.f7921b = (Resources) zt4.m31500d(resources);
        this.f7920a = (gf5) zt4.m31500d(gf5);
    }

    /* renamed from: a */
    public boolean mo414a(DataType datatype, xi4 xi4) throws IOException {
        return this.f7920a.mo414a(datatype, xi4);
    }

    /* renamed from: b */
    public bf5<BitmapDrawable> mo415b(DataType datatype, int i, int i2, xi4 xi4) throws IOException {
        return gf3.m18047e(this.f7921b, this.f7920a.mo415b(datatype, i, i2, xi4));
    }
}
