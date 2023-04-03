package p000;

import com.facebook.imagepipeline.nativecode.WebpTranscoderImpl;

/* renamed from: ik7 */
/* compiled from: WebpTranscoderFactory */
public class ik7 {

    /* renamed from: a */
    public static hk7 f13299a = null;

    /* renamed from: b */
    public static boolean f13300b = false;

    static {
        try {
            f13299a = WebpTranscoderImpl.class.newInstance();
            f13300b = true;
        } catch (Throwable unused) {
            f13300b = false;
        }
    }

    /* renamed from: a */
    public static hk7 m19689a() {
        return f13299a;
    }
}
