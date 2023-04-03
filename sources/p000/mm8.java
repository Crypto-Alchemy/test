package p000;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* renamed from: mm8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class mm8 extends vt8 {

    /* renamed from: c */
    public static final AtomicReference<String[]> f31738c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<String[]> f31739d = new AtomicReference<>();

    /* renamed from: e */
    public static final AtomicReference<String[]> f31740e = new AtomicReference<>();

    public mm8(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: t */
    public static final String m48374t(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        boolean z;
        String str2;
        cu4.m43221k(strArr);
        cu4.m43221k(strArr2);
        cu4.m43221k(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43211a(z);
        for (int i = 0; i < strArr.length; i++) {
            if (g69.m44578G(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: f */
    public final boolean mo29669f() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo45820l() {
        this.f34342a.mo45257b();
        if (!this.f34342a.mo45247K() || !Log.isLoggable(this.f34342a.mo45237A().mo29680y(), 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final String mo45821m(String str) {
        if (str == null) {
            return null;
        }
        if (!mo45820l()) {
            return str;
        }
        return m48374t(str, cu8.f27955c, cu8.f27953a, f31738c);
    }

    /* renamed from: n */
    public final String mo45822n(String str) {
        if (str == null) {
            return null;
        }
        if (!mo45820l()) {
            return str;
        }
        return m48374t(str, eu8.f28683b, eu8.f28682a, f31739d);
    }

    /* renamed from: o */
    public final String mo45823o(String str) {
        if (str == null) {
            return null;
        }
        if (!mo45820l()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m48374t(str, fu8.f28993b, fu8.f28992a, f31740e);
        }
        return "experiment_id(" + str + ")";
    }

    /* renamed from: p */
    public final String mo45824p(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!mo45820l()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo45822n(next));
            sb.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = mo45825r(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo45825r((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo45825r(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: r */
    public final String mo45825r(Object[] objArr) {
        String str;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo45824p(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
