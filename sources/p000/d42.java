package p000;

import androidx.paging.LoadType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.vk4;
import p000.xi3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Ld42;", "", "T", "Lvk4;", "event", "Lr37;", "a", "", "b", "Lvk4$a;", "e", "Lvk4$b;", "c", "Lvk4$c;", "d", "", "I", "placeholdersBefore", "placeholdersAfter", "Ljava/util/ArrayDeque;", "Lkw6;", "Ljava/util/ArrayDeque;", "pages", "Ll04;", "Ll04;", "loadStates", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: d42 */
/* compiled from: CachedPageEventFlow.kt */
public final class d42<T> {

    /* renamed from: a */
    public int f10485a;

    /* renamed from: b */
    public int f10486b;

    /* renamed from: c */
    public final ArrayDeque<kw6<T>> f10487c = new ArrayDeque<>();

    /* renamed from: d */
    public final l04 f10488d = new l04();

    /* renamed from: a */
    public final void mo18490a(vk4<T> vk4) {
        vx2.m53591g(vk4, "event");
        if (vk4 instanceof vk4.C3493b) {
            mo18492c((vk4.C3493b) vk4);
        } else if (vk4 instanceof vk4.C3492a) {
            mo18494e((vk4.C3492a) vk4);
        } else if (vk4 instanceof vk4.C3495c) {
            mo18493d((vk4.C3495c) vk4);
        }
    }

    /* renamed from: b */
    public final List<vk4<T>> mo18491b() {
        ArrayList arrayList = new ArrayList();
        if (!this.f10487c.isEmpty()) {
            arrayList.add(vk4.C3493b.f18820g.mo27196c(CollectionsKt___CollectionsKt.m47311K0(this.f10487c), this.f10485a, this.f10486b, this.f10488d.mo22618h()));
        } else {
            l04 l04 = this.f10488d;
            yi3 b = l04.f14397d;
            LoadType loadType = LoadType.REFRESH;
            xi3 g = b.mo28084g();
            vk4.C3495c.C3496a aVar = vk4.C3495c.f18826d;
            if (aVar.mo27204a(g, false)) {
                arrayList.add(new vk4.C3495c(loadType, false, g));
            }
            LoadType loadType2 = LoadType.PREPEND;
            xi3 f = b.mo28083f();
            if (aVar.mo27204a(f, false)) {
                arrayList.add(new vk4.C3495c(loadType2, false, f));
            }
            LoadType loadType3 = LoadType.APPEND;
            xi3 e = b.mo28081e();
            if (aVar.mo27204a(e, false)) {
                arrayList.add(new vk4.C3495c(loadType3, false, e));
            }
            yi3 a = l04.f14398e;
            if (a != null) {
                xi3 g2 = a.mo28084g();
                if (aVar.mo27204a(g2, true)) {
                    arrayList.add(new vk4.C3495c(loadType, true, g2));
                }
                xi3 f2 = a.mo28083f();
                if (aVar.mo27204a(f2, true)) {
                    arrayList.add(new vk4.C3495c(loadType2, true, f2));
                }
                xi3 e2 = a.mo28081e();
                if (aVar.mo27204a(e2, true)) {
                    arrayList.add(new vk4.C3495c(loadType3, true, e2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo18492c(vk4.C3493b<T> bVar) {
        this.f10488d.mo22615e(bVar.mo27186d());
        int i = c42.f8326b[bVar.mo27187e().ordinal()];
        if (i == 1) {
            this.f10487c.clear();
            this.f10486b = bVar.mo27190g();
            this.f10485a = bVar.mo27191h();
            this.f10487c.addAll(bVar.mo27189f());
        } else if (i == 2) {
            this.f10485a = bVar.mo27191h();
            Iterator it = d75.m43392n(bVar.mo27189f().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.f10487c.addFirst(bVar.mo27189f().get(((lw2) it).nextInt()));
            }
        } else if (i == 3) {
            this.f10486b = bVar.mo27190g();
            this.f10487c.addAll(bVar.mo27189f());
        }
    }

    /* renamed from: d */
    public final void mo18493d(vk4.C3495c<T> cVar) {
        this.f10488d.mo22617g(cVar.mo27200c(), cVar.mo27198a(), cVar.mo27199b());
    }

    /* renamed from: e */
    public final void mo18494e(vk4.C3492a<T> aVar) {
        int i = 0;
        this.f10488d.mo22617g(aVar.mo27177a(), false, xi3.C3605c.f19851d.mo27759b());
        int i2 = c42.f8325a[aVar.mo27177a().ordinal()];
        if (i2 == 1) {
            this.f10485a = aVar.mo27181e();
            int d = aVar.mo27180d();
            while (i < d) {
                this.f10487c.removeFirst();
                i++;
            }
        } else if (i2 == 2) {
            this.f10486b = aVar.mo27181e();
            int d2 = aVar.mo27180d();
            while (i < d2) {
                this.f10487c.removeLast();
                i++;
            }
        } else {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
    }
}
