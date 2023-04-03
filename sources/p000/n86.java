package p000;

import androidx.work.WorkerParameters;

/* renamed from: n86 */
/* compiled from: StartWorkRunnable */
public class n86 implements Runnable {

    /* renamed from: a */
    public nm7 f15374a;

    /* renamed from: d */
    public String f15375d;

    /* renamed from: e */
    public WorkerParameters.C1514a f15376e;

    public n86(nm7 nm7, String str, WorkerParameters.C1514a aVar) {
        this.f15374a = nm7;
        this.f15375d = str;
        this.f15376e = aVar;
    }

    public void run() {
        this.f15374a.mo23741o().mo26582k(this.f15375d, this.f15376e);
    }
}
