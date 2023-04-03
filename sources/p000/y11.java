package p000;

import androidx.paging.LoadType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, mo44877d2 = {"Ly11;", "", "Key", "Value", "a", "b", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: y11 */
/* compiled from: DataSource.kt */
public abstract class y11<Key, Value> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0017*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0018"}, mo44877d2 = {"Ly11$a;", "", "Value", "other", "", "equals", "", "a", "Ljava/util/List;", "data", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "prevKey", "c", "nextKey", "", "I", "()I", "itemsBefore", "e", "itemsAfter", "f", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: y11$a */
    /* compiled from: DataSource.kt */
    public static final class C3650a<Value> {

        /* renamed from: f */
        public static final C3651a f20002f = new C3651a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final List<Value> f20003a;

        /* renamed from: b */
        public final Object f20004b;

        /* renamed from: c */
        public final Object f20005c;

        /* renamed from: d */
        public final int f20006d;

        /* renamed from: e */
        public final int f20007e;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Ly11$a$a;", "", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: y11$a$a */
        /* compiled from: DataSource.kt */
        public static final class C3651a {
            public C3651a() {
            }

            public /* synthetic */ C3651a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final int mo27904a() {
            return this.f20007e;
        }

        /* renamed from: b */
        public final int mo27905b() {
            return this.f20006d;
        }

        /* renamed from: c */
        public final Object mo27906c() {
            return this.f20005c;
        }

        /* renamed from: d */
        public final Object mo27907d() {
            return this.f20004b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3650a)) {
                return false;
            }
            C3650a aVar = (C3650a) obj;
            if (!vx2.m53586b(this.f20003a, aVar.f20003a) || !vx2.m53586b(this.f20004b, aVar.f20004b) || !vx2.m53586b(this.f20005c, aVar.f20005c) || this.f20006d != aVar.f20006d || this.f20007e != aVar.f20007e) {
                return false;
            }
            return true;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001f"}, mo44877d2 = {"Ly11$b;", "", "K", "Landroidx/paging/LoadType;", "a", "Landroidx/paging/LoadType;", "getType$paging_common", "()Landroidx/paging/LoadType;", "type", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "", "c", "I", "getInitialLoadSize", "()I", "initialLoadSize", "", "d", "Z", "getPlaceholdersEnabled", "()Z", "placeholdersEnabled", "e", "getPageSize", "pageSize", "<init>", "(Landroidx/paging/LoadType;Ljava/lang/Object;IZI)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: y11$b */
    /* compiled from: DataSource.kt */
    public static final class C3652b<K> {

        /* renamed from: a */
        public final LoadType f20008a;

        /* renamed from: b */
        public final K f20009b;

        /* renamed from: c */
        public final int f20010c;

        /* renamed from: d */
        public final boolean f20011d;

        /* renamed from: e */
        public final int f20012e;

        public C3652b(LoadType loadType, K k, int i, boolean z, int i2) {
            vx2.m53591g(loadType, "type");
            this.f20008a = loadType;
            this.f20009b = k;
            this.f20010c = i;
            this.f20011d = z;
            this.f20012e = i2;
            if (loadType != LoadType.REFRESH && k == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }
}
