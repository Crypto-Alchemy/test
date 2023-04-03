package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.contact.room.RoomContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006J\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0013H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo44877d2 = {"Lgr0;", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "contact", "Lr37;", "e", "(Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;Lns0;)Ljava/lang/Object;", "", "_id", "f", "(ILns0;)Ljava/lang/Object;", "b", "", "linkId", "a", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "Lnet/safemoon/androidwallet/model/contact/room/RoomContact;", "c", "Landroidx/lifecycle/LiveData;", "d", "Ler0;", "Ler0;", "dao", "<init>", "(Ler0;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gr0 */
/* compiled from: ContactDataSource.kt */
public final class gr0 {

    /* renamed from: a */
    public final er0 f38060a;

    public gr0(er0 er0) {
        vx2.m53591g(er0, "dao");
        this.f38060a = er0;
    }

    /* renamed from: a */
    public Object mo51972a(String str, ns0<? super r37> ns0) {
        this.f38060a.delete(str);
        return r37.f33317a;
    }

    /* renamed from: b */
    public Object mo51973b(IContact iContact, ns0<? super r37> ns0) {
        this.f38060a.mo51531e(new RoomContact(iContact));
        return r37.f33317a;
    }

    /* renamed from: c */
    public Object mo51974c(String str, ns0<? super List<RoomContact>> ns0) {
        return this.f38060a.mo51528c(str, ns0);
    }

    /* renamed from: d */
    public LiveData<List<RoomContact>> mo51975d() {
        return this.f38060a.mo51526a();
    }

    /* renamed from: e */
    public Object mo51976e(IContact iContact, ns0<? super r37> ns0) {
        Object b = this.f38060a.mo51527b(new RoomContact(iContact), ns0);
        if (b == wx2.m54101d()) {
            return b;
        }
        return r37.f33317a;
    }

    /* renamed from: f */
    public Object mo51977f(int i, ns0<? super r37> ns0) {
        this.f38060a.mo51529d(i, System.currentTimeMillis());
        return r37.f33317a;
    }
}
