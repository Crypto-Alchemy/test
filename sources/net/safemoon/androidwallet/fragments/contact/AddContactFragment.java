package net.safemoon.androidwallet.fragments.contact;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C1710a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.contact.RequestContact;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.utils.StoragePermissionLauncher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u0014\u0010\u0018\u001a\u00020\n8\u0002XD¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00130\u00130\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/contact/AddContactFragment;", "Lnet/safemoon/androidwallet/fragments/contact/BaseContactFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "e0", "", "data", "U", "", "chainId", "S", "T", "onResume", "Z", "Lnet/safemoon/androidwallet/model/contact/RequestContact;", "it1", "s0", "A", "Ljava/lang/String;", "default_type", "Lk04;", "kotlin.jvm.PlatformType", "B", "Lk04;", "requestContact", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "C", "Ljava/util/List;", "currentAllContact", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AddContactFragment.kt */
public final class AddContactFragment extends BaseContactFragment {

    /* renamed from: A */
    public final String f42371A = "image/*";

    /* renamed from: B */
    public final k04<RequestContact> f42372B = new k04<>(new RequestContact());

    /* renamed from: C */
    public final List<IContact> f42373C = new ArrayList();

    /* renamed from: q0 */
    public static final void m67921q0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m67922r0(AddContactFragment addContactFragment, RequestContact requestContact) {
        boolean z;
        vx2.m53591g(addContactFragment, "this$0");
        if (requestContact != null) {
            b92 K = addContactFragment.mo58070K();
            String name = requestContact.getName();
            if (name != null) {
                if (name.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    name = null;
                }
                if (name != null) {
                    K.f21179e.setText(name);
                }
            }
            if (requestContact.getProfilePath() != null) {
                ((be5) ((be5) ((be5) C1710a.m12225u(addContactFragment.mo58070K().f21180f).mo23160u(requestContact.getProfilePath()).mo22582h0(R.drawable.contact_no_icon)).mo22591m(R.drawable.contact_no_icon)).mo22581g0(addContactFragment.mo58072M(), addContactFragment.mo58072M())).mo11567a(qe5.m25623x0()).mo11553K0(addContactFragment.mo58070K().f21180f);
            }
        }
    }

