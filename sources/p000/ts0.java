package p000;

import java.math.BigInteger;
import java.util.concurrent.Callable;

/* renamed from: ts0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ts0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Class f44812a;

    /* renamed from: d */
    public final /* synthetic */ vj7 f44813d;

    /* renamed from: e */
    public final /* synthetic */ cw0 f44814e;

    /* renamed from: g */
    public final /* synthetic */ it0 f44815g;

    /* renamed from: k */
    public final /* synthetic */ String f44816k;

    /* renamed from: r */
    public final /* synthetic */ String f44817r;

    public /* synthetic */ ts0(Class cls, vj7 vj7, cw0 cw0, it0 it0, String str, String str2) {
        this.f44812a = cls;
        this.f44813d = vj7;
        this.f44814e = cw0;
        this.f44815g = it0;
        this.f44816k = str;
        this.f44817r = str2;
    }

    public final Object call() {
        return gt0.deploy(this.f44812a, this.f44813d, this.f44814e, this.f44815g, this.f44816k, this.f44817r, BigInteger.ZERO);
    }
}
