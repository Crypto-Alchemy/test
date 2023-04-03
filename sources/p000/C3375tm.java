package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: tm */
/* compiled from: AppCompatCompoundButtonHelper */
public class C3375tm {

    /* renamed from: a */
    public final CompoundButton f18187a;

    /* renamed from: b */
    public ColorStateList f18188b = null;

    /* renamed from: c */
    public PorterDuff.Mode f18189c = null;

    /* renamed from: d */
    public boolean f18190d = false;

    /* renamed from: e */
    public boolean f18191e = false;

    /* renamed from: f */
    public boolean f18192f;

    public C3375tm(CompoundButton compoundButton) {
        this.f18187a = compoundButton;
    }

    /* renamed from: a */
    public void mo26505a() {
        Drawable a = fo0.m17152a(this.f18187a);
        if (a == null) {
            return;
        }
        if (this.f18190d || this.f18191e) {
            Drawable mutate = ij1.m19659r(a).mutate();
            if (this.f18190d) {
                ij1.m19656o(mutate, this.f18188b);
            }
            if (this.f18191e) {
                ij1.m19657p(mutate, this.f18189c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f18187a.getDrawableState());
            }
            this.f18187a.setButtonDrawable(mutate);
        }
    }

    /* renamed from: b */
    public int mo26506b(int i) {
        return i;
    }

    /* renamed from: c */
    public ColorStateList mo26507c() {
        return this.f18188b;
    }

    /* renamed from: d */
    public PorterDuff.Mode mo26508d() {
        return this.f18189c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26509e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f18187a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p000.j65.CompoundButton
            r8 = 0
            yq6 r0 = p000.yq6.m30733v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f18187a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo28192r()
            r7 = 0
            r4 = r10
            r6 = r11
            p000.ga7.m17781n0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p000.j65.CompoundButton_buttonCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo28188n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f18187a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p000.C2554in.m19714b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p000.j65.CompoundButton_android_button     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo28188n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f18187a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p000.C2554in.m19714b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p000.j65.CompoundButton_buttonTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f18187a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo28177c(r10)     // Catch:{ all -> 0x0084 }
            p000.fo0.m17154c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p000.j65.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f18187a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo28185k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = p000.sj1.m26923e(r10, r1)     // Catch:{ all -> 0x0084 }
            p000.fo0.m17155d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo28194w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo28194w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3375tm.mo26509e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void mo26510f() {
        if (this.f18192f) {
            this.f18192f = false;
            return;
        }
        this.f18192f = true;
        mo26505a();
    }

    /* renamed from: g */
    public void mo26511g(ColorStateList colorStateList) {
        this.f18188b = colorStateList;
        this.f18190d = true;
        mo26505a();
    }

    /* renamed from: h */
    public void mo26512h(PorterDuff.Mode mode) {
        this.f18189c = mode;
        this.f18191e = true;
        mo26505a();
    }
}
