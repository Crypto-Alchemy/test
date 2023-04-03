package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.ak6;
import p000.mt1;

/* renamed from: jk5 */
/* compiled from: SQLiteEventStore */
public class jk5 implements du1, ak6 {

    /* renamed from: k */
    public static final qp1 f30514k = qp1.m50725b("proto");

    /* renamed from: a */
    public final fn5 f30515a;

    /* renamed from: d */
    public final ah0 f30516d;

    /* renamed from: e */
    public final ah0 f30517e;

    /* renamed from: g */
    public final eu1 f30518g;

    /* renamed from: jk5$b */
    /* compiled from: SQLiteEventStore */
    public interface C6106b<T, U> {
        U apply(T t);
    }

    /* renamed from: jk5$c */
    /* compiled from: SQLiteEventStore */
    public static class C6107c {

        /* renamed from: a */
        public final String f30519a;

        /* renamed from: b */
        public final String f30520b;

        public C6107c(String str, String str2) {
            this.f30519a = str;
            this.f30520b = str2;
        }
    }

    /* renamed from: jk5$d */
    /* compiled from: SQLiteEventStore */
    public interface C6108d<T> {
        /* renamed from: a */
        T mo29004a();
    }

    public jk5(ah0 ah0, ah0 ah02, eu1 eu1, fn5 fn5) {
        this.f30515a = fn5;
        this.f30516d = ah0;
        this.f30517e = ah02;
        this.f30518g = eu1;
    }

