package com.google.android.play.core.assetpacks;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

public class ExtractionForegroundService extends Service {

    /* renamed from: a */
    public final pq7 f24697a = new pq7("ExtractionForegroundService");

    /* renamed from: d */
    public Context f24698d;

    /* renamed from: e */
    public ov7 f24699e;

    /* renamed from: g */
    public NotificationManager f24700g;

    /* renamed from: a */
    public final synchronized void mo34146a(Intent intent) {
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 1);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        Notification.Builder a = i >= 26 ? new Notification.Builder(this.f24698d, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra) : new Notification.Builder(this.f24698d).setPriority(-2);
        if (pendingIntent != null) {
            a.setContentIntent(pendingIntent);
        }
        a.setSmallIcon(17301633).setOngoing(false).setContentTitle(stringExtra).setSubText(stringExtra2);
        a.setColor(intent.getIntExtra("notification_color", 0)).setVisibility(-1);
        Notification build = a.build();
        this.f24697a.mo46855d("Starting foreground installation service.", new Object[0]);
        this.f24699e.mo46550a(true);
        if (i >= 26) {
            mo34148c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: b */
    public final synchronized void mo34147b() {
        this.f24697a.mo46855d("Stopping service.", new Object[0]);
        this.f24699e.mo46550a(false);
        stopForeground(true);
        stopSelf();
    }

    @TargetApi(26)
    /* renamed from: c */
    public final synchronized void mo34148c(String str) {
        this.f24700g.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        cu7.m43236h(getApplicationContext()).mo29038a(this);
        this.f24700g = (NotificationManager) this.f24698d.getSystemService("notification");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 1) {
            mo34146a(intent);
        } else if (intExtra == 2) {
            mo34147b();
        } else {
            this.f24697a.mo46853b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}
