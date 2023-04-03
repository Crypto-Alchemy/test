package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.firebase.messaging.C4813g;
import java.util.concurrent.Executor;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: mz1 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class mz1 {

    /* renamed from: c */
    public static final Object f31907c = new Object();

    /* renamed from: d */
    public static C4813g f31908d;

    /* renamed from: a */
    public final Context f31909a;

    /* renamed from: b */
    public final Executor f31910b = fz1.f29033a;

    public mz1(Context context) {
        this.f31909a = context;
    }

    /* renamed from: a */
    public static tl6<Integer> m48550a(Context context, Intent intent) {
        return m48551b(context, "com.google.firebase.MESSAGING_EVENT").mo36286c(intent).mo48138i(iz1.f30168a, jz1.f30668a);
    }

    /* renamed from: b */
    public static C4813g m48551b(Context context, String str) {
        C4813g gVar;
        synchronized (f31907c) {
            if (f31908d == null) {
                f31908d = new C4813g(context, "com.google.firebase.MESSAGING_EVENT");
            }
            gVar = f31908d;
        }
        return gVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ Integer m48552c(tl6 tl6) throws Exception {
        return -1;
    }

    /* renamed from: e */
    public static final /* synthetic */ Integer m48554e(tl6 tl6) throws Exception {
        return 403;
    }

    /* renamed from: f */
    public static final /* synthetic */ tl6 m48555f(Context context, Intent intent, tl6 tl6) throws Exception {
        if (!xp4.m54483h() || ((Integer) tl6.mo48141l()).intValue() != 402) {
            return tl6;
        }
        return m48550a(context, intent).mo48138i(kz1.f31128a, lz1.f31462a);
    }

    /* renamed from: g */
    public tl6<Integer> mo45933g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo45934h(this.f31909a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: h */
    public tl6<Integer> mo45934h(Context context, Intent intent) {
        boolean z = false;
        if (xp4.m54483h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY;
        if (!z || flags != 0) {
            return jm6.m46617c(this.f31910b, new gz1(context, intent)).mo48139j(this.f31910b, new hz1(context, intent));
        }
        return m48550a(context, intent);
    }
}
