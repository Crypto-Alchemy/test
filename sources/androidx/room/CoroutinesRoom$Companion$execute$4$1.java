package androidx.room;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"R", "", "it", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CoroutinesRoom.kt */
public final class CoroutinesRoom$Companion$execute$4$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ y23 $job;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, y23 y23) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = y23;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        be6.m11296a(this.$cancellationSignal);
        y23.C9621a.m74226a(this.$job, (CancellationException) null, 1, (Object) null);
    }
}
