package zendesk.support.guide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.zendesk.logger.Logger;
import zendesk.support.ArticleVote;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;

class ArticleVotingView extends RelativeLayout {
    /* access modifiers changed from: private */
    public Long articleId;
    /* access modifiers changed from: private */
    public ArticleVote articleVote;
    /* access modifiers changed from: private */
    public ArticleVoteStorage articleVoteStorage;
    private ImageButton downvoteButton;
    private ViewGroup downvoteButtonFrame;
    private HelpCenterProvider helpCenterProvider;
    private ImageButton upvoteButton;
    private ViewGroup upvoteButtonFrame;

    /* renamed from: zendesk.support.guide.ArticleVotingView$6 */
    public static /* synthetic */ class C100226 {
        public static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                zendesk.support.guide.ArticleVotingView$VoteState[] r0 = zendesk.support.guide.ArticleVotingView.VoteState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState = r0
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.UPVOTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState     // Catch:{ NoSuchFieldError -> 0x0028 }
                zendesk.support.guide.ArticleVotingView$VoteState r1 = zendesk.support.guide.ArticleVotingView.VoteState.DOWNVOTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.ArticleVotingView.C100226.<clinit>():void");
        }
    }

    public enum VoteState {
        UPVOTED,
        DOWNVOTED,
        NONE;

        public static VoteState fromArticleVote(ArticleVote articleVote) {
            if (articleVote == null || articleVote.getValue() == null) {
                return NONE;
            }
            int intValue = articleVote.getValue().intValue();
            if (intValue > 0) {
                return UPVOTED;
            }
            if (intValue < 0) {
                return DOWNVOTED;
            }
            return NONE;
        }
    }

    public ArticleVotingView(Context context) {
        super(context);
        setupViews(context);
    }

    private GradientDrawable buildButtonBackground(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(l25.zs_help_voting_button_border_corner_radius);
        int c = zr0.m31440c(context, x15.zs_help_voting_button_border);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(l25.zs_help_voting_button_border_width);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) dimensionPixelSize);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(dimensionPixelSize2, c);
        return gradientDrawable;
    }

    private ColorStateList colorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{16843518}, new int[]{16842919}, new int[0]}, new int[]{i, i, i2});
    }

    /* access modifiers changed from: private */
    public void downvoteArticle() {
        boolean z;
        if (this.articleId == null) {
            Logger.m43087k(ViewArticleActivity.LOG_TAG, "Cannot downvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hcp == null -> ");
        if (this.helpCenterProvider == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Logger.m43081e(ViewArticleActivity.LOG_TAG, sb.toString(), new Object[0]);
        this.helpCenterProvider.downvoteArticle(this.articleId, new op7<ArticleVote>() {
            public void onError(hr1 hr1) {
                Logger.m43078b(ViewArticleActivity.LOG_TAG, "Failed to downvote article. " + hr1, new Object[0]);
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(n45.zs_view_article_voted_failed_accessibility_announce));
                ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }

            public void onSuccess(ArticleVote articleVote) {
                Logger.m43078b(ViewArticleActivity.LOG_TAG, "Successfully downvoted article!", new Object[0]);
                ArticleVote unused = ArticleVotingView.this.articleVote = articleVote;
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(n45.zs_view_article_voted_no_accessibility_announce));
                ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }
        });
    }

    private StateListDrawable getVotingButtonBackground(int i) {
        GradientDrawable buildButtonBackground = buildButtonBackground(getContext(), i);
        GradientDrawable buildButtonBackground2 = buildButtonBackground(getContext(), -1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, buildButtonBackground);
        stateListDrawable.addState(new int[]{16842919}, buildButtonBackground);
        stateListDrawable.addState(new int[0], buildButtonBackground2);
        return stateListDrawable;
    }

    /* access modifiers changed from: private */
    public void removeVote() {
        if (this.articleId == null) {
            Logger.m43087k(ViewArticleActivity.LOG_TAG, "Article vote was null, could not remove vote", new Object[0]);
        } else if (this.articleVote.getId() != null) {
            this.helpCenterProvider.deleteVote(this.articleVote.getId(), new op7<Void>() {
                public void onError(hr1 hr1) {
                    Logger.m43078b(ViewArticleActivity.LOG_TAG, "Failed to remove vote. " + hr1.mo43368j() + "\n" + hr1.mo43364g() + "\n" + hr1.getUrl(), new Object[0]);
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.updateButtons(VoteState.fromArticleVote(articleVotingView.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                public void onSuccess(Void voidR) {
                    Logger.m43078b(ViewArticleActivity.LOG_TAG, "Successfully removed vote!", new Object[0]);
                    ArticleVote unused = ArticleVotingView.this.articleVote = null;
                    ArticleVotingView.this.articleVoteStorage.removeStoredArticleVote(ArticleVotingView.this.articleId);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void setVotingButtonsClickable(boolean z) {
        this.upvoteButton.setClickable(z);
        this.downvoteButton.setClickable(z);
    }

    private void setupViews(Context context) {
        LayoutInflater.from(context).inflate(f45.zs_view_article_voting, this);
        this.upvoteButtonFrame = (ViewGroup) findViewById(k35.upvote_button_frame);
        this.upvoteButton = (ImageButton) findViewById(k35.upvote_button);
        this.downvoteButtonFrame = (ViewGroup) findViewById(k35.downvote_button_frame);
        this.downvoteButton = (ImageButton) findViewById(k35.downvote_button);
        int e = k37.m75281e(k15.colorPrimary, getContext(), x15.zs_fallback_text_color);
        themeVotingButton(this.upvoteButton, t25.zs_ic_thumb_up, e);
        themeVotingButton(this.downvoteButton, t25.zs_ic_thumb_down, e);
        this.upvoteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote == null || ArticleVotingView.this.articleVote.getValue() == null || !ArticleVotingView.this.articleVote.getValue().equals(1)) {
                    voteState = VoteState.UPVOTED;
                    ArticleVotingView.this.upvoteArticle();
                } else {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
        this.downvoteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote == null || ArticleVotingView.this.articleVote.getValue() == null || !ArticleVotingView.this.articleVote.getValue().equals(-1)) {
                    voteState = VoteState.DOWNVOTED;
                    ArticleVotingView.this.downvoteArticle();
                } else {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
    }

    private void themeVotingButton(ImageButton imageButton, int i, int i2) {
        ga7.m17793t0(imageButton, getVotingButtonBackground(i2));
        Drawable r = ij1.m19659r(zr0.m31442e(getContext(), i));
        ij1.m19656o(r, colorStateList(-1, i2));
        ij1.m19657p(r, PorterDuff.Mode.SRC_IN);
        imageButton.setImageDrawable(r);
    }

    /* access modifiers changed from: private */
    public void updateButtons(VoteState voteState) {
        if (voteState == VoteState.NONE) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.UPVOTED) {
            this.upvoteButtonFrame.setActivated(true);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.DOWNVOTED) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(true);
        }
        updateContentDesc(voteState);
    }

    private void updateContentDesc(VoteState voteState) {
        int i = C100226.$SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[voteState.ordinal()];
        if (i == 1) {
            this.upvoteButton.setContentDescription(getResources().getString(n45.zs_view_article_vote_yes_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(n45.zs_view_article_vote_no_accessibility));
        } else if (i == 2) {
            this.upvoteButton.setContentDescription(getResources().getString(n45.zs_view_article_vote_no_remove_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(n45.zs_view_article_vote_no_accessibility));
        } else if (i != 3) {
            Logger.m43078b(ViewArticleActivity.LOG_TAG, "Unhandled voteState case", new Object[0]);
        } else {
            this.upvoteButton.setContentDescription(getResources().getString(n45.zs_view_article_vote_yes_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(n45.zs_view_article_vote_yes_remove_accessibility));
        }
    }

    /* access modifiers changed from: private */
    public void upvoteArticle() {
        Long l = this.articleId;
        if (l == null) {
            Logger.m43087k(ViewArticleActivity.LOG_TAG, "Cannot upvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
        } else {
            this.helpCenterProvider.upvoteArticle(l, new op7<ArticleVote>() {
                public void onError(hr1 hr1) {
                    Logger.m43078b(ViewArticleActivity.LOG_TAG, "Failed to upvote article. " + hr1, new Object[0]);
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(n45.zs_view_article_voted_failed_accessibility_announce));
                    ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                    articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                public void onSuccess(ArticleVote articleVote) {
                    Logger.m43078b(ViewArticleActivity.LOG_TAG, "Successfully upvoted article!", new Object[0]);
                    ArticleVote unused = ArticleVotingView.this.articleVote = articleVote;
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(n45.zs_view_article_voted_yes_accessibility_announce));
                    ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    public void bindTo(Long l, ArticleVoteStorage articleVoteStorage2, HelpCenterProvider helpCenterProvider2) {
        this.articleVoteStorage = articleVoteStorage2;
        this.helpCenterProvider = helpCenterProvider2;
        this.articleId = l;
        if (l != null) {
            ArticleVote storedArticleVote = articleVoteStorage2.getStoredArticleVote(l);
            this.articleVote = storedArticleVote;
            updateButtons(VoteState.fromArticleVote(storedArticleVote));
        }
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupViews(context);
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setupViews(context);
    }
}
