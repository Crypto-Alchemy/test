package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\t\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0001\u0003\u000b\f\r¨\u0006\u000e"}, mo44877d2 = {"Lxi3;", "", "", "a", "Z", "()Z", "endOfPaginationReached", "<init>", "(Z)V", "b", "c", "Lxi3$c;", "Lxi3$b;", "Lxi3$a;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: xi3 */
/* compiled from: LoadState.kt */
public abstract class xi3 {

    /* renamed from: a */
    public final boolean f19846a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lxi3$a;", "Lxi3;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "b", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "error", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: xi3$a */
    /* compiled from: LoadState.kt */
    public static final class C3603a extends xi3 {

        /* renamed from: b */
        public final Throwable f19847b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3603a(Throwable th) {
            super(false, (DefaultConstructorMarker) null);
            vx2.m53591g(th, "error");
            this.f19847b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3603a) {
                C3603a aVar = (C3603a) obj;
                if (mo27748a() != aVar.mo27748a() || !vx2.m53586b(this.f19847b, aVar.f19847b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ut5.m28422a(mo27748a()) + this.f19847b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + mo27748a() + ", error=" + this.f19847b + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, mo44877d2 = {"Lxi3$b;", "Lxi3;", "", "toString", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: xi3$b */
    /* compiled from: LoadState.kt */
    public static final class C3604b extends xi3 {

        /* renamed from: b */
        public static final C3604b f19848b = new C3604b();

        public C3604b() {
            super(false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3604b) || mo27748a() != ((C3604b) obj).mo27748a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ut5.m28422a(mo27748a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + mo27748a() + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"Lxi3$c;", "Lxi3;", "", "toString", "", "other", "", "equals", "", "hashCode", "endOfPaginationReached", "<init>", "(Z)V", "d", "a", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: xi3$c */
    /* compiled from: LoadState.kt */
    public static final class C3605c extends xi3 {

        /* renamed from: b */
        public static final C3605c f19849b = new C3605c(true);

        /* renamed from: c */
        public static final C3605c f19850c = new C3605c(false);

        /* renamed from: d */
        public static final C3606a f19851d = new C3606a((DefaultConstructorMarker) null);

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lxi3$c$a;", "", "Lxi3$c;", "Complete", "Lxi3$c;", "a", "()Lxi3$c;", "Incomplete", "b", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: xi3$c$a */
        /* compiled from: LoadState.kt */
        public static final class C3606a {
            public C3606a() {
            }

            public /* synthetic */ C3606a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C3605c mo27758a() {
                return C3605c.f19849b;
            }

            /* renamed from: b */
            public final C3605c mo27759b() {
                return C3605c.f19850c;
            }
        }

        public C3605c(boolean z) {
            super(z, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3605c) || mo27748a() != ((C3605c) obj).mo27748a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ut5.m28422a(mo27748a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + mo27748a() + ')';
        }
    }

    public xi3(boolean z) {
        this.f19846a = z;
    }

    /* renamed from: a */
    public final boolean mo27748a() {
        return this.f19846a;
    }

    public /* synthetic */ xi3(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
