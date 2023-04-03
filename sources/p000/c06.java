package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: c06 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class c06 {

    /* renamed from: b */
    public static final sm0<?> f21533b = sm0.m51835c(c06.class).mo47823b(ic1.m45605j(bw3.class)).mo47823b(ic1.m45605j(Context.class)).mo47827f(li9.f31327a).mo47825d();

    /* renamed from: a */
    public final Context f21534a;

    public c06(Context context) {
        this.f21534a = context;
    }

    /* renamed from: a */
    public synchronized String mo29831a() {
        String string = mo29832b().getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        mo29832b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    /* renamed from: b */
    public final SharedPreferences mo29832b() {
        return this.f21534a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