    /* renamed from: S */
    public void mo58059S(String str, int i) {
        HashMap<Integer, String> networks;
        HashMap<Integer, String> networks2;
        boolean z;
        vx2.m53591g(str, "data");
        if (i == 0) {
            List<TokenType> a = Common.f42577a.mo60896a(true);
            ArrayList<TokenType> arrayList = new ArrayList<>();
            for (T next : a) {
                if (((TokenType) next).getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (TokenType tokenType : arrayList) {
                RequestContact value = this.f42372B.getValue();
                if (!(value == null || (networks2 = value.getNetworks()) == null)) {
                    networks2.put(Integer.valueOf(tokenType.getChainId()), str);
                }
            }
            return;
        }
        RequestContact value2 = this.f42372B.getValue();
        if (value2 != null && (networks = value2.getNetworks()) != null) {
            networks.put(Integer.valueOf(i), str);
        }
    }

    /* renamed from: T */
    public void mo58060T() {
        StoragePermissionLauncher n = mo58054n();
        if (n != null) {
            ConstraintLayout constraintLayout = mo58070K().f21182h;
            vx2.m53590f(constraintLayout, "binding.mainLayout");
            n.mo60949c(constraintLayout, new AddContactFragment$onContactIconPressed$1(this), AddContactFragment$onContactIconPressed$2.INSTANCE);
        }
    }

    /* renamed from: U */
    public void mo58061U(String str) {
        vx2.m53591g(str, "data");
        RequestContact value = this.f42372B.getValue();
        if (value != null) {
            value.setName(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x005d A[SYNTHETIC] */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58062Z() {
        /*
            r17 = this;
            r0 = r17
            k04<net.safemoon.androidwallet.model.contact.RequestContact> r1 = r0.f42372B
            java.lang.Object r1 = r1.getValue()
            net.safemoon.androidwallet.model.contact.RequestContact r1 = (net.safemoon.androidwallet.model.contact.RequestContact) r1
            if (r1 == 0) goto L_0x013a
            net.safemoon.androidwallet.viewmodels.ContactViewModel r2 = r17.mo58071L()
            k04 r2 = r2.mo61103m()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0048
            java.lang.String r3 = "value"
            p000.vx2.m53590f(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.dk0.m43495u(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0030:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r2.next()
            net.safemoon.androidwallet.common.TokenType r4 = (net.safemoon.androidwallet.common.TokenType) r4
            int r4 = r4.getChainId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L_0x0030
        L_0x0048:
            java.util.List r3 = p000.ck0.m33062j()
        L_0x004c:
            java.util.HashMap r2 = r1.getNetworks()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x005d:
            boolean r5 = r2.hasNext()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getKey()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            boolean r9 = r3 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0081
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L_0x0081
        L_0x007f:
            r6 = r7
            goto L_0x009c
        L_0x0081:
            java.util.Iterator r9 = r3.iterator()
        L_0x0085:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x007f
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r8 != r10) goto L_0x0099
            r10 = r6
            goto L_0x009a
        L_0x0099:
            r10 = r7
        L_0x009a:
            if (r10 == 0) goto L_0x0085
        L_0x009c:
            if (r6 == 0) goto L_0x005d
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            r4.put(r6, r5)
            goto L_0x005d
        L_0x00aa:
            r1.setNetworks(r4)
            java.util.List<net.safemoon.androidwallet.model.contact.abstraction.IContact> r2 = r0.f42373C
            java.util.Iterator r2 = r2.iterator()
        L_0x00b3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0106
            java.lang.Object r3 = r2.next()
            r4 = r3
            net.safemoon.androidwallet.model.contact.abstraction.IContact r4 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r4
            java.util.HashMap r5 = r1.getNetworks()
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x00cc
        L_0x00ca:
            r4 = r7
            goto L_0x0103
        L_0x00cc:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00d4:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00ca
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.String r9 = r4.getAddress()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r11 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r9, r11)
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.toLowerCase(r10)
            p000.vx2.m53590f(r8, r11)
            boolean r8 = p000.vx2.m53586b(r9, r8)
            if (r8 == 0) goto L_0x00d4
            r4 = r6
        L_0x0103:
            if (r4 == 0) goto L_0x00b3
            goto L_0x0107
        L_0x0106:
            r3 = 0
        L_0x0107:
            net.safemoon.androidwallet.model.contact.abstraction.IContact r3 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r3
            if (r3 == 0) goto L_0x0137
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            androidx.fragment.app.FragmentActivity r1 = r17.requireActivity()
            r4.<init>(r1)
            r5 = 0
            java.lang.String r6 = r3.getAddress()
            r7 = 0
            r1 = 2131951983(0x7f13016f, float:1.9540396E38)
            java.lang.String r8 = r0.getString(r1)
            r9 = 0
            r1 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r11 = 0
            r12 = 0
            net.safemoon.androidwallet.fragments.contact.AddContactFragment$save$1$2 r13 = net.safemoon.androidwallet.fragments.contact.AddContactFragment$save$1$2.INSTANCE
            net.safemoon.androidwallet.fragments.contact.AddContactFragment$save$1$3 r14 = net.safemoon.androidwallet.fragments.contact.AddContactFragment$save$1$3.INSTANCE
            r15 = 392(0x188, float:5.5E-43)
            r16 = 0
            p000.C9001np.m69934S(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x013a
        L_0x0137:
            r0.mo58064s0(r1)
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.contact.AddContactFragment.mo58062Z():void");
    }

    /* renamed from: e0 */
    public void mo58063e0() {
        mo58070K().f21186l.f34320f.setText(getText(R.string.add_contact_screen_title));
        AppCompatImageView appCompatImageView = mo58070K().f21186l.f34317c;
        vx2.m53590f(appCompatImageView, "binding.toolbar.ivToolbarAction");
        appCompatImageView.setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TokenType e = mo58071L().mo61095e();
        k04<List<TokenType>> m = mo58071L().mo61103m();
        if (e == TokenType.MULTI_COIN) {
            e = TokenType.MULTI_COIN_BITCOIN;
        }
        m.postValue(bk0.m32598e(e));
    }

    public void onResume() {
        super.onResume();
        a77.m55424b(requireActivity(), Boolean.FALSE);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo58071L().mo61100j().observe(getViewLifecycleOwner(), new C7931nb(new AddContactFragment$onViewCreated$1(this)));
        k04<RequestContact> k04 = this.f42372B;
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        pi3.m71013a(k04, viewLifecycleOwner, new C9015ob(this));
    }

    /* renamed from: s0 */
    public final void mo58064s0(RequestContact requestContact) {
        Collection collection;
        List<TokenType> value = mo58071L().mo61103m().getValue();
        if (value != null) {
            collection = new ArrayList(dk0.m43495u(value, 10));
            for (TokenType chainId : value) {
                collection.add(Integer.valueOf(chainId.getChainId()));
            }
        } else {
            collection = ck0.m33062j();
        }
        if (!collection.isEmpty()) {
            mo58071L().mo61108r(requestContact, new AddContactFragment$save$2(this));
            return;
        }
        Context context = getContext();
        if (context != null) {
            ol0.m70345Y(context, R.string.select_one_chain);
        }
    }
}
