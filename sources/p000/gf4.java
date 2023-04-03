package p000;

import android.os.IBinder;
import java.lang.reflect.Field;
import p000.ro2;

/* renamed from: gf4 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class gf4<T> extends ro2.C6440a {

    /* renamed from: a */
    public final Object f29234a;

    public gf4(Object obj) {
        this.f29234a = obj;
    }

    /* renamed from: r1 */
    public static <T> T m44715r1(ro2 ro2) {
        if (ro2 instanceof gf4) {
            return ((gf4) ro2).f29234a;
        }
        IBinder asBinder = ro2.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            cu4.m43221k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    /* renamed from: s1 */
    public static <T> ro2 m44716s1(T t) {
        return new gf4(t);
    }
}
