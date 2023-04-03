package p000;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: ue4 */
/* compiled from: ObjectAnimatorUtils */
public class ue4 {
    /* renamed from: a */
    public static <T> ObjectAnimator m28205a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
