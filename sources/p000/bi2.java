package p000;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4023b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4028a;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: bi2 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class bi2 implements Handler.Callback {

    /* renamed from: Q */
    public static final Status f21324Q = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: U */
    public static final Status f21325U = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: X */
    public static final Object f21326X = new Object();

    /* renamed from: Y */
    public static bi2 f21327Y;

    /* renamed from: A */
    public final AtomicInteger f21328A = new AtomicInteger(1);

    /* renamed from: B */
    public final AtomicInteger f21329B = new AtomicInteger(0);

    /* renamed from: C */
    public final Map f21330C = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: H */
    public dy7 f21331H = null;

    /* renamed from: I */
    public final Set f21332I = new C3162qq();

    /* renamed from: L */
    public final Set f21333L = new C3162qq();
    @NotOnlyInitialized

    /* renamed from: M */
    public final Handler f21334M;

    /* renamed from: P */
    public volatile boolean f21335P = true;

    /* renamed from: a */
    public long f21336a = 5000;

    /* renamed from: d */
    public long f21337d = 120000;

    /* renamed from: e */
    public long f21338e = 10000;

    /* renamed from: g */
    public boolean f21339g = false;

    /* renamed from: k */
    public TelemetryData f21340k;

    /* renamed from: r */
    public om6 f21341r;

    /* renamed from: s */
    public final Context f21342s;

    /* renamed from: x */
    public final yh2 f21343x;

    /* renamed from: y */
    public final o28 f21344y;

    public bi2(Context context, Looper looper, yh2 yh2) {
        this.f21342s = context;
        s38 s38 = new s38(looper, this);
        this.f21334M = s38;
        this.f21343x = yh2;
        this.f21344y = new o28(yh2);
        if (le1.m47789a(context)) {
            this.f21335P = false;
        }
        s38.sendMessage(s38.obtainMessage(6));
    }

    /* renamed from: h */
    public static Status m32549h(C6286nm nmVar, ConnectionResult connectionResult) {
        String b = nmVar.mo46101b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b + " is not available on this device. Connection failed with: " + valueOf);
    }

    /* renamed from: x */
    public static bi2 m32559x(Context context) {
        bi2 bi2;
        synchronized (f21326X) {
            if (f21327Y == null) {
                f21327Y = new bi2(context.getApplicationContext(), kh2.m47094c().getLooper(), yh2.m54754p());
            }
            bi2 = f21327Y;
        }
        return bi2;
    }

    /* renamed from: D */
    public final void mo29593D(C4023b bVar, int i, C4028a aVar) {
        n18 n18 = new n18(i, aVar);
        Handler handler = this.f21334M;
        handler.sendMessage(handler.obtainMessage(4, new q08(n18, this.f21329B.get(), bVar)));
    }

    /* renamed from: E */
    public final void mo29594E(C4023b bVar, int i, wl6 wl6, xl6 xl6, q96 q96) {
        mo29607l(xl6, wl6.mo49232d(), bVar);
        b28 b28 = new b28(i, wl6, xl6, q96);
        Handler handler = this.f21334M;
        handler.sendMessage(handler.obtainMessage(4, new q08(b28, this.f21329B.get(), bVar)));
    }

    /* renamed from: F */
    public final void mo29595F(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f21334M;
        handler.sendMessage(handler.obtainMessage(18, new n08(methodInvocation, i, j, i2)));
    }

    /* renamed from: G */
    public final void mo29596G(ConnectionResult connectionResult, int i) {
        if (!mo29602g(connectionResult, i)) {
            Handler handler = this.f21334M;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: a */
    public final void mo29597a() {
        Handler handler = this.f21334M;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: b */
    public final void mo29598b(C4023b bVar) {
        Handler handler = this.f21334M;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    /* renamed from: c */
    public final void mo29599c(dy7 dy7) {
        synchronized (f21326X) {
            if (this.f21331H != dy7) {
                this.f21331H = dy7;
                this.f21332I.clear();
            }
            this.f21332I.addAll(dy7.mo42093t());
        }
    }

    /* renamed from: d */
    public final void mo29600d(dy7 dy7) {
        synchronized (f21326X) {
            if (this.f21331H == dy7) {
                this.f21331H = null;
                this.f21332I.clear();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo29601f() {
        if (this.f21339g) {
            return false;
        }
        RootTelemetryConfiguration a = rh5.m51097b().mo47416a();
        if (a != null && !a.mo30653t1()) {
            return false;
        }
        int a2 = this.f21344y.mo46301a(this.f21342s, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo29602g(ConnectionResult connectionResult, int i) {
        return this.f21343x.mo49683z(this.f21342s, connectionResult, i);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        long j = 300000;
        uz7 uz7 = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f21338e = j;
                this.f21334M.removeMessages(12);
                for (C6286nm obtainMessage : this.f21330C.keySet()) {
                    Handler handler = this.f21334M;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f21338e);
                }
                break;
            case 2:
                q28 q28 = (q28) message.obj;
                Iterator it = q28.mo46939a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C6286nm nmVar = (C6286nm) it.next();
                        uz7 uz72 = (uz7) this.f21330C.get(nmVar);
                        if (uz72 == null) {
                            q28.mo46940b(nmVar, new ConnectionResult(13), (String) null);
                            break;
                        } else if (uz72.mo48600L()) {
                            q28.mo46940b(nmVar, ConnectionResult.f22149k, uz72.mo48619s().mo30548f());
                        } else {
                            ConnectionResult q = uz72.mo48618q();
                            if (q != null) {
                                q28.mo46940b(nmVar, q, (String) null);
                            } else {
                                uz72.mo48596G(q28);
                                uz72.mo48591B();
                            }
                        }
                    }
                }
            case 3:
                for (uz7 uz73 : this.f21330C.values()) {
                    uz73.mo48590A();
                    uz73.mo48591B();
                }
                break;
            case 4:
            case 8:
            case 13:
                q08 q08 = (q08) message.obj;
                uz7 uz74 = (uz7) this.f21330C.get(q08.f32901c.mo30559c());
                if (uz74 == null) {
                    uz74 = mo29604i(q08.f32901c);
                }
                if (uz74.mo48601M() && this.f21329B.get() != q08.f32900b) {
                    q08.f32899a.mo29427a(f21324Q);
                    uz74.mo48598I();
                    break;
                } else {
                    uz74.mo48592C(q08.f32899a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f21330C.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        uz7 uz75 = (uz7) it2.next();
                        if (uz75.mo48616o() == i2) {
                            uz7 = uz75;
                        }
                    }
                }
                if (uz7 != null) {
                    if (connectionResult.mo30457r1() != 13) {
                        uz7.mo48605d(m32549h(uz7.f34791c, connectionResult));
                        break;
                    } else {
                        String g = this.f21343x.mo49668g(connectionResult.mo30457r1());
                        String s1 = connectionResult.mo30458s1();
                        uz7.mo48605d(new Status(17, "Error resolution was canceled by the user, original error message: " + g + ": " + s1));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f21342s.getApplicationContext() instanceof Application) {
                    C6676ww.m54080c((Application) this.f21342s.getApplicationContext());
                    C6676ww.m54079b().mo49286a(new pz7(this));
                    if (!C6676ww.m54079b().mo49288e(true)) {
                        this.f21338e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                mo29604i((C4023b) message.obj);
                break;
            case 9:
                if (this.f21330C.containsKey(message.obj)) {
                    ((uz7) this.f21330C.get(message.obj)).mo48597H();
                    break;
                }
                break;
            case 10:
                for (C6286nm remove : this.f21333L) {
                    uz7 uz76 = (uz7) this.f21330C.remove(remove);
                    if (uz76 != null) {
                        uz76.mo48598I();
                    }
                }
                this.f21333L.clear();
                break;
            case 11:
                if (this.f21330C.containsKey(message.obj)) {
                    ((uz7) this.f21330C.get(message.obj)).mo48599J();
                    break;
                }
                break;
            case 12:
                if (this.f21330C.containsKey(message.obj)) {
                    ((uz7) this.f21330C.get(message.obj)).mo48602a();
                    break;
                }
                break;
            case 14:
                ey7 ey7 = (ey7) message.obj;
                C6286nm a = ey7.mo42454a();
                if (this.f21330C.containsKey(a)) {
                    ey7.mo42455b().mo49505c(Boolean.valueOf(((uz7) this.f21330C.get(a)).mo48615n(false)));
                    break;
                } else {
                    ey7.mo42455b().mo49505c(Boolean.FALSE);
                    break;
                }
            case 15:
                wz7 wz7 = (wz7) message.obj;
                if (this.f21330C.containsKey(wz7.f35491a)) {
                    uz7.m53135y((uz7) this.f21330C.get(wz7.f35491a), wz7);
                    break;
                }
                break;
            case 16:
                wz7 wz72 = (wz7) message.obj;
                if (this.f21330C.containsKey(wz72.f35491a)) {
                    uz7.m53136z((uz7) this.f21330C.get(wz72.f35491a), wz72);
                    break;
                }
                break;
            case 17:
                mo29606k();
                break;
            case 18:
                n08 n08 = (n08) message.obj;
                if (n08.f31937c != 0) {
                    TelemetryData telemetryData = this.f21340k;
                    if (telemetryData != null) {
                        List s12 = telemetryData.mo30658s1();
                        if (telemetryData.mo30657r1() != n08.f31936b || (s12 != null && s12.size() >= n08.f31938d)) {
                            this.f21334M.removeMessages(17);
                            mo29606k();
                        } else {
                            this.f21340k.mo30659t1(n08.f31935a);
                        }
                    }
                    if (this.f21340k == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(n08.f31935a);
                        this.f21340k = new TelemetryData(n08.f31936b, arrayList);
                        Handler handler2 = this.f21334M;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), n08.f31937c);
                        break;
                    }
                } else {
                    mo29605j().mo28804a(new TelemetryData(n08.f31936b, Arrays.asList(new MethodInvocation[]{n08.f31935a})));
                    break;
                }
                break;
            case 19:
                this.f21339g = false;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown message id: ");
                sb.append(i);
                return false;
        }
        return true;
    }

    /* renamed from: i */
    public final uz7 mo29604i(C4023b bVar) {
        C6286nm c = bVar.mo30559c();
        uz7 uz7 = (uz7) this.f21330C.get(c);
        if (uz7 == null) {
            uz7 = new uz7(this, bVar);
            this.f21330C.put(c, uz7);
        }
        if (uz7.mo48601M()) {
            this.f21333L.add(c);
        }
        uz7.mo48591B();
        return uz7;
    }

    /* renamed from: j */
    public final om6 mo29605j() {
        if (this.f21341r == null) {
            this.f21341r = nm6.m48837a(this.f21342s);
        }
        return this.f21341r;
    }

    /* renamed from: k */
    public final void mo29606k() {
        TelemetryData telemetryData = this.f21340k;
        if (telemetryData != null) {
            if (telemetryData.mo30657r1() > 0 || mo29601f()) {
                mo29605j().mo28804a(telemetryData);
            }
            this.f21340k = null;
        }
    }

    /* renamed from: l */
    public final void mo29607l(xl6 xl6, int i, C4023b bVar) {
        m08 b;
        if (i != 0 && (b = m08.m48022b(this, i, bVar.mo30559c())) != null) {
            tl6 a = xl6.mo49503a();
            Handler handler = this.f21334M;
            handler.getClass();
            a.mo48132c(new oz7(handler), b);
        }
    }

    /* renamed from: m */
    public final int mo29608m() {
        return this.f21328A.getAndIncrement();
    }

    /* renamed from: w */
    public final uz7 mo29609w(C6286nm nmVar) {
        return (uz7) this.f21330C.get(nmVar);
    }
}
