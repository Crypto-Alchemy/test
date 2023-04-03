package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import p000.tz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/CalculatorFragment$defaultCurrencyAdapter$2$a", "invoke", "()Lnet/safemoon/androidwallet/fragments/CalculatorFragment$defaultCurrencyAdapter$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$defaultCurrencyAdapter$2 extends Lambda implements pc2<C8372a> {
    public final /* synthetic */ CalculatorFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/CalculatorFragment$defaultCurrencyAdapter$2$a", "Ltz1;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.CalculatorFragment$defaultCurrencyAdapter$2$a */
    /* compiled from: CalculatorFragment.kt */
    public static final class C8372a extends tz1 {

        /* renamed from: e */
        public final /* synthetic */ CalculatorFragment f41926e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8372a(CalculatorFragment calculatorFragment, C8373b bVar) {
            super(bVar);
            this.f41926e = calculatorFragment;
        }

        /* renamed from: c */
        public Fiat mo57146c() {
            Object value = this.f41926e.f41910P.getValue();
            vx2.m53588d(value);
            return (Fiat) value;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/CalculatorFragment$defaultCurrencyAdapter$2$b", "Ltz1$a;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.CalculatorFragment$defaultCurrencyAdapter$2$b */
    /* compiled from: CalculatorFragment.kt */
    public static final class C8373b implements tz1.C9373a {

        /* renamed from: a */
        public final /* synthetic */ CalculatorFragment f41927a;

        public C8373b(CalculatorFragment calculatorFragment) {
            this.f41927a = calculatorFragment;
        }

        /* renamed from: a */
        public void mo57147a(Fiat fiat) {
            vx2.m53591g(fiat, "item");
            this.f41927a.f41910P.postValue(fiat);
            this.f41927a.mo57447e0();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$defaultCurrencyAdapter$2(CalculatorFragment calculatorFragment) {
        super(0);
        this.this$0 = calculatorFragment;
    }

    public final C8372a invoke() {
        return new C8372a(this.this$0, new C8373b(this.this$0));
    }
}
