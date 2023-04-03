package p000;

import android.content.Context;

/* renamed from: qe9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class qe9 implements ae9 {

    /* renamed from: a */
    public ly4 f33083a;

    /* renamed from: b */
    public final ly4 f33084b;

    /* renamed from: c */
    public final od9 f33085c;

    public qe9(Context context, od9 od9) {
        this.f33085c = od9;
        n70 n70 = n70.f31984g;
        ox6.m49601f(context);
        ix6 g = ox6.m49599c().mo46563g(n70);
        if (n70.mo42641a().contains(qp1.m50725b("json"))) {
            this.f33083a = new ff3(new ke9(g));
        }
        this.f33084b = new ff3(new me9(g));
    }
}
