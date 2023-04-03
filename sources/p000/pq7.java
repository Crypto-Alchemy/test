package p000;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: pq7 */
public final class pq7 {

    /* renamed from: a */
    public final String f32785a;

    public pq7(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f32785a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: g */
    public static String m50073g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    "Unable to format ".concat(valueOf);
                }
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo46852a(String str, Object... objArr) {
        mo46857f(3, str, objArr);
    }

    /* renamed from: b */
    public final void mo46853b(String str, Object... objArr) {
        mo46857f(6, str, objArr);
    }

    /* renamed from: c */
    public final void mo46854c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            m50073g(this.f32785a, str, objArr);
        }
    }

    /* renamed from: d */
    public final void mo46855d(String str, Object... objArr) {
        mo46857f(4, str, objArr);
    }

    /* renamed from: e */
    public final void mo46856e(String str, Object... objArr) {
        mo46857f(5, str, objArr);
    }

    /* renamed from: f */
    public final int mo46857f(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m50073g(this.f32785a, str, objArr));
        }
        return 0;
    }
}
