package p000;

import android.content.Intent;
import com.google.firebase.messaging.EnhancedIntentService;

/* renamed from: jq1 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class jq1 implements Runnable {

    /* renamed from: a */
    public final EnhancedIntentService f30560a;

    /* renamed from: d */
    public final Intent f30561d;

    /* renamed from: e */
    public final xl6 f30562e;

    public jq1(EnhancedIntentService enhancedIntentService, Intent intent, xl6 xl6) {
        this.f30560a = enhancedIntentService;
        this.f30561d = intent;
        this.f30562e = xl6;
    }

    public void run() {
        this.f30560a.mo36201g(this.f30561d, this.f30562e);
    }
}
