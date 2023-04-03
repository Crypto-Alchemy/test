package p000;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: bn8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class bn8 extends vt8 {

    /* renamed from: c */
    public char f21425c = 0;

    /* renamed from: d */
    public long f21426d = -1;

    /* renamed from: e */
    public String f21427e;

    /* renamed from: f */
    public final vm8 f21428f = new vm8(this, 6, false, false);

    /* renamed from: g */
    public final vm8 f21429g = new vm8(this, 6, true, false);

    /* renamed from: h */
    public final vm8 f21430h = new vm8(this, 6, false, true);

    /* renamed from: i */
    public final vm8 f21431i = new vm8(this, 5, false, false);

    /* renamed from: j */
    public final vm8 f21432j = new vm8(this, 5, true, false);

    /* renamed from: k */
    public final vm8 f21433k = new vm8(this, 5, false, true);

    /* renamed from: l */
    public final vm8 f21434l = new vm8(this, 4, false, false);

    /* renamed from: m */
    public final vm8 f21435m = new vm8(this, 3, false, false);

    /* renamed from: n */
    public final vm8 f21436n = new vm8(this, 2, false, false);

    public bn8(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: B */
    public static String m32658B(boolean z, Object obj) {
        String str;
        String className;
        String str2 = "";
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str2.length() + 43 + str2.length());
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String G = m32663G(kr8.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m32663G(className).equals(G)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof ym8) {
                return ((ym8) obj).f35903a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: G */
    public static String m32663G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: w */
    public static Object m32664w(String str) {
        if (str == null) {
            return null;
        }
        return new ym8(str);
    }

    /* renamed from: z */
    public static String m32665z(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String B = m32658B(z, obj);
        String B2 = m32658B(z, obj2);
        String B3 = m32658B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final boolean mo29669f() {
        return false;
    }

    /* renamed from: l */
    public final vm8 mo29670l() {
        return this.f21428f;
    }

    /* renamed from: m */
    public final vm8 mo29671m() {
        return this.f21429g;
    }

    /* renamed from: n */
    public final vm8 mo29672n() {
        return this.f21430h;
    }

    /* renamed from: o */
    public final vm8 mo29673o() {
        return this.f21431i;
    }

    /* renamed from: p */
    public final vm8 mo29674p() {
        return this.f21432j;
    }

    /* renamed from: r */
    public final vm8 mo29675r() {
        return this.f21433k;
    }

    /* renamed from: t */
    public final vm8 mo29676t() {
        return this.f21434l;
    }

    /* renamed from: u */
    public final vm8 mo29677u() {
        return this.f21435m;
    }

    /* renamed from: v */
    public final vm8 mo29678v() {
        return this.f21436n;
    }

    /* renamed from: x */
    public final void mo29679x(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo29680y(), i)) {
            Log.println(i, mo29680y(), m32665z(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            cu4.m43221k(str);
            cr8 E = this.f34342a.mo45241E();
            if (E == null) {
                Log.println(6, mo29680y(), "Scheduler not set. Not logging error/warn");
            } else if (!E.mo48800h()) {
                Log.println(6, mo29680y(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                E.mo41640o(new sm8(this, i, str, obj, obj2, obj3));
            }
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: y */
    public final String mo29680y() {
        String str;
        synchronized (this) {
            if (this.f21427e == null) {
                if (this.f34342a.mo45250N() != null) {
                    this.f21427e = this.f34342a.mo45250N();
                } else {
                    this.f21427e = this.f34342a.mo45274y().mo45986i();
                }
            }
            cu4.m43221k(this.f21427e);
            str = this.f21427e;
        }
        return str;
    }
}
