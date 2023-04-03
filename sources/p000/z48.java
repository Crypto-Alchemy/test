package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: z48 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class z48 extends qe8 {

    /* renamed from: d */
    public final int f35988d;

    /* renamed from: e */
    public final Bundle f35989e;

    /* renamed from: f */
    public final /* synthetic */ C6462ry f35990f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z48(C6462ry ryVar, int i, Bundle bundle) {
        super(ryVar, Boolean.TRUE);
        this.f35990f = ryVar;
        this.f35988d = i;
        this.f35989e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo47093a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f35988d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo44573g()
            if (r3 != 0) goto L_0x001b
            ry r3 = r2.f35990f
            r3.mo47556n0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo44572f(r3)
        L_0x001b:
            return
        L_0x001c:
            ry r3 = r2.f35990f
            r3.mo47556n0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f35989e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f35988d
            r3.<init>(r0, r1)
            r2.mo44572f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z48.mo47093a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo47094b() {
    }

    /* renamed from: f */
    public abstract void mo44572f(ConnectionResult connectionResult);

    /* renamed from: g */
    public abstract boolean mo44573g();
}
