package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vy3 */
/* compiled from: MotionSpec */
public class vy3 {

    /* renamed from: a */
    public final y16<String, wy3> f35191a = new y16<>();

    /* renamed from: b */
    public final y16<String, PropertyValuesHolder[]> f35192b = new y16<>();

    /* renamed from: a */
    public static void m53609a(vy3 vy3, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            vy3.mo48857l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            vy3.mo48858m(objectAnimator.getPropertyName(), wy3.m54134b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: c */
    public static vy3 m53610c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m53611d(context, resourceId);
    }

    /* renamed from: d */
    public static vy3 m53611d(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m53612e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m53612e(arrayList);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            return null;
        }
    }

    /* renamed from: e */
    public static vy3 m53612e(List<Animator> list) {
        vy3 vy3 = new vy3();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m53609a(vy3, list.get(i));
        }
        return vy3;
    }

    /* renamed from: b */
    public final PropertyValuesHolder[] mo48848b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy3)) {
            return false;
        }
        return this.f35191a.equals(((vy3) obj).f35191a);
    }

    /* renamed from: f */
    public <T> ObjectAnimator mo48850f(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo48851g(str));
        ofPropertyValuesHolder.setProperty(property);
        mo48852h(str).mo49320a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] mo48851g(String str) {
        if (mo48855j(str)) {
            return mo48848b(this.f35192b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public wy3 mo48852h(String str) {
        if (mo48856k(str)) {
            return this.f35191a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f35191a.hashCode();
    }

    /* renamed from: i */
    public long mo48854i() {
        int size = this.f35191a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            wy3 m = this.f35191a.mo27921m(i);
            j = Math.max(j, m.mo49321c() + m.mo49322d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean mo48855j(String str) {
        if (this.f35192b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo48856k(String str) {
        if (this.f35191a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void mo48857l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f35192b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void mo48858m(String str, wy3 wy3) {
        this.f35191a.put(str, wy3);
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f35191a + "}\n";
    }
}
