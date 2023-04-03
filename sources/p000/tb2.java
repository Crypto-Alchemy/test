package p000;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.nio.ByteBuffer;

/* renamed from: tb2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class tb2 {

    /* renamed from: a */
    public final C6521b f34218a;

    /* renamed from: b */
    public ByteBuffer f34219b;

    /* renamed from: c */
    public Bitmap f34220c;

    /* renamed from: tb2$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C6520a {

        /* renamed from: a */
        public final tb2 f34221a = new tb2();

        @RecentlyNonNull
        /* renamed from: a */
        public tb2 mo48048a() {
            if (this.f34221a.f34219b != null || this.f34221a.f34220c != null) {
                return this.f34221a;
            }
            C6522c unused = this.f34221a.getClass();
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C6520a mo48049b(@RecentlyNonNull Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap unused = this.f34221a.f34220c = bitmap;
            C6521b c = this.f34221a.mo48046c();
            int unused2 = c.f34222a = width;
            int unused3 = c.f34223b = height;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C6520a mo48050c(int i) {
            int unused = this.f34221a.mo48046c().f34224c = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C6520a mo48051d(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                ByteBuffer unused = this.f34221a.f34219b = byteBuffer;
                C6521b c = this.f34221a.mo48046c();
                int unused2 = c.f34222a = i;
                int unused3 = c.f34223b = i2;
                int unused4 = c.f34227f = i3;
                return this;
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C6520a mo48052e(int i) {
            int unused = this.f34221a.mo48046c().f34226e = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: f */
        public C6520a mo48053f(long j) {
            long unused = this.f34221a.mo48046c().f34225d = j;
            return this;
        }
    }

    /* renamed from: tb2$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C6522c {
    }

    public tb2() {
        this.f34218a = new C6521b();
        this.f34219b = null;
        this.f34220c = null;
    }

    @RecentlyNullable
    /* renamed from: a */
    public Bitmap mo48044a() {
        return this.f34220c;
    }

    @RecentlyNullable
    /* renamed from: b */
    public ByteBuffer mo48045b() {
        Bitmap bitmap = this.f34220c;
        if (bitmap == null) {
            return this.f34219b;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.f34220c.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.f34220c.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public C6521b mo48046c() {
        return this.f34218a;
    }

    @RecentlyNullable
    /* renamed from: d */
    public Image.Plane[] mo48047d() {
        return null;
    }

    /* renamed from: tb2$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C6521b {

        /* renamed from: a */
        public int f34222a;

        /* renamed from: b */
        public int f34223b;

        /* renamed from: c */
        public int f34224c;

        /* renamed from: d */
        public long f34225d;

        /* renamed from: e */
        public int f34226e;

        /* renamed from: f */
        public int f34227f = -1;

        public C6521b() {
        }

        /* renamed from: a */
        public int mo48054a() {
            return this.f34227f;
        }

        /* renamed from: b */
        public int mo48055b() {
            return this.f34223b;
        }

        /* renamed from: c */
        public int mo48056c() {
            return this.f34224c;
        }

        /* renamed from: d */
        public int mo48057d() {
            return this.f34226e;
        }

        /* renamed from: e */
        public long mo48058e() {
            return this.f34225d;
        }

        /* renamed from: f */
        public int mo48059f() {
            return this.f34222a;
        }

        /* renamed from: i */
        public final void mo48060i() {
            if (this.f34226e % 2 != 0) {
                int i = this.f34222a;
                this.f34222a = this.f34223b;
                this.f34223b = i;
            }
            this.f34226e = 0;
        }

        public C6521b(@RecentlyNonNull C6521b bVar) {
            this.f34222a = bVar.mo48059f();
            this.f34223b = bVar.mo48055b();
            this.f34224c = bVar.mo48056c();
            this.f34225d = bVar.mo48058e();
            this.f34226e = bVar.mo48057d();
            this.f34227f = bVar.mo48054a();
        }
    }
}
