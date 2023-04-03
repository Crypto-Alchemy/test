package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.c */
/* compiled from: FragmentAnim */
public class C0671c {
    /* renamed from: a */
    public static int m4886a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* renamed from: b */
    public static C0672a m4887b(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int a = m4886a(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = s35.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, a);
        if (onCreateAnimation != null) {
            return new C0672a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, a);
        if (onCreateAnimator != null) {
            return new C0672a(onCreateAnimator);
        }
        if (a == 0 && nextTransition != 0) {
            a = m4889d(context, nextTransition, z);
        }
        if (a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a);
                    if (loadAnimation != null) {
                        return new C0672a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a);
                    if (loadAnimator != null) {
                        return new C0672a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a);
                        if (loadAnimation2 != null) {
                            return new C0672a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m4888c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    public static int m4889d(Context context, int i, boolean z) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return m4888c(context, 16842936);
                        }
                        return m4888c(context, 16842937);
                    } else if (z) {
                        return z05.fragment_fade_enter;
                    } else {
                        return z05.fragment_fade_exit;
                    }
                } else if (z) {
                    return m4888c(context, 16842938);
                } else {
                    return m4888c(context, 16842939);
                }
            } else if (z) {
                return z05.fragment_close_enter;
            } else {
                return z05.fragment_close_exit;
            }
        } else if (z) {
            return z05.fragment_open_enter;
        } else {
            return z05.fragment_open_exit;
        }
    }

    /* renamed from: androidx.fragment.app.c$a */
    /* compiled from: FragmentAnim */
    public static class C0672a {

        /* renamed from: a */
        public final Animation f3824a;

        /* renamed from: b */
        public final Animator f3825b;

        public C0672a(Animation animation) {
            this.f3824a = animation;
            this.f3825b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C0672a(Animator animator) {
            this.f3824a = null;
            this.f3825b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* compiled from: FragmentAnim */
    public static class C0673b extends AnimationSet implements Runnable {

        /* renamed from: a */
        public final ViewGroup f3826a;

        /* renamed from: d */
        public final View f3827d;

        /* renamed from: e */
        public boolean f3828e;

        /* renamed from: g */
        public boolean f3829g;

        /* renamed from: k */
        public boolean f3830k = true;

        public C0673b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3826a = viewGroup;
            this.f3827d = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3830k = true;
            if (this.f3828e) {
                return !this.f3829g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3828e = true;
                xh4.m30102a(this.f3826a, this);
            }
            return true;
        }

        public void run() {
            if (this.f3828e || !this.f3830k) {
                this.f3826a.endViewTransition(this.f3827d);
                this.f3829g = true;
                return;
            }
            this.f3830k = false;
            this.f3826a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3830k = true;
            if (this.f3828e) {
                return !this.f3829g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3828e = true;
                xh4.m30102a(this.f3826a, this);
            }
            return true;
        }
    }
}
