package p000;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: hs6 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class hs6 implements Callable {

    /* renamed from: a */
    public final Context f29707a;

    /* renamed from: d */
    public final ScheduledExecutorService f29708d;

    /* renamed from: e */
    public final FirebaseMessaging f29709e;

    /* renamed from: g */
    public final o22 f29710g;

    /* renamed from: k */
    public final zu3 f29711k;

    /* renamed from: r */
    public final oh2 f29712r;

    public hs6(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, o22 o22, zu3 zu3, oh2 oh2) {
        this.f29707a = context;
        this.f29708d = scheduledExecutorService;
        this.f29709e = firebaseMessaging;
        this.f29710g = o22;
        this.f29711k = zu3;
        this.f29712r = oh2;
    }

    public Object call() {
        return is6.m45937h(this.f29707a, this.f29708d, this.f29709e, this.f29710g, this.f29711k, this.f29712r);
    }
}
