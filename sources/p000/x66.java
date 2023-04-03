package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

/* renamed from: x66 */
public abstract class x66 {
    /* renamed from: e */
    public static x66 m54235e(Bundle bundle) {
        return new hq7(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    /* renamed from: a */
    public abstract List<String> mo43350a();

    /* renamed from: b */
    public abstract List<String> mo43351b();

    /* renamed from: c */
    public abstract long mo43352c();

    /* renamed from: d */
    public abstract List<Intent> mo43353d();

    /* renamed from: f */
    public abstract int mo43355f();

    @Deprecated
    /* renamed from: g */
    public abstract PendingIntent mo43356g();

    /* renamed from: h */
    public abstract int mo43357h();

    /* renamed from: i */
    public abstract int mo43359i();

    /* renamed from: j */
    public abstract long mo43360j();
}
