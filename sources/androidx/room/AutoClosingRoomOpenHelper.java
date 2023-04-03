package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001f \bB\u0017\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\f\u001a\u00020\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, mo44877d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ltb1;", "", "enabled", "Lr37;", "setWriteAheadLoggingEnabled", "close", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegate", "Ltt;", "d", "Ltt;", "autoCloser", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "e", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Ltt;)V", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AutoClosingRoomOpenHelper.kt */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, tb1 {

    /* renamed from: a */
    public final SupportSQLiteOpenHelper f6856a;

    /* renamed from: d */
    public final C3383tt f6857d;

    /* renamed from: e */
    public final AutoClosingSupportSQLiteDatabase f6858e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\f8WX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR(\u0010&\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040#\u0018\u00010\"8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, mo44877d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lr37;", "a", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "beginTransaction", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "query", "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "execSQL", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "Ltt;", "Ltt;", "autoCloser", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "<init>", "(Ltt;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AutoClosingRoomOpenHelper.kt */
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {

        /* renamed from: a */
        public final C3383tt f6859a;

        public AutoClosingSupportSQLiteDatabase(C3383tt ttVar) {
            vx2.m53591g(ttVar, "autoCloser");
            this.f6859a = ttVar;
        }

        /* renamed from: a */
        public final void mo10016a() {
            this.f6859a.mo26545g(C1359x1a023a99.INSTANCE);
        }

        public void beginTransaction() {
            try {
                this.f6859a.mo26548j().beginTransaction();
            } catch (Throwable th) {
                this.f6859a.mo26544e();
                throw th;
            }
        }

        public void beginTransactionNonExclusive() {
            try {
                this.f6859a.mo26548j().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.f6859a.mo26544e();
                throw th;
            }
        }

        public void close() throws IOException {
            this.f6859a.mo26543d();
        }

        public SupportSQLiteStatement compileStatement(String str) {
            vx2.m53591g(str, "sql");
            return new AutoClosingSupportSqliteStatement(str, this.f6859a);
        }

        public void endTransaction() {
            if (this.f6859a.mo26546h() != null) {
                try {
                    SupportSQLiteDatabase h = this.f6859a.mo26546h();
                    vx2.m53588d(h);
                    h.endTransaction();
                } finally {
                    this.f6859a.mo26544e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
        }

        public void execSQL(String str) throws SQLException {
            vx2.m53591g(str, "sql");
            this.f6859a.mo26545g(new C1354x106d7261(str));
        }

        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.f6859a.mo26545g(C1353x882a29d5.INSTANCE);
        }

        public String getPath() {
            return (String) this.f6859a.mo26545g(C1358x4ec8cd3b.INSTANCE);
        }

        public boolean inTransaction() {
            if (this.f6859a.mo26546h() == null) {
                return false;
            }
            return ((Boolean) this.f6859a.mo26545g(C1356x5693171d.INSTANCE)).booleanValue();
        }

        public boolean isOpen() {
            SupportSQLiteDatabase h = this.f6859a.mo26546h();
            if (h == null) {
                return false;
            }
            return h.isOpen();
        }

        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f6859a.mo26545g(C1357x1aa74a04.INSTANCE)).booleanValue();
        }

        public Cursor query(String str) {
            vx2.m53591g(str, "query");
            try {
                return new C1352a(this.f6859a.mo26548j().query(str), this.f6859a);
            } catch (Throwable th) {
                this.f6859a.mo26544e();
                throw th;
            }
        }

        public void setTransactionSuccessful() {
            r37 r37;
            SupportSQLiteDatabase h = this.f6859a.mo26546h();
            if (h != null) {
                h.setTransactionSuccessful();
                r37 = r37.f33317a;
            } else {
                r37 = null;
            }
            if (r37 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        public void execSQL(String str, Object[] objArr) throws SQLException {
            vx2.m53591g(str, "sql");
            vx2.m53591g(objArr, "bindArgs");
            this.f6859a.mo26545g(new C1355x106d7262(str, objArr));
        }

        public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
            vx2.m53591g(supportSQLiteQuery, "query");
            try {
                return new C1352a(this.f6859a.mo26548j().query(supportSQLiteQuery), this.f6859a);
            } catch (Throwable th) {
                this.f6859a.mo26544e();
                throw th;
            }
        }

        public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
            vx2.m53591g(supportSQLiteQuery, "query");
            try {
                return new C1352a(this.f6859a.mo26548j().query(supportSQLiteQuery, cancellationSignal), this.f6859a);
            } catch (Throwable th) {
                this.f6859a.mo26544e();
                throw th;
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u000f\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J)\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0001H\u0002J\u001a\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u001bH\u0002R\u0014\u0010\u001f\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R(\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001b0#j\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b`$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006)"}, mo44877d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Lr37;", "close", "execute", "", "executeUpdateDelete", "", "executeInsert", "index", "bindNull", "value", "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "T", "Lkotlin/Function1;", "block", "d", "(Lrc2;)Ljava/lang/Object;", "supportSQLiteStatement", "c", "bindIndex", "", "e", "a", "Ljava/lang/String;", "sql", "Ltt;", "Ltt;", "autoCloser", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "binds", "<init>", "(Ljava/lang/String;Ltt;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AutoClosingRoomOpenHelper.kt */
    public static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {

        /* renamed from: a */
        public final String f6860a;

        /* renamed from: d */
        public final C3383tt f6861d;

        /* renamed from: e */
        public final ArrayList<Object> f6862e = new ArrayList<>();

        public AutoClosingSupportSqliteStatement(String str, C3383tt ttVar) {
            vx2.m53591g(str, "sql");
            vx2.m53591g(ttVar, "autoCloser");
            this.f6860a = str;
            this.f6861d = ttVar;
        }

        public void bindBlob(int i, byte[] bArr) {
            vx2.m53591g(bArr, "value");
            mo10041e(i, bArr);
        }

        public void bindDouble(int i, double d) {
            mo10041e(i, Double.valueOf(d));
        }

        public void bindLong(int i, long j) {
            mo10041e(i, Long.valueOf(j));
        }

        public void bindNull(int i) {
            mo10041e(i, (Object) null);
        }

        public void bindString(int i, String str) {
            vx2.m53591g(str, "value");
            mo10041e(i, str);
        }

        /* renamed from: c */
        public final void mo10038c(SupportSQLiteStatement supportSQLiteStatement) {
            Iterator<T> it = this.f6862e.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    ck0.m33072t();
                }
                Object obj = this.f6862e.get(i);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i2);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: d */
        public final <T> T mo10040d(rc2<? super SupportSQLiteStatement, ? extends T> rc2) {
            return this.f6861d.mo26545g(new C1362xdd6c1cf2(this, rc2));
        }

        /* renamed from: e */
        public final void mo10041e(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.f6862e.size() && (size = this.f6862e.size()) <= i2) {
                while (true) {
                    this.f6862e.add((Object) null);
                    if (size == i2) {
                        break;
                    }
                    size++;
                }
            }
            this.f6862e.set(i2, obj);
        }

        public void execute() {
            mo10040d(C1360xc356304d.INSTANCE);
        }

        public long executeInsert() {
            return ((Number) mo10040d(C1361xe79bbce6.INSTANCE)).longValue();
        }

        public int executeUpdateDelete() {
            return ((Number) mo10040d(C1363x7fb2e741.INSTANCE)).intValue();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010G\u001a\u00020\u0001\u0012\u0006\u0010K\u001a\u00020H¢\u0006\u0004\bL\u0010MJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0001J\t\u0010\t\u001a\u00020\u0007H\u0001J\u0019\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\t\u0010\f\u001a\u00020\u0002H\u0001J\u0019\u0010\u000e\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0001J\u0019\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0001J\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J6\u0010\u0012\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\r0\r \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\r0\r\u0018\u00010\u00110\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002H\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0011\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0001J\u0011\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0011\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\t\u0010\u001e\u001a\u00020\u0002H\u0001J\u0011\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\t\u0010$\u001a\u00020#H\u0001J\t\u0010%\u001a\u00020#H\u0001J\t\u0010&\u001a\u00020#H\u0001J\t\u0010'\u001a\u00020#H\u0001J\t\u0010(\u001a\u00020#H\u0001J\t\u0010)\u001a\u00020#H\u0001J\u0011\u0010*\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0011\u0010+\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\t\u0010,\u001a\u00020#H\u0001J\t\u0010-\u001a\u00020#H\u0001J\t\u0010.\u001a\u00020#H\u0001J\u0011\u0010/\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\t\u00100\u001a\u00020#H\u0001J\u0019\u00102\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0001J\u0019\u00104\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0001J\t\u00105\u001a\u00020#H\u0001J!\u00106\u001a\n \u0005*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0001J)\u00109\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u000107072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010808H\u0001J\u0019\u0010:\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0001J\u0019\u0010;\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0001J\b\u0010<\u001a\u00020\u0007H\u0016J\u001e\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u0002072\f\u0010?\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\b\u0010A\u001a\u000208H\u0017J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0017H\u0017R\u0014\u0010G\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, mo44877d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$a;", "Landroid/database/Cursor;", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "Lr37;", "copyStringToBuffer", "deactivate", "", "getBlob", "getColumnCount", "", "getColumnIndex", "getColumnIndexOrThrow", "getColumnName", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "Landroid/os/Bundle;", "getExtras", "", "getFloat", "getInt", "", "getLong", "getPosition", "", "getShort", "getString", "getType", "", "getWantsAllOnMoveCalls", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "requery", "respond", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "getNotificationUri", "getNotificationUris", "extras", "setExtras", "a", "Landroid/database/Cursor;", "delegate", "Ltt;", "d", "Ltt;", "autoCloser", "<init>", "(Landroid/database/Cursor;Ltt;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.room.AutoClosingRoomOpenHelper$a */
    /* compiled from: AutoClosingRoomOpenHelper.kt */
    public static final class C1352a implements Cursor {

        /* renamed from: a */
        public final Cursor f6863a;

        /* renamed from: d */
        public final C3383tt f6864d;

        public C1352a(Cursor cursor, C3383tt ttVar) {
            vx2.m53591g(cursor, "delegate");
            vx2.m53591g(ttVar, "autoCloser");
            this.f6863a = cursor;
            this.f6864d = ttVar;
        }

        public void close() {
            this.f6863a.close();
            this.f6864d.mo26544e();
        }

        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f6863a.copyStringToBuffer(i, charArrayBuffer);
        }

        public void deactivate() {
            this.f6863a.deactivate();
        }

        public byte[] getBlob(int i) {
            return this.f6863a.getBlob(i);
        }

        public int getColumnCount() {
            return this.f6863a.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f6863a.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f6863a.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i) {
            return this.f6863a.getColumnName(i);
        }

        public String[] getColumnNames() {
            return this.f6863a.getColumnNames();
        }

        public int getCount() {
            return this.f6863a.getCount();
        }

        public double getDouble(int i) {
            return this.f6863a.getDouble(i);
        }

        public Bundle getExtras() {
            return this.f6863a.getExtras();
        }

        public float getFloat(int i) {
            return this.f6863a.getFloat(i);
        }

        public int getInt(int i) {
            return this.f6863a.getInt(i);
        }

        public long getLong(int i) {
            return this.f6863a.getLong(i);
        }

        public Uri getNotificationUri() {
            return ce6.m11844a(this.f6863a);
        }

        public List<Uri> getNotificationUris() {
            return he6.m18801a(this.f6863a);
        }

        public int getPosition() {
            return this.f6863a.getPosition();
        }

        public short getShort(int i) {
            return this.f6863a.getShort(i);
        }

        public String getString(int i) {
            return this.f6863a.getString(i);
        }

        public int getType(int i) {
            return this.f6863a.getType(i);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f6863a.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f6863a.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f6863a.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f6863a.isClosed();
        }

        public boolean isFirst() {
            return this.f6863a.isFirst();
        }

        public boolean isLast() {
            return this.f6863a.isLast();
        }

        public boolean isNull(int i) {
            return this.f6863a.isNull(i);
        }

        public boolean move(int i) {
            return this.f6863a.move(i);
        }

        public boolean moveToFirst() {
            return this.f6863a.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f6863a.moveToLast();
        }

        public boolean moveToNext() {
            return this.f6863a.moveToNext();
        }

        public boolean moveToPosition(int i) {
            return this.f6863a.moveToPosition(i);
        }

        public boolean moveToPrevious() {
            return this.f6863a.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f6863a.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f6863a.registerDataSetObserver(dataSetObserver);
        }

        public boolean requery() {
            return this.f6863a.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f6863a.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            vx2.m53591g(bundle, "extras");
            ee6.m16083a(this.f6863a, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f6863a.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List<? extends Uri> list) {
            vx2.m53591g(contentResolver, "cr");
            vx2.m53591g(list, "uris");
            he6.m18802b(this.f6863a, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f6863a.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f6863a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper, C3383tt ttVar) {
        vx2.m53591g(supportSQLiteOpenHelper, "delegate");
        vx2.m53591g(ttVar, "autoCloser");
        this.f6856a = supportSQLiteOpenHelper;
        this.f6857d = ttVar;
        ttVar.mo26549k(getDelegate());
        this.f6858e = new AutoClosingSupportSQLiteDatabase(ttVar);
    }

    public void close() {
        this.f6858e.close();
    }

    public String getDatabaseName() {
        return this.f6856a.getDatabaseName();
    }

    public SupportSQLiteOpenHelper getDelegate() {
        return this.f6856a;
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        this.f6858e.mo10016a();
        return this.f6858e;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f6856a.setWriteAheadLoggingEnabled(z);
    }
}
