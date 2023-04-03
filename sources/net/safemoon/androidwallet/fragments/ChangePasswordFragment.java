package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ChangePasswordFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "y", "A", "", "isEnabled", "x", "", "k", "I", "DEFAULT_PASS_SIZE", "", "r", "F", "ENABLED_ALPHA", "s", "NONE_ENABLED_ALPHA", "Lg92;", "Lg92;", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ChangePasswordFragment.kt */
public final class ChangePasswordFragment extends BaseMainFragment {

    /* renamed from: k */
    public final int f41937k = 7;

    /* renamed from: r */
    public final float f41938r = 1.0f;

    /* renamed from: s */
    public final float f41939s = 0.5f;

    /* renamed from: x */
    public g92 f41940x;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ChangePasswordFragment$a", "Lyg4;", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ChangePasswordFragment$a */
    /* compiled from: ChangePasswordFragment.kt */
    public static final class C8385a extends yg4 {

        /* renamed from: c */
        public final /* synthetic */ ChangePasswordFragment f41941c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8385a(ChangePasswordFragment changePasswordFragment) {
            super(true);
            this.f41941c = changePasswordFragment;
        }

        /* renamed from: b */
        public void mo6034b() {
            this.f41941c.mo50752i();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ChangePasswordFragment$b", "Lbp1;", "Landroid/text/Editable;", "p0", "Lr37;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ChangePasswordFragment$b */
    /* compiled from: ChangePasswordFragment.kt */
    public static final class C8386b extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ ChangePasswordFragment f41942a;

        /* renamed from: d */
        public final /* synthetic */ bf3 f41943d;

        public C8386b(ChangePasswordFragment changePasswordFragment, bf3 bf3) {
            this.f41942a = changePasswordFragment;
            this.f41943d = bf3;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            boolean z2;
            super.afterTextChanged(editable);
            g92 t = this.f41942a.f41940x;
            if (t == null) {
                vx2.m53605u("binding");
                t = null;
            }
            String valueOf = String.valueOf(t.f29122h.getText());
            String valueOf2 = String.valueOf(editable);
            int i = 0;
            if (valueOf2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (valueOf.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    TextView textView = this.f41943d.f21283h;
                    vx2.m53590f(textView, "passwordView.tvPassNotMatch");
                    if (!(true ^ vx2.m53586b(valueOf2, valueOf))) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    this.f41942a.mo57482x(vx2.m53586b(valueOf2, valueOf));
                    if (valueOf2.length() > this.f41942a.f41937k) {
                        this.f41943d.f21280e.setTextColor(zr0.m31440c(this.f41942a.requireContext(), R.color.btn_light_green));
                        this.f41943d.f21277b.setColorFilter(zr0.m31440c(this.f41942a.requireContext(), R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                        this.f41943d.f21280e.setTag("complete");
                    } else {
                        this.f41943d.f21280e.setTextColor(zr0.m31440c(this.f41942a.requireContext(), R.color.color_edit));
                        this.f41943d.f21277b.setColorFilter(zr0.m31440c(this.f41942a.requireContext(), R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                        this.f41943d.f21280e.setTag("incomplete");
                    }
                    if (ko6.m59874g(valueOf2)) {
                        this.f41943d.f21284i.setTextColor(zr0.m31440c(this.f41942a.requireContext(), R.color.btn_light_green));
                        this.f41943d.f21278c.setColorFilter(zr0.m31440c(this.f41942a.requireContext(), R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                        this.f41943d.f21284i.setTag("complete");
                    } else {
                        this.f41943d.f21284i.setTextColor(zr0.m31440c(this.f41942a.requireContext(), R.color.color_edit));
                        this.f41943d.f21278c.setColorFilter(zr0.m31440c(this.f41942a.requireContext(), R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                        this.f41943d.f21284i.setTag("incomplete");
                    }
                    if (ko6.m59872e(valueOf2)) {
                        this.f41943d.f21282g.setTextColor(zr0.m31440c(this.f41942a.requireContext(), R.color.btn_light_green));
                        this.f41943d.f21279d.setColorFilter(zr0.m31440c(this.f41942a.requireContext(), R.color.btn_light_green), PorterDuff.Mode.MULTIPLY);
                        this.f41943d.f21282g.setTag("complete");
                        return;
                    }
                    this.f41943d.f21282g.setTextColor(zr0.m31440c(this.f41942a.requireContext(), R.color.color_edit));
                    this.f41943d.f21279d.setColorFilter(zr0.m31440c(this.f41942a.requireContext(), R.color.color_edit), PorterDuff.Mode.MULTIPLY);
                    this.f41943d.f21282g.setTag("incomplete");
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ChangePasswordFragment$c", "Lbp1;", "Landroid/text/Editable;", "p0", "Lr37;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ChangePasswordFragment$c */
    /* compiled from: ChangePasswordFragment.kt */
    public static final class C8387c extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ ChangePasswordFragment f41944a;

        /* renamed from: d */
        public final /* synthetic */ bf3 f41945d;

        public C8387c(ChangePasswordFragment changePasswordFragment, bf3 bf3) {
            this.f41944a = changePasswordFragment;
            this.f41945d = bf3;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            boolean z2;
            super.afterTextChanged(editable);
            g92 t = this.f41944a.f41940x;
            if (t == null) {
                vx2.m53605u("binding");
                t = null;
            }
            String valueOf = String.valueOf(t.f29120f.getText());
            int i = 0;
            if (String.valueOf(editable).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (valueOf.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    TextView textView = this.f41945d.f21283h;
                    vx2.m53590f(textView, "passwordView.tvPassNotMatch");
                    if (!(true ^ vx2.m53586b(String.valueOf(editable), valueOf))) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    this.f41944a.mo57482x(vx2.m53586b(String.valueOf(editable), valueOf));
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ChangePasswordFragment$d", "Lbp1;", "Landroid/text/Editable;", "p0", "Lr37;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ChangePasswordFragment$d */
    /* compiled from: ChangePasswordFragment.kt */
    public static final class C8388d extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ ChangePasswordFragment f41946a;

        public C8388d(ChangePasswordFragment changePasswordFragment) {
            this.f41946a = changePasswordFragment;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            super.afterTextChanged(editable);
            boolean z2 = true;
            if (String.valueOf(editable).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f41946a.mo57482x(false);
                return;
            }
            g92 t = this.f41946a.f41940x;
            g92 g92 = null;
            if (t == null) {
                vx2.m53605u("binding");
                t = null;
            }
            String valueOf = String.valueOf(t.f29122h.getText());
            g92 t2 = this.f41946a.f41940x;
            if (t2 == null) {
                vx2.m53605u("binding");
            } else {
                g92 = t2;
            }
            String valueOf2 = String.valueOf(g92.f29120f.getText());
            if (!vx2.m53586b(valueOf, valueOf2) || !ko6.m59873f(valueOf2)) {
                z2 = false;
            }
            this.f41946a.mo57482x(z2);
        }
    }

    /* renamed from: B */
    public static final void m66547B(ChangePasswordFragment changePasswordFragment, View view) {
        boolean z;
        vx2.m53591g(changePasswordFragment, "this$0");
        g92 g92 = changePasswordFragment.f41940x;
        g92 g922 = null;
        if (g92 == null) {
            vx2.m53605u("binding");
            g92 = null;
        }
        boolean z2 = !vx2.m53586b(String.valueOf(g92.f29121g.getText()), f06.m57518i(changePasswordFragment.requireContext(), "SAFEMOON_PASSWORD"));
        g92 g923 = changePasswordFragment.f41940x;
        if (g923 == null) {
            vx2.m53605u("binding");
            g923 = null;
        }
        if (String.valueOf(g923.f29121g.getText()).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || z2) {
            FragmentActivity requireActivity = changePasswordFragment.requireActivity();
            vx2.m53590f(requireActivity, "requireActivity()");
            fy0.m57956e(requireActivity, Integer.valueOf(R.string.warning_title), R.string.screen_change_password_current_error, true, (DialogInterface.OnDismissListener) null);
            return;
        }
        g92 g924 = changePasswordFragment.f41940x;
        if (g924 == null) {
            vx2.m53605u("binding");
            g924 = null;
        }
        if (ko6.m59873f(String.valueOf(g924.f29122h.getText()))) {
            Context requireContext = changePasswordFragment.requireContext();
            g92 g925 = changePasswordFragment.f41940x;
            if (g925 == null) {
                vx2.m53605u("binding");
                g925 = null;
            }
            f06.m57524o(requireContext, "SAFEMOON_PASSWORD", String.valueOf(g925.f29122h.getText()));
            g92 g926 = changePasswordFragment.f41940x;
            if (g926 == null) {
                vx2.m53605u("binding");
            } else {
                g922 = g926;
            }
            Snackbar.m35952a0(g922.mo42855b(), R.string.screen_change_password_changed, -1).mo33494Q();
            changePasswordFragment.mo50752i();
        }
    }

    /* renamed from: z */
    public static final void m66554z(ChangePasswordFragment changePasswordFragment, View view) {
        vx2.m53591g(changePasswordFragment, "this$0");
        changePasswordFragment.mo50752i();
    }

    /* renamed from: A */
    public final void mo57481A() {
        g92 g92 = this.f41940x;
        g92 g922 = null;
        if (g92 == null) {
            vx2.m53605u("binding");
            g92 = null;
        }
        bf3 bf3 = g92.f29123i;
        vx2.m53590f(bf3, "binding.lPasswordRequirements");
        bf3.f21281f.setTextColor(zr0.m31440c(requireContext(), R.color.t1));
        mo57482x(false);
        g92 g923 = this.f41940x;
        if (g923 == null) {
            vx2.m53605u("binding");
            g923 = null;
        }
        g923.f29120f.addTextChangedListener(new C8386b(this, bf3));
        g92 g924 = this.f41940x;
        if (g924 == null) {
            vx2.m53605u("binding");
            g924 = null;
        }
        g924.f29122h.addTextChangedListener(new C8387c(this, bf3));
        g92 g925 = this.f41940x;
        if (g925 == null) {
            vx2.m53605u("binding");
            g925 = null;
        }
        g925.f29121g.addTextChangedListener(new C8388d(this));
        g92 g926 = this.f41940x;
        if (g926 == null) {
            vx2.m53605u("binding");
        } else {
            g922 = g926;
        }
        g922.f29116b.setOnClickListener(new dd0(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_change_password, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        g92 a = g92.m44666a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41940x = a;
        mo57483y();
        mo57481A();
        if (bundle == null) {
            requireActivity().getOnBackPressedDispatcher().mo912a(getViewLifecycleOwner(), new C8385a(this));
        }
    }

    /* renamed from: x */
    public final void mo57482x(boolean z) {
        float f;
        g92 g92 = this.f41940x;
        g92 g922 = null;
        if (g92 == null) {
            vx2.m53605u("binding");
            g92 = null;
        }
        g92.f29116b.setEnabled(z);
        g92 g923 = this.f41940x;
        if (g923 == null) {
            vx2.m53605u("binding");
        } else {
            g922 = g923;
        }
        AppCompatButton appCompatButton = g922.f29116b;
        if (z) {
            f = this.f41938r;
        } else {
            f = this.f41939s;
        }
        appCompatButton.setAlpha(f);
    }

    /* renamed from: y */
    public final void mo57483y() {
        g92 g92 = this.f41940x;
        g92 g922 = null;
        if (g92 == null) {
            vx2.m53605u("binding");
            g92 = null;
        }
        g92.f29127m.f21125c.setOnClickListener(new ed0(this));
        g92 g923 = this.f41940x;
        if (g923 == null) {
            vx2.m53605u("binding");
        } else {
            g922 = g923;
        }
        g922.f29127m.f21127e.setText(R.string.screen_change_password_title);
    }
}
