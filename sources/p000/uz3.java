package p000;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.mw3;
import p000.r11;

/* renamed from: uz3 */
/* compiled from: MultiModelLoader */
public class uz3<Model, Data> implements mw3<Model, Data> {

    /* renamed from: a */
    public final List<mw3<Model, Data>> f18616a;

    /* renamed from: b */
    public final ys4<List<Throwable>> f18617b;

    /* renamed from: uz3$a */
    /* compiled from: MultiModelLoader */
    public static class C3449a<Data> implements r11<Data>, r11.C3179a<Data> {

        /* renamed from: a */
        public final List<r11<Data>> f18618a;

        /* renamed from: d */
        public final ys4<List<Throwable>> f18619d;

        /* renamed from: e */
        public int f18620e = 0;

        /* renamed from: g */
        public Priority f18621g;

        /* renamed from: k */
        public r11.C3179a<? super Data> f18622k;

        /* renamed from: r */
        public List<Throwable> f18623r;

        /* renamed from: s */
        public boolean f18624s;

        public C3449a(List<r11<Data>> list, ys4<List<Throwable>> ys4) {
            this.f18619d = ys4;
            zt4.m31499c(list);
            this.f18618a = list;
        }

        /* renamed from: a */
        public Class<Data> mo11939a() {
            return this.f18618a.get(0).mo11939a();
        }

        /* renamed from: b */
        public void mo11940b() {
            List<Throwable> list = this.f18623r;
            if (list != null) {
                this.f18619d.mo11138a(list);
            }
            this.f18623r = null;
            for (r11<Data> b : this.f18618a) {
                b.mo11940b();
            }
        }

        /* renamed from: c */
        public void mo12485c(Exception exc) {
            ((List) zt4.m31500d(this.f18623r)).add(exc);
            mo26946g();
        }

        public void cancel() {
            this.f18624s = true;
            for (r11<Data> cancel : this.f18618a) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super Data> aVar) {
            this.f18621g = priority;
            this.f18622k = aVar;
            this.f18623r = this.f18619d.mo11139b();
            this.f18618a.get(this.f18620e).mo11943d(priority, this);
            if (this.f18624s) {
                cancel();
            }
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return this.f18618a.get(0).mo11944e();
        }

        /* renamed from: f */
        public void mo12487f(Data data) {
            if (data != null) {
                this.f18622k.mo12487f(data);
            } else {
                mo26946g();
            }
        }

        /* renamed from: g */
        public final void mo26946g() {
            if (!this.f18624s) {
                if (this.f18620e < this.f18618a.size() - 1) {
                    this.f18620e++;
                    mo11943d(this.f18621g, this.f18622k);
                    return;
                }
                zt4.m31500d(this.f18623r);
                this.f18622k.mo12485c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f18623r)));
            }
        }
    }

    public uz3(List<mw3<Model, Data>> list, ys4<List<Throwable>> ys4) {
        this.f18616a = list;
        this.f18617b = ys4;
    }

    /* renamed from: a */
    public boolean mo11933a(Model model) {
        for (mw3<Model, Data> a : this.f18616a) {
            if (a.mo11933a(model)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public mw3.C2853a<Data> mo11934b(Model model, int i, int i2, xi4 xi4) {
        mw3.C2853a b;
        int size = this.f18616a.size();
        ArrayList arrayList = new ArrayList(size);
        z93 z93 = null;
        for (int i3 = 0; i3 < size; i3++) {
            mw3 mw3 = this.f18616a.get(i3);
            if (mw3.mo11933a(model) && (b = mw3.mo11934b(model, i, i2, xi4)) != null) {
                z93 = b.f15260a;
                arrayList.add(b.f15262c);
            }
        }
        if (arrayList.isEmpty() || z93 == null) {
            return null;
        }
        return new mw3.C2853a<>(z93, new C3449a(arrayList, this.f18617b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f18616a.toArray()) + '}';
    }
}
