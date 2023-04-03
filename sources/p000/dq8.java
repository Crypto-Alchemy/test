package p000;

import java.util.concurrent.Callable;

/* renamed from: dq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final /* synthetic */ class dq8 implements Callable {

    /* renamed from: a */
    public final qq8 f28280a;

    /* renamed from: d */
    public final String f28281d;

    public dq8(qq8 qq8, String str) {
        this.f28280a = qq8;
        this.f28281d = str;
    }

    public final Object call() {
        return new mb9("internal.remoteConfig", new nq8(this.f28280a, this.f28281d));
    }
}
