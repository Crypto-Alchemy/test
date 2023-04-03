package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

/* renamed from: gx */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C5884gx extends ee1<Barcode> {

    /* renamed from: c */
    public final h99 f29382c;

    /* renamed from: gx$a */
    /* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
    public static class C5885a {

        /* renamed from: a */
        public Context f29383a;

        /* renamed from: b */
        public zzk f29384b = new zzk();

        public C5885a(@RecentlyNonNull Context context) {
            this.f29383a = context;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C5884gx mo43017a() {
            return new C5884gx(new h99(this.f29383a, this.f29384b));
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C5885a mo43018b(int i) {
            this.f29384b.f23044a = i;
            return this;
        }
    }

    public C5884gx(h99 h99) {
        this.f29382c = h99;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public final SparseArray<Barcode> mo42279a(@RecentlyNonNull tb2 tb2) {
        Barcode[] barcodeArr;
        if (tb2 != null) {
            zzs r1 = zzs.m34483r1(tb2);
            if (tb2.mo48044a() != null) {
                barcodeArr = this.f29382c.mo43110f((Bitmap) cu4.m43221k(tb2.mo48044a()), r1);
                if (barcodeArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else if (tb2.mo48047d() != null) {
                barcodeArr = this.f29382c.mo43111g((ByteBuffer) cu4.m43221k(((Image.Plane[]) cu4.m43221k(tb2.mo48047d()))[0].getBuffer()), new zzs(((Image.Plane[]) cu4.m43221k(tb2.mo48047d()))[0].getRowStride(), r1.f23050d, r1.f23051e, r1.f23052g, r1.f23053k));
            } else {
                barcodeArr = this.f29382c.mo43111g((ByteBuffer) cu4.m43221k(tb2.mo48045b()), r1);
            }
            SparseArray<Barcode> sparseArray = new SparseArray<>(barcodeArr.length);
            for (Barcode barcode : barcodeArr) {
                sparseArray.append(barcode.f23152d.hashCode(), barcode);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    /* renamed from: b */
    public final boolean mo42280b() {
        return this.f29382c.mo48751c();
    }

    /* renamed from: d */
    public final void mo42282d() {
        super.mo42282d();
        this.f29382c.mo48752d();
    }
}
