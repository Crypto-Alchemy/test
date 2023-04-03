package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u00056\"#3&BS\b\u0007\u0012\u0006\u0010\u0014\u001a\u000205\u0012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0:\u0012\u0018\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0=0:\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\bk\u0010lJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J'\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0017J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0017J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0017J\u000f\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020\u0006H\u0016J#\u0010*\u001a\u00020\u00062\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b,\u0010\u0016J\u000f\u0010-\u001a\u00020\u0006H\u0000¢\u0006\u0004\b-\u0010\u0018JA\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010.2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010/\u001a\u00020%2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0017¢\u0006\u0004\b3\u00104R\u001a\u0010\u0014\u001a\u0002058\u0000X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010;R&\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0=0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010;R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040:8\u0000X\u0004¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b?\u0010@R\"\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\u00020H8GX\u0004¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010U\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bJ\u0010Q\u001a\u0004\bF\u0010R\"\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ZR&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020]0\\8\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010^\u001a\u0004\bM\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010bR\u0014\u0010e\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010dR\u0014\u0010f\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010dR\u001a\u0010j\u001a\u00020g8\u0006X\u0004¢\u0006\f\n\u0004\b\u000f\u0010h\u0012\u0004\bi\u0010\u0018¨\u0006m"}, mo44877d2 = {"Lgy2;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "tableId", "Lr37;", "t", "s", "", "", "tableNames", "w", "([Ljava/lang/String;)[Ljava/lang/String;", "names", "p", "Ltt;", "autoCloser", "q", "(Ltt;)V", "database", "k", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "m", "()V", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "r", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Lgy2$c;", "observer", "b", "c", "o", "", "e", "()Z", "n", "tables", "l", "([Ljava/lang/String;)V", "v", "u", "T", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "d", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", "a", "Landroidx/room/RoomDatabase;", "g", "()Landroidx/room/RoomDatabase;", "", "Ljava/util/Map;", "shadowTablesMap", "", "viewTables", "j", "()Ljava/util/Map;", "tableIdLookup", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "f", "Ltt;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "h", "Z", "initialized", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "setCleanupStatement$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "cleanupStatement", "Lgy2$b;", "Lgy2$b;", "observedTableTracker", "Ley2;", "Ley2;", "invalidationLiveDataContainer", "Lok5;", "Lgy2$d;", "Lok5;", "()Lok5;", "observerMap", "Lsz3;", "Lsz3;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gy2 */
/* compiled from: InvalidationTracker.kt */
public class gy2 {

    /* renamed from: q */
    public static final C2432a f12630q = new C2432a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final String[] f12631r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final RoomDatabase f12632a;

    /* renamed from: b */
    public final Map<String, String> f12633b;

    /* renamed from: c */
    public final Map<String, Set<String>> f12634c;

    /* renamed from: d */
    public final Map<String, Integer> f12635d;

    /* renamed from: e */
    public final String[] f12636e;

    /* renamed from: f */
    public C3383tt f12637f;

    /* renamed from: g */
    public final AtomicBoolean f12638g = new AtomicBoolean(false);

    /* renamed from: h */
    public volatile boolean f12639h;

    /* renamed from: i */
    public volatile SupportSQLiteStatement f12640i;

    /* renamed from: j */
    public final C2433b f12641j;

    /* renamed from: k */
    public final ey2 f12642k;

    /* renamed from: l */
    public final ok5<C2435c, C2436d> f12643l;

    /* renamed from: m */
    public sz3 f12644m;

    /* renamed from: n */
    public final Object f12645n;

    /* renamed from: o */
    public final Object f12646o;

    /* renamed from: p */
    public final Runnable f12647p;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0000XT¢\u0006\f\n\u0004\b\u000f\u0010\r\u0012\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0000XT¢\u0006\f\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\r¨\u0006\u001a"}, mo44877d2 = {"Lgy2$a;", "", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lr37;", "a", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "()V", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "<init>", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gy2$a */
    /* compiled from: InvalidationTracker.kt */
    public static final class C2432a {
        public C2432a() {
        }

        public /* synthetic */ C2432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo20887a(SupportSQLiteDatabase supportSQLiteDatabase) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            if (supportSQLiteDatabase.isWriteAheadLoggingEnabled()) {
                supportSQLiteDatabase.beginTransactionNonExclusive();
            } else {
                supportSQLiteDatabase.beginTransaction();
            }
        }

        /* renamed from: b */
        public final String mo20888b(String str, String str2) {
            vx2.m53591g(str, "tableName");
            vx2.m53591g(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, mo44877d2 = {"Lgy2$b;", "", "", "", "tableIds", "", "b", "c", "Lr37;", "d", "a", "", "[J", "getTableObservers", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "tableCount", "<init>", "(I)V", "e", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gy2$b */
    /* compiled from: InvalidationTracker.kt */
    public static final class C2433b {

        /* renamed from: e */
        public static final C2434a f12648e = new C2434a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final long[] f12649a;

        /* renamed from: b */
        public final boolean[] f12650b;

        /* renamed from: c */
        public final int[] f12651c;

        /* renamed from: d */
        public boolean f12652d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, mo44877d2 = {"Lgy2$b$a;", "", "", "ADD", "I", "NO_OP", "REMOVE", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: gy2$b$a */
        /* compiled from: InvalidationTracker.kt */
        public static final class C2434a {
            public C2434a() {
            }

            public /* synthetic */ C2434a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C2433b(int i) {
            this.f12649a = new long[i];
            this.f12650b = new boolean[i];
            this.f12651c = new int[i];
        }

        /* renamed from: a */
        public final int[] mo20889a() {
            boolean z;
            synchronized (this) {
                if (!this.f12652d) {
                    return null;
                }
                long[] jArr = this.f12649a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    if (jArr[i] > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean[] zArr = this.f12650b;
                    if (z != zArr[i2]) {
                        int[] iArr = this.f12651c;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f12651c[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.f12652d = false;
                int[] iArr2 = (int[]) this.f12651c.clone();
                return iArr2;
            }
        }

        /* renamed from: b */
        public final boolean mo20890b(int... iArr) {
            boolean z;
            vx2.m53591g(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f12649a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f12652d = true;
                        z = true;
                    }
                }
                r37 r37 = r37.f33317a;
            }
            return z;
        }

        /* renamed from: c */
        public final boolean mo20891c(int... iArr) {
            boolean z;
            vx2.m53591g(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f12649a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f12652d = true;
                        z = true;
                    }
                }
                r37 r37 = r37.f33317a;
            }
            return z;
        }

        /* renamed from: d */
        public final void mo20892d() {
            synchronized (this) {
                Arrays.fill(this.f12650b, false);
                this.f12652d = true;
                r37 r37 = r37.f33317a;
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8PX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lgy2$c;", "", "", "", "tables", "Lr37;", "c", "", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "<init>", "([Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gy2$c */
    /* compiled from: InvalidationTracker.kt */
    public static abstract class C2435c {

        /* renamed from: a */
        public final String[] f12653a;

        public C2435c(String[] strArr) {
            vx2.m53591g(strArr, "tables");
            this.f12653a = strArr;
        }

        /* renamed from: a */
        public final String[] mo20893a() {
            return this.f12653a;
        }

        /* renamed from: b */
        public boolean mo20894b() {
            return false;
        }

        /* renamed from: c */
        public abstract void mo20895c(Set<String> set);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lgy2$d;", "", "", "", "invalidatedTablesIds", "Lr37;", "b", "(Ljava/util/Set;)V", "", "", "tables", "c", "([Ljava/lang/String;)V", "Lgy2$c;", "a", "Lgy2$c;", "getObserver$room_runtime_release", "()Lgy2$c;", "observer", "", "[I", "()[I", "tableIds", "[Ljava/lang/String;", "tableNames", "d", "Ljava/util/Set;", "singleTableSet", "<init>", "(Lgy2$c;[I[Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gy2$d */
    /* compiled from: InvalidationTracker.kt */
    public static final class C2436d {

        /* renamed from: a */
        public final C2435c f12654a;

        /* renamed from: b */
        public final int[] f12655b;

        /* renamed from: c */
        public final String[] f12656c;

        /* renamed from: d */
        public final Set<String> f12657d;

        public C2436d(C2435c cVar, int[] iArr, String[] strArr) {
            boolean z;
            Set<String> set;
            vx2.m53591g(cVar, "observer");
            vx2.m53591g(iArr, "tableIds");
            vx2.m53591g(strArr, "tableNames");
            this.f12654a = cVar;
            this.f12655b = iArr;
            this.f12656c = strArr;
            boolean z2 = true;
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                set = my5.m48548d(strArr[0]);
            } else {
                set = ny5.m49095e();
            }
            this.f12657d = set;
            if (!(iArr.length != strArr.length ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* renamed from: a */
        public final int[] mo20896a() {
            return this.f12655b;
        }

        /* renamed from: b */
        public final void mo20897b(Set<Integer> set) {
            Set<String> set2;
            vx2.m53591g(set, "invalidatedTablesIds");
            int[] iArr = this.f12655b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set b = my5.m48546b();
                    int[] iArr2 = this.f12655b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            b.add(this.f12656c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    set2 = my5.m48545a(b);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.f12657d;
                } else {
                    set2 = ny5.m49095e();
                }
            } else {
                set2 = ny5.m49095e();
            }
            if (!set2.isEmpty()) {
                this.f12654a.mo20895c(set2);
            }
        }

        /* renamed from: c */
        public final void mo20898c(String[] strArr) {
            Set<String> set;
            vx2.m53591g(strArr, "tables");
            int length = this.f12656c.length;
            if (length != 0) {
                boolean z = false;
                if (length != 1) {
                    Set b = my5.m48546b();
                    for (String str : strArr) {
                        for (String str2 : this.f12656c) {
                            if (yb6.m74344y(str2, str, true)) {
                                b.add(str2);
                            }
                        }
                    }
                    set = my5.m48545a(b);
                } else {
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        } else if (yb6.m74344y(strArr[i], this.f12656c[0], true)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        set = this.f12657d;
                    } else {
                        set = ny5.m49095e();
                    }
                }
            } else {
                set = ny5.m49095e();
            }
            if (!set.isEmpty()) {
                this.f12654a.mo20895c(set);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo44877d2 = {"Lgy2$e;", "Lgy2$c;", "", "", "tables", "Lr37;", "c", "Lgy2;", "b", "Lgy2;", "getTracker", "()Lgy2;", "tracker", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegateRef", "delegate", "<init>", "(Lgy2;Lgy2$c;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gy2$e */
    /* compiled from: InvalidationTracker.kt */
    public static final class C2437e extends C2435c {

        /* renamed from: b */
        public final gy2 f12658b;

        /* renamed from: c */
        public final WeakReference<C2435c> f12659c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2437e(gy2 gy2, C2435c cVar) {
            super(cVar.mo20893a());
            vx2.m53591g(gy2, "tracker");
            vx2.m53591g(cVar, "delegate");
            this.f12658b = gy2;
            this.f12659c = new WeakReference<>(cVar);
        }

        /* renamed from: c */
        public void mo20895c(Set<String> set) {
            vx2.m53591g(set, "tables");
            C2435c cVar = this.f12659c.get();
            if (cVar == null) {
                this.f12658b.mo20878o(this);
            } else {
                cVar.mo20895c(set);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¨\u0006\u0007"}, mo44877d2 = {"gy2$f", "Ljava/lang/Runnable;", "Lr37;", "run", "", "", "a", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: gy2$f */
    /* compiled from: InvalidationTracker.kt */
    public static final class C2438f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ gy2 f12660a;

        public C2438f(gy2 gy2) {
            this.f12660a = gy2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
            p000.lh0.m47807a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Set<java.lang.Integer> mo20899a() {
            /*
                r5 = this;
                gy2 r0 = r5.f12660a
                java.util.Set r1 = p000.my5.m48546b()
                androidx.room.RoomDatabase r0 = r0.mo20870g()
                y26 r2 = new y26
                java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
                r2.<init>(r3)
                r3 = 0
                r4 = 2
                android.database.Cursor r0 = androidx.room.RoomDatabase.m9786B(r0, r2, r3, r4, r3)
            L_0x0017:
                boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0066 }
                if (r2 == 0) goto L_0x002a
                r2 = 0
                int r2 = r0.getInt(r2)     // Catch:{ all -> 0x0066 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0066 }
                r1.add(r2)     // Catch:{ all -> 0x0066 }
                goto L_0x0017
            L_0x002a:
                r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x0066 }
                p000.lh0.m47807a(r0, r3)
                java.util.Set r0 = p000.my5.m48545a(r1)
                boolean r1 = r0.isEmpty()
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0065
                gy2 r1 = r5.f12660a
                androidx.sqlite.db.SupportSQLiteStatement r1 = r1.mo20869f()
                java.lang.String r2 = "Required value was null."
                if (r1 == 0) goto L_0x005b
                gy2 r1 = r5.f12660a
                androidx.sqlite.db.SupportSQLiteStatement r1 = r1.mo20869f()
                if (r1 == 0) goto L_0x0051
                r1.executeUpdateDelete()
                goto L_0x0065
            L_0x0051:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x005b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0065:
                return r0
            L_0x0066:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0068 }
            L_0x0068:
                r2 = move-exception
                p000.lh0.m47807a(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gy2.C2438f.mo20899a():java.util.Set");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.mo26544e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
            if (r0 == null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
            if (r0 == null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b2, code lost:
            if ((!r3.isEmpty()) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
            r0 = r4.f12660a.mo20871h();
            r1 = r4.f12660a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r1 = r1.mo20871h().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
            if (r1.hasNext() == false) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
            ((p000.gy2.C2436d) ((java.util.Map.Entry) r1.next()).getValue()).mo20897b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
            r1 = p000.r37.f33317a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009d */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x008d=Splitter:B:33:0x008d, B:37:0x009d=Splitter:B:37:0x009d} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                gy2 r0 = r4.f12660a
                androidx.room.RoomDatabase r0 = r0.mo20870g()
                java.util.concurrent.locks.Lock r0 = r0.mo10127m()
                r0.lock()
                r1 = 1
                gy2 r2 = r4.f12660a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                boolean r2 = r2.mo20868e()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                if (r2 != 0) goto L_0x0025
                r0.unlock()
                gy2 r0 = r4.f12660a
                tt r0 = r0.f12637f
                if (r0 == 0) goto L_0x0024
                r0.mo26544e()
            L_0x0024:
                return
            L_0x0025:
                gy2 r2 = r4.f12660a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.mo20872i()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                r3 = 0
                boolean r2 = r2.compareAndSet(r1, r3)     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                if (r2 != 0) goto L_0x0041
                r0.unlock()
                gy2 r0 = r4.f12660a
                tt r0 = r0.f12637f
                if (r0 == 0) goto L_0x0040
                r0.mo26544e()
            L_0x0040:
                return
            L_0x0041:
                gy2 r2 = r4.f12660a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.room.RoomDatabase r2 = r2.mo20870g()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                boolean r2 = r2.mo10134t()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                if (r2 == 0) goto L_0x005c
                r0.unlock()
                gy2 r0 = r4.f12660a
                tt r0 = r0.f12637f
                if (r0 == 0) goto L_0x005b
                r0.mo26544e()
            L_0x005b:
                return
            L_0x005c:
                gy2 r2 = r4.f12660a     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.room.RoomDatabase r2 = r2.mo20870g()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.sqlite.db.SupportSQLiteOpenHelper r2 = r2.mo10129o()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                androidx.sqlite.db.SupportSQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                r2.beginTransactionNonExclusive()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                java.util.Set r3 = r4.mo20899a()     // Catch:{ all -> 0x0086 }
                r2.setTransactionSuccessful()     // Catch:{ all -> 0x0086 }
                r2.endTransaction()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                r0.unlock()
                gy2 r0 = r4.f12660a
                tt r0 = r0.f12637f
                if (r0 == 0) goto L_0x00ad
            L_0x0082:
                r0.mo26544e()
                goto L_0x00ad
            L_0x0086:
                r3 = move-exception
                r2.endTransaction()     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
                throw r3     // Catch:{ IllegalStateException -> 0x009d, SQLiteException -> 0x008d }
            L_0x008b:
                r1 = move-exception
                goto L_0x00e3
            L_0x008d:
                java.util.Set r3 = p000.ny5.m49095e()     // Catch:{ all -> 0x008b }
                r0.unlock()
                gy2 r0 = r4.f12660a
                tt r0 = r0.f12637f
                if (r0 == 0) goto L_0x00ad
                goto L_0x0082
            L_0x009d:
                java.util.Set r3 = p000.ny5.m49095e()     // Catch:{ all -> 0x008b }
                r0.unlock()
                gy2 r0 = r4.f12660a
                tt r0 = r0.f12637f
                if (r0 == 0) goto L_0x00ad
                goto L_0x0082
            L_0x00ad:
                boolean r0 = r3.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x00e2
                gy2 r0 = r4.f12660a
                ok5 r0 = r0.mo20871h()
                gy2 r1 = r4.f12660a
                monitor-enter(r0)
                ok5 r1 = r1.mo20871h()     // Catch:{ all -> 0x00df }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00df }
            L_0x00c5:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x00db
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00df }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00df }
                java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00df }
                gy2$d r2 = (p000.gy2.C2436d) r2     // Catch:{ all -> 0x00df }
                r2.mo20897b(r3)     // Catch:{ all -> 0x00df }
                goto L_0x00c5
            L_0x00db:
                r37 r1 = p000.r37.f33317a     // Catch:{ all -> 0x00df }
                monitor-exit(r0)
                goto L_0x00e2
            L_0x00df:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00e2:
                return
            L_0x00e3:
                r0.unlock()
                gy2 r0 = r4.f12660a
                tt r0 = r0.f12637f
                if (r0 == 0) goto L_0x00f1
                r0.mo26544e()
            L_0x00f1:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.gy2.C2438f.run():void");
        }
    }

    public gy2(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        String str;
        vx2.m53591g(roomDatabase, "database");
        vx2.m53591g(map, "shadowTablesMap");
        vx2.m53591g(map2, "viewTables");
        vx2.m53591g(strArr, "tableNames");
        this.f12632a = roomDatabase;
        this.f12633b = map;
        this.f12634c = map2;
        this.f12641j = new C2433b(strArr.length);
        this.f12642k = new ey2(roomDatabase);
        this.f12643l = new ok5<>();
        this.f12645n = new Object();
        this.f12646o = new Object();
        this.f12635d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            vx2.m53590f(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f12635d.put(lowerCase, Integer.valueOf(i));
            String str3 = this.f12633b.get(strArr[i]);
            if (str3 != null) {
                vx2.m53590f(locale, "US");
                str = str3.toLowerCase(locale);
                vx2.m53590f(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f12636e = strArr2;
        for (Map.Entry next : this.f12633b.entrySet()) {
            Locale locale2 = Locale.US;
            vx2.m53590f(locale2, "US");
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f12635d.containsKey(lowerCase2)) {
                vx2.m53590f(locale2, "US");
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f12635d;
                map3.put(lowerCase3, C6177b.m47362j(map3, lowerCase2));
            }
        }
        this.f12647p = new C2438f(this);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public void mo20865b(C2435c cVar) {
        C2436d q;
        vx2.m53591g(cVar, "observer");
        String[] p = mo20879p(cVar.mo20893a());
        ArrayList arrayList = new ArrayList(p.length);
        int length = p.length;
        int i = 0;
        while (i < length) {
            String str = p[i];
            Map<String, Integer> map = this.f12635d;
            Locale locale = Locale.US;
            vx2.m53590f(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] J0 = CollectionsKt___CollectionsKt.m47310J0(arrayList);
        C2436d dVar = new C2436d(cVar, J0, p);
        synchronized (this.f12643l) {
            q = this.f12643l.mo18386q(cVar, dVar);
        }
        if (q == null && this.f12641j.mo20890b(Arrays.copyOf(J0, J0.length))) {
            mo20884u();
        }
    }

    /* renamed from: c */
    public void mo20866c(C2435c cVar) {
        vx2.m53591g(cVar, "observer");
        mo20865b(new C2437e(this, cVar));
    }

    /* renamed from: d */
    public <T> LiveData<T> mo20867d(String[] strArr, boolean z, Callable<T> callable) {
        vx2.m53591g(strArr, "tableNames");
        vx2.m53591g(callable, "computeFunction");
        return this.f12642k.mo19554a(mo20886w(strArr), z, callable);
    }

    /* renamed from: e */
    public final boolean mo20868e() {
        if (!this.f12632a.mo10140z()) {
            return false;
        }
        if (!this.f12639h) {
            this.f12632a.mo10129o().getWritableDatabase();
        }
        if (!this.f12639h) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final SupportSQLiteStatement mo20869f() {
        return this.f12640i;
    }

    /* renamed from: g */
    public final RoomDatabase mo20870g() {
        return this.f12632a;
    }

    /* renamed from: h */
    public final ok5<C2435c, C2436d> mo20871h() {
        return this.f12643l;
    }

    /* renamed from: i */
    public final AtomicBoolean mo20872i() {
        return this.f12638g;
    }

    /* renamed from: j */
    public final Map<String, Integer> mo20873j() {
        return this.f12635d;
    }

    /* renamed from: k */
    public final void mo20874k(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "database");
        synchronized (this.f12646o) {
            if (!this.f12639h) {
                supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
                supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
                supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                mo20885v(supportSQLiteDatabase);
                this.f12640i = supportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                this.f12639h = true;
                r37 r37 = r37.f33317a;
            }
        }
    }

    /* renamed from: l */
    public final void mo20875l(String... strArr) {
        vx2.m53591g(strArr, "tables");
        synchronized (this.f12643l) {
            Iterator<T> it = this.f12643l.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                vx2.m53590f(entry, "(observer, wrapper)");
                C2436d dVar = (C2436d) entry.getValue();
                if (!((C2435c) entry.getKey()).mo20894b()) {
                    dVar.mo20898c(strArr);
                }
            }
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: m */
    public final void mo20876m() {
        synchronized (this.f12646o) {
            this.f12639h = false;
            this.f12641j.mo20892d();
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: n */
    public void mo20877n() {
        if (this.f12638g.compareAndSet(false, true)) {
            C3383tt ttVar = this.f12637f;
            if (ttVar != null) {
                ttVar.mo26548j();
            }
            this.f12632a.mo10130p().execute(this.f12647p);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: o */
    public void mo20878o(C2435c cVar) {
        C2436d r;
        vx2.m53591g(cVar, "observer");
        synchronized (this.f12643l) {
            r = this.f12643l.mo18387r(cVar);
        }
        if (r != null) {
            C2433b bVar = this.f12641j;
            int[] a = r.mo20896a();
            if (bVar.mo20891c(Arrays.copyOf(a, a.length))) {
                mo20884u();
            }
        }
    }

    /* renamed from: p */
    public final String[] mo20879p(String[] strArr) {
        Set b = my5.m48546b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f12634c;
            Locale locale = Locale.US;
            vx2.m53590f(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f12634c;
                vx2.m53590f(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                vx2.m53588d(set);
                b.addAll(set);
            } else {
                b.add(str);
            }
        }
        Object[] array = my5.m48545a(b).toArray(new String[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: q */
    public final void mo20880q(C3383tt ttVar) {
        vx2.m53591g(ttVar, "autoCloser");
        this.f12637f = ttVar;
        ttVar.mo26551m(new fy2(this));
    }

    /* renamed from: r */
    public final void mo20881r(Context context, String str, Intent intent) {
        vx2.m53591g(context, "context");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(intent, "serviceIntent");
        this.f12644m = new sz3(context, str, intent, this, this.f12632a.mo10130p());
    }

    /* renamed from: s */
    public final void mo20882s(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f12636e[i];
        for (String str2 : f12631r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f12630q.mo20888b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + i + " AND " + "invalidated" + " = 0" + "; END";
            vx2.m53590f(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    /* renamed from: t */
    public final void mo20883t(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.f12636e[i];
        for (String str2 : f12631r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f12630q.mo20888b(str, str2);
            vx2.m53590f(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    /* renamed from: u */
    public final void mo20884u() {
        if (this.f12632a.mo10140z()) {
            mo20885v(this.f12632a.mo10129o().getWritableDatabase());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: v */
    public final void mo20885v(SupportSQLiteDatabase supportSQLiteDatabase) {
        vx2.m53591g(supportSQLiteDatabase, "database");
        if (!supportSQLiteDatabase.inTransaction()) {
            try {
                Lock m = this.f12632a.mo10127m();
                m.lock();
                try {
                    synchronized (this.f12645n) {
                        int[] a = this.f12641j.mo20889a();
                        if (a != null) {
                            f12630q.mo20887a(supportSQLiteDatabase);
                            try {
                                int length = a.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = a[i];
                                    int i4 = i2 + 1;
                                    if (i3 == 1) {
                                        mo20882s(supportSQLiteDatabase, i2);
                                    } else if (i3 == 2) {
                                        mo20883t(supportSQLiteDatabase, i2);
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                supportSQLiteDatabase.setTransactionSuccessful();
                                supportSQLiteDatabase.endTransaction();
                                r37 r37 = r37.f33317a;
                                m.unlock();
                            } catch (Throwable th) {
                                supportSQLiteDatabase.endTransaction();
                                throw th;
                            }
                        }
                    }
                } finally {
                    m.unlock();
                }
            } catch (SQLiteException | IllegalStateException unused) {
            }
        }
    }

    /* renamed from: w */
    public final String[] mo20886w(String[] strArr) {
        String[] p = mo20879p(strArr);
        int length = p.length;
        int i = 0;
        while (i < length) {
            String str = p[i];
            Map<String, Integer> map = this.f12635d;
            Locale locale = Locale.US;
            vx2.m53590f(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                i++;
            } else {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return p;
    }
}
