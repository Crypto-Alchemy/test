package net.safemoon.androidwallet.fragments.common;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import com.creageek.segmentedbutton.SegmentedButton;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.utils.StoragePermissionLauncher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0007*\u0001\u001a\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0004J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0004J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108DX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lbz;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onViewCreated", "Lnet/safemoon/androidwallet/utils/StoragePermissionLauncher;", "n", "Lji4;", "o", "Lcom/creageek/segmentedbutton/SegmentedButton;", "segmentedGroup", "q", "p", "Lho2;", "d", "Lef3;", "m", "()Lho2;", "iHomeInterface", "", "e", "I", "initialNavigationCheckId", "net/safemoon/androidwallet/fragments/common/BaseMainFragment$a", "g", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment$a;", "onHeaderChangeListener", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BaseMainFragment.kt */
public abstract class BaseMainFragment extends C6912bz {

    /* renamed from: d */
    public final ef3 f42367d = C6169a.m47232a(new BaseMainFragment$iHomeInterface$2(this));

    /* renamed from: e */
    public int f42368e = R.id.navigation_wallet;

    /* renamed from: g */
    public final C8558a f42369g = new C8558a(this);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/common/BaseMainFragment$a", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "Landroid/widget/RadioGroup;", "group", "", "checkedId", "Lr37;", "onCheckedChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.common.BaseMainFragment$a */
    /* compiled from: BaseMainFragment.kt */
    public static final class C8558a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ BaseMainFragment f42370a;

        public C8558a(BaseMainFragment baseMainFragment) {
            this.f42370a = baseMainFragment;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (radioGroup != null) {
                radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
            }
            if (radioGroup != null) {
                radioGroup.check(this.f42370a.f42368e);
            }
            if (radioGroup != null) {
                radioGroup.setOnCheckedChangeListener(this);
            }
            switch (i) {
                case R.id.rbCalculate:
                    BaseMainFragment baseMainFragment = this.f42370a;
                    j44 c = fw3.m44437c();
                    vx2.m53590f(c, "actionToCalculator()");
                    baseMainFragment.mo50754k(c, true);
                    return;
                case R.id.rbNftS:
                    throw new IllegalStateException("Unsupported operation");
                case R.id.rbReflections:
                    BaseMainFragment baseMainFragment2 = this.f42370a;
                    j44 d = fw3.m44438d();
                    vx2.m53590f(d, "actionToReflection()");
                    baseMainFragment2.mo50754k(d, true);
                    return;
                case R.id.rbTokens:
                    BaseMainFragment baseMainFragment3 = this.f42370a;
                    j44 e = fw3.m44439e();
                    vx2.m53590f(e, "actionToWallet()");
                    baseMainFragment3.mo50754k(e, true);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: m */
    public final ho2 mo58053m() {
        return (ho2) this.f42367d.getValue();
    }

    /* renamed from: n */
    public final StoragePermissionLauncher mo58054n() {
        ho2 m = mo58053m();
        if (m != null) {
            return m.mo52264c();
        }
        return null;
    }

    /* renamed from: o */
    public final ji4 mo58055o() {
        ho2 m = mo58053m();
        if (m != null) {
            return m.mo52268m();
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo58056p();
    }

    /* renamed from: p */
    public final void mo58056p() {
        if (getActivity() != null) {
            requireActivity().getWindow().addFlags(Integer.MIN_VALUE);
            requireActivity().getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        }
    }

    /* renamed from: q */
    public final void mo58057q(SegmentedButton segmentedButton) {
        vx2.m53591g(segmentedButton, "segmentedGroup");
        this.f42368e = segmentedButton.getCheckedRadioButtonId();
        segmentedButton.setOnCheckedChangeListener(this.f42369g);
    }
}
