package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;

/* renamed from: i68 */
public abstract class i68<T> {

    /* renamed from: h */
    public static final Object f29829h = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i */
    public static Context f29830i = null;

    /* renamed from: j */
    public static boolean f29831j = false;

    /* renamed from: k */
    public static volatile Boolean f29832k;

    /* renamed from: l */
    public static volatile Boolean f29833l;

    /* renamed from: a */
    public final n88 f29834a;

    /* renamed from: b */
    public final String f29835b;

    /* renamed from: c */
    public final String f29836c;

    /* renamed from: d */
    public final T f29837d;

    /* renamed from: e */
    public T f29838e;

    /* renamed from: f */
    public volatile l58 f29839f;

    /* renamed from: g */
    public volatile SharedPreferences f29840g;

    public i68(n88 n88, String str, T t) {
        this.f29838e = null;
        this.f29839f = null;
        this.f29840g = null;
        if (n88.f31995a == null && n88.f31996b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (n88.f31995a == null || n88.f31996b == null) {
            this.f29834a = n88;
            String valueOf = String.valueOf(n88.f31997c);
            String valueOf2 = String.valueOf(str);
            this.f29836c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(n88.f31998d);
            String valueOf4 = String.valueOf(str);
            this.f29835b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.f29837d = t;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public /* synthetic */ i68(n88 n88, String str, Object obj, i78 i78) {
        this(n88, str, obj);
    }

    /* renamed from: b */
    public static void m45484b(Context context) {
        if (f29830i == null) {
            synchronized (f29829h) {
                if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (f29830i != context) {
                    f29832k = null;
                }
                f29830i = context;
            }
            f29831j = false;
        }
    }

    /* renamed from: d */
    public static <V> V m45485d(h88<V> h88) {
        long clearCallingIdentity;
        try {
            return h88.mo41857d();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V d = h88.mo41857d();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return d;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: e */
    public static <T> i68<T> m45486e(n88 n88, String str, T t, k88<T> k88) {
        return new c88(n88, str, t, k88);
    }

    /* renamed from: f */
    public static i68<String> m45487f(n88 n88, String str, String str2) {
        return new s78(n88, str, str2);
    }

    /* renamed from: g */
    public static i68<Boolean> m45488g(n88 n88, String str, boolean z) {
        return new r78(n88, str, Boolean.valueOf(z));
    }

    /* renamed from: h */
    public static boolean m45489h(String str, boolean z) {
        if (m45494p()) {
            return ((Boolean) m45485d(new d78(str, false))).booleanValue();
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m45494p() {
        if (f29832k == null) {
            Context context = f29830i;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (kn4.m20928a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            f29832k = Boolean.valueOf(z);
        }
        return f29832k.booleanValue();
    }

    /* renamed from: a */
    public final T mo43502a() {
        if (f29830i != null) {
            if (this.f29834a.f32000f) {
                T o = mo43504o();
                if (o != null) {
                    return o;
                }
                T n = mo43503n();
                if (n != null) {
                    return n;
                }
            } else {
                T n2 = mo43503n();
                if (n2 != null) {
                    return n2;
                }
                T o2 = mo43504o();
                if (o2 != null) {
                    return o2;
                }
            }
            return this.f29837d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* renamed from: c */
    public abstract T mo29887c(SharedPreferences sharedPreferences);

    /* renamed from: j */
    public abstract T mo29888j(String str);

    @TargetApi(24)
    /* renamed from: n */
    public final T mo43503n() {
        boolean z;
        if (m45489h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f29835b);
            if (valueOf.length() != 0) {
                "Bypass reading Phenotype values for flag: ".concat(valueOf);
            }
        } else if (this.f29834a.f31996b != null) {
            if (this.f29839f == null) {
                this.f29839f = l58.m47627a(f29830i.getContentResolver(), this.f29834a.f31996b);
            }
            String str = (String) m45485d(new q68(this, this.f29839f));
            if (str != null) {
                return mo29888j(str);
            }
        } else if (this.f29834a.f31995a != null) {
            if (Build.VERSION.SDK_INT < 24 || f29830i.isDeviceProtectedStorage()) {
                z = true;
            } else {
                if (f29833l == null || !f29833l.booleanValue()) {
                    f29833l = Boolean.valueOf(((UserManager) f29830i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z = f29833l.booleanValue();
            }
            if (!z) {
                return null;
            }
            if (this.f29840g == null) {
                this.f29840g = f29830i.getSharedPreferences(this.f29834a.f31995a, 0);
            }
            SharedPreferences sharedPreferences = this.f29840g;
            if (sharedPreferences.contains(this.f29835b)) {
                return mo29887c(sharedPreferences);
            }
        }
        return null;
    }

    /* renamed from: o */
    public final T mo43504o() {
        String str;
        if (this.f29834a.f31999e || !m45494p() || (str = (String) m45485d(new x68(this))) == null) {
            return null;
        }
        return mo29888j(str);
    }

    /* renamed from: q */
    public final /* synthetic */ String mo43505q() {
        return gk9.m44743c(f29830i.getContentResolver(), this.f29836c, (String) null);
    }
}
