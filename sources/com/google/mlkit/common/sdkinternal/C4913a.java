package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.mlkit.common.sdkinternal.a */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class C4913a {

    /* renamed from: b */
    public static final Object f25503b = new Object();

    /* renamed from: c */
    public static C4913a f25504c;

    /* renamed from: a */
    public Handler f25505a;

    public C4913a(Looper looper) {
        this.f25505a = new k48(looper);
    }

    /* renamed from: a */
    public static C4913a m38741a() {
        C4913a aVar;
        synchronized (f25503b) {
            if (f25504c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f25504c = new C4913a(handlerThread.getLooper());
            }
            aVar = f25504c;
        }
        return aVar;
    }

    /* renamed from: d */
    public static Executor m38742d() {
        return zzh.INSTANCE;
    }

    /* renamed from: b */
    public <ResultT> tl6<ResultT> mo36735b(Callable<ResultT> callable) {
        xl6 xl6 = new xl6();
        mo36736c(new uo8(callable, xl6));
        return xl6.mo49503a();
    }

    /* renamed from: c */
    public void mo36736c(Runnable runnable) {
        m38742d().execute(runnable);
    }
}
