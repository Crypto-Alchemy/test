package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: nz1 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class nz1 {
    /* renamed from: a */
    public static Executor m49100a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z24("Firebase-Messaging-Trigger-Topics-Io"));
    }

    /* renamed from: b */
    public static ScheduledExecutorService m49101b() {
        return new ScheduledThreadPoolExecutor(1, new z24("Firebase-Messaging-Init"));
    }

    /* renamed from: c */
    public static ExecutorService m49102c() {
        jy8.m46808a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z24("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: d */
    public static ExecutorService m49103d() {
        return Executors.newSingleThreadExecutor(new z24("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: e */
    public static ExecutorService m49104e() {
        return Executors.newSingleThreadExecutor(new z24("Firebase-Messaging-Task"));
    }

    /* renamed from: f */
    public static ScheduledExecutorService m49105f() {
        return new ScheduledThreadPoolExecutor(1, new z24("Firebase-Messaging-Topics-Io"));
    }

    /* renamed from: g */
    public static Executor m49106g() {
        return m49100a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
