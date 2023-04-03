package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.android.HandlerContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\"\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo44877d2 = {"Landroid/os/Handler;", "", "name", "Ltk2;", "b", "(Landroid/os/Handler;Ljava/lang/String;)Ltk2;", "Landroid/os/Looper;", "", "async", "a", "Ltk2;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: uk2 */
/* compiled from: HandlerDispatcher.kt */
public final class uk2 {

    /* renamed from: a */
    public static final tk2 f45087a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        tk2 tk2 = null;
        try {
            Result.C6167a aVar = Result.Companion;
            obj = Result.m75635constructorimpl(new HandlerContext(m72807a(Looper.getMainLooper(), true), (String) null, 2, (DefaultConstructorMarker) null));
        } catch (Throwable th) {
            Result.C6167a aVar2 = Result.Companion;
            obj = Result.m75635constructorimpl(hg5.m45198a(th));
        }
        if (!Result.m75640isFailureimpl(obj)) {
            tk2 = obj;
        }
        f45087a = tk2;
    }

    /* renamed from: a */
    public static final Handler m72807a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    /* renamed from: b */
    public static final tk2 m72808b(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }
}
