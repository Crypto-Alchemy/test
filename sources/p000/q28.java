package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Set;

/* renamed from: q28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class q28 {

    /* renamed from: a */
    public final C2781lq f32904a;

    /* renamed from: b */
    public final C2781lq f32905b;

    /* renamed from: c */
    public final xl6 f32906c;

    /* renamed from: d */
    public int f32907d;

    /* renamed from: e */
    public boolean f32908e;

    /* renamed from: a */
    public final Set mo46939a() {
        return this.f32904a.keySet();
    }

    /* renamed from: b */
    public final void mo46940b(C6286nm nmVar, ConnectionResult connectionResult, String str) {
        this.f32904a.put(nmVar, connectionResult);
        this.f32905b.put(nmVar, str);
        this.f32907d--;
        if (!connectionResult.mo30462v1()) {
            this.f32908e = true;
        }
        if (this.f32907d != 0) {
            return;
        }
        if (this.f32908e) {
            this.f32906c.mo49504b(new AvailabilityException(this.f32904a));
            return;
        }
        this.f32906c.mo49505c(this.f32905b);
    }
}
