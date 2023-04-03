package p000;

import android.database.Cursor;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.kl6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\"\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0017"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Lkl6;", "f", "", "Lkl6$c;", "c", "Landroid/database/Cursor;", "cursor", "", "Lkl6$d;", "b", "", "Lkl6$a;", "a", "Lkl6$e;", "e", "name", "", "unique", "d", "room-runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ll6 */
/* compiled from: TableInfo.kt */
public final class ll6 {
    /* renamed from: a */
    public static final Map<String, kl6.C2707a> m21526a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Throwable th;
        boolean z;
        Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (query.getColumnCount() <= 0) {
                Map<String, kl6.C2707a> i = C6177b.m47361i();
                lh0.m47807a(query, (Throwable) null);
                return i;
            }
            int columnIndex = query.getColumnIndex(PublicResolver.FUNC_NAME);
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("notnull");
            int columnIndex4 = query.getColumnIndex("pk");
            int columnIndex5 = query.getColumnIndex("dflt_value");
            Map c = ao3.m31891c();
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                String string2 = query.getString(columnIndex2);
                if (query.getInt(columnIndex3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = query.getInt(columnIndex4);
                String string3 = query.getString(columnIndex5);
                vx2.m53590f(string, PublicResolver.FUNC_NAME);
                vx2.m53590f(string2, "type");
                kl6.C2707a aVar = r11;
                kl6.C2707a aVar2 = new kl6.C2707a(string, string2, z, i2, string3, 2);
                c.put(string, aVar);
            }
            Map<String, kl6.C2707a> b = ao3.m31890b(c);
            lh0.m47807a(query, (Throwable) null);
            return b;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            lh0.m47807a(query, th);
            throw th3;
        }
    }

    /* renamed from: b */
    public static final List<kl6.C2711d> m21527b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c = bk0.m32596c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            vx2.m53590f(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            vx2.m53590f(string2, "cursor.getString(toColumnIndex)");
            c.add(new kl6.C2711d(i, i2, string, string2));
        }
        return CollectionsKt___CollectionsKt.m47303C0(bk0.m32594a(c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        p000.lh0.m47807a(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set<p000.kl6.C2710c> m21528c(androidx.sqlite.p006db.SupportSQLiteDatabase r14, java.lang.String r15) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA foreign_key_list(`"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = "`)"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            android.database.Cursor r14 = r14.query((java.lang.String) r15)
            r15 = 0
            java.lang.String r0 = "id"
            int r0 = r14.getColumnIndex(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "seq"
            int r1 = r14.getColumnIndex(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "table"
            int r2 = r14.getColumnIndex(r2)     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "on_delete"
            int r3 = r14.getColumnIndex(r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = "on_update"
            int r4 = r14.getColumnIndex(r4)     // Catch:{ all -> 0x00d2 }
            java.util.List r5 = m21527b(r14)     // Catch:{ all -> 0x00d2 }
            r6 = -1
            r14.moveToPosition(r6)     // Catch:{ all -> 0x00d2 }
            java.util.Set r6 = p000.my5.m48546b()     // Catch:{ all -> 0x00d2 }
        L_0x0045:
            boolean r7 = r14.moveToNext()     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00ca
            int r7 = r14.getInt(r1)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x0052
            goto L_0x0045
        L_0x0052:
            int r7 = r14.getInt(r0)     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r12.<init>()     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r13.<init>()     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r8.<init>()     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0069:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r10 == 0) goto L_0x0085
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00d2 }
            r11 = r10
            kl6$d r11 = (p000.kl6.C2711d) r11     // Catch:{ all -> 0x00d2 }
            int r11 = r11.mo22401e()     // Catch:{ all -> 0x00d2 }
            if (r11 != r7) goto L_0x007e
            r11 = 1
            goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            if (r11 == 0) goto L_0x0069
            r8.add(r10)     // Catch:{ all -> 0x00d2 }
            goto L_0x0069
        L_0x0085:
            java.util.Iterator r7 = r8.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0089:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r8 == 0) goto L_0x00a4
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x00d2 }
            kl6$d r8 = (p000.kl6.C2711d) r8     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = r8.mo22400d()     // Catch:{ all -> 0x00d2 }
            r12.add(r9)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r8.mo22402f()     // Catch:{ all -> 0x00d2 }
            r13.add(r8)     // Catch:{ all -> 0x00d2 }
            goto L_0x0089
        L_0x00a4:
            kl6$c r7 = new kl6$c     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = r14.getString(r2)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "cursor.getString(tableColumnIndex)"
            p000.vx2.m53590f(r9, r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r10 = r14.getString(r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "cursor.getString(onDeleteColumnIndex)"
            p000.vx2.m53590f(r10, r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r11 = r14.getString(r4)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "cursor.getString(onUpdateColumnIndex)"
            p000.vx2.m53590f(r11, r8)     // Catch:{ all -> 0x00d2 }
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d2 }
            r6.add(r7)     // Catch:{ all -> 0x00d2 }
            goto L_0x0045
        L_0x00ca:
            java.util.Set r0 = p000.my5.m48545a(r6)     // Catch:{ all -> 0x00d2 }
            p000.lh0.m47807a(r14, r15)
            return r0
        L_0x00d2:
            r15 = move-exception
            throw r15     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            p000.lh0.m47807a(r14, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ll6.m21528c(androidx.sqlite.db.SupportSQLiteDatabase, java.lang.String):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        p000.lh0.m47807a(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        throw r14;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.kl6.C2712e m21529d(androidx.sqlite.p006db.SupportSQLiteDatabase r12, java.lang.String r13, boolean r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA index_xinfo(`"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = "`)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.database.Cursor r12 = r12.query((java.lang.String) r0)
            java.lang.String r0 = "seqno"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "cid"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "name"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "desc"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00a2 }
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x009e
            if (r1 == r5) goto L_0x009e
            if (r2 == r5) goto L_0x009e
            if (r3 != r5) goto L_0x003d
            goto L_0x009e
        L_0x003d:
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x00a2 }
            r5.<init>()     // Catch:{ all -> 0x00a2 }
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch:{ all -> 0x00a2 }
            r6.<init>()     // Catch:{ all -> 0x00a2 }
        L_0x0047:
            boolean r7 = r12.moveToNext()     // Catch:{ all -> 0x00a2 }
            if (r7 == 0) goto L_0x007b
            int r7 = r12.getInt(r1)     // Catch:{ all -> 0x00a2 }
            if (r7 >= 0) goto L_0x0054
            goto L_0x0047
        L_0x0054:
            int r7 = r12.getInt(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r8 = r12.getString(r2)     // Catch:{ all -> 0x00a2 }
            int r9 = r12.getInt(r3)     // Catch:{ all -> 0x00a2 }
            if (r9 <= 0) goto L_0x0065
            java.lang.String r9 = "DESC"
            goto L_0x0067
        L_0x0065:
            java.lang.String r9 = "ASC"
        L_0x0067:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00a2 }
            java.lang.String r11 = "columnName"
            p000.vx2.m53590f(r8, r11)     // Catch:{ all -> 0x00a2 }
            r5.put(r10, r8)     // Catch:{ all -> 0x00a2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00a2 }
            r6.put(r7, r9)     // Catch:{ all -> 0x00a2 }
            goto L_0x0047
        L_0x007b:
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "columnsMap.values"
            p000.vx2.m53590f(r0, r1)     // Catch:{ all -> 0x00a2 }
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r0)     // Catch:{ all -> 0x00a2 }
            java.util.Collection r1 = r6.values()     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "ordersMap.values"
            p000.vx2.m53590f(r1, r2)     // Catch:{ all -> 0x00a2 }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r1)     // Catch:{ all -> 0x00a2 }
            kl6$e r2 = new kl6$e     // Catch:{ all -> 0x00a2 }
            r2.<init>(r13, r14, r0, r1)     // Catch:{ all -> 0x00a2 }
            p000.lh0.m47807a(r12, r4)
            return r2
        L_0x009e:
            p000.lh0.m47807a(r12, r4)
            return r4
        L_0x00a2:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r14 = move-exception
            p000.lh0.m47807a(r12, r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ll6.m21529d(androidx.sqlite.db.SupportSQLiteDatabase, java.lang.String, boolean):kl6$e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        p000.lh0.m47807a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        throw r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set<p000.kl6.C2712e> m21530e(androidx.sqlite.p006db.SupportSQLiteDatabase r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "name"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PRAGMA index_list(`"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "`)"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.database.Cursor r10 = r9.query((java.lang.String) r10)
            int r1 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "origin"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "unique"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x0076 }
            r4 = -1
            r5 = 0
            if (r1 == r4) goto L_0x0072
            if (r2 == r4) goto L_0x0072
            if (r3 != r4) goto L_0x0035
            goto L_0x0072
        L_0x0035:
            java.util.Set r4 = p000.my5.m48546b()     // Catch:{ all -> 0x0076 }
        L_0x0039:
            boolean r6 = r10.moveToNext()     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = r10.getString(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = "c"
            boolean r6 = p000.vx2.m53586b(r7, r6)     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x004c
            goto L_0x0039
        L_0x004c:
            java.lang.String r6 = r10.getString(r1)     // Catch:{ all -> 0x0076 }
            int r7 = r10.getInt(r3)     // Catch:{ all -> 0x0076 }
            r8 = 1
            if (r7 != r8) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            p000.vx2.m53590f(r6, r0)     // Catch:{ all -> 0x0076 }
            kl6$e r6 = m21529d(r9, r6, r8)     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x0066
            p000.lh0.m47807a(r10, r5)
            return r5
        L_0x0066:
            r4.add(r6)     // Catch:{ all -> 0x0076 }
            goto L_0x0039
        L_0x006a:
            java.util.Set r9 = p000.my5.m48545a(r4)     // Catch:{ all -> 0x0076 }
            p000.lh0.m47807a(r10, r5)
            return r9
        L_0x0072:
            p000.lh0.m47807a(r10, r5)
            return r5
        L_0x0076:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            p000.lh0.m47807a(r10, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ll6.m21530e(androidx.sqlite.db.SupportSQLiteDatabase, java.lang.String):java.util.Set");
    }

    /* renamed from: f */
    public static final kl6 m21531f(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        vx2.m53591g(supportSQLiteDatabase, "database");
        vx2.m53591g(str, "tableName");
        return new kl6(str, m21526a(supportSQLiteDatabase, str), m21528c(supportSQLiteDatabase, str), m21530e(supportSQLiteDatabase, str));
    }
}
