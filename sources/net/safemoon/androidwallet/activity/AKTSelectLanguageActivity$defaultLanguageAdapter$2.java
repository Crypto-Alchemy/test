package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.common.LanguageItem;
import p000.ae3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectLanguageActivity$defaultLanguageAdapter$2$a", "invoke", "()Lnet/safemoon/androidwallet/activity/AKTSelectLanguageActivity$defaultLanguageAdapter$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTSelectLanguageActivity.kt */
public final class AKTSelectLanguageActivity$defaultLanguageAdapter$2 extends Lambda implements pc2<C8175a> {
    public final /* synthetic */ AKTSelectLanguageActivity this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectLanguageActivity$defaultLanguageAdapter$2$a", "Lae3;", "", "f", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectLanguageActivity$defaultLanguageAdapter$2$a */
    /* compiled from: AKTSelectLanguageActivity.kt */
    public static final class C8175a extends ae3 {

        /* renamed from: g */
        public final /* synthetic */ AKTSelectLanguageActivity f41376g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8175a(AKTSelectLanguageActivity aKTSelectLanguageActivity, C8176b bVar) {
            super(aKTSelectLanguageActivity, bVar);
            this.f41376g = aKTSelectLanguageActivity;
        }

        /* renamed from: f */
        public String mo50154f() {
            return g06.f37938a.mo51832a(this.f41376g);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectLanguageActivity$defaultLanguageAdapter$2$b", "Lae3$a;", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectLanguageActivity$defaultLanguageAdapter$2$b */
    /* compiled from: AKTSelectLanguageActivity.kt */
    public static final class C8176b implements ae3.C6823a {

        /* renamed from: a */
        public final /* synthetic */ AKTSelectLanguageActivity f41377a;

        public C8176b(AKTSelectLanguageActivity aKTSelectLanguageActivity) {
            this.f41377a = aKTSelectLanguageActivity;
        }

        /* renamed from: a */
        public void mo50156a(LanguageItem languageItem) {
            vx2.m53591g(languageItem, "item");
            ee3.f37527a.mo51454c(this.f41377a, languageItem);
            AKTConfigurationsActivity.f41249x.mo56591b(this.f41377a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSelectLanguageActivity$defaultLanguageAdapter$2(AKTSelectLanguageActivity aKTSelectLanguageActivity) {
        super(0);
        this.this$0 = aKTSelectLanguageActivity;
    }

    public final C8175a invoke() {
        return new C8175a(this.this$0, new C8176b(this.this$0));
    }
}
