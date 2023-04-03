package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

public class HelpSearchFragment extends Fragment {
    private HelpSearchRecyclerViewAdapter adapter;
    private HelpCenterProvider helpCenterProvider;
    private String query = "";
    private RecyclerView recyclerView;
    private List<SearchArticle> searchArticles = Collections.emptyList();

    @SuppressLint({"RestrictedApi"})
    public static HelpSearchFragment newInstance(HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider2) {
        Bundle bundle = new Bundle();
        so0.m75304b(bundle, helpCenterConfiguration);
        HelpSearchFragment helpSearchFragment = new HelpSearchFragment();
        helpSearchFragment.setArguments(bundle);
        helpSearchFragment.helpCenterProvider = helpCenterProvider2;
        return helpSearchFragment;
    }

    private void setupRecyclerView() {
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = new HelpSearchRecyclerViewAdapter(this.searchArticles, this.query, (HelpCenterConfiguration) so0.m75307e(getArguments(), HelpCenterConfiguration.class), this.helpCenterProvider);
        this.adapter = helpSearchRecyclerViewAdapter;
        this.recyclerView.setAdapter(helpSearchRecyclerViewAdapter);
    }

    public void clearResults() {
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = this.adapter;
        if (helpSearchRecyclerViewAdapter != null) {
            helpSearchRecyclerViewAdapter.clearResults();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(f45.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(k35.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void updateResults(List<SearchArticle> list, String str) {
        RecyclerView recyclerView2;
        this.searchArticles = list;
        this.query = str;
        if (this.adapter != null && (recyclerView2 = this.recyclerView) != null) {
            recyclerView2.setVisibility(0);
            this.adapter.update(list, str);
            this.recyclerView.announceForAccessibility(getString(n45.zs_help_center_search_loaded_accessibility));
        }
    }
}
