package zendesk.support.guide;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zendesk.logger.Logger;
import java.util.List;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.CategoryItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;

class HelpRecyclerViewAdapter extends RecyclerView.Adapter<HelpViewHolder> implements HelpMvp$View {
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public int defaultCategoryTitleColour;
    /* access modifiers changed from: private */
    public final HelpCenterConfiguration helpCenterUiConfig;
    /* access modifiers changed from: private */
    public int highlightCategoryTitleColour;
    /* access modifiers changed from: private */
    public HelpMvp$Presenter presenter;

    public class ArticleViewHolder extends HelpViewHolder {
        public ArticleViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
        }

        public void bindTo(final HelpItem helpItem, int i) {
            if (helpItem == null || helpItem.getId() == null) {
                Logger.m43081e(HelpCenterActivity.LOG_TAG, "Article item was null, cannot bind", new Object[0]);
                return;
            }
            this.textView.setText(k37.m75277a(helpItem.getName()));
            this.textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ViewArticleActivity.builder(helpItem.getId().longValue()).show(HelpRecyclerViewAdapter.this.context, HelpRecyclerViewAdapter.this.helpCenterUiConfig.getConfigurations());
                }
            });
        }
    }

    public class CategoryViewHolder extends HelpViewHolder {
        private static final int ROTATION_END_LEVEL = 10000;
        private static final String ROTATION_PROPERTY_NAME = "level";
        private static final int ROTATION_START_LEVEL = 0;
        /* access modifiers changed from: private */
        public boolean expanded;
        /* access modifiers changed from: private */
        public Drawable expanderDrawable;

        public CategoryViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
            Drawable mutate = ij1.m19659r(zr0.m31442e(view.getContext(), t25.zs_help_ic_expand_more)).mutate();
            this.expanderDrawable = mutate;
            ij1.m19655n(mutate, k37.m75281e(16842808, HelpRecyclerViewAdapter.this.context, x15.zs_fallback_text_color));
            ij1.m19657p(this.expanderDrawable, PorterDuff.Mode.SRC_IN);
            ((TextView) view).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.expanderDrawable, (Drawable) null);
        }

        /* access modifiers changed from: private */
        public void setHighlightColor(boolean z) {
            if (z) {
                this.textView.setTextColor(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour);
                this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour, PorterDuff.Mode.SRC_IN);
                return;
            }
            this.textView.setTextColor(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour);
            this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour, PorterDuff.Mode.SRC_IN);
        }

        public void bindTo(HelpItem helpItem, final int i) {
            int i2 = 0;
            if (helpItem == null) {
                Logger.m43081e(HelpCenterActivity.LOG_TAG, "Category item was null, cannot bind", new Object[0]);
                return;
            }
            this.textView.setText(k37.m75277a(helpItem.getName()));
            final CategoryItem categoryItem = (CategoryItem) helpItem;
            boolean isExpanded = categoryItem.isExpanded();
            this.expanded = isExpanded;
            Drawable drawable = this.expanderDrawable;
            if (isExpanded) {
                i2 = ROTATION_END_LEVEL;
            }
            drawable.setLevel(i2);
            setHighlightColor(categoryItem.isExpanded());
            this.textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CategoryViewHolder categoryViewHolder = CategoryViewHolder.this;
                    boolean unused = categoryViewHolder.expanded = HelpRecyclerViewAdapter.this.presenter.onCategoryClick(categoryItem, i);
                    Drawable access$300 = CategoryViewHolder.this.expanderDrawable;
                    int[] iArr = new int[2];
                    boolean access$100 = CategoryViewHolder.this.expanded;
                    int i = CategoryViewHolder.ROTATION_END_LEVEL;
                    iArr[0] = access$100 ? 0 : CategoryViewHolder.ROTATION_END_LEVEL;
                    if (!CategoryViewHolder.this.expanded) {
                        i = 0;
                    }
                    iArr[1] = i;
                    ObjectAnimator.ofInt(access$300, CategoryViewHolder.ROTATION_PROPERTY_NAME, iArr).start();
                    CategoryViewHolder categoryViewHolder2 = CategoryViewHolder.this;
                    categoryViewHolder2.setHighlightColor(categoryViewHolder2.expanded);
                }
            });
        }

        public boolean isExpanded() {
            return this.expanded;
        }
    }

    public class ExtraPaddingViewHolder extends HelpViewHolder {
        public ExtraPaddingViewHolder(View view) {
            super(view);
        }

        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    public static abstract class HelpViewHolder extends RecyclerView.C1231a0 {
        public TextView textView;

        public HelpViewHolder(View view) {
            super(view);
        }

        public abstract void bindTo(HelpItem helpItem, int i);
    }

    public class LoadingViewHolder extends HelpViewHolder {
        public LoadingViewHolder(View view) {
            super(view);
        }

        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    public class NoResultsViewHolder extends HelpViewHolder {
        public NoResultsViewHolder(View view) {
            super(view);
        }

        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    public class SectionViewHolder extends HelpViewHolder {
        public SectionViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(k35.section_title);
        }

        public void bindTo(HelpItem helpItem, int i) {
            if (helpItem == null) {
                Logger.m43081e(HelpCenterActivity.LOG_TAG, "Section item was null, cannot bind", new Object[0]);
            } else {
                this.textView.setText(k37.m75277a(helpItem.getName()));
            }
        }
    }

    public class SeeAllViewHolder extends HelpViewHolder {
        /* access modifiers changed from: private */
        public ProgressBar progressBar;

        public SeeAllViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(k35.help_section_action_button);
            this.progressBar = (ProgressBar) view.findViewById(k35.help_section_loading_progress);
        }

        public void bindTo(final HelpItem helpItem, int i) {
            String str;
            if (!(helpItem instanceof SeeAllArticlesItem)) {
                Logger.m43081e(HelpCenterActivity.LOG_TAG, "SeeAll item was null, cannot bind", new Object[0]);
                return;
            }
            final SeeAllArticlesItem seeAllArticlesItem = (SeeAllArticlesItem) helpItem;
            if (seeAllArticlesItem.isLoading()) {
                this.textView.setVisibility(8);
                this.progressBar.setVisibility(0);
            } else {
                this.textView.setVisibility(0);
                this.progressBar.setVisibility(8);
            }
            SectionItem section = seeAllArticlesItem.getSection();
            if (section != null) {
                str = HelpRecyclerViewAdapter.this.context.getString(n45.support_help_see_all_n_articles_label, new Object[]{Integer.valueOf(section.getTotalArticlesCount())});
            } else {
                str = HelpRecyclerViewAdapter.this.context.getString(n45.support_help_see_all_articles_label);
            }
            this.textView.setText(str);
            this.textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    SeeAllViewHolder.this.textView.setVisibility(8);
                    SeeAllViewHolder.this.progressBar.setVisibility(0);
                    HelpRecyclerViewAdapter.this.presenter.onSeeAllClick((SeeAllArticlesItem) helpItem);
                    seeAllArticlesItem.setLoading(true);
                }
            });
        }
    }

    public HelpRecyclerViewAdapter(HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider, NetworkInfoProvider networkInfoProvider) {
        this.presenter = new HelpAdapterPresenter(this, new HelpModel(helpCenterProvider), networkInfoProvider, helpCenterConfiguration);
        this.helpCenterUiConfig = helpCenterConfiguration;
    }

    private View inflateView(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    public void addItem(int i, HelpItem helpItem) {
        notifyItemInserted(i);
    }

    public int getItemCount() {
        return this.presenter.getItemCount();
    }

    public int getItemViewType(int i) {
        return this.presenter.getItemViewType(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Context context2 = recyclerView.getContext();
        this.context = context2;
        this.highlightCategoryTitleColour = k37.m75281e(k15.colorPrimary, context2, x15.zs_fallback_text_color);
        this.defaultCategoryTitleColour = zr0.m31440c(this.context, x15.zs_help_text_color_primary);
        this.presenter.onAttached();
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.presenter.onDetached();
        this.context = null;
    }

    public void removeItem(int i) {
        notifyItemRemoved(i);
    }

    public void setContentUpdateListener(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        HelpMvp$Presenter helpMvp$Presenter = this.presenter;
        if (helpMvp$Presenter != null) {
            helpMvp$Presenter.setContentPresenter(helpCenterMvp$Presenter);
        }
    }

    public void showItems(List<HelpItem> list) {
        notifyDataSetChanged();
    }

    public void onBindViewHolder(HelpViewHolder helpViewHolder, int i) {
        if (helpViewHolder == null) {
            Logger.m43087k(HelpCenterActivity.LOG_TAG, "Holder was null, possible unexpected item type", new Object[0]);
        } else {
            helpViewHolder.bindTo(this.presenter.getItemForBinding(i), i);
        }
    }

    public HelpViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new CategoryViewHolder(inflateView(viewGroup, f45.zs_row_category));
            case 2:
                return new SectionViewHolder(inflateView(viewGroup, f45.zs_row_section));
            case 3:
                return new ArticleViewHolder(inflateView(viewGroup, f45.zs_row_article));
            case 4:
                return new SeeAllViewHolder(inflateView(viewGroup, f45.zs_row_action));
            case 5:
                return new LoadingViewHolder(inflateView(viewGroup, f45.zs_row_loading_progress));
            case 7:
                return new NoResultsViewHolder(inflateView(viewGroup, f45.zs_row_no_articles_found));
            case 8:
                return new ExtraPaddingViewHolder(inflateView(viewGroup, f45.zs_row_padding));
            default:
                Logger.m43087k(HelpCenterActivity.LOG_TAG, "Unknown item type, returning null for holder", new Object[0]);
                return null;
        }
    }
}
