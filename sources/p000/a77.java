package p000;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.biometric.C0309d;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;

/* renamed from: a77 */
/* compiled from: UtilityMethods */
public class a77 {

    /* renamed from: a */
    public static ProgressDialog f36401a;

    /* renamed from: a */
    public static boolean m55423a(String str, Context context) {
        return context.getSharedPreferences("Safemoon", 0).getBoolean(str, false);
    }

    /* renamed from: b */
    public static void m55424b(Activity activity, Boolean bool) {
        ((MyApplicationClass) activity.getApplication()).f41186d = bool.booleanValue();
    }

    /* renamed from: c */
    public static void m55425c() {
        ProgressDialog progressDialog = f36401a;
        if (progressDialog != null && progressDialog.isShowing()) {
            f36401a.dismiss();
        }
    }

    /* renamed from: d */
    public static boolean m55426d(Context context) {
        int a = C0309d.m1682g(context).mo2708a(33023);
        if (a == 12 || a == 11) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static void m55427e(Activity activity) {
        if (activity != null) {
            View findViewById = activity.findViewById(R.id.container);
            if (findViewById != null) {
                findViewById.requestFocus();
            }
            activity.getWindow().setSoftInputMode(3);
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: f */
    public static void m55428f(Context context) {
        if (context instanceof Activity) {
            m55427e((Activity) context);
        }
    }

    /* renamed from: g */
    public static void m55429g(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
    }
}
