package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: o47 */
/* compiled from: UnsafeAccess */
public class o47 {

    /* renamed from: a */
    public static final Unsafe f32276a;

    static {
        Field field;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException unused) {
            try {
                field = Unsafe.class.getDeclaredField("THE_ONE");
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        field.setAccessible(true);
        f32276a = (Unsafe) field.get((Object) null);
    }
}
