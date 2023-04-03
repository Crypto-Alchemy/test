package p000;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\b"}, mo44877d2 = {"T", "Landroidx/lifecycle/LiveData;", "Lug3;", "lifecycleOwner", "Lpf4;", "observer", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: pi3 */
/* compiled from: LiveData.kt */
public final class pi3 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"pi3$a", "Lpf4;", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: pi3$a */
    /* compiled from: LiveData.kt */
    public static final class C9179a implements pf4<T> {

        /* renamed from: a */
        public final /* synthetic */ pf4<T> f44057a;

        /* renamed from: b */
        public final /* synthetic */ LiveData<T> f44058b;

        public C9179a(pf4<T> pf4, LiveData<T> liveData) {
            this.f44057a = pf4;
            this.f44058b = liveData;
        }

        public void onChanged(T t) {
            this.f44057a.onChanged(t);
            this.f44058b.removeObserver(this);
        }
    }

    /* renamed from: a */
    public static final <T> void m71013a(LiveData<T> liveData, ug3 ug3, pf4<T> pf4) {
        vx2.m53591g(liveData, "<this>");
        vx2.m53591g(ug3, "lifecycleOwner");
        vx2.m53591g(pf4, "observer");
        liveData.observe(ug3, new C9179a(pf4, liveData));
    }
}
