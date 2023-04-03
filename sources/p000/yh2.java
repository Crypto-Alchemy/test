package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.ErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zabx;
import com.google.errorprone.annotations.RestrictedInheritance;
import p000.f94;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {f18.class, q18.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: yh2 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class yh2 extends zh2 {

    /* renamed from: d */
    public static final int f35884d = zh2.f36159a;

    /* renamed from: e */
    public static final Object f35885e = new Object();

    /* renamed from: f */
    public static final yh2 f35886f = new yh2();

    /* renamed from: c */
    public String f35887c;

    /* renamed from: p */
    public static yh2 m54754p() {
        return f35886f;
    }

    /* renamed from: d */
    public Intent mo49666d(Context context, int i, String str) {
        return super.mo49666d(context, i, str);
    }

    /* renamed from: e */
    public PendingIntent mo49667e(Context context, int i, int i2) {
        return super.mo49667e(context, i, i2);
    }

    /* renamed from: g */
    public final String mo49668g(int i) {
        return super.mo49668g(i);
    }

    /* renamed from: i */
    public int mo49669i(Context context) {
        return super.mo49669i(context);
    }

    /* renamed from: j */
    public int mo49670j(Context context, int i) {
        return super.mo49670j(context, i);
    }

    /* renamed from: m */
    public final boolean mo49671m(int i) {
        return super.mo49671m(i);
    }

    /* renamed from: n */
    public Dialog mo49672n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo49676s(activity, i, a28.m31651b(activity, mo49666d(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: o */
    public PendingIntent mo49673o(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo30461u1()) {
            return connectionResult.mo30459t1();
        }
        return mo49667e(context, connectionResult.mo30457r1(), 0);
    }

    /* renamed from: q */
    public boolean mo49674q(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n = mo49672n(activity, i, i2, onCancelListener);
        if (n == null) {
            return false;
        }
        mo49679v(activity, n, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: r */
    public void mo49675r(Context context, int i) {
        mo49680w(context, i, (String) null, mo49852f(context, i, 0, "n"));
    }

    /* renamed from: s */
    public final Dialog mo49676s(Context context, int i, a28 a28, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(f08.m44125d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = f08.m44124c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, a28);
        }
        String g = f08.m44128g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)});
        new IllegalArgumentException();
        return builder.create();
    }

    /* renamed from: t */
    public final Dialog mo49677t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(f08.m44125d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo49679v(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: u */
    public final zabx mo49678u(Context context, a08 a08) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabx = new zabx(a08);
        c38.m32849m(context, zabx, intentFilter);
        zabx.mo30604a(context);
        if (mo49854l(context, "com.google.android.gms")) {
            return zabx;
        }
        a08.mo28688a();
        zabx.mo30605b();
        return null;
    }

    /* renamed from: v */
    public final void mo49679v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                wd6.m53861y(dialog, onCancelListener).mo22281x(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.m33576a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: w */
    public final void mo49680w(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null});
        new IllegalArgumentException();
        if (i == 18) {
            mo49681x(context);
        } else if (pendingIntent != null) {
            String f = f08.m44127f(context, i);
            String e = f08.m44126e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) cu4.m43221k(context.getSystemService("notification"));
            f94.C2277e C = new f94.C2277e(context).mo19809v(true).mo19794g(true).mo19800m(f).mo19784C(new f94.C2275c().mo19781h(e));
            if (le1.m47791c(context)) {
                cu4.m43225o(xp4.m54480e());
                C.mo19782A(context.getApplicationInfo().icon).mo19812y(2);
                if (le1.m47792d(context)) {
                    C.mo19789a(r25.common_full_open_on_phone, resources.getString(w45.common_open_on_phone), pendingIntent);
                } else {
                    C.mo19798k(pendingIntent);
                }
            } else {
                C.mo19782A(17301642).mo19785D(resources.getString(w45.common_google_play_services_notification_ticker)).mo19788G(System.currentTimeMillis()).mo19798k(pendingIntent).mo19799l(e);
            }
            if (xp4.m54483h()) {
                cu4.m43225o(xp4.m54483h());
                synchronized (f35885e) {
                    str2 = this.f35887c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a = notificationManager.getNotificationChannel(str2);
                    String b = f08.m44123b(context);
                    if (a == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b, 4));
                    } else if (!b.contentEquals(a.getName())) {
                        a.setName(b);
                        notificationManager.createNotificationChannel(a);
                    }
                }
                C.mo19795h(str2);
            }
            Notification b2 = C.mo19790b();
            if (i == 1 || i == 2 || i == 3) {
                mi2.f31712b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        }
    }

    /* renamed from: x */
    public final void mo49681x(Context context) {
        new c08(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: y */
    public final boolean mo49682y(Activity activity, qg3 qg3, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog s = mo49676s(activity, i, a28.m31652c(qg3, mo49666d(activity, i, "d"), 2), onCancelListener);
        if (s == null) {
            return false;
        }
        mo49679v(activity, s, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: z */
    public final boolean mo49683z(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent o;
        if (dw2.m43717a(context) || (o = mo49673o(context, connectionResult)) == null) {
            return false;
        }
        mo49680w(context, connectionResult.mo30457r1(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m33580a(context, o, i, true), g38.f29068a | 134217728));
        return true;
    }
}
