package p000;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: r99 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class r99 implements PrivilegedExceptionAction<Unsafe> {
    public final /* synthetic */ Object run() throws Exception {
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
}
