package p000;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Lhi;", "Lz5;", "Lfu0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "Lr37;", "q", "Ljava/lang/reflect/Method;", "m", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: hi */
/* compiled from: AndroidExceptionPreHandler.kt */
public final class C7183hi extends C6754z5 implements fu0 {
    private volatile Object _preHandler = this;

    public C7183hi() {
        super(fu0.f37916i);
    }

    /* renamed from: m */
    public final Method mo52201m() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    /* renamed from: q */
    public void mo4113q(CoroutineContext coroutineContext, Throwable th) {
        boolean z;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Method m = mo52201m();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (m != null) {
                obj = m.invoke((Object) null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
