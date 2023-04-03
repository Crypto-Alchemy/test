package p000;

/* renamed from: wp8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class wp8 {

    /* renamed from: a */
    public final kr8 f35408a;

    public wp8(kr8 kr8) {
        this.f35408a = kr8;
    }

    /* renamed from: a */
    public final boolean mo49246a() {
        try {
            mk4 a = tn7.m52384a(this.f35408a.mo45271q());
            if (a == null) {
                this.f35408a.mo45237A().mo29678v().mo48769a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo45811e("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f35408a.mo45237A().mo29678v().mo48770b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
