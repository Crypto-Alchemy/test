package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.contact.room.RoomContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'J!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\u0013H'\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Ler0;", "", "Lnet/safemoon/androidwallet/model/contact/room/RoomContact;", "roomContact", "Lr37;", "b", "(Lnet/safemoon/androidwallet/model/contact/room/RoomContact;Lns0;)Ljava/lang/Object;", "", "id", "", "lastSent", "d", "", "linkId", "", "c", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "e", "delete", "Landroidx/lifecycle/LiveData;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: er0 */
/* compiled from: ContactDao.kt */
public interface er0 {
    /* renamed from: a */
    LiveData<List<RoomContact>> mo51526a();

    /* renamed from: b */
    Object mo51527b(RoomContact roomContact, ns0<? super r37> ns0);

    /* renamed from: c */
    Object mo51528c(String str, ns0<? super List<RoomContact>> ns0);

    /* renamed from: d */
    void mo51529d(int i, long j);

    void delete(String str);

    /* renamed from: e */
    void mo51531e(RoomContact roomContact);
}
