package p000;

import android.app.Dialog;
import android.os.CountDownTimer;
import android.view.View;
import net.safemoon.androidwallet.activity.WipeDataActivity;

/* renamed from: vl7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class vl7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CountDownTimer f45329a;

    /* renamed from: d */
    public final /* synthetic */ WipeDataActivity f45330d;

    /* renamed from: e */
    public final /* synthetic */ Dialog f45331e;

    public /* synthetic */ vl7(CountDownTimer countDownTimer, WipeDataActivity wipeDataActivity, Dialog dialog) {
        this.f45329a = countDownTimer;
        this.f45330d = wipeDataActivity;
        this.f45331e = dialog;
    }

    public final void onClick(View view) {
        WipeDataActivity.m65664M(this.f45329a, this.f45330d, this.f45331e, view);
    }
}
