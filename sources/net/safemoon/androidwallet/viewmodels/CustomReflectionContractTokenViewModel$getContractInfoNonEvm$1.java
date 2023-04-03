package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.rpc2.CommonTokenInfo;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaTokenMeta;
import p000.i30;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1", mo48632f = "CustomReflectionContractTokenViewModel.kt", mo48633l = {137}, mo48634m = "invokeSuspend")
/* compiled from: CustomReflectionContractTokenViewModel.kt */
public final class CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $contractAddress;
    public final /* synthetic */ TokenType $tokenType;
    public int label;
    public final /* synthetic */ CustomReflectionContractTokenViewModel this$0;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1$a */
    /* compiled from: CustomReflectionContractTokenViewModel.kt */
    public /* synthetic */ class C8679a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42721a;

        static {
            int[] iArr = new int[TokenType.values().length];
            try {
                iArr[TokenType.SOLANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f42721a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1(TokenType tokenType, String str, CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel, ns0<? super CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1> ns0) {
        super(2, ns0);
        this.$tokenType = tokenType;
        this.$contractAddress = str;
        this.this$0 = customReflectionContractTokenViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1(this.$tokenType, this.$contractAddress, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CustomReflectionContractTokenViewModel$getContractInfoNonEvm$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        CommonTokenInfo commonTokenInfo = null;
        if (i == 0) {
            hg5.m45199b(obj);
            if (C8679a.f42721a[this.$tokenType.ordinal()] == 1) {
                k90 f = i30.C7204a.m58797f(ol0.m70377s(this.$tokenType), this.$contractAddress, (String) null, 2, (Object) null);
                this.label = 1;
                obj = KotlinExtensions.m71521c(f, this);
                if (obj == d) {
                    return d;
                }
            }
            this.this$0.mo61186p().postValue(commonTokenInfo);
            return r37.f33317a;
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SolanaTokenMeta solanaTokenMeta = (SolanaTokenMeta) ((bg5) obj).mo50578a();
        if (solanaTokenMeta != null) {
            String str = this.$contractAddress;
            CommonTokenInfo commonTokenInfo2 = new CommonTokenInfo();
            commonTokenInfo2.setName(solanaTokenMeta.getName());
            commonTokenInfo2.setSymbol(solanaTokenMeta.getSymbol());
            commonTokenInfo2.setDecimals(solanaTokenMeta.getDecimals());
            commonTokenInfo2.setAddress(str);
            commonTokenInfo = commonTokenInfo2;
        }
        this.this$0.mo61186p().postValue(commonTokenInfo);
        return r37.f33317a;
    }
}
