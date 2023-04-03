package p000;

import android.view.View;

/* renamed from: jd7 */
/* compiled from: ViewOffsetHelper */
public class jd7 {

    /* renamed from: a */
    public final View f30468a;

    /* renamed from: b */
    public int f30469b;

    /* renamed from: c */
    public int f30470c;

    /* renamed from: d */
    public int f30471d;

    /* renamed from: e */
    public int f30472e;

    /* renamed from: f */
    public boolean f30473f = true;

    /* renamed from: g */
    public boolean f30474g = true;

    public jd7(View view) {
        this.f30468a = view;
    }

    /* renamed from: a */
    public void mo44419a() {
        View view = this.f30468a;
        ga7.m17755a0(view, this.f30471d - (view.getTop() - this.f30469b));
        View view2 = this.f30468a;
        ga7.m17753Z(view2, this.f30472e - (view2.getLeft() - this.f30470c));
    }

    /* renamed from: b */
    public int mo44420b() {
        return this.f30469b;
    }

    /* renamed from: c */
    public int mo44421c() {
        return this.f30472e;
    }

    /* renamed from: d */
    public int mo44422d() {
        return this.f30471d;
    }

    /* renamed from: e */
    public boolean mo44423e() {
        return this.f30474g;
    }

    /* renamed from: f */
    public boolean mo44424f() {
        return this.f30473f;
    }

    /* renamed from: g */
    public void mo44425g() {
        this.f30469b = this.f30468a.getTop();
        this.f30470c = this.f30468a.getLeft();
    }

    /* renamed from: h */
    public void mo44426h(boolean z) {
        this.f30474g = z;
    }

    /* renamed from: i */
    public boolean mo44427i(int i) {
        if (!this.f30474g || this.f30472e == i) {
            return false;
        }
        this.f30472e = i;
        mo44419a();
        return true;
    }

    /* renamed from: j */
    public boolean mo44428j(int i) {
        if (!this.f30473f || this.f30471d == i) {
            return false;
        }
        this.f30471d = i;
        mo44419a();
        return true;
    }

    /* renamed from: k */
    public void mo44429k(boolean z) {
        this.f30473f = z;
    }
}
