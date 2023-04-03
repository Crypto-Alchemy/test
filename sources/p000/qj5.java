package p000;

import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lqj5;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "", "a", "Ljava/lang/String;", "mCopyFromAssetPath", "Ljava/io/File;", "b", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "c", "Ljava/util/concurrent/Callable;", "mCopyFromInputStream", "d", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qj5 */
/* compiled from: SQLiteCopyOpenHelperFactory.kt */
public final class qj5 implements SupportSQLiteOpenHelper.C1392b {

    /* renamed from: a */
    public final String f16955a;

    /* renamed from: b */
    public final File f16956b;

    /* renamed from: c */
    public final Callable<InputStream> f16957c;

    /* renamed from: d */
    public final SupportSQLiteOpenHelper.C1392b f16958d;

    public qj5(String str, File file, Callable<InputStream> callable, SupportSQLiteOpenHelper.C1392b bVar) {
        vx2.m53591g(bVar, "mDelegate");
        this.f16955a = str;
        this.f16956b = file;
        this.f16957c = callable;
        this.f16958d = bVar;
    }

    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        vx2.m53591g(configuration, "configuration");
        return new pj5(configuration.f6977a, this.f16955a, this.f16956b, this.f16957c, configuration.f6979c.f6988a, this.f16958d.create(configuration));
    }
}
