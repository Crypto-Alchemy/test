package net.safemoon.androidwallet.activity.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0719h;
import androidx.lifecycle.C0720i;
import androidx.lifecycle.Lifecycle;
import com.yariksoffice.lingver.Lingver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTLoginActivity;
import net.safemoon.androidwallet.receivers.ConnectionLiveData;
import net.safemoon.androidwallet.utils.StoragePermissionLauncher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b6\u00107J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0004J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u0006H\u0007J\u0006\u0010\u0014\u001a\u00020\u0006J\b\u0010\u0015\u001a\u00020\u0006H\u0004J\b\u0010\u0017\u001a\u00020\u0016H\u0004J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0004J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u001dJ\b\u0010\"\u001a\u00020\u0006H\u0002J\b\u0010#\u001a\u00020\u0006H\u0002R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010,\u001a\u00020\u001d8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010+¨\u00068"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ltg3;", "Ln85;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/content/Context;", "newBase", "attachBaseContext", "Lnet/safemoon/androidwallet/utils/StoragePermissionLauncher;", "L", "Lji4;", "K", "onPostCreate", "J", "onStart", "onStop", "onAppStart", "E", "D", "Landroid/content/Intent;", "N", "Ljh4;", "onKeyboardVisibilityListener", "P", "Landroid/app/Activity;", "activity", "", "inRecentAppsMode", "j", "isAuthSteps", "Q", "F", "H", "a", "Lnet/safemoon/androidwallet/utils/StoragePermissionLauncher;", "storagePermissionLauncher", "d", "Lji4;", "activityForResult", "e", "Z", "isEnableSecureScreen", "()Z", "O", "(Z)V", "Landroid/widget/PopupWindow;", "g", "Landroid/widget/PopupWindow;", "alertOutSideTouchablePopup", "k", "isActive", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BasicActivity.kt */
public class BasicActivity extends AppCompatActivity implements tg3, n85 {

    /* renamed from: a */
    public StoragePermissionLauncher f41543a = new StoragePermissionLauncher(this);

    /* renamed from: d */
    public ji4 f41544d = new ji4(this);

    /* renamed from: e */
    public boolean f41545e;

    /* renamed from: g */
    public PopupWindow f41546g;

    /* renamed from: k */
    public boolean f41547k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002XD¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, mo44877d2 = {"net/safemoon/androidwallet/activity/common/BasicActivity$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lr37;", "onGlobalLayout", "", "a", "Z", "alreadyOpen", "", "d", "I", "defaultKeyboardHeightDP", "e", "EstimatedKeyboardDP", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "rect", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.common.BasicActivity$a */
    /* compiled from: BasicActivity.kt */
    public static final class C8219a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public boolean f41548a;

        /* renamed from: d */
        public final int f41549d = 100;

        /* renamed from: e */
        public final int f41550e = (100 + 48);

        /* renamed from: g */
        public final Rect f41551g = new Rect();

        /* renamed from: k */
        public final /* synthetic */ View f41552k;

        /* renamed from: r */
        public final /* synthetic */ jh4 f41553r;

        public C8219a(View view, jh4 jh4) {
            this.f41552k = view;
            this.f41553r = jh4;
        }

        public void onGlobalLayout() {
            boolean z = true;
            int applyDimension = (int) TypedValue.applyDimension(1, (float) this.f41550e, this.f41552k.getResources().getDisplayMetrics());
            this.f41552k.getWindowVisibleDisplayFrame(this.f41551g);
            int height = this.f41552k.getRootView().getHeight();
            Rect rect = this.f41551g;
            if (height - (rect.bottom - rect.top) < applyDimension) {
                z = false;
            }
            if (z != this.f41548a) {
                this.f41548a = z;
                this.f41553r.mo52693e(z);
            }
        }
    }

    /* renamed from: G */
    public static final void m65673G(BasicActivity basicActivity) {
        vx2.m53591g(basicActivity, "this$0");
        if (basicActivity.f41546g == null) {
            basicActivity.f41546g = new PopupWindow(LayoutInflater.from(basicActivity).inflate(R.layout.popup_network_change_receiver, (ViewGroup) null, false), -1, -2);
        }
        View findViewById = basicActivity.findViewById(R.id.popup_parent_for_alert);
        if (findViewById != null && !basicActivity.isFinishing() && !basicActivity.isDestroyed()) {
            PopupWindow popupWindow = basicActivity.f41546g;
            vx2.m53588d(popupWindow);
            popupWindow.showAtLocation(findViewById, 0, 0, 0);
        }
    }

    /* renamed from: I */
    public static final void m65674I(BasicActivity basicActivity) {
        vx2.m53591g(basicActivity, "this$0");
        PopupWindow popupWindow = basicActivity.f41546g;
        if (popupWindow != null) {
            vx2.m53588d(popupWindow);
            if (popupWindow.isShowing() && !basicActivity.isFinishing() && !basicActivity.isDestroyed()) {
                PopupWindow popupWindow2 = basicActivity.f41546g;
                vx2.m53588d(popupWindow2);
                popupWindow2.dismiss();
            }
        }
    }

