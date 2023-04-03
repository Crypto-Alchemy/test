package p000;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;

/* renamed from: jk3 */
/* compiled from: LogFileManager */
public class jk3 {

    /* renamed from: d */
    public static final C6104c f30510d = new C6104c();

    /* renamed from: a */
    public final Context f30511a;

    /* renamed from: b */
    public final C6103b f30512b;

    /* renamed from: c */
    public u02 f30513c;

    /* renamed from: jk3$b */
    /* compiled from: LogFileManager */
    public interface C6103b {
        /* renamed from: a */
        File mo44482a();
    }

    /* renamed from: jk3$c */
    /* compiled from: LogFileManager */
    public static final class C6104c implements u02 {
        public C6104c() {
        }

        /* renamed from: a */
        public void mo44483a() {
        }

        /* renamed from: b */
        public String mo44484b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo44485c() {
            return null;
        }

        /* renamed from: d */
        public void mo44486d() {
        }

        /* renamed from: e */
        public void mo44487e(long j, String str) {
        }
    }

    public jk3(Context context, C6103b bVar) {
        this(context, bVar, (String) null);
    }

    /* renamed from: a */
    public void mo44475a() {
        this.f30513c.mo44486d();
    }

    /* renamed from: b */
    public byte[] mo44476b() {
        return this.f30513c.mo44485c();
    }

    /* renamed from: c */
    public String mo44477c() {
        return this.f30513c.mo44484b();
    }

    /* renamed from: d */
    public final File mo44478d(String str) {
        return new File(this.f30512b.mo44482a(), "crashlytics-userlog-" + str + ".temp");
    }

    /* renamed from: e */
    public final void mo44479e(String str) {
        this.f30513c.mo44483a();
        this.f30513c = f30510d;
        if (str != null) {
            if (!CommonUtils.m38408k(this.f30511a, "com.crashlytics.CollectCustomLogs", true)) {
                rk3.m51112f().mo47423b("Preferences requested no custom logs. Aborting log file creation.");
            } else {
                mo44480f(mo44478d(str), 65536);
            }
        }
    }

    /* renamed from: f */
    public void mo44480f(File file, int i) {
        this.f30513c = new p05(file, i);
    }

    /* renamed from: g */
    public void mo44481g(long j, String str) {
        this.f30513c.mo44487e(j, str);
    }

    public jk3(Context context, C6103b bVar, String str) {
        this.f30511a = context;
        this.f30512b = bVar;
        this.f30513c = f30510d;
        mo44479e(str);
    }
}
