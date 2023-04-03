package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.internal.C4028a;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: wy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class wy7 implements jz7 {
    @NotOnlyInitialized

    /* renamed from: a */
    public final mz7 f35490a;

    public wy7(mz7 mz7) {
        this.f35490a = mz7;
    }

    /* renamed from: a */
    public final void mo43974a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo43975b() {
        for (C4013a.C4021f a : this.f35490a.f31916f.values()) {
            a.mo30543a();
        }
        this.f35490a.f31924n.f30187p = Collections.emptySet();
    }

    /* renamed from: c */
    public final void mo43976c() {
        this.f35490a.mo45937j();
    }

    /* renamed from: d */
    public final void mo43977d(ConnectionResult connectionResult, C4013a aVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo43978e(int i) {
    }

    /* renamed from: f */
    public final boolean mo43979f() {
        return true;
    }

    /* renamed from: g */
    public final C4028a mo43980g(C4028a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
