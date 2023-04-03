package p000;

import androidx.sqlite.p006db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u0012\u0004\b \u0010!R\u001a\u0010'\u001a\u00020#8\u0006X\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010!R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030(8\u0006X\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010!R\"\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140(8\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010!R\u001a\u00105\u001a\u0002018\u0002X\u0004¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u0010!R$\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00058\u0016@RX\u000e¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b8\u0010\u001aR\u0014\u0010;\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010:¨\u0006?"}, mo44877d2 = {"Llh5;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Lje6;", "", "query", "", "initArgCount", "Lr37;", "b", "f", "statement", "e", "index", "bindNull", "", "value", "bindLong", "", "bindDouble", "bindString", "", "bindBlob", "close", "a", "I", "getCapacity", "()I", "capacity", "d", "Ljava/lang/String;", "", "[J", "getLongBindings$annotations", "()V", "longBindings", "", "g", "[D", "getDoubleBindings$annotations", "doubleBindings", "", "k", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "r", "[[B", "getBlobBindings$annotations", "blobBindings", "", "s", "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", "x", "c", "argCount", "()Ljava/lang/String;", "sql", "<init>", "(I)V", "y", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lh5 */
/* compiled from: RoomSQLiteQuery.kt */
public final class lh5 implements SupportSQLiteQuery, je6 {

    /* renamed from: A */
    public static final TreeMap<Integer, lh5> f14516A = new TreeMap<>();

    /* renamed from: y */
    public static final C2759a f14517y = new C2759a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f14518a;

    /* renamed from: d */
    public volatile String f14519d;

    /* renamed from: e */
    public final long[] f14520e;

    /* renamed from: g */
    public final double[] f14521g;

    /* renamed from: k */
    public final String[] f14522k;

    /* renamed from: r */
    public final byte[][] f14523r;

    /* renamed from: s */
    public final int[] f14524s;

    /* renamed from: x */
    public int f14525x;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\f\n\u0004\b\r\u0010\f\u0012\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\f\n\u0004\b\u0012\u0010\f\u0012\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\n¨\u0006\u001a"}, mo44877d2 = {"Llh5$a;", "", "", "query", "", "argumentCount", "Llh5;", "a", "Lr37;", "b", "()V", "BLOB", "I", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "DOUBLE", "LONG", "NULL", "POOL_LIMIT", "getPOOL_LIMIT$annotations", "STRING", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "getQueryPool$annotations", "<init>", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: lh5$a */
    /* compiled from: RoomSQLiteQuery.kt */
    public static final class C2759a {
        public C2759a() {
        }

        public /* synthetic */ C2759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final lh5 mo22766a(String str, int i) {
            vx2.m53591g(str, "query");
            TreeMap<Integer, lh5> treeMap = lh5.f14516A;
            synchronized (treeMap) {
                Map.Entry<Integer, lh5> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    lh5 value = ceilingEntry.getValue();
                    value.mo22763b(str, i);
                    vx2.m53590f(value, "sqliteQuery");
                    return value;
                }
                r37 r37 = r37.f33317a;
                lh5 lh5 = new lh5(i, (DefaultConstructorMarker) null);
                lh5.mo22763b(str, i);
                return lh5;
            }
        }

        /* renamed from: b */
        public final void mo22767b() {
            TreeMap<Integer, lh5> treeMap = lh5.f14516A;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                vx2.m53590f(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public lh5(int i) {
        this.f14518a = i;
        int i2 = i + 1;
        this.f14524s = new int[i2];
        this.f14520e = new long[i2];
        this.f14521g = new double[i2];
        this.f14522k = new String[i2];
        this.f14523r = new byte[i2][];
    }

    public /* synthetic */ lh5(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: a */
    public static final lh5 m21448a(String str, int i) {
        return f14517y.mo22766a(str, i);
    }

    /* renamed from: b */
    public final void mo22763b(String str, int i) {
        vx2.m53591g(str, "query");
        this.f14519d = str;
        this.f14525x = i;
    }

    public void bindBlob(int i, byte[] bArr) {
        vx2.m53591g(bArr, "value");
        this.f14524s[i] = 5;
        this.f14523r[i] = bArr;
    }

    public void bindDouble(int i, double d) {
        this.f14524s[i] = 3;
        this.f14521g[i] = d;
    }

    public void bindLong(int i, long j) {
        this.f14524s[i] = 2;
        this.f14520e[i] = j;
    }

    public void bindNull(int i) {
        this.f14524s[i] = 1;
    }

    public void bindString(int i, String str) {
        vx2.m53591g(str, "value");
        this.f14524s[i] = 4;
        this.f14522k[i] = str;
    }

    /* renamed from: c */
    public int mo10284c() {
        return this.f14525x;
    }

    public void close() {
    }

    /* renamed from: d */
    public String mo10285d() {
        String str = this.f14519d;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: e */
    public void mo10286e(je6 je6) {
        vx2.m53591g(je6, "statement");
        int c = mo10284c();
        if (1 <= c) {
            int i = 1;
            while (true) {
                int i2 = this.f14524s[i];
                if (i2 == 1) {
                    je6.bindNull(i);
                } else if (i2 == 2) {
                    je6.bindLong(i, this.f14520e[i]);
                } else if (i2 == 3) {
                    je6.bindDouble(i, this.f14521g[i]);
                } else if (i2 == 4) {
                    String str = this.f14522k[i];
                    if (str != null) {
                        je6.bindString(i, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i2 == 5) {
                    byte[] bArr = this.f14523r[i];
                    if (bArr != null) {
                        je6.bindBlob(i, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i != c) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo22765f() {
        TreeMap<Integer, lh5> treeMap = f14516A;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f14518a), this);
            f14517y.mo22767b();
            r37 r37 = r37.f33317a;
        }
    }
}
