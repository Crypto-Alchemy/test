package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;

/* renamed from: jn6 */
/* compiled from: TextDrawableHelper */
public class jn6 {

    /* renamed from: a */
    public final TextPaint f30543a = new TextPaint(1);

    /* renamed from: b */
    public final dn6 f30544b = new C6116a();

    /* renamed from: c */
    public float f30545c;

    /* renamed from: d */
    public boolean f30546d = true;

    /* renamed from: e */
    public WeakReference<C6117b> f30547e = new WeakReference<>((Object) null);

    /* renamed from: f */
    public bn6 f30548f;

    /* renamed from: jn6$a */
    /* compiled from: TextDrawableHelper */
    public class C6116a extends dn6 {
        public C6116a() {
        }

        /* renamed from: a */
        public void mo29667a(int i) {
            boolean unused = jn6.this.f30546d = true;
            C6117b bVar = (C6117b) jn6.this.f30547e.get();
            if (bVar != null) {
                bVar.mo29713a();
            }
        }

        /* renamed from: b */
        public void mo29668b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = jn6.this.f30546d = true;
                C6117b bVar = (C6117b) jn6.this.f30547e.get();
                if (bVar != null) {
                    bVar.mo29713a();
                }
            }
        }
    }

    /* renamed from: jn6$b */
    /* compiled from: TextDrawableHelper */
    public interface C6117b {
        /* renamed from: a */
        void mo29713a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public jn6(C6117b bVar) {
        mo44539g(bVar);
    }

    /* renamed from: c */
    public final float mo44535c(CharSequence charSequence) {
        if (charSequence == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f30543a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public bn6 mo44536d() {
        return this.f30548f;
    }

    /* renamed from: e */
    public TextPaint mo44537e() {
        return this.f30543a;
    }

    /* renamed from: f */
    public float mo44538f(String str) {
        if (!this.f30546d) {
            return this.f30545c;
        }
        float c = mo44535c(str);
        this.f30545c = c;
        this.f30546d = false;
        return c;
    }

    /* renamed from: g */
    public void mo44539g(C6117b bVar) {
        this.f30547e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo44540h(bn6 bn6, Context context) {
        if (this.f30548f != bn6) {
            this.f30548f = bn6;
            if (bn6 != null) {
                bn6.mo29665k(context, this.f30543a, this.f30544b);
                C6117b bVar = this.f30547e.get();
                if (bVar != null) {
                    this.f30543a.drawableState = bVar.getState();
                }
                bn6.mo29664j(context, this.f30543a, this.f30544b);
                this.f30546d = true;
            }
            C6117b bVar2 = this.f30547e.get();
            if (bVar2 != null) {
                bVar2.mo29713a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo44541i(boolean z) {
        this.f30546d = z;
    }

    /* renamed from: j */
    public void mo44542j(Context context) {
        this.f30548f.mo29664j(context, this.f30543a, this.f30544b);
    }
}
