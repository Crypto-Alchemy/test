package p000;

import com.walletconnect.foundation.network.model.RelayDTO;
import com.walletconnect.foundation.network.model.RelayDTO$Subscription$Result$Acknowledgement;
import kotlin.Metadata;
import p000.yj7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002H'J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0016H'J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H'J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H'J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H'¨\u0006\u001f"}, mo44877d2 = {"Lic5;", "", "Lz42;", "Lyj7$a;", "g", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request;", "publishRequest", "Lr37;", "j", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result$Acknowledgement;", "l", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result$JsonRpcError;", "h", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request;", "subscribeRequest", "a", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result$Acknowledgement;", "f", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result$JsonRpcError;", "b", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request;", "k", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$Acknowledgement;", "c", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request;", "unsubscribeRequest", "i", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result$Acknowledgement;", "e", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result$JsonRpcError;", "d", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ic5 */
/* compiled from: RelayService.kt */
public interface ic5 {
    @hu5
    /* renamed from: a */
    void mo43550a(RelayDTO.Subscribe.Request request);

    @y75
    /* renamed from: b */
    z42<RelayDTO.Subscribe.Result.JsonRpcError> mo43551b();

    @hu5
    /* renamed from: c */
    void mo43552c(RelayDTO$Subscription$Result$Acknowledgement relayDTO$Subscription$Result$Acknowledgement);

    @y75
    /* renamed from: d */
    z42<RelayDTO.Unsubscribe.Result.JsonRpcError> mo43553d();

    @y75
    /* renamed from: e */
    z42<RelayDTO.Unsubscribe.Result.Acknowledgement> mo43554e();

    @y75
    /* renamed from: f */
    z42<RelayDTO.Subscribe.Result.Acknowledgement> mo43555f();

    @y75
    /* renamed from: g */
    z42<yj7.C6739a> mo43556g();

    @y75
    /* renamed from: h */
    z42<RelayDTO.Publish.Result.JsonRpcError> mo43557h();

    @hu5
    /* renamed from: i */
    void mo43558i(RelayDTO.Unsubscribe.Request request);

    @hu5
    /* renamed from: j */
    void mo43559j(RelayDTO.Publish.Request request);

    @y75
    /* renamed from: k */
    z42<RelayDTO.Subscription.Request> mo43560k();

    @y75
    /* renamed from: l */
    z42<RelayDTO.Publish.Result.Acknowledgement> mo43561l();
}
