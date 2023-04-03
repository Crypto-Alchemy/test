package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4469b;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;

/* renamed from: cs7 */
public final class cs7 extends hx7 {

    /* renamed from: a */
    public final pq7 f27915a = new pq7("AssetPackExtractionService");

    /* renamed from: b */
    public final Context f27916b;

    /* renamed from: c */
    public final C4469b f27917c;

    public cs7(Context context, C4469b bVar) {
        this.f27916b = context;
        this.f27917c = bVar;
    }

    /* renamed from: a0 */
    public final void mo41647a0(nx7 nx7) throws RemoteException {
        this.f27915a.mo46852a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!ts7.m52429a(this.f27916b) || !ts7.m52430b(this.f27916b)) {
            nx7.mo45548a1(new Bundle());
            return;
        }
        this.f27917c.mo34163K();
        nx7.mo45547U0(new Bundle());
    }

    /* renamed from: a1 */
    public final synchronized void mo41648a1(Bundle bundle) {
        ComponentName componentName;
        Intent intent = new Intent(this.f27916b, ExtractionForegroundService.class);
        int i = bundle.getInt("action_type");
        intent.putExtra("action_type", i);
        if (i == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentName = Build.VERSION.SDK_INT >= 26 ? this.f27916b.startForegroundService(intent) : this.f27916b.startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            this.f27915a.mo46854c(e, "Failed starting installation service.", new Object[0]);
            componentName = null;
        }
        if (componentName == null) {
            this.f27915a.mo46853b("Failed starting installation service.", new Object[0]);
        }
    }

    /* renamed from: r0 */
    public final void mo41649r0(Bundle bundle, nx7 nx7) throws RemoteException {
        this.f27915a.mo46852a("updateServiceState AIDL call", new Object[0]);
        if (!ts7.m52429a(this.f27916b) || !ts7.m52430b(this.f27916b)) {
            nx7.mo45548a1(new Bundle());
            return;
        }
        mo41648a1(bundle);
        nx7.mo45546R0(new Bundle(), new Bundle());
    }
}
