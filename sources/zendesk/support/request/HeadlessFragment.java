package zendesk.support.request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class HeadlessFragment<E> extends Fragment {
    private static final String TAG = "ZendeskHeadlessFragment";
    private E data;

    private E getData() {
        return this.data;
    }

    public static <E> void install(FragmentManager fragmentManager, E e) {
        HeadlessFragment headlessFragment = new HeadlessFragment();
        headlessFragment.setData(e);
        fragmentManager.mo5996q().mo6264e(headlessFragment, TAG).mo6139j();
    }

    private void setData(E e) {
        this.data = e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setRetainInstance(true);
        return null;
    }

    public static <E> E getData(FragmentManager fragmentManager) {
        Fragment l0 = fragmentManager.mo5984l0(TAG);
        if (l0 instanceof HeadlessFragment) {
            return ((HeadlessFragment) l0).getData();
        }
        return null;
    }
}
