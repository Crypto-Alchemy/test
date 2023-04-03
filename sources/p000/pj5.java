package p000;

import android.content.Context;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010(\u001a\u00020\u0001¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020\u00018\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, mo44877d2 = {"Lpj5;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ltb1;", "", "enabled", "Lr37;", "setWriteAheadLoggingEnabled", "close", "Lj21;", "databaseConfiguration", "c", "writable", "d", "Ljava/io/File;", "destinationFile", "a", "databaseFile", "b", "Landroid/content/Context;", "Landroid/content/Context;", "context", "", "Ljava/lang/String;", "copyFromAssetPath", "e", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "g", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "", "k", "I", "databaseVersion", "r", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegate", "s", "Lj21;", "x", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILandroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pj5 */
/* compiled from: SQLiteCopyOpenHelper.kt */
public final class pj5 implements SupportSQLiteOpenHelper, tb1 {

    /* renamed from: a */
    public final Context f16508a;

    /* renamed from: d */
    public final String f16509d;

    /* renamed from: e */
    public final File f16510e;

    /* renamed from: g */
    public final Callable<InputStream> f16511g;

    /* renamed from: k */
    public final int f16512k;

    /* renamed from: r */
    public final SupportSQLiteOpenHelper f16513r;

    /* renamed from: s */
    public j21 f16514s;

    /* renamed from: x */
    public boolean f16515x;

    public pj5(Context context, String str, File file, Callable<InputStream> callable, int i, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        vx2.m53591g(context, "context");
        vx2.m53591g(supportSQLiteOpenHelper, "delegate");
        this.f16508a = context;
        this.f16509d = str;
        this.f16510e = file;
        this.f16511g = callable;
        this.f16512k = i;
        this.f16513r = supportSQLiteOpenHelper;
    }

    /* renamed from: a */
    public final void mo24616a(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f16509d != null) {
            readableByteChannel = Channels.newChannel(this.f16508a.getAssets().open(this.f16509d));
            vx2.m53590f(readableByteChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f16510e != null) {
            readableByteChannel = new FileInputStream(this.f16510e).getChannel();
            vx2.m53590f(readableByteChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f16511g;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel(callable.call());
                    vx2.m53590f(readableByteChannel, "newChannel(inputStream)");
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f16508a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        vx2.m53590f(channel, "output");
        e12.m15631a(readableByteChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            vx2.m53590f(createTempFile, "intermediateFile");
            mo24617b(createTempFile, z);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    /* renamed from: b */
    public final void mo24617b(File file, boolean z) {
        j21 j21 = this.f16514s;
        if (j21 == null) {
            vx2.m53605u("databaseConfiguration");
            j21 = null;
        }
        j21.getClass();
    }

    /* renamed from: c */
    public final void mo24618c(j21 j21) {
        vx2.m53591g(j21, "databaseConfiguration");
        this.f16514s = j21;
    }

    public synchronized void close() {
        getDelegate().close();
        this.f16515x = false;
    }

    /* renamed from: d */
    public final void mo24619d(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f16508a.getDatabasePath(databaseName);
            j21 j21 = this.f16514s;
            j21 j212 = null;
            if (j21 == null) {
                vx2.m53605u("databaseConfiguration");
                j21 = null;
            }
            boolean z2 = j21.f13497s;
            File filesDir = this.f16508a.getFilesDir();
            vx2.m53590f(filesDir, "context.filesDir");
            ov4 ov4 = new ov4(databaseName, filesDir, z2);
            try {
                ov4.m24065c(ov4, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    vx2.m53590f(databasePath, "databaseFile");
                    mo24616a(databasePath, z);
                    ov4.mo24121d();
                    return;
                }
                try {
                    vx2.m53590f(databasePath, "databaseFile");
                    int d = iz0.m19914d(databasePath);
                    if (d == this.f16512k) {
                        ov4.mo24121d();
                        return;
                    }
                    j21 j213 = this.f16514s;
                    if (j213 == null) {
                        vx2.m53605u("databaseConfiguration");
                    } else {
                        j212 = j213;
                    }
                    if (j212.mo21712a(d, this.f16512k)) {
                        ov4.mo24121d();
                        return;
                    }
                    if (this.f16508a.deleteDatabase(databaseName)) {
                        try {
                            mo24616a(databasePath, z);
                        } catch (IOException unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to delete database file (");
                        sb.append(databaseName);
                        sb.append(") for a copy destructive migration.");
                    }
                    ov4.mo24121d();
                } catch (IOException unused2) {
                    ov4.mo24121d();
                }
            } catch (IOException e) {
                throw new RuntimeException("Unable to copy database file.", e);
            } catch (Throwable th) {
                ov4.mo24121d();
                throw th;
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    public SupportSQLiteOpenHelper getDelegate() {
        return this.f16513r;
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.f16515x) {
            mo24619d(true);
            this.f16515x = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
