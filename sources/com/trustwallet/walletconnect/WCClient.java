package com.trustwallet.walletconnect;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException;
import com.trustwallet.walletconnect.extensions.StringKt;
import com.trustwallet.walletconnect.jsonrpc.JsonRpcError;
import com.trustwallet.walletconnect.jsonrpc.JsonRpcErrorResponse;
import com.trustwallet.walletconnect.jsonrpc.JsonRpcRequest;
import com.trustwallet.walletconnect.jsonrpc.JsonRpcResponse;
import com.trustwallet.walletconnect.models.MessageType;
import com.trustwallet.walletconnect.models.WCMethod;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import com.trustwallet.walletconnect.models.WCSignTransaction;
import com.trustwallet.walletconnect.models.WCSocketMessage;
import com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrder;
import com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrder;
import com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder;
import com.trustwallet.walletconnect.models.binance.WCBinanceTxConfirmParam;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import com.trustwallet.walletconnect.models.session.WCApproveSessionResponse;
import com.trustwallet.walletconnect.models.session.WCSession;
import com.trustwallet.walletconnect.models.session.WCSessionUpdate;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0001\u001a\u00030\u0001\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010!\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0016J \u0010$\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002H\u0016J,\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002J\u001c\u0010/\u001a\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010.\u001a\u00020\u001eJ5\u00101\u001a\u00020\u00072\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020\u0002J\u0006\u00105\u001a\u00020\u0007J#\u00107\u001a\u00020\u0007\"\u0004\b\u0000\u001062\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0002J\u0006\u0010:\u001a\u00020\u0007J\u000e\u0010<\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u0001J\u000e\u0010=\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u0001R\u0014\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010E\u001a\n D*\u0004\u0018\u00010C0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00010I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010L\u001a\u0004\u0018\u00010%8\u0006@BX\u000e¢\u0006\f\n\u0004\b&\u0010M\u001a\u0004\bN\u0010OR(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010L\u001a\u0004\u0018\u00010'8\u0006@BX\u000e¢\u0006\f\n\u0004\b(\u0010P\u001a\u0004\bQ\u0010RR(\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bS\u0010TR(\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bU\u0010TR(\u0010.\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b.\u0010B\u001a\u0004\bV\u0010TR$\u0010W\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u00078\u0006@BX\u000e¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bW\u0010YR\u0016\u0010Z\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\\8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR4\u0010c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR4\u0010i\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010d\u001a\u0004\bj\u0010f\"\u0004\bk\u0010hR4\u0010m\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bm\u0010d\u001a\u0004\bn\u0010f\"\u0004\bo\u0010hR4\u0010q\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bq\u0010d\u001a\u0004\br\u0010f\"\u0004\bs\u0010hR4\u0010t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bt\u0010d\u001a\u0004\bu\u0010f\"\u0004\bv\u0010hR4\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bw\u0010d\u001a\u0004\bx\u0010f\"\u0004\by\u0010hR4\u0010{\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b{\u0010d\u001a\u0004\b|\u0010f\"\u0004\b}\u0010hR6\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b\u0010d\u001a\u0005\b\u0001\u0010f\"\u0005\b\u0001\u0010hR9\u0010\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010d\u001a\u0005\b\u0001\u0010f\"\u0005\b\u0001\u0010hR9\u0010\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010d\u001a\u0005\b\u0001\u0010f\"\u0005\b\u0001\u0010hR2\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\\8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010]\u001a\u0005\b\u0001\u0010_\"\u0005\b\u0001\u0010aR9\u0010\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\n0b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010d\u001a\u0005\b\u0001\u0010f\"\u0005\b\u0001\u0010h¨\u0006\u0001"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/WCClient;", "Lokhttp3/WebSocketListener;", "", "text", "decryptMessage", "", "id", "", "invalidParams", "payload", "Lr37;", "handleMessage", "Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcRequest;", "Lcom/google/gson/JsonArray;", "request", "handleRequest", "topic", "subscribe", "result", "encryptAndSend", "resetState", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "onOpen", "onMessage", "", "t", "onFailure", "", "code", "reason", "onClosed", "Lokio/ByteString;", "bytes", "onClosing", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "session", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "peerMeta", "peerId", "remotePeerId", "connect", "", "accounts", "chainId", "approveSession", "approved", "updateSession", "(Ljava/util/List;Ljava/lang/Integer;Z)Z", "message", "rejectSession", "killSession", "T", "approveRequest", "(JLjava/lang/Object;)Z", "rejectRequest", "disconnect", "listener", "addSocketListener", "removeSocketListener", "Lokhttp3/OkHttpClient;", "httpClient", "Lokhttp3/OkHttpClient;", "TAG", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "socket", "Lokhttp3/WebSocket;", "", "listeners", "Ljava/util/Set;", "<set-?>", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "getSession", "()Lcom/trustwallet/walletconnect/models/session/WCSession;", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "getPeerMeta", "()Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "getPeerId", "()Ljava/lang/String;", "getRemotePeerId", "getChainId", "isConnected", "Z", "()Z", "handshakeId", "J", "Lkotlin/Function1;", "Lrc2;", "getOnFailure", "()Lrc2;", "setOnFailure", "(Lrc2;)V", "Lkotlin/Function2;", "onDisconnect", "Lfd2;", "getOnDisconnect", "()Lfd2;", "setOnDisconnect", "(Lfd2;)V", "onSessionRequest", "getOnSessionRequest", "setOnSessionRequest", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "onEthSign", "getOnEthSign", "setOnEthSign", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "onEthSignTransaction", "getOnEthSignTransaction", "setOnEthSignTransaction", "onEthSendTransaction", "getOnEthSendTransaction", "setOnEthSendTransaction", "onCustomRequest", "getOnCustomRequest", "setOnCustomRequest", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradeOrder;", "onBnbTrade", "getOnBnbTrade", "setOnBnbTrade", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceCancelOrder;", "onBnbCancel", "getOnBnbCancel", "setOnBnbCancel", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder;", "onBnbTransfer", "getOnBnbTransfer", "setOnBnbTransfer", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTxConfirmParam;", "onBnbTxConfirm", "getOnBnbTxConfirm", "setOnBnbTxConfirm", "onGetAccounts", "getOnGetAccounts", "setOnGetAccounts", "Lcom/trustwallet/walletconnect/models/WCSignTransaction;", "onSignTransaction", "getOnSignTransaction", "setOnSignTransaction", "Lcom/google/gson/GsonBuilder;", "builder", "<init>", "(Lcom/google/gson/GsonBuilder;Lokhttp3/OkHttpClient;)V", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WCClient.kt */
public class WCClient extends WebSocketListener {
    private final String TAG;
    private String chainId;
    private final Gson gson;
    private long handshakeId;
    private final OkHttpClient httpClient;
    private boolean isConnected;
    private final Set<WebSocketListener> listeners;
    private fd2<? super Long, ? super WCBinanceCancelOrder, r37> onBnbCancel;
    private fd2<? super Long, ? super WCBinanceTradeOrder, r37> onBnbTrade;
    private fd2<? super Long, ? super WCBinanceTransferOrder, r37> onBnbTransfer;
    private fd2<? super Long, ? super WCBinanceTxConfirmParam, r37> onBnbTxConfirm;
    private fd2<? super Long, ? super String, r37> onCustomRequest;
    private fd2<? super Integer, ? super String, r37> onDisconnect;
    private fd2<? super Long, ? super WCEthereumTransaction, r37> onEthSendTransaction;
    private fd2<? super Long, ? super WCEthereumSignMessage, r37> onEthSign;
    private fd2<? super Long, ? super WCEthereumTransaction, r37> onEthSignTransaction;
    private rc2<? super Throwable, r37> onFailure;
    private rc2<? super Long, r37> onGetAccounts;
    private fd2<? super Long, ? super WCPeerMeta, r37> onSessionRequest;
    private fd2<? super Long, ? super WCSignTransaction, r37> onSignTransaction;
    private String peerId;
    private WCPeerMeta peerMeta;
    private String remotePeerId;
    private WCSession session;
    private WebSocket socket;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCClient.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.trustwallet.walletconnect.models.WCMethod[] r0 = com.trustwallet.walletconnect.models.WCMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.SESSION_REQUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.SESSION_UPDATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.ETH_SIGN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.ETH_PERSONAL_SIGN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.ETH_SIGN_TYPE_DATA     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.ETH_SIGN_TYPE_DATA_V4     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.ETH_SIGN_TRANSACTION     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.ETH_SEND_TRANSACTION     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.BNB_SIGN     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.BNB_TRANSACTION_CONFIRM     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.GET_ACCOUNTS     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.trustwallet.walletconnect.models.WCMethod r1 = com.trustwallet.walletconnect.models.WCMethod.SIGN_TRANSACTION     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.trustwallet.walletconnect.WCClient.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WCClient(GsonBuilder gsonBuilder, OkHttpClient okHttpClient, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GsonBuilder() : gsonBuilder, okHttpClient);
    }

    public static /* synthetic */ void connect$default(WCClient wCClient, WCSession wCSession, WCPeerMeta wCPeerMeta, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str = UUID.randomUUID().toString();
                vx2.m53590f(str, "randomUUID().toString()");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            wCClient.connect(wCSession, wCPeerMeta, str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String decryptMessage(java.lang.String r8) {
        /*
            r7 = this;
            com.google.gson.Gson r0 = r7.gson
            java.lang.String r1 = "gson"
            p000.vx2.m53590f(r0, r1)
            com.trustwallet.walletconnect.WCClient$decryptMessage$$inlined$fromJson$1 r2 = new com.trustwallet.walletconnect.WCClient$decryptMessage$$inlined$fromJson$1
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.String r3 = "object : TypeToken<T>() {} .type"
            p000.vx2.m53587c(r2, r3)
            boolean r4 = r2 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r5 = "type.rawType"
            if (r4 == 0) goto L_0x002c
            r4 = r2
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x002c
            java.lang.reflect.Type r2 = r4.getRawType()
            p000.vx2.m53587c(r2, r5)
            goto L_0x0030
        L_0x002c:
            java.lang.reflect.Type r2 = p000.xj2.m30139d(r2)
        L_0x0030:
            java.lang.Object r8 = r0.fromJson((java.lang.String) r8, (java.lang.reflect.Type) r2)
            java.lang.String r0 = "fromJson(json, typeToken<T>())"
            p000.vx2.m53587c(r8, r0)
            com.trustwallet.walletconnect.models.WCSocketMessage r8 = (com.trustwallet.walletconnect.models.WCSocketMessage) r8
            com.google.gson.Gson r2 = r7.gson
            p000.vx2.m53590f(r2, r1)
            java.lang.String r8 = r8.getPayload()
            com.trustwallet.walletconnect.WCClient$decryptMessage$$inlined$fromJson$2 r1 = new com.trustwallet.walletconnect.WCClient$decryptMessage$$inlined$fromJson$2
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            p000.vx2.m53587c(r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0065
            r3 = r1
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            boolean r4 = p000.xj2.m30136a(r3)
            if (r4 == 0) goto L_0x0065
            java.lang.reflect.Type r1 = r3.getRawType()
            p000.vx2.m53587c(r1, r5)
            goto L_0x0069
        L_0x0065:
            java.lang.reflect.Type r1 = p000.xj2.m30139d(r1)
        L_0x0069:
            java.lang.Object r8 = r2.fromJson((java.lang.String) r8, (java.lang.reflect.Type) r1)
            p000.vx2.m53587c(r8, r0)
            com.trustwallet.walletconnect.models.WCEncryptionPayload r8 = (com.trustwallet.walletconnect.models.WCEncryptionPayload) r8
            com.trustwallet.walletconnect.models.session.WCSession r0 = r7.session
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = new java.lang.String
            com.trustwallet.walletconnect.WCCipher r2 = com.trustwallet.walletconnect.WCCipher.INSTANCE
            java.lang.String r0 = r0.getKey()
            byte[] r0 = com.trustwallet.walletconnect.extensions.StringKt.hexStringToByteArray(r0)
            byte[] r8 = r2.decrypt(r8, r0)
            java.nio.charset.Charset r0 = p000.ae0.f36435b
            r1.<init>(r8, r0)
            return r1
        L_0x008c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "session can't be null on message receive"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trustwallet.walletconnect.WCClient.decryptMessage(java.lang.String):java.lang.String");
    }

    private final boolean encryptAndSend(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("==> message ");
        sb.append(str);
        WCSession wCSession = this.session;
        if (wCSession != null) {
            Gson gson2 = this.gson;
            WCCipher wCCipher = WCCipher.INSTANCE;
            byte[] bytes = str.getBytes(ae0.f36435b);
            vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
            String json = gson2.toJson((Object) wCCipher.encrypt(bytes, StringKt.hexStringToByteArray(wCSession.getKey())));
            String str2 = this.remotePeerId;
            if (str2 == null) {
                str2 = wCSession.getTopic();
            }
            MessageType messageType = MessageType.PUB;
            vx2.m53590f(json, "payload");
            String json2 = this.gson.toJson((Object) new WCSocketMessage(str2, messageType, json));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("==> encrypted ");
            sb2.append(json2);
            WebSocket webSocket = this.socket;
            if (webSocket == null) {
                return false;
            }
            vx2.m53590f(json2, "json");
            return webSocket.send(json2);
        }
        throw new IllegalStateException("session can't be null on message send");
    }

    private final void handleMessage(String str) {
        Type type;
        try {
            Gson gson2 = this.gson;
            Type type2 = new WCClient$handleMessage$$inlined$typeToken$1().getType();
            vx2.m53587c(type2, "object : TypeToken<T>() {} .type");
            if (!(type2 instanceof ParameterizedType) || !xj2.m30136a((ParameterizedType) type2)) {
                type = xj2.m30139d(type2);
            } else {
                type = ((ParameterizedType) type2).getRawType();
                vx2.m53587c(type, "type.rawType");
            }
            JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) gson2.fromJson(str, type);
            if (jsonRpcRequest.getMethod() != null) {
                vx2.m53590f(jsonRpcRequest, "request");
                handleRequest(jsonRpcRequest);
                return;
            }
            this.onCustomRequest.invoke(Long.valueOf(jsonRpcRequest.getId()), str);
        } catch (InvalidJsonRpcParamsException e) {
            invalidParams(e.getRequestId());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:38|41|42|(1:47)(1:46)|48|(6:50|53|54|(1:59)(1:58)|60|(2:62|160)(2:63|64))(2:51|52)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x013c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0197 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0160 A[Catch:{ NoSuchElementException -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016a A[Catch:{ NoSuchElementException -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017f A[Catch:{ NoSuchElementException -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018d A[Catch:{ NoSuchElementException -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bb A[Catch:{ NoSuchElementException -> 0x04e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c5 A[Catch:{ NoSuchElementException -> 0x04e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01da A[Catch:{ NoSuchElementException -> 0x04e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e9 A[Catch:{ NoSuchElementException -> 0x04e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleRequest(com.trustwallet.walletconnect.jsonrpc.JsonRpcRequest<com.google.gson.JsonArray> r9) {
        /*
            r8 = this;
            com.trustwallet.walletconnect.models.WCMethod r0 = r9.getMethod()
            if (r0 != 0) goto L_0x0008
            r0 = -1
            goto L_0x0010
        L_0x0008:
            int[] r1 = com.trustwallet.walletconnect.WCClient.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x0010:
            r1 = 2
            java.lang.String r2 = "type.rawType"
            java.lang.String r3 = "fromJson(json, typeToken<T>())"
            java.lang.String r4 = "object : TypeToken<T>() {} .type"
            java.lang.String r5 = "gson"
            switch(r0) {
                case 1: goto L_0x0479;
                case 2: goto L_0x0423;
                case 3: goto L_0x03c4;
                case 4: goto L_0x0365;
                case 5: goto L_0x0306;
                case 6: goto L_0x02a7;
                case 7: goto L_0x024d;
                case 8: goto L_0x01f3;
                case 9: goto L_0x00e1;
                case 10: goto L_0x0087;
                case 11: goto L_0x0078;
                case 12: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x04e8
        L_0x001e:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r1 = r9.getParams()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$13 r5 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$13
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            p000.vx2.m53587c(r5, r4)
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x004a
            r4 = r5
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x004a
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x004e
        L_0x004a:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r5)
        L_0x004e:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)
            com.trustwallet.walletconnect.models.WCSignTransaction r0 = (com.trustwallet.walletconnect.models.WCSignTransaction) r0
            if (r0 == 0) goto L_0x006e
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.WCSignTransaction, r37> r1 = r8.onSignTransaction
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r1.invoke(r9, r0)
            goto L_0x04e8
        L_0x006e:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x0078:
            rc2<? super java.lang.Long, r37> r0 = r8.onGetAccounts
            long r1 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            r0.invoke(r9)
            goto L_0x04e8
        L_0x0087:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r1 = r9.getParams()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$12 r5 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$12
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            p000.vx2.m53587c(r5, r4)
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x00b3
            r4 = r5
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x00b3
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x00b7
        L_0x00b3:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r5)
        L_0x00b7:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)
            com.trustwallet.walletconnect.models.binance.WCBinanceTxConfirmParam r0 = (com.trustwallet.walletconnect.models.binance.WCBinanceTxConfirmParam) r0
            if (r0 == 0) goto L_0x00d7
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.binance.WCBinanceTxConfirmParam, r37> r1 = r8.onBnbTxConfirm
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r1.invoke(r9, r0)
            goto L_0x04e8
        L_0x00d7:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            com.google.gson.Gson r0 = r8.gson     // Catch:{ NoSuchElementException -> 0x013c }
            p000.vx2.m53590f(r0, r5)     // Catch:{ NoSuchElementException -> 0x013c }
            java.lang.Object r1 = r9.getParams()     // Catch:{ NoSuchElementException -> 0x013c }
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1     // Catch:{ NoSuchElementException -> 0x013c }
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$9 r6 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$9     // Catch:{ NoSuchElementException -> 0x013c }
            r6.<init>()     // Catch:{ NoSuchElementException -> 0x013c }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ NoSuchElementException -> 0x013c }
            p000.vx2.m53587c(r6, r4)     // Catch:{ NoSuchElementException -> 0x013c }
            boolean r7 = r6 instanceof java.lang.reflect.ParameterizedType     // Catch:{ NoSuchElementException -> 0x013c }
            if (r7 == 0) goto L_0x010f
            r7 = r6
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7     // Catch:{ NoSuchElementException -> 0x013c }
            boolean r7 = p000.xj2.m30136a(r7)     // Catch:{ NoSuchElementException -> 0x013c }
            if (r7 == 0) goto L_0x010f
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6     // Catch:{ NoSuchElementException -> 0x013c }
            java.lang.reflect.Type r6 = r6.getRawType()     // Catch:{ NoSuchElementException -> 0x013c }
            p000.vx2.m53587c(r6, r2)     // Catch:{ NoSuchElementException -> 0x013c }
            goto L_0x0113
        L_0x010f:
            java.lang.reflect.Type r6 = p000.xj2.m30139d(r6)     // Catch:{ NoSuchElementException -> 0x013c }
        L_0x0113:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r6)     // Catch:{ NoSuchElementException -> 0x013c }
            p000.vx2.m53587c(r0, r3)     // Catch:{ NoSuchElementException -> 0x013c }
            java.util.List r0 = (java.util.List) r0     // Catch:{ NoSuchElementException -> 0x013c }
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)     // Catch:{ NoSuchElementException -> 0x013c }
            com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrder r0 = (com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrder) r0     // Catch:{ NoSuchElementException -> 0x013c }
            if (r0 == 0) goto L_0x0132
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrder, r37> r1 = r8.onBnbCancel     // Catch:{ NoSuchElementException -> 0x013c }
            long r6 = r9.getId()     // Catch:{ NoSuchElementException -> 0x013c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ NoSuchElementException -> 0x013c }
            r1.invoke(r6, r0)     // Catch:{ NoSuchElementException -> 0x013c }
            goto L_0x013c
        L_0x0132:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException     // Catch:{ NoSuchElementException -> 0x013c }
            long r6 = r9.getId()     // Catch:{ NoSuchElementException -> 0x013c }
            r0.<init>(r6)     // Catch:{ NoSuchElementException -> 0x013c }
            throw r0     // Catch:{ NoSuchElementException -> 0x013c }
        L_0x013c:
            com.google.gson.Gson r0 = r8.gson     // Catch:{ NoSuchElementException -> 0x0197 }
            p000.vx2.m53590f(r0, r5)     // Catch:{ NoSuchElementException -> 0x0197 }
            java.lang.Object r1 = r9.getParams()     // Catch:{ NoSuchElementException -> 0x0197 }
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1     // Catch:{ NoSuchElementException -> 0x0197 }
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$10 r6 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$10     // Catch:{ NoSuchElementException -> 0x0197 }
            r6.<init>()     // Catch:{ NoSuchElementException -> 0x0197 }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ NoSuchElementException -> 0x0197 }
            p000.vx2.m53587c(r6, r4)     // Catch:{ NoSuchElementException -> 0x0197 }
            boolean r7 = r6 instanceof java.lang.reflect.ParameterizedType     // Catch:{ NoSuchElementException -> 0x0197 }
            if (r7 == 0) goto L_0x016a
            r7 = r6
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7     // Catch:{ NoSuchElementException -> 0x0197 }
            boolean r7 = p000.xj2.m30136a(r7)     // Catch:{ NoSuchElementException -> 0x0197 }
            if (r7 == 0) goto L_0x016a
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6     // Catch:{ NoSuchElementException -> 0x0197 }
            java.lang.reflect.Type r6 = r6.getRawType()     // Catch:{ NoSuchElementException -> 0x0197 }
            p000.vx2.m53587c(r6, r2)     // Catch:{ NoSuchElementException -> 0x0197 }
            goto L_0x016e
        L_0x016a:
            java.lang.reflect.Type r6 = p000.xj2.m30139d(r6)     // Catch:{ NoSuchElementException -> 0x0197 }
        L_0x016e:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r6)     // Catch:{ NoSuchElementException -> 0x0197 }
            p000.vx2.m53587c(r0, r3)     // Catch:{ NoSuchElementException -> 0x0197 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ NoSuchElementException -> 0x0197 }
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)     // Catch:{ NoSuchElementException -> 0x0197 }
            com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrder r0 = (com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrder) r0     // Catch:{ NoSuchElementException -> 0x0197 }
            if (r0 == 0) goto L_0x018d
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrder, r37> r1 = r8.onBnbTrade     // Catch:{ NoSuchElementException -> 0x0197 }
            long r6 = r9.getId()     // Catch:{ NoSuchElementException -> 0x0197 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ NoSuchElementException -> 0x0197 }
            r1.invoke(r6, r0)     // Catch:{ NoSuchElementException -> 0x0197 }
            goto L_0x0197
        L_0x018d:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException     // Catch:{ NoSuchElementException -> 0x0197 }
            long r6 = r9.getId()     // Catch:{ NoSuchElementException -> 0x0197 }
            r0.<init>(r6)     // Catch:{ NoSuchElementException -> 0x0197 }
            throw r0     // Catch:{ NoSuchElementException -> 0x0197 }
        L_0x0197:
            com.google.gson.Gson r0 = r8.gson     // Catch:{ NoSuchElementException -> 0x04e8 }
            p000.vx2.m53590f(r0, r5)     // Catch:{ NoSuchElementException -> 0x04e8 }
            java.lang.Object r1 = r9.getParams()     // Catch:{ NoSuchElementException -> 0x04e8 }
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1     // Catch:{ NoSuchElementException -> 0x04e8 }
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$11 r5 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$11     // Catch:{ NoSuchElementException -> 0x04e8 }
            r5.<init>()     // Catch:{ NoSuchElementException -> 0x04e8 }
            java.lang.reflect.Type r5 = r5.getType()     // Catch:{ NoSuchElementException -> 0x04e8 }
            p000.vx2.m53587c(r5, r4)     // Catch:{ NoSuchElementException -> 0x04e8 }
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType     // Catch:{ NoSuchElementException -> 0x04e8 }
            if (r4 == 0) goto L_0x01c5
            r4 = r5
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4     // Catch:{ NoSuchElementException -> 0x04e8 }
            boolean r4 = p000.xj2.m30136a(r4)     // Catch:{ NoSuchElementException -> 0x04e8 }
            if (r4 == 0) goto L_0x01c5
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5     // Catch:{ NoSuchElementException -> 0x04e8 }
            java.lang.reflect.Type r4 = r5.getRawType()     // Catch:{ NoSuchElementException -> 0x04e8 }
            p000.vx2.m53587c(r4, r2)     // Catch:{ NoSuchElementException -> 0x04e8 }
            goto L_0x01c9
        L_0x01c5:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r5)     // Catch:{ NoSuchElementException -> 0x04e8 }
        L_0x01c9:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r4)     // Catch:{ NoSuchElementException -> 0x04e8 }
            p000.vx2.m53587c(r0, r3)     // Catch:{ NoSuchElementException -> 0x04e8 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ NoSuchElementException -> 0x04e8 }
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)     // Catch:{ NoSuchElementException -> 0x04e8 }
            com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder r0 = (com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder) r0     // Catch:{ NoSuchElementException -> 0x04e8 }
            if (r0 == 0) goto L_0x01e9
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrder, r37> r1 = r8.onBnbTransfer     // Catch:{ NoSuchElementException -> 0x04e8 }
            long r2 = r9.getId()     // Catch:{ NoSuchElementException -> 0x04e8 }
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch:{ NoSuchElementException -> 0x04e8 }
            r1.invoke(r9, r0)     // Catch:{ NoSuchElementException -> 0x04e8 }
            goto L_0x04e8
        L_0x01e9:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException     // Catch:{ NoSuchElementException -> 0x04e8 }
            long r1 = r9.getId()     // Catch:{ NoSuchElementException -> 0x04e8 }
            r0.<init>(r1)     // Catch:{ NoSuchElementException -> 0x04e8 }
            throw r0     // Catch:{ NoSuchElementException -> 0x04e8 }
        L_0x01f3:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r1 = r9.getParams()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$8 r5 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$8
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            p000.vx2.m53587c(r5, r4)
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x021f
            r4 = r5
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x021f
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x0223
        L_0x021f:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r5)
        L_0x0223:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)
            com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r0 = (com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction) r0
            if (r0 == 0) goto L_0x0243
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction, r37> r1 = r8.onEthSendTransaction
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r1.invoke(r9, r0)
            goto L_0x04e8
        L_0x0243:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x024d:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r1 = r9.getParams()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$7 r5 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$7
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            p000.vx2.m53587c(r5, r4)
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0279
            r4 = r5
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x0279
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x027d
        L_0x0279:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r5)
        L_0x027d:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)
            com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r0 = (com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction) r0
            if (r0 == 0) goto L_0x029d
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction, r37> r1 = r8.onEthSignTransaction
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r1.invoke(r9, r0)
            goto L_0x04e8
        L_0x029d:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r5 = r9.getParams()
            com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$6 r6 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$6
            r6.<init>()
            java.lang.reflect.Type r6 = r6.getType()
            p000.vx2.m53587c(r6, r4)
            boolean r4 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x02d3
            r4 = r6
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r7 = p000.xj2.m30136a(r4)
            if (r7 == 0) goto L_0x02d3
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x02d7
        L_0x02d3:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r6)
        L_0x02d7:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r5, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            if (r2 < r1) goto L_0x02fc
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage, r37> r1 = r8.onEthSign
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage r2 = new com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r3 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.ETH_SIGN_TYPE_DATA_V4
            r2.<init>(r0, r3)
            r1.invoke(r9, r2)
            goto L_0x04e8
        L_0x02fc:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x0306:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r5 = r9.getParams()
            com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$5 r6 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$5
            r6.<init>()
            java.lang.reflect.Type r6 = r6.getType()
            p000.vx2.m53587c(r6, r4)
            boolean r4 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0332
            r4 = r6
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r7 = p000.xj2.m30136a(r4)
            if (r7 == 0) goto L_0x0332
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x0336
        L_0x0332:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r6)
        L_0x0336:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r5, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            if (r2 < r1) goto L_0x035b
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage, r37> r1 = r8.onEthSign
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage r2 = new com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r3 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.TYPED_MESSAGE
            r2.<init>(r0, r3)
            r1.invoke(r9, r2)
            goto L_0x04e8
        L_0x035b:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x0365:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r5 = r9.getParams()
            com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$4 r6 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$4
            r6.<init>()
            java.lang.reflect.Type r6 = r6.getType()
            p000.vx2.m53587c(r6, r4)
            boolean r4 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0391
            r4 = r6
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r7 = p000.xj2.m30136a(r4)
            if (r7 == 0) goto L_0x0391
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x0395
        L_0x0391:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r6)
        L_0x0395:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r5, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            if (r2 < r1) goto L_0x03ba
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage, r37> r1 = r8.onEthSign
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage r2 = new com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r3 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.PERSONAL_MESSAGE
            r2.<init>(r0, r3)
            r1.invoke(r9, r2)
            goto L_0x04e8
        L_0x03ba:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x03c4:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r5 = r9.getParams()
            com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$3 r6 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$3
            r6.<init>()
            java.lang.reflect.Type r6 = r6.getType()
            p000.vx2.m53587c(r6, r4)
            boolean r4 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x03f0
            r4 = r6
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r7 = p000.xj2.m30136a(r4)
            if (r7 == 0) goto L_0x03f0
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x03f4
        L_0x03f0:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r6)
        L_0x03f4:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r5, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            if (r2 < r1) goto L_0x0419
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage, r37> r1 = r8.onEthSign
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage r2 = new com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage
            com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r3 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.MESSAGE
            r2.<init>(r0, r3)
            r1.invoke(r9, r2)
            goto L_0x04e8
        L_0x0419:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x0423:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r1 = r9.getParams()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$2 r5 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$2
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            p000.vx2.m53587c(r5, r4)
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x044f
            r4 = r5
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x044f
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x0453
        L_0x044f:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r5)
        L_0x0453:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)
            com.trustwallet.walletconnect.models.session.WCSessionUpdate r0 = (com.trustwallet.walletconnect.models.session.WCSessionUpdate) r0
            if (r0 == 0) goto L_0x046f
            boolean r9 = r0.getApproved()
            if (r9 != 0) goto L_0x04e8
            r8.killSession()
            goto L_0x04e8
        L_0x046f:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x0479:
            com.google.gson.Gson r0 = r8.gson
            p000.vx2.m53590f(r0, r5)
            java.lang.Object r1 = r9.getParams()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$1 r5 = new com.trustwallet.walletconnect.WCClient$handleRequest$$inlined$fromJson$1
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            p000.vx2.m53587c(r5, r4)
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x04a5
            r4 = r5
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r6 = p000.xj2.m30136a(r4)
            if (r6 == 0) goto L_0x04a5
            java.lang.reflect.Type r4 = r4.getRawType()
            p000.vx2.m53587c(r4, r2)
            goto L_0x04a9
        L_0x04a5:
            java.lang.reflect.Type r4 = p000.xj2.m30139d(r5)
        L_0x04a9:
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.reflect.Type) r4)
            p000.vx2.m53587c(r0, r3)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)
            com.trustwallet.walletconnect.models.session.WCSessionRequest r0 = (com.trustwallet.walletconnect.models.session.WCSessionRequest) r0
            if (r0 == 0) goto L_0x04de
            long r1 = r9.getId()
            r8.handshakeId = r1
            java.lang.String r1 = r0.getPeerId()
            r8.remotePeerId = r1
            java.lang.String r1 = r0.getChainId()
            r8.chainId = r1
            fd2<? super java.lang.Long, ? super com.trustwallet.walletconnect.models.WCPeerMeta, r37> r1 = r8.onSessionRequest
            long r2 = r9.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            com.trustwallet.walletconnect.models.WCPeerMeta r0 = r0.getPeerMeta()
            r1.invoke(r9, r0)
            goto L_0x04e8
        L_0x04de:
            com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException r0 = new com.trustwallet.walletconnect.exceptions.InvalidJsonRpcParamsException
            long r1 = r9.getId()
            r0.<init>(r1)
            throw r0
        L_0x04e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trustwallet.walletconnect.WCClient.handleRequest(com.trustwallet.walletconnect.jsonrpc.JsonRpcRequest):void");
    }

    private final boolean invalidParams(long j) {
        String json = this.gson.toJson((Object) new JsonRpcErrorResponse((String) null, j, JsonRpcError.Companion.invalidParams("Invalid parameters"), 1, (DefaultConstructorMarker) null));
        vx2.m53590f(json, "gson.toJson(response)");
        return encryptAndSend(json);
    }

    public static /* synthetic */ boolean rejectRequest$default(WCClient wCClient, long j, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = "Reject by the user";
            }
            return wCClient.rejectRequest(j, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectRequest");
    }

    public static /* synthetic */ boolean rejectSession$default(WCClient wCClient, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "Session rejected";
            }
            return wCClient.rejectSession(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectSession");
    }

    private final void resetState() {
        this.handshakeId = -1;
        this.isConnected = false;
        this.session = null;
        this.peerId = null;
        this.remotePeerId = null;
        this.peerMeta = null;
    }

    private final boolean subscribe(String str) {
        WCSocketMessage wCSocketMessage = new WCSocketMessage(str, MessageType.SUB, "");
        String json = this.gson.toJson((Object) wCSocketMessage);
        StringBuilder sb = new StringBuilder();
        sb.append("==> subscribe ");
        sb.append(json);
        WebSocket webSocket = this.socket;
        if (webSocket == null) {
            return false;
        }
        String json2 = this.gson.toJson((Object) wCSocketMessage);
        vx2.m53590f(json2, "gson.toJson(message)");
        return webSocket.send(json2);
    }

    public static /* synthetic */ boolean updateSession$default(WCClient wCClient, List list, Integer num, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return wCClient.updateSession(list, num, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSession");
    }

    public final void addSocketListener(WebSocketListener webSocketListener) {
        vx2.m53591g(webSocketListener, "listener");
        this.listeners.add(webSocketListener);
    }

    public final <T> boolean approveRequest(long j, T t) {
        String json = this.gson.toJson((Object) new JsonRpcResponse((String) null, j, t, 1, (DefaultConstructorMarker) null));
        vx2.m53590f(json, "gson.toJson(response)");
        return encryptAndSend(json);
    }

    public final boolean approveSession(List<String> list, int i) {
        boolean z;
        vx2.m53591g(list, "accounts");
        if (this.handshakeId > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.chainId = String.valueOf(i);
            String json = this.gson.toJson((Object) new JsonRpcResponse((String) null, this.handshakeId, new WCApproveSessionResponse(false, i, list, this.peerId, this.peerMeta, 1, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null));
            vx2.m53590f(json, "gson.toJson(response)");
            return encryptAndSend(json);
        }
        throw new IllegalStateException("handshakeId must be greater than 0 on session approve".toString());
    }

    public final void connect(WCSession wCSession, WCPeerMeta wCPeerMeta, String str, String str2) {
        String str3;
        vx2.m53591g(wCSession, "session");
        vx2.m53591g(wCPeerMeta, "peerMeta");
        vx2.m53591g(str, "peerId");
        WCSession wCSession2 = this.session;
        if (wCSession2 != null) {
            if (wCSession2 != null) {
                str3 = wCSession2.getTopic();
            } else {
                str3 = null;
            }
            if (!vx2.m53586b(str3, wCSession.getTopic())) {
                killSession();
            }
        }
        this.session = wCSession;
        this.peerMeta = wCPeerMeta;
        this.peerId = str;
        this.remotePeerId = str2;
        this.socket = this.httpClient.newWebSocket(new Request.Builder().url(wCSession.getBridge()).build(), this);
    }

    public final boolean disconnect() {
        WebSocket webSocket = this.socket;
        if (webSocket != null) {
            return webSocket.close(1000, (String) null);
        }
        return false;
    }

    public final String getChainId() {
        return this.chainId;
    }

    public final fd2<Long, WCBinanceCancelOrder, r37> getOnBnbCancel() {
        return this.onBnbCancel;
    }

    public final fd2<Long, WCBinanceTradeOrder, r37> getOnBnbTrade() {
        return this.onBnbTrade;
    }

    public final fd2<Long, WCBinanceTransferOrder, r37> getOnBnbTransfer() {
        return this.onBnbTransfer;
    }

    public final fd2<Long, WCBinanceTxConfirmParam, r37> getOnBnbTxConfirm() {
        return this.onBnbTxConfirm;
    }

    public final fd2<Long, String, r37> getOnCustomRequest() {
        return this.onCustomRequest;
    }

    public final fd2<Integer, String, r37> getOnDisconnect() {
        return this.onDisconnect;
    }

    public final fd2<Long, WCEthereumTransaction, r37> getOnEthSendTransaction() {
        return this.onEthSendTransaction;
    }

    public final fd2<Long, WCEthereumSignMessage, r37> getOnEthSign() {
        return this.onEthSign;
    }

    public final fd2<Long, WCEthereumTransaction, r37> getOnEthSignTransaction() {
        return this.onEthSignTransaction;
    }

    public final rc2<Throwable, r37> getOnFailure() {
        return this.onFailure;
    }

    public final rc2<Long, r37> getOnGetAccounts() {
        return this.onGetAccounts;
    }

    public final fd2<Long, WCPeerMeta, r37> getOnSessionRequest() {
        return this.onSessionRequest;
    }

    public final fd2<Long, WCSignTransaction, r37> getOnSignTransaction() {
        return this.onSignTransaction;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final WCPeerMeta getPeerMeta() {
        return this.peerMeta;
    }

    public final String getRemotePeerId() {
        return this.remotePeerId;
    }

    public final WCSession getSession() {
        return this.session;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean killSession() {
        updateSession$default(this, (List) null, (Integer) null, false, 3, (Object) null);
        return disconnect();
    }

    public void onClosed(WebSocket webSocket, int i, String str) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(str, "reason");
        for (WebSocketListener onClosed : this.listeners) {
            onClosed.onClosed(webSocket, i, str);
        }
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(str, "reason");
        resetState();
        this.onDisconnect.invoke(Integer.valueOf(i), str);
        for (WebSocketListener onClosing : this.listeners) {
            onClosing.onClosing(webSocket, i, str);
        }
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(th, "t");
        resetState();
        this.onFailure.invoke(th);
        for (WebSocketListener onFailure2 : this.listeners) {
            onFailure2.onFailure(webSocket, th, response);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void onMessage(okhttp3.WebSocket r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "webSocket"
            p000.vx2.m53591g(r6, r0)
            java.lang.String r0 = "text"
            p000.vx2.m53591g(r7, r0)
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            r1.<init>()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = "<== message "
            r1.append(r2)     // Catch:{ Exception -> 0x0049 }
            r1.append(r7)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = r5.decryptMessage(r7)     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            r1.<init>()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = "<== decrypted "
            r1.append(r2)     // Catch:{ Exception -> 0x0049 }
            r1.append(r0)     // Catch:{ Exception -> 0x0049 }
            r5.handleMessage(r0)     // Catch:{ Exception -> 0x0049 }
            java.util.Set<okhttp3.WebSocketListener> r1 = r5.listeners
            java.util.Iterator r1 = r1.iterator()
        L_0x0032:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r1.next()
            okhttp3.WebSocketListener r2 = (okhttp3.WebSocketListener) r2
            if (r0 != 0) goto L_0x0042
            r3 = r7
            goto L_0x0043
        L_0x0042:
            r3 = r0
        L_0x0043:
            r2.onMessage((okhttp3.WebSocket) r6, (java.lang.String) r3)
            goto L_0x0032
        L_0x0047:
            r1 = move-exception
            goto L_0x006b
        L_0x0049:
            r1 = move-exception
            rc2<? super java.lang.Throwable, r37> r2 = r5.onFailure     // Catch:{ all -> 0x0047 }
            r2.invoke(r1)     // Catch:{ all -> 0x0047 }
            java.util.Set<okhttp3.WebSocketListener> r1 = r5.listeners
            java.util.Iterator r1 = r1.iterator()
        L_0x0055:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r1.next()
            okhttp3.WebSocketListener r2 = (okhttp3.WebSocketListener) r2
            if (r0 != 0) goto L_0x0065
            r3 = r7
            goto L_0x0066
        L_0x0065:
            r3 = r0
        L_0x0066:
            r2.onMessage((okhttp3.WebSocket) r6, (java.lang.String) r3)
            goto L_0x0055
        L_0x006a:
            return
        L_0x006b:
            java.util.Set<okhttp3.WebSocketListener> r2 = r5.listeners
            java.util.Iterator r2 = r2.iterator()
        L_0x0071:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r2.next()
            okhttp3.WebSocketListener r3 = (okhttp3.WebSocketListener) r3
            if (r0 != 0) goto L_0x0081
            r4 = r7
            goto L_0x0082
        L_0x0081:
            r4 = r0
        L_0x0082:
            r3.onMessage((okhttp3.WebSocket) r6, (java.lang.String) r4)
            goto L_0x0071
        L_0x0086:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trustwallet.walletconnect.WCClient.onMessage(okhttp3.WebSocket, java.lang.String):void");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(response, "response");
        this.isConnected = true;
        for (WebSocketListener onOpen : this.listeners) {
            onOpen.onOpen(webSocket, response);
        }
        WCSession wCSession = this.session;
        if (wCSession != null) {
            String str = this.peerId;
            if (str != null) {
                subscribe(wCSession.getTopic());
                subscribe(str);
                return;
            }
            throw new IllegalStateException("peerId can't be null on connection open");
        }
        throw new IllegalStateException("session can't be null on connection open");
    }

    public final boolean rejectRequest(long j, String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        String json = this.gson.toJson((Object) new JsonRpcErrorResponse((String) null, j, JsonRpcError.Companion.serverError(str), 1, (DefaultConstructorMarker) null));
        vx2.m53590f(json, "gson.toJson(response)");
        return encryptAndSend(json);
    }

    public final boolean rejectSession(String str) {
        boolean z;
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        long j = this.handshakeId;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String json = this.gson.toJson((Object) new JsonRpcErrorResponse((String) null, j, JsonRpcError.Companion.serverError(str), 1, (DefaultConstructorMarker) null));
            vx2.m53590f(json, "gson.toJson(response)");
            return encryptAndSend(json);
        }
        throw new IllegalStateException("handshakeId must be greater than 0 on session reject".toString());
    }

    public final void removeSocketListener(WebSocketListener webSocketListener) {
        vx2.m53591g(webSocketListener, "listener");
        this.listeners.remove(webSocketListener);
    }

    public final void setOnBnbCancel(fd2<? super Long, ? super WCBinanceCancelOrder, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onBnbCancel = fd2;
    }

    public final void setOnBnbTrade(fd2<? super Long, ? super WCBinanceTradeOrder, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onBnbTrade = fd2;
    }

    public final void setOnBnbTransfer(fd2<? super Long, ? super WCBinanceTransferOrder, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onBnbTransfer = fd2;
    }

    public final void setOnBnbTxConfirm(fd2<? super Long, ? super WCBinanceTxConfirmParam, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onBnbTxConfirm = fd2;
    }

    public final void setOnCustomRequest(fd2<? super Long, ? super String, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onCustomRequest = fd2;
    }

    public final void setOnDisconnect(fd2<? super Integer, ? super String, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onDisconnect = fd2;
    }

    public final void setOnEthSendTransaction(fd2<? super Long, ? super WCEthereumTransaction, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onEthSendTransaction = fd2;
    }

    public final void setOnEthSign(fd2<? super Long, ? super WCEthereumSignMessage, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onEthSign = fd2;
    }

    public final void setOnEthSignTransaction(fd2<? super Long, ? super WCEthereumTransaction, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onEthSignTransaction = fd2;
    }

    public final void setOnFailure(rc2<? super Throwable, r37> rc2) {
        vx2.m53591g(rc2, "<set-?>");
        this.onFailure = rc2;
    }

    public final void setOnGetAccounts(rc2<? super Long, r37> rc2) {
        vx2.m53591g(rc2, "<set-?>");
        this.onGetAccounts = rc2;
    }

    public final void setOnSessionRequest(fd2<? super Long, ? super WCPeerMeta, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onSessionRequest = fd2;
    }

    public final void setOnSignTransaction(fd2<? super Long, ? super WCSignTransaction, r37> fd2) {
        vx2.m53591g(fd2, "<set-?>");
        this.onSignTransaction = fd2;
    }

    public final boolean updateSession(List<String> list, Integer num, boolean z) {
        long access$generateId = WCClientKt.generateId();
        WCMethod wCMethod = WCMethod.SESSION_UPDATE;
        if (num == null) {
            String str = this.chainId;
            if (str != null) {
                num = xb6.m73916n(str);
            } else {
                num = null;
            }
        }
        String json = this.gson.toJson((Object) new JsonRpcRequest(access$generateId, (String) null, wCMethod, bk0.m32598e(new WCSessionUpdate(z, num, list)), 2, (DefaultConstructorMarker) null));
        vx2.m53590f(json, "gson.toJson(request)");
        return encryptAndSend(json);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WCClient(com.google.gson.GsonBuilder r8, okhttp3.OkHttpClient r9) {
        /*
            r7 = this;
            java.lang.String r0 = "builder"
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "httpClient"
            p000.vx2.m53591g(r9, r0)
            r7.<init>()
            r7.httpClient = r9
            java.lang.String r9 = "WCClient"
            r7.TAG = r9
            com.google.gson.GsonBuilder r8 = r8.serializeNulls()
            java.lang.String r9 = "builder\n        .serializeNulls()"
            p000.vx2.m53590f(r8, r9)
            com.google.gson.JsonSerializer r9 = com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrderKt.getCancelOrderSerializer()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            if (r9 == 0) goto L_0x01ec
            com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$1 r1 = new com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$1
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.String r2 = "object : TypeToken<T>() {} .type"
            p000.vx2.m53587c(r1, r2)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r4 = "type.rawType"
            if (r3 == 0) goto L_0x0049
            r3 = r1
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            boolean r5 = p000.xj2.m30136a(r3)
            if (r5 == 0) goto L_0x0049
            java.lang.reflect.Type r1 = r3.getRawType()
            p000.vx2.m53587c(r1, r4)
            goto L_0x004d
        L_0x0049:
            java.lang.reflect.Type r1 = p000.xj2.m30139d(r1)
        L_0x004d:
            com.google.gson.GsonBuilder r8 = r8.registerTypeAdapter(r1, r9)
            java.lang.String r9 = "this.registerTypeAdapter…eToken<T>(), typeAdapter)"
            p000.vx2.m53587c(r8, r9)
            com.google.gson.JsonDeserializer r1 = com.trustwallet.walletconnect.models.binance.WCBinanceCancelOrderKt.getCancelOrderDeserializer()
            if (r1 == 0) goto L_0x01e6
            com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$2 r3 = new com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$2
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            p000.vx2.m53587c(r3, r2)
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x007d
            r5 = r3
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r6 = p000.xj2.m30136a(r5)
            if (r6 == 0) goto L_0x007d
            java.lang.reflect.Type r3 = r5.getRawType()
            p000.vx2.m53587c(r3, r4)
            goto L_0x0081
        L_0x007d:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x0081:
            com.google.gson.GsonBuilder r8 = r8.registerTypeAdapter(r3, r1)
            p000.vx2.m53587c(r8, r9)
            com.google.gson.JsonSerializer r1 = com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrderKt.getTradeOrderSerializer()
            if (r1 == 0) goto L_0x01e0
            com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$3 r3 = new com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$3
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            p000.vx2.m53587c(r3, r2)
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x00af
            r5 = r3
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r6 = p000.xj2.m30136a(r5)
            if (r6 == 0) goto L_0x00af
            java.lang.reflect.Type r3 = r5.getRawType()
            p000.vx2.m53587c(r3, r4)
            goto L_0x00b3
        L_0x00af:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x00b3:
            com.google.gson.GsonBuilder r8 = r8.registerTypeAdapter(r3, r1)
            p000.vx2.m53587c(r8, r9)
            com.google.gson.JsonDeserializer r1 = com.trustwallet.walletconnect.models.binance.WCBinanceTradeOrderKt.getTradeOrderDeserializer()
            if (r1 == 0) goto L_0x01da
            com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$4 r3 = new com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$4
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            p000.vx2.m53587c(r3, r2)
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x00e1
            r5 = r3
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r6 = p000.xj2.m30136a(r5)
            if (r6 == 0) goto L_0x00e1
            java.lang.reflect.Type r3 = r5.getRawType()
            p000.vx2.m53587c(r3, r4)
            goto L_0x00e5
        L_0x00e1:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x00e5:
            com.google.gson.GsonBuilder r8 = r8.registerTypeAdapter(r3, r1)
            p000.vx2.m53587c(r8, r9)
            com.google.gson.JsonSerializer r1 = com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrderKt.getTransferOrderSerializer()
            if (r1 == 0) goto L_0x01d4
            com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$5 r3 = new com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$5
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            p000.vx2.m53587c(r3, r2)
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x0113
            r5 = r3
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r6 = p000.xj2.m30136a(r5)
            if (r6 == 0) goto L_0x0113
            java.lang.reflect.Type r3 = r5.getRawType()
            p000.vx2.m53587c(r3, r4)
            goto L_0x0117
        L_0x0113:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x0117:
            com.google.gson.GsonBuilder r8 = r8.registerTypeAdapter(r3, r1)
            p000.vx2.m53587c(r8, r9)
            com.google.gson.JsonDeserializer r1 = com.trustwallet.walletconnect.models.binance.WCBinanceTransferOrderKt.getTransferOrderDeserializer()
            if (r1 == 0) goto L_0x01ce
            com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$6 r3 = new com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$6
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            p000.vx2.m53587c(r3, r2)
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x0145
            r5 = r3
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r6 = p000.xj2.m30136a(r5)
            if (r6 == 0) goto L_0x0145
            java.lang.reflect.Type r3 = r5.getRawType()
            p000.vx2.m53587c(r3, r4)
            goto L_0x0149
        L_0x0145:
            java.lang.reflect.Type r3 = p000.xj2.m30139d(r3)
        L_0x0149:
            com.google.gson.GsonBuilder r8 = r8.registerTypeAdapter(r3, r1)
            p000.vx2.m53587c(r8, r9)
            com.google.gson.JsonDeserializer r1 = com.trustwallet.walletconnect.models.ethereum.WCEthereumTransactionKt.getEthTransactionSerializer()
            if (r1 == 0) goto L_0x01c8
            com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$7 r0 = new com.trustwallet.walletconnect.WCClient$special$$inlined$registerTypeAdapter$7
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            p000.vx2.m53587c(r0, r2)
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x0177
            r2 = r0
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            boolean r3 = p000.xj2.m30136a(r2)
            if (r3 == 0) goto L_0x0177
            java.lang.reflect.Type r0 = r2.getRawType()
            p000.vx2.m53587c(r0, r4)
            goto L_0x017b
        L_0x0177:
            java.lang.reflect.Type r0 = p000.xj2.m30139d(r0)
        L_0x017b:
            com.google.gson.GsonBuilder r8 = r8.registerTypeAdapter(r0, r1)
            p000.vx2.m53587c(r8, r9)
            com.google.gson.Gson r8 = r8.create()
            r7.gson = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.listeners = r8
            r8 = -1
            r7.handshakeId = r8
            com.trustwallet.walletconnect.WCClient$onFailure$1 r8 = com.trustwallet.walletconnect.WCClient$onFailure$1.INSTANCE
            r7.onFailure = r8
            com.trustwallet.walletconnect.WCClient$onDisconnect$1 r8 = com.trustwallet.walletconnect.WCClient$onDisconnect$1.INSTANCE
            r7.onDisconnect = r8
            com.trustwallet.walletconnect.WCClient$onSessionRequest$1 r8 = com.trustwallet.walletconnect.WCClient$onSessionRequest$1.INSTANCE
            r7.onSessionRequest = r8
            com.trustwallet.walletconnect.WCClient$onEthSign$1 r8 = com.trustwallet.walletconnect.WCClient$onEthSign$1.INSTANCE
            r7.onEthSign = r8
            com.trustwallet.walletconnect.WCClient$onEthSignTransaction$1 r8 = com.trustwallet.walletconnect.WCClient$onEthSignTransaction$1.INSTANCE
            r7.onEthSignTransaction = r8
            com.trustwallet.walletconnect.WCClient$onEthSendTransaction$1 r8 = com.trustwallet.walletconnect.WCClient$onEthSendTransaction$1.INSTANCE
            r7.onEthSendTransaction = r8
            com.trustwallet.walletconnect.WCClient$onCustomRequest$1 r8 = com.trustwallet.walletconnect.WCClient$onCustomRequest$1.INSTANCE
            r7.onCustomRequest = r8
            com.trustwallet.walletconnect.WCClient$onBnbTrade$1 r8 = com.trustwallet.walletconnect.WCClient$onBnbTrade$1.INSTANCE
            r7.onBnbTrade = r8
            com.trustwallet.walletconnect.WCClient$onBnbCancel$1 r8 = com.trustwallet.walletconnect.WCClient$onBnbCancel$1.INSTANCE
            r7.onBnbCancel = r8
            com.trustwallet.walletconnect.WCClient$onBnbTransfer$1 r8 = com.trustwallet.walletconnect.WCClient$onBnbTransfer$1.INSTANCE
            r7.onBnbTransfer = r8
            com.trustwallet.walletconnect.WCClient$onBnbTxConfirm$1 r8 = com.trustwallet.walletconnect.WCClient$onBnbTxConfirm$1.INSTANCE
            r7.onBnbTxConfirm = r8
            com.trustwallet.walletconnect.WCClient$onGetAccounts$1 r8 = com.trustwallet.walletconnect.WCClient$onGetAccounts$1.INSTANCE
            r7.onGetAccounts = r8
            com.trustwallet.walletconnect.WCClient$onSignTransaction$1 r8 = com.trustwallet.walletconnect.WCClient$onSignTransaction$1.INSTANCE
            r7.onSignTransaction = r8
            return
        L_0x01c8:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            r8.<init>(r0)
            throw r8
        L_0x01ce:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            r8.<init>(r0)
            throw r8
        L_0x01d4:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            r8.<init>(r0)
            throw r8
        L_0x01da:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            r8.<init>(r0)
            throw r8
        L_0x01e0:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            r8.<init>(r0)
            throw r8
        L_0x01e6:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            r8.<init>(r0)
            throw r8
        L_0x01ec:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trustwallet.walletconnect.WCClient.<init>(com.google.gson.GsonBuilder, okhttp3.OkHttpClient):void");
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        vx2.m53591g(webSocket, "webSocket");
        vx2.m53591g(byteString, "bytes");
        for (WebSocketListener onMessage : this.listeners) {
            onMessage.onMessage(webSocket, byteString);
        }
    }
}
