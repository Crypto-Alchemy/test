package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: gm8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class gm8 extends SQLiteOpenHelper {

    /* renamed from: a */
    public final /* synthetic */ jm8 f29292a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gm8(jm8 jm8, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f29292a = jm8;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f29292a.f34342a.mo45237A().mo29670l().mo48769a("Opening the local database failed, dropping and recreating it");
            this.f29292a.f34342a.mo45274y();
            if (!this.f29292a.f34342a.mo45271q().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f29292a.f34342a.mo45237A().mo29670l().mo48770b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f29292a.f34342a.mo45237A().mo29670l().mo48770b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        q78.m50389b(this.f29292a.f34342a.mo45237A(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        q78.m50388a(this.f29292a.f34342a.mo45237A(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
