package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.C0147a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@J@\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007J&\u0010\u0010\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0007J(\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0007J&\u0010\u0017\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0007J4\u0010\u001b\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0007J&\u0010\u001c\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0007JS\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019H\u0007¢\u0006\u0004\b!\u0010\"JS\u0010#\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019H\u0007¢\u0006\u0004\b#\u0010\"JS\u0010%\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00142\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019H\u0007¢\u0006\u0004\b%\u0010&Jk\u0010*\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00192\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019H\u0007¢\u0006\u0004\b*\u0010+J«\u0001\u00100\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.H\u0007¢\u0006\u0004\b0\u00101Jh\u00102\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.H\u0007Js\u00103\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.H\u0007¢\u0006\u0004\b3\u00104J\u0001\u00105\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.H\u0007¢\u0006\u0004\b5\u00106J\u0001\u00107\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.H\u0007¢\u0006\u0004\b7\u00106J\u0001\u0010:\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f\u0018\u00010.H\u0007¢\u0006\u0004\b:\u0010;J\u0010\u0010>\u001a\u00020 2\u0006\u0010=\u001a\u00020<H\u0002¨\u0006A"}, mo44877d2 = {"Lnp;", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activityReference", "", "title", "content", "buttonText", "preferenceKey", "Landroid/view/View$OnClickListener;", "onClickAction", "Lr37;", "D0", "onConfirmAction", "onCancelAction", "G", "activity", "address", "r0", "", "contentResId", "negativeBtnTextResId", "y0", "positiveBtnTextResId", "Lkotlin/Function0;", "onConfirmedClickListener", "v0", "j0", "titleResId", "confirmBtnTextResId", "onActionClickListener", "Landroid/app/Dialog;", "Z", "(Ljava/lang/ref/WeakReference;Ljava/lang/Integer;Ljava/lang/Integer;ILpc2;)Landroid/app/Dialog;", "W", "contentText", "l0", "(Ljava/lang/ref/WeakReference;Ljava/lang/Integer;Ljava/lang/String;ILpc2;)Landroid/app/Dialog;", "cancelBtnTextResId", "onConfirmClickListener", "onCancelClickListener", "O", "(Ljava/lang/ref/WeakReference;Ljava/lang/Integer;IIILpc2;Lpc2;)Landroid/app/Dialog;", "confirmBtnTextColor", "cancelBtnTextColor", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "R", "(Ljava/lang/ref/WeakReference;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lrc2;Lrc2;)Landroid/app/Dialog;", "A0", "K", "(Ljava/lang/ref/WeakReference;Ljava/lang/Integer;IIILrc2;Lrc2;)Landroid/app/Dialog;", "n0", "(Ljava/lang/ref/WeakReference;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IILrc2;Lrc2;)Landroid/app/Dialog;", "c0", "answer1", "answer2", "g0", "(Ljava/lang/ref/WeakReference;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILrc2;Lrc2;)Landroid/app/Dialog;", "Landroid/content/Context;", "context", "F", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: np */
/* compiled from: ApplicationDialog.kt */
public final class C9001np {

    /* renamed from: a */
    public static final C9001np f43524a = new C9001np();

    /* renamed from: A0 */
    public static final Dialog m69911A0(WeakReference<Activity> weakReference, int i, int i2, int i3, int i4, rc2<? super DialogInterface, r37> rc2, rc2<? super DialogInterface, r37> rc22) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        ag1 a = ag1.m31837a(activity.getLayoutInflater().inflate(R.layout.dialog_unlink_confirmation, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        a.f20943e.setText(i);
        a.f20942d.setText(i2);
        a.f20941c.setText(i3);
        a.f20940b.setText(i4);
        a.f20941c.setOnClickListener(new C7351ko(rc2, F));
        a.f20940b.setOnClickListener(new C7845lo(rc22, F));
        F.setContentView(a.mo28966b());
        F.show();
        return F;
    }

    /* renamed from: B0 */
    public static final void m69913B0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: C0 */
    public static final void m69915C0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: D0 */
    public static final void m69917D0(WeakReference<Activity> weakReference, String str, String str2, String str3, String str4, View.OnClickListener onClickListener) {
        vx2.m53591g(weakReference, "activityReference");
        vx2.m53591g(str, "title");
        vx2.m53591g(str2, PublicResolver.FUNC_CONTENT);
        vx2.m53591g(str3, "buttonText");
        vx2.m53591g(str4, "preferenceKey");
        vx2.m53591g(onClickListener, "onClickAction");
        Activity activity = weakReference.get();
        vx2.m53588d(activity);
        Activity activity2 = activity;
        Dialog F = f43524a.mo62776F(activity2);
        se1 a = se1.m51726a(activity2.getLayoutInflater().inflate(R.layout.dialog_alert_one_button, (ViewGroup) null));
        vx2.m53590f(a, "bind(activity.layoutInfl…_alert_one_button, null))");
        a.f33836f.setText(str);
        a.f33835e.setText(str2);
        a.f33832b.setText(str3);
        a.f33832b.setOnClickListener(new C6870bp(onClickListener, F));
        a.f33833c.setOnCheckedChangeListener(new C6949cp(activity2, str4));
        a.f33834d.setOnClickListener(new C6993dp(F));
        F.setContentView(a.mo47745b());
        F.show();
    }

    /* renamed from: E0 */
    public static final void m69919E0(View.OnClickListener onClickListener, Dialog dialog, View view) {
        vx2.m53591g(onClickListener, "$onClickAction");
        vx2.m53591g(dialog, "$dialog");
        onClickListener.onClick((View) null);
        dialog.dismiss();
    }

    /* renamed from: F0 */
    public static final void m69920F0(Activity activity, String str, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(activity, "$activity");
        vx2.m53591g(str, "$preferenceKey");
        f06.m57523n(activity, str, Boolean.valueOf(z));
    }

    /* renamed from: G */
    public static final void m69921G(WeakReference<Activity> weakReference, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        vx2.m53591g(weakReference, "activityReference");
        vx2.m53591g(onClickListener, "onConfirmAction");
        vx2.m53591g(onClickListener2, "onCancelAction");
        Activity activity = weakReference.get();
        vx2.m53588d(activity);
        Activity activity2 = activity;
        Dialog F = f43524a.mo62776F(activity2);
        pe1 a = pe1.m49884a(activity2.getLayoutInflater().inflate(R.layout.dialog_acknowledgment_warning, (ViewGroup) null));
        vx2.m53590f(a, "bind(activity.layoutInfl…wledgment_warning, null))");
        a.f32665b.setOnClickListener(new C9274ro(onClickListener, F));
        a.f32666c.setOnClickListener(new C9311so(onClickListener2, F));
        F.setContentView(a.mo46710b());
        F.setOnCancelListener(new C9413uo(onClickListener2));
        F.show();
    }

    /* renamed from: G0 */
    public static final void m69922G0(Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        dialog.dismiss();
    }

    /* renamed from: H */
    public static final void m69923H(View.OnClickListener onClickListener, Dialog dialog, View view) {
        vx2.m53591g(onClickListener, "$onConfirmAction");
        vx2.m53591g(dialog, "$dialog");
        onClickListener.onClick((View) null);
        dialog.dismiss();
    }

    /* renamed from: I */
    public static final void m69924I(View.OnClickListener onClickListener, Dialog dialog, View view) {
        vx2.m53591g(onClickListener, "$onCancelAction");
        vx2.m53591g(dialog, "$dialog");
        onClickListener.onClick((View) null);
        dialog.dismiss();
    }

    /* renamed from: J */
    public static final void m69925J(View.OnClickListener onClickListener, DialogInterface dialogInterface) {
        vx2.m53591g(onClickListener, "$onCancelAction");
        onClickListener.onClick((View) null);
    }

    /* renamed from: K */
    public static final Dialog m69926K(WeakReference<Activity> weakReference, Integer num, int i, int i2, int i3, rc2<? super DialogInterface, r37> rc2, rc2<? super DialogInterface, r37> rc22) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        of1 a = of1.m49290a(activity.getLayoutInflater().inflate(R.layout.dialog_refresh_wallets_confirmation, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f32370e.setText(num.intValue());
            a.f32370e.setVisibility(0);
        }
        a.f32369d.setText(i);
        a.f32368c.setText(i2);
        a.f32367b.setText(i3);
        a.f32368c.setOnClickListener(new C7907mp(rc2, F));
        a.f32367b.setOnClickListener(new C7300jo(rc22, F));
        F.setContentView(a.mo46392b());
        F.show();
        return F;
    }

    /* renamed from: L */
    public static /* synthetic */ Dialog m69927L(WeakReference weakReference, Integer num, int i, int i2, int i3, rc2 rc2, rc2 rc22, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i4 & 8) != 0) {
            i2 = R.string.action_ok;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = R.string.cancel;
        }
        return m69926K(weakReference, num2, i, i5, i3, rc2, rc22);
    }

    /* renamed from: M */
    public static final void m69928M(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: N */
    public static final void m69929N(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: O */
    public static final Dialog m69930O(WeakReference<Activity> weakReference, Integer num, int i, int i2, int i3, pc2<r37> pc2, pc2<r37> pc22) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        gf1 a = gf1.m44713a(activity.getLayoutInflater().inflate(R.layout.dialog_dark_login_confirm, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f29233e.setVisibility(0);
            a.f29233e.setText(num.intValue());
        }
        a.f29232d.setText(i);
        a.f29231c.setText(i2);
        a.f29231c.setOnClickListener(new C7905mo(pc2, F));
        a.f29230b.setText(i3);
        a.f29230b.setOnClickListener(new C8997no(pc22, F));
        F.setContentView(a.mo42887b());
        F.show();
        return F;
    }

    /* renamed from: P */
    public static final void m69931P(pc2 pc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (pc2 != null) {
            pc2.invoke();
        }
        dialog.cancel();
    }

    /* renamed from: Q */
    public static final void m69932Q(pc2 pc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (pc2 != null) {
            pc2.invoke();
        }
        dialog.cancel();
    }

    /* renamed from: R */
    public static final Dialog m69933R(WeakReference<Activity> weakReference, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, Integer num5, Integer num6, rc2<? super DialogInterface, r37> rc2, rc2<? super DialogInterface, r37> rc22) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        ef1 a = ef1.m43962a(activity.getLayoutInflater().inflate(R.layout.dialog_confirmation, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            MaterialTextView materialTextView = a.f28619f;
            vx2.m53590f(materialTextView, "tvDialogTitle");
            materialTextView.setVisibility(0);
            a.f28619f.setText(num.intValue());
        } else if (str != null) {
            MaterialTextView materialTextView2 = a.f28619f;
            vx2.m53590f(materialTextView2, "tvDialogTitle");
            materialTextView2.setVisibility(0);
            a.f28619f.setText(str);
        } else {
            MaterialTextView materialTextView3 = a.f28619f;
            vx2.m53590f(materialTextView3, "tvDialogTitle");
            materialTextView3.setVisibility(8);
        }
        if (num2 != null) {
            a.f28618e.setText(num2.intValue());
        }
        if (str2 != null) {
            a.f28618e.setText(str2);
        }
        if (num3 != null) {
            a.f28616c.setText(num3.intValue());
            MaterialButton materialButton = a.f28616c;
            vx2.m53590f(materialButton, "btnPositive");
            materialButton.setVisibility(0);
            if (num5 != null) {
                a.f28616c.setTextColor(num5.intValue());
            }
            a.f28616c.setOnClickListener(new C9364to(rc2, F));
        } else {
            MaterialButton materialButton2 = a.f28616c;
            vx2.m53590f(materialButton2, "btnPositive");
            materialButton2.setVisibility(8);
        }
        if (num4 != null) {
            a.f28615b.setText(num4.intValue());
            MaterialButton materialButton3 = a.f28615b;
            vx2.m53590f(materialButton3, "btnNegative");
            materialButton3.setVisibility(0);
            if (num6 != null) {
                a.f28615b.setTextColor(num6.intValue());
            }
            a.f28615b.setOnClickListener(new C7055ep(rc22, F));
        } else {
            MaterialButton materialButton4 = a.f28615b;
            vx2.m53590f(materialButton4, "btnNegative");
            materialButton4.setVisibility(8);
        }
        a.f28617d.setOnClickListener(new C7140gp(rc22, F));
        F.setContentView(a.mo42311b());
        F.show();
        return F;
    }

    /* renamed from: S */
    public static /* synthetic */ Dialog m69934S(WeakReference weakReference, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, Integer num5, Integer num6, rc2 rc2, rc2 rc22, int i, Object obj) {
        Integer num7;
        String str3;
        Integer num8;
        String str4;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        int i2 = i;
        if ((i2 & 2) != 0) {
            num7 = null;
        } else {
            num7 = num;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i2 & 8) != 0) {
            num8 = null;
        } else {
            num8 = num2;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i2 & 32) != 0) {
            num9 = Integer.valueOf(R.string.action_ok);
        } else {
            num9 = num3;
        }
        if ((i2 & 64) != 0) {
            num10 = Integer.valueOf(R.string.cancel);
        } else {
            num10 = num4;
        }
        if ((i2 & 128) != 0) {
            num11 = null;
        } else {
            num11 = num5;
        }
        if ((i2 & 256) != 0) {
            num12 = null;
        } else {
            num12 = num6;
        }
        return m69933R(weakReference, num7, str3, num8, str4, num9, num10, num11, num12, rc2, rc22);
    }

    /* renamed from: T */
    public static final void m69935T(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: U */
    public static final void m69936U(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: V */
    public static final void m69937V(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: W */
    public static final Dialog m69938W(WeakReference<Activity> weakReference, Integer num, Integer num2, int i, pc2<r37> pc2) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        hf1 a = hf1.m45190a(activity.getLayoutInflater().inflate(R.layout.dialog_dark_register_success, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f29564d.setVisibility(0);
            a.f29564d.setText(num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            a.f29563c.setVisibility(0);
            a.f29563c.setText(num2.intValue());
        }
        a.f29562b.setText(i);
        a.f29562b.setOnClickListener(new C7847lp(pc2, F));
        F.setContentView(a.mo43179b());
        F.show();
        return F;
    }

    /* renamed from: X */
    public static /* synthetic */ Dialog m69939X(WeakReference weakReference, Integer num, Integer num2, int i, pc2 pc2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        if ((i2 & 8) != 0) {
            i = R.string.action_ok;
        }
        if ((i2 & 16) != 0) {
            pc2 = null;
        }
        return m69938W(weakReference, num, num2, i, pc2);
    }

    /* renamed from: Y */
    public static final void m69940Y(pc2 pc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (pc2 != null) {
            pc2.invoke();
        }
        dialog.cancel();
    }

    /* renamed from: Z */
    public static final Dialog m69941Z(WeakReference<Activity> weakReference, Integer num, Integer num2, int i, pc2<r37> pc2) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        re1 a = re1.m51076a(activity.getLayoutInflater().inflate(R.layout.dialog_alert_no_title, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f33418d.setVisibility(0);
            a.f33418d.setText(num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            a.f33417c.setVisibility(0);
            a.f33417c.setText(num2.intValue());
        }
        a.f33416b.setText(i);
        a.f33416b.setOnClickListener(new C7301jp(pc2, F));
        F.setContentView(a.mo47391b());
        F.show();
        return F;
    }

    /* renamed from: a0 */
    public static /* synthetic */ Dialog m69943a0(WeakReference weakReference, Integer num, Integer num2, int i, pc2 pc2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        if ((i2 & 8) != 0) {
            i = R.string.action_ok;
        }
        if ((i2 & 16) != 0) {
            pc2 = null;
        }
        return m69941Z(weakReference, num, num2, i, pc2);
    }

    /* renamed from: b0 */
    public static final void m69945b0(pc2 pc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (pc2 != null) {
            pc2.invoke();
        }
        dialog.cancel();
    }

    /* renamed from: c0 */
    public static final Dialog m69947c0(WeakReference<Activity> weakReference, Integer num, Integer num2, String str, int i, int i2, rc2<? super DialogInterface, r37> rc2, rc2<? super DialogInterface, r37> rc22) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        if1 a = if1.m45707a(activity.getLayoutInflater().inflate(R.layout.dialog_dark_reset_password_confirmation, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f29921e.setVisibility(0);
            a.f29921e.setText(num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            a.f29920d.setText(num2.intValue());
        }
        if (str != null) {
            a.f29920d.setText(zm2.m31398a(str, 0));
        }
        a.f29919c.setText(i);
        a.f29918b.setText(i2);
        a.f29919c.setOnClickListener(new C9604xo(rc2, F));
        a.f29918b.setOnClickListener(new C9643yo(rc22, F));
        F.setContentView(a.mo43586b());
        F.show();
        return F;
    }

    /* renamed from: d0 */
    public static /* synthetic */ Dialog m69949d0(WeakReference weakReference, Integer num, Integer num2, String str, int i, int i2, rc2 rc2, rc2 rc22, int i3, Object obj) {
        Integer num3;
        Integer num4;
        String str2;
        if ((i3 & 2) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i3 & 4) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i3 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        return m69947c0(weakReference, num3, num4, str2, (i3 & 16) != 0 ? R.string.action_ok : i, (i3 & 32) != 0 ? R.string.cancel : i2, rc2, rc22);
    }

    /* renamed from: e0 */
    public static final void m69951e0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: f0 */
    public static final void m69953f0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: g0 */
    public static final Dialog m69955g0(WeakReference<Activity> weakReference, Integer num, String str, String str2, int i, int i2, rc2<? super DialogInterface, r37> rc2, rc2<? super DialogInterface, r37> rc22) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        jf1 a = jf1.m46494a(activity.getLayoutInflater().inflate(R.layout.dialog_dark_security_questions_confirmation, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f30488f.setVisibility(0);
            a.f30488f.setText(num.intValue());
        }
        if (str != null) {
            a.f30486d.setText(str);
        }
        if (str2 != null) {
            a.f30487e.setText(str2);
        }
        a.f30485c.setText(i);
        a.f30484b.setText(i2);
        a.f30485c.setOnClickListener(new C7188hp(rc2, F));
        a.f30484b.setOnClickListener(new C7223ip(rc22, F));
        F.setContentView(a.mo44459b());
        F.show();
        return F;
    }

    /* renamed from: h0 */
    public static final void m69957h0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: i0 */
    public static final void m69959i0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: j0 */
    public static final void m69961j0(WeakReference<Activity> weakReference, int i, int i2) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity != null) {
            C0147a.C0148a aVar = new C0147a.C0148a(activity);
            aVar.mo1202f(activity.getResources().getText(i)).mo1206i(activity.getResources().getText(i2), new C7804kp());
            aVar.create();
            aVar.mo1209l();
        }
    }

    /* renamed from: k0 */
    public static final void m69963k0(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    /* renamed from: l0 */
    public static final Dialog m69965l0(WeakReference<Activity> weakReference, Integer num, String str, int i, pc2<r37> pc2) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        hf1 a = hf1.m45190a(activity.getLayoutInflater().inflate(R.layout.dialog_dark_register_success, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f29564d.setVisibility(0);
            a.f29564d.setText(num.intValue());
        }
        if (str != null) {
            a.f29563c.setVisibility(0);
            a.f29563c.setText(str);
        }
        a.f29562b.setText(i);
        a.f29562b.setOnClickListener(new C7091fp(pc2, F));
        F.setContentView(a.mo43179b());
        F.show();
        return F;
    }

    /* renamed from: m0 */
    public static final void m69967m0(pc2 pc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (pc2 != null) {
            pc2.invoke();
        }
        dialog.cancel();
    }

    /* renamed from: n0 */
    public static final Dialog m69969n0(WeakReference<Activity> weakReference, Integer num, Integer num2, String str, int i, int i2, rc2<? super DialogInterface, r37> rc2, rc2<? super DialogInterface, r37> rc22) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        Dialog F = f43524a.mo62776F(activity);
        pf1 a = pf1.m49910a(activity.getLayoutInflater().inflate(R.layout.dialog_reset_password_confirmation, (ViewGroup) null));
        vx2.m53590f(a, "bind(\n                it…          )\n            )");
        if (num != null) {
            num.intValue();
            a.f32696e.setVisibility(0);
            a.f32696e.setText(num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            a.f32695d.setText(num2.intValue());
        }
        if (str != null) {
            a.f32695d.setText(zm2.m31398a(str, 0));
        }
        a.f32694c.setText(i);
        a.f32693b.setText(i2);
        a.f32694c.setOnClickListener(new C9706zo(rc2, F));
        a.f32693b.setOnClickListener(new C6835ap(rc22, F));
        F.setContentView(a.mo46723b());
        F.show();
        return F;
    }

    /* renamed from: o0 */
    public static /* synthetic */ Dialog m69971o0(WeakReference weakReference, Integer num, Integer num2, String str, int i, int i2, rc2 rc2, rc2 rc22, int i3, Object obj) {
        Integer num3;
        Integer num4;
        String str2;
        if ((i3 & 2) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i3 & 4) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i3 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        return m69969n0(weakReference, num3, num4, str2, (i3 & 16) != 0 ? R.string.action_ok : i, (i3 & 32) != 0 ? R.string.cancel : i2, rc2, rc22);
    }

    /* renamed from: p0 */
    public static final void m69973p0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: q0 */
    public static final void m69975q0(rc2 rc2, Dialog dialog, View view) {
        vx2.m53591g(dialog, "$dialog");
        if (rc2 != null) {
            rc2.invoke(dialog);
        }
        dialog.cancel();
    }

    /* renamed from: r0 */
    public static final void m69977r0(Activity activity, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        vx2.m53591g(activity, "activity");
        vx2.m53591g(str, Address.TYPE_NAME);
        vx2.m53591g(onClickListener, "onClickAction");
        vx2.m53591g(onClickListener2, "onCancelAction");
        Dialog F = f43524a.mo62776F(activity);
        qf1 a = qf1.m50570a(activity.getLayoutInflater().inflate(R.layout.dialog_send_token_confirmation, (ViewGroup) null));
        vx2.m53590f(a, "bind(activity.layoutInfl…oken_confirmation, null))");
        a.f33087b.setText(activity.getString(R.string.confirm));
        a.f33090e.setText(activity.getString(R.string.confirm));
        TextView textView = a.f33089d;
        cb6 cb6 = cb6.f21669a;
        String string = activity.getString(R.string.send_confirmation_popup_content);
        vx2.m53590f(string, "activity.getString(R.str…nfirmation_popup_content)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        vx2.m53590f(format, "format(format, *args)");
        textView.setText(format);
        a.f33087b.setOnClickListener(new C9036oo(onClickListener, F));
        a.f33088c.setOnClickListener(new C9181po(onClickListener2, F));
        F.setContentView(a.mo47098b());
        F.setOnCancelListener(new C9218qo(onClickListener2));
        F.show();
    }

    /* renamed from: s0 */
    public static final void m69979s0(View.OnClickListener onClickListener, Dialog dialog, View view) {
        vx2.m53591g(onClickListener, "$onClickAction");
        vx2.m53591g(dialog, "$dialog");
        onClickListener.onClick((View) null);
        dialog.dismiss();
    }

    /* renamed from: t0 */
    public static final void m69981t0(View.OnClickListener onClickListener, Dialog dialog, View view) {
        vx2.m53591g(onClickListener, "$onCancelAction");
        vx2.m53591g(dialog, "$dialog");
        onClickListener.onClick((View) null);
        dialog.dismiss();
    }

    /* renamed from: u0 */
    public static final void m69983u0(View.OnClickListener onClickListener, DialogInterface dialogInterface) {
        vx2.m53591g(onClickListener, "$onCancelAction");
        onClickListener.onClick((View) null);
    }

    /* renamed from: v0 */
    public static final void m69985v0(WeakReference<Activity> weakReference, int i, int i2, pc2<r37> pc2) {
        vx2.m53591g(weakReference, "activityReference");
        vx2.m53591g(pc2, "onConfirmedClickListener");
        Activity activity = weakReference.get();
        if (activity != null) {
            C0147a.C0148a aVar = new C0147a.C0148a(activity);
            aVar.mo1202f(activity.getResources().getText(i)).mo1206i(activity.getResources().getText(i2), new C9462vo(pc2)).mo1203g(activity.getResources().getText(R.string.cancel), new C9556wo());
            aVar.create();
            aVar.mo1209l();
        }
    }

    /* renamed from: w0 */
    public static final void m69987w0(pc2 pc2, DialogInterface dialogInterface, int i) {
        vx2.m53591g(pc2, "$onConfirmedClickListener");
        dialogInterface.cancel();
        pc2.invoke();
    }

    /* renamed from: x0 */
    public static final void m69989x0(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    /* renamed from: y0 */
    public static final void m69991y0(WeakReference<Activity> weakReference, int i, int i2) {
        vx2.m53591g(weakReference, "activityReference");
        Activity activity = weakReference.get();
        if (activity != null) {
            C0147a.C0148a aVar = new C0147a.C0148a(activity);
            aVar.setTitle(activity.getResources().getText(R.string.error_text)).mo1202f(activity.getResources().getText(i)).mo1206i(activity.getResources().getText(i2), new C7222io());
            aVar.create();
            aVar.mo1209l();
        }
    }

    /* renamed from: z0 */
    public static final void m69993z0(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    /* renamed from: F */
    public final Dialog mo62776F(Context context) {
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
