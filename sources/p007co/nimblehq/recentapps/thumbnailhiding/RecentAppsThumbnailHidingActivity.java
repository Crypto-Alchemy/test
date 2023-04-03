package p007co.nimblehq.recentapps.thumbnailhiding;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.n85;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014R\u001a\u0010\f\u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0016"}, mo44877d2 = {"Lco/nimblehq/recentapps/thumbnailhiding/RecentAppsThumbnailHidingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ln85;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "", "a", "Z", "B", "()Z", "enableSecureFlagOnLowApiDevices", "d", "A", "enableSecureFlagOnCustomGestureNavigationDevices", "D", "isSecureFlagOnLowApiDevicesEnabled", "C", "isSecureFlagOnCustomGestureNavigationDevicesEnabled", "<init>", "()V", "library-recent-hide_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: co.nimblehq.recentapps.thumbnailhiding.RecentAppsThumbnailHidingActivity */
/* compiled from: RecentAppsThumbnailHidingActivity.kt */
public abstract class RecentAppsThumbnailHidingActivity extends AppCompatActivity implements n85 {

    /* renamed from: a */
    public final boolean f8503a;

    /* renamed from: d */
    public final boolean f8504d;

    /* renamed from: e */
    public Map<Integer, View> f8505e = new LinkedHashMap();

    /* renamed from: A */
    public boolean mo12132A() {
        return this.f8504d;
    }

    /* renamed from: B */
    public boolean mo12133B() {
        return this.f8503a;
    }

    /* renamed from: C */
    public final boolean mo12134C() {
        if (!mo12132A() || !v44.m28616e(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean mo12135D() {
        if (!mo12133B() || Build.VERSION.SDK_INT >= 26) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo12136j(Activity activity, boolean z) {
        n85.C2871a.m22857a(this, activity, z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo12135D() || mo12134C()) {
            k85.m20571a(this, true);
        }
    }
}
