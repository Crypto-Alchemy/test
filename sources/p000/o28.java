package p000;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C4013a;

/* renamed from: o28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class o28 {

    /* renamed from: a */
    public final SparseIntArray f32268a = new SparseIntArray();

    /* renamed from: b */
    public zh2 f32269b;

    public o28(zh2 zh2) {
        cu4.m43221k(zh2);
        this.f32269b = zh2;
    }

    /* renamed from: a */
    public final int mo46301a(Context context, int i) {
        return this.f32268a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo46302b(Context context, C4013a.C4021f fVar) {
        cu4.m43221k(context);
        cu4.m43221k(fVar);
        int i = 0;
        if (!fVar.mo30549g()) {
            return 0;
        }
        int p = fVar.mo28794p();
        int a = mo46301a(context, p);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f32268a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f32268a.keyAt(i2);
                if (keyAt > p && this.f32268a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            if (i == -1) {
                a = this.f32269b.mo49670j(context, p);
            } else {
                a = i;
            }
            this.f32268a.put(p, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo46303c() {
        this.f32268a.clear();
    }
}
