package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: n82 */
/* compiled from: ForwardingRequestListener2 */
public class n82 implements ke5 {

    /* renamed from: a */
    public final List<ke5> f15373a;

    public n82(Set<ke5> set) {
        this.f15373a = new ArrayList(set.size());
        for (ke5 next : set) {
            if (next != null) {
                this.f15373a.add(next);
            }
        }
    }

    /* renamed from: a */
    public void mo11170a(wv4 wv4, String str, Map<String, String> map) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo11170a(wv4, str, map);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: b */
    public void mo22262b(wv4 wv4) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo22262b(wv4);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onRequestStart", e);
            }
        }
    }

    /* renamed from: c */
    public void mo11171c(wv4 wv4, String str, boolean z) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo11171c(wv4, str, z);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: d */
    public void mo22263d(wv4 wv4, Throwable th) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo22263d(wv4, th);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    /* renamed from: e */
    public void mo22264e(wv4 wv4) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo22264e(wv4);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    /* renamed from: f */
    public void mo11172f(wv4 wv4, String str, Throwable th, Map<String, String> map) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo11172f(wv4, str, th, map);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    /* renamed from: g */
    public void mo11173g(wv4 wv4, String str, Map<String, String> map) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo11173g(wv4, str, map);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    /* renamed from: h */
    public void mo22265h(wv4 wv4) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo22265h(wv4);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    /* renamed from: i */
    public void mo11174i(wv4 wv4, String str, String str2) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo11174i(wv4, str, str2);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    /* renamed from: j */
    public boolean mo11175j(wv4 wv4, String str) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            if (this.f15373a.get(i).mo11175j(wv4, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo11176k(wv4 wv4, String str) {
        int size = this.f15373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15373a.get(i).mo11176k(wv4, str);
            } catch (Exception e) {
                mo23537l("InternalListener exception in onProducerStart", e);
            }
        }
    }

    /* renamed from: l */
    public final void mo23537l(String str, Throwable th) {
        oy1.m24422i("ForwardingRequestListener2", str, th);
    }
}
