package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: DiffUtil */
public class C1294g {

    /* renamed from: a */
    public static final Comparator<C1298d> f6674a = new C1295a();

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* compiled from: DiffUtil */
    public class C1295a implements Comparator<C1298d> {
        /* renamed from: a */
        public int compare(C1298d dVar, C1298d dVar2) {
            return dVar.f6677a - dVar2.f6677a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* compiled from: DiffUtil */
    public static abstract class C1296b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* compiled from: DiffUtil */
    public static class C1297c {

        /* renamed from: a */
        public final int[] f6675a;

        /* renamed from: b */
        public final int f6676b;

        public C1297c(int i) {
            int[] iArr = new int[i];
            this.f6675a = iArr;
            this.f6676b = iArr.length / 2;
        }

        /* renamed from: a */
        public int[] mo9766a() {
            return this.f6675a;
        }

        /* renamed from: b */
        public int mo9767b(int i) {
            return this.f6675a[i + this.f6676b];
        }

        /* renamed from: c */
        public void mo9768c(int i, int i2) {
            this.f6675a[i + this.f6676b] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* compiled from: DiffUtil */
    public static class C1298d {

        /* renamed from: a */
        public final int f6677a;

        /* renamed from: b */
        public final int f6678b;

        /* renamed from: c */
        public final int f6679c;

        public C1298d(int i, int i2, int i3) {
            this.f6677a = i;
            this.f6678b = i2;
            this.f6679c = i3;
        }

        /* renamed from: a */
        public int mo9769a() {
            return this.f6677a + this.f6679c;
        }

        /* renamed from: b */
        public int mo9770b() {
            return this.f6678b + this.f6679c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    /* compiled from: DiffUtil */
    public static class C1299e {

        /* renamed from: a */
        public final List<C1298d> f6680a;

        /* renamed from: b */
        public final int[] f6681b;

        /* renamed from: c */
        public final int[] f6682c;

        /* renamed from: d */
        public final C1296b f6683d;

        /* renamed from: e */
        public final int f6684e;

        /* renamed from: f */
        public final int f6685f;

        /* renamed from: g */
        public final boolean f6686g;

        public C1299e(C1296b bVar, List<C1298d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f6680a = list;
            this.f6681b = iArr;
            this.f6682c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f6683d = bVar;
            this.f6684e = bVar.getOldListSize();
            this.f6685f = bVar.getNewListSize();
            this.f6686g = z;
            mo9771a();
            mo9775e();
        }

        /* renamed from: g */
        public static C1301g m9497g(Collection<C1301g> collection, int i, boolean z) {
            C1301g gVar;
            Iterator<C1301g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f6687a == i && gVar.f6689c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C1301g next = it.next();
                if (z) {
                    next.f6688b--;
                } else {
                    next.f6688b++;
                }
            }
            return gVar;
        }

        /* renamed from: a */
        public final void mo9771a() {
            C1298d dVar;
            if (this.f6680a.isEmpty()) {
                dVar = null;
            } else {
                dVar = this.f6680a.get(0);
            }
            if (!(dVar != null && dVar.f6677a == 0 && dVar.f6678b == 0)) {
                this.f6680a.add(0, new C1298d(0, 0, 0));
            }
            this.f6680a.add(new C1298d(this.f6684e, this.f6685f, 0));
        }

        /* renamed from: b */
        public int mo9772b(int i) {
            if (i < 0 || i >= this.f6684e) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f6684e);
            }
            int i2 = this.f6681b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        /* renamed from: c */
        public void mo9773c(di3 di3) {
            g00 g00;
            int i;
            if (di3 instanceof g00) {
                g00 = (g00) di3;
            } else {
                g00 = new g00(di3);
            }
            int i2 = this.f6684e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f6684e;
            int i4 = this.f6685f;
            for (int size = this.f6680a.size() - 1; size >= 0; size--) {
                C1298d dVar = this.f6680a.get(size);
                int a = dVar.mo9769a();
                int b = dVar.mo9770b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f6681b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C1301g g = m9497g(arrayDeque, i6, false);
                        if (g != null) {
                            int i7 = (i2 - g.f6688b) - 1;
                            g00.onMoved(i3, i7);
                            if ((i5 & 4) != 0) {
                                g00.onChanged(i7, 1, this.f6683d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C1301g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        g00.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.f6682c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C1301g g2 = m9497g(arrayDeque, i9, true);
                        if (g2 == null) {
                            arrayDeque.add(new C1301g(i4, i2 - i3, false));
                        } else {
                            g00.onMoved((i2 - g2.f6688b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                g00.onChanged(i3, 1, this.f6683d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        g00.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.f6677a;
                int i11 = dVar.f6678b;
                for (i = 0; i < dVar.f6679c; i++) {
                    if ((this.f6681b[i10] & 15) == 2) {
                        g00.onChanged(i10, 1, this.f6683d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.f6677a;
                i4 = dVar.f6678b;
            }
            g00.mo20307a();
        }

        /* renamed from: d */
        public final void mo9774d(int i) {
            int i2;
            int size = this.f6680a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C1298d dVar = this.f6680a.get(i4);
                while (i3 < dVar.f6678b) {
                    if (this.f6682c[i3] != 0 || !this.f6683d.areItemsTheSame(i, i3)) {
                        i3++;
                    } else {
                        if (this.f6683d.areContentsTheSame(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.f6681b[i] = (i3 << 4) | i2;
                        this.f6682c[i3] = (i << 4) | i2;
                        return;
                    }
                }
                i3 = dVar.mo9770b();
            }
        }

        /* renamed from: e */
        public final void mo9775e() {
            int i;
            for (C1298d next : this.f6680a) {
                for (int i2 = 0; i2 < next.f6679c; i2++) {
                    int i3 = next.f6677a + i2;
                    int i4 = next.f6678b + i2;
                    if (this.f6683d.areContentsTheSame(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f6681b[i3] = (i4 << 4) | i;
                    this.f6682c[i4] = (i3 << 4) | i;
                }
            }
            if (this.f6686g) {
                mo9776f();
            }
        }

        /* renamed from: f */
        public final void mo9776f() {
            int i = 0;
            for (C1298d next : this.f6680a) {
                while (i < next.f6677a) {
                    if (this.f6681b[i] == 0) {
                        mo9774d(i);
                    }
                    i++;
                }
                i = next.mo9769a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    /* compiled from: DiffUtil */
    public static abstract class C1300f<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    /* compiled from: DiffUtil */
    public static class C1301g {

        /* renamed from: a */
        public int f6687a;

        /* renamed from: b */
        public int f6688b;

        /* renamed from: c */
        public boolean f6689c;

        public C1301g(int i, int i2, boolean z) {
            this.f6687a = i;
            this.f6688b = i2;
            this.f6689c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$h */
    /* compiled from: DiffUtil */
    public static class C1302h {

        /* renamed from: a */
        public int f6690a;

        /* renamed from: b */
        public int f6691b;

        /* renamed from: c */
        public int f6692c;

        /* renamed from: d */
        public int f6693d;

        public C1302h() {
        }

        /* renamed from: a */
        public int mo9780a() {
            return this.f6693d - this.f6692c;
        }

        /* renamed from: b */
        public int mo9781b() {
            return this.f6691b - this.f6690a;
        }

        public C1302h(int i, int i2, int i3, int i4) {
            this.f6690a = i;
            this.f6691b = i2;
            this.f6692c = i3;
            this.f6693d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$i */
    /* compiled from: DiffUtil */
    public static class C1303i {

        /* renamed from: a */
        public int f6694a;

        /* renamed from: b */
        public int f6695b;

        /* renamed from: c */
        public int f6696c;

        /* renamed from: d */
        public int f6697d;

        /* renamed from: e */
        public boolean f6698e;

        /* renamed from: a */
        public int mo9782a() {
            return Math.min(this.f6696c - this.f6694a, this.f6697d - this.f6695b);
        }

        /* renamed from: b */
        public boolean mo9783b() {
            if (this.f6697d - this.f6695b != this.f6696c - this.f6694a) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo9784c() {
            if (this.f6697d - this.f6695b > this.f6696c - this.f6694a) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public C1298d mo9785d() {
            if (!mo9783b()) {
                int i = this.f6694a;
                return new C1298d(i, this.f6695b, this.f6696c - i);
            } else if (this.f6698e) {
                return new C1298d(this.f6694a, this.f6695b, mo9782a());
            } else {
                if (mo9784c()) {
                    return new C1298d(this.f6694a, this.f6695b + 1, mo9782a());
                }
                return new C1298d(this.f6694a + 1, this.f6695b, mo9782a());
            }
        }
    }

    /* renamed from: a */
    public static C1303i m9486a(C1302h hVar, C1296b bVar, C1297c cVar, C1297c cVar2, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        if ((hVar.mo9781b() - hVar.mo9780a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int b = hVar.mo9781b() - hVar.mo9780a();
        int i6 = -i;
        int i7 = i6;
        while (i7 <= i) {
            if (i7 == i6 || (i7 != i && cVar2.mo9767b(i7 + 1) < cVar2.mo9767b(i7 - 1))) {
                i3 = cVar2.mo9767b(i7 + 1);
                i2 = i3;
            } else {
                i3 = cVar2.mo9767b(i7 - 1);
                i2 = i3 - 1;
            }
            int i8 = hVar.f6693d - ((hVar.f6691b - i2) - i7);
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 + 1;
            }
            while (i2 > hVar.f6690a && i8 > hVar.f6692c && bVar.areItemsTheSame(i2 - 1, i8 - 1)) {
                i2--;
                i8--;
            }
            cVar2.mo9768c(i7, i2);
            if (!z || (i5 = b - i7) < i6 || i5 > i || cVar.mo9767b(i5) < i2) {
                i7 += 2;
            } else {
                C1303i iVar = new C1303i();
                iVar.f6694a = i2;
                iVar.f6695b = i8;
                iVar.f6696c = i3;
                iVar.f6697d = i4;
                iVar.f6698e = true;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1299e m9487b(C1296b bVar) {
        return m9488c(bVar, true);
    }

    /* renamed from: c */
    public static C1299e m9488c(C1296b bVar, boolean z) {
        C1302h hVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1302h(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        C1297c cVar = new C1297c(i);
        C1297c cVar2 = new C1297c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1302h hVar2 = (C1302h) arrayList2.remove(arrayList2.size() - 1);
            C1303i e = m9490e(hVar2, bVar, cVar, cVar2);
            if (e != null) {
                if (e.mo9782a() > 0) {
                    arrayList.add(e.mo9785d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new C1302h();
                } else {
                    hVar = (C1302h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f6690a = hVar2.f6690a;
                hVar.f6692c = hVar2.f6692c;
                hVar.f6691b = e.f6694a;
                hVar.f6693d = e.f6695b;
                arrayList2.add(hVar);
                hVar2.f6691b = hVar2.f6691b;
                hVar2.f6693d = hVar2.f6693d;
                hVar2.f6690a = e.f6696c;
                hVar2.f6692c = e.f6697d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f6674a);
        return new C1299e(bVar, arrayList, cVar.mo9766a(), cVar2.mo9766a(), z);
    }

    /* renamed from: d */
    public static C1303i m9489d(C1302h hVar, C1296b bVar, C1297c cVar, C1297c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = true;
        if (Math.abs(hVar.mo9781b() - hVar.mo9780a()) % 2 != 1) {
            z = false;
        }
        int b = hVar.mo9781b() - hVar.mo9780a();
        int i6 = -i;
        int i7 = i6;
        while (i7 <= i) {
            if (i7 == i6 || (i7 != i && cVar.mo9767b(i7 + 1) > cVar.mo9767b(i7 - 1))) {
                i3 = cVar.mo9767b(i7 + 1);
                i2 = i3;
            } else {
                i3 = cVar.mo9767b(i7 - 1);
                i2 = i3 + 1;
            }
            int i8 = (hVar.f6692c + (i2 - hVar.f6690a)) - i7;
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 - 1;
            }
            while (i2 < hVar.f6691b && i8 < hVar.f6693d && bVar.areItemsTheSame(i2, i8)) {
                i2++;
                i8++;
            }
            cVar.mo9768c(i7, i2);
            if (!z || (i5 = b - i7) < i6 + 1 || i5 > i - 1 || cVar2.mo9767b(i5) > i2) {
                i7 += 2;
            } else {
                C1303i iVar = new C1303i();
                iVar.f6694a = i3;
                iVar.f6695b = i4;
                iVar.f6696c = i2;
                iVar.f6697d = i8;
                iVar.f6698e = false;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C1303i m9490e(C1302h hVar, C1296b bVar, C1297c cVar, C1297c cVar2) {
        if (hVar.mo9781b() >= 1 && hVar.mo9780a() >= 1) {
            int b = ((hVar.mo9781b() + hVar.mo9780a()) + 1) / 2;
            cVar.mo9768c(1, hVar.f6690a);
            cVar2.mo9768c(1, hVar.f6691b);
            for (int i = 0; i < b; i++) {
                C1303i d = m9489d(hVar, bVar, cVar, cVar2, i);
                if (d != null) {
                    return d;
                }
                C1303i a = m9486a(hVar, bVar, cVar, cVar2, i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
