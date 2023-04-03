package net.safemoon.androidwallet.activity;

import android.app.NotificationManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroid/app/NotificationManager;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AKTSplashActivity.kt */
public final class AKTSplashActivity$notificationManager$2 extends Lambda implements pc2<NotificationManager> {
    public final /* synthetic */ AKTSplashActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSplashActivity$notificationManager$2(AKTSplashActivity aKTSplashActivity) {
        super(0);
        this.this$0 = aKTSplashActivity;
    }

    public final NotificationManager invoke() {
        Object systemService = this.this$0.getSystemService("notification");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }
}
