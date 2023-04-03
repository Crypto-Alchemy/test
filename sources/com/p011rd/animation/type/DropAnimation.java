package com.p011rd.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;
import p000.e87;

/* renamed from: com.rd.animation.type.DropAnimation */
public class DropAnimation extends C6678wx<AnimatorSet> {

    /* renamed from: d */
    public int f26646d;

    /* renamed from: e */
    public int f26647e;

    /* renamed from: f */
    public int f26648f;

    /* renamed from: g */
    public int f26649g;

    /* renamed from: h */
    public int f26650h;

    /* renamed from: i */
    public sk1 f26651i = new sk1();

    /* renamed from: com.rd.animation.type.DropAnimation$AnimationType */
    public enum AnimationType {
        Width,
        Height,
        Radius
    }

    /* renamed from: com.rd.animation.type.DropAnimation$a */
    public class C5368a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ AnimationType f26653a;

        public C5368a(AnimationType animationType) {
            this.f26653a = animationType;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            DropAnimation.this.mo39254k(valueAnimator, this.f26653a);
        }
    }

    /* renamed from: com.rd.animation.type.DropAnimation$b */
    public static /* synthetic */ class C5369b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26655a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.rd.animation.type.DropAnimation$AnimationType[] r0 = com.p011rd.animation.type.DropAnimation.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26655a = r0
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.p011rd.animation.type.DropAnimation.AnimationType.Width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26655a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.p011rd.animation.type.DropAnimation.AnimationType.Height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26655a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.p011rd.animation.type.DropAnimation.AnimationType.Radius     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p011rd.animation.type.DropAnimation.C5369b.<clinit>():void");
        }
    }

    public DropAnimation(e87.C5755a aVar) {
        super(aVar);
    }

    /* renamed from: g */
    public AnimatorSet mo28832a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* renamed from: h */
    public final ValueAnimator mo39251h(int i, int i2, long j, AnimationType animationType) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C5368a(animationType));
        return ofInt;
    }

    /* renamed from: i */
    public DropAnimation mo39252i(long j) {
        super.mo49306b(j);
        return this;
    }

    /* renamed from: j */
    public final boolean mo39253j(int i, int i2, int i3, int i4, int i5) {
        if (this.f26646d == i && this.f26647e == i2 && this.f26648f == i3 && this.f26649g == i4 && this.f26650h == i5) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo39254k(ValueAnimator valueAnimator, AnimationType animationType) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = C5369b.f26655a[animationType.ordinal()];
        if (i == 1) {
            this.f26651i.mo47809f(intValue);
        } else if (i == 2) {
            this.f26651i.mo47807d(intValue);
        } else if (i == 3) {
            this.f26651i.mo47808e(intValue);
        }
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(this.f26651i);
        }
    }

    /* renamed from: l */
    public DropAnimation mo28833d(float f) {
        long j;
        T t = this.f35463c;
        if (t != null) {
            long j2 = (long) (f * ((float) this.f35461a));
            boolean z = false;
            Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                if (z) {
                    j = j2 - duration;
                } else {
                    j = j2;
                }
                if (j >= 0) {
                    if (j >= duration) {
                        j = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j);
                    }
                    if (!z && duration >= this.f35461a) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    /* renamed from: m */
    public DropAnimation mo39256m(int i, int i2, int i3, int i4, int i5) {
        int i6 = i5;
        if (mo39253j(i, i2, i3, i4, i5)) {
            this.f35463c = mo28832a();
            int i7 = i;
            this.f26646d = i7;
            int i8 = i2;
            this.f26647e = i8;
            this.f26648f = i3;
            this.f26649g = i4;
            this.f26650h = i6;
            int i9 = (int) (((double) i6) / 1.5d);
            long j = this.f35461a;
            ValueAnimator h = mo39251h(i7, i8, j, AnimationType.Width);
            AnimationType animationType = AnimationType.Height;
            long j2 = j / 2;
            ValueAnimator h2 = mo39251h(i3, i4, j2, animationType);
            AnimationType animationType2 = AnimationType.Radius;
            ValueAnimator h3 = mo39251h(i4, i3, j2, animationType);
            ValueAnimator h4 = mo39251h(i9, i5, j2, animationType2);
            ((AnimatorSet) this.f35463c).play(h2).with(mo39251h(i5, i9, j2, animationType2)).with(h).before(h3).before(h4);
        }
        return this;
    }
}
