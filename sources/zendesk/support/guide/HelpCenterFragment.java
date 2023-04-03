package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;

public class HelpCenterFragment extends Fragment {
    public static final String LOG_TAG = "HelpCenterFragment";
    private HelpRecyclerViewAdapter adapter;
    public HelpCenterProvider helpCenterProvider;
    public NetworkInfoProvider networkInfoProvider;
    private HelpCenterMvp$Presenter presenter;
    private RecyclerView recyclerView;

    @SuppressLint({"RestrictedApi"})
    public static HelpCenterFragment newInstance(HelpCenterConfiguration helpCenterConfiguration) {
        Bundle bundle = new Bundle();
        so0.m75304b(bundle, helpCenterConfiguration);
        HelpCenterFragment helpCenterFragment = new HelpCenterFragment();
        helpCenterFragment.setArguments(bundle);
        return helpCenterFragment;
    }

    private void setupRecyclerView() {
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.recyclerView.mo9067h(new SeparatorDecoration(zr0.m31442e(getContext(), t25.zs_help_separator)));
        this.recyclerView.setAdapter(this.adapter);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (guideSdkDependencyProvider.isInitialized()) {
            guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
            HelpRecyclerViewAdapter helpRecyclerViewAdapter = new HelpRecyclerViewAdapter((HelpCenterConfiguration) so0.m75307e(getArguments(), HelpCenterConfiguration.class), this.helpCenterProvider, this.networkInfoProvider);
            this.adapter = helpRecyclerViewAdapter;
            HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
            if (helpCenterMvp$Presenter != null) {
                helpRecyclerViewAdapter.setContentUpdateListener(helpCenterMvp$Presenter);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(f45.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(k35.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void setPresenter(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        this.presenter = helpCenterMvp$Presenter;
        HelpRecyclerViewAdapter helpRecyclerViewAdapter = this.adapter;
        if (helpRecyclerViewAdapter != null) {
            helpRecyclerViewAdapter.setContentUpdateListener(helpCenterMvp$Presenter);
        }
    }
}
