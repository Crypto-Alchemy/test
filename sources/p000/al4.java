package p000;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: al4 */
/* compiled from: PagerAdapter */
public abstract class al4 {

    /* renamed from: a */
    public final DataSetObservable f186a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f187b;

    @Deprecated
    /* renamed from: a */
    public void mo366a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void mo367b(ViewGroup viewGroup, int i, Object obj) {
        mo366a(viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: c */
    public void mo368c(View view) {
    }

    /* renamed from: d */
    public void mo369d(ViewGroup viewGroup) {
        mo368c(viewGroup);
    }

    /* renamed from: e */
    public abstract int mo370e();

    /* renamed from: f */
    public int mo371f(Object obj) {
        return -1;
    }

    /* renamed from: g */
    public CharSequence mo372g(int i) {
        return null;
    }

    /* renamed from: h */
    public float mo373h(int i) {
        return 1.0f;
    }

    @Deprecated
    /* renamed from: i */
    public Object mo374i(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: j */
    public Object mo375j(ViewGroup viewGroup, int i) {
        return mo374i(viewGroup, i);
    }

    /* renamed from: k */
    public abstract boolean mo376k(View view, Object obj);

    /* renamed from: l */
    public void mo377l(DataSetObserver dataSetObserver) {
        this.f186a.registerObserver(dataSetObserver);
    }

    /* renamed from: m */
    public void mo378m(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: n */
    public Parcelable mo379n() {
        return null;
    }

    @Deprecated
    /* renamed from: o */
    public void mo380o(View view, int i, Object obj) {
    }

    /* renamed from: p */
    public void mo381p(ViewGroup viewGroup, int i, Object obj) {
        mo380o(viewGroup, i, obj);
    }

    /* renamed from: q */
    public void mo382q(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f187b = dataSetObserver;
        }
    }

    @Deprecated
    /* renamed from: r */
    public void mo383r(View view) {
    }

    /* renamed from: s */
    public void mo384s(ViewGroup viewGroup) {
        mo383r(viewGroup);
    }

    /* renamed from: t */
    public void mo385t(DataSetObserver dataSetObserver) {
        this.f186a.unregisterObserver(dataSetObserver);
    }
}
