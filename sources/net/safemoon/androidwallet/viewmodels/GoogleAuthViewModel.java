package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002R%\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00150\u00150\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001c"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "Lwj;", "Lr37;", "d", "", "key", "kotlin.jvm.PlatformType", "i", "Lil6;", "totpData", "Landroid/graphics/Bitmap;", "e", "Lk04;", "b", "Lk04;", "h", "()Lk04;", "keyAuth", "c", "g", "bitmapAuth", "", "f", "authEnable", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: GoogleAuthViewModel.kt */
public final class GoogleAuthViewModel extends C3552wj {

    /* renamed from: b */
    public final k04<String> f42722b = new k04<>("");

    /* renamed from: c */
    public final k04<Bitmap> f42723c = new k04<>();

    /* renamed from: d */
    public final k04<Boolean> f42724d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleAuthViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        k04<Boolean> k04 = new k04<>(Boolean.FALSE);
        this.f42724d = k04;
        k04.setValue(Boolean.valueOf(f06.m57513d(application, "AUTH_2FA_IS_ENABLE")));
    }

    /* renamed from: d */
    public final void mo61201d() {
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new GoogleAuthViewModel$generateAuthKey$1(this, (ns0<? super GoogleAuthViewModel$generateAuthKey$1>) null), 3, (Object) null);
    }

    /* renamed from: e */
    public final Bitmap mo61202e(il6 il6) {
        int i;
        BitMatrix encode = new MultiFormatWriter().encode(il6.mo52497c(), BarcodeFormat.QR_CODE, 300, 300);
        int width = encode.getWidth();
        int height = encode.getHeight();
        int[] iArr = new int[(width * height)];
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = i2 * width;
            for (int i4 = 0; i4 < width; i4++) {
                int i5 = i3 + i4;
                if (encode.get(i4, i2)) {
                    i = -16777216;
                } else {
                    i = -1;
                }
                iArr[i5] = i;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        vx2.m53590f(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: f */
    public final k04<Boolean> mo61203f() {
        return this.f42724d;
    }

    /* renamed from: g */
    public final k04<Bitmap> mo61204g() {
        return this.f42723c;
    }

    /* renamed from: h */
    public final k04<String> mo61205h() {
        return this.f42722b;
    }

    /* renamed from: i */
    public final String mo61206i(String str) {
        return hl6.m58571b(str);
    }
}
