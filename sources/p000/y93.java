package p000;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: y93 */
/* compiled from: Key */
public abstract class y93 {

    /* renamed from: f */
    public static int f20099f = -1;

    /* renamed from: a */
    public int f20100a;

    /* renamed from: b */
    public int f20101b;

    /* renamed from: c */
    public String f20102c = null;

    /* renamed from: d */
    public int f20103d;

    /* renamed from: e */
    public HashMap<String, ConstraintAttribute> f20104e;

    public y93() {
        int i = f20099f;
        this.f20100a = i;
        this.f20101b = i;
    }

    /* renamed from: a */
    public abstract void mo12028a(HashMap<String, de7> hashMap);

    /* renamed from: b */
    public abstract y93 clone();

    /* renamed from: c */
    public y93 mo12030c(y93 y93) {
        this.f20100a = y93.f20100a;
        this.f20101b = y93.f20101b;
        this.f20102c = y93.f20102c;
        this.f20103d = y93.f20103d;
        this.f20104e = y93.f20104e;
        return this;
    }

    /* renamed from: d */
    public abstract void mo12032d(HashSet<String> hashSet);

    /* renamed from: e */
    public abstract void mo12033e(Context context, AttributeSet attributeSet);

    /* renamed from: f */
    public boolean mo28001f(String str) {
        String str2 = this.f20102c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: g */
    public void mo28002g(int i) {
        this.f20100a = i;
    }

    /* renamed from: h */
    public void mo12034h(HashMap<String, Integer> hashMap) {
    }

    /* renamed from: i */
    public y93 mo28003i(int i) {
        this.f20101b = i;
        return this;
    }

    /* renamed from: j */
    public boolean mo28004j(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: k */
    public float mo28005k(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    /* renamed from: l */
    public int mo28006l(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }
}
