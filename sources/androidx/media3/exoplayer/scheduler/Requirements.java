package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C0952a();

    /* renamed from: a */
    public final int f5157a;

    /* renamed from: androidx.media3.exoplayer.scheduler.Requirements$a */
    public class C0952a implements Parcelable.Creator<Requirements> {
        /* renamed from: a */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        /* renamed from: b */
        public Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.f5157a = (i & 2) != 0 ? i | 1 : i;
    }

    /* renamed from: g */
    public static boolean m6961g(ConnectivityManager connectivityManager) {
        if (w67.f19021a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final int mo7540a(Context context) {
        if (!mo7548h()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C2725kr.m20985e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || !m6961g(connectivityManager)) {
            return this.f5157a & 3;
        }
        if (!mo7552k() || !connectivityManager.isActiveNetworkMetered()) {
            return 0;
        }
        return 2;
    }

    /* renamed from: b */
    public int mo7541b(Context context) {
        int a = mo7540a(context);
        if (mo7542c() && !mo7543d(context)) {
            a |= 8;
        }
        if (mo7547f() && !mo7545e(context)) {
            a |= 4;
        }
        if (!mo7551j() || mo7550i(context)) {
            return a;
        }
        return a | 16;
    }

    /* renamed from: c */
    public boolean mo7542c() {
        if ((this.f5157a & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo7543d(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo7545e(Context context) {
        PowerManager powerManager = (PowerManager) C2725kr.m20985e(context.getSystemService("power"));
        int i = w67.f19021a;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Requirements.class != obj.getClass()) {
            return false;
        }
        if (this.f5157a == ((Requirements) obj).f5157a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo7547f() {
        if ((this.f5157a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo7548h() {
        if ((this.f5157a & 1) != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5157a;
    }

    /* renamed from: i */
    public final boolean mo7550i(Context context) {
        if (context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo7551j() {
        if ((this.f5157a & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo7552k() {
        if ((this.f5157a & 2) != 0) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5157a);
    }
}