    /* renamed from: M */
    public static final void m65675M(BasicActivity basicActivity, Boolean bool) {
        vx2.m53591g(basicActivity, "this$0");
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                basicActivity.mo56994H();
            } else {
                basicActivity.mo56993F();
            }
        }
    }

    /* renamed from: D */
    public final void mo56991D() {
        Intent intent = new Intent(this, AKTLoginActivity.class);
        intent.putExtra("bundle.KEY_SOURCE", "bundle.SOURCE_APP");
        startActivity(intent);
    }

    /* renamed from: E */
    public final void mo56992E() {
        long j;
        boolean d = a77.m55426d(this);
        boolean z = false;
        boolean e = f06.m57514e(this, "TWO_FACTOR", false);
        long B = C2127d2.m14635B();
        if (f06.m57512c(this, "TIMENOW")) {
            j = f06.m57516g(this, "TIMENOW");
        } else {
            j = 0;
        }
        long j2 = B - j;
        Long l = C9198q.f44133d;
        vx2.m53590f(l, "loginTimeout");
        if (j2 > l.longValue()) {
            z = true;
        }
        if ((d && e) || z) {
            mo56991D();
        }
    }

    /* renamed from: F */
    public final void mo56993F() {
        new Handler(Looper.getMainLooper()).post(new C9425uz(this));
    }

    /* renamed from: H */
    public final void mo56994H() {
        new Handler(Looper.getMainLooper()).post(new C9473vz(this));
    }

    /* renamed from: J */
    public final void mo56995J() {
        String simpleName = getClass().getSimpleName();
        HashMap<String, Boolean> hashMap = MyApplicationClass.m64669c().f41191s;
        vx2.m53590f(hashMap, "get().bioEnabledForTheActivityMap");
        hashMap.put(simpleName, Boolean.TRUE);
    }

    /* renamed from: K */
    public final ji4 mo56996K() {
        return this.f41544d;
    }

    /* renamed from: L */
    public final StoragePermissionLauncher mo56997L() {
        return this.f41543a;
    }

    /* renamed from: N */
    public final Intent mo56998N() {
        Intent intent = new Intent(this, AKTLoginActivity.class);
        intent.putExtra("bundle.KEY_SOURCE", "bundle.SOURCE_APP_FOR_RESULT");
        return intent;
    }

    /* renamed from: O */
    public final void mo56999O(boolean z) {
        this.f41545e = z;
    }

    /* renamed from: P */
    public final void mo57000P(jh4 jh4) {
        vx2.m53591g(jh4, "onKeyboardVisibilityListener");
        View findViewById = findViewById(16908290);
        vx2.m53589e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        View childAt = ((ViewGroup) findViewById).getChildAt(0);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new C8219a(childAt, jh4));
    }

    /* renamed from: Q */
    public final void mo57001Q(boolean z) {
        Integer valueOf = Integer.valueOf(R.string.akt_connection_error_message);
        if (!z) {
            C9001np.m69943a0(new WeakReference(this), (Integer) null, valueOf, R.string.action_ok, (pc2) null, 18, (Object) null);
        } else {
            C9001np.m69939X(new WeakReference(this), (Integer) null, valueOf, R.string.action_ok, (pc2) null, 18, (Object) null);
        }
    }

    public void attachBaseContext(Context context) {
        vx2.m53591g(context, "newBase");
        super.attachBaseContext(new b14(context).mo50449e(context, g06.f37938a.mo51832a(context)));
    }

    /* renamed from: j */
    public void mo12136j(Activity activity, boolean z) {
        vx2.m53591g(activity, "activity");
        if (this.f41545e) {
            return;
        }
        if (z) {
            getWindow().addFlags(8192);
        } else {
            getWindow().clearFlags(8192);
        }
    }

    @C0719h(Lifecycle.Event.ON_START)
    public final void onAppStart() {
        Boolean bool = MyApplicationClass.m64669c().f41191s.get(getClass().getSimpleName());
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        boolean d = a77.m55426d(this);
        boolean z = false;
        boolean e = f06.m57514e(this, "TWO_FACTOR", false);
        long B = C2127d2.m14635B();
        long j = 0;
        if (f06.m57512c(this, "TIMENOW")) {
            j = f06.m57516g(this, "TIMENOW");
        }
        long j2 = B - j;
        Long l = C9198q.f44133d;
        vx2.m53590f(l, "loginTimeout");
        if (j2 > l.longValue()) {
            z = true;
        }
        if (booleanValue) {
            Application application = getApplication();
            vx2.m53589e(application, "null cannot be cast to non-null type net.safemoon.androidwallet.MyApplicationClass");
            if (!((MyApplicationClass) application).f41186d && this.f41547k) {
                if ((d && e) || z) {
                    mo56991D();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ic2.m19550a(this);
        C0720i.m5123h().getLifecycle().mo6295a(this);
        g06 g06 = g06.f37938a;
        Context applicationContext = getApplicationContext();
        vx2.m53590f(applicationContext, "applicationContext");
        String a = g06.mo51832a(applicationContext);
        if (StringsKt__StringsKt.m63081R(a, "-r", false, 2, (Object) null)) {
            List B0 = StringsKt__StringsKt.m63061B0(a, new String[]{"-r"}, false, 0, 6, (Object) null);
            Lingver b = Lingver.f27846f.mo41597b();
            Context applicationContext2 = getApplicationContext();
            vx2.m53590f(applicationContext2, "applicationContext");
            Lingver.m43064m(b, applicationContext2, (String) B0.get(0), (String) B0.get(1), (String) null, 8, (Object) null);
            return;
        }
        Lingver b2 = Lingver.f27846f.mo41597b();
        Context applicationContext3 = getApplicationContext();
        vx2.m53590f(applicationContext3, "applicationContext");
        Lingver.m43064m(b2, applicationContext3, a, (String) null, (String) null, 12, (Object) null);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        new ConnectionLiveData(this).observe(this, new C9372tz(this));
    }

    public void onStart() {
        super.onStart();
        this.f41547k = true;
    }

    public void onStop() {
        super.onStop();
        this.f41547k = false;
    }
}
