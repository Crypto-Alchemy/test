package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1328m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: x46 */
/* compiled from: SmoothCalendarLayoutManager */
public class x46 extends LinearLayoutManager {

    /* renamed from: x46$a */
    /* compiled from: SmoothCalendarLayoutManager */
    public class C6692a extends C1328m {
        public C6692a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public x46(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: R1 */
    public void mo8895R1(RecyclerView recyclerView, RecyclerView.C1260x xVar, int i) {
        C6692a aVar = new C6692a(recyclerView.getContext());
        aVar.setTargetPosition(i);
        mo9230S1(aVar);
    }
}
