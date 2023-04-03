package p000;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.C4013a.C4015b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: wl6 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class wl6<A extends C4013a.C4015b, ResultT> {

    /* renamed from: a */
    public final Feature[] f35378a;

    /* renamed from: b */
    public final boolean f35379b;

    /* renamed from: c */
    public final int f35380c;

    /* renamed from: wl6$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class C6669a<A extends C4013a.C4015b, ResultT> {

        /* renamed from: a */
        public qc5 f35381a;

        /* renamed from: b */
        public boolean f35382b = true;

        /* renamed from: c */
        public Feature[] f35383c;

        /* renamed from: d */
        public int f35384d = 0;

        public /* synthetic */ C6669a(y08 y08) {
        }

        /* renamed from: a */
        public wl6<A, ResultT> mo49234a() {
            boolean z;
            if (this.f35381a != null) {
                z = true;
            } else {
                z = false;
            }
            cu4.m43212b(z, "execute parameter required");
            return new x08(this, this.f35383c, this.f35382b, this.f35384d);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C6669a<A, ResultT> mo49235b(qc5<A, xl6<ResultT>> qc5) {
            this.f35381a = qc5;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C6669a<A, ResultT> mo49236c(boolean z) {
            this.f35382b = z;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C6669a<A, ResultT> mo49237d(Feature... featureArr) {
            this.f35383c = featureArr;
            return this;
        }
    }

    public wl6(Feature[] featureArr, boolean z, int i) {
        this.f35378a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f35379b = z2;
        this.f35380c = i;
    }

    /* renamed from: a */
    public static <A extends C4013a.C4015b, ResultT> C6669a<A, ResultT> m53972a() {
        return new C6669a<>((y08) null);
    }

    /* renamed from: b */
    public abstract void mo49230b(A a, xl6<ResultT> xl6) throws RemoteException;

    /* renamed from: c */
    public boolean mo49231c() {
        return this.f35379b;
    }

    /* renamed from: d */
    public final int mo49232d() {
        return this.f35380c;
    }

    /* renamed from: e */
    public final Feature[] mo49233e() {
        return this.f35378a;
    }
}
