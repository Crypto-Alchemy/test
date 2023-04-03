package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: io0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class io0 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f13337a;

    public /* synthetic */ io0(String str) {
        this.f13337a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return jo0.m20287c(this.f13337a, runnable);
    }
}
