package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: sm */
/* compiled from: AppCompatCheckedTextViewHelper */
public class C3283sm {

    /* renamed from: a */
    public final CheckedTextView f17728a;

    /* renamed from: b */
    public ColorStateList f17729b = null;

    /* renamed from: c */
    public PorterDuff.Mode f17730c = null;

    /* renamed from: d */
    public boolean f17731d = false;

    /* renamed from: e */
    public boolean f17732e = false;

    /* renamed from: f */
    public boolean f17733f;

    public C3283sm(CheckedTextView checkedTextView) {
        this.f17728a = checkedTextView;
    }

    /* renamed from: a */
    public void mo25869a() {
        Drawable a = fe0.m16948a(this.f17728a);
        if (a == null) {
            return;
        }
        if (this.f17731d || this.f17732e) {
            Drawable mutate = ij1.m19659r(a).mutate();
            if (this.f17731d) {
                ij1.m19656o(mutate, this.f17729b);
            }
            if (this.f17732e) {
                ij1.m19657p(mutate, this.f17730c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f17728a.getDrawableState());
            }
            this.f17728a.setCheckMarkDrawable(mutate);
        }
    }

    /* renamed from: b */
    public ColorStateList mo25870b() {
        return this.f17729b;
    }

    /* renamed from: c */
    public PorterDuff.Mode mo25871c() {
        return this.f17730c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25872d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f17728a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p000.j65.CheckedTextView
            r8 = 0
            yq6 r0 = p000.yq6.m30733v(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f17728a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo28192r()
            r7 = 0
            r4 = r10
            r6 = r11
            p000.ga7.m17781n0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p000.j65.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo28188n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f17728a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p000.C2554in.m19714b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p000.j65.CheckedTextView_android_checkMark     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo28188n(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f17728a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p000.C2554in.m19714b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p000.j65.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f17728a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo28177c(r10)     // Catch:{ all -> 0x0084 }
            p000.fe0.m16949b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p000.j65.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo28193s(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f17728a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo28185k(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = p000.sj1.m26923e(r10, r1)     // Catch:{ all -> 0x0084 }
            p000.fe0.m16950c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo28194w()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo28194w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3283sm.mo25872d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void mo25873e() {
        if (this.f17733f) {
            this.f17733f = false;
            return;
        }
        this.f17733f = true;
        mo25869a();
    }

    /* renamed from: f */
    public void mo25874f(ColorStateList colorStateList) {
        this.f17729b = colorStateList;
        this.f17731d = true;
        mo25869a();
    }

    /* renamed from: g */
    public void mo25875g(PorterDuff.Mode mode) {
        this.f17730c = mode;
        this.f17732e = true;
        mo25869a();
    }
}
