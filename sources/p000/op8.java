package p000;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: op8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class op8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zc8 f32420a;

    /* renamed from: d */
    public final /* synthetic */ ServiceConnection f32421d;

    /* renamed from: e */
    public final /* synthetic */ tp8 f32422e;

    public op8(tp8 tp8, zc8 zc8, ServiceConnection serviceConnection) {
        this.f32422e = tp8;
        this.f32420a = zc8;
        this.f32421d = serviceConnection;
    }

    public final void run() {
        String str;
        tp8 tp8 = this.f32422e;
        wp8 wp8 = tp8.f34312d;
        String a = tp8.f34311a;
        zc8 zc8 = this.f32420a;
        ServiceConnection serviceConnection = this.f32421d;
        wp8.f35408a.mo45272s().mo29006e();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", a);
        Bundle bundle2 = null;
        try {
            Bundle y0 = zc8.mo47736y0(bundle);
            if (y0 == null) {
                wp8.f35408a.mo45237A().mo29670l().mo48769a("Install Referrer Service returned a null response");
            } else {
                bundle2 = y0;
            }
        } catch (Exception e) {
            wp8.f35408a.mo45237A().mo29670l().mo48770b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        wp8.f35408a.mo45272s().mo29006e();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                wp8.f35408a.mo45237A().mo29673o().mo48769a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    wp8.f35408a.mo45237A().mo29670l().mo48769a("No referrer defined in Install Referrer response");
                } else {
                    wp8.f35408a.mo45237A().mo29678v().mo48770b("InstallReferrer API result", string);
                    g69 G = wp8.f35408a.mo45243G();
                    if (string.length() != 0) {
                        str = "?".concat(string);
                    } else {
                        str = new String("?");
                    }
                    Bundle k0 = G.mo42814k0(Uri.parse(str));
                    if (k0 == null) {
                        wp8.f35408a.mo45237A().mo29670l().mo48769a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = k0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                wp8.f35408a.mo45237A().mo29670l().mo48769a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                k0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == wp8.f35408a.mo45275z().f31357f.mo43882a()) {
                            wp8.f35408a.mo45237A().mo29678v().mo48769a("Install Referrer campaign has already been logged");
                        } else if (wp8.f35408a.mo45262h()) {
                            wp8.f35408a.mo45275z().f31357f.mo43883b(j);
                            wp8.f35408a.mo45237A().mo29678v().mo48770b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            k0.putString("_cis", "referrer API");
                            wp8.f35408a.mo45242F().mo47916X("auto", "_cmp", k0);
                        }
                    }
                }
            }
        }
        rp0.m51209b().mo47467c(wp8.f35408a.mo45271q(), serviceConnection);
    }
}
