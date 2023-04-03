package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4033b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import p000.C6462ry;

/* renamed from: l84 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class l84 implements C4013a.C4021f, ServiceConnection {

    /* renamed from: C */
    public static final String f31197C = l84.class.getSimpleName();

    /* renamed from: A */
    public String f31198A;

    /* renamed from: B */
    public String f31199B;

    /* renamed from: a */
    public final String f31200a;

    /* renamed from: d */
    public final String f31201d;

    /* renamed from: e */
    public final ComponentName f31202e;

    /* renamed from: g */
    public final Context f31203g;

    /* renamed from: k */
    public final np0 f31204k;

    /* renamed from: r */
    public final Handler f31205r;

    /* renamed from: s */
    public final dh4 f31206s;

    /* renamed from: x */
    public IBinder f31207x;

    /* renamed from: y */
    public boolean f31208y;

    /* renamed from: a */
    public final void mo30543a() {
        mo45386x();
        String.valueOf(this.f31207x);
        try {
            this.f31203g.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f31208y = false;
        this.f31207x = null;
    }

    /* renamed from: b */
    public final boolean mo30544b() {
        mo45386x();
        if (this.f31207x != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo30545c() {
        return false;
    }

    /* renamed from: d */
    public final void mo30546d(String str) {
        mo45386x();
        this.f31198A = str;
        mo30543a();
    }

    /* renamed from: e */
    public final boolean mo30547e() {
        mo45386x();
        return this.f31208y;
    }

    /* renamed from: f */
    public final String mo30548f() {
        String str = this.f31200a;
        if (str != null) {
            return str;
        }
        cu4.m43221k(this.f31202e);
        return this.f31202e.getPackageName();
    }

    /* renamed from: g */
    public final boolean mo30549g() {
        return false;
    }

    /* renamed from: h */
    public final void mo30550h(C6462ry.C6467e eVar) {
    }

    /* renamed from: j */
    public final boolean mo30551j() {
        return false;
    }

    /* renamed from: k */
    public final /* synthetic */ void mo45381k() {
        this.f31208y = false;
        this.f31207x = null;
        this.f31204k.onConnectionSuspended(1);
    }

    /* renamed from: l */
    public final Set<Scope> mo30552l() {
        return Collections.emptySet();
    }

    /* renamed from: m */
    public final void mo30553m(C4033b bVar, Set<Scope> set) {
    }

    /* renamed from: n */
    public final void mo30554n(C6462ry.C6465c cVar) {
        mo45386x();
        String.valueOf(this.f31207x);
        if (mo30544b()) {
            try {
                mo30546d("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f31202e;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f31200a).setAction(this.f31201d);
            }
            boolean bindService = this.f31203g.bindService(intent, this, kh2.m47092a());
            this.f31208y = bindService;
            if (!bindService) {
                this.f31207x = null;
                this.f31206s.onConnectionFailed(new ConnectionResult(16));
            }
            String.valueOf(this.f31207x);
        } catch (SecurityException e) {
            this.f31208y = false;
            this.f31207x = null;
            throw e;
        }
    }

    /* renamed from: o */
    public final void mo30555o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f31205r.post(new p08(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f31205r.post(new o08(this));
    }

    /* renamed from: p */
    public final int mo28794p() {
        return 0;
    }

    /* renamed from: q */
    public final Feature[] mo30556q() {
        return new Feature[0];
    }

    /* renamed from: s */
    public final String mo30557s() {
        return this.f31198A;
    }

    /* renamed from: t */
    public final Intent mo30558t() {
        return new Intent();
    }

    /* renamed from: v */
    public final /* synthetic */ void mo45384v(IBinder iBinder) {
        this.f31208y = false;
        this.f31207x = iBinder;
        String.valueOf(iBinder);
        this.f31204k.onConnected(new Bundle());
    }

    /* renamed from: w */
    public final void mo45385w(String str) {
        this.f31199B = str;
    }

    /* renamed from: x */
    public final void mo45386x() {
        if (Thread.currentThread() != this.f31205r.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }
}
