package p000;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: v22 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class v22 implements Runnable {

    /* renamed from: a */
    public final FirebaseMessaging f34817a;

    /* renamed from: d */
    public final xl6 f34818d;

    public v22(FirebaseMessaging firebaseMessaging, xl6 xl6) {
        this.f34817a = firebaseMessaging;
        this.f34818d = xl6;
    }

    public void run() {
        this.f34817a.mo36224t(this.f34818d);
    }
}
