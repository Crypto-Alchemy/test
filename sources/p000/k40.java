package p000;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: k40 */
/* compiled from: BucketMap */
public class k40<T> {

    /* renamed from: a */
    public final SparseArray<C2642b<T>> f13965a = new SparseArray<>();

    /* renamed from: b */
    public C2642b<T> f13966b;

    /* renamed from: c */
    public C2642b<T> f13967c;

    /* renamed from: k40$b */
    /* compiled from: BucketMap */
    public static class C2642b<I> {

        /* renamed from: a */
        public C2642b<I> f13968a;

        /* renamed from: b */
        public int f13969b;

        /* renamed from: c */
        public LinkedList<I> f13970c;

        /* renamed from: d */
        public C2642b<I> f13971d;

        public String toString() {
            return "LinkedEntry(key: " + this.f13969b + ")";
        }

        public C2642b(C2642b<I> bVar, int i, LinkedList<I> linkedList, C2642b<I> bVar2) {
            this.f13968a = bVar;
            this.f13969b = i;
            this.f13970c = linkedList;
            this.f13971d = bVar2;
        }
    }

    /* renamed from: a */
    public synchronized T mo22178a(int i) {
        C2642b bVar = this.f13965a.get(i);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f13970c.pollFirst();
        mo22180c(bVar);
        return pollFirst;
    }

    /* renamed from: b */
    public final void mo22179b(C2642b<T> bVar) {
        if (bVar != null && bVar.f13970c.isEmpty()) {
            mo22181d(bVar);
            this.f13965a.remove(bVar.f13969b);
        }
    }

    /* renamed from: c */
    public final void mo22180c(C2642b<T> bVar) {
        if (this.f13966b != bVar) {
            mo22181d(bVar);
            C2642b<T> bVar2 = this.f13966b;
            if (bVar2 == null) {
                this.f13966b = bVar;
                this.f13967c = bVar;
                return;
            }
            bVar.f13971d = bVar2;
            bVar2.f13968a = bVar;
            this.f13966b = bVar;
        }
    }

    /* renamed from: d */
    public final synchronized void mo22181d(C2642b<T> bVar) {
        C2642b<I> bVar2 = bVar.f13968a;
        C2642b<I> bVar3 = bVar.f13971d;
        if (bVar2 != null) {
            bVar2.f13971d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f13968a = bVar2;
        }
        bVar.f13968a = null;
        bVar.f13971d = null;
        if (bVar == this.f13966b) {
            this.f13966b = bVar3;
        }
        if (bVar == this.f13967c) {
            this.f13967c = bVar2;
        }
    }

    /* renamed from: e */
    public synchronized void mo22182e(int i, T t) {
        C2642b bVar = this.f13965a.get(i);
        if (bVar == null) {
            bVar = new C2642b((C2642b) null, i, new LinkedList(), (C2642b) null);
            this.f13965a.put(i, bVar);
        }
        bVar.f13970c.addLast(t);
        mo22180c(bVar);
    }

    /* renamed from: f */
    public synchronized T mo22183f() {
        C2642b<T> bVar = this.f13967c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f13970c.pollLast();
        mo22179b(bVar);
        return pollLast;
    }
}
