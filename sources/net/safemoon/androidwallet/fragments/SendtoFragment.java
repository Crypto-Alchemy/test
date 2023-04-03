package net.safemoon.androidwallet.fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0729l;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.ScannedCodeActivity;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.G2FAVerfication;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfoResult;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.provider.AskAuthorizeProvider;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.factory.MyViewModelFactory;
import net.safemoon.androidwallet.views.CustomKeyBoard;
import net.safemoon.androidwallet.views.carousel.ContactCarouselView;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 s2\u00020\u00012\u00020\u0002:\u0001tB\u0007¢\u0006\u0004\bq\u0010rJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010V\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010\u00050\u00050R8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010\\\u001a\u0004\u0018\u00010W8BX\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001d\u0010a\u001a\u0004\u0018\u00010]8BX\u0002¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010`R\"\u0010e\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\f0b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8BX\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006u"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SendtoFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/View$OnClickListener;", "Lr37;", "b0", "", "l0", "V", "i0", "j0", "w0", "m0", "", "f0", "d0", "y0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onResume", "v", "onClick", "onPause", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "k", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "r", "D", "getBalanceOf", "()D", "setBalanceOf", "(D)V", "balanceOf", "s", "getCurrentPrice", "x0", "currentPrice", "Landroid/content/ClipboardManager;", "x", "Landroid/content/ClipboardManager;", "getManager", "()Landroid/content/ClipboardManager;", "setManager", "(Landroid/content/ClipboardManager;)V", "manager", "Lta2;", "y", "Lta2;", "binding", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "A", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "displayToken", "Lbr0;", "B", "Lbr0;", "selectContactWindow", "Lyg;", "C", "Lyg;", "walletsAddressPopup", "Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "H", "Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "contactViewModel", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "I", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "L", "Ljava/util/List;", "iContacts", "Lk04;", "kotlin.jvm.PlatformType", "M", "Lk04;", "isTokenMode", "Lnet/safemoon/androidwallet/common/TokenType;", "P", "Lef3;", "h0", "()Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "", "Q", "c0", "()Ljava/lang/String;", "address", "", "U", "Ljava/util/Map;", "fullAmountAllowToken", "", "X", "J", "lastDismissTime", "g0", "()Lr37;", "swapPrice", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "e0", "()Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "googleAuthCallback", "<init>", "()V", "Y", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment extends BaseMainFragment implements View.OnClickListener {

    /* renamed from: Y */
    public static final C8449a f42108Y = new C8449a((DefaultConstructorMarker) null);

    /* renamed from: Z */
    public static String f42109Z = "userTokenData";

    /* renamed from: A */
    public UserTokenItemDisplayModel f42110A;

    /* renamed from: B */
    public br0 f42111B;

    /* renamed from: C */
    public C9639yg f42112C;

    /* renamed from: H */
    public ContactViewModel f42113H;

    /* renamed from: I */
    public MultiWalletViewModel f42114I;

    /* renamed from: L */
    public final List<IContact> f42115L = new ArrayList();

    /* renamed from: M */
    public final k04<Boolean> f42116M = new k04<>(Boolean.TRUE);

    /* renamed from: P */
    public final ef3 f42117P = C6169a.m47232a(new SendtoFragment$tokenType$2(this));

    /* renamed from: Q */
    public final ef3 f42118Q = C6169a.m47232a(new SendtoFragment$address$2(this));

    /* renamed from: U */
    public Map<String, Double> f42119U = C6177b.m47361i();

    /* renamed from: X */
    public long f42120X;

    /* renamed from: k */
    public MyTokensListViewModel f42121k;

    /* renamed from: r */
    public double f42122r;

    /* renamed from: s */
    public double f42123s;

    /* renamed from: x */
    public ClipboardManager f42124x;

    /* renamed from: y */
    public ta2 f42125y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SendtoFragment$a;", "", "", "ARG_TOKEN", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$a */
    /* compiled from: SendtoFragment.kt */
    public static final class C8449a {
        public C8449a() {
        }

        public /* synthetic */ C8449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SendtoFragment$b", "Lnet/safemoon/androidwallet/views/carousel/ContactCarouselView$b;", "", "isSelected", "", "position", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "contact", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$b */
    /* compiled from: SendtoFragment.kt */
    public static final class C8450b implements ContactCarouselView.C8947b {

        /* renamed from: a */
        public final /* synthetic */ SendtoFragment f42126a;

        public C8450b(SendtoFragment sendtoFragment) {
            this.f42126a = sendtoFragment;
        }

        /* renamed from: a */
        public void mo57685a(boolean z, int i, IContact iContact) {
            vx2.m53591g(iContact, "contact");
            if (this.f42126a.f42112C != null) {
                C9639yg N = this.f42126a.f42112C;
                vx2.m53588d(N);
                if (N.mo67095e()) {
                    C9639yg N2 = this.f42126a.f42112C;
                    vx2.m53588d(N2);
                    N2.mo67094d();
                }
            }
            if (this.f42126a.f42111B != null) {
                br0 L = this.f42126a.f42111B;
                vx2.m53588d(L);
                if (L.mo50703h()) {
                    br0 L2 = this.f42126a.f42111B;
                    vx2.m53588d(L2);
                    L2.mo50702g();
                }
            }
            if (z) {
                ContactViewModel H = this.f42126a.f42113H;
                vx2.m53588d(H);
                H.mo61109s(iContact);
                return;
            }
            ContactViewModel H2 = this.f42126a.f42113H;
            vx2.m53588d(H2);
            H2.mo61107q();
            this.f42126a.mo57677i0();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SendtoFragment$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$c */
    /* compiled from: SendtoFragment.kt */
    public static final class C8451c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ SendtoFragment f42127a;

        public C8451c(SendtoFragment sendtoFragment) {
            this.f42127a = sendtoFragment;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            vx2.m53591g(editable, "s");
            ta2 G = this.f42127a.f42125y;
            vx2.m53588d(G);
            MaterialButton materialButton = G.f34180c;
            int i = 0;
            if (editable.toString().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            materialButton.setVisibility(i);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SendtoFragment$d", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$d */
    /* compiled from: SendtoFragment.kt */
    public static final class C8452d implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ SendtoFragment f42128a;

        public C8452d(SendtoFragment sendtoFragment) {
            this.f42128a = sendtoFragment;
        }

        /* renamed from: a */
        public void mo56967a() {
        }

        public void onSuccess() {
            this.f42128a.mo57682w0();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SendtoFragment$e", "Lrn2;", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$e */
    /* compiled from: SendtoFragment.kt */
    public static final class C8453e implements rn2 {

        /* renamed from: a */
        public final /* synthetic */ SendtoFragment f42129a;

        public C8453e(SendtoFragment sendtoFragment) {
            this.f42129a = sendtoFragment;
        }

        /* renamed from: a */
        public void mo57499a(IContact iContact) {
            vx2.m53591g(iContact, "item");
            ta2 G = this.f42129a.f42125y;
            vx2.m53588d(G);
            G.f34186i.setSelectedItem(iContact);
            ContactViewModel H = this.f42129a.f42113H;
            vx2.m53588d(H);
            H.mo61104n().postValue(iContact);
            if (this.f42129a.f42111B != null) {
                br0 L = this.f42129a.f42111B;
                vx2.m53588d(L);
                L.mo50702g();
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SendtoFragment$f", "Lnc4;", "", "s", "", "start", "before", "count", "Lr37;", "onTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$f */
    /* compiled from: SendtoFragment.kt */
    public static final class C8454f extends nc4 {

        /* renamed from: d */
        public final /* synthetic */ SendtoFragment f42130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8454f(SendtoFragment sendtoFragment, TextInputEditText textInputEditText) {
            super(textInputEditText);
            this.f42130d = sendtoFragment;
            vx2.m53590f(textInputEditText, "etAmount");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
            super.onTextChanged(charSequence, i, i2, i3);
            this.f42130d.mo57684y0();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SendtoFragment$g", "Lp90;", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfoResult;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SendtoFragment$g */
    /* compiled from: SendtoFragment.kt */
    public static final class C8455g implements p90<CurrencyTokenInfoResult> {

        /* renamed from: a */
        public final /* synthetic */ SendtoFragment f42131a;

        public C8455g(SendtoFragment sendtoFragment) {
            this.f42131a = sendtoFragment;
        }

        /* renamed from: a */
        public void mo47103a(k90<CurrencyTokenInfoResult> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
        }

        /* renamed from: b */
        public void mo47104b(k90<CurrencyTokenInfoResult> k90, bg5<CurrencyTokenInfoResult> bg5) {
            CurrencyTokenInfo currencyTokenInfo;
            String priceUsd;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50578a() != null) {
                CurrencyTokenInfoResult a = bg5.mo50578a();
                vx2.m53588d(a);
                if (a.getData() != null) {
                    CurrencyTokenInfoResult a2 = bg5.mo50578a();
                    if (a2 != null) {
                        currencyTokenInfo = a2.getData();
                    } else {
                        currencyTokenInfo = null;
                    }
                    if (currencyTokenInfo != null && (priceUsd = currencyTokenInfo.getPriceUsd()) != null) {
                        this.f42131a.mo57683x0(Double.parseDouble(priceUsd));
                    }
                }
            }
        }
    }

    /* renamed from: W */
    public static final void m67049W(SendtoFragment sendtoFragment, View view) {
        vx2.m53591g(sendtoFragment, "this$0");
        k04<Boolean> k04 = sendtoFragment.f42116M;
        Boolean value = k04.getValue();
        vx2.m53588d(value);
        k04.postValue(Boolean.valueOf(!value.booleanValue()));
    }

    /* renamed from: X */
    public static final void m67050X(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m67051Y(SendtoFragment sendtoFragment, View view) {
        vx2.m53591g(sendtoFragment, "this$0");
        ta2 ta2 = sendtoFragment.f42125y;
        vx2.m53588d(ta2);
        ta2.f34187j.setText("");
    }

    /* renamed from: Z */
    public static final boolean m67052Z(SendtoFragment sendtoFragment, TextView textView, int i, KeyEvent keyEvent) {
        vx2.m53591g(sendtoFragment, "this$0");
        if (i != 6) {
            return false;
        }
        a77.m55427e(sendtoFragment.requireActivity());
        return true;
    }

    /* renamed from: a0 */
    public static final void m67053a0(SendtoFragment sendtoFragment, View view, boolean z) {
        vx2.m53591g(sendtoFragment, "this$0");
        if (z) {
            a77.m55427e(sendtoFragment.requireActivity());
        }
    }

    /* renamed from: k0 */
    public static final void m67054k0(SendtoFragment sendtoFragment) {
        boolean z;
        vx2.m53591g(sendtoFragment, "this$0");
        a77.m55427e(sendtoFragment.requireActivity());
        ta2 ta2 = sendtoFragment.f42125y;
        vx2.m53588d(ta2);
        ta2.f34187j.setVisibility(0);
        ta2 ta22 = sendtoFragment.f42125y;
        vx2.m53588d(ta22);
        if (ta22.f34187j.getText().toString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ta2 ta23 = sendtoFragment.f42125y;
            vx2.m53588d(ta23);
            ta23.f34180c.setVisibility(0);
        }
        ta2 ta24 = sendtoFragment.f42125y;
        vx2.m53588d(ta24);
        ta24.f34189l.setText("");
        ta2 ta25 = sendtoFragment.f42125y;
        vx2.m53588d(ta25);
        ta25.f34189l.setVisibility(8);
        sendtoFragment.f42111B = null;
        sendtoFragment.f42120X = System.currentTimeMillis();
    }

    /* renamed from: n0 */
    public static final void m67055n0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m67056o0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m67057p0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m67058q0(SendtoFragment sendtoFragment, IContact iContact) {
        vx2.m53591g(sendtoFragment, "this$0");
        if (iContact != null) {
            ta2 ta2 = sendtoFragment.f42125y;
            vx2.m53588d(ta2);
            ta2.f34187j.setText(iContact.getAddress());
        }
    }

    /* renamed from: r0 */
    public static final void m67060r0(SendtoFragment sendtoFragment, View view) {
        vx2.m53591g(sendtoFragment, "this$0");
        if (f06.m57513d(sendtoFragment.requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(sendtoFragment.mo57673e0(), false);
            FragmentManager childFragmentManager = sendtoFragment.getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57214K(childFragmentManager);
            return;
        }
        sendtoFragment.mo57682w0();
    }

    /* renamed from: s0 */
    public static final void m67062s0(View view) {
    }

    /* renamed from: t0 */
    public static final void m67064t0(SendtoFragment sendtoFragment, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        vx2.m53591g(sendtoFragment, "this$0");
        if (sendtoFragment.isVisible()) {
            ta2 ta2 = sendtoFragment.f42125y;
            vx2.m53588d(ta2);
            ScrollView scrollView = ta2.f34197t;
            ta2 ta22 = sendtoFragment.f42125y;
            vx2.m53588d(ta22);
            scrollView.smoothScrollTo(0, ta22.f34197t.getBottom());
        }
    }

    /* renamed from: u0 */
    public static final void m67066u0(SendtoFragment sendtoFragment, View view) {
        vx2.m53591g(sendtoFragment, "this$0");
        ClipboardManager clipboardManager = sendtoFragment.f42124x;
        vx2.m53588d(clipboardManager);
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getText() != null) {
            String obj = primaryClip.getItemAt(0).getText().toString();
            ta2 ta2 = sendtoFragment.f42125y;
            vx2.m53588d(ta2);
            ta2.f34187j.setText(obj);
        }
    }

    /* renamed from: v0 */
    public static final void m67068v0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: V */
    public final void mo57669V() {
        ContactViewModel contactViewModel;
        if (this.f42125y != null) {
            UserTokenItemDisplayModel userTokenItemDisplayModel = this.f42110A;
            if (!(userTokenItemDisplayModel == null || !a14.f36348a.mo50042b(TokenType.Companion.mo57099b(userTokenItemDisplayModel.getChainId()), userTokenItemDisplayModel.getContractAddress()) || (contactViewModel = this.f42113H) == null)) {
                k04 k04 = new k04();
                k04.observe(getViewLifecycleOwner(), new ew5(new SendtoFragment$bind$1$1$1(this, userTokenItemDisplayModel)));
                r37 r37 = r37.f33317a;
                contactViewModel.mo61105o(userTokenItemDisplayModel, k04);
            }
            ta2 ta2 = this.f42125y;
            vx2.m53588d(ta2);
            MaterialCheckBox materialCheckBox = ta2.f34184g;
            vx2.m53590f(materialCheckBox, "binding!!.chkFullAmountRecipient");
            tc7.m72257j(materialCheckBox, new SendtoFragment$bind$2(this));
            ta2 ta22 = this.f42125y;
            vx2.m53588d(ta22);
            ta22.f34186i.setOnItemSelectedChangedListener(new C8450b(this));
            ta2 ta23 = this.f42125y;
            vx2.m53588d(ta23);
            ta23.f34180c.setOnClickListener(new rv5(this));
            ta2 ta24 = this.f42125y;
            vx2.m53588d(ta24);
            ta24.f34187j.addTextChangedListener(new C8451c(this));
            ta2 ta25 = this.f42125y;
            vx2.m53588d(ta25);
            ta25.f34189l.setOnEditorActionListener(new sv5(this));
            ta2 ta26 = this.f42125y;
            vx2.m53588d(ta26);
            ta26.f34185h.setOnFocusChangeListener(new tv5(this));
            ta2 ta27 = this.f42125y;
            vx2.m53588d(ta27);
            ta27.f34199v.setText(rz1.f44501a.mo65772b());
            ta2 ta28 = this.f42125y;
            vx2.m53588d(ta28);
            ta28.f34199v.setOnClickListener(new uv5(this));
        }
    }

    /* renamed from: b0 */
    public final void mo57670b0() {
        CustomKeyBoard i;
        try {
            ho2 m = mo58053m();
            if (m != null && (i = m.mo52267i()) != null) {
                ta2 ta2 = this.f42125y;
                vx2.m53588d(ta2);
                TextInputEditText textInputEditText = ta2.f34188k;
                vx2.m53590f(textInputEditText, "binding!!.etAmount");
                i.mo62097v(textInputEditText);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c0 */
    public final String mo57671c0() {
        return (String) this.f42118Q.getValue();
    }

    /* renamed from: d0 */
    public final double mo57672d0() {
        String str;
        double d;
        ta2 ta2 = this.f42125y;
        vx2.m53588d(ta2);
        Editable text = ta2.f34188k.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
            d = ol0.m70330J(str);
        } else {
            d = sz1.m72126c(ol0.m70330J(str)) / this.f42123s;
        }
        return mo57674f0() - d;
    }

    /* renamed from: e0 */
    public final G2FAVerfication.C8290b mo57673e0() {
        return new C8452d(this);
    }

    /* renamed from: f0 */
    public final double mo57674f0() {
        String str;
        double d;
        String str2;
        double d2;
        String contractAddress;
        ta2 ta2 = this.f42125y;
        vx2.m53588d(ta2);
        Editable text = ta2.f34188k.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        ta2 ta22 = this.f42125y;
        vx2.m53588d(ta22);
        boolean isChecked = ta22.f34184g.isChecked();
        if (vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
            d = ol0.m70330J(str);
        } else {
            d = sz1.m72126c(ol0.m70330J(str)) / this.f42123s;
        }
        if (!isChecked) {
            return d;
        }
        Map<String, Double> map = this.f42119U;
        UserTokenItemDisplayModel userTokenItemDisplayModel = this.f42110A;
        if (userTokenItemDisplayModel == null || (contractAddress = userTokenItemDisplayModel.getContractAddress()) == null) {
            str2 = null;
        } else {
            str2 = contractAddress.toLowerCase(Locale.ROOT);
            vx2.m53590f(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        Double d3 = map.get(str2);
        if (d3 != null) {
            d2 = d3.doubleValue();
        } else {
            d2 = Utils.DOUBLE_EPSILON;
        }
        return (d * 100.0d) / (((double) 100) - d2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (p000.vx2.m53586b(r1.getSymbol(), "ETH") != false) goto L_0x002b;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.r37 mo57675g0() {
        /*
            r6 = this;
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r0 = r6.f42110A
            p000.vx2.m53588d(r0)
            java.lang.String r0 = r0.getContractAddress()
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r1 = r6.f42110A
            p000.vx2.m53588d(r1)
            java.lang.String r1 = r1.getSymbol()
            java.lang.String r2 = "BNB"
            boolean r1 = p000.vx2.m53586b(r1, r2)
            if (r1 != 0) goto L_0x002b
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r1 = r6.f42110A
            p000.vx2.m53588d(r1)
            java.lang.String r1 = r1.getSymbol()
            java.lang.String r2 = "ETH"
            boolean r1 = p000.vx2.m53586b(r1, r2)
            if (r1 == 0) goto L_0x00bb
        L_0x002b:
            net.safemoon.androidwallet.common.TokenType$a r1 = net.safemoon.androidwallet.common.TokenType.Companion
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            android.app.Application r2 = r2.getApplication()
            net.safemoon.androidwallet.common.TokenType r3 = net.safemoon.androidwallet.common.TokenType.BEP_20
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "DEFAULT_GATEWAY"
            java.lang.String r2 = p000.f06.m57519j(r2, r5, r4)
            java.lang.String r4 = "getString(\n             …e()\n                    )"
            p000.vx2.m53590f(r2, r4)
            net.safemoon.androidwallet.common.TokenType r1 = r1.mo57100c(r2)
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = r3.getName()
            boolean r2 = p000.vx2.m53586b(r2, r3)
            java.lang.String r3 = "swap.address"
            if (r2 == 0) goto L_0x0083
            net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r1 = r6.f42121k
            p000.vx2.m53588d(r1)
            java.util.ArrayList r1 = r1.mo61294F()
            java.util.Iterator r1 = r1.iterator()
        L_0x0067:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bb
            java.lang.Object r2 = r1.next()
            net.safemoon.androidwallet.model.swap.Swap r2 = (net.safemoon.androidwallet.model.swap.Swap) r2
            java.lang.String r4 = r2.symbol
            java.lang.String r5 = "WBNB"
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x0067
            java.lang.String r0 = r2.address
            p000.vx2.m53590f(r0, r3)
            goto L_0x00bb
        L_0x0083:
            java.lang.String r1 = r1.getName()
            net.safemoon.androidwallet.common.TokenType r2 = net.safemoon.androidwallet.common.TokenType.ERC_20
            java.lang.String r2 = r2.getName()
            boolean r1 = p000.vx2.m53586b(r1, r2)
            if (r1 == 0) goto L_0x00bb
            net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r1 = r6.f42121k
            p000.vx2.m53588d(r1)
            java.util.ArrayList r1 = r1.mo61294F()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bb
            java.lang.Object r2 = r1.next()
            net.safemoon.androidwallet.model.swap.Swap r2 = (net.safemoon.androidwallet.model.swap.Swap) r2
            java.lang.String r4 = r2.symbol
            java.lang.String r5 = "WETH"
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x00a0
            java.lang.String r0 = r2.address
            p000.vx2.m53590f(r0, r3)
        L_0x00bb:
            ho3 r1 = p000.C9384u3.m72571l()
            net.safemoon.androidwallet.utils.Common r2 = net.safemoon.androidwallet.utils.Common.f42577a
            java.lang.String r2 = r2.mo60908o(r0)
            k90 r0 = r1.mo52280i(r0, r2)
            net.safemoon.androidwallet.fragments.SendtoFragment$g r1 = new net.safemoon.androidwallet.fragments.SendtoFragment$g
            r1.<init>(r6)
            r0.mo50512X(r1)
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SendtoFragment.mo57675g0():r37");
    }

    /* renamed from: h0 */
    public final TokenType mo57676h0() {
        return (TokenType) this.f42117P.getValue();
    }

    /* renamed from: i0 */
    public final void mo57677i0() {
        ta2 ta2 = this.f42125y;
        vx2.m53588d(ta2);
        ta2.f34187j.setText("");
    }

    /* renamed from: j0 */
    public final void mo57678j0() {
        if (System.currentTimeMillis() - this.f42120X >= 1000 && requireActivity().getApplicationContext() != null) {
            ta2 ta2 = this.f42125y;
            vx2.m53588d(ta2);
            ta2.f34187j.setVisibility(8);
            ta2 ta22 = this.f42125y;
            vx2.m53588d(ta22);
            ta22.f34189l.setVisibility(0);
            br0 br0 = this.f42111B;
            if (br0 != null) {
                vx2.m53588d(br0);
                if (br0.mo50703h()) {
                    br0 br02 = this.f42111B;
                    vx2.m53588d(br02);
                    br02.mo50702g();
                    return;
                }
            }
            ta2 ta23 = this.f42125y;
            vx2.m53588d(ta23);
            ta23.f34180c.setVisibility(8);
            br0 br03 = br0.f36938a;
            Context applicationContext = requireActivity().getApplicationContext();
            vx2.m53590f(applicationContext, "requireActivity().applicationContext");
            List<IContact> list = this.f42115L;
            ta2 ta24 = this.f42125y;
            vx2.m53588d(ta24);
            AppCompatEditText appCompatEditText = ta24.f34189l;
            vx2.m53590f(appCompatEditText, "binding!!.etContactSearch");
            this.f42111B = br03.mo50704i(applicationContext, list, appCompatEditText, new C8453e(this), new vv5(this));
            ta2 ta25 = this.f42125y;
            vx2.m53588d(ta25);
            a77.m55429g(ta25.f34189l);
        }
    }

    /* renamed from: l0 */
    public final boolean mo57679l0() {
        String str;
        String contractAddress;
        Map<String, Double> map = this.f42119U;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, Double> key : map.entrySet()) {
            Locale locale = Locale.ROOT;
            String lowerCase = ((String) key.getKey()).toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            UserTokenItemDisplayModel userTokenItemDisplayModel = this.f42110A;
            if (userTokenItemDisplayModel == null || (contractAddress = userTokenItemDisplayModel.getContractAddress()) == null) {
                str = null;
            } else {
                str = contractAddress.toLowerCase(locale);
                vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (vx2.m53586b(lowerCase, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m0 */
    public final void mo57680m0() {
        if (this.f42113H != null) {
            this.f42116M.observe(getViewLifecycleOwner(), new aw5(new SendtoFragment$observe$1(this)));
            ContactViewModel contactViewModel = this.f42113H;
            vx2.m53588d(contactViewModel);
            contactViewModel.mo61098h().observe(getViewLifecycleOwner(), new bw5(new SendtoFragment$observe$2(this)));
            ContactViewModel contactViewModel2 = this.f42113H;
            vx2.m53588d(contactViewModel2);
            contactViewModel2.mo61100j().observe(getViewLifecycleOwner(), new cw5(new SendtoFragment$observe$3(this)));
            ContactViewModel contactViewModel3 = this.f42113H;
            vx2.m53588d(contactViewModel3);
            contactViewModel3.mo61104n().observe(getViewLifecycleOwner(), new dw5(this));
        }
    }

    public void onClick(View view) {
        Integer num;
        ji4 m;
        C3529wa<Intent> b;
        MultiWalletViewModel multiWalletViewModel;
        vx2.m53591g(view, "v");
        boolean z = true;
        switch (view.getId()) {
            case R.id.btnAddContact:
                j44 a = gw5.m58274a();
                vx2.m53590f(a, "actionSendtoFragmentToManageContactsFragment()");
                mo50753j(a);
                return;
            case R.id.btnSend:
                ta2 ta2 = this.f42125y;
                vx2.m53588d(ta2);
                Editable text = ta2.f34188k.getText();
                if (text != null) {
                    String obj = text.toString();
                }
                double f0 = mo57674f0();
                String c0 = mo57671c0();
                ta2 ta22 = this.f42125y;
                vx2.m53588d(ta22);
                CharSequence text2 = ta22.f34187j.getText();
                if (text2 == null) {
                    text2 = "";
                }
                if (text2.length() != 0) {
                    z = false;
                }
                if (z) {
                    Context requireContext = requireContext();
                    vx2.m53590f(requireContext, "requireContext()");
                    ol0.m70325E(requireContext);
                    FragmentActivity requireActivity = requireActivity();
                    vx2.m53590f(requireActivity, "requireActivity()");
                    ol0.m70345Y(requireActivity, R.string.fill_the_form);
                    return;
                }
                ta2 ta23 = this.f42125y;
                vx2.m53588d(ta23);
                if (vx2.m53586b(ta23.f34187j.getText().toString(), c0)) {
                    C9001np.m69943a0(new WeakReference(requireActivity()), Integer.valueOf(R.string.send_to_same_wallet_address_dialog_title), Integer.valueOf(R.string.send_to_same_wallet_address_dialog_content), R.string.send_to_same_wallet_address_dialog_action_ok, (pc2) null, 16, (Object) null);
                    return;
                }
                a14 a14 = a14.f36348a;
                TokenType.C8246a aVar = TokenType.Companion;
                UserTokenItemDisplayModel userTokenItemDisplayModel = this.f42110A;
                if (userTokenItemDisplayModel != null) {
                    num = Integer.valueOf(userTokenItemDisplayModel.getChainId());
                } else {
                    num = null;
                }
                vx2.m53588d(num);
                TokenType b2 = aVar.mo57099b(num.intValue());
                ta2 ta24 = this.f42125y;
                vx2.m53588d(ta24);
                if (!a14.mo50042b(b2, ta24.f34187j.getText().toString())) {
                    Context requireContext2 = requireContext();
                    vx2.m53590f(requireContext2, "requireContext()");
                    ol0.m70325E(requireContext2);
                    Context requireContext3 = requireContext();
                    vx2.m53590f(requireContext3, "requireContext()");
                    ol0.m70345Y(requireContext3, R.string.send_to_invalid_address);
                    return;
                } else if (f0 > this.f42122r) {
                    Context requireContext4 = requireContext();
                    vx2.m53590f(requireContext4, "requireContext()");
                    ol0.m70325E(requireContext4);
                    Context requireContext5 = requireContext();
                    vx2.m53590f(requireContext5, "requireContext()");
                    ol0.m70345Y(requireContext5, R.string.send_to_amount_less_then_available);
                    return;
                } else if (f0 <= Utils.DOUBLE_EPSILON) {
                    Context requireContext6 = requireContext();
                    vx2.m53590f(requireContext6, "requireContext()");
                    ol0.m70345Y(requireContext6, R.string.send_to_amount_more_then_zero);
                    return;
                } else {
                    FragmentActivity requireActivity2 = requireActivity();
                    vx2.m53590f(requireActivity2, "requireActivity()");
                    ta2 ta25 = this.f42125y;
                    vx2.m53588d(ta25);
                    C9001np.m69977r0(requireActivity2, ta25.f34187j.getText().toString(), new yv5(this), new zv5());
                    return;
                }
            case R.id.camera:
                ho2 m2 = mo58053m();
                if (m2 != null && (m = m2.mo52268m()) != null && (b = m.mo52724b(new SendtoFragment$onClick$3(this))) != null) {
                    b.mo27473a(new Intent(getActivity(), ScannedCodeActivity.class));
                    return;
                }
                return;
            case R.id.imgContacts:
                mo57678j0();
                return;
            case R.id.imgWallets:
                C9639yg ygVar = this.f42112C;
                if (ygVar == null || !ygVar.mo67095e()) {
                    z = false;
                }
                if (!z && (multiWalletViewModel = this.f42114I) != null) {
                    TokenType h0 = mo57676h0();
                    vx2.m53588d(h0);
                    multiWalletViewModel.mo61257s(h0, new SendtoFragment$onClick$4(this));
                    return;
                }
                return;
            case R.id.iv_back:
                mo50752i();
                return;
            case R.id.tvHalf:
                if (this.f42122r > Utils.DOUBLE_EPSILON && vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
                    ta2 ta26 = this.f42125y;
                    vx2.m53588d(ta26);
                    ta26.f34188k.setText(ol0.m70373o(this.f42122r * 0.5d, 0, RoundingMode.DOWN, false));
                    ta2 ta27 = this.f42125y;
                    vx2.m53588d(ta27);
                    TextInputEditText textInputEditText = ta27.f34188k;
                    ta2 ta28 = this.f42125y;
                    vx2.m53588d(ta28);
                    textInputEditText.setSelection(ta28.f34188k.length());
                    a77.m55428f(requireContext());
                    return;
                }
                return;
            case R.id.tvMax:
                if (this.f42122r > Utils.DOUBLE_EPSILON && vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
                    ta2 ta29 = this.f42125y;
                    vx2.m53588d(ta29);
                    ta29.f34188k.setText(ol0.m70373o(this.f42122r, 0, RoundingMode.DOWN, false));
                    ta2 ta210 = this.f42125y;
                    vx2.m53588d(ta210);
                    TextInputEditText textInputEditText2 = ta210.f34188k;
                    ta2 ta211 = this.f42125y;
                    vx2.m53588d(ta211);
                    textInputEditText2.setSelection(ta211.f34188k.length());
                    a77.m55428f(requireContext());
                    return;
                }
                return;
            case R.id.tvQuarter:
                if (this.f42122r > Utils.DOUBLE_EPSILON && vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
                    ta2 ta212 = this.f42125y;
                    vx2.m53588d(ta212);
                    ta212.f34188k.setText(ol0.m70373o(this.f42122r * 0.25d, 0, RoundingMode.DOWN, false));
                    ta2 ta213 = this.f42125y;
                    vx2.m53588d(ta213);
                    TextInputEditText textInputEditText3 = ta213.f34188k;
                    ta2 ta214 = this.f42125y;
                    vx2.m53588d(ta214);
                    textInputEditText3.setSelection(ta214.f34188k.length());
                    a77.m55428f(requireContext());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_sendto, viewGroup, false);
        Object systemService = requireActivity().getSystemService("clipboard");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f42124x = (ClipboardManager) systemService;
        this.f42113H = (ContactViewModel) new C0729l((hd7) this, (C0729l.C0733b) new MyViewModelFactory(new WeakReference(requireActivity()))).mo6421a(ContactViewModel.class);
        this.f42114I = (MultiWalletViewModel) new C0729l(this).mo6421a(MultiWalletViewModel.class);
        this.f42125y = ta2.m52147a(inflate);
        mo57670b0();
        vx2.m53588d(viewGroup);
        viewGroup.addOnLayoutChangeListener(new qv5(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) arguments.getSerializable(f42109Z);
            this.f42110A = userTokenItemDisplayModel;
            vx2.m53588d(userTokenItemDisplayModel);
            this.f42122r = userTokenItemDisplayModel.getNativeBalance();
            UserTokenItemDisplayModel userTokenItemDisplayModel2 = this.f42110A;
            vx2.m53588d(userTokenItemDisplayModel2);
            this.f42123s = userTokenItemDisplayModel2.getPriceInUsdt();
            ta2 ta2 = this.f42125y;
            vx2.m53588d(ta2);
            TextView textView = ta2.f34198u;
            vx2.m53590f(textView, "binding!!.tvBalance");
            UserTokenItemDisplayModel userTokenItemDisplayModel3 = this.f42110A;
            vx2.m53588d(userTokenItemDisplayModel3);
            double nativeBalance = userTokenItemDisplayModel3.getNativeBalance();
            UserTokenItemDisplayModel userTokenItemDisplayModel4 = this.f42110A;
            vx2.m53588d(userTokenItemDisplayModel4);
            ol0.m70339S(textView, nativeBalance, userTokenItemDisplayModel4.getSymbol());
        }
        ta2 ta22 = this.f42125y;
        vx2.m53588d(ta22);
        ta22.f34188k.setFilters(new InputFilter[]{new xu2(Double.valueOf(Utils.DOUBLE_EPSILON), Double.valueOf(Double.MAX_VALUE))});
        ta2 ta23 = this.f42125y;
        vx2.m53588d(ta23);
        TextInputEditText textInputEditText = ta23.f34188k;
        ta2 ta24 = this.f42125y;
        vx2.m53588d(ta24);
        textInputEditText.addTextChangedListener(new C8454f(this, ta24.f34188k));
        ta2 ta25 = this.f42125y;
        vx2.m53588d(ta25);
        ta25.f34188k.setText("");
        ta2 ta26 = this.f42125y;
        vx2.m53588d(ta26);
        ta26.f34202y.setOnClickListener(new wv5(this));
        ta2 ta27 = this.f42125y;
        vx2.m53588d(ta27);
        ta27.f34183f.setOnClickListener(this);
        ta2 ta28 = this.f42125y;
        vx2.m53588d(ta28);
        ta28.f34175A.setOnClickListener(this);
        ta2 ta29 = this.f42125y;
        vx2.m53588d(ta29);
        ta29.f34200w.setOnClickListener(this);
        ta2 ta210 = this.f42125y;
        vx2.m53588d(ta210);
        ta210.f34201x.setOnClickListener(this);
        ta2 ta211 = this.f42125y;
        vx2.m53588d(ta211);
        ta211.f34181d.setOnClickListener(this);
        ta2 ta212 = this.f42125y;
        vx2.m53588d(ta212);
        ta212.f34193p.setOnClickListener(this);
        ta2 ta213 = this.f42125y;
        vx2.m53588d(ta213);
        ta213.f34179b.setOnClickListener(this);
        ta2 ta214 = this.f42125y;
        vx2.m53588d(ta214);
        ta214.f34190m.setOnClickListener(this);
        ta2 ta215 = this.f42125y;
        vx2.m53588d(ta215);
        ta215.f34192o.setOnClickListener(this);
        ta2 ta216 = this.f42125y;
        vx2.m53588d(ta216);
        ta216.f34185h.setOnClickListener(this);
        FragmentActivity requireActivity = requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        this.f42121k = (MyTokensListViewModel) new C0729l((hd7) requireActivity, (C0729l.C0733b) new MyViewModelFactory(new WeakReference(requireActivity()))).mo6421a(MyTokensListViewModel.class);
        ta2 ta217 = this.f42125y;
        vx2.m53588d(ta217);
        TextView textView2 = ta217.f34198u;
        vx2.m53590f(textView2, "binding!!.tvBalance");
        ol0.m70343W(textView2, new SendtoFragment$onCreateView$4(this));
        MyTokensListViewModel myTokensListViewModel = this.f42121k;
        vx2.m53588d(myTokensListViewModel);
        myTokensListViewModel.mo61298J().observe(getViewLifecycleOwner(), new xv5(new SendtoFragment$onCreateView$5(this)));
        mo57675g0();
        ta2 ta218 = this.f42125y;
        vx2.m53588d(ta218);
        AppCompatImageView appCompatImageView = ta218.f34191n;
        vx2.m53590f(appCompatImageView, "binding!!.imgSymbol");
        UserTokenItemDisplayModel userTokenItemDisplayModel5 = this.f42110A;
        vx2.m53588d(userTokenItemDisplayModel5);
        int iconResId = userTokenItemDisplayModel5.getIconResId();
        UserTokenItemDisplayModel userTokenItemDisplayModel6 = this.f42110A;
        vx2.m53588d(userTokenItemDisplayModel6);
        String iconFile = userTokenItemDisplayModel6.getIconFile();
        UserTokenItemDisplayModel userTokenItemDisplayModel7 = this.f42110A;
        vx2.m53588d(userTokenItemDisplayModel7);
        ol0.m70336P(appCompatImageView, iconResId, iconFile, userTokenItemDisplayModel7.getSymbol());
        UserTokenItemDisplayModel userTokenItemDisplayModel8 = this.f42110A;
        vx2.m53588d(userTokenItemDisplayModel8);
        if (ol0.m70328H(userTokenItemDisplayModel8.getSymbol())) {
            ta2 ta219 = this.f42125y;
            vx2.m53588d(ta219);
            AppCompatImageView appCompatImageView2 = ta219.f34191n;
            vx2.m53590f(appCompatImageView2, "binding!!.imgSymbol");
            UserTokenItemDisplayModel userTokenItemDisplayModel9 = this.f42110A;
            vx2.m53588d(userTokenItemDisplayModel9);
            String cmcId = userTokenItemDisplayModel9.getCmcId();
            UserTokenItemDisplayModel userTokenItemDisplayModel10 = this.f42110A;
            vx2.m53588d(userTokenItemDisplayModel10);
            ol0.m70335O(appCompatImageView2, cmcId, userTokenItemDisplayModel10.getSymbol());
        }
        ta2 ta220 = this.f42125y;
        vx2.m53588d(ta220);
        TextView textView3 = ta220.f34177C;
        UserTokenItemDisplayModel userTokenItemDisplayModel11 = this.f42110A;
        vx2.m53588d(userTokenItemDisplayModel11);
        textView3.setText(userTokenItemDisplayModel11.getName());
        ta2 ta221 = this.f42125y;
        vx2.m53588d(ta221);
        ScrollView b = ta221.mo48037b();
        vx2.m53590f(b, "binding!!.root");
        return b;
    }

    public void onPause() {
        super.onPause();
        br0 br0 = this.f42111B;
        if (br0 != null) {
            vx2.m53588d(br0);
            if (br0.mo50703h()) {
                br0 br02 = this.f42111B;
                vx2.m53588d(br02);
                br02.mo50702g();
            }
        }
        C9639yg ygVar = this.f42112C;
        if (ygVar != null) {
            vx2.m53588d(ygVar);
            if (ygVar.mo67095e()) {
                C9639yg ygVar2 = this.f42112C;
                vx2.m53588d(ygVar2);
                ygVar2.mo67094d();
            }
        }
    }

    public void onResume() {
        TextView textView;
        super.onResume();
        ta2 ta2 = this.f42125y;
        if (ta2 != null) {
            textView = ta2.f34199v;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(rz1.f44501a.mo65772b());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57680m0();
        mo57669V();
    }

    /* renamed from: w0 */
    public final void mo57682w0() {
        String str;
        if (vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
            ta2 ta2 = this.f42125y;
            vx2.m53588d(ta2);
            if (!ta2.f34184g.isChecked()) {
                ta2 ta22 = this.f42125y;
                vx2.m53588d(ta22);
                str = String.valueOf(ta22.f34188k.getText());
                Context requireContext = requireContext();
                vx2.m53590f(requireContext, "requireContext()");
                new AskAuthorizeProvider(requireContext, mo58053m()).mo60705a(new SendtoFragment$sendingFragment$1(this, str), SendtoFragment$sendingFragment$2.INSTANCE);
            }
        }
        str = ol0.m70373o(mo57674f0(), 18, RoundingMode.HALF_UP, true);
        Context requireContext2 = requireContext();
        vx2.m53590f(requireContext2, "requireContext()");
        new AskAuthorizeProvider(requireContext2, mo58053m()).mo60705a(new SendtoFragment$sendingFragment$1(this, str), SendtoFragment$sendingFragment$2.INSTANCE);
    }

    /* renamed from: x0 */
    public final void mo57683x0(double d) {
        this.f42123s = d;
    }

    /* renamed from: y0 */
    public final void mo57684y0() {
        boolean z;
        ta2 ta2 = this.f42125y;
        vx2.m53588d(ta2);
        String valueOf = String.valueOf(ta2.f34188k.getText());
        if (valueOf.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                ta2 ta22 = this.f42125y;
                vx2.m53588d(ta22);
                ta22.f34203z.setVisibility(0);
                if (vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
                    String o = ol0.m70373o(sz1.m72124a(this.f42123s * ol0.m70330J(valueOf)), 0, RoundingMode.DOWN, false);
                    String o2 = ol0.m70373o(sz1.m72124a(this.f42123s * mo57672d0()), 0, RoundingMode.DOWN, false);
                    rz1.C9291a aVar = rz1.f44501a;
                    String str = "~ " + aVar.mo65772b() + " " + o;
                    ta2 ta23 = this.f42125y;
                    vx2.m53588d(ta23);
                    TextView textView = ta23.f34203z;
                    if (mo57672d0() > Utils.DOUBLE_EPSILON) {
                        str = str + " + " + aVar.mo65772b() + " " + o2;
                    }
                    textView.setText(str);
                } else {
                    String o3 = ol0.m70373o(sz1.m72126c(ol0.m70330J(valueOf)) / this.f42123s, 18, RoundingMode.HALF_UP, true);
                    String o4 = ol0.m70373o(mo57672d0(), 18, RoundingMode.HALF_UP, true);
                    UserTokenItemDisplayModel userTokenItemDisplayModel = this.f42110A;
                    vx2.m53588d(userTokenItemDisplayModel);
                    String str2 = "~ " + o3 + " " + userTokenItemDisplayModel.getSymbol();
                    ta2 ta24 = this.f42125y;
                    vx2.m53588d(ta24);
                    TextView textView2 = ta24.f34203z;
                    if (mo57672d0() > Utils.DOUBLE_EPSILON) {
                        UserTokenItemDisplayModel userTokenItemDisplayModel2 = this.f42110A;
                        vx2.m53588d(userTokenItemDisplayModel2);
                        str2 = str2 + " + " + o4 + " " + userTokenItemDisplayModel2.getSymbol();
                    }
                    textView2.setText(str2);
                }
            } catch (Exception unused) {
            }
        } else {
            ta2 ta25 = this.f42125y;
            vx2.m53588d(ta25);
            ta25.f34203z.setVisibility(8);
            ta2 ta26 = this.f42125y;
            vx2.m53588d(ta26);
            ta26.f34203z.setText("~ " + rz1.f44501a.mo65772b() + " " + getString(R.string.send_to_0, Character.valueOf(Common.f42577a.mo60892B())));
        }
        if (vx2.m53586b(this.f42116M.getValue(), Boolean.TRUE)) {
            ta2 ta27 = this.f42125y;
            vx2.m53588d(ta27);
            TextInputEditText textInputEditText = ta27.f34188k;
            cb6 cb6 = cb6.f21669a;
            Locale locale = Locale.getDefault();
            String string = getString(R.string.send_to_fragment_amount_format);
            vx2.m53590f(string, "getString(R.string.send_to_fragment_amount_format)");
            UserTokenItemDisplayModel userTokenItemDisplayModel3 = this.f42110A;
            vx2.m53588d(userTokenItemDisplayModel3);
            String format = String.format(locale, string, Arrays.copyOf(new Object[]{userTokenItemDisplayModel3.getName()}, 1));
            vx2.m53590f(format, "format(locale, format, *args)");
            textInputEditText.setHint(format);
            return;
        }
        ta2 ta28 = this.f42125y;
        vx2.m53588d(ta28);
        TextInputEditText textInputEditText2 = ta28.f34188k;
        cb6 cb62 = cb6.f21669a;
        Locale locale2 = Locale.getDefault();
        String string2 = getString(R.string.send_to_fragment_amount_format);
        vx2.m53590f(string2, "getString(R.string.send_to_fragment_amount_format)");
        String format2 = String.format(locale2, string2, Arrays.copyOf(new Object[]{rz1.f44501a.mo65772b()}, 1));
        vx2.m53590f(format2, "format(locale, format, *args)");
        textInputEditText2.setHint(format2);
    }
}
