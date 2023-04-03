package p000;

import java.lang.Thread;

/* renamed from: vq8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class vq8 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f34989a;

    /* renamed from: b */
    public final /* synthetic */ cr8 f34990b;

    public vq8(cr8 cr8, String str) {
        this.f34990b = cr8;
        cu4.m43221k(str);
        this.f34989a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f34990b.f34342a.mo45237A().mo29670l().mo48770b(this.f34989a, th);
    }
}