    /* renamed from: N */
    public static /* synthetic */ Object m46542N(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: O */
    public static /* synthetic */ SQLiteDatabase m46543O(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* renamed from: P */
    public static /* synthetic */ Long m46544P(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: Q */
    public static /* synthetic */ Long m46545Q(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ Boolean m46546S(hx6 hx6, SQLiteDatabase sQLiteDatabase) {
        Long C = mo44489C(sQLiteDatabase, hx6);
        if (C == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m46575y0(mo44500y().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{C.toString()}), new yj5());
    }

    /* renamed from: W */
    public static /* synthetic */ List m46547W(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(hx6.m45404a().mo43422b(cursor.getString(1)).mo43424d(fv4.m44433b(cursor.getInt(2))).mo43423c(m46567l0(cursor.getString(3))).mo43421a());
        }
        return arrayList;
    }

    /* renamed from: X */
    public static /* synthetic */ List m46548X(SQLiteDatabase sQLiteDatabase) {
        return (List) m46575y0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new hk5());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ List m46549Y(hx6 hx6, SQLiteDatabase sQLiteDatabase) {
        List<nn4> j0 = mo44494j0(sQLiteDatabase, hx6);
        return mo44492J(j0, mo44495k0(sQLiteDatabase, j0));
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ Object m46551b0(List list, hx6 hx6, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            mt1.C6257a k = mt1.m48451a().mo29767j(cursor.getString(1)).mo29766i(cursor.getLong(2)).mo29768k(cursor.getLong(3));
            if (z) {
                k.mo29765h(new jp1(m46573s0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo29765h(new jp1(m46573s0(cursor.getString(4)), mo44496o0(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo29764g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(nn4.m48896a(j, hx6, k.mo29761d()));
        }
        return null;
    }

    /* renamed from: c0 */
    public static /* synthetic */ Object m46553c0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C6107c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ Long m46556e0(hx6 hx6, mt1 mt1, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (mo44491I()) {
            return -1L;
        }
        long x = mo44499x(sQLiteDatabase, hx6);
        int e = this.f30518g.mo41724e();
        byte[] a = mt1.mo29754e().mo44554a();
        if (a.length <= e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(x));
        contentValues.put("transport_name", mt1.mo29758j());
        contentValues.put("timestamp_ms", Long.valueOf(mt1.mo29756f()));
        contentValues.put("uptime_ms", Long.valueOf(mt1.mo29759k()));
        contentValues.put("payload_encoding", mt1.mo29754e().mo44555b().mo47222a());
        contentValues.put("code", mt1.mo29753d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : mt1.mo45898i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(PublicResolver.FUNC_NAME, (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: g0 */
    public static /* synthetic */ byte[] m46559g0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: h0 */
    public static /* synthetic */ Object m46561h0(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: i0 */
    public static /* synthetic */ Object m46563i0(long j, hx6 hx6, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{hx6.mo43416b(), String.valueOf(fv4.m44432a(hx6.mo43418d()))}) < 1) {
            contentValues.put("backend_name", hx6.mo43416b());
            contentValues.put("priority", Integer.valueOf(fv4.m44432a(hx6.mo43418d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* renamed from: l0 */
    public static byte[] m46567l0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: s0 */
    public static qp1 m46573s0(String str) {
        if (str == null) {
            return f30514k;
        }
        return qp1.m50725b(str);
    }

    /* renamed from: x0 */
    public static String m46574x0(Iterable<nn4> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<nn4> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo43944c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: y0 */
    public static <T> T m46575y0(Cursor cursor, C6106b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: A */
    public final long mo44488A() {
        return mo44500y().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: C */
    public final Long mo44489C(SQLiteDatabase sQLiteDatabase, hx6 hx6) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{hx6.mo43416b(), String.valueOf(fv4.m44432a(hx6.mo43418d()))}));
        if (hx6.mo43417c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(hx6.mo43417c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m46575y0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new vj5());
    }

    /* renamed from: D */
    public void mo42052D(Iterable<nn4> iterable) {
        if (iterable.iterator().hasNext()) {
            mo44500y().compileStatement("DELETE FROM events WHERE _id in " + m46574x0(iterable)).execute();
        }
    }

    /* renamed from: E */
    public Iterable<nn4> mo42053E(hx6 hx6) {
        return (Iterable) mo44490G(new tj5(this, hx6));
    }

    /* renamed from: G */
    public <T> T mo44490G(C6106b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase y = mo44500y();
        y.beginTransaction();
        try {
            T apply = bVar.apply(y);
            y.setTransactionSuccessful();
            return apply;
        } finally {
            y.endTransaction();
        }
    }

    /* renamed from: I */
    public final boolean mo44491I() {
        if (mo44501z() * mo44488A() >= this.f30518g.mo41726f()) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final List<nn4> mo44492J(List<nn4> list, Map<Long, Set<C6107c>> map) {
        ListIterator<nn4> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            nn4 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo43944c()))) {
                mt1.C6257a l = next.mo43943b().mo45899l();
                for (C6107c cVar : map.get(Long.valueOf(next.mo43944c()))) {
                    l.mo45902c(cVar.f30519a, cVar.f30520b);
                }
                listIterator.set(nn4.m48896a(next.mo43944c(), next.mo43945d(), l.mo29761d()));
            }
        }
        return list;
    }

    /* renamed from: K0 */
    public long mo42054K0(hx6 hx6) {
        return ((Long) m46575y0(mo44500y().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{hx6.mo43416b(), String.valueOf(fv4.m44432a(hx6.mo43418d()))}), new ck5())).longValue();
    }

    /* renamed from: R */
    public Iterable<hx6> mo42055R() {
        return (Iterable) mo44490G(new rj5());
    }

    /* renamed from: X0 */
    public nn4 mo42056X0(hx6 hx6, mt1 mt1) {
        xk3.m54421b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", hx6.mo43418d(), mt1.mo29758j(), hx6.mo43416b());
        long longValue = ((Long) mo44490G(new fk5(this, hx6, mt1))).longValue();
        if (longValue < 1) {
            return null;
        }
        return nn4.m48896a(longValue, hx6, mt1);
    }

    /* renamed from: a */
    public <T> T mo29005a(ak6.C3818a<T> aVar) {
        SQLiteDatabase y = mo44500y();
        mo44498v(y);
        try {
            T execute = aVar.execute();
            y.setTransactionSuccessful();
            return execute;
        } finally {
            y.endTransaction();
        }
    }

    public void close() {
        this.f30515a.close();
    }

    /* renamed from: i1 */
    public void mo42057i1(hx6 hx6, long j) {
        mo44490G(new sj5(j, hx6));
    }

    /* renamed from: j0 */
    public final List<nn4> mo44494j0(SQLiteDatabase sQLiteDatabase, hx6 hx6) {
        ArrayList arrayList = new ArrayList();
        Long C = mo44489C(sQLiteDatabase, hx6);
        if (C == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m46575y0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{C.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f30518g.mo41723d())), new xj5(this, arrayList, hx6));
        return arrayList;
    }

    /* renamed from: k0 */
    public final Map<Long, Set<C6107c>> mo44495k0(SQLiteDatabase sQLiteDatabase, List<nn4> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo43944c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m46575y0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", PublicResolver.FUNC_NAME, "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new wj5(hashMap));
        return hashMap;
    }

    /* renamed from: n0 */
    public boolean mo42058n0(hx6 hx6) {
        return ((Boolean) mo44490G(new ik5(this, hx6))).booleanValue();
    }

    /* renamed from: o */
    public int mo42059o() {
        return ((Integer) mo44490G(new gk5(this.f30516d.mo28970a() - this.f30518g.mo41722c()))).intValue();
    }

    /* renamed from: o0 */
    public final byte[] mo44496o0(long j) {
        return (byte[]) m46575y0(mo44500y().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), new zj5());
    }

    /* renamed from: q0 */
    public final <T> T mo44497q0(C6108d<T> dVar, C6106b<Throwable, T> bVar) {
        long a = this.f30517e.mo28970a();
        while (true) {
            try {
                return dVar.mo29004a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f30517e.mo28970a() >= ((long) this.f30518g.mo41721b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: t0 */
    public void mo42060t0(Iterable<nn4> iterable) {
        if (iterable.iterator().hasNext()) {
            mo44490G(new uj5("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m46574x0(iterable)));
        }
    }

    /* renamed from: v */
    public final void mo44498v(SQLiteDatabase sQLiteDatabase) {
        mo44497q0(new dk5(sQLiteDatabase), new ek5());
    }

    /* renamed from: x */
    public final long mo44499x(SQLiteDatabase sQLiteDatabase, hx6 hx6) {
        Long C = mo44489C(sQLiteDatabase, hx6);
        if (C != null) {
            return C.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", hx6.mo43416b());
        contentValues.put("priority", Integer.valueOf(fv4.m44432a(hx6.mo43418d())));
        contentValues.put("next_request_ms", 0);
        if (hx6.mo43417c() != null) {
            contentValues.put("extras", Base64.encodeToString(hx6.mo43417c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* renamed from: y */
    public SQLiteDatabase mo44500y() {
        fn5 fn5 = this.f30515a;
        Objects.requireNonNull(fn5);
        return (SQLiteDatabase) mo44497q0(new ak5(fn5), new bk5());
    }

    /* renamed from: z */
    public final long mo44501z() {
        return mo44500y().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }
}
