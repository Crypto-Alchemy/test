package p000;

import android.app.job.JobParameters;

/* renamed from: m29 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final /* synthetic */ class m29 implements Runnable {

    /* renamed from: a */
    public final v29 f31496a;

    /* renamed from: d */
    public final bn8 f31497d;

    /* renamed from: e */
    public final JobParameters f31498e;

    public m29(v29 v29, bn8 bn8, JobParameters jobParameters) {
        this.f31496a = v29;
        this.f31497d = bn8;
        this.f31498e = jobParameters;
    }

    public final void run() {
        this.f31496a.mo48648i(this.f31497d, this.f31498e);
    }
}
