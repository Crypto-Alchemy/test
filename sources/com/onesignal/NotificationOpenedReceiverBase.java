package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\u000b"}, mo44877d2 = {"Lcom/onesignal/NotificationOpenedReceiverBase;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: NotificationOpenedReceiverBase.kt */
public abstract class NotificationOpenedReceiverBase extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5294n.m41111g(this, getIntent());
        finish();
    }

    public void onNewIntent(Intent intent) {
        vx2.m53591g(intent, "intent");
        super.onNewIntent(intent);
        C5294n.m41111g(this, getIntent());
        finish();
    }
}
