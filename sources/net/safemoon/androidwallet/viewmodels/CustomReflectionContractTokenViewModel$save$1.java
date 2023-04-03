package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail;
import net.safemoon.androidwallet.utils.ImageUtility;
import net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$save$1", mo48632f = "CustomReflectionContractTokenViewModel.kt", mo48633l = {182}, mo48634m = "invokeSuspend")
/* compiled from: CustomReflectionContractTokenViewModel.kt */
public final class CustomReflectionContractTokenViewModel$save$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<CustomReflectionContractTokenViewModel.SaveReturnCode, r37> $callBack;
    public final /* synthetic */ String $contractAddress;
    public final /* synthetic */ String $contractDecimal;
    public final /* synthetic */ String $contractName;
    public final /* synthetic */ String $contractSymbol;
    public int label;
    public final /* synthetic */ CustomReflectionContractTokenViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$save$1$1", mo48632f = "CustomReflectionContractTokenViewModel.kt", mo48633l = {186, 207}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel$save$1$1 */
    /* compiled from: CustomReflectionContractTokenViewModel.kt */
    public static final class C86811 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86811(customReflectionContractTokenViewModel, str, str2, str3, str4, rc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86811) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            String absolutePath;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                if (customReflectionContractTokenViewModel.mo61192v().getValue() != null) {
                    TokenDetail value = customReflectionContractTokenViewModel.mo61192v().getValue();
                    vx2.m53588d(value);
                    absolutePath = String.valueOf(value.f42452id);
                } else {
                    Application b = customReflectionContractTokenViewModel.mo27549b();
                    vx2.m53590f(b, "getApplication()");
                    ImageUtility imageUtility = new ImageUtility(b);
                    Bitmap b2 = bq2.m56115b(bq2.f36932a, 0, 0, str.hashCode(), 3, (Object) null);
                    this.label = 1;
                    obj = imageUtility.mo60920a(b2, "Token", this);
                    if (obj == d) {
                        return d;
                    }
                    absolutePath = ((File) obj).getAbsolutePath();
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
                absolutePath = ((File) obj).getAbsolutePath();
            } else if (i == 2) {
                hg5.m45199b(obj);
                final Long l = (Long) obj;
                hu0 a = cd7.m11843a(customReflectionContractTokenViewModel);
                final rc2<CustomReflectionContractTokenViewModel.SaveReturnCode, r37> rc2 = rc2;
                y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C86821>) null) {
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CustomReflectionContractTokenViewModel$save$1(CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel, String str, String str2, String str3, String str4, rc2<? super CustomReflectionContractTokenViewModel.SaveReturnCode, r37> rc2, ns0<? super CustomReflectionContractTokenViewModel$save$1> ns0) {
                            super(2, ns0);
                            this.this$0 = customReflectionContractTokenViewModel;
                            this.$contractAddress = str;
                            this.$contractName = str2;
                            this.$contractSymbol = str3;
                            this.$contractDecimal = str4;
                            this.$callBack = rc2;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new CustomReflectionContractTokenViewModel$save$1(this.this$0, this.$contractAddress, this.$contractName, this.$contractSymbol, this.$contractDecimal, this.$callBack, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((CustomReflectionContractTokenViewModel$save$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final CustomReflectionContractTokenViewModel customReflectionContractTokenViewModel = this.this$0;
                                final String str = this.$contractAddress;
                                final String str2 = this.$contractName;
                                final String str3 = this.$contractSymbol;
                                final String str4 = this.$contractDecimal;
                                final rc2<CustomReflectionContractTokenViewModel.SaveReturnCode, r37> rc2 = this.$callBack;
                                C86811 r3 = new C86811((ns0<? super C86811>) null);
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
