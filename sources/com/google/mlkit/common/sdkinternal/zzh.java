package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:common@@18.5.0 */
enum zzh implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        C4913a.m38741a().f25505a.post(runnable);
    }
}
