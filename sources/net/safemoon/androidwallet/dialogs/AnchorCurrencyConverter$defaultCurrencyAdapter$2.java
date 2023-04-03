package net.safemoon.androidwallet.dialogs;

import android.widget.ViewSwitcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import p000.tz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/AnchorCurrencyConverter$defaultCurrencyAdapter$2$a", "invoke", "()Lnet/safemoon/androidwallet/dialogs/AnchorCurrencyConverter$defaultCurrencyAdapter$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AnchorCurrencyConverter.kt */
public final class AnchorCurrencyConverter$defaultCurrencyAdapter$2 extends Lambda implements pc2<C8275a> {
    public final /* synthetic */ AnchorCurrencyConverter this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/AnchorCurrencyConverter$defaultCurrencyAdapter$2$a", "Ltz1;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter$defaultCurrencyAdapter$2$a */
    /* compiled from: AnchorCurrencyConverter.kt */
    public static final class C8275a extends tz1 {

        /* renamed from: e */
        public final /* synthetic */ AnchorCurrencyConverter f41700e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8275a(AnchorCurrencyConverter anchorCurrencyConverter, C8276b bVar) {
            super(bVar);
            this.f41700e = anchorCurrencyConverter;
        }

        /* renamed from: c */
        public Fiat mo57146c() {
            if (this.f41700e.f41692i) {
                return this.f41700e.f41688e;
            }
            return this.f41700e.f41689f;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/AnchorCurrencyConverter$defaultCurrencyAdapter$2$b", "Ltz1$a;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter$defaultCurrencyAdapter$2$b */
    /* compiled from: AnchorCurrencyConverter.kt */
    public static final class C8276b implements tz1.C9373a {

        /* renamed from: a */
        public final /* synthetic */ AnchorCurrencyConverter f41701a;

        public C8276b(AnchorCurrencyConverter anchorCurrencyConverter) {
            this.f41701a = anchorCurrencyConverter;
        }

        /* renamed from: a */
        public void mo57147a(Fiat fiat) {
            ViewSwitcher viewSwitcher;
            vx2.m53591g(fiat, "item");
            ve1 g = this.f41701a.f41687d;
            if (!(g == null || (viewSwitcher = g.f34928b) == null)) {
                viewSwitcher.showPrevious();
            }
            if (this.f41701a.f41692i && !vx2.m53586b(this.f41701a.f41689f.getSymbol(), fiat.getSymbol())) {
                this.f41701a.f41688e = fiat;
                this.f41701a.mo57125A();
            } else if (!vx2.m53586b(this.f41701a.f41688e.getSymbol(), fiat.getSymbol())) {
                this.f41701a.f41689f = fiat;
                this.f41701a.mo57126B();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchorCurrencyConverter$defaultCurrencyAdapter$2(AnchorCurrencyConverter anchorCurrencyConverter) {
        super(0);
        this.this$0 = anchorCurrencyConverter;
    }

    public final C8275a invoke() {
        return new C8275a(this.this$0, new C8276b(this.this$0));
    }
}
