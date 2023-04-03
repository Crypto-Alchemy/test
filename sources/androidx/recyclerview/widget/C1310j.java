package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.j */
/* compiled from: GapWorker */
public final class C1310j implements Runnable {

    /* renamed from: k */
    public static final ThreadLocal<C1310j> f6739k = new ThreadLocal<>();

    /* renamed from: r */
    public static Comparator<C1313c> f6740r = new C1311a();

    /* renamed from: a */
    public ArrayList<RecyclerView> f6741a = new ArrayList<>();

    /* renamed from: d */
    public long f6742d;

    /* renamed from: e */
    public long f6743e;

    /* renamed from: g */
    public ArrayList<C1313c> f6744g = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* compiled from: GapWorker */
    public class C1311a implements Comparator<C1313c> {
        /* renamed from: a */
        public int compare(C1313c cVar, C1313c cVar2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = cVar.f6752d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (cVar2.f6752d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                boolean z3 = cVar.f6749a;
                if (z3 == cVar2.f6749a) {
                    int i = cVar2.f6750b - cVar.f6750b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar.f6751c - cVar2.f6751c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.j$b */
    /* compiled from: GapWorker */
    public static class C1312b implements RecyclerView.LayoutManager.C1228c {

        /* renamed from: a */
        public int f6745a;

        /* renamed from: b */
        public int f6746b;

        /* renamed from: c */
        public int[] f6747c;

        /* renamed from: d */
        public int f6748d;

        /* renamed from: a */
        public void mo9302a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f6748d * 2;
                int[] iArr = this.f6747c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f6747c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f6747c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f6747c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f6748d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public void mo9825b() {
            int[] iArr = this.f6747c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6748d = 0;
        }

        /* renamed from: c */
        public void mo9826c(RecyclerView recyclerView, boolean z) {
            this.f6748d = 0;
            int[] iArr = this.f6747c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.f6382H;
            if (recyclerView.f6376C != null && layoutManager != null && layoutManager.mo9197B0()) {
                if (z) {
                    if (!recyclerView.f6420g.mo9671p()) {
                        layoutManager.mo8873A(recyclerView.f6376C.getItemCount(), this);
                    }
                } else if (!recyclerView.mo9109q0()) {
                    layoutManager.mo8934z(this.f6745a, this.f6746b, recyclerView.f6403V1, this);
                }
                int i = this.f6748d;
                if (i > layoutManager.f6453H) {
                    layoutManager.f6453H = i;
                    layoutManager.f6454I = z;
                    recyclerView.f6413d.mo9469K();
                }
            }
        }

        /* renamed from: d */
        public boolean mo9827d(int i) {
            if (this.f6747c != null) {
                int i2 = this.f6748d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f6747c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo9828e(int i, int i2) {
            this.f6745a = i;
            this.f6746b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    /* compiled from: GapWorker */
    public static class C1313c {

        /* renamed from: a */
        public boolean f6749a;

        /* renamed from: b */
        public int f6750b;

        /* renamed from: c */
        public int f6751c;

        /* renamed from: d */
        public RecyclerView f6752d;

        /* renamed from: e */
        public int f6753e;

        /* renamed from: a */
        public void mo9829a() {
            this.f6749a = false;
            this.f6750b = 0;
            this.f6751c = 0;
            this.f6752d = null;
            this.f6753e = 0;
        }
    }

    /* renamed from: e */
    public static boolean m9536e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f6425k.mo9718j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C1231a0 i0 = RecyclerView.m8852i0(recyclerView.f6425k.mo9717i(i2));
            if (i0.mPosition == i && !i0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo9813a(RecyclerView recyclerView) {
        this.f6741a.add(recyclerView);
    }

    /* renamed from: b */
    public final void mo9814b() {
        C1313c cVar;
        boolean z;
        int size = this.f6741a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f6741a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f6402U1.mo9826c(recyclerView, false);
                i += recyclerView.f6402U1.f6748d;
            }
        }
        this.f6744g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f6741a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1312b bVar = recyclerView2.f6402U1;
                int abs = Math.abs(bVar.f6745a) + Math.abs(bVar.f6746b);
                for (int i5 = 0; i5 < bVar.f6748d * 2; i5 += 2) {
                    if (i3 >= this.f6744g.size()) {
                        cVar = new C1313c();
                        this.f6744g.add(cVar);
                    } else {
                        cVar = this.f6744g.get(i3);
                    }
                    int[] iArr = bVar.f6747c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f6749a = z;
                    cVar.f6750b = abs;
                    cVar.f6751c = i6;
                    cVar.f6752d = recyclerView2;
                    cVar.f6753e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f6744g, f6740r);
    }

    /* renamed from: c */
    public final void mo9815c(C1313c cVar, long j) {
        long j2;
        if (cVar.f6749a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.C1231a0 i = mo9820i(cVar.f6752d, cVar.f6753e, j2);
        if (i != null && i.mNestedRecyclerView != null && i.isBound() && !i.isInvalid()) {
            mo9819h(i.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    public final void mo9816d(long j) {
        int i = 0;
        while (i < this.f6744g.size()) {
            C1313c cVar = this.f6744g.get(i);
            if (cVar.f6752d != null) {
                mo9815c(cVar, j);
                cVar.mo9829a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo9817f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f6742d == 0) {
            this.f6742d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f6402U1.mo9828e(i, i2);
    }

    /* renamed from: g */
    public void mo9818g(long j) {
        mo9814b();
        mo9816d(j);
    }

    /* renamed from: h */
    public final void mo9819h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f6440u1 && recyclerView.f6425k.mo9718j() != 0) {
                recyclerView.mo9012Z0();
            }
            C1312b bVar = recyclerView.f6402U1;
            bVar.mo9826c(recyclerView, true);
            if (bVar.f6748d != 0) {
                try {
                    os6.m24033a("RV Nested Prefetch");
                    recyclerView.f6403V1.mo9529f(recyclerView.f6376C);
                    for (int i = 0; i < bVar.f6748d * 2; i += 2) {
                        mo9820i(recyclerView, bVar.f6747c[i], j);
                    }
                } finally {
                    os6.m24034b();
                }
            }
        }
    }

    /* renamed from: i */
    public final RecyclerView.C1231a0 mo9820i(RecyclerView recyclerView, int i, long j) {
        if (m9536e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1254t tVar = recyclerView.f6413d;
        try {
            recyclerView.mo8985L0();
            RecyclerView.C1231a0 I = tVar.mo9467I(i, false, j);
            if (I != null) {
                if (!I.isBound() || I.isInvalid()) {
                    tVar.mo9472a(I, false);
                } else {
                    tVar.mo9460B(I.itemView);
                }
            }
            return I;
        } finally {
            recyclerView.mo8989N0(false);
        }
    }

    /* renamed from: j */
    public void mo9821j(RecyclerView recyclerView) {
        this.f6741a.remove(recyclerView);
    }

    public void run() {
        try {
            os6.m24033a("RV Prefetch");
            if (!this.f6741a.isEmpty()) {
                int size = this.f6741a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f6741a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo9818g(TimeUnit.MILLISECONDS.toNanos(j) + this.f6743e);
                    this.f6742d = 0;
                    os6.m24034b();
                }
            }
        } finally {
            this.f6742d = 0;
            os6.m24034b();
        }
    }
}
