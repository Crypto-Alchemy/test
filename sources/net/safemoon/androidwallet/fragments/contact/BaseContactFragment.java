package net.safemoon.androidwallet.fragments.contact;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LiveData;
import androidx.navigation.NavBackStackEntry;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.List;
import java.util.Map;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.ScannedCodeActivity;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.arguments.TokenTypes;
import net.safemoon.androidwallet.utils.ImageUtility;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import net.sqlcipher.database.SQLiteDatabase;
import p000.C9207qb;
import p000.sn1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0002H&J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0002H&J\b\u0010\u0017\u001a\u00020\u0002H&J&\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016R\"\u0010\u0006\u001a\u00020\"8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010-\u001a\u00020\u00078\u0004XD¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8DX\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048DX\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R'\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e098FX\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<¨\u0006@"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/contact/BaseContactFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lr37;", "Q", "f0", "Ljt2;", "binding", "", "chainId", "F", "b0", "i0", "", "isEtEmpty", "P", "V", "W", "e0", "", "data", "U", "S", "T", "Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lb92;", "k", "Lb92;", "K", "()Lb92;", "a0", "(Lb92;)V", "r", "I", "M", "()I", "default_size", "Landroid/content/ClipboardManager;", "s", "Lef3;", "N", "()Landroid/content/ClipboardManager;", "manager", "Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "x", "L", "()Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "contactViewModel", "", "y", "O", "()Ljava/util/Map;", "setOfViewContactWrapper", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BaseContactFragment.kt */
public abstract class BaseContactFragment extends BaseMainFragment {

    /* renamed from: k */
    public b92 f42374k;

    /* renamed from: r */
    public final int f42375r = SQLiteDatabase.MAX_SQL_CACHE_SIZE;

    /* renamed from: s */
    public final ef3 f42376s = C6169a.m47232a(new BaseContactFragment$manager$2(this));

    /* renamed from: x */
    public final ef3 f42377x;

    /* renamed from: y */
    public final ef3 f42378y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/contact/BaseContactFragment$a", "Lbp1;", "Landroid/text/Editable;", "p0", "Lr37;", "afterTextChanged", "", "", "p1", "p2", "p3", "beforeTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.contact.BaseContactFragment$a */
    /* compiled from: BaseContactFragment.kt */
    public static final class C8560a extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ BaseContactFragment f42379a;

        /* renamed from: d */
        public final /* synthetic */ jt2 f42380d;

        /* renamed from: e */
        public final /* synthetic */ int f42381e;

