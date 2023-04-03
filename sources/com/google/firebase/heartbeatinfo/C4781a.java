package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.heartbeatinfo.a */
/* compiled from: DefaultHeartBeatInfo */
public class C4781a implements HeartBeatInfo {

    /* renamed from: d */
    public static final ThreadFactory f25324d = new j81();

    /* renamed from: a */
    public ly4<tl2> f25325a;

    /* renamed from: b */
    public final Set<sl2> f25326b;

    /* renamed from: c */
    public final Executor f25327c;

    public C4781a(Context context, Set<sl2> set) {
        this(new ff3(new l81(context)), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f25324d));
    }

    /* renamed from: e */
    public static sm0<HeartBeatInfo> m38429e() {
        return sm0.m51835c(HeartBeatInfo.class).mo47823b(ic1.m45605j(Context.class)).mo47823b(ic1.m45607l(sl2.class)).mo47827f(new k81()).mo47825d();
    }

    /* renamed from: f */
    public static /* synthetic */ HeartBeatInfo m38430f(xm0 xm0) {
        return new C4781a((Context) xm0.get(Context.class), xm0.mo29968b(sl2.class));
    }

    /* renamed from: h */
    public static /* synthetic */ Thread m38432h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* renamed from: a */
    public HeartBeatInfo.HeartBeat mo36104a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d = this.f25325a.get().mo48129d(str, currentTimeMillis);
        boolean c = this.f25325a.get().mo48128c(currentTimeMillis);
        if (d && c) {
            return HeartBeatInfo.HeartBeat.COMBINED;
        }
        if (c) {
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        if (d) {
            return HeartBeatInfo.HeartBeat.SDK;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    public C4781a(ly4<tl2> ly4, Set<sl2> set, Executor executor) {
        this.f25325a = ly4;
        this.f25326b = set;
        this.f25327c = executor;
    }
}
