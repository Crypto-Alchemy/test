package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: n67 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n67 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f15365a;

    public /* synthetic */ n67(String str) {
        this.f15365a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return w67.m29383u0(this.f15365a, runnable);
    }
}
