package p000;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: zj */
/* compiled from: AnimateLayoutChangeDetector */
public final class C3730zj {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f20560b;

    /* renamed from: a */
    public LinearLayoutManager f20561a;

    /* renamed from: zj$a */
    /* compiled from: AnimateLayoutChangeDetector */
    public class C3731a implements Comparator<int[]> {
        public C3731a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f20560b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C3730zj(LinearLayoutManager linearLayoutManager) {
        this.f20561a = linearLayoutManager;
    }

    /* renamed from: c */
    public static boolean m31251c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m31251c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo28450a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int U = this.f20561a.mo9234U();
        if (U == 0) {
            return true;
        }
        if (this.f20561a.mo8930v2() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = U;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i5 = 0;
        while (i5 < U) {
            View T = this.f20561a.mo9231T(i5);
            if (T != null) {
                ViewGroup.LayoutParams layoutParams = T.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f20560b;
                }
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = T.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = T.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = T.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = T.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C3731a());
        for (int i6 = 1; i6 < U; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        int[] iArr5 = iArr2[0];
        int i7 = iArr5[1];
        int i8 = iArr5[0];
        int i9 = i7 - i8;
        if (i8 > 0 || iArr2[U - 1][1] < i9) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo28451b() {
        int U = this.f20561a.mo9234U();
        for (int i = 0; i < U; i++) {
            if (m31251c(this.f20561a.mo9231T(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo28452d() {
        if ((!mo28450a() || this.f20561a.mo9234U() <= 1) && mo28451b()) {
            return true;
        }
        return false;
    }
}
