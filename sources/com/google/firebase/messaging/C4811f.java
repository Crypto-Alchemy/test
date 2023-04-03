package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.C4813g;

/* renamed from: com.google.firebase.messaging.f */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class C4811f extends Binder {

    /* renamed from: a */
    public final C4812a f25458a;

    /* renamed from: com.google.firebase.messaging.f$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public interface C4812a {
        /* renamed from: a */
        tl6<Void> mo36207a(Intent intent);
    }

    public C4811f(C4812a aVar) {
        this.f25458a = aVar;
    }

    /* renamed from: b */
    public void mo36283b(C4813g.C4814a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            this.f25458a.mo36207a(aVar.f25465a).mo48132c(xl7.f35657a, new yl7(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
