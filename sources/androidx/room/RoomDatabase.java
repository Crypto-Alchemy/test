package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b&\u0018\u0000 d2\u00020\u0001:\u000739\u001fm +\u001eB\u0007¢\u0006\u0004\bl\u00106J-\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u0017J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000fH$J\b\u0010\u001a\u001a\u00020\u0019H$J\"\u0010\u001b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00140\u0012H\u0015J\u0016\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u001cH\u0017J\b\u0010\u001e\u001a\u00020\tH'J\b\u0010\u001f\u001a\u00020\tH\u0017J\b\u0010 \u001a\u00020\tH\u0017J\u001c\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0017J\u0010\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020\tH\u0017J\b\u0010,\u001a\u00020\tH\u0017J\b\u0010-\u001a\u00020\tH\u0017J\u0010\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0014J\b\u00102\u001a\u000201H\u0016R\u001e\u00107\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u0002088\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010:R\u0016\u0010>\u001a\u00020\u00058\u0002@\u0002X.¢\u0006\u0006\n\u0004\b \u0010=R\u001a\u0010B\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u0002018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010CR\u0016\u0010E\u001a\u0002018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010CR$\u0010I\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010\u00148\u0004@\u0004X\u000e¢\u0006\f\n\u0004\b\u001a\u0010G\u0012\u0004\bH\u00106R6\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010J8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010TR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8G¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R#\u0010]\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010J8G¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bX\u0010MR$\u0010^\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010J8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010KR\u0014\u0010a\u001a\u0002088VX\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u0002088VX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010`R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010i\u001a\u0002018VX\u0004¢\u0006\f\u0012\u0004\bh\u00106\u001a\u0004\bf\u0010gR\u0014\u0010k\u001a\u0002018@X\u0004¢\u0006\u0006\u001a\u0004\bj\u0010g¨\u0006n"}, mo44877d2 = {"Landroidx/room/RoomDatabase;", "", "T", "Ljava/lang/Class;", "clazz", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "D", "(Ljava/lang/Class;Landroidx/sqlite/db/SupportSQLiteOpenHelper;)Ljava/lang/Object;", "Lr37;", "v", "w", "Ljava/util/concurrent/locks/Lock;", "m", "()Ljava/util/concurrent/locks/Lock;", "Lj21;", "configuration", "u", "", "autoMigrationSpecs", "", "Ltv3;", "k", "config", "i", "Lgy2;", "h", "r", "", "q", "f", "c", "d", "Landroidx/sqlite/db/SupportSQLiteQuery;", "query", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "A", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "g", "e", "j", "C", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "x", "", "t", "a", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "()V", "mDatabase", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "internalTransactionExecutor", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "internalOpenHelper", "Lgy2;", "n", "()Lgy2;", "invalidationTracker", "Z", "allowMainThreadQueries", "writeAheadLoggingEnabled", "Landroidx/room/RoomDatabase$b;", "Ljava/util/List;", "getMCallbacks$annotations", "mCallbacks", "", "Ljava/util/Map;", "getAutoMigrationSpecs", "()Ljava/util/Map;", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ltt;", "Ltt;", "autoCloser", "Ljava/lang/ThreadLocal;", "", "l", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "suspendingTransactionId", "backingFieldMap", "typeConverters", "p", "()Ljava/util/concurrent/Executor;", "queryExecutor", "s", "transactionExecutor", "o", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "z", "()Z", "isOpen$annotations", "isOpen", "y", "isMainThread", "<init>", "JournalMode", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RoomDatabase.kt */
public abstract class RoomDatabase {

    /* renamed from: o */
    public static final C1368c f6873o = new C1368c((DefaultConstructorMarker) null);

    /* renamed from: a */
    public volatile SupportSQLiteDatabase f6874a;

    /* renamed from: b */
    public Executor f6875b;

    /* renamed from: c */
    public Executor f6876c;

    /* renamed from: d */
    public SupportSQLiteOpenHelper f6877d;

    /* renamed from: e */
    public final gy2 f6878e = mo10122h();

    /* renamed from: f */
    public boolean f6879f;

    /* renamed from: g */
    public boolean f6880g;

    /* renamed from: h */
    public List<? extends C1367b> f6881h;

    /* renamed from: i */
    public Map<Class<Object>, Object> f6882i = new LinkedHashMap();

    /* renamed from: j */
    public final ReentrantReadWriteLock f6883j = new ReentrantReadWriteLock();

    /* renamed from: k */
    public C3383tt f6884k;

    /* renamed from: l */
    public final ThreadLocal<Integer> f6885l = new ThreadLocal<>();

    /* renamed from: m */
    public final Map<String, Object> f6886m;

    /* renamed from: n */
    public final Map<Class<?>, Object> f6887n;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo44877d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "Landroid/content/Context;", "context", "resolve$room_runtime_release", "(Landroid/content/Context;)Landroidx/room/RoomDatabase$JournalMode;", "resolve", "Landroid/app/ActivityManager;", "activityManager", "", "d", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: RoomDatabase.kt */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: d */
        public final boolean mo10141d(ActivityManager activityManager) {
            return ce6.m11845b(activityManager);
        }

        public final JournalMode resolve$room_runtime_release(Context context) {
            vx2.m53591g(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            vx2.m53589e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!mo10141d((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b^\u0010_J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000f\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0018\u0010-\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u00102R\u0016\u0010?\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010\u001dR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010Y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, mo44877d2 = {"Landroidx/room/RoomDatabase$a;", "Landroidx/room/RoomDatabase;", "T", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "factory", "f", "", "Ltv3;", "migrations", "b", "([Ltv3;)Landroidx/room/RoomDatabase$a;", "c", "Ljava/util/concurrent/Executor;", "executor", "g", "e", "Landroidx/room/RoomDatabase$b;", "callback", "a", "d", "()Landroidx/room/RoomDatabase;", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "Ljava/lang/Class;", "klass", "", "Ljava/lang/String;", "name", "", "Ljava/util/List;", "callbacks", "Landroidx/room/RoomDatabase$f;", "Landroidx/room/RoomDatabase$f;", "queryCallback", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "typeConverters", "h", "autoMigrationSpecs", "i", "queryExecutor", "j", "transactionExecutor", "k", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "", "l", "Z", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "m", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Landroid/content/Intent;", "n", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "o", "requireMigration", "p", "allowDestructiveMigrationOnDowngrade", "", "q", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "r", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Landroidx/room/RoomDatabase$d;", "s", "Landroidx/room/RoomDatabase$d;", "migrationContainer", "", "", "t", "Ljava/util/Set;", "migrationsNotRequiredFrom", "u", "migrationStartAndEndVersions", "v", "copyFromAssetPath", "Ljava/io/File;", "w", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "x", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.RoomDatabase$a */
    /* compiled from: RoomDatabase.kt */
    public static class C1366a<T extends RoomDatabase> {

        /* renamed from: a */
        public final Context f6889a;

        /* renamed from: b */
        public final Class<T> f6890b;

        /* renamed from: c */
        public final String f6891c;

        /* renamed from: d */
        public final List<C1367b> f6892d = new ArrayList();

        /* renamed from: e */
        public C1371f f6893e;

        /* renamed from: f */
        public Executor f6894f;

        /* renamed from: g */
        public final List<Object> f6895g = new ArrayList();

        /* renamed from: h */
        public List<Object> f6896h = new ArrayList();

        /* renamed from: i */
        public Executor f6897i;

        /* renamed from: j */
        public Executor f6898j;

        /* renamed from: k */
        public SupportSQLiteOpenHelper.C1392b f6899k;

        /* renamed from: l */
        public boolean f6900l;

        /* renamed from: m */
        public JournalMode f6901m = JournalMode.AUTOMATIC;

        /* renamed from: n */
        public Intent f6902n;

        /* renamed from: o */
        public boolean f6903o = true;

        /* renamed from: p */
        public boolean f6904p;

        /* renamed from: q */
        public long f6905q = -1;

        /* renamed from: r */
        public TimeUnit f6906r;

        /* renamed from: s */
        public final C1369d f6907s = new C1369d();

        /* renamed from: t */
        public Set<Integer> f6908t = new LinkedHashSet();

        /* renamed from: u */
        public Set<Integer> f6909u;

        /* renamed from: v */
        public String f6910v;

        /* renamed from: w */
        public File f6911w;

        /* renamed from: x */
        public Callable<InputStream> f6912x;

        public C1366a(Context context, Class<T> cls, String str) {
            vx2.m53591g(context, "context");
            vx2.m53591g(cls, "klass");
            this.f6889a = context;
            this.f6890b = cls;
            this.f6891c = str;
        }

        /* renamed from: a */
        public C1366a<T> mo10143a(C1367b bVar) {
            vx2.m53591g(bVar, "callback");
            this.f6892d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public C1366a<T> mo10144b(tv3... tv3Arr) {
            vx2.m53591g(tv3Arr, "migrations");
            if (this.f6909u == null) {
                this.f6909u = new HashSet();
            }
            for (tv3 tv3 : tv3Arr) {
                Set<Integer> set = this.f6909u;
                vx2.m53588d(set);
                set.add(Integer.valueOf(tv3.f18285a));
                Set<Integer> set2 = this.f6909u;
                vx2.m53588d(set2);
                set2.add(Integer.valueOf(tv3.f18286b));
            }
            this.f6907s.mo10154b((tv3[]) Arrays.copyOf(tv3Arr, tv3Arr.length));
            return this;
        }

        /* renamed from: c */
        public C1366a<T> mo10145c() {
            this.f6900l = true;
            return this;
        }

        /* renamed from: d */
        public T mo10146d() {
            qj5 qj5;
            int i;
            int i2;
            int i3;
            Executor executor = this.f6897i;
            if (executor == null && this.f6898j == null) {
                Executor e = C3634xp.m30268e();
                this.f6898j = e;
                this.f6897i = e;
            } else if (executor != null && this.f6898j == null) {
                this.f6898j = executor;
            } else if (executor == null) {
                this.f6897i = this.f6898j;
            }
            Set<Integer> set = this.f6909u;
            boolean z = true;
            if (set != null) {
                vx2.m53588d(set);
                for (Integer intValue : set) {
                    int intValue2 = intValue.intValue();
                    if (!(!this.f6908t.contains(Integer.valueOf(intValue2)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2).toString());
                    }
                }
            }
            C3431ut utVar = this.f6899k;
            if (utVar == null) {
                utVar = new fc2();
            }
            if (utVar != null) {
                if (this.f6905q > 0) {
                    if (this.f6891c != null) {
                        long j = this.f6905q;
                        TimeUnit timeUnit = this.f6906r;
                        if (timeUnit != null) {
                            Executor executor2 = this.f6897i;
                            if (executor2 != null) {
                                utVar = new C3431ut(utVar, new C3383tt(j, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.f6910v;
                if (!(str == null && this.f6911w == null && this.f6912x == null)) {
                    if (this.f6891c != null) {
                        if (str == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        File file = this.f6911w;
                        if (file == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        Callable<InputStream> callable = this.f6912x;
                        if (callable == null) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i + i2 + i3 != 1) {
                            z = false;
                        }
                        if (z) {
                            utVar = new qj5(str, file, callable, utVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                utVar = null;
            }
            if (utVar != null) {
                C1371f fVar = this.f6893e;
                if (fVar != null) {
                    Executor executor3 = this.f6894f;
                    if (executor3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else if (fVar != null) {
                        qj5 = new e05(utVar, executor3, fVar);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    qj5 = utVar;
                }
                Context context = this.f6889a;
                String str2 = this.f6891c;
                C1369d dVar = this.f6907s;
                List<C1367b> list = this.f6892d;
                boolean z2 = this.f6900l;
                JournalMode resolve$room_runtime_release = this.f6901m.resolve$room_runtime_release(context);
                Executor executor4 = this.f6897i;
                if (executor4 != null) {
                    Executor executor5 = this.f6898j;
                    if (executor5 != null) {
                        j21 j21 = new j21(context, str2, qj5, dVar, list, z2, resolve$room_runtime_release, executor4, executor5, this.f6902n, this.f6903o, this.f6904p, this.f6908t, this.f6910v, this.f6911w, this.f6912x, (C1370e) null, this.f6895g, this.f6896h);
                        T t = (RoomDatabase) ih5.m19630b(this.f6890b, "_Impl");
                        t.mo10135u(j21);
                        return t;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: e */
        public C1366a<T> mo10147e() {
            this.f6903o = false;
            this.f6904p = true;
            return this;
        }

        /* renamed from: f */
        public C1366a<T> mo10148f(SupportSQLiteOpenHelper.C1392b bVar) {
            this.f6899k = bVar;
            return this;
        }

        /* renamed from: g */
        public C1366a<T> mo10149g(Executor executor) {
            vx2.m53591g(executor, "executor");
            this.f6897i = executor;
            return this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Landroidx/room/RoomDatabase$b;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lr37;", "a", "c", "b", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.RoomDatabase$b */
    /* compiled from: RoomDatabase.kt */
    public static abstract class C1367b {
        /* renamed from: a */
        public void mo10150a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "db");
        }

        /* renamed from: b */
        public void mo10151b(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "db");
        }

        /* renamed from: c */
        public void mo10152c(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "db");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Landroidx/room/RoomDatabase$c;", "", "", "MAX_BIND_PARAMETER_CNT", "I", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.RoomDatabase$c */
    /* compiled from: RoomDatabase.kt */
    public static final class C1368c {
        public C1368c() {
        }

        public /* synthetic */ C1368c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b0\bH\u0016J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J6\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002R,\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001e"}, mo44877d2 = {"Landroidx/room/RoomDatabase$d;", "", "", "Ltv3;", "migrations", "Lr37;", "b", "([Ltv3;)V", "", "", "f", "start", "end", "", "d", "startVersion", "endVersion", "", "c", "migration", "a", "", "result", "upgrade", "e", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.RoomDatabase$d */
    /* compiled from: RoomDatabase.kt */
    public static class C1369d {

        /* renamed from: a */
        public final Map<Integer, TreeMap<Integer, tv3>> f6913a = new LinkedHashMap();

        /* renamed from: a */
        public final void mo10153a(tv3 tv3) {
            int i = tv3.f18285a;
            int i2 = tv3.f18286b;
            Map<Integer, TreeMap<Integer, tv3>> map = this.f6913a;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, tv3> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(treeMap2.get(Integer.valueOf(i2)));
                sb.append(" with ");
                sb.append(tv3);
            }
            treeMap2.put(Integer.valueOf(i2), tv3);
        }

        /* renamed from: b */
        public void mo10154b(tv3... tv3Arr) {
            vx2.m53591g(tv3Arr, "migrations");
            for (tv3 a : tv3Arr) {
                mo10153a(a);
            }
        }

        /* renamed from: c */
        public final boolean mo10155c(int i, int i2) {
            Map<Integer, Map<Integer, tv3>> f = mo10158f();
            if (!f.containsKey(Integer.valueOf(i))) {
                return false;
            }
            Map map = f.get(Integer.valueOf(i));
            if (map == null) {
                map = C6177b.m47361i();
            }
            return map.containsKey(Integer.valueOf(i2));
        }

        /* renamed from: d */
        public List<tv3> mo10156d(int i, int i2) {
            boolean z;
            if (i == i2) {
                return ck0.m33062j();
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return mo10157e(new ArrayList(), z, i, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
            if (r6 <= r12) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
            if (r6 < r11) goto L_0x0056;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x005b A[SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<p000.tv3> mo10157e(java.util.List<p000.tv3> r9, boolean r10, int r11, int r12) {
            /*
                r8 = this;
            L_0x0000:
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L_0x0007
                if (r11 >= r12) goto L_0x000b
                goto L_0x0009
            L_0x0007:
                if (r11 <= r12) goto L_0x000b
            L_0x0009:
                r2 = r0
                goto L_0x000c
            L_0x000b:
                r2 = r1
            L_0x000c:
                if (r2 == 0) goto L_0x006e
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, tv3>> r2 = r8.f6913a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                r3 = 0
                if (r2 != 0) goto L_0x001e
                return r3
            L_0x001e:
                if (r10 == 0) goto L_0x0025
                java.util.NavigableSet r4 = r2.descendingKeySet()
                goto L_0x0029
            L_0x0025:
                java.util.Set r4 = r2.keySet()
            L_0x0029:
                java.util.Iterator r4 = r4.iterator()
            L_0x002d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x006a
                java.lang.Object r5 = r4.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = "targetVersion"
                if (r10 == 0) goto L_0x004b
                int r7 = r11 + 1
                p000.vx2.m53590f(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L_0x0058
                if (r6 > r12) goto L_0x0058
                goto L_0x0056
            L_0x004b:
                p000.vx2.m53590f(r5, r6)
                int r6 = r5.intValue()
                if (r12 > r6) goto L_0x0058
                if (r6 >= r11) goto L_0x0058
            L_0x0056:
                r6 = r0
                goto L_0x0059
            L_0x0058:
                r6 = r1
            L_0x0059:
                if (r6 == 0) goto L_0x002d
                java.lang.Object r11 = r2.get(r5)
                p000.vx2.m53588d(r11)
                r9.add(r11)
                int r11 = r5.intValue()
                goto L_0x006b
            L_0x006a:
                r0 = r1
            L_0x006b:
                if (r0 != 0) goto L_0x0000
                return r3
            L_0x006e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.C1369d.mo10157e(java.util.List, boolean, int, int):java.util.List");
        }

        /* renamed from: f */
        public Map<Integer, Map<Integer, tv3>> mo10158f() {
            return this.f6913a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"Landroidx/room/RoomDatabase$e;", "", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.RoomDatabase$e */
    /* compiled from: RoomDatabase.kt */
    public static abstract class C1370e {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, mo44877d2 = {"Landroidx/room/RoomDatabase$f;", "", "", "sqlQuery", "", "bindArgs", "Lr37;", "a", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.RoomDatabase$f */
    /* compiled from: RoomDatabase.kt */
    public interface C1371f {
        /* renamed from: a */
        void mo10159a(String str, List<? extends Object> list);
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        vx2.m53590f(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f6886m = synchronizedMap;
        this.f6887n = new LinkedHashMap();
    }

    /* renamed from: B */
    public static /* synthetic */ Cursor m9786B(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return roomDatabase.mo10114A(supportSQLiteQuery, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    /* renamed from: A */
    public Cursor mo10114A(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        vx2.m53591g(supportSQLiteQuery, "query");
        mo10117c();
        mo10118d();
        if (cancellationSignal != null) {
            return mo10129o().getWritableDatabase().query(supportSQLiteQuery, cancellationSignal);
        }
        return mo10129o().getWritableDatabase().query(supportSQLiteQuery);
    }

    /* renamed from: C */
    public void mo10115C() {
        mo10129o().getWritableDatabase().setTransactionSuccessful();
    }

    /* renamed from: D */
    public final <T> T mo10116D(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof tb1) {
            return mo10116D(cls, ((tb1) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    /* renamed from: c */
    public void mo10117c() {
        if (!this.f6879f && !(!mo10139y())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    /* renamed from: d */
    public void mo10118d() {
        boolean z;
        if (mo10134t() || this.f6885l.get() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    /* renamed from: e */
    public void mo10119e() {
        mo10117c();
        C3383tt ttVar = this.f6884k;
        if (ttVar == null) {
            mo10136v();
        } else {
            ttVar.mo26545g(new RoomDatabase$beginTransaction$1(this));
        }
    }

    /* renamed from: f */
    public abstract void mo10120f();

    /* renamed from: g */
    public SupportSQLiteStatement mo10121g(String str) {
        vx2.m53591g(str, "sql");
        mo10117c();
        mo10118d();
        return mo10129o().getWritableDatabase().compileStatement(str);
    }

    /* renamed from: h */
    public abstract gy2 mo10122h();

    /* renamed from: i */
    public abstract SupportSQLiteOpenHelper mo10123i(j21 j21);

    /* renamed from: j */
    public void mo10124j() {
        C3383tt ttVar = this.f6884k;
        if (ttVar == null) {
            mo10137w();
        } else {
            ttVar.mo26545g(new RoomDatabase$endTransaction$1(this));
        }
    }

    /* renamed from: k */
    public List<tv3> mo10125k(Map<Class<Object>, Object> map) {
        vx2.m53591g(map, "autoMigrationSpecs");
        return ck0.m33062j();
    }

    /* renamed from: l */
    public final Map<String, Object> mo10126l() {
        return this.f6886m;
    }

    /* renamed from: m */
    public final Lock mo10127m() {
        ReentrantReadWriteLock.ReadLock readLock = this.f6883j.readLock();
        vx2.m53590f(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    /* renamed from: n */
    public gy2 mo10128n() {
        return this.f6878e;
    }

    /* renamed from: o */
    public SupportSQLiteOpenHelper mo10129o() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f6877d;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        vx2.m53605u("internalOpenHelper");
        return null;
    }

    /* renamed from: p */
    public Executor mo10130p() {
        Executor executor = this.f6875b;
        if (executor != null) {
            return executor;
        }
        vx2.m53605u("internalQueryExecutor");
        return null;
    }

    /* renamed from: q */
    public Set<Class<Object>> mo10131q() {
        return ny5.m49095e();
    }

    /* renamed from: r */
    public Map<Class<?>, List<Class<?>>> mo10132r() {
        return C6177b.m47361i();
    }

    /* renamed from: s */
    public Executor mo10133s() {
        Executor executor = this.f6876c;
        if (executor != null) {
            return executor;
        }
        vx2.m53605u("internalTransactionExecutor");
        return null;
    }

    /* renamed from: t */
    public boolean mo10134t() {
        return mo10129o().getWritableDatabase().inTransaction();
    }

    /* renamed from: u */
    public void mo10135u(j21 j21) {
        boolean z;
        boolean z2;
        vx2.m53591g(j21, "configuration");
        this.f6877d = mo10123i(j21);
        Set<Class<Object>> q = mo10131q();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = q.iterator();
        while (true) {
            boolean z3 = true;
            int i = -1;
            if (it.hasNext()) {
                Class next = it.next();
                int size = j21.f13496r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(j21.f13496r.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    z3 = false;
                }
                if (z3) {
                    this.f6882i.put(next, j21.f13496r.get(i));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = j21.f13496r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                for (tv3 next2 : mo10125k(this.f6882i)) {
                    if (!j21.f13482d.mo10155c(next2.f18285a, next2.f18286b)) {
                        j21.f13482d.mo10154b(next2);
                    }
                }
                pj5 pj5 = (pj5) mo10116D(pj5.class, mo10129o());
                if (pj5 != null) {
                    pj5.mo24618c(j21);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) mo10116D(AutoClosingRoomOpenHelper.class, mo10129o());
                if (autoClosingRoomOpenHelper != null) {
                    this.f6884k = autoClosingRoomOpenHelper.f6857d;
                    mo10128n().mo20880q(autoClosingRoomOpenHelper.f6857d);
                }
                if (j21.f13485g == JournalMode.WRITE_AHEAD_LOGGING) {
                    z = true;
                } else {
                    z = false;
                }
                mo10129o().setWriteAheadLoggingEnabled(z);
                this.f6881h = j21.f13483e;
                this.f6875b = j21.f13486h;
                this.f6876c = new xt6(j21.f13487i);
                this.f6879f = j21.f13484f;
                this.f6880g = z;
                if (j21.f13488j != null) {
                    if (j21.f13480b != null) {
                        mo10128n().mo20881r(j21.f13479a, j21.f13480b, j21.f13488j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map<Class<?>, List<Class<?>>> r = mo10132r();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry next3 : r.entrySet()) {
                    Class cls = (Class) next3.getKey();
                    Iterator it2 = ((List) next3.getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Class cls2 = (Class) it2.next();
                            int size3 = j21.f13495q.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i4 = size3 - 1;
                                    if (cls2.isAssignableFrom(j21.f13495q.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i4 < 0) {
                                        break;
                                    } else {
                                        size3 = i4;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                this.f6887n.put(cls2, j21.f13495q.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    }
                }
                int size4 = j21.f13495q.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i5 = size4 - 1;
                        if (!bitSet2.get(size4)) {
                            throw new IllegalArgumentException("Unexpected type converter " + j21.f13495q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        } else if (i5 >= 0) {
                            size4 = i5;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo10136v() {
        mo10117c();
        SupportSQLiteDatabase writableDatabase = mo10129o().getWritableDatabase();
        mo10128n().mo20885v(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    /* renamed from: w */
    public final void mo10137w() {
        mo10129o().getWritableDatabase().endTransaction();
        if (!mo10134t()) {
            mo10128n().mo20877n();
        }
    }

    /* renamed from: x */
    public void mo10138x(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "db");
        mo10128n().mo20874k(supportSQLiteDatabase);
    }

    /* renamed from: y */
    public final boolean mo10139y() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo10140z() {
        Boolean bool;
        boolean isOpen;
        C3383tt ttVar = this.f6884k;
        if (ttVar != null) {
            isOpen = ttVar.mo26550l();
        } else {
            SupportSQLiteDatabase supportSQLiteDatabase = this.f6874a;
            if (supportSQLiteDatabase != null) {
                isOpen = supportSQLiteDatabase.isOpen();
            } else {
                bool = null;
                return vx2.m53586b(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return vx2.m53586b(bool, Boolean.TRUE);
    }
}
