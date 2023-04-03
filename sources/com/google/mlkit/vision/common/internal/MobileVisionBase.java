package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.C0719h;
import androidx.lifecycle.Lifecycle;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
public class MobileVisionBase<DetectionResultT> implements Closeable, tg3 {

    /* renamed from: d */
    public static final lh2 f25509d = new lh2("MobileVisionBase", "");

    /* renamed from: a */
    public final AtomicBoolean f25510a;

    @C0719h(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        if (!this.f25510a.getAndSet(true)) {
            throw null;
        }
    }
}
