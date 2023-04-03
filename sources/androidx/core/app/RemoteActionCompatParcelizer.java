package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(d97 d97) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3396a = (IconCompat) d97.mo18630v(remoteActionCompat.f3396a, 1);
        remoteActionCompat.f3397b = d97.mo18620l(remoteActionCompat.f3397b, 2);
        remoteActionCompat.f3398c = d97.mo18620l(remoteActionCompat.f3398c, 3);
        remoteActionCompat.f3399d = (PendingIntent) d97.mo18626r(remoteActionCompat.f3399d, 4);
        remoteActionCompat.f3400e = d97.mo18616h(remoteActionCompat.f3400e, 5);
        remoteActionCompat.f3401f = d97.mo18616h(remoteActionCompat.f3401f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, d97 d97) {
        d97.mo18632x(false, false);
        d97.mo18607M(remoteActionCompat.f3396a, 1);
        d97.mo18598D(remoteActionCompat.f3397b, 2);
        d97.mo18598D(remoteActionCompat.f3398c, 3);
        d97.mo18602H(remoteActionCompat.f3399d, 4);
        d97.mo18634z(remoteActionCompat.f3400e, 5);
        d97.mo18634z(remoteActionCompat.f3401f, 6);
    }
}
