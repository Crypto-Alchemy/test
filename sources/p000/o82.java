package p000;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o82 */
/* compiled from: ForwardingRequestListener */
public class o82 implements je5 {

    /* renamed from: a */
    public final List<je5> f15833a;

    public o82(Set<je5> set) {
        this.f15833a = new ArrayList(set.size());
        for (je5 next : set) {
            if (next != null) {
                this.f15833a.add(next);
            }
        }
    }

    /* renamed from: a */
    public void mo21813a(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo21813a(imageRequest, obj, str, z);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onRequestStart", e);
            }
        }
    }

    /* renamed from: b */
    public void mo11914b(String str, String str2) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo11914b(str, str2);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onProducerStart", e);
            }
        }
    }

    /* renamed from: c */
    public void mo21814c(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo21814c(imageRequest, str, z);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    /* renamed from: d */
    public boolean mo11915d(String str) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            if (this.f15833a.get(i).mo11915d(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo11916e(String str, String str2, Map<String, String> map) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo11916e(str, str2, map);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: f */
    public void mo11917f(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo11917f(str, str2, th, map);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    /* renamed from: g */
    public void mo11918g(String str, String str2, Map<String, String> map) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo11918g(str, str2, map);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    /* renamed from: h */
    public void mo11786h(String str, String str2, boolean z) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo11786h(str, str2, z);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    /* renamed from: i */
    public void mo21815i(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo21815i(imageRequest, str, th, z);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    /* renamed from: j */
    public void mo11919j(String str, String str2, String str3) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo11919j(str, str2, str3);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    /* renamed from: k */
    public void mo21816k(String str) {
        int size = this.f15833a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f15833a.get(i).mo21816k(str);
            } catch (Exception e) {
                mo23916m("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    /* renamed from: l */
    public void mo23915l(je5 je5) {
        this.f15833a.add(je5);
    }

    /* renamed from: m */
    public final void mo23916m(String str, Throwable th) {
        oy1.m24422i("ForwardingRequestListener", str, th);
    }

    public o82(je5... je5Arr) {
        this.f15833a = new ArrayList(je5Arr.length);
        for (je5 je5 : je5Arr) {
            if (je5 != null) {
                this.f15833a.add(je5);
            }
        }
    }
}
