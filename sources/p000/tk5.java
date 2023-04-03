package p000;

import net.safemoon.androidwallet.model.DeviceModel;
import net.safemoon.androidwallet.model.FCMNotification;
import net.safemoon.androidwallet.model.NotificationRead;
import net.safemoon.androidwallet.model.SingleFCMRegister;
import net.safemoon.androidwallet.model.UpdateFCMToken;
import net.safemoon.androidwallet.model.notificationHistory.NotificationDeleteRequest;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistory;
import net.safemoon.androidwallet.model.notificationHistory.NotificationMarkReadRequest;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenData;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData;
import net.safemoon.androidwallet.model.request.EvmRequestTransaction;
import net.safemoon.androidwallet.model.request.RequestTransaction;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetails;
import okhttp3.ResponseBody;

/* renamed from: tk5 */
/* compiled from: SafemoonAPIInterface */
public interface tk5 {
    @le2("/api/notification/list")
    /* renamed from: a */
    k90<NotificationHistory> mo66082a(@nl2("lang") String str, @sz4("addresses") String str2, @sz4("limit") Integer num, @sz4("offset") Integer num2);

    @le2("/api/v2/bsc/transaction/{transactionHash}")
    /* renamed from: b */
    k90<TransactionDetails> mo66083b(@sm4("transactionHash") String str);

    @le2("/api/notification/price-alert")
    /* renamed from: c */
    k90<PriceAlertTokenListData> mo66084c(@sz4("walletAddress") String str, @sz4("tokenAddress") String str2, @sz4("tokenSymbol") String str3, @sz4("fcmToken") String str4);

    @pk2(hasBody = true, method = "DELETE", path = "/api/notification/price-alert/delete")
    /* renamed from: d */
    k90<PriceAlertTokenData> mo66085d(@p30 PriceAlertToken priceAlertToken);

    @dk4("/api/notification/{notificationId}/read")
    /* renamed from: e */
    k90<NotificationRead> mo66086e(@sm4("notificationId") String str);

    @ak4("/api/notification/price-alert/create")
    /* renamed from: f */
    k90<PriceAlertTokenData> mo66087f(@p30 PriceAlertToken priceAlertToken);

    @dk4("/api/notification/v2/read-notifications")
    /* renamed from: g */
    k90<ResponseBody> mo66088g(@p30 NotificationMarkReadRequest notificationMarkReadRequest);

    @dk4("/api/notification/v2/delete-notifications")
    /* renamed from: h */
    k90<ResponseBody> mo66089h(@p30 NotificationDeleteRequest notificationDeleteRequest);

    @ak4("/api/v6/bsc/transaction")
    /* renamed from: i */
    k90<Object> mo66090i(@p30 RequestTransaction requestTransaction);

    @ak4("/api/v6/bsc/transaction")
    /* renamed from: j */
    k90<Object> mo66091j(@p30 EvmRequestTransaction evmRequestTransaction);

    @ak4("/api/v2/device")
    /* renamed from: k */
    k90<DeviceModel> mo66092k(@p30 SingleFCMRegister singleFCMRegister);

    @pk2(hasBody = true, method = "DELETE", path = "/api/notification/price-alert/delete-all")
    /* renamed from: l */
    k90<PriceAlertTokenData> mo66093l(@p30 PriceAlertToken priceAlertToken);

    @ak4("/api/v2/device/update")
    /* renamed from: m */
    k90<DeviceModel> mo66094m(@p30 FCMNotification fCMNotification);

    @dk4("/api/notification/price-alert/update")
    /* renamed from: n */
    k90<PriceAlertTokenData> mo66095n(@p30 PriceAlertToken priceAlertToken);

    @ak4("/api/v2/device/update-fcmtoken")
    /* renamed from: o */
    k90<DeviceModel> mo66096o(@p30 UpdateFCMToken updateFCMToken);
}
