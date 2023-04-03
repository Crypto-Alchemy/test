package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class ChangeClipBounds extends Transition {

    /* renamed from: x1 */
    public static final String[] f7112x1 = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    public class C1420a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f7113a;

        public C1420a(View view) {
            this.f7113a = view;
        }

        public void onAnimationEnd(Animator animator) {
            ga7.m17799w0(this.f7113a, (Rect) null);
        }
    }

    public ChangeClipBounds() {
    }

    /* renamed from: M */
    public String[] mo10404M() {
        return f7112x1;
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        mo10445u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        mo10445u0(bx6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo10407t(android.view.ViewGroup r8, p000.bx6 r9, p000.bx6 r10) {
        /*
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L_0x007e
            if (r10 == 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f8291a
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f8291a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x007e
        L_0x0018:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f8291a
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.f8291a
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002e
            r4 = r2
            goto L_0x002f
        L_0x002e:
            r4 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0034
            return r8
        L_0x0034:
            java.lang.String r5 = "android:clipBounds:bounds"
            if (r0 != 0) goto L_0x0042
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.f8291a
            java.lang.Object r9 = r9.get(r5)
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x004d
        L_0x0042:
            if (r1 != 0) goto L_0x004d
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f8291a
            java.lang.Object r9 = r9.get(r5)
            r1 = r9
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x004d:
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto L_0x0054
            return r8
        L_0x0054:
            android.view.View r8 = r10.f8292b
            p000.ga7.m17799w0(r8, r0)
            b95 r8 = new b95
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.<init>(r9)
            android.view.View r9 = r10.f8292b
            android.util.Property<android.view.View, android.graphics.Rect> r5 = p000.qe7.f16931c
            r6 = 2
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            r6[r3] = r0
            r6[r2] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r9, r5, r8, r6)
            if (r4 == 0) goto L_0x007e
            android.view.View r9 = r10.f8292b
            androidx.transition.ChangeClipBounds$a r10 = new androidx.transition.ChangeClipBounds$a
            r10.<init>(r9)
            r8.addListener(r10)
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeClipBounds.mo10407t(android.view.ViewGroup, bx6, bx6):android.animation.Animator");
    }

    /* renamed from: u0 */
    public final void mo10445u0(bx6 bx6) {
        View view = bx6.f8292b;
        if (view.getVisibility() != 8) {
            Rect u = ga7.m17794u(view);
            bx6.f8291a.put("android:clipBounds:clip", u);
            if (u == null) {
                bx6.f8291a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
