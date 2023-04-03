package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: b9 */
/* compiled from: ActionBarBackgroundDrawable */
public class C1614b9 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f7999a;

    /* renamed from: b9$a */
    /* compiled from: ActionBarBackgroundDrawable */
    public static class C1615a {
        /* renamed from: a */
        public static void m11169a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C1614b9(ActionBarContainer actionBarContainer) {
        this.f7999a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f7999a;
        if (actionBarContainer.f875x) {
            Drawable drawable = actionBarContainer.f874s;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f872k;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f7999a;
        Drawable drawable3 = actionBarContainer2.f873r;
        if (drawable3 != null && actionBarContainer2.f876y) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f7999a;
        if (!actionBarContainer.f875x) {
            Drawable drawable = actionBarContainer.f872k;
            if (drawable != null) {
                C1615a.m11169a(drawable, outline);
            }
        } else if (actionBarContainer.f874s != null) {
            C1615a.m11169a(actionBarContainer.f872k, outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