        public C8560a(BaseContactFragment baseContactFragment, jt2 jt2, int i) {
            this.f42379a = baseContactFragment;
            this.f42380d = jt2;
            this.f42381e = i;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            int i;
            if (this.f42379a.isVisible()) {
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                String obj = StringsKt__StringsKt.m63090V0(str).toString();
                boolean z2 = true;
                if (obj == null || obj.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f42380d.f30602d.setError((CharSequence) null);
                    this.f42379a.mo58059S(str, this.f42381e);
                } else if (ko6.f38933a.mo52966h(str, this.f42381e)) {
                    this.f42379a.mo58059S(str, this.f42381e);
                } else {
                    this.f42380d.f30602d.setError(this.f42379a.getResources().getString(R.string.error_wrong_address));
                }
                this.f42379a.mo58082i0();
                BaseContactFragment baseContactFragment = this.f42379a;
                if (editable != null) {
                    i = editable.length();
                } else {
                    i = 0;
                }
                if (i != 0) {
                    z2 = false;
                }
                baseContactFragment.mo58075P(z2, this.f42380d);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f42379a.isVisible()) {
                this.f42380d.f30602d.setError((CharSequence) null);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/contact/BaseContactFragment$b", "Lbp1;", "Landroid/text/Editable;", "p0", "Lr37;", "afterTextChanged", "", "", "p1", "p2", "p3", "beforeTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.contact.BaseContactFragment$b */
    /* compiled from: BaseContactFragment.kt */
    public static final class C8561b extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ BaseContactFragment f42382a;

        public C8561b(BaseContactFragment baseContactFragment) {
            this.f42382a = baseContactFragment;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            if (this.f42382a.isVisible()) {
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                if (ko6.f38933a.mo52965c(str)) {
                    this.f42382a.mo58061U(str);
                } else {
                    this.f42382a.mo58070K().f21179e.setError(this.f42382a.getResources().getString(R.string.error_wrong_contact_name));
                }
                this.f42382a.mo58082i0();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f42382a.isVisible()) {
                this.f42382a.mo58070K().f21179e.setError((CharSequence) null);
            }
        }
    }

    public BaseContactFragment() {
        BaseContactFragment$contactViewModel$2 baseContactFragment$contactViewModel$2 = new BaseContactFragment$contactViewModel$2(this);
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new BaseContactFragment$special$$inlined$viewModels$default$2(new BaseContactFragment$special$$inlined$viewModels$default$1(this)));
        this.f42377x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ContactViewModel.class), new BaseContactFragment$special$$inlined$viewModels$default$3(b), new BaseContactFragment$special$$inlined$viewModels$default$4((pc2) null, b), baseContactFragment$contactViewModel$2);
        this.f42378y = C6169a.m47232a(new BaseContactFragment$setOfViewContactWrapper$2(this));
    }

    /* renamed from: G */
    public static final void m67934G(jt2 jt2, View view) {
        vx2.m53591g(jt2, "$binding");
        jt2.f30602d.setText("");
    }

    /* renamed from: H */
    public static final void m67935H(BaseContactFragment baseContactFragment, jt2 jt2, View view) {
        vx2.m53591g(baseContactFragment, "this$0");
        vx2.m53591g(jt2, "$binding");
        baseContactFragment.mo58077V(jt2);
    }

    /* renamed from: I */
    public static final void m67936I(BaseContactFragment baseContactFragment, jt2 jt2, View view) {
        vx2.m53591g(baseContactFragment, "this$0");
        vx2.m53591g(jt2, "$binding");
        baseContactFragment.mo58078W(jt2);
    }

    /* renamed from: J */
    public static final void m67937J(BaseContactFragment baseContactFragment, int i, jt2 jt2, View view) {
        ji4 m;
        C3529wa<Intent> b;
        vx2.m53591g(baseContactFragment, "this$0");
        vx2.m53591g(jt2, "$binding");
        ho2 m2 = baseContactFragment.mo58053m();
        if (m2 != null && (m = m2.mo52268m()) != null && (b = m.mo52724b(new BaseContactFragment$bindContactWrapper$4$1(i, jt2, baseContactFragment))) != null) {
            b.mo27473a(new Intent(baseContactFragment.requireActivity(), ScannedCodeActivity.class));
        }
    }

    /* renamed from: R */
    public static final void m67938R(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: X */
    public static final void m67939X(BaseContactFragment baseContactFragment, View view) {
        vx2.m53591g(baseContactFragment, "this$0");
        baseContactFragment.mo50752i();
    }

    /* renamed from: Y */
    public static final void m67940Y(BaseContactFragment baseContactFragment, View view) {
        vx2.m53591g(baseContactFragment, "this$0");
        baseContactFragment.mo58062Z();
    }

    /* renamed from: c0 */
    public static final void m67941c0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m67942d0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m67943g0(BaseContactFragment baseContactFragment, View view) {
        vx2.m53591g(baseContactFragment, "this$0");
        baseContactFragment.mo58060T();
    }

    /* renamed from: h0 */
    public static final void m67944h0(BaseContactFragment baseContactFragment, View view) {
        vx2.m53591g(baseContactFragment, "this$0");
        if (baseContactFragment instanceof AddContactFragment) {
            TokenTypes tokenTypes = new TokenTypes();
            List value = baseContactFragment.mo58071L().mo61103m().getValue();
            if (value == null) {
                value = ck0.m33062j();
            } else {
                vx2.m53590f(value, "contactViewModel.selecte…hains.value?: emptyList()");
            }
            tokenTypes.addAll(value);
            C9207qb.C9208a a = C9207qb.m71208a(tokenTypes);
            vx2.m53590f(a, "actionAddContactFragment…value?: emptyList() ) } )");
            baseContactFragment.mo50753j(a);
        }
        if (baseContactFragment instanceof EditContactFragment) {
            TokenTypes tokenTypes2 = new TokenTypes();
            List value2 = baseContactFragment.mo58071L().mo61103m().getValue();
            if (value2 == null) {
                value2 = ck0.m33062j();
            } else {
                vx2.m53590f(value2, "contactViewModel.selecte…hains.value?: emptyList()");
            }
            tokenTypes2.addAll(value2);
            sn1.C9310a a2 = sn1.m71980a(tokenTypes2);
            vx2.m53590f(a2, "actionEditContactFragmen….value?: emptyList() ) })");
            baseContactFragment.mo50753j(a2);
        }
    }

    /* renamed from: F */
    public final void mo58069F(jt2 jt2, int i) {
        jt2.f30602d.addTextChangedListener(new vo6(new C8560a(this, jt2, i), 0, 2, (DefaultConstructorMarker) null));
        jt2.f30604f.setOnClickListener(new C7149gy(this, jt2));
        jt2.f30600b.setOnClickListener(new C7195hy(this, jt2));
        jt2.f30601c.setOnClickListener(new C7228iy(this, i, jt2));
        jt2.f30603e.setOnClickListener(new C7319jy(jt2));
        AppCompatImageView appCompatImageView = jt2.f30604f;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        appCompatImageView.setImageDrawable(new ImageUtility(requireContext).mo60922c(uf5.m28223f(getResources(), R.drawable.ic_baseline_file_copy_24, (Resources.Theme) null), R.color.dark_grey));
    }

    /* renamed from: K */
    public final b92 mo58070K() {
        b92 b92 = this.f42374k;
        if (b92 != null) {
            return b92;
        }
        vx2.m53605u("binding");
        return null;
    }

    /* renamed from: L */
    public final ContactViewModel mo58071L() {
        return (ContactViewModel) this.f42377x.getValue();
    }

    /* renamed from: M */
    public final int mo58072M() {
        return this.f42375r;
    }

    /* renamed from: N */
    public final ClipboardManager mo58073N() {
        return (ClipboardManager) this.f42376s.getValue();
    }

    /* renamed from: O */
    public final Map<Integer, View> mo58074O() {
        return (Map) this.f42378y.getValue();
    }

    /* renamed from: P */
    public final void mo58075P(boolean z, jt2 jt2) {
        jt2.f30600b.setVisibility(ol0.m70370l0(z));
        jt2.f30601c.setVisibility(ol0.m70370l0(z));
        jt2.f30604f.setVisibility(ol0.m70366j0(z));
        jt2.f30603e.setVisibility(ol0.m70366j0(z));
    }

    /* renamed from: Q */
    public final void mo58076Q() {
        dl5 dl5;
        k04 f;
        NavBackStackEntry A = x92.m29982a(this).mo8445A();
        if (A != null) {
            dl5 = A.mo8428i();
        } else {
            dl5 = null;
        }
        if (dl5 != null && (f = dl5.mo18830f("RESULT_SELECTED_CHAIN")) != null) {
            f.observe(A, new C7811ky(new BaseContactFragment$initSelectChainFragmentState$1(this)));
        }
    }

    /* renamed from: S */
    public abstract void mo58059S(String str, int i);

    /* renamed from: T */
    public abstract void mo58060T();

    /* renamed from: U */
    public abstract void mo58061U(String str);

    /* renamed from: V */
    public final void mo58077V(jt2 jt2) {
        boolean z;
        Editable text = jt2.f30602d.getText();
        vx2.m53590f(text, "binding.etContactAddress.text");
        if (text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo58073N().setPrimaryClip(ClipData.newPlainText("label", jt2.f30602d.getText()));
            Context requireContext = requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            ol0.m70345Y(requireContext, R.string.copied_to_clipboard);
        }
    }

    /* renamed from: W */
    public final void mo58078W(jt2 jt2) {
        ClipData primaryClip = mo58073N().getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getText() != null) {
            jt2.f30602d.setText(primaryClip.getItemAt(0).getText().toString());
        }
    }

    /* renamed from: Z */
    public abstract void mo58062Z();

    /* renamed from: a0 */
    public final void mo58079a0(b92 b92) {
        vx2.m53591g(b92, "<set-?>");
        this.f42374k = b92;
    }

    /* renamed from: b0 */
    public final void mo58080b0() {
        mo58070K().f21177c.removeAllViews();
        mo58071L().mo61103m().observe(getViewLifecycleOwner(), new C7851ly(new BaseContactFragment$setupNetworkTypeView$1(this)));
        mo58070K().f21181g.removeAllViews();
        LiveData<X> a = qw6.m25941a(mo58071L().mo61103m());
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        a.observe(getViewLifecycleOwner(), new C6954cy(new BaseContactFragment$setupNetworkTypeView$2(this)));
    }

    /* renamed from: e0 */
    public abstract void mo58063e0();

    /* renamed from: f0 */
    public final void mo58081f0() {
        mo58070K().f21176b.setEnabled(false);
        mo58070K().f21179e.addTextChangedListener(new vo6(new C8561b(this), 0, 2, (DefaultConstructorMarker) null));
        mo58070K().f21180f.setOnClickListener(new C7058ey(this));
        mo58070K().f21184j.setOnClickListener(new C7108fy(this));
        MaterialCheckBox materialCheckBox = mo58070K().f21183i;
        vx2.m53590f(materialCheckBox, "binding.selectAllChains");
        tc7.m72257j(materialCheckBox, new BaseContactFragment$setupView$4(this));
        mo58080b0();
    }

    /* renamed from: i0 */
    public final void mo58082i0() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (mo58070K().f21181g.getChildCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        LinearLayoutCompat linearLayoutCompat = mo58070K().f21181g;
        vx2.m53590f(linearLayoutCompat, "binding.lContactAddressContainer");
        for (View next : dc7.m14987a(linearLayoutCompat)) {
            if (z) {
                ko6 ko6 = ko6.f38933a;
                String obj = ((EditText) next.findViewById(R.id.etContactAddress)).getText().toString();
                Object tag = next.getTag();
                vx2.m53589e(tag, "null cannot be cast to non-null type kotlin.Int");
                if (ko6.mo52966h(obj, ((Integer) tag).intValue())) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        MaterialButton materialButton = mo58070K().f21176b;
        if (!ko6.f38933a.mo52965c(mo58070K().f21179e.getText().toString()) || !z) {
            z3 = false;
        }
        materialButton.setEnabled(z3);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        b92 a = b92.m32431a(layoutInflater.inflate(R.layout.fragment_add_edit_contact, viewGroup, false));
        vx2.m53590f(a, "bind(\n            inflat…e\n            )\n        )");
        mo58079a0(a);
        return mo58070K().mo29498b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo58063e0();
        mo58081f0();
        mo58076Q();
        mo58070K().f21186l.f34318d.setOnClickListener(new C6837ay(this));
        mo58070K().f21176b.setOnClickListener(new C7005dy(this));
    }
}
