package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.C4663a;
import java.io.IOException;

/* renamed from: b06 */
/* compiled from: SharedPrefKeysetWriter */
public final class b06 implements ub3 {

    /* renamed from: a */
    public final SharedPreferences.Editor f21102a;

    /* renamed from: b */
    public final String f21103b;

    public b06(Context context, String str, String str2) {
        if (str != null) {
            this.f21103b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f21102a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                this.f21102a = applicationContext.getSharedPreferences(str2, 0).edit();
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    /* renamed from: a */
    public void mo29407a(C4663a aVar) throws IOException {
        if (!this.f21102a.putString(this.f21103b, yl2.m54811b(aVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* renamed from: b */
    public void mo29408b(tp1 tp1) throws IOException {
        if (!this.f21102a.putString(this.f21103b, yl2.m54811b(tp1.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
