package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.onesignal.influence.domain.OSInfluenceChannel;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, mo44877d2 = {"Lfe4;", "", "Landroid/database/sqlite/SQLiteDatabase;", "db", "Lr37;", "b", "c", "a", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: fe4 */
/* compiled from: OSOutcomeTableProvider.kt */
public final class fe4 {
    /* renamed from: a */
    public final void mo42585a(SQLiteDatabase sQLiteDatabase) {
        vx2.m53591g(sQLiteDatabase, "db");
        String str = "_id,name" + "," + "notification_id";
        String str2 = "_id,name" + "," + "channel_influence_id";
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + str2 + ")" + " SELECT " + str + " FROM " + "cached_unique_outcome_notification" + ";");
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE cached_unique_outcome SET channel_type = '");
            sb.append(OSInfluenceChannel.NOTIFICATION.toString());
            sb.append("';");
            sQLiteDatabase.execSQL(sb.toString());
            sQLiteDatabase.execSQL("DROP TABLE " + "cached_unique_outcome_notification" + ';');
        } catch (SQLiteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    /* renamed from: b */
    public final void mo42586b(SQLiteDatabase sQLiteDatabase) {
        vx2.m53591g(sQLiteDatabase, "db");
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(" + "_id,session,notification_ids,name,timestamp" + ");");
            sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT " + "_id,session,notification_ids,name,timestamp" + " FROM outcome;");
            sQLiteDatabase.execSQL("DROP TABLE outcome;");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome (" + "_id,session,notification_ids,name,timestamp" + ", weight) SELECT " + "_id,session,notification_ids,name,timestamp" + ", 0 FROM outcome_backup;");
            sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
        } catch (SQLiteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    /* renamed from: c */
    public final void mo42587c(SQLiteDatabase sQLiteDatabase) {
        vx2.m53591g(sQLiteDatabase, "db");
        String str = "_id,name,timestamp,notification_ids,weight" + "," + "session";
        String str2 = "_id,name,timestamp,notification_ids,weight" + "," + "notification_influence_type";
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO " + "outcome_aux" + ";");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome(" + str2 + ")" + " SELECT " + str + " FROM " + "outcome_aux" + ";");
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE ");
            sb.append("outcome_aux");
            sb.append(';');
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLiteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }
}
