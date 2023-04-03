package p000;

import androidx.paging.LoadType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0014\u001cB\u0007¢\u0006\u0004\b%\u0010\u0019J\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00138\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010 R\u0014\u0010#\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010$\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo44877d2 = {"Ldl4;", "", "Key", "Value", "Lr37;", "e", "Lkotlin/Function0;", "onInvalidatedCallback", "g", "h", "Ldl4$a;", "params", "Ldl4$b;", "f", "(Ldl4$a;Lns0;)Ljava/lang/Object;", "Lfl4;", "state", "d", "(Lfl4;)Ljava/lang/Object;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getOnInvalidatedCallbacks$paging_common", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getOnInvalidatedCallbacks$paging_common$annotations", "()V", "onInvalidatedCallbacks", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_invalid", "", "()Z", "jumpingSupported", "c", "keyReuseSupported", "invalid", "<init>", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: dl4 */
/* compiled from: PagingSource.kt */
public abstract class dl4<Key, Value> {

    /* renamed from: a */
    public final CopyOnWriteArrayList<pc2<r37>> f10758a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final AtomicBoolean f10759b = new AtomicBoolean(false);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0004\u0006\u000b\u0012B\u0019\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000e\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, mo44877d2 = {"Ldl4$a;", "", "Key", "", "a", "I", "b", "()I", "loadSize", "", "Z", "c", "()Z", "placeholdersEnabled", "()Ljava/lang/Object;", "key", "<init>", "(IZ)V", "d", "Ldl4$a$d;", "Ldl4$a$a;", "Ldl4$a$c;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: dl4$a */
    /* compiled from: PagingSource.kt */
    public static abstract class C2171a<Key> {

        /* renamed from: c */
        public static final C2173b f10760c = new C2173b((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final int f10761a;

        /* renamed from: b */
        public final boolean f10762b;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00028\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00028\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo44877d2 = {"Ldl4$a$a;", "", "Key", "Ldl4$a;", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: dl4$a$a */
        /* compiled from: PagingSource.kt */
        public static final class C2172a<Key> extends C2171a<Key> {

            /* renamed from: d */
            public final Key f10763d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2172a(Key key, int i, boolean z) {
                super(i, z, (DefaultConstructorMarker) null);
                vx2.m53591g(key, "key");
                this.f10763d = key;
            }

            /* renamed from: a */
            public Key mo18814a() {
                return this.f10763d;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\n\"\b\b\u0003\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo44877d2 = {"Ldl4$a$b;", "", "Key", "Landroidx/paging/LoadType;", "loadType", "key", "", "loadSize", "", "placeholdersEnabled", "Ldl4$a;", "a", "(Landroidx/paging/LoadType;Ljava/lang/Object;IZ)Ldl4$a;", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: dl4$a$b */
        /* compiled from: PagingSource.kt */
        public static final class C2173b {
            public C2173b() {
            }

            public /* synthetic */ C2173b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final <Key> C2171a<Key> mo18817a(LoadType loadType, Key key, int i, boolean z) {
                vx2.m53591g(loadType, "loadType");
                int i2 = el4.f11251a[loadType.ordinal()];
                if (i2 == 1) {
                    return new C2175d(key, i, z);
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    } else if (key != null) {
                        return new C2172a(key, i, z);
                    } else {
                        throw new IllegalArgumentException("key cannot be null for append".toString());
                    }
                } else if (key != null) {
                    return new C2174c(key, i, z);
                } else {
                    throw new IllegalArgumentException("key cannot be null for prepend".toString());
                }
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00028\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00028\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo44877d2 = {"Ldl4$a$c;", "", "Key", "Ldl4$a;", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: dl4$a$c */
        /* compiled from: PagingSource.kt */
        public static final class C2174c<Key> extends C2171a<Key> {

            /* renamed from: d */
            public final Key f10764d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2174c(Key key, int i, boolean z) {
                super(i, z, (DefaultConstructorMarker) null);
                vx2.m53591g(key, "key");
                this.f10764d = key;
            }

            /* renamed from: a */
            public Key mo18814a() {
                return this.f10764d;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00018\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo44877d2 = {"Ldl4$a$d;", "", "Key", "Ldl4$a;", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: dl4$a$d */
        /* compiled from: PagingSource.kt */
        public static final class C2175d<Key> extends C2171a<Key> {

            /* renamed from: d */
            public final Key f10765d;

            public C2175d(Key key, int i, boolean z) {
                super(i, z, (DefaultConstructorMarker) null);
                this.f10765d = key;
            }

            /* renamed from: a */
            public Key mo18814a() {
                return this.f10765d;
            }
        }

        public C2171a(int i, boolean z) {
            this.f10761a = i;
            this.f10762b = z;
        }

        /* renamed from: a */
        public abstract Key mo18814a();

        /* renamed from: b */
        public final int mo18815b() {
            return this.f10761a;
        }

        /* renamed from: c */
        public final boolean mo18816c() {
            return this.f10762b;
        }

        public /* synthetic */ C2171a(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }
    }

    /* renamed from: a */
    public final boolean mo18809a() {
        return this.f10759b.get();
    }

    /* renamed from: b */
    public boolean mo8654b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo18810c() {
        return false;
    }

    /* renamed from: d */
    public abstract Key mo8655d(fl4<Key, Value> fl4);

    /* renamed from: e */
    public final void mo18811e() {
        if (this.f10759b.compareAndSet(false, true)) {
            for (pc2 invoke : this.f10758a) {
                invoke.invoke();
            }
        }
    }

    /* renamed from: f */
    public abstract Object mo8656f(C2171a<Key> aVar, ns0<? super C2176b<Key, Value>> ns0);

    /* renamed from: g */
    public final void mo18812g(pc2<r37> pc2) {
        vx2.m53591g(pc2, "onInvalidatedCallback");
        this.f10758a.add(pc2);
    }

    /* renamed from: h */
    public final void mo18813h(pc2<r37> pc2) {
        vx2.m53591g(pc2, "onInvalidatedCallback");
        this.f10758a.remove(pc2);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0002\b\t¨\u0006\n"}, mo44877d2 = {"Ldl4$b;", "", "Key", "Value", "<init>", "()V", "a", "b", "Ldl4$b$a;", "Ldl4$b$b;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: dl4$b */
    /* compiled from: PagingSource.kt */
    public static abstract class C2176b<Key, Value> {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Ldl4$b$a;", "", "Key", "Value", "Ldl4$b;", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: dl4$b$a */
        /* compiled from: PagingSource.kt */
        public static final class C2177a<Key, Value> extends C2176b<Key, Value> {

            /* renamed from: a */
            public final Throwable f10766a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2177a(Throwable th) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(th, "throwable");
                this.f10766a = th;
            }

            /* renamed from: a */
            public final Throwable mo18818a() {
                return this.f10766a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C2177a) && vx2.m53586b(this.f10766a, ((C2177a) obj).f10766a);
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.f10766a;
                if (th != null) {
                    return th.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Error(throwable=" + this.f10766a + ")";
            }
        }

        public C2176b() {
        }

        public /* synthetic */ C2176b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\b\b\u0018\u0000  *\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004:\u0001\rB=\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00050\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eB+\b\u0016\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00050\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b\u001d\u0010\u001fJ\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006!"}, mo44877d2 = {"Ldl4$b$b;", "", "Key", "Value", "Ldl4$b;", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "data", "b", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "prevKey", "c", "d", "nextKey", "I", "()I", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "g", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: dl4$b$b */
        /* compiled from: PagingSource.kt */
        public static final class C2178b<Key, Value> extends C2176b<Key, Value> {

            /* renamed from: f */
            public static final C2178b f10767f = new C2178b(ck0.m33062j(), (Object) null, (Object) null, 0, 0);

            /* renamed from: g */
            public static final C2179a f10768g = new C2179a((DefaultConstructorMarker) null);

            /* renamed from: a */
            public final List<Value> f10769a;

            /* renamed from: b */
            public final Key f10770b;

            /* renamed from: c */
            public final Key f10771c;

            /* renamed from: d */
            public final int f10772d;

            /* renamed from: e */
            public final int f10773e;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Ldl4$b$b$a;", "", "", "COUNT_UNDEFINED", "I", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
            /* renamed from: dl4$b$b$a */
            /* compiled from: PagingSource.kt */
            public static final class C2179a {
                public C2179a() {
                }

                public /* synthetic */ C2179a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2178b(List<? extends Value> list, Key key, Key key2, int i, int i2) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(list, "data");
                this.f10769a = list;
                this.f10770b = key;
                this.f10771c = key2;
                this.f10772d = i;
                this.f10773e = i2;
                boolean z = false;
                if (i == Integer.MIN_VALUE || i >= 0) {
                    if (!((i2 == Integer.MIN_VALUE || i2 >= 0) ? true : z)) {
                        throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            /* renamed from: a */
            public final List<Value> mo18822a() {
                return this.f10769a;
            }

            /* renamed from: b */
            public final int mo18823b() {
                return this.f10773e;
            }

            /* renamed from: c */
            public final int mo18824c() {
                return this.f10772d;
            }

            /* renamed from: d */
            public final Key mo18825d() {
                return this.f10771c;
            }

            /* renamed from: e */
            public final Key mo18826e() {
                return this.f10770b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2178b)) {
                    return false;
                }
                C2178b bVar = (C2178b) obj;
                return vx2.m53586b(this.f10769a, bVar.f10769a) && vx2.m53586b(this.f10770b, bVar.f10770b) && vx2.m53586b(this.f10771c, bVar.f10771c) && this.f10772d == bVar.f10772d && this.f10773e == bVar.f10773e;
            }

            public int hashCode() {
                List<Value> list = this.f10769a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                Key key = this.f10770b;
                int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
                Key key2 = this.f10771c;
                if (key2 != null) {
                    i = key2.hashCode();
                }
                return ((((hashCode2 + i) * 31) + this.f10772d) * 31) + this.f10773e;
            }

            public String toString() {
                return "Page(data=" + this.f10769a + ", prevKey=" + this.f10770b + ", nextKey=" + this.f10771c + ", itemsBefore=" + this.f10772d + ", itemsAfter=" + this.f10773e + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C2178b(List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                vx2.m53591g(list, "data");
            }
        }
    }
}
