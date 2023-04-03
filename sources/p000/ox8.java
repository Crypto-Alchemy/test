package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ox8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ox8 implements yv8 {

    /* renamed from: b */
    public static final Map<String, ox8> f32497b = new C2781lq();

    /* renamed from: a */
    public final SharedPreferences f32498a;

    /* renamed from: b */
    public static ox8 m49606b(Context context, String str) {
        ox8 ox8;
        if (!mu8.m48504a()) {
            synchronized (ox8.class) {
                ox8 = f32497b.get((Object) null);
                if (ox8 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return ox8;
        }
        throw null;
    }

    /* renamed from: c */
    public static synchronized void m49607c() {
        synchronized (ox8.class) {
            Map<String, ox8> map = f32497b;
            Iterator<ox8> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().f32498a;
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final Object mo43014a(String str) {
        throw null;
    }
}
