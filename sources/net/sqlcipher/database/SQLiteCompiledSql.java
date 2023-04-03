package net.sqlcipher.database;

class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    public SQLiteDatabase mDatabase;
    private boolean mInUse = false;
    private String mSqlStmt = null;
    public long nHandle = 0;
    public long nStatement = 0;

    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase.isOpen()) {
            this.mDatabase = sQLiteDatabase;
            this.mSqlStmt = str;
            this.nHandle = sQLiteDatabase.mNativeHandle;
            compile(str, true);
            return;
        }
        throw new IllegalStateException("database " + sQLiteDatabase.getPath() + " already closed");
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        } else if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    private final native void native_compile(String str);

    private final native void native_finalize();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean acquire() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mInUse     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r4)
            return r0
        L_0x0008:
            r0 = 1
            r4.mInUse = r0     // Catch:{ all -> 0x0025 }
            boolean r1 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r1.<init>()     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "Acquired DbObj (id#"
            r1.append(r2)     // Catch:{ all -> 0x0025 }
            long r2 = r4.nStatement     // Catch:{ all -> 0x0025 }
            r1.append(r2)     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = ") from DB cache"
            r1.append(r2)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r4)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCompiledSql.acquire():boolean");
    }

    public void finalize() throws Throwable {
        try {
            if (this.nStatement != 0) {
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("** warning ** Finalized DbObj (id#");
                    sb.append(this.nStatement);
                    sb.append(")");
                }
                releaseSqlStatement();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized void release() {
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            StringBuilder sb = new StringBuilder();
            sb.append("Released DbObj (id#");
            sb.append(this.nStatement);
            sb.append(") back to DB cache");
        }
        this.mInUse = false;
    }

    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                StringBuilder sb = new StringBuilder();
                sb.append("closed and deallocated DbObj (id#");
                sb.append(this.nStatement);
                sb.append(")");
            }
            native_finalize();
            this.nStatement = 0;
        }
    }
}
