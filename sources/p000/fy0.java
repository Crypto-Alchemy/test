package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0007JP\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011H\u0007J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u001b"}, mo44877d2 = {"Lfy0;", "", "Landroid/app/Activity;", "activity", "", "title", "desc", "", "cancelable", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListner", "Lr37;", "e", "(Landroid/app/Activity;Ljava/lang/Integer;IZLandroid/content/DialogInterface$OnDismissListener;)V", "", "dismissListener", "f", "Lkotlin/Function0;", "onPositiveClick", "onNegativeClick", "i", "Landroid/content/Context;", "context", "Landroid/app/Dialog;", "d", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fy0 */
/* compiled from: CustomPop.kt */
public final class fy0 {

    /* renamed from: a */
    public static final fy0 f37927a = new fy0();

    /* renamed from: e */
    public static final void m57956e(Activity activity, Integer num, int i, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        String str;
        vx2.m53591g(activity, "activity");
        if (num != null) {
            str = activity.getString(num.intValue());
        } else {
            str = null;
        }
        String string = activity.getString(i);
        vx2.m53590f(string, "activity.getString(desc)");
        m57957f(activity, str, string, z, onDismissListener);
    }

    /* renamed from: f */
    public static final void m57957f(Activity activity, String str, String str2, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        vx2.m53591g(activity, "activity");
        vx2.m53591g(str2, "desc");
        Dialog d = f37927a.mo51816d(activity, z);
        qe1 a = qe1.m50549a(activity.getLayoutInflater().inflate(R.layout.dialog_alert, (ViewGroup) null));
        vx2.m53590f(a, "bind(activity.layoutInfl…yout.dialog_alert, null))");
        if (str == null) {
            a.f33075g.setVisibility(8);
        } else {
            a.f33075g.setText(str);
        }
        a.f33074f.setText(str2);
        a.f33073e.setOnClickListener(new ey0(d));
        d.setContentView(a.mo47078b());
        d.setOnDismissListener(onDismissListener);
        d.show();
    }

    /* renamed from: g */
    public static /* synthetic */ void m57958g(Activity activity, Integer num, int i, boolean z, DialogInterface.OnDismissListener onDismissListener, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        m57956e(activity, num, i, z, onDismissListener);
    }

    /* renamed from: h */
    public static final void m57959h(Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        dialog.dismiss();
    }

    /* renamed from: i */
    public static final void m57960i(Activity activity, String str, String str2, boolean z, pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(activity, "activity");
        vx2.m53591g(str2, "desc");
        Dialog d = f37927a.mo51816d(activity, z);
        qe1 a = qe1.m50549a(activity.getLayoutInflater().inflate(R.layout.dialog_alert, (ViewGroup) null));
        vx2.m53590f(a, "bind(activity.layoutInfl…yout.dialog_alert, null))");
        if (str == null) {
            a.f33075g.setVisibility(8);
        } else {
            a.f33075g.setText(str);
        }
        a.f33074f.setText(str2);
        a.f33073e.setVisibility(8);
        a.f33071c.setVisibility(0);
        a.f33070b.setVisibility(0);
        a.f33071c.setOnClickListener(new cy0(d, pc2));
        a.f33070b.setOnClickListener(new dy0(d, pc22));
        d.setContentView(a.mo47078b());
        d.show();
    }

    /* renamed from: j */
    public static final void m57961j(Dialog dialog, pc2 pc2, View view) {
        vx2.m53591g(dialog, "$dialog");
        dialog.dismiss();
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: k */
    public static final void m57962k(Dialog dialog, pc2 pc2, View view) {
        vx2.m53591g(dialog, "$dialog");
        dialog.dismiss();
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    /* renamed from: d */
    public final Dialog mo51816d(Context context, boolean z) {
        Dialog dialog = new Dialog(context, 2132017235);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(z);
        dialog.setCanceledOnTouchOutside(z);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getAttributes().gravity = 17;
            window.getAttributes().width = -1;
        }
        return dialog;
    }
}
