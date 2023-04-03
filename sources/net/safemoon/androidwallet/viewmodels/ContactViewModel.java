package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.contact.RequestContact;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.contact.room.RoomContact;
import net.safemoon.androidwallet.model.swap.TransferFee;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b;\u0010<J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\bJ\u001c\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0016J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018J\u001c\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0016J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00108\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R%\u00100\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0\u00108\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b/\u0010+R#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000502018\u0006¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b4\u00105R1\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 .*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b7\u0010+¨\u0006="}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/common/TokenType;", "e", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "l", "contact", "Lr37;", "s", "q", "tokenType", "p", "t", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "displayToken", "Lk04;", "Lnet/safemoon/androidwallet/model/swap/TransferFee;", "callBack", "o", "Lnet/safemoon/androidwallet/model/contact/RequestContact;", "requestContact", "Lkotlin/Function0;", "r", "", "profilePath", "g", "editContact", "f", "k", "Lgr0;", "b", "Lgr0;", "i", "()Lgr0;", "contactDataSource", "Lao2;", "c", "Lao2;", "getConcatCarouselDataUseCase", "d", "Lk04;", "n", "()Lk04;", "selectedContact", "Ldr0;", "kotlin.jvm.PlatformType", "h", "contactCarouselViewData", "Lls3;", "", "Lls3;", "j", "()Lls3;", "contactList", "m", "selectedChains", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lgr0;Lao2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ContactViewModel.kt */
public final class ContactViewModel extends C3552wj {

    /* renamed from: b */
    public final gr0 f42661b;

    /* renamed from: c */
    public final ao2 f42662c;

    /* renamed from: d */
    public final k04<IContact> f42663d = new k04<>();

    /* renamed from: e */
    public final k04<dr0> f42664e = new k04<>(new dr0(0, ck0.m33062j()));

    /* renamed from: f */
    public final ls3<List<IContact>> f42665f;

    /* renamed from: g */
    public final k04<List<TokenType>> f42666g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactViewModel(Application application, gr0 gr0, ao2 ao2) {
        super(application);
        vx2.m53591g(application, "application");
        vx2.m53591g(gr0, "contactDataSource");
        vx2.m53591g(ao2, "getConcatCarouselDataUseCase");
        this.f42661b = gr0;
        this.f42662c = ao2;
        ls3<List<IContact>> ls3 = new ls3<>();
        new ArrayList();
        this.f42665f = ls3;
        this.f42666g = new k04<>(ck0.m33062j());
        LiveData<X> a = qw6.m25941a(gr0.mo51975d());
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        ls3.mo22951a(a, new mr0(new rc2<List<? extends RoomContact>, r37>(this) {
            public final /* synthetic */ ContactViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<RoomContact>) (List) obj);
                return r37.f33317a;
            }

            public final void invoke(List<RoomContact> list) {
                if (list != null) {
                    ls3<List<IContact>> j = this.this$0.mo61100j();
                    ArrayList arrayList = new ArrayList();
                    for (RoomContact contactViewModel$1$1$1$1$1 : list) {
                        arrayList.add(new ContactViewModel$1$1$1$1$1(contactViewModel$1$1$1$1$1));
                    }
                    j.postValue(arrayList);
                }
            }
        }));
    }

    /* renamed from: d */
    public static final void m68508d(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: e */
    public final TokenType mo61095e() {
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication<Application>()");
        return ol0.m70355e(b);
    }

    /* renamed from: f */
    public final void mo61096f(IContact iContact, pc2<r37> pc2) {
        vx2.m53591g(iContact, "editContact");
        vx2.m53591g(pc2, "callBack");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new ContactViewModel$deleteContact$1(this, iContact, pc2, (ns0<? super ContactViewModel$deleteContact$1>) null), 3, (Object) null);
    }

    /* renamed from: g */
    public final List<IContact> mo61097g(RequestContact requestContact, String str) {
        vx2.m53591g(requestContact, "requestContact");
        vx2.m53591g(str, "profilePath");
        HashMap<Integer, String> networks = requestContact.getNetworks();
        ArrayList arrayList = new ArrayList(networks.size());
        for (Map.Entry<Integer, String> contactViewModel$getContact$1$1 : networks.entrySet()) {
            arrayList.add(new ContactViewModel$getContact$1$1(requestContact, contactViewModel$getContact$1$1, str));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final k04<dr0> mo61098h() {
        return this.f42664e;
    }

    /* renamed from: i */
    public final gr0 mo61099i() {
        return this.f42661b;
    }

    /* renamed from: j */
    public final ls3<List<IContact>> mo61100j() {
        return this.f42665f;
    }

    /* renamed from: k */
    public final List<IContact> mo61101k(TokenType tokenType) {
        boolean z;
        List value = this.f42665f.getValue();
        if (value == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : value) {
            if (((IContact) next).getChainAddress() == tokenType.getChainId()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final List<IContact> mo61102l() {
        List value = this.f42665f.getValue();
        if (value == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : value) {
            if (hashSet.add(String.valueOf(((IContact) next).getLinkId()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public final k04<List<TokenType>> mo61103m() {
        return this.f42666g;
    }

    /* renamed from: n */
    public final k04<IContact> mo61104n() {
        return this.f42663d;
    }

    /* renamed from: o */
    public final void mo61105o(UserTokenItemDisplayModel userTokenItemDisplayModel, k04<TransferFee> k04) {
        vx2.m53591g(userTokenItemDisplayModel, "displayToken");
        vx2.m53591g(k04, "callBack");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new ContactViewModel$getTransferFee$1(userTokenItemDisplayModel, k04, (ns0<? super ContactViewModel$getTransferFee$1>) null), 3, (Object) null);
    }

    /* renamed from: p */
    public final void mo61106p(TokenType tokenType) {
        vx2.m53591g(tokenType, "tokenType");
        k04<dr0> k04 = this.f42664e;
        ao2 ao2 = this.f42662c;
        List<IContact> k = mo61101k(tokenType);
        if (k == null) {
            k = ck0.m33062j();
        }
        k04.setValue(ao2.mo50272a(k));
    }

    /* renamed from: q */
    public final void mo61107q() {
        this.f42663d.setValue(null);
    }

    /* renamed from: r */
    public final void mo61108r(RequestContact requestContact, pc2<r37> pc2) {
        vx2.m53591g(requestContact, "requestContact");
        vx2.m53591g(pc2, "callBack");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new ContactViewModel$saveContact$1(requestContact, this, pc2, (ns0<? super ContactViewModel$saveContact$1>) null), 3, (Object) null);
    }

    /* renamed from: s */
    public final void mo61109s(IContact iContact) {
        vx2.m53591g(iContact, "contact");
        this.f42663d.setValue(iContact);
    }

    /* renamed from: t */
    public final void mo61110t() {
        if (this.f42663d.getValue() != null) {
            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new ContactViewModel$updateRecentContact$1(this, (ns0<? super ContactViewModel$updateRecentContact$1>) null), 3, (Object) null);
        }
    }
}
