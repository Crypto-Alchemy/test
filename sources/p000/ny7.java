package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import java.util.ArrayList;
import java.util.Map;
import p000.C6462ry;

/* renamed from: ny7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ny7 extends uy7 {

    /* renamed from: d */
    public final Map f32226d;

    /* renamed from: e */
    public final /* synthetic */ vy7 f32227e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ny7(vy7 vy7, Map map) {
        super(vy7, (ty7) null);
        this.f32227e = vy7;
        this.f32226d = map;
    }

    /* renamed from: a */
    public final void mo46266a() {
        o28 o28 = new o28(this.f32227e.f35196d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C4013a.C4021f fVar : this.f32226d.keySet()) {
            if (!fVar.mo30549g() || ((ky7) this.f32226d.get(fVar)).f31127c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = o28.mo46302b(this.f32227e.f35195c, (C4013a.C4021f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = o28.mo46302b(this.f32227e.f35195c, (C4013a.C4021f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) null);
            vy7 vy7 = this.f32227e;
            vy7.f35193a.mo45939l(new ly7(this, vy7, connectionResult));
            return;
        }
        vy7 vy72 = this.f32227e;
        if (vy72.f35205m && vy72.f35203k != null) {
            vy72.f35203k.mo45328k();
        }
        for (C4013a.C4021f fVar2 : this.f32226d.keySet()) {
            C6462ry.C6465c cVar = (C6462ry.C6465c) this.f32226d.get(fVar2);
            if (!fVar2.mo30549g() || o28.mo46302b(this.f32227e.f35195c, fVar2) == 0) {
                fVar2.mo30554n(cVar);
            } else {
                vy7 vy73 = this.f32227e;
                vy73.f35193a.mo45939l(new my7(this, vy73, cVar));
            }
        }
    }
}
