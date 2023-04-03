package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* renamed from: rk2 */
/* compiled from: HandlerCompat */
public final class rk2 {

    /* renamed from: rk2$a */
    /* compiled from: HandlerCompat */
    public static class C3204a {
        /* renamed from: a */
        public static Handler m26267a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: a */
    public static Handler m26266a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3204a.m26267a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }
}
