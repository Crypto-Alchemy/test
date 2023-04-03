package p000;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g82 */
/* compiled from: ForwardingControllerListener */
public class g82<INFO> implements mt0<INFO> {

    /* renamed from: a */
    public final List<mt0<? super INFO>> f12194a = new ArrayList(2);

    /* renamed from: a */
    public void mo20417a(String str, INFO info2) {
        int size = this.f12194a.size();
        for (int i = 0; i < size; i++) {
            try {
                mt0 mt0 = this.f12194a.get(i);
                if (mt0 != null) {
                    mt0.mo20417a(str, info2);
                }
            } catch (Exception e) {
                mo20424i("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo20418b(String str, Throwable th) {
        int size = this.f12194a.size();
        for (int i = 0; i < size; i++) {
            try {
                mt0 mt0 = this.f12194a.get(i);
                if (mt0 != null) {
                    mt0.mo20418b(str, th);
                }
            } catch (Exception e) {
                mo20424i("InternalListener exception in onFailure", e);
            }
        }
    }

    /* renamed from: c */
    public synchronized void mo20419c(String str) {
        int size = this.f12194a.size();
        for (int i = 0; i < size; i++) {
            try {
                mt0 mt0 = this.f12194a.get(i);
                if (mt0 != null) {
                    mt0.mo20419c(str);
                }
            } catch (Exception e) {
                mo20424i("InternalListener exception in onRelease", e);
            }
        }
    }

    /* renamed from: d */
    public synchronized void mo13247d(String str, INFO info2, Animatable animatable) {
        int size = this.f12194a.size();
        for (int i = 0; i < size; i++) {
            try {
                mt0 mt0 = this.f12194a.get(i);
                if (mt0 != null) {
                    mt0.mo13247d(str, info2, animatable);
                }
            } catch (Exception e) {
                mo20424i("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    /* renamed from: e */
    public synchronized void mo20420e(String str, Object obj) {
        int size = this.f12194a.size();
        for (int i = 0; i < size; i++) {
            try {
                mt0 mt0 = this.f12194a.get(i);
                if (mt0 != null) {
                    mt0.mo20420e(str, obj);
                }
            } catch (Exception e) {
                mo20424i("InternalListener exception in onSubmit", e);
            }
        }
    }

    /* renamed from: f */
    public void mo20421f(String str, Throwable th) {
        int size = this.f12194a.size();
        for (int i = 0; i < size; i++) {
            try {
                mt0 mt0 = this.f12194a.get(i);
                if (mt0 != null) {
                    mt0.mo20421f(str, th);
                }
            } catch (Exception e) {
                mo20424i("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    /* renamed from: g */
    public synchronized void mo20422g(mt0<? super INFO> mt0) {
        this.f12194a.add(mt0);
    }

    /* renamed from: h */
    public synchronized void mo20423h() {
        this.f12194a.clear();
    }

    /* renamed from: i */
    public final synchronized void mo20424i(String str, Throwable th) {
    }
}
