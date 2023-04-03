package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C4245b;

/* renamed from: com.google.android.material.circularreveal.c */
/* compiled from: CircularRevealWidget */
public interface C4247c extends C4245b.C4246a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    /* compiled from: CircularRevealWidget */
    public static class C4249b implements TypeEvaluator<C4252e> {

        /* renamed from: b */
        public static final TypeEvaluator<C4252e> f23701b = new C4249b();

        /* renamed from: a */
        public final C4252e f23702a = new C4252e();

        /* renamed from: a */
        public C4252e evaluate(float f, C4252e eVar, C4252e eVar2) {
            this.f23702a.mo32475b(dp3.m43583d(eVar.f23705a, eVar2.f23705a, f), dp3.m43583d(eVar.f23706b, eVar2.f23706b, f), dp3.m43583d(eVar.f23707c, eVar2.f23707c, f));
            return this.f23702a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    /* compiled from: CircularRevealWidget */
    public static class C4250c extends Property<C4247c, C4252e> {

        /* renamed from: a */
        public static final Property<C4247c, C4252e> f23703a = new C4250c("circularReveal");

        public C4250c(String str) {
            super(C4252e.class, str);
        }

        /* renamed from: a */
        public C4252e get(C4247c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(C4247c cVar, C4252e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    /* compiled from: CircularRevealWidget */
    public static class C4251d extends Property<C4247c, Integer> {

        /* renamed from: a */
        public static final Property<C4247c, Integer> f23704a = new C4251d("circularRevealScrimColor");

        public C4251d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C4247c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(C4247c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    /* compiled from: CircularRevealWidget */
    public static class C4252e {

        /* renamed from: a */
        public float f23705a;

        /* renamed from: b */
        public float f23706b;

        /* renamed from: c */
        public float f23707c;

        public C4252e() {
        }

        /* renamed from: a */
        public boolean mo32474a() {
            if (this.f23707c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void mo32475b(float f, float f2, float f3) {
            this.f23705a = f;
            this.f23706b = f2;
            this.f23707c = f3;
        }

        /* renamed from: c */
        public void mo32476c(C4252e eVar) {
            mo32475b(eVar.f23705a, eVar.f23706b, eVar.f23707c);
        }

        public C4252e(float f, float f2, float f3) {
            this.f23705a = f;
            this.f23706b = f2;
            this.f23707c = f3;
        }

        public C4252e(C4252e eVar) {
            this(eVar.f23705a, eVar.f23706b, eVar.f23707c);
        }
    }

    /* renamed from: a */
    void mo32425a();

    /* renamed from: b */
    void mo32426b();

    int getCircularRevealScrimColor();

    C4252e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C4252e eVar);
}
