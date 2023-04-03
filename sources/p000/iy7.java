package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4028a;
import java.util.Set;

/* renamed from: iy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class iy7 implements jz7 {

    /* renamed from: a */
    public final mz7 f30166a;

    /* renamed from: b */
    public boolean f30167b = false;

    public iy7(mz7 mz7) {
        this.f30166a = mz7;
    }

    /* renamed from: a */
    public final void mo43974a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo43975b() {
    }

    /* renamed from: c */
    public final void mo43976c() {
        if (this.f30167b) {
            this.f30167b = false;
            this.f30166a.mo45939l(new hy7(this, this));
        }
    }

    /* renamed from: d */
    public final void mo43977d(ConnectionResult connectionResult, C4013a aVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo43978e(int i) {
        this.f30166a.mo45938k((ConnectionResult) null);
        this.f30166a.f31925o.mo28876b(i, this.f30167b);
    }

    /* renamed from: f */
    public final boolean mo43979f() {
        if (this.f30167b) {
            return false;
        }
        Set<j18> set = this.f30166a.f31924n.f30194w;
        if (set == null || set.isEmpty()) {
            this.f30166a.mo45938k((ConnectionResult) null);
            return true;
        }
        this.f30167b = true;
        for (j18 f : set) {
            f.mo43995f();
        }
        return false;
    }

    /* renamed from: g */
    public final C4028a mo43980g(C4028a aVar) {
        try {
            this.f30166a.f31924n.f30195x.mo45331a(aVar);
            iz7 iz7 = this.f30166a.f31924n;
            C4013a.C4021f fVar = (C4013a.C4021f) iz7.f30186o.get(aVar.mo30599q());
            cu4.m43222l(fVar, "Appropriate Api was not requested.");
            if (fVar.mo30544b() || !this.f30166a.f31917g.containsKey(aVar.mo30599q())) {
                aVar.mo30601s(fVar);
            } else {
                aVar.mo30603u(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f30166a.mo45939l(new gy7(this, this));
        }
        return aVar;
    }

    /* renamed from: i */
    public final void mo43981i() {
        if (this.f30167b) {
            this.f30167b = false;
            this.f30166a.f31924n.f30195x.mo45332b();
            mo43979f();
        }
    }
}
