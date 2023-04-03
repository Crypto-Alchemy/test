package p000;

import java.util.concurrent.CopyOnWriteArraySet;
import p000.mi3;

/* renamed from: li3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class li3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CopyOnWriteArraySet f14526a;

    /* renamed from: d */
    public final /* synthetic */ int f14527d;

    /* renamed from: e */
    public final /* synthetic */ mi3.C2831a f14528e;

    public /* synthetic */ li3(CopyOnWriteArraySet copyOnWriteArraySet, int i, mi3.C2831a aVar) {
        this.f14526a = copyOnWriteArraySet;
        this.f14527d = i;
        this.f14528e = aVar;
    }

    public final void run() {
        mi3.m22305h(this.f14526a, this.f14527d, this.f14528e);
    }
}
