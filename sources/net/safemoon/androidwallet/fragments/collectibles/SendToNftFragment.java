package net.safemoon.androidwallet.fragments.collectibles;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C0729l;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.G2FAVerfication;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.nft.NFTData;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.provider.AskAuthorizeProvider;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.viewmodels.factory.MyViewModelFactory;
import net.safemoon.androidwallet.views.carousel.ContactCarouselView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u001b\u00101\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/collectibles/SendToNftFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lr37;", "k0", "n0", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "S", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "contact", "c0", "", "s", "Q", "keyword", "R", "i0", "W", "j0", "X", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onDetach", "onPause", "Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "k", "Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "contactViewModel", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "r", "Lef3;", "T", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lyg;", "Lyg;", "walletsAddressPopup", "Lnet/safemoon/androidwallet/model/nft/NFTData;", "x", "U", "()Lnet/safemoon/androidwallet/model/nft/NFTData;", "nftData", "Lnet/safemoon/androidwallet/common/TokenType;", "y", "V", "()Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lra2;", "A", "Lra2;", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SendToNftFragment.kt */
public final class SendToNftFragment extends BaseMainFragment {

    /* renamed from: A */
    public ra2 f42336A;

    /* renamed from: k */
    public ContactViewModel f42337k;

    /* renamed from: r */
    public final ef3 f42338r;

    /* renamed from: s */
    public C9639yg f42339s;

    /* renamed from: x */
    public final ef3 f42340x = C6169a.m47232a(new SendToNftFragment$nftData$2(this));

