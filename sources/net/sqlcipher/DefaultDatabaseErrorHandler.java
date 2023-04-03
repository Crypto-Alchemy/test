package net.sqlcipher;

import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private final String TAG = DefaultDatabaseErrorHandler.class.getSimpleName();

    private void deleteDatabaseFile(String str) {
        if (!str.equalsIgnoreCase(SQLiteDatabase.MEMORY) && str.trim().length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("deleting the database file: ");
            sb.append(str);
            try {
                new File(str).delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delete failed: ");
                sb2.append(e.getMessage());
            }
        }
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("Corruption reported by sqlite on database, deleting: ");
        sb.append(sQLiteDatabase.getPath());
        if (sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }
}
