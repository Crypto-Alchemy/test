package p000;

import com.google.android.gms.internal.vision.C4105e0;
import com.google.android.gms.internal.vision.C4117g0;

/* renamed from: l49 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class l49 implements k79 {

    /* renamed from: b */
    public static final n59 f31178b = new i49();

    /* renamed from: a */
    public final n59 f31179a;

    public l49() {
        this(new q49(l19.m47607c(), m47624b()));
    }

    /* renamed from: b */
    public static n59 m47624b() {
        try {
            return (n59) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f31178b;
        }
    }

    /* renamed from: c */
    public static boolean m47625c(e59 e59) {
        if (e59.zza() == p69.f32586a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final <T> g79<T> mo44699a(Class<T> cls) {
        Class<C4105e0> cls2 = C4105e0.class;
        i79.m45565m(cls);
        e59 b = this.f31179a.mo43463b(cls);
        if (b.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return C4117g0.m34270i(i79.m45524B(), zz8.m55317a(), b.zzc());
            }
            return C4117g0.m34270i(i79.m45560h(), zz8.m55318b(), b.zzc());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m47625c(b)) {
                return v59.m53245s(cls, b, f69.m44207b(), g39.m44507c(), i79.m45524B(), zz8.m55317a(), h59.m45050b());
            }
            return v59.m53245s(cls, b, f69.m44207b(), g39.m44507c(), i79.m45524B(), (wz8<?>) null, h59.m45050b());
        } else if (m47625c(b)) {
            return v59.m53245s(cls, b, f69.m44206a(), g39.m44506a(), i79.m45560h(), zz8.m55318b(), h59.m45049a());
        } else {
            return v59.m53245s(cls, b, f69.m44206a(), g39.m44506a(), i79.m45574v(), (wz8<?>) null, h59.m45049a());
        }
    }

    public l49(n59 n59) {
        this.f31179a = (n59) t19.m52049f(n59, "messageInfoFactory");
    }
}
