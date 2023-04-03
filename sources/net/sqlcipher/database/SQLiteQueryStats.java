package net.sqlcipher.database;

public class SQLiteQueryStats {
    public long largestIndividualRowSize;
    public long totalQueryResultSize;

    public SQLiteQueryStats(long j, long j2) {
        this.totalQueryResultSize = j;
        this.largestIndividualRowSize = j2;
    }

    public long getLargestIndividualRowSize() {
        return this.largestIndividualRowSize;
    }

    public long getTotalQueryResultSize() {
        return this.totalQueryResultSize;
    }
}
