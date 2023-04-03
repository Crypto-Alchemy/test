package p000;

import android.content.Context;
import java.io.File;

/* renamed from: z02 */
/* compiled from: FileStoreImpl */
public class z02 implements y02 {

    /* renamed from: a */
    public final Context f35975a;

    public z02(Context context) {
        this.f35975a = context;
    }

    /* renamed from: a */
    public File mo49576a() {
        return mo49767c(new File(this.f35975a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }

    /* renamed from: b */
    public String mo49577b() {
        return new File(this.f35975a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    /* renamed from: c */
    public File mo49767c(File file) {
        if (file == null) {
            rk3.m51112f().mo47431k("Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            rk3.m51112f().mo47431k("Couldn't create file");
            return null;
        }
    }
}
