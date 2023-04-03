package p000;

import android.util.Pair;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005H\u0017J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005H\u0017J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u0007H\u0003J\b\u0010\u000f\u001a\u00020\u0007H\u0003R.\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00050\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lux1;", "T", "Lk04;", "Lug3;", "owner", "Lpf4;", "observer", "Lr37;", "observe", "value", "c", "(Ljava/lang/Object;)V", "removeObserver", "setValue", "b", "a", "", "Landroid/util/Pair;", "Ljava/util/List;", "observers", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ux1 */
/* compiled from: ExtendedLiveData.kt */
public final class ux1<T> extends k04<T> {

    /* renamed from: a */
    public final List<Pair<ug3, pf4<? super T>>> f45186a = new ArrayList();

    /* renamed from: a */
    public final void mo66363a() {
        for (Pair<ug3, pf4<? super T>> pair : this.f45186a) {
            removeObservers((ug3) pair.first);
        }
    }

    /* renamed from: b */
    public final void mo66364b() {
        for (Pair next : this.f45186a) {
            super.observe((ug3) next.first, (pf4) next.second);
        }
    }

    /* renamed from: c */
    public final void mo66365c(T t) {
        mo66363a();
        super.setValue(t);
        Object value = getValue();
        System.out.println("Not notifying value " + value);
    }

    public void observe(ug3 ug3, pf4<? super T> pf4) {
        vx2.m53591g(ug3, ENS.FUNC_OWNER);
        vx2.m53591g(pf4, "observer");
        this.f45186a.add(new Pair(ug3, pf4));
        super.observe(ug3, pf4);
    }

    public void removeObserver(pf4<? super T> pf4) {
        vx2.m53591g(pf4, "observer");
        for (Pair next : this.f45186a) {
            if (vx2.m53586b(next.second, pf4) && ((ug3) next.first).getLifecycle().mo6296b() == Lifecycle.State.DESTROYED) {
                this.f45186a.remove(next);
            }
        }
        super.removeObserver(pf4);
    }

    public void setValue(T t) {
        super.setValue(t);
        if (!hasObservers()) {
            mo66364b();
        }
    }
}
