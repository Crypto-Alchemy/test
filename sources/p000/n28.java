package p000;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: n28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class n28 extends h38 {

    /* renamed from: r */
    public final SparseArray f31956r = new SparseArray();

    public n28(qg3 qg3) {
        super(qg3, yh2.m54754p());
        this.f22232a.mo30607b("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static n28 m48592t(mg3 mg3) {
        qg3 c = LifecycleCallback.m33663c(mg3);
        n28 n28 = (n28) c.mo30608d("AutoManageHelper", n28.class);
        if (n28 != null) {
            return n28;
        }
        return new n28(c);
    }

    /* renamed from: a */
    public final void mo30588a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f31956r.size(); i++) {
            l28 w = mo45952w(i);
            if (w != null) {
                printWriter.append(str).append("GoogleApiClient #").print(w.f31162a);
                printWriter.println(":");
                w.f31163b.mo30498d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: j */
    public final void mo30595j() {
        super.mo30595j();
        boolean z = this.f29425d;
        String valueOf = String.valueOf(this.f31956r);
        StringBuilder sb = new StringBuilder();
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        if (this.f29426e.get() == null) {
            for (int i = 0; i < this.f31956r.size(); i++) {
                l28 w = mo45952w(i);
                if (w != null) {
                    w.f31163b.connect();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo30596k() {
        super.mo30596k();
        for (int i = 0; i < this.f31956r.size(); i++) {
            l28 w = mo45952w(i);
            if (w != null) {
                w.f31163b.disconnect();
            }
        }
    }

    /* renamed from: m */
    public final void mo42091m(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        l28 l28 = (l28) this.f31956r.get(i);
        if (l28 != null) {
            mo45951v(i);
            GoogleApiClient.C4012c cVar = l28.f31164c;
            if (cVar != null) {
                cVar.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: n */
    public final void mo42092n() {
        for (int i = 0; i < this.f31956r.size(); i++) {
            l28 w = mo45952w(i);
            if (w != null) {
                w.f31163b.connect();
            }
        }
    }

    /* renamed from: u */
    public final void mo45950u(int i, GoogleApiClient googleApiClient, GoogleApiClient.C4012c cVar) {
        boolean z;
        cu4.m43222l(googleApiClient, "GoogleApiClient instance cannot be null");
        if (this.f31956r.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43226p(z, "Already managing a GoogleApiClient with id " + i);
        u28 u28 = (u28) this.f29426e.get();
        boolean z2 = this.f29425d;
        String valueOf = String.valueOf(u28);
        StringBuilder sb = new StringBuilder();
        sb.append("starting AutoManage for client ");
        sb.append(i);
        sb.append(" ");
        sb.append(z2);
        sb.append(" ");
        sb.append(valueOf);
        l28 l28 = new l28(this, i, googleApiClient, cVar);
        googleApiClient.mo30503h(l28);
        this.f31956r.put(i, l28);
        if (this.f29425d && u28 == null) {
            "connecting ".concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    /* renamed from: v */
    public final void mo45951v(int i) {
        l28 l28 = (l28) this.f31956r.get(i);
        this.f31956r.remove(i);
        if (l28 != null) {
            l28.f31163b.mo30504i(l28);
            l28.f31163b.disconnect();
        }
    }

    /* renamed from: w */
    public final l28 mo45952w(int i) {
        if (this.f31956r.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f31956r;
        return (l28) sparseArray.get(sparseArray.keyAt(i));
    }
}
