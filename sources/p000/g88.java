package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: g88 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class g88 extends vt8 {

    /* renamed from: c */
    public long f29110c;

    /* renamed from: d */
    public String f29111d;

    /* renamed from: e */
    public AccountManager f29112e;

    /* renamed from: f */
    public Boolean f29113f;

    /* renamed from: g */
    public long f29114g;

    public g88(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: f */
    public final boolean mo29669f() {
        Calendar instance = Calendar.getInstance();
        this.f29110c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f29111d = sb.toString();
        return false;
    }

    /* renamed from: l */
    public final long mo42850l() {
        mo48801i();
        return this.f29110c;
    }

    /* renamed from: m */
    public final String mo42851m() {
        mo48801i();
        return this.f29111d;
    }

    /* renamed from: n */
    public final long mo42852n() {
        mo29006e();
        return this.f29114g;
    }

    /* renamed from: o */
    public final void mo42853o() {
        mo29006e();
        this.f29113f = null;
        this.f29114g = 0;
    }

    /* renamed from: p */
    public final boolean mo42854p() {
        mo29006e();
        long a = this.f34342a.mo45256a().mo29580a();
        if (a - this.f29114g > 86400000) {
            this.f29113f = null;
        }
        Boolean bool = this.f29113f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (zr0.m31438a(this.f34342a.mo45271q(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f34342a.mo45237A().mo29674p().mo48769a("Permission error checking for dasher/unicorn accounts");
            this.f29114g = a;
            this.f29113f = Boolean.FALSE;
            return false;
        }
        if (this.f29112e == null) {
            this.f29112e = AccountManager.get(this.f34342a.mo45271q());
        }
        try {
            Account[] result = this.f29112e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f29112e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f29113f = Boolean.TRUE;
                    this.f29114g = a;
                    return true;
                }
                this.f29114g = a;
                this.f29113f = Boolean.FALSE;
                return false;
            }
            this.f29113f = Boolean.TRUE;
            this.f29114g = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f34342a.mo45237A().mo29671m().mo48770b("Exception checking account types", e);
        }
    }
}
