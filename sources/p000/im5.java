package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: im5 */
/* compiled from: Scene */
public class im5 {

    /* renamed from: a */
    public Context f13317a;

    /* renamed from: b */
    public int f13318b = -1;

    /* renamed from: c */
    public ViewGroup f13319c;

    /* renamed from: d */
    public View f13320d;

    /* renamed from: e */
    public Runnable f13321e;

    /* renamed from: f */
    public Runnable f13322f;

    public im5(ViewGroup viewGroup, View view) {
        this.f13319c = viewGroup;
        this.f13320d = view;
    }

    /* renamed from: c */
    public static im5 m19707c(ViewGroup viewGroup) {
        return (im5) viewGroup.getTag(e35.transition_current_scene);
    }

    /* renamed from: f */
    public static void m19708f(ViewGroup viewGroup, im5 im5) {
        viewGroup.setTag(e35.transition_current_scene, im5);
    }

    /* renamed from: a */
    public void mo21571a() {
        if (this.f13318b > 0 || this.f13320d != null) {
            mo21573d().removeAllViews();
            if (this.f13318b > 0) {
                LayoutInflater.from(this.f13317a).inflate(this.f13318b, this.f13319c);
            } else {
                this.f13319c.addView(this.f13320d);
            }
        }
        Runnable runnable = this.f13321e;
        if (runnable != null) {
            runnable.run();
        }
        m19708f(this.f13319c, this);
    }

    /* renamed from: b */
    public void mo21572b() {
        Runnable runnable;
        if (m19707c(this.f13319c) == this && (runnable = this.f13322f) != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public ViewGroup mo21573d() {
        return this.f13319c;
    }

    /* renamed from: e */
    public boolean mo21574e() {
        if (this.f13318b > 0) {
            return true;
        }
        return false;
    }
}
