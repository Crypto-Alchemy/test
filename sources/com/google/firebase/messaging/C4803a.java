package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.a */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class C4803a {

    /* renamed from: a */
    public static final long f25448a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.a$a */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static final class C4804a {
        /* renamed from: a */
        public static C2781lq<String, String> m38629a(Bundle bundle) {
            C2781lq<String, String> lqVar = new C2781lq<>();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        lqVar.put(next, str);
                    }
                }
            }
            return lqVar;
        }
    }
}
