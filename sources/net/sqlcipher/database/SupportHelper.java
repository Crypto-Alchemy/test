package net.sqlcipher.database;

import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import net.sqlcipher.database.SQLiteDatabase;

public class SupportHelper implements SupportSQLiteOpenHelper {
    private final boolean clearPassphrase;
    private byte[] passphrase;
    private SQLiteOpenHelper standardHelper;

    public SupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        SQLiteDatabase.loadLibs(configuration.f6977a);
        this.passphrase = bArr;
        this.clearPassphrase = z;
        final SupportSQLiteOpenHelper.Configuration configuration2 = configuration;
        this.standardHelper = new SQLiteOpenHelper(configuration.f6977a, configuration.f6978b, (SQLiteDatabase.CursorFactory) null, configuration.f6979c.f6988a, sQLiteDatabaseHook) {
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                configuration2.f6979c.mo10277b(sQLiteDatabase);
            }

            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                configuration2.f6979c.mo10279d(sQLiteDatabase);
            }

            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                configuration2.f6979c.mo10280e(sQLiteDatabase, i, i2);
            }

            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                configuration2.f6979c.mo10281f(sQLiteDatabase);
            }

            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                configuration2.f6979c.mo10282g(sQLiteDatabase, i, i2);
            }
        };
    }

    public void close() {
        this.standardHelper.close();
    }

    public String getDatabaseName() {
        return this.standardHelper.getDatabaseName();
    }

    public SupportSQLiteDatabase getReadableDatabase() {
        return getWritableDatabase();
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        try {
            SQLiteDatabase writableDatabase = this.standardHelper.getWritableDatabase(this.passphrase);
            if (this.clearPassphrase && this.passphrase != null) {
                int i = 0;
                while (true) {
                    byte[] bArr = this.passphrase;
                    if (i >= bArr.length) {
                        break;
                    }
                    bArr[i] = 0;
                    i++;
                }
            }
            return writableDatabase;
        } catch (SQLiteException e) {
            byte[] bArr2 = this.passphrase;
            if (bArr2 != null) {
                boolean z = true;
                for (byte b : bArr2) {
                    if (!z || b != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    throw new IllegalStateException("The passphrase appears to be cleared. This happens by default the first time you use the factory to open a database, so we can remove the cleartext passphrase from memory. If you close the database yourself, please use a fresh SupportFactory to reopen it. If something else (e.g., Room) closed the database, and you cannot control that, use SupportFactory boolean constructor option to opt out of the automatic password clearing step. See the project README for more information.", e);
                }
            }
            throw e;
        }
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.standardHelper.setWriteAheadLoggingEnabled(z);
    }
}
