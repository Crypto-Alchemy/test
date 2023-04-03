package p000;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p000.C0028al;
import p000.kl1;

/* renamed from: kl1 */
/* compiled from: DynamicAnimation */
public abstract class kl1<T extends kl1<T>> implements C0028al.C0030b {

    /* renamed from: m */
    public static final C2706r f14145m = new C2694f("translationX");

    /* renamed from: n */
    public static final C2706r f14146n = new C2695g("translationY");

    /* renamed from: o */
    public static final C2706r f14147o = new C2696h("translationZ");

    /* renamed from: p */
    public static final C2706r f14148p = new C2697i("scaleX");

    /* renamed from: q */
    public static final C2706r f14149q = new C2698j("scaleY");

    /* renamed from: r */
    public static final C2706r f14150r = new C2699k("rotation");

    /* renamed from: s */
    public static final C2706r f14151s = new C2700l("rotationX");

    /* renamed from: t */
    public static final C2706r f14152t = new C2701m("rotationY");

    /* renamed from: u */
    public static final C2706r f14153u = new C2702n("x");

    /* renamed from: v */
    public static final C2706r f14154v = new C2689a("y");

    /* renamed from: w */
    public static final C2706r f14155w = new C2690b("z");

    /* renamed from: x */
    public static final C2706r f14156x = new C2691c("alpha");

    /* renamed from: y */
    public static final C2706r f14157y = new C2692d("scrollX");

    /* renamed from: z */
    public static final C2706r f14158z = new C2693e("scrollY");

    /* renamed from: a */
    public float f14159a = Utils.FLOAT_EPSILON;

    /* renamed from: b */
    public float f14160b = Float.MAX_VALUE;

    /* renamed from: c */
    public boolean f14161c = false;

    /* renamed from: d */
    public final Object f14162d;

    /* renamed from: e */
    public final s42 f14163e;

    /* renamed from: f */
    public boolean f14164f = false;

    /* renamed from: g */
    public float f14165g = Float.MAX_VALUE;

    /* renamed from: h */
    public float f14166h = (-Float.MAX_VALUE);

    /* renamed from: i */
    public long f14167i = 0;

    /* renamed from: j */
    public float f14168j;

    /* renamed from: k */
    public final ArrayList<C2704p> f14169k = new ArrayList<>();

    /* renamed from: l */
    public final ArrayList<C2705q> f14170l = new ArrayList<>();

