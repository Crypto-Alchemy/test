package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1272c;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: AsyncListDiffer */
public class C1274d<T> {

    /* renamed from: h */
    public static final Executor f6613h = new C1279c();

    /* renamed from: a */
    public final di3 f6614a;

    /* renamed from: b */
    public final C1272c<T> f6615b;

    /* renamed from: c */
    public Executor f6616c;

    /* renamed from: d */
    public final List<C1278b<T>> f6617d;

    /* renamed from: e */
    public List<T> f6618e;

    /* renamed from: f */
    public List<T> f6619f;

    /* renamed from: g */
    public int f6620g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* compiled from: AsyncListDiffer */
    public class C1275a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f6621a;

        /* renamed from: d */
        public final /* synthetic */ List f6622d;

        /* renamed from: e */
        public final /* synthetic */ int f6623e;

        /* renamed from: g */
        public final /* synthetic */ Runnable f6624g;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        /* compiled from: AsyncListDiffer */
        public class C1276a extends C1294g.C1296b {
            public C1276a() {
            }

            public boolean areContentsTheSame(int i, int i2) {
                Object obj = C1275a.this.f6621a.get(i);
                Object obj2 = C1275a.this.f6622d.get(i2);
                if (obj != null && obj2 != null) {
                    return C1274d.this.f6615b.mo9691b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            public boolean areItemsTheSame(int i, int i2) {
                Object obj = C1275a.this.f6621a.get(i);
                Object obj2 = C1275a.this.f6622d.get(i2);
                if (obj != null && obj2 != null) {
                    return C1274d.this.f6615b.mo9691b().areItemsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            public Object getChangePayload(int i, int i2) {
                Object obj = C1275a.this.f6621a.get(i);
                Object obj2 = C1275a.this.f6622d.get(i2);
                if (obj != null && obj2 != null) {
                    return C1274d.this.f6615b.mo9691b().getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            public int getNewListSize() {
                return C1275a.this.f6622d.size();
            }

            public int getOldListSize() {
                return C1275a.this.f6621a.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* compiled from: AsyncListDiffer */
        public class C1277b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C1294g.C1299e f6627a;

            public C1277b(C1294g.C1299e eVar) {
                this.f6627a = eVar;
            }

            public void run() {
                C1275a aVar = C1275a.this;
                C1274d dVar = C1274d.this;
                if (dVar.f6620g == aVar.f6623e) {
                    dVar.mo9696c(aVar.f6622d, this.f6627a, aVar.f6624g);
                }
            }
        }

        public C1275a(List list, List list2, int i, Runnable runnable) {
            this.f6621a = list;
            this.f6622d = list2;
            this.f6623e = i;
            this.f6624g = runnable;
        }

        public void run() {
            C1274d.this.f6616c.execute(new C1277b(C1294g.m9487b(new C1276a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* compiled from: AsyncListDiffer */
    public interface C1278b<T> {
        /* renamed from: a */
        void mo9707a(List<T> list, List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* compiled from: AsyncListDiffer */
    public static class C1279c implements Executor {

        /* renamed from: a */
        public final Handler f6629a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.f6629a.post(runnable);
        }
    }

    public C1274d(RecyclerView.Adapter adapter, C1294g.C1300f<T> fVar) {
        this((di3) new C1271b(adapter), new C1272c.C1273a(fVar).mo9693a());
    }

    /* renamed from: a */
    public void mo9694a(C1278b<T> bVar) {
        this.f6617d.add(bVar);
    }

    /* renamed from: b */
    public List<T> mo9695b() {
        return this.f6619f;
    }

    /* renamed from: c */
    public void mo9696c(List<T> list, C1294g.C1299e eVar, Runnable runnable) {
        List<T> list2 = this.f6619f;
        this.f6618e = list;
        this.f6619f = Collections.unmodifiableList(list);
        eVar.mo9773c(this.f6614a);
        mo9697d(list2, runnable);
    }

    /* renamed from: d */
    public final void mo9697d(List<T> list, Runnable runnable) {
        for (C1278b<T> a : this.f6617d) {
            a.mo9707a(list, this.f6619f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public void mo9698e(List<T> list) {
        mo9699f(list, (Runnable) null);
    }

    /* renamed from: f */
    public void mo9699f(List<T> list, Runnable runnable) {
        int i = this.f6620g + 1;
        this.f6620g = i;
        List<T> list2 = this.f6618e;
        if (list != list2) {
            List<T> list3 = this.f6619f;
            if (list == null) {
                int size = list2.size();
                this.f6618e = null;
                this.f6619f = Collections.emptyList();
                this.f6614a.onRemoved(0, size);
                mo9697d(list3, runnable);
            } else if (list2 == null) {
                this.f6618e = list;
                this.f6619f = Collections.unmodifiableList(list);
                this.f6614a.onInserted(0, list.size());
                mo9697d(list3, runnable);
            } else {
                this.f6615b.mo9690a().execute(new C1275a(list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public C1274d(di3 di3, C1272c<T> cVar) {
        this.f6617d = new CopyOnWriteArrayList();
        this.f6619f = Collections.emptyList();
        this.f6614a = di3;
        this.f6615b = cVar;
        if (cVar.mo9692c() != null) {
            this.f6616c = cVar.mo9692c();
        } else {
            this.f6616c = f6613h;
        }
    }
}
