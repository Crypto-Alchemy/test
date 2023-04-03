package p000;

import android.media.metrics.LogSessionId;

/* renamed from: br4 */
/* compiled from: PlayerId */
public final class br4 {

    /* renamed from: b */
    public static final br4 f8227b;

    /* renamed from: a */
    public final C1645a f8228a;

    /* renamed from: br4$a */
    /* compiled from: PlayerId */
    public static final class C1645a {

        /* renamed from: b */
        public static final C1645a f8229b = new C1645a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a */
        public final LogSessionId f8230a;

        public C1645a(LogSessionId logSessionId) {
            this.f8230a = logSessionId;
        }
    }

    static {
        br4 br4;
        if (w67.f19021a < 31) {
            br4 = new br4();
        } else {
            br4 = new br4(C1645a.f8229b);
        }
        f8227b = br4;
    }

    public br4() {
        this((C1645a) null);
        C2725kr.m20987g(w67.f19021a < 31);
    }

    /* renamed from: a */
    public LogSessionId mo11789a() {
        return ((C1645a) C2725kr.m20985e(this.f8228a)).f8230a;
    }

    public br4(LogSessionId logSessionId) {
        this(new C1645a(logSessionId));
    }

    public br4(C1645a aVar) {
        this.f8228a = aVar;
    }
}
