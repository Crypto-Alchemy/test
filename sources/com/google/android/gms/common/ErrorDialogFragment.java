package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    public Dialog f22154a;

    /* renamed from: d */
    public DialogInterface.OnCancelListener f22155d;

    /* renamed from: e */
    public Dialog f22156e;

    /* renamed from: a */
    public static ErrorDialogFragment m33576a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) cu4.m43222l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.f22154a = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f22155d = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f22155d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f22154a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f22156e == null) {
            this.f22156e = new AlertDialog.Builder((Context) cu4.m43221k(getActivity())).create();
        }
        return this.f22156e;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
