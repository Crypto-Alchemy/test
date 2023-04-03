package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: r */
    public static final Queue<String> f25418r = new ArrayDeque(10);

    /* renamed from: c */
    public Intent mo36197c(Intent intent) {
        return nx5.m49067b().mo46246c();
    }

    /* renamed from: d */
    public void mo36198d(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            mo36238m(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo36242q(intent.getStringExtra("token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown intent action: ".concat(valueOf);
            }
        }
    }

    /* renamed from: j */
    public final boolean mo36235j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f25418r;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                return true;
            }
            "Received duplicate message: ".concat(valueOf);
            return true;
        }
    }

    /* renamed from: k */
    public final void mo36236k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C4806c.m38660t(extras)) {
            C4806c cVar = new C4806c(extras);
            ExecutorService d = nz1.m49103d();
            try {
                if (!new sh1(this, cVar, d).mo47788a()) {
                    d.shutdown();
                    if (C4805b.m38630A(intent)) {
                        C4805b.m38651t(intent);
                    }
                } else {
                    return;
                }
            } finally {
                d.shutdown();
            }
        }
        mo36240o(new RemoteMessage(extras));
    }

    /* renamed from: l */
    public final String mo36237l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* renamed from: m */
    public final void mo36238m(Intent intent) {
        if (!mo36235j(intent.getStringExtra("google.message_id"))) {
            mo36244s(intent);
        }
    }

    /* renamed from: n */
    public void mo36239n() {
    }

    /* renamed from: o */
    public void mo36240o(RemoteMessage remoteMessage) {
    }

    /* renamed from: p */
    public void mo36241p(String str) {
    }

    /* renamed from: q */
    public void mo36242q(String str) {
    }

    /* renamed from: r */
    public void mo36243r(String str, Exception exc) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36244s(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "gcm"
            if (r0 != 0) goto L_0x000b
            r0 = r1
        L_0x000b:
            int r2 = r0.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -2062414158: goto L_0x0032;
                case 102161: goto L_0x002a;
                case 814694033: goto L_0x0020;
                case 814800675: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x003c
        L_0x0016:
            java.lang.String r1 = "send_event"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = r4
            goto L_0x003d
        L_0x0020:
            java.lang.String r1 = "send_error"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = r3
            goto L_0x003d
        L_0x002a:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = 0
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "deleted_messages"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = r5
            goto L_0x003d
        L_0x003c:
            r1 = -1
        L_0x003d:
            if (r1 == 0) goto L_0x0072
            if (r1 == r5) goto L_0x006e
            if (r1 == r4) goto L_0x0064
            if (r1 == r3) goto L_0x0051
            int r7 = r0.length()
            if (r7 == 0) goto L_0x0050
            java.lang.String r7 = "Received message with unknown type: "
            r7.concat(r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r0 = r6.mo36237l(r7)
            com.google.firebase.messaging.SendException r1 = new com.google.firebase.messaging.SendException
            java.lang.String r2 = "error"
            java.lang.String r7 = r7.getStringExtra(r2)
            r1.<init>(r7)
            r6.mo36243r(r0, r1)
            return
        L_0x0064:
            java.lang.String r0 = "google.message_id"
            java.lang.String r7 = r7.getStringExtra(r0)
            r6.mo36241p(r7)
            return
        L_0x006e:
            r6.mo36239n()
            return
        L_0x0072:
            com.google.firebase.messaging.C4805b.m38653v(r7)
            r6.mo36236k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.mo36244s(android.content.Intent):void");
    }
}