    /* renamed from: y */
    public final ef3 f42341y = C6169a.m47232a(new SendToNftFragment$tokenType$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$a", "Lrn2;", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$a */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8545a implements rn2 {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42342a;

        public C8545a(SendToNftFragment sendToNftFragment) {
            this.f42342a = sendToNftFragment;
        }

        /* renamed from: a */
        public void mo57499a(IContact iContact) {
            RecyclerView recyclerView;
            LinearLayout linearLayout;
            AppCompatEditText appCompatEditText;
            vx2.m53591g(iContact, "item");
            ra2 E = this.f42342a.f42336A;
            if (!(E == null || (appCompatEditText = E.f33376f) == null)) {
                appCompatEditText.setText(iContact.getAddress());
            }
            ra2 E2 = this.f42342a.f42336A;
            AppCompatEditText appCompatEditText2 = null;
            if (E2 != null) {
                recyclerView = E2.f33374d;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((RecyclerView.Adapter) null);
            }
            ra2 E3 = this.f42342a.f42336A;
            if (E3 != null) {
                linearLayout = E3.f33381k;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ra2 E4 = this.f42342a.f42336A;
            if (E4 != null) {
                appCompatEditText2 = E4.f33376f;
            }
            if (appCompatEditText2 != null) {
                appCompatEditText2.setVisibility(0);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$b", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$b */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8546b implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42343a;

        public C8546b(SendToNftFragment sendToNftFragment) {
            this.f42343a = sendToNftFragment;
        }

        /* renamed from: a */
        public void mo56967a() {
        }

        public void onSuccess() {
            this.f42343a.mo58023n0();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$c", "Lle5;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Lpl6;", "target", "", "isFirstResource", "d", "resource", "Lcom/bumptech/glide/load/DataSource;", "dataSource", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$c */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8547c implements le5<Drawable> {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42344a;

        /* renamed from: d */
        public final /* synthetic */ ra2 f42345d;

        public C8547c(SendToNftFragment sendToNftFragment, ra2 ra2) {
            this.f42344a = sendToNftFragment;
            this.f42345d = ra2;
        }

        /* renamed from: b */
        public static final void m67862b(SendToNftFragment sendToNftFragment, ra2 ra2) {
            byte[] bArr;
            vx2.m53591g(sendToNftFragment, "this$0");
            vx2.m53591g(ra2, "$this_run");
            if (sendToNftFragment.isVisible()) {
                me5 u = C1710a.m12225u(ra2.f33379i);
                String imageData = sendToNftFragment.mo58015U().getImageData();
                if (imageData != null) {
                    bArr = db6.m56792a(imageData);
                } else {
                    bArr = null;
                }
                u.mo23165z(bArr).mo11553K0(ra2.f33379i);
            }
        }

        /* renamed from: c */
        public boolean mo21096i(Drawable drawable, Object obj, pl6<Drawable> pl6, DataSource dataSource, boolean z) {
            return false;
        }

        /* renamed from: d */
        public boolean mo21092d(GlideException glideException, Object obj, pl6<Drawable> pl6, boolean z) {
            new Handler(Looper.getMainLooper()).post(new dv5(this.f42344a, this.f42345d));
            return true;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$d", "Lnet/safemoon/androidwallet/views/carousel/ContactCarouselView$b;", "", "isSelected", "", "position", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "contact", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$d */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8548d implements ContactCarouselView.C8947b {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42346a;

        public C8548d(SendToNftFragment sendToNftFragment) {
            this.f42346a = sendToNftFragment;
        }

        /* renamed from: a */
        public void mo57685a(boolean z, int i, IContact iContact) {
            vx2.m53591g(iContact, "contact");
            if (this.f42346a.f42339s != null) {
                C9639yg J = this.f42346a.f42339s;
                vx2.m53588d(J);
                if (J.mo67095e()) {
                    C9639yg J2 = this.f42346a.f42339s;
                    vx2.m53588d(J2);
                    J2.mo67094d();
                }
            }
            if (z) {
                this.f42346a.mo58019c0(iContact);
                return;
            }
            ContactViewModel F = this.f42346a.f42337k;
            if (F != null) {
                F.mo61107q();
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$e", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$e */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8549e implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42347a;

        public C8549e(SendToNftFragment sendToNftFragment) {
            this.f42347a = sendToNftFragment;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f42347a.mo58012R(charSequence);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$f", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$f */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8550f implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42348a;

        public C8550f(SendToNftFragment sendToNftFragment) {
            this.f42348a = sendToNftFragment;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f42348a.mo58011Q(charSequence);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/SendToNftFragment$g", "Lrn2;", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$g */
    /* compiled from: SendToNftFragment.kt */
    public static final class C8551g implements rn2 {

        /* renamed from: a */
        public final /* synthetic */ SendToNftFragment f42349a;

        public C8551g(SendToNftFragment sendToNftFragment) {
            this.f42349a = sendToNftFragment;
        }

        /* renamed from: a */
        public void mo57499a(IContact iContact) {
            LinearLayout linearLayout;
            AppCompatEditText appCompatEditText;
            RecyclerView recyclerView;
            AppCompatEditText appCompatEditText2;
            vx2.m53591g(iContact, "item");
            ra2 E = this.f42349a.f42336A;
            if (!(E == null || (appCompatEditText2 = E.f33376f) == null)) {
                appCompatEditText2.setText(iContact.getAddress());
            }
            ra2 E2 = this.f42349a.f42336A;
            if (E2 != null) {
                linearLayout = E2.f33381k;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ra2 E3 = this.f42349a.f42336A;
            if (E3 != null) {
                appCompatEditText = E3.f33376f;
            } else {
                appCompatEditText = null;
            }
            if (appCompatEditText != null) {
                appCompatEditText.setVisibility(0);
            }
            ra2 E4 = this.f42349a.f42336A;
            if (E4 != null) {
                recyclerView = E4.f33374d;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setAdapter((RecyclerView.Adapter) null);
            }
        }
    }

    public SendToNftFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new SendToNftFragment$special$$inlined$viewModels$default$2(new SendToNftFragment$special$$inlined$viewModels$default$1(this)));
        this.f42338r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MultiWalletViewModel.class), new SendToNftFragment$special$$inlined$viewModels$default$3(b), new SendToNftFragment$special$$inlined$viewModels$default$4((pc2) null, b), new SendToNftFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: Y */
    public static final void m67826Y(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m67827Z(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m67828a0(SendToNftFragment sendToNftFragment, IContact iContact) {
        ra2 ra2;
        AppCompatEditText appCompatEditText;
        vx2.m53591g(sendToNftFragment, "this$0");
        if (iContact != null && (ra2 = sendToNftFragment.f42336A) != null && (appCompatEditText = ra2.f33376f) != null) {
            appCompatEditText.setText(iContact.getAddress());
        }
    }

    /* renamed from: b0 */
    public static final void m67829b0(SendToNftFragment sendToNftFragment, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ra2 ra2;
        ScrollView scrollView;
        vx2.m53591g(sendToNftFragment, "this$0");
        if (sendToNftFragment.isVisible() && (ra2 = sendToNftFragment.f42336A) != null && (scrollView = ra2.f33380j) != null) {
            vx2.m53588d(ra2);
            scrollView.smoothScrollTo(0, ra2.f33380j.getBottom());
        }
    }

    /* renamed from: d0 */
    public static final void m67830d0(SendToNftFragment sendToNftFragment, View view) {
        vx2.m53591g(sendToNftFragment, "this$0");
        sendToNftFragment.mo50752i();
    }

    /* renamed from: e0 */
    public static final void m67831e0(SendToNftFragment sendToNftFragment, ra2 ra2, View view) {
        String str;
        String obj;
        vx2.m53591g(sendToNftFragment, "this$0");
        vx2.m53591g(ra2, "$this_run");
        if (a14.f36348a.mo50042b(sendToNftFragment.mo58016V(), String.valueOf(ra2.f33376f.getText()))) {
            String obj2 = ra2.f33376f.getEditableText().toString();
            Context requireContext = sendToNftFragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            Wallet c = ol0.m70351c(requireContext);
            if (c != null) {
                String address = c.getAddress(sendToNftFragment.mo58016V().getCoinType().getValue());
                if (address == null || (obj = StringsKt__StringsKt.m63090V0(address).toString()) == null) {
                    str = null;
                } else {
                    str = obj.toLowerCase(Locale.ROOT);
                    vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                String lowerCase = StringsKt__StringsKt.m63090V0(obj2).toString().toLowerCase(Locale.ROOT);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (vx2.m53586b(str, lowerCase)) {
                    new AlertDialog.Builder(sendToNftFragment.getContext()).setTitle(sendToNftFragment.getResources().getString(R.string.oops)).setMessage(sendToNftFragment.getResources().getString(R.string.cant_send_same_wallet)).setPositiveButton("Ok", new bv5()).show();
                } else {
                    sendToNftFragment.mo58022k0();
                }
            }
        } else {
            Context requireContext2 = sendToNftFragment.requireContext();
            vx2.m53590f(requireContext2, "requireContext()");
            ol0.m70325E(requireContext2);
            Context requireContext3 = sendToNftFragment.requireContext();
            vx2.m53590f(requireContext3, "requireContext()");
            ol0.m70345Y(requireContext3, R.string.send_to_invalid_address);
        }
    }

    /* renamed from: f0 */
    public static final void m67832f0(DialogInterface dialogInterface, int i) {
        vx2.m53591g(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* renamed from: g0 */
    public static final void m67833g0(SendToNftFragment sendToNftFragment, View view) {
        vx2.m53591g(sendToNftFragment, "this$0");
        j44 b = fv5.m57933b();
        vx2.m53590f(b, "actionSendtoNFTFragmentToManageContactsFragment()");
        sendToNftFragment.mo50753j(b);
        sendToNftFragment.mo58017W();
    }

    /* renamed from: h0 */
    public static final void m67834h0(SendToNftFragment sendToNftFragment, View view) {
        vx2.m53591g(sendToNftFragment, "this$0");
        sendToNftFragment.mo58014T().mo61257s(sendToNftFragment.mo58016V(), new SendToNftFragment$onViewCreated$2$7$1(sendToNftFragment));
    }

    /* renamed from: l0 */
    public static final void m67835l0(SendToNftFragment sendToNftFragment, View view) {
        vx2.m53591g(sendToNftFragment, "this$0");
        if (f06.m57513d(sendToNftFragment.requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication b = G2FAVerfication.C8289a.m66039b(G2FAVerfication.f41732v0, sendToNftFragment.mo58013S(), false, 2, (Object) null);
            FragmentManager childFragmentManager = sendToNftFragment.getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            b.mo57214K(childFragmentManager);
            return;
        }
        sendToNftFragment.mo58023n0();
    }

    /* renamed from: m0 */
    public static final void m67836m0(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3 == true) goto L_0x0011;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58011Q(java.lang.CharSequence r3) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0010
            int r3 = r3.length()
            if (r3 != 0) goto L_0x000c
            r3 = r0
            goto L_0x000d
        L_0x000c:
            r3 = r1
        L_0x000d:
            if (r3 != r0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x002a
            ra2 r3 = r2.f42336A
            if (r3 == 0) goto L_0x0040
            com.google.android.material.button.MaterialButton r3 = r3.f33373c
            if (r3 == 0) goto L_0x0040
            android.content.Context r0 = r2.requireContext()
            r1 = 2131099719(0x7f060047, float:1.78118E38)
            android.content.res.ColorStateList r0 = p000.zr0.m31441d(r0, r1)
            r3.setBackgroundTintList(r0)
            goto L_0x0040
        L_0x002a:
            ra2 r3 = r2.f42336A
            if (r3 == 0) goto L_0x0040
            com.google.android.material.button.MaterialButton r3 = r3.f33373c
            if (r3 == 0) goto L_0x0040
            android.content.Context r0 = r2.requireContext()
            r1 = 2131099754(0x7f06006a, float:1.781187E38)
            android.content.res.ColorStateList r0 = p000.zr0.m31441d(r0, r1)
            r3.setBackgroundTintList(r0)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment.mo58011Q(java.lang.CharSequence):void");
    }

    /* renamed from: R */
    public final void mo58012R(CharSequence charSequence) {
        RecyclerView recyclerView;
        ContactViewModel contactViewModel;
        List<IContact> l;
        LinearLayout linearLayout;
        boolean z;
        ra2 ra2 = this.f42336A;
        boolean z2 = false;
        if (!(ra2 == null || (linearLayout = ra2.f33381k) == null)) {
            if (linearLayout.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            }
        }
        if (!z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("keyword : ");
            sb.append(charSequence);
            ArrayList arrayList = new ArrayList();
            if (!(charSequence == null || (contactViewModel = this.f42337k) == null || (l = contactViewModel.mo61102l()) == null)) {
                for (IContact iContact : l) {
                    if (StringsKt__StringsKt.m63077P(iContact.getAddress(), charSequence, true) || StringsKt__StringsKt.m63077P(iContact.getName(), charSequence, true)) {
                        arrayList.add(iContact);
                    }
                }
            }
            ra2 ra22 = this.f42336A;
            if (ra22 != null) {
                recyclerView = ra22.f33374d;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setAdapter(new ir0(arrayList, new C8545a(this)));
            }
        }
    }

    /* renamed from: S */
    public final G2FAVerfication.C8290b mo58013S() {
        return new C8546b(this);
    }

    /* renamed from: T */
    public final MultiWalletViewModel mo58014T() {
        return (MultiWalletViewModel) this.f42338r.getValue();
    }

    /* renamed from: U */
    public final NFTData mo58015U() {
        return (NFTData) this.f42340x.getValue();
    }

    /* renamed from: V */
    public final TokenType mo58016V() {
        return (TokenType) this.f42341y.getValue();
    }

    /* renamed from: W */
    public final void mo58017W() {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        ra2 ra2 = this.f42336A;
        AppCompatEditText appCompatEditText = null;
        if (ra2 != null) {
            recyclerView = ra2.f33374d;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setAdapter((RecyclerView.Adapter) null);
        }
        ra2 ra22 = this.f42336A;
        if (ra22 != null) {
            linearLayout = ra22.f33381k;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ra2 ra23 = this.f42336A;
        if (ra23 != null) {
            appCompatEditText = ra23.f33376f;
        }
        if (appCompatEditText != null) {
            appCompatEditText.setVisibility(0);
        }
    }

    /* renamed from: X */
    public final void mo58018X() {
        ContactViewModel contactViewModel = this.f42337k;
        if (contactViewModel != null) {
            vx2.m53588d(contactViewModel);
            contactViewModel.mo61098h().observe(getViewLifecycleOwner(), new yu5(new SendToNftFragment$observe$1(this)));
            ContactViewModel contactViewModel2 = this.f42337k;
            vx2.m53588d(contactViewModel2);
            contactViewModel2.mo61100j().observe(getViewLifecycleOwner(), new zu5(new SendToNftFragment$observe$2(this)));
            ContactViewModel contactViewModel3 = this.f42337k;
            vx2.m53588d(contactViewModel3);
            contactViewModel3.mo61104n().observe(getViewLifecycleOwner(), new av5(this));
        }
    }

    /* renamed from: c0 */
    public final void mo58019c0(IContact iContact) {
        ContactViewModel contactViewModel = this.f42337k;
        if (contactViewModel != null) {
            contactViewModel.mo61109s(iContact);
        }
        mo58017W();
    }

    /* renamed from: i0 */
    public final void mo58020i0() {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        ra2 ra2 = this.f42336A;
        AppCompatEditText appCompatEditText = null;
        if (ra2 != null) {
            recyclerView = ra2.f33374d;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setAdapter((RecyclerView.Adapter) null);
        }
        ra2 ra22 = this.f42336A;
        if (ra22 != null) {
            linearLayout = ra22.f33381k;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ra2 ra23 = this.f42336A;
        if (ra23 != null) {
            appCompatEditText = ra23.f33376f;
        }
        if (appCompatEditText != null) {
            appCompatEditText.setVisibility(0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58021j0() {
        /*
            r4 = this;
            ra2 r0 = r4.f42336A
            r1 = 0
            if (r0 == 0) goto L_0x000e
            androidx.recyclerview.widget.RecyclerView r0 = r0.f33374d
            if (r0 == 0) goto L_0x000e
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x003d
            ra2 r0 = r4.f42336A
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView r0 = r0.f33374d
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r0.setAdapter(r1)
        L_0x0022:
            ra2 r0 = r4.f42336A
            if (r0 == 0) goto L_0x0029
            android.widget.LinearLayout r0 = r0.f33381k
            goto L_0x002a
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 != 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r0.setVisibility(r2)
        L_0x0030:
            ra2 r0 = r4.f42336A
            if (r0 == 0) goto L_0x0036
            androidx.appcompat.widget.AppCompatEditText r1 = r0.f33376f
        L_0x0036:
            if (r1 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r1.setVisibility(r3)
        L_0x003c:
            return
        L_0x003d:
            ra2 r0 = r4.f42336A
            if (r0 == 0) goto L_0x0044
            android.widget.LinearLayout r0 = r0.f33381k
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            if (r0 != 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r0.setVisibility(r3)
        L_0x004b:
            ra2 r0 = r4.f42336A
            if (r0 == 0) goto L_0x0052
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f33376f
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            if (r0 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r0.setVisibility(r2)
        L_0x0059:
            ra2 r0 = r4.f42336A
            if (r0 == 0) goto L_0x0066
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f33382l
            if (r0 == 0) goto L_0x0066
            java.lang.String r2 = ""
            r0.setText(r2)
        L_0x0066:
            ra2 r0 = r4.f42336A
            if (r0 == 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView r0 = r0.f33374d
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            if (r0 != 0) goto L_0x0071
            goto L_0x0089
        L_0x0071:
            ir0 r2 = new ir0
            net.safemoon.androidwallet.viewmodels.ContactViewModel r3 = r4.f42337k
            if (r3 == 0) goto L_0x007b
            java.util.List r1 = r3.mo61102l()
        L_0x007b:
            p000.vx2.m53588d(r1)
            net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$g r3 = new net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment$g
            r3.<init>(r4)
            r2.<init>(r1, r3)
            r0.setAdapter(r2)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.SendToNftFragment.mo58021j0():void");
    }

    /* renamed from: k0 */
    public final void mo58022k0() {
        Editable editable;
        AppCompatEditText appCompatEditText;
        ra2 ra2 = this.f42336A;
        if (ra2 == null || (appCompatEditText = ra2.f33376f) == null) {
            editable = null;
        } else {
            editable = appCompatEditText.getEditableText();
        }
        String valueOf = String.valueOf(editable);
        FragmentActivity requireActivity = requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        C9001np.m69977r0(requireActivity, valueOf, new cv5(this), new tu5());
    }

    /* renamed from: n0 */
    public final void mo58023n0() {
        Editable editable;
        AppCompatEditText appCompatEditText;
        ra2 ra2 = this.f42336A;
        if (ra2 == null || (appCompatEditText = ra2.f33376f) == null) {
            editable = null;
        } else {
            editable = appCompatEditText.getEditableText();
        }
        String valueOf = String.valueOf(editable);
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        new AskAuthorizeProvider(requireContext, mo58053m()).mo60705a(new SendToNftFragment$transferNft$1(this, valueOf), SendToNftFragment$transferNft$2.INSTANCE);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        this.f42336A = ra2.m51006c(layoutInflater, viewGroup, false);
        this.f42337k = (ContactViewModel) new C0729l((hd7) this, (C0729l.C0733b) new MyViewModelFactory(new WeakReference(requireActivity()))).mo6421a(ContactViewModel.class);
        vx2.m53588d(viewGroup);
        viewGroup.addOnLayoutChangeListener(new su5(this));
        ra2 ra2 = this.f42336A;
        if (ra2 != null) {
            return ra2.mo47351b();
        }
        return null;
    }

    public void onDetach() {
        super.onDetach();
        this.f42336A = null;
    }

    public void onPause() {
        super.onPause();
        C9639yg ygVar = this.f42339s;
        if (ygVar != null) {
            vx2.m53588d(ygVar);
            if (ygVar.mo67095e()) {
                C9639yg ygVar2 = this.f42339s;
                vx2.m53588d(ygVar2);
                ygVar2.mo67094d();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Editable editable;
        AppCompatEditText appCompatEditText;
        AppCompatEditText appCompatEditText2;
        AppCompatEditText appCompatEditText3;
        ContactCarouselView contactCarouselView;
        b36 b36;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        ra2 ra2 = this.f42336A;
        if (!(ra2 == null || (b36 = ra2.f33383m) == null)) {
            b36.f21125c.setOnClickListener(new uu5(this));
            AppCompatTextView appCompatTextView = b36.f21127e;
            String string = getString(R.string.send);
            String name = mo58015U().getName();
            appCompatTextView.setText(string + " " + name);
        }
        ra2 ra22 = this.f42336A;
        if (ra22 != null) {
            id7 id7 = ra22.f33384n;
            vx2.m53590f(id7, "viewTilEndLayout");
            AppCompatEditText appCompatEditText4 = ra22.f33376f;
            vx2.m53590f(appCompatEditText4, "etContactAddress");
            tc7.m72262o(id7, appCompatEditText4, new SendToNftFragment$onViewCreated$2$1(this, ra22), new SendToNftFragment$onViewCreated$2$2(this), new SendToNftFragment$onViewCreated$2$3(this));
            C1710a.m12225u(ra22.f33379i).mo23164y(mo58015U().getImageUrl()).mo11555M0(new C8547c(this, ra22)).mo11553K0(ra22.f33379i);
            ra22.f33373c.setOnClickListener(new vu5(this, ra22));
            ra22.f33372b.setOnClickListener(new wu5(this));
            ra22.f33377g.setOnClickListener(new xu5(this));
        }
        ra2 ra23 = this.f42336A;
        if (!(ra23 == null || (contactCarouselView = ra23.f33375e) == null)) {
            contactCarouselView.setOnItemSelectedChangedListener(new C8548d(this));
        }
        ra2 ra24 = this.f42336A;
        if (!(ra24 == null || (appCompatEditText3 = ra24.f33382l) == null)) {
            appCompatEditText3.addTextChangedListener(new C8549e(this));
        }
        ra2 ra25 = this.f42336A;
        if (!(ra25 == null || (appCompatEditText2 = ra25.f33376f) == null)) {
            appCompatEditText2.addTextChangedListener(new C8550f(this));
        }
        ra2 ra26 = this.f42336A;
        if (ra26 == null || (appCompatEditText = ra26.f33376f) == null) {
            editable = null;
        } else {
            editable = appCompatEditText.getText();
        }
        mo58011Q(editable);
        mo58018X();
    }
}
