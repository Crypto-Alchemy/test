package net.safemoon.androidwallet.fragments;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.MyTokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SelectChainFragment.kt */
public final class SelectChainFragment$initView$1$2 extends Lambda implements pc2<r37> {
    public final /* synthetic */ dl5 $savedStateHandle;
    public final /* synthetic */ SelectChainFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectChainFragment$initView$1$2(SelectChainFragment selectChainFragment, dl5 dl5) {
        super(0);
        this.this$0 = selectChainFragment;
        this.$savedStateHandle = dl5;
    }

    public final void invoke() {
        dl5 dl5;
        List value = this.this$0.mo57634v().mo61392i().getValue();
        if (value != null && (dl5 = this.$savedStateHandle) != null) {
            ArrayList<MyTokenType> arrayList = new ArrayList<>();
            for (Object next : value) {
                if (((MyTokenType) next).isSelect()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
            for (MyTokenType tokenType : arrayList) {
                arrayList2.add(tokenType.getTokenType());
            }
            dl5.mo18833j("RESULT_SELECTED_CHAIN", arrayList2);
        }
    }
}
