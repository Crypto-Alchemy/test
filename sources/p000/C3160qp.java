package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.facebook.soloader.C1968a;
import java.io.File;
import java.io.IOException;

/* renamed from: qp */
/* compiled from: ApplicationSoSource */
public class C3160qp extends s56 {

    /* renamed from: a */
    public Context f17000a;

    /* renamed from: b */
    public int f17001b;

    /* renamed from: c */
    public C1968a f17002c;

    public C3160qp(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f17000a = applicationContext;
        if (applicationContext == null) {
            this.f17000a = context;
        }
        this.f17001b = i;
        this.f17002c = new C1968a(new File(this.f17000a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: d */
    public static File m25821d(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: a */
    public int mo13505a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.f17002c.mo13505a(str, i, threadPolicy);
    }

    /* renamed from: b */
    public void mo21453b(int i) throws IOException {
        this.f17002c.mo21453b(i);
    }

    /* renamed from: c */
    public boolean mo25189c() throws IOException {
        File file = this.f17002c.f9783a;
        Context e = mo25190e();
        File d = m25821d(e);
        if (file.equals(d)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Native library directory updated from ");
        sb.append(file);
        sb.append(" to ");
        sb.append(d);
        int i = this.f17001b | 1;
        this.f17001b = i;
        C1968a aVar = new C1968a(d, i);
        this.f17002c = aVar;
        aVar.mo21453b(this.f17001b);
        this.f17000a = e;
        return true;
    }

    /* renamed from: e */
    public Context mo25190e() {
        try {
            Context context = this.f17000a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f17002c.toString();
    }
}
