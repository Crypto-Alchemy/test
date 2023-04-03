package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020\"\u0012\b\u0010+\u001a\u0004\u0018\u00010(\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000100\u0012\b\u00105\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u000106\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0004\bG\u0010HJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0006X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0006X\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0014\u0010/\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u001c\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b4\u0010\fR\u0016\u00109\u001a\u0004\u0018\u0001068\u0006X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010>\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0006X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006X\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006X\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019R\u0014\u0010D\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\bC\u0010\u001c¨\u0006I"}, mo44877d2 = {"Lj21;", "", "", "fromVersion", "toVersion", "", "a", "Landroid/content/Context;", "Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "c", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "sqliteOpenHelperFactory", "Landroidx/room/RoomDatabase$d;", "d", "Landroidx/room/RoomDatabase$d;", "migrationContainer", "", "Landroidx/room/RoomDatabase$b;", "e", "Ljava/util/List;", "callbacks", "f", "Z", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "g", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Ljava/util/concurrent/Executor;", "h", "Ljava/util/concurrent/Executor;", "queryExecutor", "i", "transactionExecutor", "Landroid/content/Intent;", "j", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "k", "requireMigration", "l", "allowDestructiveMigrationOnDowngrade", "", "m", "Ljava/util/Set;", "migrationNotRequiredFrom", "n", "copyFromAssetPath", "Ljava/io/File;", "o", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "p", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "q", "typeConverters", "r", "autoMigrationSpecs", "s", "multiInstanceInvalidation", "Landroidx/room/RoomDatabase$e;", "prepackagedDatabaseCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;Landroidx/room/RoomDatabase$d;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$e;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: j21 */
/* compiled from: DatabaseConfiguration.kt */
public class j21 {

    /* renamed from: a */
    public final Context f13479a;

    /* renamed from: b */
    public final String f13480b;

    /* renamed from: c */
    public final SupportSQLiteOpenHelper.C1392b f13481c;

    /* renamed from: d */
    public final RoomDatabase.C1369d f13482d;

    /* renamed from: e */
    public final List<RoomDatabase.C1367b> f13483e;

    /* renamed from: f */
    public final boolean f13484f;

    /* renamed from: g */
    public final RoomDatabase.JournalMode f13485g;

    /* renamed from: h */
    public final Executor f13486h;

    /* renamed from: i */
    public final Executor f13487i;

    /* renamed from: j */
    public final Intent f13488j;

    /* renamed from: k */
    public final boolean f13489k;

    /* renamed from: l */
    public final boolean f13490l;

    /* renamed from: m */
    public final Set<Integer> f13491m;

    /* renamed from: n */
    public final String f13492n;

    /* renamed from: o */
    public final File f13493o;

    /* renamed from: p */
    public final Callable<InputStream> f13494p;

    /* renamed from: q */
    public final List<Object> f13495q;

    /* renamed from: r */
    public final List<Object> f13496r;

    /* renamed from: s */
    public final boolean f13497s;

    @SuppressLint({"LambdaLast"})
    public j21(Context context, String str, SupportSQLiteOpenHelper.C1392b bVar, RoomDatabase.C1369d dVar, List<? extends RoomDatabase.C1367b> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.C1370e eVar, List<? extends Object> list2, List<Object> list3) {
        RoomDatabase.JournalMode journalMode2 = journalMode;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List<? extends Object> list4 = list2;
        List<Object> list5 = list3;
        vx2.m53591g(context, "context");
        vx2.m53591g(bVar, "sqliteOpenHelperFactory");
        vx2.m53591g(dVar, "migrationContainer");
        vx2.m53591g(journalMode2, "journalMode");
        vx2.m53591g(executor3, "queryExecutor");
        vx2.m53591g(executor4, "transactionExecutor");
        vx2.m53591g(list4, "typeConverters");
        vx2.m53591g(list5, "autoMigrationSpecs");
        this.f13479a = context;
        this.f13480b = str;
        this.f13481c = bVar;
        this.f13482d = dVar;
        this.f13483e = list;
        this.f13484f = z;
        this.f13485g = journalMode2;
        this.f13486h = executor3;
        this.f13487i = executor4;
        this.f13488j = intent2;
        this.f13489k = z2;
        this.f13490l = z3;
        this.f13491m = set;
        this.f13492n = str2;
        this.f13493o = file;
        this.f13494p = callable;
        this.f13495q = list4;
        this.f13496r = list5;
        this.f13497s = intent2 != null;
    }

    /* renamed from: a */
    public boolean mo21712a(int i, int i2) {
        boolean z;
        Set<Integer> set;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f13490l) {
            return false;
        }
        if (!this.f13489k || ((set = this.f13491m) != null && set.contains(Integer.valueOf(i)))) {
            return false;
        }
        return true;
    }
}
