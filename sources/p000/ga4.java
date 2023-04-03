package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.NotificationFragment;

/* renamed from: ga4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ga4 implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationFragment f37995a;

    /* renamed from: b */
    public final /* synthetic */ ga2 f37996b;

    /* renamed from: c */
    public final /* synthetic */ int[] f37997c;

    /* renamed from: d */
    public final /* synthetic */ int[] f37998d;

    public /* synthetic */ ga4(NotificationFragment notificationFragment, ga2 ga2, int[] iArr, int[] iArr2) {
        this.f37995a = notificationFragment;
        this.f37996b = ga2;
        this.f37997c = iArr;
        this.f37998d = iArr2;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        NotificationFragment.m66672b0(this.f37995a, this.f37996b, this.f37997c, this.f37998d, view, i, i2, i3, i4);
    }
}
