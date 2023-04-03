package p000;

import com.facebook.datasource.AbstractDataSource;
import java.util.Map;

/* renamed from: v6 */
/* compiled from: AbstractProducerToDataSourceAdapter */
public abstract class C3461v6<T> extends AbstractDataSource<T> {

    /* renamed from: i */
    public final sy5 f18682i;

    /* renamed from: j */
    public final ke5 f18683j;

    /* renamed from: v6$a */
    /* compiled from: AbstractProducerToDataSourceAdapter */
    public class C3462a extends C3766zx<T> {
        public C3462a() {
        }

        /* renamed from: g */
        public void mo13424g() {
            C3461v6.this.mo27070C();
        }

        /* renamed from: h */
        public void mo11351h(Throwable th) {
            C3461v6.this.mo27071D(th);
        }

        /* renamed from: i */
        public void mo11352i(T t, int i) {
            C3461v6 v6Var = C3461v6.this;
            v6Var.mo23181E(t, i, v6Var.f18682i);
        }

        /* renamed from: j */
        public void mo13425j(float f) {
            boolean unused = C3461v6.this.mo13208r(f);
        }
    }

    public C3461v6(vv4<T> vv4, sy5 sy5, ke5 ke5) {
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractProducerToDataSourceAdapter()");
        }
        this.f18682i = sy5;
        this.f18683j = ke5;
        mo27072F();
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        ke5.mo22262b(sy5);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        if (lc2.m21369d()) {
            lc2.m21366a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        vv4.mo11350a(mo27068A(), sy5);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: A */
    public final vq0<T> mo27068A() {
        return new C3462a();
    }

    /* renamed from: B */
    public Map<String, Object> mo27069B(wv4 wv4) {
        return wv4.getExtras();
    }

    /* renamed from: C */
    public final synchronized void mo27070C() {
        au4.m10794i(mo13200j());
    }

    /* renamed from: D */
    public final void mo27071D(Throwable th) {
        if (super.mo13206p(th, mo27069B(this.f18682i))) {
            this.f18683j.mo22263d(this.f18682i, th);
        }
    }

    /* renamed from: E */
    public void mo23181E(T t, int i, wv4 wv4) {
        boolean e = C3766zx.m31566e(i);
        if (super.mo13210t(t, e, mo27069B(wv4)) && e) {
            this.f18683j.mo22264e(this.f18682i);
        }
    }

    /* renamed from: F */
    public final void mo27072F() {
        mo13204n(this.f18682i.getExtras());
    }

    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.mo13190b()) {
            return true;
        }
        this.f18683j.mo22265h(this.f18682i);
        this.f18682i.mo20293t();
        return true;
    }
}
