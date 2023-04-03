package p000;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: w92 */
/* compiled from: FragmentJoinCommunityBinding */
public final class w92 {

    /* renamed from: a */
    public final LinearLayout f35257a;

    /* renamed from: b */
    public final MaterialButton f35258b;

    /* renamed from: c */
    public final MaterialButton f35259c;

    /* renamed from: d */
    public final MaterialButton f35260d;

    /* renamed from: e */
    public final MaterialButton f35261e;

    /* renamed from: f */
    public final MaterialButton f35262f;

    /* renamed from: g */
    public final MaterialButton f35263g;

    /* renamed from: h */
    public final MaterialButton f35264h;

    /* renamed from: i */
    public final MaterialButton f35265i;

    /* renamed from: j */
    public final b36 f35266j;

    public w92(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7, MaterialButton materialButton8, b36 b36) {
        this.f35257a = linearLayout;
        this.f35258b = materialButton;
        this.f35259c = materialButton2;
        this.f35260d = materialButton3;
        this.f35261e = materialButton4;
        this.f35262f = materialButton5;
        this.f35263g = materialButton6;
        this.f35264h = materialButton7;
        this.f35265i = materialButton8;
        this.f35266j = b36;
    }

    /* renamed from: a */
    public static w92 m53763a(View view) {
        int i = R.id.joinCommunityButtonDiscord;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonDiscord);
        if (materialButton != null) {
            i = R.id.joinCommunityButtonFacebook;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonFacebook);
            if (materialButton2 != null) {
                i = R.id.joinCommunityButtonInstagram;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonInstagram);
                if (materialButton3 != null) {
                    i = R.id.joinCommunityButtonLinkedin;
                    MaterialButton materialButton4 = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonLinkedin);
                    if (materialButton4 != null) {
                        i = R.id.joinCommunityButtonReddit;
                        MaterialButton materialButton5 = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonReddit);
                        if (materialButton5 != null) {
                            i = R.id.joinCommunityButtonTwitter;
                            MaterialButton materialButton6 = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonTwitter);
                            if (materialButton6 != null) {
                                i = R.id.joinCommunityButtonWeb;
                                MaterialButton materialButton7 = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonWeb);
                                if (materialButton7 != null) {
                                    i = R.id.joinCommunityButtonYoutube;
                                    MaterialButton materialButton8 = (MaterialButton) ca7.m11819a(view, R.id.joinCommunityButtonYoutube);
                                    if (materialButton8 != null) {
                                        i = R.id.toolbar;
                                        View a = ca7.m11819a(view, R.id.toolbar);
                                        if (a != null) {
                                            return new w92((LinearLayout) view, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, materialButton7, materialButton8, b36.m32346a(a));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public LinearLayout mo48917b() {
        return this.f35257a;
    }
}
