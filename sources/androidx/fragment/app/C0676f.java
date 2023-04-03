package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;

/* renamed from: androidx.fragment.app.f */
/* compiled from: FragmentLayoutInflaterFactory */
public class C0676f implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final FragmentManager f3837a;

    /* renamed from: androidx.fragment.app.f$a */
    /* compiled from: FragmentLayoutInflaterFactory */
    public class C0677a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C0680h f3838a;

        public C0677a(C0680h hVar) {
            this.f3838a = hVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f3838a.mo6219k();
            this.f3838a.mo6221m();
            SpecialEffectsController.m4815o((ViewGroup) k.mView.getParent(), C0676f.this.f3837a).mo6107j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C0676f(FragmentManager fragmentManager) {
        this.f3837a = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0680h hVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3837a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g65.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(g65.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(g65.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(g65.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0674d.m4890b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3837a.mo5981k0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3837a.mo5984l0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3837a.mo5981k0(id);
        }
        if (fragment == null) {
            fragment = this.f3837a.mo6012v0().mo6039a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.f3837a;
            fragment.mFragmentManager = fragmentManager;
            fragment.mHost = fragmentManager.mo6018x0();
            fragment.onInflate(this.f3837a.mo6018x0().mo6184f(), attributeSet, fragment.mSavedFragmentState);
            hVar = this.f3837a.mo5977j(fragment);
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentManager fragmentManager2 = this.f3837a;
            fragment.mFragmentManager = fragmentManager2;
            fragment.mHost = fragmentManager2.mo6018x0();
            fragment.onInflate(this.f3837a.mo6018x0().mo6184f(), attributeSet, fragment.mSavedFragmentState);
            hVar = this.f3837a.mo6020y(fragment);
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragment);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.m5000i(fragment, viewGroup);
        fragment.mContainer = viewGroup;
        hVar.mo6221m();
        hVar.mo6218j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new C0677a(hVar));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
