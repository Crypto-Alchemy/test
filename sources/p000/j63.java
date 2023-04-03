package p000;

import java.math.BigInteger;
import java.util.concurrent.Callable;

/* renamed from: j63 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j63 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ m63 f38598a;

    /* renamed from: d */
    public final /* synthetic */ BigInteger f38599d;

    /* renamed from: e */
    public final /* synthetic */ boolean f38600e;

    /* renamed from: g */
    public final /* synthetic */ g52 f38601g;

    public /* synthetic */ j63(m63 m63, BigInteger bigInteger, boolean z, g52 g52) {
        this.f38598a = m63;
        this.f38599d = bigInteger;
        this.f38600e = z;
        this.f38601g = g52;
    }

    public final Object call() {
        return this.f38598a.lambda$replayPastBlocksFlowableSync$12(this.f38599d, this.f38600e, this.f38601g);
    }
}
