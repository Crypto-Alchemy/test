package p000;

import android.annotation.SuppressLint;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007B#\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo44877d2 = {"Ly26;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Lje6;", "statement", "Lr37;", "e", "", "a", "Ljava/lang/String;", "query", "", "", "d", "[Ljava/lang/Object;", "bindArgs", "()Ljava/lang/String;", "sql", "", "c", "()I", "argCount", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: y26 */
/* compiled from: SimpleSQLiteQuery.kt */
public final class y26 implements SupportSQLiteQuery {

    /* renamed from: e */
    public static final C3653a f20023e = new C3653a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f20024a;

    /* renamed from: d */
    public final Object[] f20025d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u000f"}, mo44877d2 = {"Ly26$a;", "", "Lje6;", "statement", "", "bindArgs", "Lr37;", "b", "(Lje6;[Ljava/lang/Object;)V", "", "index", "arg", "a", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: y26$a */
    /* compiled from: SimpleSQLiteQuery.kt */
    public static final class C3653a {
        public C3653a() {
        }

        public /* synthetic */ C3653a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo27930a(je6 je6, int i, Object obj) {
            long j;
            if (obj == null) {
                je6.bindNull(i);
            } else if (obj instanceof byte[]) {
                je6.bindBlob(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                je6.bindDouble(i, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                je6.bindDouble(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                je6.bindLong(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                je6.bindLong(i, (long) ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                je6.bindLong(i, (long) ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                je6.bindLong(i, (long) ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                je6.bindString(i, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                je6.bindLong(i, j);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public final void mo27931b(je6 je6, Object[] objArr) {
            vx2.m53591g(je6, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    Object obj = objArr[i];
                    i++;
                    mo27930a(je6, i, obj);
                }
            }
        }
    }

    public y26(String str, Object[] objArr) {
        vx2.m53591g(str, "query");
        this.f20024a = str;
        this.f20025d = objArr;
    }

    /* renamed from: c */
    public int mo10284c() {
        Object[] objArr = this.f20025d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: d */
    public String mo10285d() {
        return this.f20024a;
    }

    /* renamed from: e */
    public void mo10286e(je6 je6) {
        vx2.m53591g(je6, "statement");
        f20023e.mo27931b(je6, this.f20025d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public y26(String str) {
        this(str, (Object[]) null);
        vx2.m53591g(str, "query");
    }
}
