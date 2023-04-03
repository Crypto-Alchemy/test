package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C1797a;
import java.io.IOException;

/* renamed from: am4 */
/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class am4 implements gf5<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final C1797a f191a;

    public am4(C1797a aVar) {
        this.f191a = aVar;
    }

    /* renamed from: c */
    public bf5<Bitmap> mo415b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, xi4 xi4) throws IOException {
        return this.f191a.mo12617d(parcelFileDescriptor, i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo414a(ParcelFileDescriptor parcelFileDescriptor, xi4 xi4) {
        if (!mo418e(parcelFileDescriptor) || !this.f191a.mo12622o(parcelFileDescriptor)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo418e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
            return false;
        }
        return true;
    }
}
