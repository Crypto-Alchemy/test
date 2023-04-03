package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.gf7;
import p000.vk4;
import p000.xi3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0015\b\u0000\u0018\u0000 \u0015*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002$(B\u0015\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b6\u00107J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001c\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0017H\u0002J\u001e\u0010\u001c\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u001e\u0010\"\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R$\u0010-\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b(\u0010*R$\u0010.\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b,\u0010*R\u0014\u00100\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u00102\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010*R\u0014\u00104\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*¨\u00068"}, mo44877d2 = {"Landroidx/paging/PagePresenter;", "", "T", "Lvb4;", "", "toString", "", "index", "k", "(I)Ljava/lang/Object;", "localIndex", "d", "Lvk4;", "pageEvent", "Landroidx/paging/PagePresenter$b;", "callback", "Lr37;", "p", "Lgf7$b;", "n", "Lgf7$a;", "f", "g", "", "Lkw6;", "j", "Lvk4$b;", "insert", "o", "Lrw2;", "pageOffsetsToDrop", "i", "Lvk4$a;", "drop", "h", "", "a", "Ljava/util/List;", "pages", "<set-?>", "b", "I", "()I", "storageCount", "c", "placeholdersBefore", "placeholdersAfter", "getSize", "size", "l", "originalPageOffsetFirst", "m", "originalPageOffsetLast", "insertEvent", "<init>", "(Lvk4$b;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: PagePresenter.kt */
public final class PagePresenter<T> implements vb4<T> {

    /* renamed from: e */
    public static final PagePresenter<Object> f6207e = new PagePresenter<>(vk4.C3493b.f18820g.mo27197d());

    /* renamed from: f */
    public static final C1181a f6208f = new C1181a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final List<kw6<T>> f6209a;

    /* renamed from: b */
    public int f6210b;

    /* renamed from: c */
    public int f6211c;

    /* renamed from: d */
    public int f6212d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Landroidx/paging/PagePresenter$a;", "", "T", "Landroidx/paging/PagePresenter;", "a", "()Landroidx/paging/PagePresenter;", "INITIAL", "Landroidx/paging/PagePresenter;", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.PagePresenter$a */
    /* compiled from: PagePresenter.kt */
    public static final class C1181a {
        public C1181a() {
        }

        public /* synthetic */ C1181a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> PagePresenter<T> mo8728a() {
            PagePresenter<T> e = PagePresenter.f6207e;
            if (e != null) {
                return e;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagePresenter<T>");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, mo44877d2 = {"Landroidx/paging/PagePresenter$b;", "", "", "position", "count", "Lr37;", "a", "onInserted", "onRemoved", "Landroidx/paging/LoadType;", "loadType", "", "fromMediator", "Lxi3;", "loadState", "b", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.PagePresenter$b */
    /* compiled from: PagePresenter.kt */
    public interface C1182b {
        /* renamed from: a */
        void mo8729a(int i, int i2);

        /* renamed from: b */
        void mo8730b(LoadType loadType, boolean z, xi3 xi3);

        void onInserted(int i, int i2);

        void onRemoved(int i, int i2);
    }

    public PagePresenter(vk4.C3493b<T> bVar) {
        vx2.m53591g(bVar, "insertEvent");
        this.f6209a = CollectionsKt___CollectionsKt.m47313M0(bVar.mo27189f());
        this.f6210b = mo8720j(bVar.mo27189f());
        this.f6211c = bVar.mo27191h();
        this.f6212d = bVar.mo27190g();
    }

    /* renamed from: a */
    public int mo8711a() {
        return this.f6210b;
    }

    /* renamed from: b */
    public int mo8712b() {
        return this.f6211c;
    }

    /* renamed from: c */
    public int mo8713c() {
        return this.f6212d;
    }

    /* renamed from: d */
    public T mo8714d(int i) {
        int size = this.f6209a.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = this.f6209a.get(i2).mo22539b().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return this.f6209a.get(i2).mo22539b().get(i);
    }

    /* renamed from: f */
    public final gf7.C2383a mo8715f(int i) {
        int i2 = 0;
        int b = i - mo8712b();
        while (b >= this.f6209a.get(i2).mo22539b().size() && i2 < ck0.m33064l(this.f6209a)) {
            b -= this.f6209a.get(i2).mo22539b().size();
            i2++;
        }
        return this.f6209a.get(i2).mo22541d(b, i - mo8712b(), ((getSize() - i) - mo8713c()) - 1, mo8722l(), mo8723m());
    }

    /* renamed from: g */
    public final void mo8716g(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + getSize());
        }
    }

    public int getSize() {
        return mo8712b() + mo8711a() + mo8713c();
    }

    /* renamed from: h */
    public final void mo8718h(vk4.C3492a<T> aVar, C1182b bVar) {
        int i;
        int size = getSize();
        LoadType a = aVar.mo27177a();
        LoadType loadType = LoadType.PREPEND;
        if (a == loadType) {
            int b = mo8712b();
            this.f6210b = mo8711a() - mo8719i(new rw2(aVar.mo27179c(), aVar.mo27178b()));
            this.f6211c = aVar.mo27181e();
            int size2 = getSize() - size;
            if (size2 > 0) {
                bVar.onInserted(0, size2);
            } else if (size2 < 0) {
                bVar.onRemoved(0, -size2);
            }
            int max = Math.max(0, b + size2);
            int e = aVar.mo27181e() - max;
            if (e > 0) {
                bVar.mo8729a(max, e);
            }
            bVar.mo8730b(loadType, false, xi3.C3605c.f19851d.mo27759b());
            return;
        }
        int c = mo8713c();
        this.f6210b = mo8711a() - mo8719i(new rw2(aVar.mo27179c(), aVar.mo27178b()));
        this.f6212d = aVar.mo27181e();
        int size3 = getSize() - size;
        if (size3 > 0) {
            bVar.onInserted(size, size3);
        } else if (size3 < 0) {
            bVar.onRemoved(size + size3, -size3);
        }
        if (size3 < 0) {
            i = Math.min(c, -size3);
        } else {
            i = 0;
        }
        int e2 = aVar.mo27181e() - (c - i);
        if (e2 > 0) {
            bVar.mo8729a(getSize() - aVar.mo27181e(), e2);
        }
        bVar.mo8730b(LoadType.APPEND, false, xi3.C3605c.f19851d.mo27759b());
    }

    /* renamed from: i */
    public final int mo8719i(rw2 rw2) {
        boolean z;
        Iterator<kw6<T>> it = this.f6209a.iterator();
        int i = 0;
        while (it.hasNext()) {
            kw6 next = it.next();
            int[] c = next.mo22540c();
            int length = c.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (rw2.mo47514u(c[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                i += next.mo22539b().size();
                it.remove();
            }
        }
        return i;
    }

    /* renamed from: j */
    public final int mo8720j(List<kw6<T>> list) {
        int i = 0;
        for (kw6 b : list) {
            i += b.mo22539b().size();
        }
        return i;
    }

    /* renamed from: k */
    public final T mo8721k(int i) {
        mo8716g(i);
        int b = i - mo8712b();
        if (b < 0 || b >= mo8711a()) {
            return null;
        }
        return mo8714d(b);
    }

    /* renamed from: l */
    public final int mo8722l() {
        Integer Z = ArraysKt___ArraysKt.m47274Z(((kw6) CollectionsKt___CollectionsKt.m47329Z(this.f6209a)).mo22540c());
        vx2.m53588d(Z);
        return Z.intValue();
    }

    /* renamed from: m */
    public final int mo8723m() {
        Integer Y = ArraysKt___ArraysKt.m47273Y(((kw6) CollectionsKt___CollectionsKt.m47340k0(this.f6209a)).mo22540c());
        vx2.m53588d(Y);
        return Y.intValue();
    }

    /* renamed from: n */
    public final gf7.C2384b mo8724n() {
        int a = mo8711a() / 2;
        return new gf7.C2384b(a, a, mo8722l(), mo8723m());
    }

    /* renamed from: o */
    public final void mo8725o(vk4.C3493b<T> bVar, C1182b bVar2) {
        int j = mo8720j(bVar.mo27189f());
        int size = getSize();
        int i = zk4.f20593a[bVar.mo27187e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int min = Math.min(mo8712b(), j);
                int i2 = j - min;
                this.f6209a.addAll(0, bVar.mo27189f());
                this.f6210b = mo8711a() + j;
                this.f6211c = bVar.mo27191h();
                bVar2.mo8729a(mo8712b() - min, min);
                bVar2.onInserted(0, i2);
                int size2 = (getSize() - size) - i2;
                if (size2 > 0) {
                    bVar2.onInserted(0, size2);
                } else if (size2 < 0) {
                    bVar2.onRemoved(0, -size2);
                }
            } else if (i == 3) {
                int min2 = Math.min(mo8713c(), j);
                int b = mo8712b() + mo8711a();
                int i3 = j - min2;
                List<kw6<T>> list = this.f6209a;
                list.addAll(list.size(), bVar.mo27189f());
                this.f6210b = mo8711a() + j;
                this.f6212d = bVar.mo27190g();
                bVar2.mo8729a(b, min2);
                bVar2.onInserted(b + min2, i3);
                int size3 = (getSize() - size) - i3;
                if (size3 > 0) {
                    bVar2.onInserted(getSize() - size3, size3);
                } else if (size3 < 0) {
                    bVar2.onRemoved(getSize(), -size3);
                }
            }
            bVar.mo27186d().mo21559a(new PagePresenter$insertPage$1(bVar2));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final void mo8726p(vk4<T> vk4, C1182b bVar) {
        vx2.m53591g(vk4, "pageEvent");
        vx2.m53591g(bVar, "callback");
        if (vk4 instanceof vk4.C3493b) {
            mo8725o((vk4.C3493b) vk4, bVar);
        } else if (vk4 instanceof vk4.C3492a) {
            mo8718h((vk4.C3492a) vk4, bVar);
        } else if (vk4 instanceof vk4.C3495c) {
            vk4.C3495c cVar = (vk4.C3495c) vk4;
            bVar.mo8730b(cVar.mo27200c(), cVar.mo27198a(), cVar.mo27199b());
        }
    }

    public String toString() {
        int a = mo8711a();
        ArrayList arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList.add(mo8714d(i));
        }
        String i0 = CollectionsKt___CollectionsKt.m47338i0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null);
        return "[(" + mo8712b() + " placeholders), " + i0 + ", (" + mo8713c() + " placeholders)]";
    }
}
