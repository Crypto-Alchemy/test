package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: db */
/* compiled from: ActivityWalletManageBinding */
public final class C5729db {

    /* renamed from: A */
    public final TextView f28077A;

    /* renamed from: B */
    public final TextView f28078B;

    /* renamed from: C */
    public final TextView f28079C;

    /* renamed from: D */
    public final TextView f28080D;

    /* renamed from: E */
    public final TextView f28081E;

    /* renamed from: F */
    public final TextView f28082F;

    /* renamed from: G */
    public final TextView f28083G;

    /* renamed from: H */
    public final TextView f28084H;

    /* renamed from: I */
    public final TextView f28085I;

    /* renamed from: J */
    public final TextView f28086J;

    /* renamed from: K */
    public final TextView f28087K;

    /* renamed from: L */
    public final TextView f28088L;

    /* renamed from: M */
    public final TextView f28089M;

    /* renamed from: N */
    public final TextView f28090N;

    /* renamed from: O */
    public final TextView f28091O;

    /* renamed from: P */
    public final TextView f28092P;

    /* renamed from: a */
    public final NestedScrollView f28093a;

    /* renamed from: b */
    public final LinearLayoutCompat f28094b;

    /* renamed from: c */
    public final CardView f28095c;

    /* renamed from: d */
    public final CardView f28096d;

    /* renamed from: e */
    public final CardView f28097e;

    /* renamed from: f */
    public final CardView f28098f;

    /* renamed from: g */
    public final CardView f28099g;

    /* renamed from: h */
    public final CardView f28100h;

    /* renamed from: i */
    public final CardView f28101i;

    /* renamed from: j */
    public final Group f28102j;

    /* renamed from: k */
    public final Group f28103k;

    /* renamed from: l */
    public final Group f28104l;

    /* renamed from: m */
    public final LinearLayoutCompat f28105m;

    /* renamed from: n */
    public final AppCompatImageView f28106n;

    /* renamed from: o */
    public final TextView f28107o;

    /* renamed from: p */
    public final TextView f28108p;

    /* renamed from: q */
    public final TextView f28109q;

    /* renamed from: r */
    public final TextView f28110r;

    /* renamed from: s */
    public final TextView f28111s;

    /* renamed from: t */
    public final TextView f28112t;

    /* renamed from: u */
    public final TextView f28113u;

    /* renamed from: v */
    public final TextInputLayout f28114v;

    /* renamed from: w */
    public final vr6 f28115w;

    /* renamed from: x */
    public final TextView f28116x;

    /* renamed from: y */
    public final TextView f28117y;

    /* renamed from: z */
    public final TextView f28118z;

    public C5729db(NestedScrollView nestedScrollView, LinearLayoutCompat linearLayoutCompat, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, CardView cardView7, Group group, Group group2, Group group3, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextInputLayout textInputLayout, vr6 vr6, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26) {
        this.f28093a = nestedScrollView;
        this.f28094b = linearLayoutCompat;
        this.f28095c = cardView;
        this.f28096d = cardView2;
        this.f28097e = cardView3;
        this.f28098f = cardView4;
        this.f28099g = cardView5;
        this.f28100h = cardView6;
        this.f28101i = cardView7;
        this.f28102j = group;
        this.f28103k = group2;
        this.f28104l = group3;
        this.f28105m = linearLayoutCompat2;
        this.f28106n = appCompatImageView;
        this.f28107o = textView;
        this.f28108p = textView2;
        this.f28109q = textView3;
        this.f28110r = textView4;
        this.f28111s = textView5;
        this.f28112t = textView6;
        this.f28113u = textView7;
        this.f28114v = textInputLayout;
        this.f28115w = vr6;
        this.f28116x = textView8;
        this.f28117y = textView9;
        this.f28118z = textView10;
        this.f28077A = textView11;
        this.f28078B = textView12;
        this.f28079C = textView13;
        this.f28080D = textView14;
        this.f28081E = textView15;
        this.f28082F = textView16;
        this.f28083G = textView17;
        this.f28084H = textView18;
        this.f28085I = textView19;
        this.f28086J = textView20;
        this.f28087K = textView21;
        this.f28088L = textView22;
        this.f28089M = textView23;
        this.f28090N = textView24;
        this.f28091O = textView25;
        this.f28092P = textView26;
    }

