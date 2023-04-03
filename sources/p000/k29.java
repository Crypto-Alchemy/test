package p000;

import android.content.Intent;

/* renamed from: k29 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final /* synthetic */ class k29 implements Runnable {

    /* renamed from: a */
    public final v29 f30702a;

    /* renamed from: d */
    public final int f30703d;

    /* renamed from: e */
    public final bn8 f30704e;

    /* renamed from: g */
    public final Intent f30705g;

    public k29(v29 v29, int i, bn8 bn8, Intent intent) {
        this.f30702a = v29;
        this.f30703d = i;
        this.f30704e = bn8;
        this.f30705g = intent;
    }

    public final void run() {
        this.f30702a.mo48649j(this.f30703d, this.f30704e, this.f30705g);
    }
}
