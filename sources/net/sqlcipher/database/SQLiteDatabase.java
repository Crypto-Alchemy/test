package net.sqlcipher.database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import net.sqlcipher.CrossProcessCursorWrapper;
import net.sqlcipher.Cursor;
import net.sqlcipher.CursorWrapper;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DatabaseUtils;
import net.sqlcipher.SQLException;
import net.sqlcipher.database.SQLiteDebug;

public class SQLiteDatabase extends SQLiteClosable implements SupportSQLiteDatabase {
    private static final String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    public static final String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static final String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final String SQLCIPHER_ANDROID_VERSION = "4.5.3";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final String TAG = "Database";
    private static WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private static int sQueryLogTimeInMillis = 0;
    private int mCacheFullWarnings;
    public Map<String, SQLiteCompiledSql> mCompiledQueries;
    private final DatabaseErrorHandler mErrorHandler;
    private CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private String mLastSqlStatement;
    private final ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    public long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private String mPath;
    private String mPathForLogs;
    private WeakHashMap<SQLiteClosable, Object> mPrograms;
    private final int mSlowQueryThreshold;
    private Throwable mStackTrace;
    private final Map<String, SyncUpdateInfo> mSyncUpdateInfo;
    public int mTempTableSequence;
    private String mTimeClosed;
    private String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private SQLiteTransactionListener mTransactionListener;

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface LibraryLoader {
        void loadLibraries(String... strArr);
    }

    public enum SQLiteDatabaseTransactionType {
        Deferred,
        Immediate,
        Exclusive
    }

    public static class SyncUpdateInfo {
        public String deletedTable;
        public String foreignKey;
        public String masterTable;

