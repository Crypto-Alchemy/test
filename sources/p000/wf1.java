package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, mo44877d2 = {"Lwf1;", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activityReference", "", "transactionId", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListner", "Lr37;", "e", "Landroid/content/Context;", "context", "Landroid/app/Dialog;", "d", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wf1 */
/* compiled from: DialogSwapTransaction.kt */
public final class wf1 {

    /* renamed from: a */
    public static final wf1 f45511a = new wf1();

    /* renamed from: e */
    public static final void m73588e(WeakReference<Activity> weakReference, String str, DialogInterface.OnDismissListener onDismissListener) {
        vx2.m53591g(weakReference, "activityReference");
        vx2.m53591g(str, "transactionId");
        vx2.m53591g(onDismissListener, "dismissListner");
        Activity activity = weakReference.get();
        vx2.m53588d(activity);
        Activity activity2 = activity;
        Dialog d = f45511a.mo66693d(activity2);
        xf1 a = xf1.m54385a(activity2.getLayoutInflater().inflate(R.layout.dialog_swap_transaction, (ViewGroup) null));
        vx2.m53590f(a, "bind(activity.layoutInfl…_swap_transaction, null))");
        a.f35622h.setText(activity2.getString(R.string.title_track_transaction));
        a.f35617c.setText(str);
        a.f35617c.setOnClickListener(new tf1(activity2, str));
        a.f35616b.setOnClickListener(new uf1(activity2, str));
        a.f35618d.setOnClickListener(new vf1(d));
        d.setContentView(a.mo49475b());
        d.setOnDismissListener(onDismissListener);
        d.show();
    }

    /* renamed from: f */
    public static final void m73589f(Activity activity, String str, View view) {
        vx2.m53591g(activity, "$activity");
        vx2.m53591g(str, "$transactionId");
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: g */
    public static final void m73590g(Activity activity, String str, View view) {
        vx2.m53591g(activity, "$activity");
        vx2.m53591g(str, "$transactionId");
        ol0.m70359g(activity, str);
    }

    /* renamed from: h */
    public static final void m73591h(Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        dialog.dismiss();
    }

    /* renamed from: d */
    public final Dialog mo66693d(Context context) {
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
}
