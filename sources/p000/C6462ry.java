package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4033b;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ry */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C6462ry<T extends IInterface> {

    /* renamed from: q1 */
    public static final String[] f33632q1 = {"service_esmobile", "service_googleme"};

    /* renamed from: r1 */
    public static final Feature[] f33633r1 = new Feature[0];

    /* renamed from: A */
    public final kh2 f33634A;

    /* renamed from: B */
    public final zh2 f33635B;

    /* renamed from: C */
    public final Handler f33636C;

    /* renamed from: H */
    public final Object f33637H;

    /* renamed from: I */
    public final Object f33638I;

    /* renamed from: L */
    public fo2 f33639L;

    /* renamed from: M */
    public C6465c f33640M;

    /* renamed from: P */
    public IInterface f33641P;

    /* renamed from: Q */
    public final ArrayList f33642Q;

    /* renamed from: U */
    public hl8 f33643U;

    /* renamed from: X */
    public int f33644X;

    /* renamed from: Y */
    public final C6463a f33645Y;

    /* renamed from: Z */
    public final C6464b f33646Z;

    /* renamed from: a */
    public int f33647a;

    /* renamed from: b1 */
    public ConnectionResult f33648b1;

    /* renamed from: d */
    public long f33649d;

    /* renamed from: e */
    public long f33650e;

    /* renamed from: e0 */
    public final int f33651e0;

    /* renamed from: e1 */
    public boolean f33652e1;

    /* renamed from: g */
    public int f33653g;

    /* renamed from: k */
    public long f33654k;

    /* renamed from: k0 */
    public final String f33655k0;

    /* renamed from: o1 */
    public volatile zzj f33656o1;

    /* renamed from: p1 */
    public AtomicInteger f33657p1;

    /* renamed from: r */
    public volatile String f33658r;

    /* renamed from: s */
    public zi9 f33659s;

    /* renamed from: v0 */
    public volatile String f33660v0;

    /* renamed from: x */
    public final Context f33661x;

    /* renamed from: y */
    public final Looper f33662y;

    /* renamed from: ry$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C6463a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* renamed from: ry$b */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C6464b {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: ry$c */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C6465c {
        /* renamed from: a */
        void mo45313a(ConnectionResult connectionResult);
    }

    /* renamed from: ry$d */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public class C6466d implements C6465c {
        public C6466d() {
        }

        /* renamed from: a */
        public final void mo45313a(ConnectionResult connectionResult) {
            if (connectionResult.mo30462v1()) {
                C6462ry ryVar = C6462ry.this;
                ryVar.mo47554m((C4033b) null, ryVar.mo44464H());
            } else if (C6462ry.this.f33646Z != null) {
                C6462ry.this.f33646Z.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: ry$e */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C6467e {
        /* renamed from: a */
        void mo47564a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6462ry(android.content.Context r10, android.os.Looper r11, int r12, p000.C6462ry.C6463a r13, p000.C6462ry.C6464b r14, java.lang.String r15) {
        /*
            r9 = this;
            kh2 r3 = p000.kh2.m47093b(r10)
            zh2 r4 = p000.zh2.m55108h()
            p000.cu4.m43221k(r13)
            p000.cu4.m43221k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6462ry.<init>(android.content.Context, android.os.Looper, int, ry$a, ry$b, java.lang.String):void");
    }

    /* renamed from: h0 */
    public static /* bridge */ /* synthetic */ void m51377h0(C6462ry ryVar, zzj zzj) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        ryVar.f33656o1 = zzj;
        if (ryVar.mo47543X()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj.f22332g;
            rh5 b = rh5.m51097b();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.mo30646w1();
            }
            b.mo47417c(rootTelemetryConfiguration);
        }
    }

    /* renamed from: i0 */
    public static /* bridge */ /* synthetic */ void m51378i0(C6462ry ryVar, int i) {
        int i2;
        int i3;
        synchronized (ryVar.f33637H) {
            i2 = ryVar.f33644X;
        }
        if (i2 == 3) {
            ryVar.f33652e1 = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = ryVar.f33636C;
        handler.sendMessage(handler.obtainMessage(i3, ryVar.f33657p1.get(), 16));
    }

    /* renamed from: l0 */
    public static /* bridge */ /* synthetic */ boolean m51380l0(C6462ry ryVar, int i, int i2, IInterface iInterface) {
        synchronized (ryVar.f33637H) {
            if (ryVar.f33644X != i) {
                return false;
            }
            ryVar.mo47556n0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: m0 */
    public static /* bridge */ /* synthetic */ boolean m51381m0(C6462ry ryVar) {
        if (ryVar.f33652e1 || TextUtils.isEmpty(ryVar.mo28792J()) || TextUtils.isEmpty(ryVar.mo47530G())) {
            return false;
        }
        try {
            Class.forName(ryVar.mo28792J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: A */
    public Feature[] mo42127A() {
        return f33633r1;
    }

    /* renamed from: B */
    public Executor mo44463B() {
        return null;
    }

    /* renamed from: C */
    public Bundle mo47527C() {
        return null;
    }

    /* renamed from: D */
    public final Context mo47528D() {
        return this.f33661x;
    }

    /* renamed from: E */
    public int mo47529E() {
        return this.f33651e0;
    }

    /* renamed from: F */
    public Bundle mo42128F() {
        return new Bundle();
    }

    /* renamed from: G */
    public String mo47530G() {
        return null;
    }

    /* renamed from: H */
    public Set<Scope> mo44464H() {
        return Collections.emptySet();
    }

    /* renamed from: I */
    public final T mo47531I() throws DeadObjectException {
        T t;
        synchronized (this.f33637H) {
            if (this.f33644X != 5) {
                mo47562w();
                t = this.f33641P;
                cu4.m43222l(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* renamed from: J */
    public abstract String mo28792J();

    /* renamed from: K */
    public abstract String mo28793K();

    /* renamed from: L */
    public String mo47532L() {
        return "com.google.android.gms";
    }

    /* renamed from: M */
    public ConnectionTelemetryConfiguration mo47533M() {
        zzj zzj = this.f33656o1;
        if (zzj == null) {
            return null;
        }
        return zzj.f22332g;
    }

    /* renamed from: N */
    public boolean mo42129N() {
        if (mo28794p() >= 211700000) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public boolean mo47534O() {
        return this.f33656o1 != null;
    }

    /* renamed from: P */
    public void mo47535P(T t) {
        this.f33650e = System.currentTimeMillis();
    }

    /* renamed from: Q */
    public void mo47536Q(ConnectionResult connectionResult) {
        this.f33653g = connectionResult.mo30457r1();
        this.f33654k = System.currentTimeMillis();
    }

    /* renamed from: R */
    public void mo47537R(int i) {
        this.f33647a = i;
        this.f33649d = System.currentTimeMillis();
    }

    /* renamed from: S */
    public void mo47538S(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f33636C;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new zo8(this, i, iBinder, bundle)));
    }

    /* renamed from: T */
    public boolean mo47539T() {
        return false;
    }

    /* renamed from: U */
    public void mo47540U(String str) {
        this.f33660v0 = str;
    }

    /* renamed from: V */
    public void mo47541V(int i) {
        Handler handler = this.f33636C;
        handler.sendMessage(handler.obtainMessage(6, this.f33657p1.get(), i));
    }

    /* renamed from: W */
    public void mo47542W(C6465c cVar, int i, PendingIntent pendingIntent) {
        cu4.m43222l(cVar, "Connection progress callbacks cannot be null.");
        this.f33640M = cVar;
        Handler handler = this.f33636C;
        handler.sendMessage(handler.obtainMessage(3, this.f33657p1.get(), i, pendingIntent));
    }

    /* renamed from: X */
    public boolean mo47543X() {
        return false;
    }

    /* renamed from: a */
    public void mo47544a() {
        this.f33657p1.incrementAndGet();
        synchronized (this.f33642Q) {
            int size = this.f33642Q.size();
            for (int i = 0; i < size; i++) {
                ((qe8) this.f33642Q.get(i)).mo47096d();
            }
            this.f33642Q.clear();
        }
        synchronized (this.f33638I) {
            this.f33639L = null;
        }
        mo47556n0(1, (IInterface) null);
    }

    /* renamed from: b */
    public boolean mo47545b() {
        boolean z;
        synchronized (this.f33637H) {
            if (this.f33644X == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo47546c() {
        return false;
    }

    /* renamed from: c0 */
    public final String mo47547c0() {
        String str = this.f33655k0;
        if (str == null) {
            return this.f33661x.getClass().getName();
        }
        return str;
    }

    /* renamed from: d */
    public void mo47548d(String str) {
        this.f33658r = str;
        mo47544a();
    }

    /* renamed from: e */
    public boolean mo47549e() {
        boolean z;
        synchronized (this.f33637H) {
            int i = this.f33644X;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: f */
    public String mo47550f() {
        zi9 zi9;
        if (mo47545b() && (zi9 = this.f33659s) != null) {
            return zi9.mo49858b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: g */
    public boolean mo47551g() {
        return true;
    }

    /* renamed from: h */
    public void mo47552h(C6467e eVar) {
        eVar.mo47564a();
    }

    /* renamed from: j */
    public boolean mo30551j() {
        return false;
    }

    /* renamed from: j0 */
    public final void mo47553j0(int i, Bundle bundle, int i2) {
        Handler handler = this.f33636C;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new js8(this, i, (Bundle) null)));
    }

    /* renamed from: m */
    public void mo47554m(C4033b bVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle F = mo42128F();
        int i = this.f33651e0;
        String str = this.f33660v0;
        int i2 = zh2.f36159a;
        Scope[] scopeArr = GetServiceRequest.f22283L;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f22284M;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f22293g = this.f33661x.getPackageName();
        getServiceRequest3.f22296s = F;
        if (set2 != null) {
            getServiceRequest3.f22295r = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo30551j()) {
            Account z = mo44467z();
            if (z == null) {
                z = new Account("<<default account>>", "com.google");
            }
            getServiceRequest3.f22297x = z;
            if (bVar != null) {
                getServiceRequest3.f22294k = bVar.asBinder();
            }
        } else if (mo47539T()) {
            getServiceRequest3.f22297x = mo44467z();
        }
        getServiceRequest3.f22298y = f33633r1;
        getServiceRequest3.f22285A = mo42127A();
        if (mo47543X()) {
            getServiceRequest3.f22288H = true;
        }
        try {
            synchronized (this.f33638I) {
                fo2 fo2 = this.f33639L;
                if (fo2 != null) {
                    fo2.mo28884x0(new yh8(this, this.f33657p1.get()), getServiceRequest3);
                }
            }
        } catch (DeadObjectException unused) {
            mo47541V(3);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo47538S(8, (IBinder) null, (Bundle) null, this.f33657p1.get());
        }
    }

    /* renamed from: n */
    public void mo47555n(C6465c cVar) {
        cu4.m43222l(cVar, "Connection progress callbacks cannot be null.");
        this.f33640M = cVar;
        mo47556n0(2, (IInterface) null);
    }

    /* renamed from: n0 */
    public final void mo47556n0(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        zi9 zi9;
        zi9 zi92;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        cu4.m43211a(z3);
        synchronized (this.f33637H) {
            this.f33644X = i;
            this.f33641P = iInterface;
            if (i == 1) {
                hl8 hl8 = this.f33643U;
                if (hl8 != null) {
                    kh2 kh2 = this.f33634A;
                    String c = this.f33659s.mo49859c();
                    cu4.m43221k(c);
                    kh2.mo44799e(c, this.f33659s.mo49858b(), this.f33659s.mo49857a(), hl8, mo47547c0(), this.f33659s.mo49860d());
                    this.f33643U = null;
                }
            } else if (i == 2 || i == 3) {
                hl8 hl82 = this.f33643U;
                if (!(hl82 == null || (zi92 = this.f33659s) == null)) {
                    String c2 = zi92.mo49859c();
                    String b = zi92.mo49858b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c2);
                    sb.append(" on ");
                    sb.append(b);
                    kh2 kh22 = this.f33634A;
                    String c3 = this.f33659s.mo49859c();
                    cu4.m43221k(c3);
                    kh22.mo44799e(c3, this.f33659s.mo49858b(), this.f33659s.mo49857a(), hl82, mo47547c0(), this.f33659s.mo49860d());
                    this.f33657p1.incrementAndGet();
                }
                hl8 hl83 = new hl8(this, this.f33657p1.get());
                this.f33643U = hl83;
                if (this.f33644X != 3 || mo47530G() == null) {
                    zi9 = new zi9(mo47532L(), mo28793K(), false, kh2.m47092a(), mo42129N());
                } else {
                    zi9 = new zi9(mo47528D().getPackageName(), mo47530G(), true, kh2.m47092a(), false);
                }
                this.f33659s = zi9;
                if (zi9.mo49860d()) {
                    if (mo28794p() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f33659s.mo49859c())));
                    }
                }
                kh2 kh23 = this.f33634A;
                String c4 = this.f33659s.mo49859c();
                cu4.m43221k(c4);
                String b2 = this.f33659s.mo49858b();
                int a = this.f33659s.mo49857a();
                if (!kh23.mo44800f(new ib9(c4, b2, a, this.f33659s.mo49860d()), hl83, mo47547c0(), mo44463B())) {
                    String c5 = this.f33659s.mo49859c();
                    String b3 = this.f33659s.mo49858b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unable to connect to service: ");
                    sb2.append(c5);
                    sb2.append(" on ");
                    sb2.append(b3);
                    mo47553j0(16, (Bundle) null, this.f33657p1.get());
                }
            } else if (i == 4) {
                cu4.m43221k(iInterface);
                mo47535P(iInterface);
            }
        }
    }

    /* renamed from: o */
    public void mo47557o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        fo2 fo2;
        synchronized (this.f33637H) {
            i = this.f33644X;
            iInterface = this.f33641P;
        }
        synchronized (this.f33638I) {
            fo2 = this.f33639L;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo28792J()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (fo2 == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(fo2.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f33650e > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f33650e;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f33649d > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f33647a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f33649d;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f33654k > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(rl0.m51152a(this.f33653g));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f33654k;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    /* renamed from: p */
    public int mo28794p() {
        return zh2.f36159a;
    }

    /* renamed from: q */
    public final Feature[] mo47558q() {
        zzj zzj = this.f33656o1;
        if (zzj == null) {
            return null;
        }
        return zzj.f22330d;
    }

    /* renamed from: s */
    public String mo47559s() {
        return this.f33658r;
    }

    /* renamed from: t */
    public Intent mo47560t() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: v */
    public void mo47561v() {
        int j = this.f33635B.mo49670j(this.f33661x, mo28794p());
        if (j != 0) {
            mo47556n0(1, (IInterface) null);
            mo47542W(new C6466d(), j, (PendingIntent) null);
            return;
        }
        mo47555n(new C6466d());
    }

    /* renamed from: w */
    public final void mo47562w() {
        if (!mo47545b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: x */
    public abstract T mo28795x(IBinder iBinder);

    /* renamed from: y */
    public boolean mo47563y() {
        return false;
    }

    /* renamed from: z */
    public Account mo44467z() {
        return null;
    }

    public C6462ry(Context context, Looper looper, kh2 kh2, zh2 zh2, int i, C6463a aVar, C6464b bVar, String str) {
        this.f33658r = null;
        this.f33637H = new Object();
        this.f33638I = new Object();
        this.f33642Q = new ArrayList();
        this.f33644X = 1;
        this.f33648b1 = null;
        this.f33652e1 = false;
        this.f33656o1 = null;
        this.f33657p1 = new AtomicInteger(0);
        cu4.m43222l(context, "Context must not be null");
        this.f33661x = context;
        cu4.m43222l(looper, "Looper must not be null");
        this.f33662y = looper;
        cu4.m43222l(kh2, "Supervisor must not be null");
        this.f33634A = kh2;
        cu4.m43222l(zh2, "API availability must not be null");
        this.f33635B = zh2;
        this.f33636C = new va8(this, looper);
        this.f33651e0 = i;
        this.f33645Y = aVar;
        this.f33646Z = bVar;
        this.f33655k0 = str;
    }
}
