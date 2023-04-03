package p000;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: kb1 */
/* compiled from: DelayProducer */
public class kb1 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final vv4<nh0<kh0>> f14029a;

    /* renamed from: b */
    public final ScheduledExecutorService f14030b;

    /* renamed from: kb1$a */
    /* compiled from: DelayProducer */
    public class C2656a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ vq0 f14031a;

        /* renamed from: d */
        public final /* synthetic */ wv4 f14032d;

        public C2656a(vq0 vq0, wv4 wv4) {
            this.f14031a = vq0;
            this.f14032d = wv4;
        }

        public void run() {
            kb1.this.f14029a.mo11350a(this.f14031a, this.f14032d);
        }
    }

    public kb1(vv4<nh0<kh0>> vv4, ScheduledExecutorService scheduledExecutorService) {
        this.f14029a = vv4;
        this.f14030b = scheduledExecutorService;
    }

    /* renamed from: a */
    public void mo11350a(vq0<nh0<kh0>> vq0, wv4 wv4) {
        ImageRequest i = wv4.mo20286i();
        ScheduledExecutorService scheduledExecutorService = this.f14030b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new C2656a(vq0, wv4), (long) i.mo13441f(), TimeUnit.MILLISECONDS);
        } else {
            this.f14029a.mo11350a(vq0, wv4);
        }
    }
}
