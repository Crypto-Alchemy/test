package p000;

import java.math.BigDecimal;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetails;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetailsData;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Ldw6;", "Lad7;", "", "hash", "Lr37;", "b", "Ltk5;", "a", "Ltk5;", "service", "Lk04;", "Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;", "Lk04;", "c", "()Lk04;", "detailsData", "<init>", "(Ltk5;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dw6 */
/* compiled from: TransferNotificationDetailsViewModel.kt */
public final class dw6 extends ad7 {

    /* renamed from: a */
    public final tk5 f37408a;

    /* renamed from: b */
    public final k04<TransactionDetailsData> f37409b = new k04<>();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¨\u0006\t"}, mo44877d2 = {"dw6$a", "Lig5;", "Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetails;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dw6$a */
    /* compiled from: TransferNotificationDetailsViewModel.kt */
    public static final class C7003a extends ig5<TransactionDetails> {

        /* renamed from: a */
        public final /* synthetic */ dw6 f37410a;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: dw6$a$a */
        /* compiled from: TransferNotificationDetailsViewModel.kt */
        public /* synthetic */ class C7004a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f37411a;

            static {
                int[] iArr = new int[TokenType.values().length];
                try {
                    iArr[TokenType.SOLANA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f37411a = iArr;
            }
        }

        public C7003a(dw6 dw6) {
            this.f37410a = dw6;
        }

        /* renamed from: b */
        public void mo47104b(k90<TransactionDetails> k90, bg5<TransactionDetails> bg5) {
            TransactionDetailsData transactionDetailsData;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50578a() != null) {
                TransactionDetails a = bg5.mo50578a();
                if (a != null) {
                    transactionDetailsData = a.getData();
                } else {
                    transactionDetailsData = null;
                }
                if (transactionDetailsData != null) {
                    k04<TransactionDetailsData> c = this.f37410a.mo51295c();
                    TransactionDetails a2 = bg5.mo50578a();
                    vx2.m53588d(a2);
                    TransactionDetailsData data = a2.getData();
                    if (C7004a.f37411a[TokenType.Companion.mo57100c(data.getChain()).ordinal()] == 1) {
                        String plainString = new BigDecimal(data.getGasUsed()).divide(BigDecimal.ONE.multiply(BigDecimal.TEN.pow(9))).toPlainString();
                        vx2.m53590f(plainString, "gasUsed.toBigDecimal().d….pow(9))).toPlainString()");
                        data.setGasUsed(plainString);
                    }
                    c.setValue(data);
                }
            }
        }
    }

    public dw6(tk5 tk5) {
        vx2.m53591g(tk5, "service");
        this.f37408a = tk5;
    }

    /* renamed from: b */
    public final void mo51294b(String str) {
        vx2.m53591g(str, "hash");
        this.f37408a.mo66083b(str).mo50512X(new C7003a(this));
    }

    /* renamed from: c */
    public final k04<TransactionDetailsData> mo51295c() {
        return this.f37409b;
    }
}
