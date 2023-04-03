package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: tb0 */
/* compiled from: CarouselItemDecoration */
public class tb0 extends RecyclerView.C1247n {

    /* renamed from: a */
    public int f34216a;

    /* renamed from: b */
    public int f34217b;

    public tb0(int i, int i2) {
        this.f34216a = i2;
        this.f34217b = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        int i;
        int i2;
        super.getItemOffsets(rect, view, recyclerView, xVar);
        int i3 = this.f34217b;
        int i4 = this.f34216a;
        if (i3 > 0) {
            i4 /= 2;
        }
        rect.right = i4;
        int i5 = 0;
        if (i3 > 0) {
            i = this.f34216a / 2;
        } else {
            i = 0;
        }
        rect.left = i;
        if (xVar.mo9525b() - 1 == recyclerView.mo9045g0(view)) {
            if (this.f34217b > 0) {
                i2 = (recyclerView.getMeasuredWidth() / 2) - (this.f34217b / 2);
            } else {
                i2 = 0;
            }
            rect.right = i2;
        }
        if (recyclerView.mo9045g0(view) == 0) {
            if (this.f34217b > 0) {
                i5 = (recyclerView.getMeasuredWidth() / 2) - (this.f34217b / 2);
            }
            rect.left = i5;
        }
    }
}
