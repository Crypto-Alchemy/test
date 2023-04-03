package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: fn5 */
/* compiled from: SchemaManager */
public final class fn5 extends SQLiteOpenHelper {

    /* renamed from: e */
    public static int f28904e = 4;

    /* renamed from: g */
    public static final C5844a f28905g;

    /* renamed from: k */
    public static final C5844a f28906k;

    /* renamed from: r */
    public static final C5844a f28907r;

    /* renamed from: s */
    public static final C5844a f28908s;

    /* renamed from: x */
    public static final List<C5844a> f28909x;

    /* renamed from: a */
    public final int f28910a;

    /* renamed from: d */
    public boolean f28911d = false;

    /* renamed from: fn5$a */
    /* compiled from: SchemaManager */
    public interface C5844a {
        /* renamed from: a */
        void mo29657a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        bn5 bn5 = new bn5();
        f28905g = bn5;
        cn5 cn5 = new cn5();
        f28906k = cn5;
        dn5 dn5 = new dn5();
        f28907r = dn5;
        en5 en5 = new en5();
        f28908s = en5;
        f28909x = Arrays.asList(new C5844a[]{bn5, cn5, dn5, en5});
    }

    public fn5(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f28910a = i;
    }

    /* renamed from: f */
    public static /* synthetic */ void m44344f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: g */
    public static /* synthetic */ void m44345g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: i */
    public static /* synthetic */ void m44347i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: e */
    public final void mo42614e(SQLiteDatabase sQLiteDatabase) {
        if (!this.f28911d) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: j */
    public final void mo42615j(SQLiteDatabase sQLiteDatabase, int i) {
        mo42614e(sQLiteDatabase);
        mo42616k(sQLiteDatabase, 0, i);
    }

    /* renamed from: k */
    public final void mo42616k(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C5844a> list = f28909x;
        if (i2 <= list.size()) {
            while (i < i2) {
                f28909x.get(i).mo29657a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f28911d = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        mo42615j(sQLiteDatabase, this.f28910a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        mo42615j(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        mo42614e(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mo42614e(sQLiteDatabase);
        mo42616k(sQLiteDatabase, i, i2);
    }
}
