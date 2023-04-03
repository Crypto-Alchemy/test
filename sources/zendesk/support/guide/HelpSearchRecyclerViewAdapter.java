package zendesk.support.guide;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zendesk.logger.Logger;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

class HelpSearchRecyclerViewAdapter extends RecyclerView.Adapter {
    private static final int TYPE_ARTICLE = 531;
    private static final int TYPE_NO_RESULTS = 441;
    private static final int TYPE_PADDING = 423;
    /* access modifiers changed from: private */
    public final HelpCenterProvider helpCenterProvider;
    /* access modifiers changed from: private */
    public final HelpCenterConfiguration helpCenterUiConfig;
    /* access modifiers changed from: private */
    public String query;
    private boolean resultsCleared = false;
    private List<SearchArticle> searchArticles;

    public class HelpSearchViewHolder extends RecyclerView.C1231a0 {
        private Context context;
        private TextView subtitleTextView;
        private TextView titleTextView;

        public HelpSearchViewHolder(View view, Context context2) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(k35.title);
            this.subtitleTextView = (TextView) view.findViewById(k35.subtitle);
            this.context = context2;
        }

        public void bindTo(final SearchArticle searchArticle) {
            String str;
            int i;
            if (searchArticle == null || searchArticle.getArticle() == null) {
                Logger.m43081e(HelpCenterActivity.LOG_TAG, "The article was null, cannot bind the view.", new Object[0]);
                return;
            }
            if (searchArticle.getArticle().getTitle() != null) {
                str = searchArticle.getArticle().getTitle();
            } else {
                str = "";
            }
            if (HelpSearchRecyclerViewAdapter.this.query == null) {
                i = -1;
            } else {
                i = str.toLowerCase(Locale.getDefault()).indexOf(HelpSearchRecyclerViewAdapter.this.query.toLowerCase(Locale.getDefault()));
            }
            if (i != -1) {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new StyleSpan(1), i, HelpSearchRecyclerViewAdapter.this.query.length() + i, 18);
                this.titleTextView.setText(spannableString);
            } else {
                this.titleTextView.setText(str);
            }
            this.subtitleTextView.setText(this.context.getString(n45.help_search_subtitle_format, new Object[]{searchArticle.getCategory().getName(), searchArticle.getSection().getName()}));
            this.itemView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    HelpSearchRecyclerViewAdapter.this.helpCenterProvider.submitRecordArticleView(searchArticle.getArticle(), zj3.m55132c(searchArticle.getArticle().getLocale()), new op7<Void>() {
                        public void onError(hr1 hr1) {
                            Logger.m43081e(HelpCenterActivity.LOG_TAG, "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", hr1.mo43366h(), Boolean.valueOf(hr1.mo43363f()), Integer.valueOf(hr1.mo43362e()));
                        }

                        public void onSuccess(Void voidR) {
                        }
                    });
                    ViewArticleActivity.builder(searchArticle.getArticle()).show(HelpSearchViewHolder.this.itemView.getContext(), HelpSearchRecyclerViewAdapter.this.helpCenterUiConfig.getConfigurations());
                }
            });
        }
    }

    public class NoResultsViewHolder extends RecyclerView.C1231a0 {
        public NoResultsViewHolder(View view) {
            super(view);
        }
    }

    public class PaddingViewHolder extends RecyclerView.C1231a0 {
        public PaddingViewHolder(View view) {
            super(view);
        }
    }

    public HelpSearchRecyclerViewAdapter(List<SearchArticle> list, String str, HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider2) {
        this.searchArticles = list;
        this.query = str;
        this.helpCenterUiConfig = helpCenterConfiguration;
        this.helpCenterProvider = helpCenterProvider2;
    }

    private int getPaddingExtraItem() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    public void clearResults() {
        this.resultsCleared = true;
        this.searchArticles = Collections.emptyList();
        this.query = "";
        notifyDataSetChanged();
    }

    public int getItemCount() {
        if (this.resultsCleared) {
            return 0;
        }
        return Math.max(this.searchArticles.size() + getPaddingExtraItem(), 1);
    }

    public int getItemViewType(int i) {
        if (i == 0 && this.searchArticles.size() == 0) {
            return TYPE_NO_RESULTS;
        }
        if (i <= 0 || i != this.searchArticles.size()) {
            return TYPE_ARTICLE;
        }
        return TYPE_PADDING;
    }

    public void onBindViewHolder(RecyclerView.C1231a0 a0Var, int i) {
        if (TYPE_ARTICLE == getItemViewType(i)) {
            ((HelpSearchViewHolder) a0Var).bindTo(this.searchArticles.get(i));
        }
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == TYPE_PADDING) {
            return new PaddingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(f45.zs_row_padding, viewGroup, false));
        }
        if (i == TYPE_NO_RESULTS) {
            return new NoResultsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(f45.zs_row_no_articles_found, viewGroup, false));
        }
        if (i != TYPE_ARTICLE) {
            return null;
        }
        return new HelpSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(f45.zs_row_search_article, viewGroup, false), viewGroup.getContext());
    }

    public void update(List<SearchArticle> list, String str) {
        this.resultsCleared = false;
        this.searchArticles = list;
        this.query = str;
        notifyDataSetChanged();
    }
}
