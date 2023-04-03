package p000;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: w22 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class w22 implements Runnable {

    /* renamed from: a */
    public final FirebaseMessaging f35229a;

    /* renamed from: d */
    public final xl6 f35230d;

    public w22(FirebaseMessaging firebaseMessaging, xl6 xl6) {
        this.f35229a = firebaseMessaging;
        this.f35230d = xl6;
    }

    public void run() {
        this.f35229a.mo36221q(this.f35230d);
    }
}
