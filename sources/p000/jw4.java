package p000;

import android.view.Choreographer;

/* renamed from: jw4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class jw4 implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f13900a;

    public /* synthetic */ jw4(Runnable runnable) {
        this.f13900a = runnable;
    }

    public final void doFrame(long j) {
        this.f13900a.run();
    }
}
