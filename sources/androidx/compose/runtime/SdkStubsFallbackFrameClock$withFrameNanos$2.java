package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo44877d2 = {"R", "Lhu0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", mo48632f = "ActualAndroid.android.kt", mo48633l = {51}, mo48634m = "invokeSuspend")
/* compiled from: ActualAndroid.android.kt */
public final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends SuspendLambda implements fd2<hu0, ns0<? super R>, Object> {
    public final /* synthetic */ rc2<Long, R> $onFrame;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(rc2<? super Long, ? extends R> rc2, ns0<? super SdkStubsFallbackFrameClock$withFrameNanos$2> ns0) {
        super(2, ns0);
        this.$onFrame = rc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super R> ns0) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            this.label = 1;
            if (jb1.m59336a(16, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return this.$onFrame.invoke(a40.m31674e(System.nanoTime()));
    }
}
