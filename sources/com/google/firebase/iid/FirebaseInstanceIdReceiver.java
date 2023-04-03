package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.C4805b;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    /* renamed from: b */
    public final int mo30435b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) jm6.m46615a(new mz1(context).mo45933g(cloudMessage.mo30432r1()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    /* renamed from: c */
    public final void mo30436c(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (C4805b.m38630A(putExtras)) {
            C4805b.m38650s(putExtras);
        }
    }
}
