package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0149b;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jb\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u0014"}, mo44877d2 = {"Laz4;", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activityReference", "", "isSellAvailable", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "Lr37;", "onMoonBuyClickListener", "onMoonSellClickListener", "onCancelClickListener", "Landroid/app/Dialog;", "e", "Landroid/content/Context;", "context", "d", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: az4 */
/* compiled from: PurchaseMethod.kt */
public final class az4 {

    /* renamed from: a */
    public static final az4 f36617a = new az4();

    /* renamed from: f */
    public static final void m55680f(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: g */
    public static final void m55681g(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: h */
    public static final void m55682h(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: d */
    public final Dialog mo50425d(Context context) {
        Dialog dialog = new Dialog(context, 2132017235);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getAttributes().gravity = 17;
            window.getAttributes().width = -1;
        }
        return dialog;
    }

    /* renamed from: e */
    public final Dialog mo50426e(WeakReference<Activity> weakReference, boolean z, rc2<? super DialogInterface, r37> rc2, rc2<? super DialogInterface, r37> rc22, rc2<? super DialogInterface, r37> rc23) {
        boolean z2;
        int i;
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog d = f36617a.mo50425d(activity);
        nf1 a = nf1.m48752a(activity.getLayoutInflater().inflate(R.layout.dialog_purchase_method, (ViewGroup) null));
        vx2.m53590f(a, "bind(it.layoutInflater.i…g_purchase_method, null))");
        a.f32107d.setOnClickListener(new xy4(rc23, d));
        int i2 = 0;
        if (C0149b.m874l() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            a.f32108e.setImageResource(R.drawable.ic_moonpay_logo_dark_mode);
        }
        a.f32105b.setOnClickListener(new yy4(rc2, d));
        a.f32106c.setOnClickListener(new zy4(rc22, d));
        MaterialButton materialButton = a.f32106c;
        vx2.m53590f(materialButton, "btnSell");
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        materialButton.setVisibility(i);
        AppCompatTextView appCompatTextView = a.f32110g;
        vx2.m53590f(appCompatTextView, "tvSellContent");
        if (!z) {
            i2 = 8;
        }
        appCompatTextView.setVisibility(i2);
        d.setContentView(a.mo46068b());
        d.show();
        return d;
    }
}
