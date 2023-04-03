package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final ExecutorService f22136a = f48.m44202a().mo28900a(new z24("firebase-iid-executor"), dp8.f28272a);

    /* renamed from: a */
    public Executor mo30434a() {
        return this.f22136a;
    }

    /* renamed from: b */
    public abstract int mo30435b(Context context, CloudMessage cloudMessage);

    /* renamed from: c */
    public void mo30436c(Context context, Bundle bundle) {
    }

    /* renamed from: d */
    public void mo30437d(Context context, Bundle bundle) {
    }

    /* renamed from: e */
    public final int mo30438e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            mo30437d(context, extras);
            return -1;
        } else if (!"com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            return 500;
        } else {
            mo30436c(context, extras);
            return -1;
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo30439f(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                i = mo30438e(context, intent2);
            } else {
                i = mo30440g(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }

    /* renamed from: g */
    public final int mo30440g(Context context, Intent intent) {
        tl6<Void> tl6;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            tl6 = jm6.m46619e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            tl6 = pl8.m49990e(context).mo46776b(2, bundle);
        }
        int b = mo30435b(context, new CloudMessage(intent));
        try {
            jm6.m46616b(tl6, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
        }
        return b;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            mo30434a().execute(new uh8(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
