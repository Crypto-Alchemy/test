package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, mo44877d2 = {"Lbq2;", "", "", "width", "height", "hashCode", "Landroid/graphics/Bitmap;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bq2 */
/* compiled from: IdentiUtility.kt */
public final class bq2 {

    /* renamed from: a */
    public static final bq2 f36932a = new bq2();

    /* renamed from: b */
    public static /* synthetic */ Bitmap m56115b(bq2 bq2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 200;
        }
        if ((i4 & 2) != 0) {
            i2 = 200;
        }
        return bq2.mo50692a(i, i2, i3);
    }

    /* renamed from: a */
    public final Bitmap mo50692a(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new yf0(i, i2, i3).draw(new Canvas(createBitmap));
        vx2.m53590f(createBitmap, "bitmap");
        return createBitmap;
    }
}
