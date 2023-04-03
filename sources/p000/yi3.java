package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.xi3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, mo44877d2 = {"Lyi3;", "", "Landroidx/paging/LoadType;", "loadType", "Lxi3;", "newState", "h", "(Landroidx/paging/LoadType;Lxi3;)Lyi3;", "d", "(Landroidx/paging/LoadType;)Lxi3;", "refresh", "prepend", "append", "b", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lxi3;", "g", "()Lxi3;", "f", "c", "e", "<init>", "(Lxi3;Lxi3;Lxi3;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: yi3 */
/* compiled from: LoadStates.kt */
public final class yi3 {

    /* renamed from: d */
    public static final yi3 f20228d;

    /* renamed from: e */
    public static final C3680a f20229e = new C3680a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final xi3 f20230a;

    /* renamed from: b */
    public final xi3 f20231b;

    /* renamed from: c */
    public final xi3 f20232c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lyi3$a;", "", "Lyi3;", "IDLE", "Lyi3;", "a", "()Lyi3;", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: yi3$a */
    /* compiled from: LoadStates.kt */
    public static final class C3680a {
        public C3680a() {
        }

        public /* synthetic */ C3680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final yi3 mo28088a() {
            return yi3.f20228d;
        }
    }

    static {
        xi3.C3605c.C3606a aVar = xi3.C3605c.f19851d;
        f20228d = new yi3(aVar.mo27759b(), aVar.mo27759b(), aVar.mo27759b());
    }

    public yi3(xi3 xi3, xi3 xi32, xi3 xi33) {
        vx2.m53591g(xi3, "refresh");
        vx2.m53591g(xi32, "prepend");
        vx2.m53591g(xi33, "append");
        this.f20230a = xi3;
        this.f20231b = xi32;
        this.f20232c = xi33;
    }

    /* renamed from: c */
    public static /* synthetic */ yi3 m30607c(yi3 yi3, xi3 xi3, xi3 xi32, xi3 xi33, int i, Object obj) {
        if ((i & 1) != 0) {
            xi3 = yi3.f20230a;
        }
        if ((i & 2) != 0) {
            xi32 = yi3.f20231b;
        }
        if ((i & 4) != 0) {
            xi33 = yi3.f20232c;
        }
        return yi3.mo28079b(xi3, xi32, xi33);
    }

    /* renamed from: b */
    public final yi3 mo28079b(xi3 xi3, xi3 xi32, xi3 xi33) {
        vx2.m53591g(xi3, "refresh");
        vx2.m53591g(xi32, "prepend");
        vx2.m53591g(xi33, "append");
        return new yi3(xi3, xi32, xi33);
    }

    /* renamed from: d */
    public final xi3 mo28080d(LoadType loadType) {
        vx2.m53591g(loadType, "loadType");
        int i = zi3.f20559b[loadType.ordinal()];
        if (i == 1) {
            return this.f20230a;
        }
        if (i == 2) {
            return this.f20232c;
        }
        if (i == 3) {
            return this.f20231b;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final xi3 mo28081e() {
        return this.f20232c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi3)) {
            return false;
        }
        yi3 yi3 = (yi3) obj;
        return vx2.m53586b(this.f20230a, yi3.f20230a) && vx2.m53586b(this.f20231b, yi3.f20231b) && vx2.m53586b(this.f20232c, yi3.f20232c);
    }

    /* renamed from: f */
    public final xi3 mo28083f() {
        return this.f20231b;
    }

    /* renamed from: g */
    public final xi3 mo28084g() {
        return this.f20230a;
    }

    /* renamed from: h */
    public final yi3 mo28085h(LoadType loadType, xi3 xi3) {
        vx2.m53591g(loadType, "loadType");
        vx2.m53591g(xi3, "newState");
        int i = zi3.f20558a[loadType.ordinal()];
        if (i == 1) {
            return m30607c(this, (xi3) null, (xi3) null, xi3, 3, (Object) null);
        }
        if (i == 2) {
            return m30607c(this, (xi3) null, xi3, (xi3) null, 5, (Object) null);
        }
        if (i == 3) {
            return m30607c(this, xi3, (xi3) null, (xi3) null, 6, (Object) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        xi3 xi3 = this.f20230a;
        int i = 0;
        int hashCode = (xi3 != null ? xi3.hashCode() : 0) * 31;
        xi3 xi32 = this.f20231b;
        int hashCode2 = (hashCode + (xi32 != null ? xi32.hashCode() : 0)) * 31;
        xi3 xi33 = this.f20232c;
        if (xi33 != null) {
            i = xi33.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "LoadStates(refresh=" + this.f20230a + ", prepend=" + this.f20231b + ", append=" + this.f20232c + ")";
    }
}
