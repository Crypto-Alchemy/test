package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import java.security.MessageDigest;

@CheckReturnValue
/* renamed from: hb9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class hb9 {

    /* renamed from: a */
    public static final s69 f29512a = new yo8(y09.m54600r1("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    public static final s69 f29513b = new is8(y09.m54600r1("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    public static final s69 f29514c = new av8(y09.m54600r1("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    public static final s69 f29515d = new ey8(y09.m54600r1("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    public static volatile w68 f29516e;

    /* renamed from: f */
    public static final Object f29517f = new Object();

    /* renamed from: g */
    public static Context f29518g;

    /* renamed from: a */
    public static wj9 m45104a(String str, y09 y09, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m45109f(str, y09, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static wj9 m45105b(String str, boolean z, boolean z2, boolean z3) {
        return m45110g(str, z, false, false, true);
    }

    /* renamed from: c */
    public static /* synthetic */ String m45106c(boolean z, String str, y09 y09) throws Exception {
        boolean z2;
        String str2;
        if (z || !m45109f(str, y09, true, false).f35365a) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (true != z2) {
            str2 = "not allowed";
        } else {
            str2 = "debug cert rejected";
        }
        MessageDigest b = C6533tj.m52321b("SHA-256");
        cu4.m43221k(b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, am2.m31868a(b.digest(y09.mo47695s1())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    public static synchronized void m45107d(Context context) {
        synchronized (hb9.class) {
            if (f29518g != null) {
                return;
            }
            if (context != null) {
                f29518g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static boolean m45108e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m45111h();
            boolean f = f29516e.mo43097f();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return f;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    public static wj9 m45109f(String str, y09 y09, boolean z, boolean z2) {
        try {
            m45111h();
            cu4.m43221k(f29518g);
            try {
                if (f29516e.mo43098q0(new zzs(str, y09, z, z2), gf4.m44716s1(f29518g.getPackageManager()))) {
                    return wj9.m53931b();
                }
                return new gj9(new gl8(z, str, y09), (yi9) null);
            } catch (RemoteException e) {
                return wj9.m53933d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            return wj9.m53933d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ro2, android.os.IBinder] */
    /* renamed from: g */
    public static wj9 m45110g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        wj9 wj9;
        zzq zzq;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            cu4.m43221k(f29518g);
            try {
                m45111h();
                zzo zzo = new zzo(str, z, false, gf4.m44716s1(f29518g), false);
                if (z4) {
                    zzq = f29516e.mo43095C0(zzo);
                } else {
                    zzq = f29516e.mo43096L0(zzo);
                }
                if (zzq.mo30736s1()) {
                    wj9 = wj9.m53934f(zzq.zzc());
                } else {
                    String r1 = zzq.mo30735r1();
                    if (zzq.mo30737t1() == 4) {
                        nameNotFoundException = new PackageManager.NameNotFoundException();
                    } else {
                        nameNotFoundException = null;
                    }
                    if (r1 == null) {
                        r1 = "error checking package certificate";
                    }
                    wj9 = wj9.m53935g(zzq.zzc(), zzq.mo30737t1(), r1, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e) {
                wj9 = wj9.m53933d("module init: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            wj9 = wj9.m53933d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return wj9;
    }

    /* renamed from: h */
    public static void m45111h() throws DynamiteModule.LoadingException {
        if (f29516e == null) {
            cu4.m43221k(f29518g);
            synchronized (f29517f) {
                if (f29516e == null) {
                    f29516e = p68.m49811q1(DynamiteModule.m33818d(f29518g, DynamiteModule.f22424f, "com.google.android.gms.googlecertificates").mo30743c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
