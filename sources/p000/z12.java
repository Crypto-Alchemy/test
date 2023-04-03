package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0147a;
import androidx.biometric.C0288b;
import androidx.biometric.C0314e;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0729l;

/* renamed from: z12 */
/* compiled from: FingerprintDialogFragment */
public class z12 extends kf1 {

    /* renamed from: P */
    public final Handler f20429P = new Handler(Looper.getMainLooper());

    /* renamed from: Q */
    public final Runnable f20430Q = new C3706a();

    /* renamed from: U */
    public C0314e f20431U;

    /* renamed from: X */
    public int f20432X;

    /* renamed from: Y */
    public int f20433Y;

    /* renamed from: Z */
    public ImageView f20434Z;

    /* renamed from: e0 */
    public TextView f20435e0;

    /* renamed from: z12$a */
    /* compiled from: FingerprintDialogFragment */
    public class C3706a implements Runnable {
        public C3706a() {
        }

        public void run() {
            z12.this.mo28294C();
        }
    }

    /* renamed from: z12$b */
    /* compiled from: FingerprintDialogFragment */
    public class C3707b implements DialogInterface.OnClickListener {
        public C3707b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            z12.this.f20431U.mo2743X(true);
        }
    }

    /* renamed from: z12$c */
    /* compiled from: FingerprintDialogFragment */
    public class C3708c implements pf4<Integer> {
        public C3708c() {
        }

        /* renamed from: a */
        public void onChanged(Integer num) {
            z12 z12 = z12.this;
            z12.f20429P.removeCallbacks(z12.f20430Q);
            z12.this.mo28296E(num.intValue());
            z12.this.mo28297F(num.intValue());
            z12 z122 = z12.this;
            z122.f20429P.postDelayed(z122.f20430Q, 2000);
        }
    }

    /* renamed from: z12$d */
    /* compiled from: FingerprintDialogFragment */
    public class C3709d implements pf4<CharSequence> {
        public C3709d() {
        }

        /* renamed from: a */
        public void onChanged(CharSequence charSequence) {
            z12 z12 = z12.this;
            z12.f20429P.removeCallbacks(z12.f20430Q);
            z12.this.mo28298G(charSequence);
            z12 z122 = z12.this;
            z122.f20429P.postDelayed(z122.f20430Q, 2000);
        }
    }

    /* renamed from: z12$e */
    /* compiled from: FingerprintDialogFragment */
    public static class C3710e {
        /* renamed from: a */
        public static void m30925a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* renamed from: z12$f */
    /* compiled from: FingerprintDialogFragment */
    public static class C3711f {
        /* renamed from: a */
        public static int m30926a() {
            return d15.colorError;
        }
    }

    /* renamed from: B */
    public static z12 m30913B() {
        return new z12();
    }

    /* renamed from: A */
    public final int mo28293A(int i) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* renamed from: C */
    public void mo28294C() {
        Context context = getContext();
        if (context != null) {
            this.f20431U.mo2741V(1);
            this.f20431U.mo2739T(context.getString(r45.fingerprint_dialog_touch_sensor));
        }
    }

    /* renamed from: D */
    public final boolean mo28295D(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = r3.f20431U.mo2759n();
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28296E(int r4) {
        /*
            r3 = this;
            android.widget.ImageView r0 = r3.f20434Z
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.biometric.e r0 = r3.f20431U
            int r0 = r0.mo2759n()
            android.graphics.drawable.Drawable r1 = r3.mo28300z(r0, r4)
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            android.widget.ImageView r2 = r3.f20434Z
            r2.setImageDrawable(r1)
            boolean r0 = r3.mo28295D(r0, r4)
            if (r0 == 0) goto L_0x0020
            p000.z12.C3710e.m30925a(r1)
        L_0x0020:
            androidx.biometric.e r0 = r3.f20431U
            r0.mo2740U(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z12.mo28296E(int):void");
    }

    /* renamed from: F */
    public void mo28297F(int i) {
        boolean z;
        int i2;
        TextView textView = this.f20435e0;
        if (textView != null) {
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = this.f20432X;
            } else {
                i2 = this.f20433Y;
            }
            textView.setTextColor(i2);
        }
    }

    /* renamed from: G */
    public void mo28298G(CharSequence charSequence) {
        TextView textView = this.f20435e0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f20431U.mo2737R(true);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        mo28299y();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20432X = mo28293A(C3711f.m30926a());
        } else {
            Context context = getContext();
            if (context != null) {
                i = zr0.m31440c(context, r15.biometric_error_color);
            } else {
                i = 0;
            }
            this.f20432X = i;
        }
        this.f20433Y = mo28293A(16842808);
    }

    public void onPause() {
        super.onPause();
        this.f20429P.removeCallbacksAndMessages((Object) null);
    }

    public void onResume() {
        super.onResume();
        this.f20431U.mo2740U(0);
        this.f20431U.mo2741V(1);
        this.f20431U.mo2739T(getString(r45.fingerprint_dialog_touch_sensor));
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        CharSequence charSequence;
        C0147a.C0148a aVar = new C0147a.C0148a(requireContext());
        aVar.setTitle(this.f20431U.mo2765t());
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(a45.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(n35.fingerprint_subtitle);
        if (textView != null) {
            CharSequence s = this.f20431U.mo2764s();
            if (TextUtils.isEmpty(s)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(s);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(n35.fingerprint_description);
        if (textView2 != null) {
            CharSequence l = this.f20431U.mo2757l();
            if (TextUtils.isEmpty(l)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(l);
            }
        }
        this.f20434Z = (ImageView) inflate.findViewById(n35.fingerprint_icon);
        this.f20435e0 = (TextView) inflate.findViewById(n35.fingerprint_error);
        if (C0288b.m1628c(this.f20431U.mo2747b())) {
            charSequence = getString(r45.confirm_device_credential_password);
        } else {
            charSequence = this.f20431U.mo2763r();
        }
        aVar.mo1203g(charSequence, new C3707b());
        aVar.setView(inflate);
        C0147a create = aVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    /* renamed from: y */
    public final void mo28299y() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0314e eVar = (C0314e) new C0729l(activity).mo6421a(C0314e.class);
            this.f20431U = eVar;
            eVar.mo2760o().observe(this, new C3708c());
            this.f20431U.mo2758m().observe(this, new C3709d());
        }
    }

    /* renamed from: z */
    public final Drawable mo28300z(int i, int i2) {
        int i3;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (i == 0 && i2 == 1) {
            i3 = p25.fingerprint_dialog_fp_icon;
        } else if (i == 1 && i2 == 2) {
            i3 = p25.fingerprint_dialog_error;
        } else if (i == 2 && i2 == 1) {
            i3 = p25.fingerprint_dialog_fp_icon;
        } else if (i != 1 || i2 != 3) {
            return null;
        } else {
            i3 = p25.fingerprint_dialog_fp_icon;
        }
        return zr0.m31442e(context, i3);
    }
}
