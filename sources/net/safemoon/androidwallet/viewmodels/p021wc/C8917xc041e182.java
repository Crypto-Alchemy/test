package net.safemoon.androidwallet.viewmodels.p021wc;

import android.content.DialogInterface;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall;
import net.safemoon.androidwallet.extension.ThreadExtensionKt;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaSendTransactionMessageResponse;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {287}, mo48634m = "invokeSuspend")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class C8917xc041e182 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ MultipleWalletConnect.C8885e $it;
    public final /* synthetic */ String $sign;
    public final /* synthetic */ WalletConnectSmartContractCall $this_apply;
    public int label;
    public final /* synthetic */ MultipleWalletConnect this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {288, 301}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1 */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C89181 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C89181(str, eVar, walletConnectSmartContractCall, multipleWalletConnect, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C89181) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                C8923xbf8118df multipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$result$1 = new C8923xbf8118df(str, (ns0<? super C8923xbf8118df>) null);
                this.label = 1;
                obj = ThreadExtensionKt.m66348b(10, 2000, 0, Utils.DOUBLE_EPSILON, multipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$result$1, this, 12, (Object) null);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else if (i == 2) {
                hg5.m45199b(obj);
                return r37.f33317a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final SolanaSendTransactionMessageResponse solanaSendTransactionMessageResponse = (SolanaSendTransactionMessageResponse) obj;
            vm3 c = qh1.m71266c();
            final MultipleWalletConnect.C8885e eVar = eVar;
            final WalletConnectSmartContractCall walletConnectSmartContractCall = walletConnectSmartContractCall;
            final MultipleWalletConnect multipleWalletConnect = multipleWalletConnect;
            C89191 r3 = new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C89191>) null) {
                public int label;

                @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "it", "Lr37;", "onDismiss", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
                /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$1$a */
                /* compiled from: MultipleWalletConnect.kt */
                public static final class C8922a implements DialogInterface.OnDismissListener {

                    /* renamed from: a */
                    public static final C8922a f43160a = new C8922a();

                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                }

                public final ns0<r37> create(Object obj, ns0<?> ns0) {
                    return 

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C8917xc041e182(String str, MultipleWalletConnect.C8885e eVar, WalletConnectSmartContractCall walletConnectSmartContractCall, MultipleWalletConnect multipleWalletConnect, ns0<? super C8917xc041e182> ns0) {
                        super(2, ns0);
                        this.$sign = str;
                        this.$it = eVar;
                        this.$this_apply = walletConnectSmartContractCall;
                        this.this$0 = multipleWalletConnect;
                    }

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return new C8917xc041e182(this.$sign, this.$it, this.$this_apply, this.this$0, ns0);
                    }

                    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                        return ((C8917xc041e182) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object d = wx2.m54101d();
                        int i = this.label;
                        if (i == 0) {
                            hg5.m45199b(obj);
                            CoroutineDispatcher b = qh1.m71265b();
                            final String str = this.$sign;
                            final MultipleWalletConnect.C8885e eVar = this.$it;
                            final WalletConnectSmartContractCall walletConnectSmartContractCall = this.$this_apply;
                            final MultipleWalletConnect multipleWalletConnect = this.this$0;
                            C89181 r3 = new C89181((ns0<? super C89181>) null);
                            this.label = 1;
                            if (b50.m55768e(b, r3, this) == d) {
                                return d;
                            }
                        } else if (i == 1) {
                            hg5.m45199b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return r37.f33317a;
                    }
                }
