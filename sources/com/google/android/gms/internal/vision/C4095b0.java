package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.b0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class C4095b0 {

    /* renamed from: b */
    public static volatile C4095b0 f22853b;

    /* renamed from: c */
    public static volatile C4095b0 f22854c;

    /* renamed from: d */
    public static final C4095b0 f22855d = new C4095b0(true);

    /* renamed from: a */
    public final Map<C4096a, C4105e0.C4109d<?, ?>> f22856a;

    /* renamed from: com.google.android.gms.internal.vision.b0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static final class C4096a {

        /* renamed from: a */
        public final Object f22857a;

        /* renamed from: b */
        public final int f22858b;

        public C4096a(Object obj, int i) {
            this.f22857a = obj;
            this.f22858b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4096a)) {
                return false;
            }
            C4096a aVar = (C4096a) obj;
            if (this.f22857a == aVar.f22857a && this.f22858b == aVar.f22858b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f22857a) * 65535) + this.f22858b;
        }
    }

    public C4095b0() {
        this.f22856a = new HashMap();
    }

    /* renamed from: b */
    public static C4095b0 m34203b() {
        C4095b0 b0Var = f22853b;
        if (b0Var == null) {
            synchronized (C4095b0.class) {
                b0Var = f22853b;
                if (b0Var == null) {
                    b0Var = f22855d;
                    f22853b = b0Var;
                }
            }
        }
        return b0Var;
    }

    /* renamed from: c */
    public static C4095b0 m34204c() {
        Class<C4095b0> cls = C4095b0.class;
        C4095b0 b0Var = f22854c;
        if (b0Var != null) {
            return b0Var;
        }
        synchronized (cls) {
            C4095b0 b0Var2 = f22854c;
            if (b0Var2 != null) {
                return b0Var2;
            }
            C4095b0 b = t09.m52040b(cls);
            f22854c = b;
            return b;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends k59> C4105e0.C4109d<ContainingType, ?> mo31159a(ContainingType containingtype, int i) {
        return this.f22856a.get(new C4096a(containingtype, i));
    }

    public C4095b0(boolean z) {
        this.f22856a = Collections.emptyMap();
    }
}
