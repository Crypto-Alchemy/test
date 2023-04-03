package p000;

import android.os.Looper;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: lr */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6225lr {
    /* renamed from: a */
    public static void m47911a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder();
            sb.append("checkMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS NOT the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static void m47912b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder();
            sb.append("checkNotMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: c */
    public static void m47913c(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }
}
