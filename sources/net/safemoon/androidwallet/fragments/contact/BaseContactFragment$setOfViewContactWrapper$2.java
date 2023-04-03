package net.safemoon.androidwallet.fragments.contact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "", "Landroid/view/View;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: BaseContactFragment.kt */
public final class BaseContactFragment$setOfViewContactWrapper$2 extends Lambda implements pc2<Map<Integer, ? extends View>> {
    public final /* synthetic */ BaseContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContactFragment$setOfViewContactWrapper$2(BaseContactFragment baseContactFragment) {
        super(0);
        this.this$0 = baseContactFragment;
    }

    /* renamed from: a */
    public static final void m67975a(BaseContactFragment baseContactFragment, HashMap<Integer, View> hashMap, int i, String str) {
        View inflate = LayoutInflater.from(baseContactFragment.requireContext()).inflate(R.layout.include_wallet_address, (ViewGroup) null, false);
        jt2 a = jt2.m46743a(inflate);
        vx2.m53590f(a, "bind(view)");
        baseContactFragment.mo58069F(a, i);
        TextView textView = a.f30606h;
        String string = baseContactFragment.getString(R.string.add_edit_contact_address);
        textView.setText(str + " " + string);
        EditText editText = a.f30602d;
        String string2 = baseContactFragment.getString(R.string.add_edit_contact_address);
        editText.setHint(str + " " + string2);
        inflate.setTag(Integer.valueOf(i));
        Integer valueOf = Integer.valueOf(i);
        vx2.m53590f(inflate, "view");
        hashMap.put(valueOf, inflate);
    }

    public final Map<Integer, View> invoke() {
        HashMap hashMap = new HashMap();
        List<TokenType> a = Common.f42577a.mo60896a(true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : a) {
            SimilarTypeGroup similarTypeGroup = ((TokenType) next).getCoinType().getSimilarTypeGroup();
            Object obj = linkedHashMap.get(similarTypeGroup);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(similarTypeGroup, obj);
            }
            ((List) obj).add(next);
        }
        BaseContactFragment baseContactFragment = this.this$0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getKey() == SimilarTypeGroup.EVM_CAPABILITY) {
                m67975a(baseContactFragment, hashMap, 0, "EVM");
            } else {
                for (TokenType tokenType : (Iterable) entry.getValue()) {
                    m67975a(baseContactFragment, hashMap, tokenType.getChainId(), tokenType.getChainTitle());
                }
            }
        }
        return C6177b.m47371s(hashMap);
    }
}
