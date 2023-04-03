package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l27 */
/* compiled from: TypefaceCompatApi28Impl */
public class l27 extends k27 {
    /* renamed from: i */
    public Typeface mo22165i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f13958g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f13964m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: u */
    public Method mo22174u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
