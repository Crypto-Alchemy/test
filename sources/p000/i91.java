package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C1797a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* renamed from: i91 */
/* compiled from: DefaultOnHeaderDecodedListener */
public final class i91 implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final el2 f13211a = el2.m16178b();

    /* renamed from: b */
    public final int f13212b;

    /* renamed from: c */
    public final int f13213c;

    /* renamed from: d */
    public final DecodeFormat f13214d;

    /* renamed from: e */
    public final DownsampleStrategy f13215e;

    /* renamed from: f */
    public final boolean f13216f;

    /* renamed from: g */
    public final PreferredColorSpace f13217g;

    /* renamed from: i91$a */
    /* compiled from: DefaultOnHeaderDecodedListener */
    public class C2535a implements ImageDecoder.OnPartialImageListener {
        public C2535a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public i91(int i, int i2, xi4 xi4) {
        boolean z;
        this.f13212b = i;
        this.f13213c = i2;
        this.f13214d = (DecodeFormat) xi4.mo27760c(C1797a.f8947f);
        this.f13215e = (DownsampleStrategy) xi4.mo27760c(DownsampleStrategy.f8928h);
        pi4 pi4 = C1797a.f8951j;
        if (xi4.mo27760c(pi4) == null || !((Boolean) xi4.mo27760c(pi4)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f13216f = z;
        this.f13217g = (PreferredColorSpace) xi4.mo27760c(C1797a.f8948g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z = false;
        if (this.f13211a.mo19297e(this.f13212b, this.f13213c, this.f13216f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f13214d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C2535a());
        Size size = imageInfo.getSize();
        int i = this.f13212b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.f13213c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.f13215e.mo12593b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(((float) size.getWidth()) * b);
        int round2 = Math.round(((float) size.getHeight()) * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resizing from [");
            sb.append(size.getWidth());
            sb.append("x");
            sb.append(size.getHeight());
            sb.append("] to [");
            sb.append(round);
            sb.append("x");
            sb.append(round2);
            sb.append("] scaleFactor: ");
            sb.append(b);
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f13217g;
        if (preferredColorSpace != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
