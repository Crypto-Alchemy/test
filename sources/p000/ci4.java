package p000;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.OneSignal;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import p000.py0;

/* renamed from: ci4 */
/* compiled from: OneSignalChromeTab */
public class ci4 {

    /* renamed from: ci4$a */
    /* compiled from: OneSignalChromeTab */
    public static class C3946a extends ry0 {

        /* renamed from: d */
        public String f21789d;

        /* renamed from: e */
        public boolean f21790e;

        public C3946a(String str, boolean z) {
            this.f21789d = str;
            this.f21790e = z;
        }

        /* renamed from: a */
        public void mo25559a(ComponentName componentName, oy0 oy0) {
            oy0.mo24286e(0);
            sy0 c = oy0.mo24284c((ny0) null);
            if (c != null) {
                Uri parse = Uri.parse(this.f21789d);
                c.mo25997f(parse, (Bundle) null, (List<Bundle>) null);
                if (this.f21790e) {
                    py0 a = new py0.C3103a(c).mo24794a();
                    a.f16655a.setData(parse);
                    a.f16655a.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    OneSignal.f26030e.startActivity(a.f16655a, a.f16656b);
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static boolean m33053a() {
        Class<ry0> cls = ry0.class;
        return true;
    }

    /* renamed from: b */
    public static boolean m33054b(String str, boolean z) {
        if (!m33053a()) {
            return false;
        }
        return oy0.m24403a(OneSignal.f26030e, "com.android.chrome", new C3946a(str, z));
    }
}
