package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p000.C3418uk;

/* renamed from: vk */
/* compiled from: AnimationBackendDelegate */
public class C3491vk<T extends C3418uk> implements C3418uk {

    /* renamed from: a */
    public T f18808a;

    /* renamed from: b */
    public int f18809b = -1;

    /* renamed from: c */
    public ColorFilter f18810c;

    /* renamed from: d */
    public Rect f18811d;

    public C3491vk(T t) {
        this.f18808a = t;
    }

    /* renamed from: a */
    public int mo11695a() {
        T t = this.f18808a;
        if (t == null) {
            return 0;
        }
        return t.mo11695a();
    }

    /* renamed from: b */
    public int mo11696b() {
        T t = this.f18808a;
        if (t == null) {
            return 0;
        }
        return t.mo11696b();
    }

    /* renamed from: c */
    public int mo26810c() {
        T t = this.f18808a;
        if (t == null) {
            return -1;
        }
        return t.mo26810c();
    }

    public void clear() {
        T t = this.f18808a;
        if (t != null) {
            t.clear();
        }
    }

    /* renamed from: d */
    public void mo26812d(Rect rect) {
        T t = this.f18808a;
        if (t != null) {
            t.mo26812d(rect);
        }
        this.f18811d = rect;
    }

    /* renamed from: e */
    public int mo26813e() {
        T t = this.f18808a;
        if (t == null) {
            return -1;
        }
        return t.mo26813e();
    }

    /* renamed from: f */
    public void mo26814f(ColorFilter colorFilter) {
        T t = this.f18808a;
        if (t != null) {
            t.mo26814f(colorFilter);
        }
        this.f18810c = colorFilter;
    }

    /* renamed from: g */
    public boolean mo26815g(Drawable drawable, Canvas canvas, int i) {
        T t = this.f18808a;
        if (t == null || !t.mo26815g(drawable, canvas, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public int mo11697i(int i) {
        T t = this.f18808a;
        if (t == null) {
            return 0;
        }
        return t.mo11697i(i);
    }

    /* renamed from: j */
    public void mo26816j(int i) {
        T t = this.f18808a;
        if (t != null) {
            t.mo26816j(i);
        }
        this.f18809b = i;
    }
}
