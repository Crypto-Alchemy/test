package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.b */
/* compiled from: ProfileInstaller */
public class C1214b {

    /* renamed from: a */
    public static final C1217c f6299a = new C1215a();

    /* renamed from: b */
    public static final C1217c f6300b = new C1216b();

    /* renamed from: androidx.profileinstaller.b$a */
    /* compiled from: ProfileInstaller */
    public class C1215a implements C1217c {
        /* renamed from: a */
        public void mo8808a(int i, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.b$b */
    /* compiled from: ProfileInstaller */
    public class C1216b implements C1217c {
        /* renamed from: a */
        public void mo8808a(int i, Object obj) {
            switch (i) {
            }
            if (i == 6 || i == 7 || i == 8) {
                Throwable th = (Throwable) obj;
            }
        }
    }

    /* renamed from: androidx.profileinstaller.b$c */
    /* compiled from: ProfileInstaller */
    public interface C1217c {
        /* renamed from: a */
        void mo8808a(int i, Object obj);
    }

    /* renamed from: b */
    public static boolean m8637b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: c */
    public static void m8638c(Context context, Executor executor, C1217c cVar) {
        m8637b(context.getFilesDir());
        m8642g(executor, cVar, 11, (Object) null);
    }

    /* renamed from: d */
    public static boolean m8639d(PackageInfo packageInfo, File file, C1217c cVar) {
        DataInputStream dataInputStream;
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z = true;
            }
            if (z) {
                cVar.mo8808a(2, (Object) null);
            }
            return z;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public static void m8641f(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: g */
    public static void m8642g(Executor executor, C1217c cVar, int i, Object obj) {
        executor.execute(new fw4(cVar, i, obj));
    }

    /* renamed from: h */
    public static void m8643h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, C1217c cVar) {
        C1213a aVar = new C1213a(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (aVar.mo8813d() && aVar.mo8814f().mo8816i().mo8817j()) {
            m8641f(packageInfo, file);
        }
    }

    /* renamed from: i */
    public static void m8644i(Context context) {
        m8645j(context, new ew4(), f6299a);
    }

    /* renamed from: j */
    public static void m8645j(Context context, Executor executor, C1217c cVar) {
        m8646k(context, executor, cVar, false);
    }

    /* renamed from: k */
    public static void m8646k(Context context, Executor executor, C1217c cVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z || !m8639d(packageInfo, filesDir, cVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Installing profile for ");
                sb.append(context.getPackageName());
                m8643h(assets, packageName, packageInfo, filesDir, name, executor, cVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping profile installation for ");
            sb2.append(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            cVar.mo8808a(7, e);
        }
    }

    /* renamed from: l */
    public static void m8647l(Context context, Executor executor, C1217c cVar) {
        try {
            m8641f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m8642g(executor, cVar, 10, (Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            m8642g(executor, cVar, 7, e);
        }
    }
}
