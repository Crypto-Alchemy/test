package net.safemoon.androidwallet.activity.common;

import android.view.ViewGroup;
import androidx.media3.common.PlaybackException;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b&\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/common/CloseByDoubleBackActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "Landroid/view/ViewGroup;", "n0", "Lr37;", "onBackPressed", "", "A", "J", "backPressedTimeStamp", "<init>", "()V", "B", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CloseByDoubleBackActivity.kt */
public abstract class CloseByDoubleBackActivity extends AKTServerFunctions {

    /* renamed from: B */
    public static final C8220a f41554B = new C8220a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public long f41555A;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/common/CloseByDoubleBackActivity$a;", "", "", "BACK_PRESS_DELAY", "I", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.common.CloseByDoubleBackActivity$a */
    /* compiled from: CloseByDoubleBackActivity.kt */
    public static final class C8220a {
        public C8220a() {
        }

        public /* synthetic */ C8220a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: n0 */
    public abstract ViewGroup mo56625n0();

    public void onBackPressed() {
        if (this.f41555A + ((long) PlaybackException.ERROR_CODE_IO_UNSPECIFIED) > System.currentTimeMillis()) {
            super.onBackPressed();
        } else if (mo56625n0() != null) {
            ViewGroup n0 = mo56625n0();
            vx2.m53588d(n0);
            Snackbar.m35952a0(n0, R.string.press_again_to_exit, 0).mo33494Q();
        }
        this.f41555A = System.currentTimeMillis();
    }
}
