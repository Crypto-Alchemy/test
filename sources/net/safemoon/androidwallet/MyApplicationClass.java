package net.safemoon.androidwallet;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.webkit.WebView;
import androidx.appcompat.app.C0149b;
import com.onesignal.OneSignal;
import com.yariksoffice.lingver.Lingver;
import java.util.ArrayList;
import java.util.HashMap;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.repository.FcmDataSource;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.utils.PreFetchData;

public class MyApplicationClass extends Application {

    /* renamed from: H */
    public static MyApplicationClass f41181H;

    /* renamed from: A */
    public String f41182A = "";

    /* renamed from: B */
    public String f41183B = "";

    /* renamed from: C */
    public boolean f41184C = false;

    /* renamed from: a */
    public NotificationManager f41185a;

    /* renamed from: d */
    public boolean f41186d = false;

    /* renamed from: e */
    public boolean f41187e = true;

    /* renamed from: g */
    public boolean f41188g = true;

    /* renamed from: k */
    public boolean f41189k = false;

    /* renamed from: r */
    public ArrayList<Coin> f41190r = new ArrayList<>();

    /* renamed from: s */
    public HashMap<String, Boolean> f41191s = new HashMap<>();

    /* renamed from: x */
    public ow7 f41192x;

    /* renamed from: y */
    public boolean f41193y = false;

    static {
        System.loadLibrary("TrustWalletCore");
    }

    public MyApplicationClass() {
        f41181H = this;
    }

    /* renamed from: c */
    public static MyApplicationClass m64669c() {
        return f41181H;
    }

    /* renamed from: a */
    public void mo56490a() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("net.safemoon.androidwallet", "ANDROID CHANNEL", 4);
            notificationChannel.setDescription("Safemoon");
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setLightColor(-16711936);
            notificationChannel.setLockscreenVisibility(1);
            mo56492d().createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: b */
    public final void mo56491b() {
        v72.f45229a.mo66425a(getApplicationContext()).mo57370a();
    }

    /* renamed from: d */
    public final NotificationManager mo56492d() {
        if (this.f41185a == null) {
            this.f41185a = (NotificationManager) getSystemService("notification");
        }
        return this.f41185a;
    }

    /* renamed from: e */
    public final void mo56493e() {
        OneSignal.m40318E1(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.m40338L0(this);
    }

    public void onCreate() {
        super.onCreate();
        Common.f42577a.mo60898d(this);
        C9384u3.m72578s(this);
        PreFetchData.f42593a.mo60933b(this);
        new FcmDataSource(this).mo60728h();
        registerActivityLifecycleCallbacks(new m85());
        int i = getApplicationContext().getResources().getConfiguration().uiMode & 48;
        int i2 = 1;
        if (!(i == 0 || i == 16 || i != 32)) {
            i2 = 2;
        }
        C0149b.m869G(f06.m57515f(getApplicationContext(), "MODE_NIGHT", i2));
        mo56490a();
        mo56493e();
        mo56491b();
        new WebView(this).destroy();
        Lingver.m43063g(this, g06.f37938a.mo51832a(getApplicationContext()));
        ow7 ow7 = new ow7();
        this.f41192x = ow7;
        C2127d2.m14654s(ow7, C9198q.f44134e, "12312");
    }
}
