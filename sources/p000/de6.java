package p000;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Lde6;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "a", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: de6 */
/* compiled from: SupportSQLiteCompat.kt */
public final class de6 {

    /* renamed from: a */
    public static final de6 f10680a = new de6();

    /* renamed from: a */
    public static final File m15039a(Context context) {
        vx2.m53591g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        vx2.m53590f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
