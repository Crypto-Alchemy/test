package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

public abstract class Visibility extends Transition {

    /* renamed from: y1 */
    public static final String[] f7222y1 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x1 */
    public int f7223x1 = 3;

    /* renamed from: androidx.transition.Visibility$a */
    public class C1449a extends C1459b {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7224a;

        /* renamed from: d */
        public final /* synthetic */ View f7225d;

        /* renamed from: e */
        public final /* synthetic */ View f7226e;

        public C1449a(ViewGroup viewGroup, View view, View view2) {
            this.f7224a = viewGroup;
            this.f7225d = view;
            this.f7226e = view2;
        }

        public void onTransitionEnd(Transition transition) {
            this.f7226e.setTag(e35.save_overlay_view, (Object) null);
            ic7.m19556b(this.f7224a).mo19233d(this.f7225d);
            transition.mo10517e0(this);
        }

        public void onTransitionPause(Transition transition) {
            ic7.m19556b(this.f7224a).mo19233d(this.f7225d);
        }

        public void onTransitionResume(Transition transition) {
            if (this.f7225d.getParent() == null) {
                ic7.m19556b(this.f7224a).mo19232c(this.f7225d);
            } else {
                Visibility.this.cancel();
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    public static class C1450b extends AnimatorListenerAdapter implements Transition.C1446f {

        /* renamed from: a */
        public final View f7228a;

        /* renamed from: d */
        public final int f7229d;

        /* renamed from: e */
        public final ViewGroup f7230e;

        /* renamed from: g */
        public final boolean f7231g;

        /* renamed from: k */
        public boolean f7232k;

        /* renamed from: r */
        public boolean f7233r = false;

        public C1450b(View view, int i, boolean z) {
            this.f7228a = view;
            this.f7229d = i;
            this.f7230e = (ViewGroup) view.getParent();
            this.f7231g = z;
            mo10572b(true);
        }

        /* renamed from: a */
        public final void mo10571a() {
            if (!this.f7233r) {
                qe7.m25633i(this.f7228a, this.f7229d);
                ViewGroup viewGroup = this.f7230e;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo10572b(false);
        }

        /* renamed from: b */
        public final void mo10572b(boolean z) {
            ViewGroup viewGroup;
            if (this.f7231g && this.f7232k != z && (viewGroup = this.f7230e) != null) {
                this.f7232k = z;
                ic7.m19558d(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f7233r = true;
        }

        public void onAnimationEnd(Animator animator) {
            mo10571a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f7233r) {
                qe7.m25633i(this.f7228a, this.f7229d);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f7233r) {
                qe7.m25633i(this.f7228a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            mo10571a();
            transition.mo10517e0(this);
        }

        public void onTransitionPause(Transition transition) {
            mo10572b(false);
        }

        public void onTransitionResume(Transition transition) {
            mo10572b(true);
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    public static class C1451c {

        /* renamed from: a */
        public boolean f7234a;

        /* renamed from: b */
        public boolean f7235b;

        /* renamed from: c */
        public int f7236c;

        /* renamed from: d */
        public int f7237d;

        /* renamed from: e */
        public ViewGroup f7238e;

        /* renamed from: f */
        public ViewGroup f7239f;
    }

    public Visibility() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f7190e0 != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo10565A0(android.view.ViewGroup r18, p000.bx6 r19, int r20, p000.bx6 r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f7223x1
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f8292b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f8292b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p000.e35.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = r12
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = r11
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = r11
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = r12
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            bx6 r14 = r0.mo10502N(r13, r12)
            bx6 r15 = r0.mo10493C(r13, r12)
            androidx.transition.Visibility$c r14 = r0.mo10569w0(r14, r15)
            boolean r14 = r14.f7234a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = androidx.transition.C1463d.m10219a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f7190e0
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = r11
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = r11
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f8291a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            fc7 r4 = p000.ic7.m19556b(r18)
            r4.mo19232c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo10482B0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            fc7 r1 = p000.ic7.m19556b(r18)
            r1.mo19233d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            androidx.transition.Visibility$a r3 = new androidx.transition.Visibility$a
            r3.<init>(r1, r10, r5)
            r0.mo10510a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            p000.qe7.m25633i(r8, r11)
            android.animation.Animator r1 = r0.mo10482B0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            androidx.transition.Visibility$b r2 = new androidx.transition.Visibility$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            p000.C2688kl.m20816a(r1, r2)
            r0.mo10510a(r2)
            goto L_0x0106
        L_0x0103:
            p000.qe7.m25633i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo10565A0(android.view.ViewGroup, bx6, int, bx6, int):android.animation.Animator");
    }

    /* renamed from: B0 */
    public Animator mo10482B0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        return null;
    }

    /* renamed from: C0 */
    public void mo10566C0(int i) {
        if ((i & -4) == 0) {
            this.f7223x1 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: M */
    public String[] mo10404M() {
        return f7222y1;
    }

    /* renamed from: O */
    public boolean mo10503O(bx6 bx6, bx6 bx62) {
        if (bx6 == null && bx62 == null) {
            return false;
        }
        if (bx6 != null && bx62 != null && bx62.f8291a.containsKey("android:visibility:visibility") != bx6.f8291a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1451c w0 = mo10569w0(bx6, bx62);
        if (!w0.f7234a) {
            return false;
        }
        if (w0.f7236c == 0 || w0.f7237d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        mo10567u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        mo10567u0(bx6);
    }

    /* renamed from: t */
    public Animator mo10407t(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        C1451c w0 = mo10569w0(bx6, bx62);
        if (!w0.f7234a) {
            return null;
        }
        if (w0.f7238e == null && w0.f7239f == null) {
            return null;
        }
        if (w0.f7235b) {
            return mo10570x0(viewGroup, bx6, w0.f7236c, bx62, w0.f7237d);
        }
        return mo10565A0(viewGroup, bx6, w0.f7236c, bx62, w0.f7237d);
    }

    /* renamed from: u0 */
    public final void mo10567u0(bx6 bx6) {
        bx6.f8291a.put("android:visibility:visibility", Integer.valueOf(bx6.f8292b.getVisibility()));
        bx6.f8291a.put("android:visibility:parent", bx6.f8292b.getParent());
        int[] iArr = new int[2];
        bx6.f8292b.getLocationOnScreen(iArr);
        bx6.f8291a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: v0 */
    public int mo10568v0() {
        return this.f7223x1;
    }

    /* renamed from: w0 */
    public final C1451c mo10569w0(bx6 bx6, bx6 bx62) {
        C1451c cVar = new C1451c();
        cVar.f7234a = false;
        cVar.f7235b = false;
        if (bx6 == null || !bx6.f8291a.containsKey("android:visibility:visibility")) {
            cVar.f7236c = -1;
            cVar.f7238e = null;
        } else {
            cVar.f7236c = ((Integer) bx6.f8291a.get("android:visibility:visibility")).intValue();
            cVar.f7238e = (ViewGroup) bx6.f8291a.get("android:visibility:parent");
        }
        if (bx62 == null || !bx62.f8291a.containsKey("android:visibility:visibility")) {
            cVar.f7237d = -1;
            cVar.f7239f = null;
        } else {
            cVar.f7237d = ((Integer) bx62.f8291a.get("android:visibility:visibility")).intValue();
            cVar.f7239f = (ViewGroup) bx62.f8291a.get("android:visibility:parent");
        }
        if (bx6 != null && bx62 != null) {
            int i = cVar.f7236c;
            int i2 = cVar.f7237d;
            if (i == i2 && cVar.f7238e == cVar.f7239f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f7235b = false;
                    cVar.f7234a = true;
                } else if (i2 == 0) {
                    cVar.f7235b = true;
                    cVar.f7234a = true;
                }
            } else if (cVar.f7239f == null) {
                cVar.f7235b = false;
                cVar.f7234a = true;
            } else if (cVar.f7238e == null) {
                cVar.f7235b = true;
                cVar.f7234a = true;
            }
        } else if (bx6 == null && cVar.f7237d == 0) {
            cVar.f7235b = true;
            cVar.f7234a = true;
        } else if (bx62 == null && cVar.f7236c == 0) {
            cVar.f7235b = false;
            cVar.f7234a = true;
        }
        return cVar;
    }

    /* renamed from: x0 */
    public Animator mo10570x0(ViewGroup viewGroup, bx6 bx6, int i, bx6 bx62, int i2) {
        if ((this.f7223x1 & 1) != 1 || bx62 == null) {
            return null;
        }
        if (bx6 == null) {
            View view = (View) bx62.f8292b.getParent();
            if (mo10569w0(mo10493C(view, false), mo10502N(view, false)).f7234a) {
                return null;
            }
        }
        return mo10484z0(viewGroup, bx62.f8292b, bx6, bx62);
    }

    /* renamed from: z0 */
    public Animator mo10484z0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11768e);
        int g = e27.m15648g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (g != 0) {
            mo10566C0(g);
        }
    }
}
