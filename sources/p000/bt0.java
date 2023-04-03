package p000;

import java.math.BigInteger;
import java.util.concurrent.Callable;

/* renamed from: bt0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class bt0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Class f36947a;

    /* renamed from: d */
    public final /* synthetic */ vj7 f36948d;

    /* renamed from: e */
    public final /* synthetic */ yt6 f36949e;

    /* renamed from: g */
    public final /* synthetic */ it0 f36950g;

    /* renamed from: k */
    public final /* synthetic */ String f36951k;

    /* renamed from: r */
    public final /* synthetic */ String f36952r;

    public /* synthetic */ bt0(Class cls, vj7 vj7, yt6 yt6, it0 it0, String str, String str2) {
        this.f36947a = cls;
        this.f36948d = vj7;
        this.f36949e = yt6;
        this.f36950g = it0;
        this.f36951k = str;
        this.f36952r = str2;
    }

    public final Object call() {
        return gt0.deploy(this.f36947a, this.f36948d, this.f36949e, this.f36950g, this.f36951k, this.f36952r, BigInteger.ZERO);
    }
}
