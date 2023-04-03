package p000;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;

/* renamed from: qy0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class qy0 implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ CustomTabsService.C0323a f17091a;

    /* renamed from: b */
    public final /* synthetic */ ty0 f17092b;

    public /* synthetic */ qy0(CustomTabsService.C0323a aVar, ty0 ty0) {
        this.f17091a = aVar;
        this.f17092b = ty0;
    }

    public final void binderDied() {
        this.f17091a.m1791t1(this.f17092b);
    }
}
