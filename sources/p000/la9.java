package p000;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: la9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class la9 implements PrivilegedExceptionAction<Unsafe> {
    /* renamed from: a */
    public static final Unsafe m47750a() throws Exception {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        return m47750a();
    }
}
