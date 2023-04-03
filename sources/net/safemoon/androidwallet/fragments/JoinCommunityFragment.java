package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.sqlcipher.database.SQLiteDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bM\u0010NJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\u001d\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010&\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001a\u0010)\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001a\u0010+\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u001a\u0010.\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001cR\u001a\u00101\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR\u001a\u00104\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001cR\u001a\u00107\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u001cR\u001a\u00109\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b8\u0010\u001cR\u001a\u0010;\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b:\u0010\u001cR\u001a\u0010>\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b<\u0010\u001a\u001a\u0004\b=\u0010\u001cR\u001a\u0010A\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b?\u0010\u001a\u001a\u0004\b@\u0010\u001cR\u001a\u0010D\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\bB\u0010\u001a\u001a\u0004\bC\u0010\u001cR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006O"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/JoinCommunityFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "", "packageName", "Landroid/content/Context;", "context", "", "A", "link", "Lr37;", "M", "K", "id", "L", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "k", "Ljava/lang/String;", "getLINK_WEB", "()Ljava/lang/String;", "LINK_WEB", "r", "getLINK_TWITER", "LINK_TWITER", "s", "getLINK_FACEBOOK", "LINK_FACEBOOK", "x", "getLINK_DISCORD", "LINK_DISCORD", "y", "getLINK_REDDIT", "LINK_REDDIT", "getLINK_INSTAGRAM", "LINK_INSTAGRAM", "B", "getLINK_LINKEDIN", "LINK_LINKEDIN", "C", "getLINK_YOUTUBE", "LINK_YOUTUBE", "H", "getID_TWITER", "ID_TWITER", "I", "getID_FACEBOOK", "ID_FACEBOOK", "getID_DISCORD", "ID_DISCORD", "getID_REDDIT", "ID_REDDIT", "P", "getID_INSTAGRAM", "ID_INSTAGRAM", "Q", "getID_LINKEDIN", "ID_LINKEDIN", "U", "getID_YOUTUBE", "ID_YOUTUBE", "Lw92;", "X", "Lw92;", "getBinding", "()Lw92;", "setBinding", "(Lw92;)V", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: JoinCommunityFragment.kt */
public final class JoinCommunityFragment extends BaseMainFragment {

    /* renamed from: A */
    public final String f41954A = "https://www.instagram.com/safemoonhq/";

    /* renamed from: B */
    public final String f41955B = "https://www.linkedin.com/company/safemoon/";

    /* renamed from: C */
    public final String f41956C = "https://www.youtube.com/safemoonhq";

    /* renamed from: H */
    public final String f41957H = "com.twitter.android";

    /* renamed from: I */
    public final String f41958I = "com.facebook.katana";

    /* renamed from: L */
    public final String f41959L = "com.discord";

    /* renamed from: M */
    public final String f41960M = "com.reddit.frontpage";

    /* renamed from: P */
    public final String f41961P = "com.instagram.android";

    /* renamed from: Q */
    public final String f41962Q = "com.linkedin.android";

    /* renamed from: U */
    public final String f41963U = "com.google.android.youtube";

    /* renamed from: X */
    public w92 f41964X;

    /* renamed from: k */
    public final String f41965k = "https://safemoon.com/";

    /* renamed from: r */
    public final String f41966r = "https://twitter.com/safemoon";

    /* renamed from: s */
    public final String f41967s = "https://facebook.com/safemoonofficial";

    /* renamed from: x */
    public final String f41968x = "https://discord.gg/safemoon";

    /* renamed from: y */
    public final String f41969y = "https://www.reddit.com/r/SafeMoon/";

    /* renamed from: B */
    public static final void m66570B(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.requireActivity().onBackPressed();
    }

    /* renamed from: C */
    public static final void m66571C(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57494M(joinCommunityFragment.f41965k);
    }

    /* renamed from: D */
    public static final void m66572D(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57493L(joinCommunityFragment.f41957H, joinCommunityFragment.f41966r);
    }

    /* renamed from: E */
    public static final void m66573E(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57493L(joinCommunityFragment.f41959L, joinCommunityFragment.f41968x);
    }

    /* renamed from: F */
    public static final void m66574F(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57493L(joinCommunityFragment.f41958I, joinCommunityFragment.f41967s);
    }

    /* renamed from: G */
    public static final void m66575G(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57493L(joinCommunityFragment.f41960M, joinCommunityFragment.f41969y);
    }

    /* renamed from: H */
    public static final void m66576H(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57493L(joinCommunityFragment.f41961P, joinCommunityFragment.f41954A);
    }

    /* renamed from: I */
    public static final void m66577I(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57493L(joinCommunityFragment.f41962Q, joinCommunityFragment.f41955B);
    }

    /* renamed from: J */
    public static final void m66578J(JoinCommunityFragment joinCommunityFragment, View view) {
        vx2.m53591g(joinCommunityFragment, "this$0");
        joinCommunityFragment.mo57493L(joinCommunityFragment.f41963U, joinCommunityFragment.f41956C);
    }

    /* renamed from: A */
    public final boolean mo57491A(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: K */
    public final void mo57492K(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        startActivity(intent);
    }

    /* renamed from: L */
    public final void mo57493L(String str, String str2) {
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        if (mo57491A(str, requireContext)) {
            mo57492K(str2);
        } else {
            mo57494M(str2);
        }
    }

    /* renamed from: M */
    public final void mo57494M(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        w92 a = w92.m53763a(layoutInflater.inflate(R.layout.fragment_join_community, viewGroup, false));
        this.f41964X = a;
        if (a != null) {
            return a.mo48917b();
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        w92 w92 = this.f41964X;
        if (w92 != null) {
            b36 b36 = w92.f35266j;
            b36.f21125c.setOnClickListener(new m33(this));
            b36.f21127e.setText(R.string.join_community);
            w92.f35264h.setOnClickListener(new n33(this));
            w92.f35263g.setOnClickListener(new o33(this));
            w92.f35258b.setOnClickListener(new p33(this));
            w92.f35259c.setOnClickListener(new q33(this));
            w92.f35262f.setOnClickListener(new r33(this));
            w92.f35260d.setOnClickListener(new s33(this));
            w92.f35261e.setOnClickListener(new t33(this));
            w92.f35265i.setOnClickListener(new u33(this));
        }
    }
}
