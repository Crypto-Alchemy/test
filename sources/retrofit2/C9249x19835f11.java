package retrofit2;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"", "T", "", "it", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 0})
/* renamed from: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2 */
/* compiled from: KotlinExtensions.kt */
public final class C9249x19835f11 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ k90 $this_await$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9249x19835f11(k90 k90) {
        super(1);
        this.$this_await$inlined = k90;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        this.$this_await$inlined.cancel();
    }
}
