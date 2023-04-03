package net.safemoon.androidwallet.fragments.contact;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/common/TokenType;", "kotlin.jvm.PlatformType", "lt", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BaseContactFragment.kt */
public final class BaseContactFragment$setupNetworkTypeView$2 extends Lambda implements rc2<List<? extends TokenType>, r37> {
    public final /* synthetic */ BaseContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContactFragment$setupNetworkTypeView$2(BaseContactFragment baseContactFragment) {
        super(1);
        this.this$0 = baseContactFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends TokenType>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<? extends TokenType> list) {
        EditText editText;
        EditText editText2;
        List<TokenType> a = Common.f42577a.mo60896a(true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TokenType next : a) {
            SimilarTypeGroup similarTypeGroup = next.getCoinType().getSimilarTypeGroup();
            Object obj = linkedHashMap.get(similarTypeGroup);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(similarTypeGroup, obj);
            }
            ((List) obj).add(next);
        }
        vx2.m53590f(list, "lt");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (TokenType next2 : list) {
            SimilarTypeGroup similarTypeGroup2 = next2.getCoinType().getSimilarTypeGroup();
            Object obj2 = linkedHashMap2.get(similarTypeGroup2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(similarTypeGroup2, obj2);
            }
            ((List) obj2).add(next2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!linkedHashMap2.keySet().contains(entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        BaseContactFragment baseContactFragment = this.this$0;
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            if (entry2.getKey() == SimilarTypeGroup.EVM_CAPABILITY) {
                View view = baseContactFragment.mo58074O().get(0);
                if (!(view == null || (editText2 = (EditText) view.findViewById(R.id.etContactAddress)) == null)) {
                    editText2.setText("");
                }
            } else {
                for (TokenType chainId : (Iterable) entry2.getValue()) {
                    View view2 = baseContactFragment.mo58074O().get(Integer.valueOf(chainId.getChainId()));
                    if (!(view2 == null || (editText = (EditText) view2.findViewById(R.id.etContactAddress)) == null)) {
                        editText.setText("");
                    }
                }
            }
        }
        this.this$0.mo58070K().f21181g.removeAllViews();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (TokenType next3 : list) {
            SimilarTypeGroup similarTypeGroup3 = next3.getCoinType().getSimilarTypeGroup();
            Object obj3 = linkedHashMap4.get(similarTypeGroup3);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap4.put(similarTypeGroup3, obj3);
            }
            ((List) obj3).add(next3);
        }
        BaseContactFragment baseContactFragment2 = this.this$0;
        for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
            ViewGroup viewGroup = null;
            if (entry3.getKey() == SimilarTypeGroup.EVM_CAPABILITY) {
                View view3 = baseContactFragment2.mo58074O().get(0);
                ViewParent parent = view3 != null ? view3.getParent() : null;
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(view3);
                }
                try {
                    baseContactFragment2.mo58070K().f21181g.addView(view3);
                } catch (Exception unused) {
                }
            } else {
                for (TokenType chainId2 : (Iterable) entry3.getValue()) {
                    View view4 = baseContactFragment2.mo58074O().get(Integer.valueOf(chainId2.getChainId()));
                    ViewParent parent2 = view4 != null ? view4.getParent() : null;
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view4);
                    }
                    try {
                        baseContactFragment2.mo58070K().f21181g.addView(view4);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        this.this$0.mo58082i0();
    }
}
