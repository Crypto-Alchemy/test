package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class FirebaseMessagingRegistrar implements en0 {
    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(xm0 xm0) {
        return new FirebaseMessaging((f22) xm0.get(f22.class), (q22) xm0.get(q22.class), xm0.mo29969c(q57.class), xm0.mo29969c(HeartBeatInfo.class), (o22) xm0.get(o22.class), (ix6) xm0.get(ix6.class), (oc6) xm0.get(oc6.class));
    }

    @Keep
    public List<sm0<?>> getComponents() {
        return Arrays.asList(new sm0[]{sm0.m51835c(FirebaseMessaging.class).mo47823b(ic1.m45605j(f22.class)).mo47823b(ic1.m45603h(q22.class)).mo47823b(ic1.m45604i(q57.class)).mo47823b(ic1.m45604i(HeartBeatInfo.class)).mo47823b(ic1.m45603h(ix6.class)).mo47823b(ic1.m45605j(o22.class)).mo47823b(ic1.m45605j(oc6.class)).mo47827f(b32.f21119a).mo47824c().mo47825d(), jg3.m46505b("fire-fcm", "22.0.0")});
    }
}
