package p000;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;

/* renamed from: ik */
/* compiled from: AnimatedFactoryProvider */
public class C2551ik {

    /* renamed from: a */
    public static boolean f13294a;

    /* renamed from: b */
    public static C2475hk f13295b;

    /* renamed from: a */
    public static C2475hk m19688a(xo4 xo4, yu1 yu1, nu0<f80, kh0> nu0, boolean z, ExecutorService executorService) {
        if (!f13294a) {
            Class<AnimatedFactoryV2Impl> cls = AnimatedFactoryV2Impl.class;
            try {
                f13295b = cls.getConstructor(new Class[]{xo4.class, yu1.class, nu0.class, Boolean.TYPE, ow5.class}).newInstance(new Object[]{xo4, yu1, nu0, Boolean.valueOf(z), executorService});
            } catch (Throwable unused) {
            }
            if (f13295b != null) {
                f13294a = true;
            }
        }
        return f13295b;
    }
}
