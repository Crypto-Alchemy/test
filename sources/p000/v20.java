package p000;

import android.graphics.Bitmap;

/* renamed from: v20 */
/* compiled from: BitmapPoolBackend */
public class v20 extends am3<Bitmap> {
    /* renamed from: c */
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !mo27034e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: d */
    public int mo22086a(Bitmap bitmap) {
        return b30.m11041e(bitmap);
    }

    /* renamed from: e */
    public boolean mo27034e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            oy1.m24439z("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            oy1.m24439z("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    /* renamed from: f */
    public void put(Bitmap bitmap) {
        if (mo27034e(bitmap)) {
            super.put(bitmap);
        }
    }
}
