package p000;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import p000.mw3;
import p000.r11;

/* renamed from: u37 */
/* compiled from: UnitModelLoader */
public class u37<Model> implements mw3<Model, Model> {

    /* renamed from: a */
    public static final u37<?> f18368a = new u37<>();

    /* renamed from: u37$a */
    /* compiled from: UnitModelLoader */
    public static class C3394a<Model> implements nw3<Model, Model> {

        /* renamed from: a */
        public static final C3394a<?> f18369a = new C3394a<>();

        /* renamed from: b */
        public static <T> C3394a<T> m28063b() {
            return f18369a;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Model, Model> mo11938c(vz3 vz3) {
            return u37.m28060c();
        }
    }

    /* renamed from: u37$b */
    /* compiled from: UnitModelLoader */
    public static class C3395b<Model> implements r11<Model> {

        /* renamed from: a */
        public final Model f18370a;

        public C3395b(Model model) {
            this.f18370a = model;
        }

        /* renamed from: a */
        public Class<Model> mo11939a() {
            return this.f18370a.getClass();
        }

        /* renamed from: b */
        public void mo11940b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super Model> aVar) {
            aVar.mo12487f(this.f18370a);
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: c */
    public static <T> u37<T> m28060c() {
        return f18368a;
    }

    /* renamed from: a */
    public boolean mo11933a(Model model) {
        return true;
    }

    /* renamed from: b */
    public mw3.C2853a<Model> mo11934b(Model model, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(model), new C3395b(model));
    }
}
