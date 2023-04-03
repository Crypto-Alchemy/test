package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;

/* renamed from: uh8 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class uh8 implements Runnable {

    /* renamed from: a */
    public final CloudMessagingReceiver f34599a;

    /* renamed from: d */
    public final Intent f34600d;

    /* renamed from: e */
    public final Context f34601e;

    /* renamed from: g */
    public final boolean f34602g;

    /* renamed from: k */
    public final BroadcastReceiver.PendingResult f34603k;

    public uh8(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f34599a = cloudMessagingReceiver;
        this.f34600d = intent;
        this.f34601e = context;
        this.f34602g = z;
        this.f34603k = pendingResult;
    }

    public final void run() {
        this.f34599a.mo30439f(this.f34600d, this.f34601e, this.f34602g, this.f34603k);
    }
}