    /* renamed from: a */
    public static C5729db m43431a(View view) {
        View view2 = view;
        int i = R.id.coinContainer;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.coinContainer);
        if (linearLayoutCompat != null) {
            i = R.id.cvNativeChainWalletAddress;
            CardView cardView = (CardView) ca7.m11819a(view2, R.id.cvNativeChainWalletAddress);
            if (cardView != null) {
                i = R.id.cvPassPhrase;
                CardView cardView2 = (CardView) ca7.m11819a(view2, R.id.cvPassPhrase);
                if (cardView2 != null) {
                    i = R.id.cvPrivateKey;
                    CardView cardView3 = (CardView) ca7.m11819a(view2, R.id.cvPrivateKey);
                    if (cardView3 != null) {
                        i = R.id.cvRemoveWallet;
                        CardView cardView4 = (CardView) ca7.m11819a(view2, R.id.cvRemoveWallet);
                        if (cardView4 != null) {
                            i = R.id.cvWalletAddress;
                            CardView cardView5 = (CardView) ca7.m11819a(view2, R.id.cvWalletAddress);
                            if (cardView5 != null) {
                                i = R.id.cvWalletLink;
                                CardView cardView6 = (CardView) ca7.m11819a(view2, R.id.cvWalletLink);
                                if (cardView6 != null) {
                                    i = R.id.cvWalletName;
                                    CardView cardView7 = (CardView) ca7.m11819a(view2, R.id.cvWalletName);
                                    if (cardView7 != null) {
                                        i = R.id.gp_pass;
                                        Group group = (Group) ca7.m11819a(view2, R.id.gp_pass);
                                        if (group != null) {
                                            i = R.id.group;
                                            Group group2 = (Group) ca7.m11819a(view2, R.id.group);
                                            if (group2 != null) {
                                                i = R.id.group2;
                                                Group group3 = (Group) ca7.m11819a(view2, R.id.group2);
                                                if (group3 != null) {
                                                    i = R.id.groupOfWalletLink;
                                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ca7.m11819a(view2, R.id.groupOfWalletLink);
                                                    if (linearLayoutCompat2 != null) {
                                                        i = R.id.imWalletLink;
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imWalletLink);
                                                        if (appCompatImageView != null) {
                                                            i = R.id.textNativeWalletAddressTitle;
                                                            TextView textView = (TextView) ca7.m11819a(view2, R.id.textNativeWalletAddressTitle);
                                                            if (textView != null) {
                                                                i = R.id.textView22;
                                                                TextView textView2 = (TextView) ca7.m11819a(view2, R.id.textView22);
                                                                if (textView2 != null) {
                                                                    i = R.id.textView25;
                                                                    TextView textView3 = (TextView) ca7.m11819a(view2, R.id.textView25);
                                                                    if (textView3 != null) {
                                                                        i = R.id.textView35;
                                                                        TextView textView4 = (TextView) ca7.m11819a(view2, R.id.textView35);
                                                                        if (textView4 != null) {
                                                                            i = R.id.textView8;
                                                                            TextView textView5 = (TextView) ca7.m11819a(view2, R.id.textView8);
                                                                            if (textView5 != null) {
                                                                                i = R.id.textViewWalletAddressTitle;
                                                                                TextView textView6 = (TextView) ca7.m11819a(view2, R.id.textViewWalletAddressTitle);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.textViewWalletLinkTitle;
                                                                                    TextView textView7 = (TextView) ca7.m11819a(view2, R.id.textViewWalletLinkTitle);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tilWalletName;
                                                                                        TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view2, R.id.tilWalletName);
                                                                                        if (textInputLayout != null) {
                                                                                            i = R.id.toolbarParent;
                                                                                            View a = ca7.m11819a(view2, R.id.toolbarParent);
                                                                                            if (a != null) {
                                                                                                vr6 a2 = vr6.m53455a(a);
                                                                                                i = R.id.tv_copy;
                                                                                                TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tv_copy);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.tvNameCounter;
                                                                                                    TextView textView9 = (TextView) ca7.m11819a(view2, R.id.tvNameCounter);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.tv_passpharese_reveal;
                                                                                                        TextView textView10 = (TextView) ca7.m11819a(view2, R.id.tv_passpharese_reveal);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.tv_passphrase;
                                                                                                            TextView textView11 = (TextView) ca7.m11819a(view2, R.id.tv_passphrase);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.tvPassphraseSecurityDescription;
                                                                                                                TextView textView12 = (TextView) ca7.m11819a(view2, R.id.tvPassphraseSecurityDescription);
                                                                                                                if (textView12 != null) {
                                                                                                                    i = R.id.tv_private;
                                                                                                                    TextView textView13 = (TextView) ca7.m11819a(view2, R.id.tv_private);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i = R.id.tv_private_copy;
                                                                                                                        TextView textView14 = (TextView) ca7.m11819a(view2, R.id.tv_private_copy);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i = R.id.tv_private_key_reveal;
                                                                                                                            TextView textView15 = (TextView) ca7.m11819a(view2, R.id.tv_private_key_reveal);
                                                                                                                            if (textView15 != null) {
                                                                                                                                i = R.id.tvPrivateKeySecurityDescription;
                                                                                                                                TextView textView16 = (TextView) ca7.m11819a(view2, R.id.tvPrivateKeySecurityDescription);
                                                                                                                                if (textView16 != null) {
                                                                                                                                    i = R.id.tv_remove_wallet;
                                                                                                                                    TextView textView17 = (TextView) ca7.m11819a(view2, R.id.tv_remove_wallet);
                                                                                                                                    if (textView17 != null) {
                                                                                                                                        i = R.id.tvWalletAddressCopy;
                                                                                                                                        TextView textView18 = (TextView) ca7.m11819a(view2, R.id.tvWalletAddressCopy);
                                                                                                                                        if (textView18 != null) {
                                                                                                                                            i = R.id.tvWalletAddressDescription;
                                                                                                                                            TextView textView19 = (TextView) ca7.m11819a(view2, R.id.tvWalletAddressDescription);
                                                                                                                                            if (textView19 != null) {
                                                                                                                                                i = R.id.walletLinkAvaxC;
                                                                                                                                                TextView textView20 = (TextView) ca7.m11819a(view2, R.id.walletLinkAvaxC);
                                                                                                                                                if (textView20 != null) {
                                                                                                                                                    i = R.id.walletLinkBscscan;
                                                                                                                                                    TextView textView21 = (TextView) ca7.m11819a(view2, R.id.walletLinkBscscan);
                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                        i = R.id.walletLinkBtc;
                                                                                                                                                        TextView textView22 = (TextView) ca7.m11819a(view2, R.id.walletLinkBtc);
                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                            i = R.id.walletLinkDoge;
                                                                                                                                                            TextView textView23 = (TextView) ca7.m11819a(view2, R.id.walletLinkDoge);
                                                                                                                                                            if (textView23 != null) {
                                                                                                                                                                i = R.id.walletLinkEtherscan;
                                                                                                                                                                TextView textView24 = (TextView) ca7.m11819a(view2, R.id.walletLinkEtherscan);
                                                                                                                                                                if (textView24 != null) {
                                                                                                                                                                    i = R.id.walletLinkMatic;
                                                                                                                                                                    TextView textView25 = (TextView) ca7.m11819a(view2, R.id.walletLinkMatic);
                                                                                                                                                                    if (textView25 != null) {
                                                                                                                                                                        i = R.id.walletLinkSolana;
                                                                                                                                                                        TextView textView26 = (TextView) ca7.m11819a(view2, R.id.walletLinkSolana);
                                                                                                                                                                        if (textView26 != null) {
                                                                                                                                                                            return new C5729db((NestedScrollView) view2, linearLayoutCompat, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, group, group2, group3, linearLayoutCompat2, appCompatImageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textInputLayout, a2, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    /* renamed from: c */
    public static C5729db m43432c(LayoutInflater layoutInflater) {
        return m43433d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C5729db m43433d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_wallet_manage, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43431a(inflate);
    }

    /* renamed from: b */
    public NestedScrollView mo41885b() {
        return this.f28093a;
    }
}