        public SyncUpdateInfo(String str, String str2, String str3) {
            this.masterTable = str;
            this.deletedTable = str2;
            this.foreignKey = str3;
        }
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, (SQLiteDatabaseHook) null);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void beginTransactionWithListenerInternal(net.sqlcipher.database.SQLiteTransactionListener r4, net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType r5) {
        /*
            r3 = this;
            r3.lockForced()
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0066
            java.util.concurrent.locks.ReentrantLock r0 = r3.mLock     // Catch:{ all -> 0x0061 }
            int r0 = r0.getHoldCount()     // Catch:{ all -> 0x0061 }
            r1 = 1
            if (r0 <= r1) goto L_0x001f
            boolean r4 = r3.mInnerTransactionIsSuccessful     // Catch:{ all -> 0x0061 }
            if (r4 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String r4 = "Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x001f:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Exclusive     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r5 != r0) goto L_0x002a
            java.lang.String r5 = "BEGIN EXCLUSIVE;"
            r3.execSQL(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x003d
        L_0x002a:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Immediate     // Catch:{ all -> 0x0061 }
            if (r5 != r0) goto L_0x0034
            java.lang.String r5 = "BEGIN IMMEDIATE;"
            r3.execSQL(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x003d
        L_0x0034:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Deferred     // Catch:{ all -> 0x0061 }
            if (r5 != r0) goto L_0x0051
            java.lang.String r5 = "BEGIN DEFERRED;"
            r3.execSQL(r5)     // Catch:{ all -> 0x0061 }
        L_0x003d:
            r3.mTransactionListener = r4     // Catch:{ all -> 0x0061 }
            r3.mTransactionIsSuccessful = r1     // Catch:{ all -> 0x0061 }
            r3.mInnerTransactionIsSuccessful = r2     // Catch:{ all -> 0x0061 }
            if (r4 == 0) goto L_0x0050
            r4.onBegin()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r4 = move-exception
            java.lang.String r5 = "ROLLBACK;"
            r3.execSQL(r5)     // Catch:{ all -> 0x0061 }
            throw r4     // Catch:{ all -> 0x0061 }
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r4 = "%s is an unsupported transaction type"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0061 }
            r0[r2] = r5     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = java.lang.String.format(r4, r0)     // Catch:{ all -> 0x0061 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r4 = move-exception
            r3.unlockForced()
            throw r4
        L_0x0066:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "database not open"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.beginTransactionWithListenerInternal(net.sqlcipher.database.SQLiteTransactionListener, net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType):void");
    }

    private void checkLockHoldTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.mLockAcquiredWallTime;
        int i = (j > 2000 ? 1 : (j == 2000 ? 0 : -1));
        if ((i < 0 && !Log.isLoggable(TAG, 2) && elapsedRealtime - this.mLastLockMessageTime < 20000) || j <= 300) {
            return;
        }
        if (((int) ((Debug.threadCpuTimeNanos() - this.mLockAcquiredThreadTime) / 1000000)) > 100 || i > 0) {
            this.mLastLockMessageTime = elapsedRealtime;
            boolean z = SQLiteDebug.DEBUG_SQL_STATEMENTS;
        }
    }

    private void closeClosable() {
        deallocCachedSqlStatements();
        for (Map.Entry<SQLiteClosable, Object> key : this.mPrograms.entrySet()) {
            SQLiteClosable sQLiteClosable = (SQLiteClosable) key.getKey();
            if (sQLiteClosable != null) {
                sQLiteClosable.onAllReferencesReleasedFromContainer();
            }
        }
    }

    private boolean containsNull(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        for (char c : cArr) {
            if (c == 0) {
                return true;
            }
        }
        return false;
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, String str) {
        return openDatabase(MEMORY, str == null ? null : str.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    private native void dbclose();

    private native void dbopen(String str, int i);

    private void deallocCachedSqlStatements() {
        synchronized (this.mCompiledQueries) {
            for (SQLiteCompiledSql releaseSqlStatement : this.mCompiledQueries.values()) {
                releaseSqlStatement.releaseSqlStatement();
            }
            this.mCompiledQueries.clear();
        }
    }

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    public static String findEditTable(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
                return str.substring(0, indexOf);
            }
            if (indexOf2 <= 0) {
                return str;
            }
            if (indexOf2 < indexOf || indexOf < 0) {
                return str.substring(0, indexOf2);
            }
            return str;
        }
        throw new IllegalStateException("Invalid tables");
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    public static byte[] getBytes(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ByteBuffer encode = Charset.forName(KEY_ENCODING).encode(CharBuffer.wrap(cArr));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }

    public static char[] getChars(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        CharBuffer decode = Charset.forName(KEY_ENCODING).decode(ByteBuffer.wrap(bArr));
        char[] cArr = new char[decode.limit()];
        decode.get(cArr);
        return cArr;
    }

    public static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        int i;
        String str;
        int i2;
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            SQLiteDatabase next = it.next();
            if (next != null && next.isOpen()) {
                int native_getDbLookaside = next.native_getDbLookaside();
                String path = next.getPath();
                int lastIndexOf = path.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    i = lastIndexOf + 1;
                } else {
                    i = 0;
                }
                String substring = path.substring(i);
                ArrayList<Pair<String, String>> attachedDbs = getAttachedDbs(next);
                if (attachedDbs != null) {
                    for (int i3 = 0; i3 < attachedDbs.size(); i3++) {
                        Pair pair = attachedDbs.get(i3);
                        long pragmaVal = getPragmaVal(next, ((String) pair.first) + ".page_count;");
                        if (i3 == 0) {
                            str = substring;
                        } else {
                            String str2 = "  (attached) " + ((String) pair.first);
                            if (((String) pair.second).trim().length() > 0) {
                                int lastIndexOf2 = ((String) pair.second).lastIndexOf("/");
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(" : ");
                                String str3 = (String) pair.second;
                                if (lastIndexOf2 != -1) {
                                    i2 = lastIndexOf2 + 1;
                                } else {
                                    i2 = 0;
                                }
                                sb.append(str3.substring(i2));
                                str2 = sb.toString();
                            }
                            str = str2;
                            native_getDbLookaside = 0;
                        }
                        if (pragmaVal > 0) {
                            arrayList.add(new SQLiteDebug.DbStats(str, pragmaVal, next.getPageSize(), native_getDbLookaside));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private String getPathForLogs() {
        String str = this.mPathForLogs;
        if (str != null) {
            return str;
        }
        String str2 = this.mPath;
        if (str2 == null) {
            return null;
        }
        if (str2.indexOf(64) == -1) {
            this.mPathForLogs = this.mPath;
        } else {
            this.mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
        }
        return this.mPathForLogs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long getPragmaVal(net.sqlcipher.database.SQLiteDatabase r4, java.lang.String r5) {
        /*
            boolean r0 = r4.isOpen()
            if (r0 != 0) goto L_0x0009
            r4 = 0
            return r4
        L_0x0009:
            r0 = 0
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "PRAGMA "
            r2.append(r3)     // Catch:{ all -> 0x002b }
            r2.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x002b }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x002b }
            long r4 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0028 }
            r1.close()
            return r4
        L_0x0028:
            r4 = move-exception
            r0 = r1
            goto L_0x002c
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.close()
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPragmaVal(net.sqlcipher.database.SQLiteDatabase, java.lang.String):long");
    }

    private Pair<Boolean, String> getResultFromPragma(String str) {
        Pair<Boolean, String> pair = new Pair<>(Boolean.FALSE, "");
        Cursor rawQuery = rawQuery(str, new Object[0]);
        if (rawQuery == null) {
            return pair;
        }
        if (rawQuery.moveToFirst()) {
            pair = new Pair<>(Boolean.TRUE, rawQuery.getString(0));
        }
        rawQuery.close();
        return pair;
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
    }

    /* access modifiers changed from: private */
    public native void key(byte[] bArr) throws SQLException;

    private void keyDatabase(SQLiteDatabaseHook sQLiteDatabaseHook, Runnable runnable) {
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.preKey(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.postKey(this);
        }
        if (SQLiteDebug.DEBUG_SQL_CACHE) {
            this.mTimeOpened = getTime();
        }
        try {
            Cursor rawQuery = rawQuery("select count(*) from sqlite_master;", new String[0]);
            if (rawQuery != null) {
                rawQuery.moveToFirst();
                rawQuery.getInt(0);
                rawQuery.close();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public native void key_mutf8(char[] cArr) throws SQLException;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.zip.ZipInputStream} */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085 A[SYNTHETIC, Splitter:B:45:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d A[Catch:{ IOException -> 0x0089 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadICUData(android.content.Context r5, java.io.File r6) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "icu"
            r0.<init>(r6, r1)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "icudt46l.dat"
            r6.<init>(r0, r1)
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            if (r2 != 0) goto L_0x0018
            r0.mkdirs()     // Catch:{ Exception -> 0x006f, all -> 0x006c }
        L_0x0018:
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            if (r0 != 0) goto L_0x0053
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            java.lang.String r2 = "icudt46l.zip"
            java.io.InputStream r5 = r5.open(r2)     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x006f, all -> 0x006c }
            r0.getNextEntry()     // Catch:{ Exception -> 0x0051 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0051 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0051 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x004c, all -> 0x0046 }
        L_0x0039:
            int r2 = r0.read(r1)     // Catch:{ Exception -> 0x004c, all -> 0x0046 }
            if (r2 <= 0) goto L_0x0044
            r3 = 0
            r5.write(r1, r3, r2)     // Catch:{ Exception -> 0x004c, all -> 0x0046 }
            goto L_0x0039
        L_0x0044:
            r1 = r0
            goto L_0x0054
        L_0x0046:
            r6 = move-exception
            r1 = r0
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x0083
        L_0x004c:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L_0x0071
        L_0x0051:
            r5 = move-exception
            goto L_0x0071
        L_0x0053:
            r5 = r1
        L_0x0054:
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r5 = move-exception
            goto L_0x0065
        L_0x005c:
            if (r5 == 0) goto L_0x006b
            r5.flush()     // Catch:{ IOException -> 0x005a }
            r5.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006b
        L_0x0065:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x006b:
            return
        L_0x006c:
            r5 = move-exception
            r6 = r1
            goto L_0x0083
        L_0x006f:
            r5 = move-exception
            r0 = r1
        L_0x0071:
            boolean r2 = r6.exists()     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x007a
            r6.delete()     // Catch:{ all -> 0x0080 }
        L_0x007a:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0080 }
            r6.<init>(r5)     // Catch:{ all -> 0x0080 }
            throw r6     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r5 = move-exception
            r6 = r1
            r1 = r0
        L_0x0083:
            if (r1 == 0) goto L_0x008b
            r1.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008b
        L_0x0089:
            r5 = move-exception
            goto L_0x0094
        L_0x008b:
            if (r6 == 0) goto L_0x009a
            r6.flush()     // Catch:{ IOException -> 0x0089 }
            r6.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x009a
        L_0x0094:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x009a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.loadICUData(android.content.Context, java.io.File):void");
    }

    public static synchronized void loadLibs(Context context) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir());
        }
    }

