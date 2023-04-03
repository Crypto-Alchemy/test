package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class AvailabilityException extends Exception {
    private final C2781lq zaa;

    public AvailabilityException(C2781lq lqVar) {
        this.zaa = lqVar;
    }

    public ConnectionResult getConnectionResult(C4023b<? extends C4013a.C4017d> bVar) {
        C6286nm<? extends C4013a.C4017d> c = bVar.mo30559c();
        boolean z = this.zaa.get(c) != null;
        String b = c.mo46101b();
        cu4.m43212b(z, "The given API (" + b + ") was not part of the availability request.");
        return (ConnectionResult) cu4.m43221k((ConnectionResult) this.zaa.get(c));
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C6286nm nmVar : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) cu4.m43221k((ConnectionResult) this.zaa.get(nmVar));
            z &= !connectionResult.mo30462v1();
            arrayList.add(nmVar.mo46101b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    public ConnectionResult getConnectionResult(C4026c<? extends C4013a.C4017d> cVar) {
        C6286nm<? extends C4013a.C4017d> c = cVar.mo30559c();
        boolean z = this.zaa.get(c) != null;
        String b = c.mo46101b();
        cu4.m43212b(z, "The given API (" + b + ") was not part of the availability request.");
        return (ConnectionResult) cu4.m43221k((ConnectionResult) this.zaa.get(c));
    }
}
