package p000;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: j54 */
/* compiled from: NestedScrollingParentHelper */
public class j54 {

    /* renamed from: a */
    public int f13513a;

    /* renamed from: b */
    public int f13514b;

    public j54(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo21726a() {
        return this.f13513a | this.f13514b;
    }

    /* renamed from: b */
    public void mo21727b(View view, View view2, int i) {
        mo21728c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo21728c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f13514b = i;
        } else {
            this.f13513a = i;
        }
    }

    /* renamed from: d */
    public void mo21729d(View view) {
        mo21730e(view, 0);
    }

    /* renamed from: e */
    public void mo21730e(View view, int i) {
        if (i == 1) {
            this.f13514b = 0;
        } else {
            this.f13513a = 0;
        }
    }
}
