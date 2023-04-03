package p000;

import android.util.Property;
import android.view.ViewGroup;

/* renamed from: ke0 */
/* compiled from: ChildrenAlphaProperty */
public class ke0 extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f30853a = new ke0("childrenAlpha");

    public ke0(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(g35.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(g35.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
