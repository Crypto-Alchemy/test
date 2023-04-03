package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.t */
/* compiled from: ScrollbarHelper */
public class C1341t {
    /* renamed from: a */
    public static int m9716a(RecyclerView.C1260x xVar, C1334q qVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.mo9234U() == 0 || xVar.mo9525b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.mo9271o0(view) - layoutManager.mo9271o0(view2)) + 1;
        }
        return Math.min(qVar.mo9941n(), qVar.mo9931d(view2) - qVar.mo9934g(view));
    }

    /* renamed from: b */
    public static int m9717b(RecyclerView.C1260x xVar, C1334q qVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int i;
        if (layoutManager.mo9234U() == 0 || xVar.mo9525b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.mo9271o0(view), layoutManager.mo9271o0(view2));
        int max = Math.max(layoutManager.mo9271o0(view), layoutManager.mo9271o0(view2));
        if (z2) {
            i = Math.max(0, (xVar.mo9525b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(qVar.mo9931d(view2) - qVar.mo9934g(view))) / ((float) (Math.abs(layoutManager.mo9271o0(view) - layoutManager.mo9271o0(view2)) + 1)))) + ((float) (qVar.mo9940m() - qVar.mo9934g(view))));
    }

    /* renamed from: c */
    public static int m9718c(RecyclerView.C1260x xVar, C1334q qVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.mo9234U() == 0 || xVar.mo9525b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return xVar.mo9525b();
        }
        return (int) ((((float) (qVar.mo9931d(view2) - qVar.mo9934g(view))) / ((float) (Math.abs(layoutManager.mo9271o0(view) - layoutManager.mo9271o0(view2)) + 1))) * ((float) xVar.mo9525b()));
    }
}
