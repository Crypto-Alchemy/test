package p000;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nk */
/* compiled from: AnimatedImageFactoryImpl */
public class C2903nk implements C2840mk {

    /* renamed from: c */
    public static C2761lk f15574c = m23244g("com.facebook.animated.gif.GifImage");

    /* renamed from: d */
    public static C2761lk f15575d = m23244g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a */
    public final C2297fk f15576a;

    /* renamed from: b */
    public final xo4 f15577b;

    /* renamed from: nk$a */
    /* compiled from: AnimatedImageFactoryImpl */
    public class C2904a implements AnimatedImageCompositor.C1944b {
        public C2904a() {
        }

        /* renamed from: a */
        public void mo13325a(int i, Bitmap bitmap) {
        }

        /* renamed from: b */
        public nh0<Bitmap> mo13326b(int i) {
            return null;
        }
    }

    /* renamed from: nk$b */
    /* compiled from: AnimatedImageFactoryImpl */
    public class C2905b implements AnimatedImageCompositor.C1944b {

        /* renamed from: a */
        public final /* synthetic */ List f15579a;

        public C2905b(List list) {
            this.f15579a = list;
        }

        /* renamed from: a */
        public void mo13325a(int i, Bitmap bitmap) {
        }

        /* renamed from: b */
        public nh0<Bitmap> mo13326b(int i) {
            return nh0.m23176f((nh0) this.f15579a.get(i));
        }
    }

    public C2903nk(C2297fk fkVar, xo4 xo4) {
        this.f15576a = fkVar;
        this.f15577b = xo4;
    }

    /* renamed from: g */
    public static C2761lk m23244g(String str) {
        try {
            return (C2761lk) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public kh0 mo23205a(gp1 gp1, lq2 lq2, Bitmap.Config config) {
        C2687kk kkVar;
        if (f15575d != null) {
            nh0<PooledByteBuffer> e = gp1.mo20745e();
            au4.m10792g(e);
            try {
                PooledByteBuffer j = e.mo23684j();
                if (j.mo13168u() != null) {
                    kkVar = f15575d.mo13073e(j.mo13168u(), lq2);
                } else {
                    kkVar = f15575d.mo13072d(j.mo13164B(), j.size(), lq2);
                }
                return mo23711f(lq2, kkVar, config);
            } finally {
                nh0.m23178h(e);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }

    /* renamed from: b */
    public kh0 mo23206b(gp1 gp1, lq2 lq2, Bitmap.Config config) {
        C2687kk kkVar;
        if (f15574c != null) {
            nh0<PooledByteBuffer> e = gp1.mo20745e();
            au4.m10792g(e);
            try {
                PooledByteBuffer j = e.mo23684j();
                if (j.mo13168u() != null) {
                    kkVar = f15574c.mo13073e(j.mo13168u(), lq2);
                } else {
                    kkVar = f15574c.mo13072d(j.mo13164B(), j.size(), lq2);
                }
                return mo23711f(lq2, kkVar, config);
            } finally {
                nh0.m23178h(e);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final nh0<Bitmap> mo23708c(int i, int i2, Bitmap.Config config) {
        nh0<Bitmap> c = this.f15577b.mo27854c(i, i2, config);
        c.mo23684j().eraseColor(0);
        c.mo23684j().setHasAlpha(true);
        return c;
    }

    /* renamed from: d */
    public final nh0<Bitmap> mo23709d(C2687kk kkVar, Bitmap.Config config, int i) {
        nh0<Bitmap> c = mo23708c(kkVar.getWidth(), kkVar.getHeight(), config);
        new AnimatedImageCompositor(this.f15576a.mo13317a(C3078pk.m25000b(kkVar), (Rect) null), new C2904a()).mo13324g(i, c.mo23684j());
        return c;
    }

    /* renamed from: e */
    public final List<nh0<Bitmap>> mo23710e(C2687kk kkVar, Bitmap.Config config) {
        C1637bk a = this.f15576a.mo13317a(C3078pk.m25000b(kkVar), (Rect) null);
        ArrayList arrayList = new ArrayList(a.mo11681a());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(a, new C2905b(arrayList));
        for (int i = 0; i < a.mo11681a(); i++) {
            nh0<Bitmap> c = mo23708c(a.getWidth(), a.getHeight(), config);
            animatedImageCompositor.mo13324g(i, c.mo23684j());
            arrayList.add(c);
        }
        return arrayList;
    }

    /* renamed from: f */
    public final kh0 mo23711f(lq2 lq2, C2687kk kkVar, Bitmap.Config config) {
        List<nh0<Bitmap>> list;
        int i;
        nh0<Bitmap> nh0 = null;
        try {
            if (lq2.f14642d) {
                i = kkVar.mo13069a() - 1;
            } else {
                i = 0;
            }
            if (lq2.f14644f) {
                qh0 qh0 = new qh0(mo23709d(kkVar, config, i), ns2.f15676d, 0);
                nh0.m23178h((nh0<?>) null);
                nh0.m23179i((Iterable<? extends nh0<?>>) null);
                return qh0;
            }
            if (lq2.f14643e) {
                list = mo23710e(kkVar, config);
                try {
                    nh0 = nh0.m23176f(list.get(i));
                } catch (Throwable th) {
                    th = th;
                    nh0.m23178h((nh0<?>) null);
                    nh0.m23179i(list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (lq2.f14641c && nh0 == null) {
                nh0 = mo23709d(kkVar, config, i);
            }
            hh0 hh0 = new hh0(C3078pk.m25001e(kkVar).mo25134j(nh0).mo25133i(i).mo25132h(list).mo25131g(lq2.f14648j).mo25125a());
            nh0.m23178h(nh0);
            nh0.m23179i(list);
            return hh0;
        } catch (Throwable th2) {
            th = th2;
            list = null;
            nh0.m23178h((nh0<?>) null);
            nh0.m23179i(list);
            throw th;
        }
    }
}