    /* renamed from: kl1$a */
    /* compiled from: DynamicAnimation */
    public static class C2689a extends C2706r {
        public C2689a(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getY();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: kl1$b */
    /* compiled from: DynamicAnimation */
    public static class C2690b extends C2706r {
        public C2690b(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return ga7.m17739N(view);
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            ga7.m17738M0(view, f);
        }
    }

    /* renamed from: kl1$c */
    /* compiled from: DynamicAnimation */
    public static class C2691c extends C2706r {
        public C2691c(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: kl1$d */
    /* compiled from: DynamicAnimation */
    public static class C2692d extends C2706r {
        public C2692d(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: kl1$e */
    /* compiled from: DynamicAnimation */
    public static class C2693e extends C2706r {
        public C2693e(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: kl1$f */
    /* compiled from: DynamicAnimation */
    public static class C2694f extends C2706r {
        public C2694f(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getTranslationX();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: kl1$g */
    /* compiled from: DynamicAnimation */
    public static class C2695g extends C2706r {
        public C2695g(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getTranslationY();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: kl1$h */
    /* compiled from: DynamicAnimation */
    public static class C2696h extends C2706r {
        public C2696h(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return ga7.m17735L(view);
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            ga7.m17734K0(view, f);
        }
    }

    /* renamed from: kl1$i */
    /* compiled from: DynamicAnimation */
    public static class C2697i extends C2706r {
        public C2697i(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: kl1$j */
    /* compiled from: DynamicAnimation */
    public static class C2698j extends C2706r {
        public C2698j(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: kl1$k */
    /* compiled from: DynamicAnimation */
    public static class C2699k extends C2706r {
        public C2699k(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: kl1$l */
    /* compiled from: DynamicAnimation */
    public static class C2700l extends C2706r {
        public C2700l(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: kl1$m */
    /* compiled from: DynamicAnimation */
    public static class C2701m extends C2706r {
        public C2701m(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: kl1$n */
    /* compiled from: DynamicAnimation */
    public static class C2702n extends C2706r {
        public C2702n(String str) {
            super(str, (C2694f) null);
        }

        /* renamed from: c */
        public float mo22353a(View view) {
            return view.getX();
        }

        /* renamed from: d */
        public void mo22354b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: kl1$o */
    /* compiled from: DynamicAnimation */
    public static class C2703o {

        /* renamed from: a */
        public float f14171a;

        /* renamed from: b */
        public float f14172b;
    }

    /* renamed from: kl1$p */
    /* compiled from: DynamicAnimation */
    public interface C2704p {
        /* renamed from: a */
        void mo22383a(kl1 kl1, boolean z, float f, float f2);
    }

    /* renamed from: kl1$q */
    /* compiled from: DynamicAnimation */
    public interface C2705q {
        /* renamed from: a */
        void mo22384a(kl1 kl1, float f, float f2);
    }

    /* renamed from: kl1$r */
    /* compiled from: DynamicAnimation */
    public static abstract class C2706r extends s42<View> {
        public /* synthetic */ C2706r(String str, C2694f fVar) {
            this(str);
        }

        public C2706r(String str) {
            super(str);
        }
    }

    public <K> kl1(K k, s42<K> s42) {
        this.f14162d = k;
        this.f14163e = s42;
        if (s42 == f14150r || s42 == f14151s || s42 == f14152t) {
            this.f14168j = 0.1f;
        } else if (s42 == f14156x) {
            this.f14168j = 0.00390625f;
        } else if (s42 == f14148p || s42 == f14149q) {
            this.f14168j = 0.00390625f;
        } else {
            this.f14168j = 1.0f;
        }
    }

    /* renamed from: g */
    public static <T> void m20820g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: a */
    public boolean mo354a(long j) {
        long j2 = this.f14167i;
        if (j2 == 0) {
            this.f14167i = j;
            mo22350h(this.f14160b);
            return false;
        }
        this.f14167i = j;
        boolean l = mo20976l(j - j2);
        float min = Math.min(this.f14160b, this.f14165g);
        this.f14160b = min;
        float max = Math.max(min, this.f14166h);
        this.f14160b = max;
        mo22350h(max);
        if (l) {
            mo22346c(false);
        }
        return l;
    }

    /* renamed from: b */
    public void mo22345b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f14164f) {
            mo22346c(true);
        }
    }

    /* renamed from: c */
    public final void mo22346c(boolean z) {
        this.f14164f = false;
        C0028al.m340d().mo352g(this);
        this.f14167i = 0;
        this.f14161c = false;
        for (int i = 0; i < this.f14169k.size(); i++) {
            if (this.f14169k.get(i) != null) {
                this.f14169k.get(i).mo22383a(this, z, this.f14160b, this.f14159a);
            }
        }
        m20820g(this.f14169k);
    }

    /* renamed from: d */
    public final float mo22347d() {
        return this.f14163e.mo22353a(this.f14162d);
    }

    /* renamed from: e */
    public float mo22348e() {
        return this.f14168j * 0.75f;
    }

    /* renamed from: f */
    public boolean mo22349f() {
        return this.f14164f;
    }

    /* renamed from: h */
    public void mo22350h(float f) {
        this.f14163e.mo22354b(this.f14162d, f);
        for (int i = 0; i < this.f14170l.size(); i++) {
            if (this.f14170l.get(i) != null) {
                this.f14170l.get(i).mo22384a(this, this.f14160b, this.f14159a);
            }
        }
        m20820g(this.f14170l);
    }

    /* renamed from: i */
    public T mo22351i(float f) {
        this.f14160b = f;
        this.f14161c = true;
        return this;
    }

    /* renamed from: j */
    public void mo20975j() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f14164f) {
            mo22352k();
        }
    }

    /* renamed from: k */
    public final void mo22352k() {
        if (!this.f14164f) {
            this.f14164f = true;
            if (!this.f14161c) {
                this.f14160b = mo22347d();
            }
            float f = this.f14160b;
            if (f > this.f14165g || f < this.f14166h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C0028al.m340d().mo347a(this, 0);
        }
    }

    /* renamed from: l */
    public abstract boolean mo20976l(long j);
}
