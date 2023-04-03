package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: ig2 */
/* compiled from: GifDecoder */
public interface ig2 {

    /* renamed from: ig2$a */
    /* compiled from: GifDecoder */
    public interface C2541a {
        /* renamed from: a */
        void mo21169a(Bitmap bitmap);

        /* renamed from: b */
        byte[] mo21170b(int i);

        /* renamed from: c */
        Bitmap mo21171c(int i, int i2, Bitmap.Config config);

        /* renamed from: d */
        int[] mo21172d(int i);

        /* renamed from: e */
        void mo21173e(byte[] bArr);

        /* renamed from: f */
        void mo21174f(int[] iArr);
    }

    /* renamed from: a */
    int mo18571a();

    /* renamed from: b */
    Bitmap mo18572b();

    /* renamed from: c */
    void mo18573c();

    void clear();

    /* renamed from: d */
    void mo18575d(Bitmap.Config config);

    /* renamed from: e */
    int mo18576e();

    /* renamed from: f */
    void mo18577f();

    /* renamed from: g */
    int mo18578g();

    ByteBuffer getData();

    /* renamed from: h */
    int mo18580h();
}
