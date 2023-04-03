package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements en0 {
    /* access modifiers changed from: private */
    public static /* synthetic */ o22 lambda$getComponents$0(xm0 xm0) {
        return new C4782a((f22) xm0.get(f22.class), xm0.mo29969c(q57.class), xm0.mo29969c(HeartBeatInfo.class));
    }

    public List<sm0<?>> getComponents() {
        return Arrays.asList(new sm0[]{sm0.m51835c(o22.class).mo47823b(ic1.m45605j(f22.class)).mo47823b(ic1.m45604i(HeartBeatInfo.class)).mo47823b(ic1.m45604i(q57.class)).mo47827f(new p22()).mo47825d(), jg3.m46505b("fire-installations", "17.0.0")});
    }
}
