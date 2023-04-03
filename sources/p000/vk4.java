package p000;

import androidx.paging.LoadType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.xi3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0003\b\t\n¨\u0006\u000b"}, mo44877d2 = {"Lvk4;", "", "T", "<init>", "()V", "a", "b", "c", "Lvk4$b;", "Lvk4$a;", "Lvk4$c;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: vk4 */
/* compiled from: PageEvent.kt */
public abstract class vk4<T> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001c"}, mo44877d2 = {"Lvk4$a;", "", "T", "Lvk4;", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/paging/LoadType;", "a", "Landroidx/paging/LoadType;", "()Landroidx/paging/LoadType;", "loadType", "b", "I", "c", "()I", "minPageOffset", "maxPageOffset", "d", "e", "placeholdersRemaining", "pageCount", "<init>", "(Landroidx/paging/LoadType;III)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: vk4$a */
    /* compiled from: PageEvent.kt */
    public static final class C3492a<T> extends vk4<T> {

        /* renamed from: a */
        public final LoadType f18815a;

        /* renamed from: b */
        public final int f18816b;

        /* renamed from: c */
        public final int f18817c;

        /* renamed from: d */
        public final int f18818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3492a(LoadType loadType, int i, int i2, int i3) {
            super((DefaultConstructorMarker) null);
            boolean z;
            boolean z2;
            vx2.m53591g(loadType, "loadType");
            this.f18815a = loadType;
            this.f18816b = i;
            this.f18817c = i2;
            this.f18818d = i3;
            boolean z3 = true;
            if (loadType != LoadType.REFRESH) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (mo27180d() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (!(i3 < 0 ? false : z3)) {
                        throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i3).toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + mo27180d()).toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        /* renamed from: a */
        public final LoadType mo27177a() {
            return this.f18815a;
        }

        /* renamed from: b */
        public final int mo27178b() {
            return this.f18817c;
        }

        /* renamed from: c */
        public final int mo27179c() {
            return this.f18816b;
        }

        /* renamed from: d */
        public final int mo27180d() {
            return (this.f18817c - this.f18816b) + 1;
        }

        /* renamed from: e */
        public final int mo27181e() {
            return this.f18818d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3492a)) {
                return false;
            }
            C3492a aVar = (C3492a) obj;
            return vx2.m53586b(this.f18815a, aVar.f18815a) && this.f18816b == aVar.f18816b && this.f18817c == aVar.f18817c && this.f18818d == aVar.f18818d;
        }

        public int hashCode() {
            LoadType loadType = this.f18815a;
            return ((((((loadType != null ? loadType.hashCode() : 0) * 31) + this.f18816b) * 31) + this.f18817c) * 31) + this.f18818d;
        }

        public String toString() {
            return "Drop(loadType=" + this.f18815a + ", minPageOffset=" + this.f18816b + ", maxPageOffset=" + this.f18817c + ", placeholdersRemaining=" + this.f18818d + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 !*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0015B=\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b$\u0010%JM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b \u0010#¨\u0006&"}, mo44877d2 = {"Lvk4$b;", "", "T", "Lvk4;", "Landroidx/paging/LoadType;", "loadType", "", "Lkw6;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Lil0;", "combinedLoadStates", "b", "", "toString", "hashCode", "other", "", "equals", "a", "Landroidx/paging/LoadType;", "e", "()Landroidx/paging/LoadType;", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "I", "h", "()I", "d", "g", "Lil0;", "()Lil0;", "<init>", "(Landroidx/paging/LoadType;Ljava/util/List;IILil0;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: vk4$b */
    /* compiled from: PageEvent.kt */
    public static final class C3493b<T> extends vk4<T> {

        /* renamed from: f */
        public static final C3493b<Object> f18819f;

        /* renamed from: g */
        public static final C3494a f18820g;

        /* renamed from: a */
        public final LoadType f18821a;

        /* renamed from: b */
        public final List<kw6<T>> f18822b;

        /* renamed from: c */
        public final int f18823c;

        /* renamed from: d */
        public final int f18824d;

        /* renamed from: e */
        public final il0 f18825e;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ:\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ:\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo44877d2 = {"Lvk4$b$a;", "", "T", "", "Lkw6;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Lil0;", "combinedLoadStates", "Lvk4$b;", "c", "b", "a", "EMPTY_REFRESH_LOCAL", "Lvk4$b;", "d", "()Lvk4$b;", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: vk4$b$a */
        /* compiled from: PageEvent.kt */
        public static final class C3494a {
            public C3494a() {
            }

            public /* synthetic */ C3494a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final <T> C3493b<T> mo27194a(List<kw6<T>> list, int i, il0 il0) {
                vx2.m53591g(list, "pages");
                vx2.m53591g(il0, "combinedLoadStates");
                return new C3493b(LoadType.APPEND, list, -1, i, il0, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public final <T> C3493b<T> mo27195b(List<kw6<T>> list, int i, il0 il0) {
                vx2.m53591g(list, "pages");
                vx2.m53591g(il0, "combinedLoadStates");
                return new C3493b(LoadType.PREPEND, list, i, -1, il0, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public final <T> C3493b<T> mo27196c(List<kw6<T>> list, int i, int i2, il0 il0) {
                vx2.m53591g(list, "pages");
                vx2.m53591g(il0, "combinedLoadStates");
                return new C3493b(LoadType.REFRESH, list, i, i2, il0, (DefaultConstructorMarker) null);
            }

            /* renamed from: d */
            public final C3493b<Object> mo27197d() {
                return C3493b.f18819f;
            }
        }

        static {
            C3494a aVar = new C3494a((DefaultConstructorMarker) null);
            f18820g = aVar;
            List<Object> e = bk0.m32598e(kw6.f14346f.mo22545a());
            xi3.C3605c.C3606a aVar2 = xi3.C3605c.f19851d;
            f18819f = aVar.mo27196c(e, 0, 0, new il0(aVar2.mo27759b(), aVar2.mo27758a(), aVar2.mo27758a(), new yi3(aVar2.mo27759b(), aVar2.mo27758a(), aVar2.mo27758a()), (yi3) null, 16, (DefaultConstructorMarker) null));
        }

        public /* synthetic */ C3493b(LoadType loadType, List list, int i, int i2, il0 il0, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, il0);
        }

        /* renamed from: c */
        public static /* synthetic */ C3493b m28857c(C3493b bVar, LoadType loadType, List<kw6<T>> list, int i, int i2, il0 il0, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                loadType = bVar.f18821a;
            }
            if ((i3 & 2) != 0) {
                list = bVar.f18822b;
            }
            List<kw6<T>> list2 = list;
            if ((i3 & 4) != 0) {
                i = bVar.f18823c;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = bVar.f18824d;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                il0 = bVar.f18825e;
            }
            return bVar.mo27185b(loadType, list2, i4, i5, il0);
        }

        /* renamed from: b */
        public final C3493b<T> mo27185b(LoadType loadType, List<kw6<T>> list, int i, int i2, il0 il0) {
            vx2.m53591g(loadType, "loadType");
            vx2.m53591g(list, "pages");
            vx2.m53591g(il0, "combinedLoadStates");
            return new C3493b(loadType, list, i, i2, il0);
        }

        /* renamed from: d */
        public final il0 mo27186d() {
            return this.f18825e;
        }

        /* renamed from: e */
        public final LoadType mo27187e() {
            return this.f18821a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3493b)) {
                return false;
            }
            C3493b bVar = (C3493b) obj;
            return vx2.m53586b(this.f18821a, bVar.f18821a) && vx2.m53586b(this.f18822b, bVar.f18822b) && this.f18823c == bVar.f18823c && this.f18824d == bVar.f18824d && vx2.m53586b(this.f18825e, bVar.f18825e);
        }

        /* renamed from: f */
        public final List<kw6<T>> mo27189f() {
            return this.f18822b;
        }

        /* renamed from: g */
        public final int mo27190g() {
            return this.f18824d;
        }

        /* renamed from: h */
        public final int mo27191h() {
            return this.f18823c;
        }

        public int hashCode() {
            LoadType loadType = this.f18821a;
            int i = 0;
            int hashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            List<kw6<T>> list = this.f18822b;
            int hashCode2 = (((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f18823c) * 31) + this.f18824d) * 31;
            il0 il0 = this.f18825e;
            if (il0 != null) {
                i = il0.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Insert(loadType=" + this.f18821a + ", pages=" + this.f18822b + ", placeholdersBefore=" + this.f18823c + ", placeholdersAfter=" + this.f18824d + ", combinedLoadStates=" + this.f18825e + ")";
        }

        public C3493b(LoadType loadType, List<kw6<T>> list, int i, int i2, il0 il0) {
            super((DefaultConstructorMarker) null);
            this.f18821a = loadType;
            this.f18822b = list;
            this.f18823c = i;
            this.f18824d = i2;
            this.f18825e = il0;
            boolean z = false;
            if (loadType == LoadType.APPEND || i >= 0) {
                if (loadType == LoadType.PREPEND || i2 >= 0) {
                    if (!((loadType != LoadType.REFRESH || (list.isEmpty() ^ true)) ? true : z)) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was" + ' ' + i2).toString());
            }
            throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was" + ' ' + i).toString());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 \u001b*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\fB\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001c"}, mo44877d2 = {"Lvk4$c;", "", "T", "Lvk4;", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/paging/LoadType;", "a", "Landroidx/paging/LoadType;", "c", "()Landroidx/paging/LoadType;", "loadType", "b", "Z", "()Z", "fromMediator", "Lxi3;", "Lxi3;", "()Lxi3;", "loadState", "<init>", "(Landroidx/paging/LoadType;ZLxi3;)V", "d", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: vk4$c */
    /* compiled from: PageEvent.kt */
    public static final class C3495c<T> extends vk4<T> {

        /* renamed from: d */
        public static final C3496a f18826d = new C3496a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final LoadType f18827a;

        /* renamed from: b */
        public final boolean f18828b;

        /* renamed from: c */
        public final xi3 f18829c;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lvk4$c$a;", "", "Lxi3;", "loadState", "", "fromMediator", "a", "(Lxi3;Z)Z", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
        /* renamed from: vk4$c$a */
        /* compiled from: PageEvent.kt */
        public static final class C3496a {
            public C3496a() {
            }

            public /* synthetic */ C3496a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final boolean mo27204a(xi3 xi3, boolean z) {
                vx2.m53591g(xi3, "loadState");
                if ((xi3 instanceof xi3.C3604b) || (xi3 instanceof xi3.C3603a) || z) {
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3495c(LoadType loadType, boolean z, xi3 xi3) {
            super((DefaultConstructorMarker) null);
            boolean z2;
            vx2.m53591g(loadType, "loadType");
            vx2.m53591g(xi3, "loadState");
            this.f18827a = loadType;
            this.f18828b = z;
            this.f18829c = xi3;
            if (loadType != LoadType.REFRESH || z || !(xi3 instanceof xi3.C3605c) || !xi3.mo27748a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("LoadStateUpdate for local REFRESH may not set endOfPaginationReached = true".toString());
            } else if (!f18826d.mo27204a(xi3, z)) {
                throw new IllegalArgumentException("LoadStateUpdates cannot be used to dispatch NotLoading unless it is from remote mediator and remote mediator reached end of pagination.".toString());
            }
        }

        /* renamed from: a */
        public final boolean mo27198a() {
            return this.f18828b;
        }

        /* renamed from: b */
        public final xi3 mo27199b() {
            return this.f18829c;
        }

        /* renamed from: c */
        public final LoadType mo27200c() {
            return this.f18827a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3495c)) {
                return false;
            }
            C3495c cVar = (C3495c) obj;
            return vx2.m53586b(this.f18827a, cVar.f18827a) && this.f18828b == cVar.f18828b && vx2.m53586b(this.f18829c, cVar.f18829c);
        }

        public int hashCode() {
            LoadType loadType = this.f18827a;
            int i = 0;
            int hashCode = (loadType != null ? loadType.hashCode() : 0) * 31;
            boolean z = this.f18828b;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            xi3 xi3 = this.f18829c;
            if (xi3 != null) {
                i = xi3.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "LoadStateUpdate(loadType=" + this.f18827a + ", fromMediator=" + this.f18828b + ", loadState=" + this.f18829c + ")";
        }
    }

    public vk4() {
    }

    public /* synthetic */ vk4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
