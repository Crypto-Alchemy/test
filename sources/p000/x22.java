package p000;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutorService;

/* renamed from: x22 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class x22 implements ms0 {

    /* renamed from: a */
    public final FirebaseMessaging f35496a;

    /* renamed from: b */
    public final ExecutorService f35497b;

    public x22(FirebaseMessaging firebaseMessaging, ExecutorService executorService) {
        this.f35496a = firebaseMessaging;
        this.f35497b = executorService;
    }

    /* renamed from: a */
    public Object mo41856a(tl6 tl6) {
        return this.f35496a.mo36223s(this.f35497b, tl6);
    }
}
