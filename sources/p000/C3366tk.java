package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C1725a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: tk */
/* compiled from: AnimatedWebpDecoder */
public final class C3366tk {

    /* renamed from: a */
    public final List<ImageHeaderParser> f18160a;

    /* renamed from: b */
    public final C2982oq f18161b;

    /* renamed from: tk$a */
    /* compiled from: AnimatedWebpDecoder */
    public static final class C3367a implements bf5<Drawable> {

        /* renamed from: a */
        public final AnimatedImageDrawable f18162a;

        public C3367a(AnimatedImageDrawable animatedImageDrawable) {
            this.f18162a = animatedImageDrawable;
        }

        /* renamed from: a */
        public void mo11634a() {
            this.f18162a.stop();
            this.f18162a.clearAnimationCallbacks();
        }

        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.f18162a;
        }

        /* renamed from: c */
        public Class<Drawable> mo11635c() {
            return Drawable.class;
        }

        public int getSize() {
            return this.f18162a.getIntrinsicWidth() * this.f18162a.getIntrinsicHeight() * p67.m24681i(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    /* renamed from: tk$b */
    /* compiled from: AnimatedWebpDecoder */
    public static final class C3368b implements gf5<ByteBuffer, Drawable> {

        /* renamed from: a */
        public final C3366tk f18163a;

        public C3368b(C3366tk tkVar) {
            this.f18163a = tkVar;
        }

        /* renamed from: c */
        public bf5<Drawable> mo415b(ByteBuffer byteBuffer, int i, int i2, xi4 xi4) throws IOException {
            return this.f18163a.mo26468b(ImageDecoder.createSource(byteBuffer), i, i2, xi4);
        }

        /* renamed from: d */
        public boolean mo414a(ByteBuffer byteBuffer, xi4 xi4) throws IOException {
            return this.f18163a.mo26470d(byteBuffer);
        }
    }

    /* renamed from: tk$c */
    /* compiled from: AnimatedWebpDecoder */
    public static final class C3369c implements gf5<InputStream, Drawable> {

        /* renamed from: a */
        public final C3366tk f18164a;

        public C3369c(C3366tk tkVar) {
            this.f18164a = tkVar;
        }

        /* renamed from: c */
        public bf5<Drawable> mo415b(InputStream inputStream, int i, int i2, xi4 xi4) throws IOException {
            return this.f18164a.mo26468b(ImageDecoder.createSource(s60.m26654b(inputStream)), i, i2, xi4);
        }

        /* renamed from: d */
        public boolean mo414a(InputStream inputStream, xi4 xi4) throws IOException {
            return this.f18164a.mo26469c(inputStream);
        }
    }

    public C3366tk(List<ImageHeaderParser> list, C2982oq oqVar) {
        this.f18160a = list;
        this.f18161b = oqVar;
    }

    /* renamed from: a */
    public static gf5<ByteBuffer, Drawable> m27777a(List<ImageHeaderParser> list, C2982oq oqVar) {
        return new C3368b(new C3366tk(list, oqVar));
    }

    /* renamed from: f */
    public static gf5<InputStream, Drawable> m27778f(List<ImageHeaderParser> list, C2982oq oqVar) {
        return new C3369c(new C3366tk(list, oqVar));
    }

    /* renamed from: b */
    public bf5<Drawable> mo26468b(ImageDecoder.Source source, int i, int i2, xi4 xi4) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new i91(i, i2, xi4));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C3367a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }

    /* renamed from: c */
    public boolean mo26469c(InputStream inputStream) throws IOException {
        return mo26471e(C1725a.m12273f(this.f18160a, inputStream, this.f18161b));
    }

    /* renamed from: d */
    public boolean mo26470d(ByteBuffer byteBuffer) throws IOException {
        return mo26471e(C1725a.m12274g(this.f18160a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean mo26471e(ImageHeaderParser.ImageType imageType) {
        if (imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return true;
        }
        return false;
    }
}
