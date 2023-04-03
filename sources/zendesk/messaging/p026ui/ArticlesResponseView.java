package zendesk.messaging.p026ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
import zendesk.messaging.R$string;

/* renamed from: zendesk.messaging.ui.ArticlesResponseView */
public class ArticlesResponseView extends LinearLayout implements Updatable<State> {
    private AvatarView avatarView;
    private View botLabel;
    private View firstArticleSuggestion;
    private TextView header;
    private View labelContainer;
    private TextView labelField;
    private View secondArticleSuggestion;
    private View thirdArticleSuggestion;

    /* renamed from: zendesk.messaging.ui.ArticlesResponseView$ArticleSuggestionViewState */
    public static class ArticleSuggestionViewState {
        private final OnArticleSuggestionSelectionListener onArticleSuggestionSelectionListener;
        private final String snippet;
        private final String title;

        public ArticleSuggestionViewState(String str, String str2, OnArticleSuggestionSelectionListener onArticleSuggestionSelectionListener2) {
            this.title = str;
            this.snippet = str2;
            this.onArticleSuggestionSelectionListener = onArticleSuggestionSelectionListener2;
        }

        public OnArticleSuggestionSelectionListener getOnArticleSuggestionSelectionListener() {
            return this.onArticleSuggestionSelectionListener;
        }

        public String getSnippet() {
            return this.snippet;
        }

        public String getTitle() {
            return this.title;
        }
    }

    /* renamed from: zendesk.messaging.ui.ArticlesResponseView$State */
    public static class State {
        private final List<ArticleSuggestionViewState> articleSuggestionViewStates;
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final MessagingCellProps props;

        public State(String str, boolean z, MessagingCellProps messagingCellProps, List<ArticleSuggestionViewState> list, AvatarState avatarState2, AvatarStateRenderer avatarStateRenderer2) {
            this.label = str;
            this.isBot = z;
            this.props = messagingCellProps;
            this.articleSuggestionViewStates = list;
            this.avatarState = avatarState2;
            this.avatarStateRenderer = avatarStateRenderer2;
        }

        public List<ArticleSuggestionViewState> getArticleSuggestionViewStates() {
            return this.articleSuggestionViewStates;
        }

        public AvatarState getAvatarState() {
            return this.avatarState;
        }

        public AvatarStateRenderer getAvatarStateRenderer() {
            return this.avatarStateRenderer;
        }

        public ArticleSuggestionViewState getFirstArticleSuggestionViewState() {
            if (this.articleSuggestionViewStates.size() >= 1) {
                return this.articleSuggestionViewStates.get(0);
            }
            return null;
        }

        public int getHeaderText() {
            if (this.articleSuggestionViewStates.size() == 1) {
                return R$string.zui_cell_text_suggested_article_header;
            }
            return R$string.zui_cell_text_suggested_articles_header;
        }

        public String getLabel() {
            return this.label;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public ArticleSuggestionViewState getSecondArticleSuggestionViewState() {
            if (this.articleSuggestionViewStates.size() >= 2) {
                return this.articleSuggestionViewStates.get(1);
            }
            return null;
        }

        public ArticleSuggestionViewState getThirdArticleSuggestionViewState() {
            if (this.articleSuggestionViewStates.size() >= 3) {
                return this.articleSuggestionViewStates.get(2);
            }
            return null;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public ArticlesResponseView(Context context) {
        super(context);
    }

    private void bindArticleSuggestion(final ArticleSuggestionViewState articleSuggestionViewState, View view) {
        int i;
        if (articleSuggestionViewState != null) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (articleSuggestionViewState != null) {
            C99091 r2 = new View.OnClickListener() {
                public void onClick(View view) {
                    articleSuggestionViewState.getOnArticleSuggestionSelectionListener().onArticleSuggestionSelected(ArticlesResponseView.this.getContext());
                }
            };
            ((TextView) view.findViewById(R$id.zui_article_title)).setText(articleSuggestionViewState.getTitle());
            ((TextView) view.findViewById(R$id.zui_article_snippet)).setText(articleSuggestionViewState.getSnippet());
            view.setOnClickListener(r2);
        }
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R$layout.zui_view_articles_response_content, this);
    }

    private void setSuggestionBackgrounds(List<ArticleSuggestionViewState> list) {
        ArrayList<View> arrayList = new ArrayList<>(Arrays.asList(new View[]{this.firstArticleSuggestion, this.secondArticleSuggestion, this.thirdArticleSuggestion}));
        for (View view : arrayList) {
            if (arrayList.indexOf(view) == list.size() - 1) {
                view.setBackgroundResource(R$drawable.zui_background_cell_options_footer);
            } else {
                view.setBackgroundResource(R$drawable.zui_background_cell_options_content);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R$id.zui_agent_message_avatar);
        this.header = (TextView) findViewById(R$id.zui_header_article_suggestions);
        this.firstArticleSuggestion = findViewById(R$id.zui_first_article_suggestion);
        this.secondArticleSuggestion = findViewById(R$id.zui_second_article_suggestion);
        this.thirdArticleSuggestion = findViewById(R$id.zui_third_article_suggestion);
        this.labelField = (TextView) findViewById(R$id.zui_cell_label_text_field);
        this.botLabel = findViewById(R$id.zui_cell_label_supplementary_label);
        this.labelContainer = findViewById(R$id.zui_cell_status_view);
    }

    public ArticlesResponseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void update(State state) {
        this.labelField.setText(state.getLabel());
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
        this.header.setText(state.getHeaderText());
        bindArticleSuggestion(state.getFirstArticleSuggestionViewState(), this.firstArticleSuggestion);
        bindArticleSuggestion(state.getSecondArticleSuggestionViewState(), this.secondArticleSuggestion);
        bindArticleSuggestion(state.getThirdArticleSuggestionViewState(), this.thirdArticleSuggestion);
        setSuggestionBackgrounds(state.getArticleSuggestionViewStates());
    }

    public ArticlesResponseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
