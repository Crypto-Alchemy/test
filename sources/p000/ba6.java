package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: ba6 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ba6 {

    /* renamed from: c */
    public static final Lock f21207c = new ReentrantLock();

    /* renamed from: d */
    public static ba6 f21208d;

    /* renamed from: a */
    public final Lock f21209a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f21210b;

    public ba6(Context context) {
        this.f21210b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static ba6 m32444a(Context context) {
        cu4.m43221k(context);
        Lock lock = f21207c;
        lock.lock();
        try {
            if (f21208d == null) {
                f21208d = new ba6(context.getApplicationContext());
            }
            ba6 ba6 = f21208d;
            lock.unlock();
            return ba6;
        } catch (Throwable th) {
            f21207c.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static final String m32445d(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: b */
    public GoogleSignInAccount mo29511b() {
        String c;
        String c2 = mo29512c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2) || (c = mo29512c(m32445d("googleSignInAccount", c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m33505B1(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String mo29512c(String str) {
        this.f21209a.lock();
        try {
            return this.f21210b.getString(str, (String) null);
        } finally {
            this.f21209a.unlock();
        }
    }
}
