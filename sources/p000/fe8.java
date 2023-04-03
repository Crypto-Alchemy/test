package p000;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: fe8 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class fe8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ tl6 f28846a;

    /* renamed from: d */
    public final /* synthetic */ ph8 f28847d;

    public fe8(ph8 ph8, tl6 tl6) {
        this.f28847d = ph8;
        this.f28846a = tl6;
    }

    public final void run() {
        if (this.f28846a.mo48143n()) {
            this.f28847d.f32709c.mo48404u();
            return;
        }
        try {
            this.f28847d.f32709c.mo48403t(this.f28847d.f32708b.mo41856a(this.f28846a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f28847d.f32709c.mo48402s((Exception) e.getCause());
            } else {
                this.f28847d.f32709c.mo48402s(e);
            }
        } catch (Exception e2) {
            this.f28847d.f32709c.mo48402s(e2);
        }
    }
}
