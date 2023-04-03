package p000;

import kotlinx.coroutines.android.HandlerContext;

/* renamed from: sk2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class sk2 implements zh1 {

    /* renamed from: a */
    public final /* synthetic */ HandlerContext f44577a;

    /* renamed from: d */
    public final /* synthetic */ Runnable f44578d;

    public /* synthetic */ sk2(HandlerContext handlerContext, Runnable runnable) {
        this.f44577a = handlerContext;
        this.f44578d = runnable;
    }

    public final void dispose() {
        HandlerContext.m63237W(this.f44577a, this.f44578d);
    }
}
