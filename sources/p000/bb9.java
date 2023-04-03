package p000;

import android.content.Context;

/* renamed from: bb9 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class bb9 implements na9 {

    /* renamed from: a */
    public ly4 f21235a;

    /* renamed from: b */
    public final ly4 f21236b;

    /* renamed from: c */
    public final da9 f21237c;

    public bb9(Context context, da9 da9) {
        this.f21237c = da9;
        n70 n70 = n70.f31984g;
        ox6.m49601f(context);
        ix6 g = ox6.m49599c().mo46563g(n70);
        if (n70.mo42641a().contains(qp1.m50725b("json"))) {
            this.f21235a = new ff3(new ya9(g));
        }
        this.f21236b = new ff3(new za9(g));
    }
}
