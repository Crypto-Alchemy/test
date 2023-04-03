package p000;

import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ls3 */
/* compiled from: MediatorLiveData */
public class ls3<T> extends k04<T> {

    /* renamed from: a */
    public ok5<LiveData<?>, C2786a<?>> f14700a = new ok5<>();

    /* renamed from: ls3$a */
    /* compiled from: MediatorLiveData */
    public static class C2786a<V> implements pf4<V> {

        /* renamed from: a */
        public final LiveData<V> f14701a;

        /* renamed from: b */
        public final pf4<? super V> f14702b;

        /* renamed from: c */
        public int f14703c = -1;

        public C2786a(LiveData<V> liveData, pf4<? super V> pf4) {
            this.f14701a = liveData;
            this.f14702b = pf4;
        }

        /* renamed from: a */
        public void mo22953a() {
            this.f14701a.observeForever(this);
        }

        /* renamed from: b */
        public void mo22954b() {
            this.f14701a.removeObserver(this);
        }

        public void onChanged(V v) {
            if (this.f14703c != this.f14701a.getVersion()) {
                this.f14703c = this.f14701a.getVersion();
                this.f14702b.onChanged(v);
            }
        }
    }

    /* renamed from: a */
    public <S> void mo22951a(LiveData<S> liveData, pf4<? super S> pf4) {
        C2786a aVar = new C2786a(liveData, pf4);
        C2786a q = this.f14700a.mo18386q(liveData, aVar);
        if (q != null && q.f14702b != pf4) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (q == null && hasActiveObservers()) {
            aVar.mo22953a();
        }
    }

    /* renamed from: b */
    public <S> void mo22952b(LiveData<S> liveData) {
        C2786a r = this.f14700a.mo18387r(liveData);
        if (r != null) {
            r.mo22954b();
        }
    }

    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, C2786a<?>>> it = this.f14700a.iterator();
        while (it.hasNext()) {
            ((C2786a) it.next().getValue()).mo22953a();
        }
    }

    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, C2786a<?>>> it = this.f14700a.iterator();
        while (it.hasNext()) {
            ((C2786a) it.next().getValue()).mo22954b();
        }
    }
}
