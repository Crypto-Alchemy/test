package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: kh2 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class kh2 {

    /* renamed from: a */
    public static int f30875a = 4225;

    /* renamed from: b */
    public static final Object f30876b = new Object();

    /* renamed from: c */
    public static wh9 f30877c = null;

    /* renamed from: d */
    public static HandlerThread f30878d = null;

    /* renamed from: e */
    public static boolean f30879e = false;

    /* renamed from: a */
    public static int m47092a() {
        return f30875a;
    }

    /* renamed from: b */
    public static kh2 m47093b(Context context) {
        Looper looper;
        synchronized (f30876b) {
            if (f30877c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f30879e) {
                    looper = m47094c().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f30877c = new wh9(applicationContext, looper);
            }
        }
        return f30877c;
    }

    /* renamed from: c */
    public static HandlerThread m47094c() {
        synchronized (f30876b) {
            HandlerThread handlerThread = f30878d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f30878d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f30878d;
            return handlerThread3;
        }
    }

    /* renamed from: d */
    public abstract void mo44798d(ib9 ib9, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void mo44799e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo44798d(new ib9(str, str2, i, z), serviceConnection, str3);
    }

    /* renamed from: f */
    public abstract boolean mo44800f(ib9 ib9, ServiceConnection serviceConnection, String str, Executor executor);
}
