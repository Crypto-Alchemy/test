package retrofit2;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"T", "L;", "it", "Lr37;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 0})
/* renamed from: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 */
/* compiled from: KotlinExtensions.kt */
public final class C9250xc95e9eb1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ k90 $this_awaitResponse$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9250xc95e9eb1(k90 k90) {
        super(1);
        this.$this_awaitResponse$inlined = k90;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
    }
}