    private void lockForced() {
        this.mLock.lock();
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
        }
    }

    private native int native_getDbLookaside();

    private native void native_rawExecSQL(String str);

    private native int native_status(int i, boolean z);

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i) {
        return openDatabase(str, str2, cursorFactory, i, (SQLiteDatabaseHook) null);
    }

    private void openDatabaseInternal(char[] cArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        openDatabaseInternal(getBytes(cArr), sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    private native void rekey(byte[] bArr) throws SQLException;

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    private void unlockForced() {
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        long j2;
        if (this.mLock.getQueueLength() == 0) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            return false;
        }
        setTransactionSuccessful();
        SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
        endTransaction();
        if (!z || !isDbLockedByCurrentThread()) {
            if (j > 0) {
                while (j > 0) {
                    if (j < 1000) {
                        j2 = j;
                    } else {
                        j2 = 1000;
                    }
                    try {
                        Thread.sleep(j2);
                    } catch (InterruptedException unused) {
                        Thread.interrupted();
                    }
                    j -= 1000;
                    if (this.mLock.getQueueLength() == 0) {
                        break;
                    }
                }
            }
            beginTransactionWithListener(sQLiteTransactionListener);
            return true;
        }
        throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
    }

    public void addSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.put(sQLiteClosable, (Object) null);
        } finally {
            unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToCompiledQueries(java.lang.String r4, net.sqlcipher.database.SQLiteCompiledSql r5) {
        /*
            r3 = this;
            int r0 = r3.mMaxSqlCacheSize
            if (r0 != 0) goto L_0x0007
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            return
        L_0x0007:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0030 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0030 }
            net.sqlcipher.database.SQLiteCompiledSql r1 = (net.sqlcipher.database.SQLiteCompiledSql) r1     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0016:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0030 }
            int r1 = r1.size()     // Catch:{ all -> 0x0030 }
            int r2 = r3.mMaxSqlCacheSize     // Catch:{ all -> 0x0030 }
            if (r1 != r2) goto L_0x0027
            int r4 = r3.mCacheFullWarnings     // Catch:{ all -> 0x0030 }
            int r4 = r4 + 1
            r3.mCacheFullWarnings = r4     // Catch:{ all -> 0x0030 }
            goto L_0x002e
        L_0x0027:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0030 }
            r1.put(r4, r5)     // Catch:{ all -> 0x0030 }
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.addToCompiledQueries(java.lang.String, net.sqlcipher.database.SQLiteCompiledSql):void");
    }

    public void beginTransaction() {
        beginTransactionWithListener((SQLiteTransactionListener) null);
    }

    public void beginTransactionNonExclusive() {
        beginTransactionWithListenerInternal((SQLiteTransactionListener) null, SQLiteDatabaseTransactionType.Immediate);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Exclusive);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Immediate);
    }

    public void changePassword(String str) throws SQLiteException {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (str != null) {
            byte[] bytes = getBytes(str.toCharArray());
            rekey(bytes);
            Arrays.fill(bytes, (byte) 0);
        }
    }

    public void close() {
        if (isOpen()) {
            lock();
            try {
                closeClosable();
                onAllReferencesReleased();
            } finally {
                unlock();
            }
        }
    }

    public int delete(String str, String str2, String[] strArr) {
        return delete(str, str2, (Object[]) strArr);
    }

    public void disableWriteAheadLogging() {
        if (!inTransaction()) {
            rawExecSQL("PRAGMA journal_mode = DELETE;");
            return;
        }
        throw new IllegalStateException("Write Ahead Logging cannot be disabled while in a transaction");
    }

    public boolean enableWriteAheadLogging() {
        if (!inTransaction()) {
            ArrayList<Pair<String, String>> attachedDbs = getAttachedDbs(this);
            if ((attachedDbs != null && attachedDbs.size() > 1) || isReadOnly() || getPath().equals(MEMORY)) {
                return false;
            }
            rawExecSQL("PRAGMA journal_mode = WAL;");
            return true;
        }
        throw new IllegalStateException("Write Ahead Logging cannot be enabled while in a transaction");
    }

    public void endTransaction() {
        RuntimeException e;
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (this.mLock.isHeldByCurrentThread()) {
            try {
                if (this.mInnerTransactionIsSuccessful) {
                    this.mInnerTransactionIsSuccessful = false;
                } else {
                    this.mTransactionIsSuccessful = false;
                }
                if (this.mLock.getHoldCount() != 1) {
                    this.mTransactionListener = null;
                    unlockForced();
                    return;
                }
                SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
                if (sQLiteTransactionListener != null) {
                    if (this.mTransactionIsSuccessful) {
                        sQLiteTransactionListener.onCommit();
                    } else {
                        sQLiteTransactionListener.onRollback();
                    }
                }
                e = null;
                if (this.mTransactionIsSuccessful) {
                    execSQL(COMMIT_SQL);
                } else {
                    try {
                        execSQL("ROLLBACK;");
                        if (e != null) {
                            throw e;
                        }
                    } catch (SQLException unused) {
                    }
                }
                this.mTransactionListener = null;
                unlockForced();
            } catch (RuntimeException e2) {
                e = e2;
                this.mTransactionIsSuccessful = false;
            } catch (Throwable th) {
                this.mTransactionListener = null;
                unlockForced();
                throw th;
            }
        } else {
            throw new IllegalStateException("no transaction pending");
        }
    }

    public /* bridge */ /* synthetic */ void execPerConnectionSQL(String str, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        ie6.m19580a(this, str, objArr);
    }

    public void execSQL(String str) throws SQLException {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (isOpen()) {
                native_execSQL(str);
                unlock();
                return;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public void finalize() {
        if (isOpen()) {
            closeClosable();
            onAllReferencesReleased();
        }
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return getAttachedDbs(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r3.mNumCacheHits++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r3.mNumCacheMisses++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.database.SQLiteCompiledSql getCompiledStatementForSql(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            int r1 = r3.mMaxSqlCacheSize     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x000c
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS     // Catch:{ all -> 0x002b }
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r4
        L_0x000c:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x002b }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x002b }
            net.sqlcipher.database.SQLiteCompiledSql r4 = (net.sqlcipher.database.SQLiteCompiledSql) r4     // Catch:{ all -> 0x002b }
            r1 = 1
            if (r4 == 0) goto L_0x0019
            r2 = r1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0023
            int r0 = r3.mNumCacheHits
            int r0 = r0 + r1
            r3.mNumCacheHits = r0
            goto L_0x0028
        L_0x0023:
            int r0 = r3.mNumCacheMisses
            int r0 = r0 + r1
            r3.mNumCacheMisses = r0
        L_0x0028:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            return r4
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getCompiledStatementForSql(java.lang.String):net.sqlcipher.database.SQLiteCompiledSql");
    }

    public synchronized int getMaxSqlCacheSize() {
        return this.mMaxSqlCacheSize;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getMaximumSize() {
        /*
            r7 = this;
            r7.lock()
            r0 = 0
            boolean r1 = r7.isOpen()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0023
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "PRAGMA max_page_count;"
            r1.<init>(r7, r2)     // Catch:{ all -> 0x002b }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0021 }
            long r4 = r7.getPageSize()     // Catch:{ all -> 0x0021 }
            long r2 = r2 * r4
            r1.close()
            r7.unlock()
            return r2
        L_0x0021:
            r0 = move-exception
            goto L_0x002f
        L_0x0023:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch:{ all -> 0x002b }
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()
        L_0x0034:
            r7.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getMaximumSize():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getPageSize() {
        /*
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x001e
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "PRAGMA page_size;"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0026 }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x001c }
            r1.close()
            r5.unlock()
            return r2
        L_0x001c:
            r0 = move-exception
            goto L_0x002a
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPageSize():long");
    }

    public final String getPath() {
        return this.mPath;
    }

    public SQLiteQueryStats getQueryStats(String str, Object[] objArr) {
        try {
            execSQL(String.format("CREATE TABLE tempstat AS %s", new Object[]{str}), objArr);
            Cursor rawQuery = rawQuery("SELECT sum(payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery == null) {
                return new SQLiteQueryStats(0, 0);
            }
            rawQuery.moveToFirst();
            long j = rawQuery.getLong(0);
            rawQuery.close();
            Cursor rawQuery2 = rawQuery("SELECT max(mx_payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery2 == null) {
                return new SQLiteQueryStats(j, 0);
            }
            rawQuery2.moveToFirst();
            long j2 = rawQuery2.getLong(0);
            rawQuery2.close();
            execSQL("DROP TABLE tempstat;");
            return new SQLiteQueryStats(j, j2);
        } catch (SQLiteException e) {
            execSQL("DROP TABLE IF EXISTS tempstat;");
            throw e;
        }
    }

    public Map<String, String> getSyncedTables() {
        HashMap hashMap;
        synchronized (this.mSyncUpdateInfo) {
            hashMap = new HashMap();
            for (String next : this.mSyncUpdateInfo.keySet()) {
                String str = this.mSyncUpdateInfo.get(next).deletedTable;
                if (str != null) {
                    hashMap.put(next, str);
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getVersion() {
        /*
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "PRAGMA user_version;"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0027 }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x001d }
            int r0 = (int) r2
            r1.close()
            r5.unlock()
            return r0
        L_0x001d:
            r0 = move-exception
            goto L_0x002b
        L_0x001f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch:{ all -> 0x0027 }
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getVersion():int");
    }

    public boolean inTransaction() {
        if (this.mLock.getHoldCount() > 0) {
            return true;
        }
        return false;
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLException unused) {
            return -1;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.util.Set<java.util.Map$Entry<java.lang.String, java.lang.Object>>} */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long insertWithOnConflict(java.lang.String r5, java.lang.String r6, android.content.ContentValues r7, int r8) {
        /*
            r4 = this;
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L_0x00e4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 152(0x98, float:2.13E-43)
            r0.<init>(r1)
            java.lang.String r1 = "INSERT"
            r0.append(r1)
            java.lang.String[] r1 = CONFLICT_VALUES
            r8 = r1[r8]
            r0.append(r8)
            java.lang.String r8 = " INTO "
            r0.append(r8)
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r8 = 40
            r5.<init>(r8)
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L_0x006a
            int r3 = r7.size()
            if (r3 <= 0) goto L_0x006a
            java.util.Set r6 = r7.valueSet()
            java.util.Iterator r7 = r6.iterator()
            r0.append(r8)
            r8 = r1
        L_0x003e:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0064
            if (r8 == 0) goto L_0x004e
            java.lang.String r8 = ", "
            r0.append(r8)
            r5.append(r8)
        L_0x004e:
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
            r8 = 63
            r5.append(r8)
            r8 = 1
            goto L_0x003e
        L_0x0064:
            r7 = 41
            r0.append(r7)
            goto L_0x0089
        L_0x006a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "("
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ") "
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.append(r6)
            java.lang.String r6 = "NULL"
            r5.append(r6)
            r6 = r2
        L_0x0089:
            java.lang.String r7 = " VALUES("
            r0.append(r7)
            r0.append(r5)
            java.lang.String r5 = ");"
            r0.append(r5)
            r4.lock()
            java.lang.String r5 = r0.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            net.sqlcipher.database.SQLiteStatement r2 = r4.compileStatement((java.lang.String) r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            if (r6 == 0) goto L_0x00bd
            int r5 = r6.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
        L_0x00ab:
            if (r1 >= r5) goto L_0x00bd
            java.lang.Object r7 = r6.next()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            int r1 = r1 + 1
            java.lang.Object r7 = r7.getValue()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r2, r1, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            goto L_0x00ab
        L_0x00bd:
            r2.execute()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            int r5 = r4.lastChangeCount()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            if (r5 <= 0) goto L_0x00cb
            long r5 = r4.lastInsertRow()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            goto L_0x00cd
        L_0x00cb:
            r5 = -1
        L_0x00cd:
            r2.close()
            r4.unlock()
            return r5
        L_0x00d4:
            r5 = move-exception
            goto L_0x00db
        L_0x00d6:
            r5 = move-exception
            r4.onCorruption()     // Catch:{ all -> 0x00d4 }
            throw r5     // Catch:{ all -> 0x00d4 }
        L_0x00db:
            if (r2 == 0) goto L_0x00e0
            r2.close()
        L_0x00e0:
            r4.unlock()
            throw r5
        L_0x00e4:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "database not open"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.insertWithOnConflict(java.lang.String, java.lang.String, android.content.ContentValues, int):long");
    }

    public boolean isDatabaseIntegrityOk() {
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA integrity_check;");
        if (((Boolean) resultFromPragma.first).booleanValue()) {
            return ((String) resultFromPragma.second).equals("ok");
        }
        return ((Boolean) resultFromPragma.first).booleanValue();
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mLock.isHeldByCurrentThread();
    }

    public boolean isDbLockedByOtherThreads() {
        if (this.mLock.isHeldByCurrentThread() || !this.mLock.isLocked()) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean isExecPerConnectionSQLSupported() {
        return ie6.m19581b(this);
    }

    public boolean isInCompiledSqlCache(String str) {
        boolean containsKey;
        synchronized (this.mCompiledQueries) {
            containsKey = this.mCompiledQueries.containsKey(str);
        }
        return containsKey;
    }

    public boolean isOpen() {
        if (this.mNativeHandle != 0) {
            return true;
        }
        return false;
    }

    public boolean isReadOnly() {
        if ((this.mFlags & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isWriteAheadLoggingEnabled() {
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA journal_mode;");
        if (((Boolean) resultFromPragma.first).booleanValue()) {
            return ((String) resultFromPragma.second).equals("wal");
        }
        return ((Boolean) resultFromPragma.first).booleanValue();
    }

    public native int lastChangeCount();

    public native long lastInsertRow();

    public void lock() {
        if (this.mLockingEnabled) {
            this.mLock.lock();
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            }
        }
    }

    public void markTableSyncable(String str, String str2) {
        if (isOpen()) {
            markTableSyncable(str, "_id", str, str2);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public native void native_execSQL(String str) throws SQLException;

    public native void native_setLocale(String str, int i);

    public boolean needUpgrade(int i) {
        if (i > getVersion()) {
            return true;
        }
        return false;
    }

    public void onAllReferencesReleased() {
        if (isOpen()) {
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    public void onCorruption() {
        this.mErrorHandler.onCorruption(this);
    }

    public void purgeFromCompiledSqlCache(String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return queryWithFactory((CursorFactory) null, z, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (isOpen()) {
            CursorFactory cursorFactory2 = cursorFactory;
            String[] strArr3 = strArr2;
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str));
        }
        throw new IllegalStateException("database not open");
    }

    public void rawExecSQL(String str) {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (isOpen()) {
                native_rawExecSQL(str);
                unlock();
                return;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return rawQueryWithFactory((CursorFactory) null, str, strArr, (String) null);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        if (isOpen()) {
            long j = 0;
            int i = -1;
            if (this.mSlowQueryThreshold != -1) {
                j = System.currentTimeMillis();
            }
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2);
            if (cursorFactory == null) {
                try {
                    cursorFactory = this.mFactory;
                } catch (Throwable th) {
                    if (this.mSlowQueryThreshold != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        if (currentTimeMillis >= ((long) this.mSlowQueryThreshold)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("query (");
                            sb.append(currentTimeMillis);
                            sb.append(" ms): ");
                            sb.append(sQLiteDirectCursorDriver.toString());
                            sb.append(", args are <redacted>, count is ");
                            sb.append(-1);
                        }
                    }
                    throw th;
                }
            }
            Cursor query = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
            if (this.mSlowQueryThreshold != -1) {
                if (query != null) {
                    i = query.getCount();
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                if (currentTimeMillis2 >= ((long) this.mSlowQueryThreshold)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("query (");
                    sb2.append(currentTimeMillis2);
                    sb2.append(" ms): ");
                    sb2.append(sQLiteDirectCursorDriver.toString());
                    sb2.append(", args are <redacted>, count is ");
                    sb2.append(i);
                }
            }
            return new CrossProcessCursorWrapper(query);
        }
        throw new IllegalStateException("database not open");
    }

    public void removeSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.remove(sQLiteClosable);
        } finally {
            unlock();
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLException unused) {
            return -1;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public void resetCompiledSqlCache() {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.clear();
        }
    }

    public void rowUpdated(String str, long j) {
        SyncUpdateInfo syncUpdateInfo;
        synchronized (this.mSyncUpdateInfo) {
            syncUpdateInfo = this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            execSQL("UPDATE " + syncUpdateInfo.masterTable + " SET _sync_dirty=1 WHERE _id=(SELECT " + syncUpdateInfo.foreignKey + " FROM " + str + " WHERE _id=" + j + ")");
        }
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
        String str;
        if (!inTransaction()) {
            Object[] objArr = new Object[1];
            if (z) {
                str = "ON";
            } else {
                str = "OFF";
            }
            objArr[0] = str;
            execSQL(String.format("PRAGMA foreign_keys = %s;", objArr));
            return;
        }
        throw new IllegalStateException("Foreign key constraints may not be changed while in a transaction");
    }

    public void setLocale(Locale locale) {
        lock();
        try {
            native_setLocale(locale.toString(), this.mFlags);
        } finally {
            unlock();
        }
    }

    public void setLockingEnabled(boolean z) {
        this.mLockingEnabled = z;
    }

    public synchronized void setMaxSqlCacheSize(int i) {
        if (i > 250 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 250");
        } else if (i >= this.mMaxSqlCacheSize) {
            this.mMaxSqlCacheSize = i;
        } else {
            throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long setMaximumSize(long r8) {
        /*
            r7 = this;
            r7.lock()
            r0 = 0
            boolean r1 = r7.isOpen()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x003f
            long r1 = r7.getPageSize()     // Catch:{ all -> 0x0047 }
            long r3 = r8 / r1
            long r8 = r8 % r1
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x001a
            r8 = 1
            long r3 = r3 + r8
        L_0x001a:
            net.sqlcipher.database.SQLiteStatement r8 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r9.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "PRAGMA max_page_count = "
            r9.append(r5)     // Catch:{ all -> 0x0047 }
            r9.append(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0047 }
            r8.<init>(r7, r9)     // Catch:{ all -> 0x0047 }
            long r3 = r8.simpleQueryForLong()     // Catch:{ all -> 0x003c }
            long r3 = r3 * r1
            r8.close()
            r7.unlock()
            return r3
        L_0x003c:
            r9 = move-exception
            r0 = r8
            goto L_0x0048
        L_0x003f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0047 }
            java.lang.String r9 = "database not open"
            r8.<init>(r9)     // Catch:{ all -> 0x0047 }
            throw r8     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r9 = move-exception
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.close()
        L_0x004d:
            r7.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.setMaximumSize(long):long");
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public void setTransactionSuccessful() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (!this.mLock.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        } else if (!this.mInnerTransactionIsSuccessful) {
            this.mInnerTransactionIsSuccessful = true;
        } else {
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        }
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    public int status(int i, boolean z) {
        return native_status(i, z);
    }

    public void unlock() {
        if (this.mLockingEnabled) {
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                checkLockHoldTime();
            }
            this.mLock.unlock();
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(CONFLICT_VALUES[i]);
        sb.append(str);
        sb.append(" SET ");
        Set<Map.Entry<String, Object>> valueSet = contentValues.valueSet();
        Iterator<Map.Entry<String, Object>> it = valueSet.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next().getKey());
            sb.append("=?");
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        SQLiteProgram sQLiteProgram = null;
        lock();
        try {
            if (isOpen()) {
                SQLiteStatement compileStatement = compileStatement(sb.toString());
                int size = valueSet.size();
                Iterator<Map.Entry<String, Object>> it2 = valueSet.iterator();
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    DatabaseUtils.bindObjectToProgram(compileStatement, i2, it2.next().getValue());
                    i2++;
                }
                if (strArr != null) {
                    for (String bindString : strArr) {
                        compileStatement.bindString(i2, bindString);
                        i2++;
                    }
                }
                compileStatement.execute();
                int lastChangeCount = lastChangeCount();
                compileStatement.close();
                unlock();
                return lastChangeCount;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (SQLException e2) {
            throw e2;
        } catch (Throwable th) {
            if (sQLiteProgram != null) {
                sQLiteProgram.close();
            }
            unlock();
            throw th;
        }
    }

    @Deprecated
    public boolean yieldIfContended() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(false, -1);
    }

    public boolean yieldIfContendedSafely() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, -1);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, char[] cArr) {
        return openDatabase(MEMORY, cArr, cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    private static ArrayList<Pair<String, String>> getAttachedDbs(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma database_list;", (String[]) null);
        while (rawQuery.moveToNext()) {
            arrayList.add(new Pair(rawQuery.getString(1), rawQuery.getString(2)));
        }
        rawQuery.close();
        return arrayList;
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cArr, cursorFactory, i, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file == null ? null : file.getPath(), str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public void beginTransactionWithListener(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListener((SQLiteTransactionListener) new SQLiteTransactionListener() {
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public void beginTransactionWithListenerNonExclusive(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerNonExclusive((SQLiteTransactionListener) new SQLiteTransactionListener() {
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public SQLiteStatement compileStatement(String str) throws SQLException {
        lock();
        try {
            if (isOpen()) {
                return new SQLiteStatement(this, str);
            }
            throw new IllegalStateException("database not open");
        } finally {
            unlock();
        }
    }

    public int delete(String str, String str2, Object[] objArr) {
        String str3;
        lock();
        SQLiteProgram sQLiteProgram = null;
        try {
            if (isOpen()) {
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM ");
                sb.append(str);
                if (!TextUtils.isEmpty(str2)) {
                    str3 = " WHERE " + str2;
                } else {
                    str3 = "";
                }
                sb.append(str3);
                SQLiteStatement compileStatement = compileStatement(sb.toString());
                if (objArr != null) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        DatabaseUtils.bindObjectToProgram(compileStatement, i2, objArr[i]);
                        i = i2;
                    }
                }
                compileStatement.execute();
                int lastChangeCount = lastChangeCount();
                compileStatement.close();
                unlock();
                return lastChangeCount;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (Throwable th) {
            if (sQLiteProgram != null) {
                sQLiteProgram.close();
            }
            unlock();
            throw th;
        }
    }

    public long insert(String str, int i, ContentValues contentValues) throws android.database.SQLException {
        return insertWithOnConflict(str, (String) null, contentValues, i);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, (String) null);
    }

    /* JADX INFO: finally extract failed */
    public Cursor rawQuery(String str, Object[] objArr) {
        if (isOpen()) {
            long j = 0;
            int i = -1;
            if (this.mSlowQueryThreshold != -1) {
                j = System.currentTimeMillis();
            }
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, (String) null);
            try {
                Cursor query = sQLiteDirectCursorDriver.query(this.mFactory, objArr);
                if (this.mSlowQueryThreshold != -1) {
                    if (query != null) {
                        i = query.getCount();
                    }
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= ((long) this.mSlowQueryThreshold)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("query (");
                        sb.append(currentTimeMillis);
                        sb.append(" ms): ");
                        sb.append(sQLiteDirectCursorDriver.toString());
                        sb.append(", args are <redacted>, count is ");
                        sb.append(i);
                    }
                }
                return new CrossProcessCursorWrapper(query);
            } catch (Throwable th) {
                if (this.mSlowQueryThreshold != -1) {
                    long currentTimeMillis2 = System.currentTimeMillis() - j;
                    if (currentTimeMillis2 >= ((long) this.mSlowQueryThreshold)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("query (");
                        sb2.append(currentTimeMillis2);
                        sb2.append(" ms): ");
                        sb2.append(sQLiteDirectCursorDriver.toString());
                        sb2.append(", args are <redacted>, count is ");
                        sb2.append(-1);
                    }
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            strArr[i2] = objArr[i2].toString();
        }
        return updateWithOnConflict(str, contentValues, str2, strArr, i);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    public static synchronized void loadLibs(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, file, new LibraryLoader() {
                public void loadLibraries(String... strArr) {
                    for (String loadLibrary : strArr) {
                        System.loadLibrary(loadLibrary);
                    }
                }
            });
        }
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    private void openDatabaseInternal(final byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        dbopen(this.mPath, this.mFlags);
        boolean z = false;
        try {
            keyDatabase(sQLiteDatabaseHook, new Runnable() {
                public void run() {
                    byte[] bArr = bArr;
                    if (bArr != null && bArr.length > 0) {
                        SQLiteDatabase.this.key(bArr);
                    }
                }
            });
            return;
        } catch (RuntimeException e) {
            final char[] chars = getChars(bArr);
            if (containsNull(chars)) {
                keyDatabase(sQLiteDatabaseHook, new Runnable() {
                    public void run() {
                        if (bArr != null) {
                            SQLiteDatabase.this.key_mutf8(chars);
                        }
                    }
                });
                if (bArr != null && bArr.length > 0) {
                    rekey(bArr);
                }
                if (chars == null) {
                    return;
                }
                if (chars.length > 0) {
                    Arrays.fill(chars, 0);
                    return;
                }
                return;
            }
            throw e;
        } catch (Throwable th) {
            th = th;
        }
        if (z) {
            dbclose();
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
        }
        throw th;
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public boolean yieldIfContendedSafely(long j) {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, j);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public void markTableSyncable(String str, String str2, String str3) {
        if (isOpen()) {
            markTableSyncable(str, str2, str3, (String) null);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public android.database.Cursor query(String str) {
        return rawQuery(str, (String[]) null);
    }

    public SQLiteDatabase(String str, byte[] bArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(bArr, sQLiteDatabaseHook);
    }

    public static synchronized void loadLibs(Context context, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir(), libraryLoader);
        }
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public android.database.Cursor query(String str, Object[] objArr) {
        return rawQuery(str, objArr);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, getBytes(cArr), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public void changePassword(char[] cArr) throws SQLiteException {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (cArr != null) {
            byte[] bytes = getBytes(cArr);
            rekey(bytes);
            Arrays.fill(bytes, (byte) 0);
        }
    }

    public android.database.Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (CancellationSignal) null);
    }

    private SQLiteDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new ReentrantLock(true);
        this.mLockAcquiredWallTime = 0;
        this.mLockAcquiredThreadTime = 0;
        this.mLastLockMessageTime = 0;
        this.mLastSqlStatement = null;
        this.mNativeHandle = 0;
        this.mTempTableSequence = 0;
        this.mPathForLogs = null;
        this.mCompiledQueries = new HashMap();
        this.mMaxSqlCacheSize = MAX_SQL_CACHE_SIZE;
        this.mTimeOpened = null;
        this.mTimeClosed = null;
        this.mStackTrace = null;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new HashMap();
        if (str != null) {
            this.mFlags = i;
            this.mPath = str;
            this.mSlowQueryThreshold = -1;
            this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.mFactory = cursorFactory;
            this.mPrograms = new WeakHashMap<>();
            this.mErrorHandler = databaseErrorHandler;
            return;
        }
        throw new IllegalArgumentException("path should not be null");
    }

    public static synchronized void loadLibs(Context context, File file, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            libraryLoader.loadLibraries("sqlcipher");
        }
    }

    /* JADX INFO: finally extract failed */
    private void markTableSyncable(String str, String str2, String str3, String str4) {
        lock();
        try {
            native_execSQL("SELECT _sync_dirty FROM " + str3 + " LIMIT 0");
            native_execSQL("SELECT " + str2 + " FROM " + str + " LIMIT 0");
            unlock();
            SyncUpdateInfo syncUpdateInfo = new SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, bArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public android.database.Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        String d = supportSQLiteQuery.mo10285d();
        SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, d, (String) null);
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this, d, 0, new Object[supportSQLiteQuery.mo10284c()]);
        supportSQLiteQuery.mo10286e(sQLiteQuery);
        return new CrossProcessCursorWrapper(new SQLiteCursor(this, sQLiteDirectCursorDriver, (String) null, sQLiteQuery));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r2, byte[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6, net.sqlcipher.DatabaseErrorHandler r7) {
        /*
            if (r7 == 0) goto L_0x0003
            goto L_0x0008
        L_0x0003:
            net.sqlcipher.DefaultDatabaseErrorHandler r7 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r7.<init>()
        L_0x0008:
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.<init>((java.lang.String) r2, (net.sqlcipher.database.SQLiteDatabase.CursorFactory) r4, (int) r5, (net.sqlcipher.DatabaseErrorHandler) r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.openDatabaseInternal((byte[]) r3, (net.sqlcipher.database.SQLiteDatabaseHook) r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0013 }
            goto L_0x001e
        L_0x0012:
            r1 = r0
        L_0x0013:
            r7.onCorruption(r1)
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase
            r1.<init>((java.lang.String) r2, (net.sqlcipher.database.SQLiteDatabase.CursorFactory) r4, (int) r5, (net.sqlcipher.DatabaseErrorHandler) r7)
            r1.openDatabaseInternal((byte[]) r3, (net.sqlcipher.database.SQLiteDatabaseHook) r6)
        L_0x001e:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            if (r3 == 0) goto L_0x0025
            r1.enableSqlTracing(r2)
        L_0x0025:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME
            if (r3 == 0) goto L_0x002c
            r1.enableSqlProfiling(r2)
        L_0x002c:
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r2 = sActiveDatabases
            monitor-enter(r2)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r3 = sActiveDatabases     // Catch:{ all -> 0x0036 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return r1
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabase(java.lang.String, byte[], net.sqlcipher.database.SQLiteDatabase$CursorFactory, int, net.sqlcipher.database.SQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler):net.sqlcipher.database.SQLiteDatabase");
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file, str, cursorFactory, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null);
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
        if (objArr != null) {
            SystemClock.uptimeMillis();
            lock();
            SQLiteProgram sQLiteProgram = null;
            try {
                if (isOpen()) {
                    SQLiteStatement compileStatement = compileStatement(str);
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        DatabaseUtils.bindObjectToProgram(compileStatement, i2, objArr[i]);
                        i = i2;
                    }
                    compileStatement.execute();
                    compileStatement.close();
                    unlock();
                    return;
                }
                throw new IllegalStateException("database not open");
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                if (sQLiteProgram != null) {
                    sQLiteProgram.close();
                }
                unlock();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Empty bindArgs");
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory) {
        return openDatabase(str, bArr, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
    }

    public Cursor rawQuery(String str, String[] strArr, int i, int i2) {
        CursorWrapper cursorWrapper = (CursorWrapper) rawQueryWithFactory((CursorFactory) null, str, strArr, (String) null);
        ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
        return cursorWrapper;
    }
}
