package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
/* compiled from: OrientationHelper */
public abstract class C1334q {

    /* renamed from: a */
    public final RecyclerView.LayoutManager f6827a;

    /* renamed from: b */
    public int f6828b;

    /* renamed from: c */
    public final Rect f6829c;

    /* renamed from: androidx.recyclerview.widget.q$a */
    /* compiled from: OrientationHelper */
    public class C1335a extends C1334q {
        public C1335a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, (C1335a) null);
        }

        /* renamed from: d */
        public int mo9931d(View view) {
            return this.f6827a.mo9247e0(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo9932e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f6827a.mo9245d0(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: f */
        public int mo9933f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f6827a.mo9244c0(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: g */
        public int mo9934g(View view) {
            return this.f6827a.mo9243b0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo9935h() {
            return this.f6827a.mo9288v0();
        }

        /* renamed from: i */
        public int mo9936i() {
            return this.f6827a.mo9288v0() - this.f6827a.getPaddingRight();
        }

        /* renamed from: j */
        public int mo9937j() {
            return this.f6827a.getPaddingRight();
        }

        /* renamed from: k */
        public int mo9938k() {
            return this.f6827a.mo9290w0();
        }

        /* renamed from: l */
        public int mo9939l() {
            return this.f6827a.mo9258i0();
        }

        /* renamed from: m */
        public int mo9940m() {
            return this.f6827a.getPaddingLeft();
        }

        /* renamed from: n */
        public int mo9941n() {
            return (this.f6827a.mo9288v0() - this.f6827a.getPaddingLeft()) - this.f6827a.getPaddingRight();
        }

        /* renamed from: p */
        public int mo9943p(View view) {
            this.f6827a.mo9286u0(view, true, this.f6829c);
            return this.f6829c.right;
        }

        /* renamed from: q */
        public int mo9944q(View view) {
            this.f6827a.mo9286u0(view, true, this.f6829c);
            return this.f6829c.left;
        }

        /* renamed from: r */
        public void mo9945r(int i) {
            this.f6827a.mo9215K0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    /* compiled from: OrientationHelper */
    public class C1336b extends C1334q {
        public C1336b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, (C1335a) null);
        }

        /* renamed from: d */
        public int mo9931d(View view) {
            return this.f6827a.mo9241Z(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo9932e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f6827a.mo9244c0(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: f */
        public int mo9933f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f6827a.mo9245d0(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: g */
        public int mo9934g(View view) {
            return this.f6827a.mo9248f0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo9935h() {
            return this.f6827a.mo9256h0();
        }

        /* renamed from: i */
        public int mo9936i() {
            return this.f6827a.mo9256h0() - this.f6827a.getPaddingBottom();
        }

        /* renamed from: j */
        public int mo9937j() {
            return this.f6827a.getPaddingBottom();
        }

        /* renamed from: k */
        public int mo9938k() {
            return this.f6827a.mo9258i0();
        }

        /* renamed from: l */
        public int mo9939l() {
            return this.f6827a.mo9290w0();
        }

        /* renamed from: m */
        public int mo9940m() {
            return this.f6827a.getPaddingTop();
        }

        /* renamed from: n */
        public int mo9941n() {
            return (this.f6827a.mo9256h0() - this.f6827a.getPaddingTop()) - this.f6827a.getPaddingBottom();
        }

        /* renamed from: p */
        public int mo9943p(View view) {
            this.f6827a.mo9286u0(view, true, this.f6829c);
            return this.f6829c.bottom;
        }

        /* renamed from: q */
        public int mo9944q(View view) {
            this.f6827a.mo9286u0(view, true, this.f6829c);
            return this.f6829c.top;
        }

        /* renamed from: r */
        public void mo9945r(int i) {
            this.f6827a.mo9218L0(i);
        }
    }

    public /* synthetic */ C1334q(RecyclerView.LayoutManager layoutManager, C1335a aVar) {
        this(layoutManager);
    }

    /* renamed from: a */
    public static C1334q m9642a(RecyclerView.LayoutManager layoutManager) {
        return new C1335a(layoutManager);
    }

    /* renamed from: b */
    public static C1334q m9643b(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return m9642a(layoutManager);
        }
        if (i == 1) {
            return m9644c(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C1334q m9644c(RecyclerView.LayoutManager layoutManager) {
        return new C1336b(layoutManager);
    }

    /* renamed from: d */
    public abstract int mo9931d(View view);

    /* renamed from: e */
    public abstract int mo9932e(View view);

    /* renamed from: f */
    public abstract int mo9933f(View view);

    /* renamed from: g */
    public abstract int mo9934g(View view);

    /* renamed from: h */
    public abstract int mo9935h();

    /* renamed from: i */
    public abstract int mo9936i();

    /* renamed from: j */
    public abstract int mo9937j();

    /* renamed from: k */
    public abstract int mo9938k();

    /* renamed from: l */
    public abstract int mo9939l();

    /* renamed from: m */
    public abstract int mo9940m();

    /* renamed from: n */
    public abstract int mo9941n();

    /* renamed from: o */
    public int mo9942o() {
        if (Integer.MIN_VALUE == this.f6828b) {
            return 0;
        }
        return mo9941n() - this.f6828b;
    }

    /* renamed from: p */
    public abstract int mo9943p(View view);

    /* renamed from: q */
    public abstract int mo9944q(View view);

    /* renamed from: r */
    public abstract void mo9945r(int i);

    /* renamed from: s */
    public void mo9946s() {
        this.f6828b = mo9941n();
    }

    public C1334q(RecyclerView.LayoutManager layoutManager) {
        this.f6828b = Integer.MIN_VALUE;
        this.f6829c = new Rect();
        this.f6827a = layoutManager;
    }
}
