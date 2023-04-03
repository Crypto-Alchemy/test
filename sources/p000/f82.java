package p000;

import java.util.ArrayList;
import java.util.List;
import p000.lt0;

/* renamed from: f82 */
/* compiled from: ForwardingControllerListener2 */
public class f82<I> extends C2856my<I> {

    /* renamed from: d */
    public final List<lt0<I>> f11561d = new ArrayList(2);

    /* renamed from: c */
    public void mo18886c(String str, I i, lt0.C2787a aVar) {
        int size = this.f11561d.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                lt0 lt0 = this.f11561d.get(i2);
                if (lt0 != null) {
                    lt0.mo18886c(str, i, aVar);
                }
            } catch (Exception e) {
                mo19718h("ForwardingControllerListener2 exception in onFinalImageSet", e);
            }
        }
    }

    /* renamed from: d */
    public void mo18888d(String str, lt0.C2787a aVar) {
        int size = this.f11561d.size();
        for (int i = 0; i < size; i++) {
            try {
                lt0 lt0 = this.f11561d.get(i);
                if (lt0 != null) {
                    lt0.mo18888d(str, aVar);
                }
            } catch (Exception e) {
                mo19718h("ForwardingControllerListener2 exception in onRelease", e);
            }
        }
    }

    /* renamed from: e */
    public void mo18889e(String str, Throwable th, lt0.C2787a aVar) {
        int size = this.f11561d.size();
        for (int i = 0; i < size; i++) {
            try {
                lt0 lt0 = this.f11561d.get(i);
                if (lt0 != null) {
                    lt0.mo18889e(str, th, aVar);
                }
            } catch (Exception e) {
                mo19718h("ForwardingControllerListener2 exception in onFailure", e);
            }
        }
    }

    /* renamed from: f */
    public void mo18890f(String str, Object obj, lt0.C2787a aVar) {
        int size = this.f11561d.size();
        for (int i = 0; i < size; i++) {
            try {
                lt0 lt0 = this.f11561d.get(i);
                if (lt0 != null) {
                    lt0.mo18890f(str, obj, aVar);
                }
            } catch (Exception e) {
                mo19718h("ForwardingControllerListener2 exception in onSubmit", e);
            }
        }
    }

    /* renamed from: g */
    public synchronized void mo19717g(lt0<I> lt0) {
        this.f11561d.add(lt0);
    }

    /* renamed from: h */
    public final synchronized void mo19718h(String str, Throwable th) {
    }

    /* renamed from: i */
    public synchronized void mo19719i(lt0<I> lt0) {
        int indexOf = this.f11561d.indexOf(lt0);
        if (indexOf != -1) {
            this.f11561d.remove(indexOf);
        }
    }
}
