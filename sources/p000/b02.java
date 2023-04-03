package p000;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lb02;", "Lxn2;", "", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "fiats", "Lr37;", "b", "([Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;Lns0;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "a", "Lxz1;", "Lxz1;", "fiatDao", "<init>", "(Lxz1;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: b02 */
/* compiled from: FiatTokenDataSource.kt */
public final class b02 implements xn2 {

    /* renamed from: a */
    public final xz1 f36619a;

    public b02(xz1 xz1) {
        vx2.m53591g(xz1, "fiatDao");
        this.f36619a = xz1;
    }

    /* renamed from: a */
    public LiveData<List<RoomFiat>> mo50428a() {
        return this.f36619a.mo66987a();
    }

    /* renamed from: b */
    public Object mo50429b(Fiat[] fiatArr, ns0<? super r37> ns0) {
        for (Fiat fiat : fiatArr) {
            if (!this.f36619a.mo66991e(fiat.getSymbol())) {
                this.f36619a.mo66989c(new RoomFiat(fiat));
            } else {
                String name = fiat.getName();
                if (name != null) {
                    this.f36619a.mo66990d(fiat.getSymbol(), name);
                }
                Double rate = fiat.getRate();
                if (rate != null) {
                    this.f36619a.mo66988b(fiat.getSymbol(), rate.doubleValue());
                }
            }
        }
        return r37.f33317a;
    }
}
