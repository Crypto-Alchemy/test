package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.u */
/* compiled from: SimpleItemAnimator */
public abstract class C1342u extends RecyclerView.C1242l {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    public boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.C1231a0 a0Var);

    public boolean animateAppearance(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar, RecyclerView.C1242l.C1245c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f6485a) == (i2 = cVar2.f6485a) && cVar.f6486b == cVar2.f6486b)) {
            return animateAdd(a0Var);
        }
        return animateMove(a0Var, i, cVar.f6486b, i2, cVar2.f6486b);
    }

    public abstract boolean animateChange(RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2, int i, int i2, int i3, int i4);

    public boolean animateChange(RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2, RecyclerView.C1242l.C1245c cVar, RecyclerView.C1242l.C1245c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f6485a;
        int i4 = cVar.f6486b;
        if (a0Var2.shouldIgnore()) {
            int i5 = cVar.f6485a;
            i = cVar.f6486b;
            i2 = i5;
        } else {
            i2 = cVar2.f6485a;
            i = cVar2.f6486b;
        }
        return animateChange(a0Var, a0Var2, i3, i4, i2, i);
    }

    public boolean animateDisappearance(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar, RecyclerView.C1242l.C1245c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f6485a;
        int i4 = cVar.f6486b;
        View view = a0Var.itemView;
        if (cVar2 == null) {
            i = view.getLeft();
        } else {
            i = cVar2.f6485a;
        }
        int i5 = i;
        if (cVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = cVar2.f6486b;
        }
        int i6 = i2;
        if (a0Var.isRemoved() || (i3 == i5 && i4 == i6)) {
            return animateRemove(a0Var);
        }
        view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        return animateMove(a0Var, i3, i4, i5, i6);
    }

    public abstract boolean animateMove(RecyclerView.C1231a0 a0Var, int i, int i2, int i3, int i4);

    public boolean animatePersistence(RecyclerView.C1231a0 a0Var, RecyclerView.C1242l.C1245c cVar, RecyclerView.C1242l.C1245c cVar2) {
        int i = cVar.f6485a;
        int i2 = cVar2.f6485a;
        if (i == i2 && cVar.f6486b == cVar2.f6486b) {
            dispatchMoveFinished(a0Var);
            return false;
        }
        return animateMove(a0Var, i, cVar.f6486b, i2, cVar2.f6486b);
    }

    public abstract boolean animateRemove(RecyclerView.C1231a0 a0Var);

    public boolean canReuseUpdatedViewHolder(RecyclerView.C1231a0 a0Var) {
        if (!this.mSupportsChangeAnimations || a0Var.isInvalid()) {
            return true;
        }
        return false;
    }

    public final void dispatchAddFinished(RecyclerView.C1231a0 a0Var) {
        onAddFinished(a0Var);
        dispatchAnimationFinished(a0Var);
    }

    public final void dispatchAddStarting(RecyclerView.C1231a0 a0Var) {
        onAddStarting(a0Var);
    }

    public final void dispatchChangeFinished(RecyclerView.C1231a0 a0Var, boolean z) {
        onChangeFinished(a0Var, z);
        dispatchAnimationFinished(a0Var);
    }

    public final void dispatchChangeStarting(RecyclerView.C1231a0 a0Var, boolean z) {
        onChangeStarting(a0Var, z);
    }

    public final void dispatchMoveFinished(RecyclerView.C1231a0 a0Var) {
        onMoveFinished(a0Var);
        dispatchAnimationFinished(a0Var);
    }

    public final void dispatchMoveStarting(RecyclerView.C1231a0 a0Var) {
        onMoveStarting(a0Var);
    }

    public final void dispatchRemoveFinished(RecyclerView.C1231a0 a0Var) {
        onRemoveFinished(a0Var);
        dispatchAnimationFinished(a0Var);
    }

    public final void dispatchRemoveStarting(RecyclerView.C1231a0 a0Var) {
        onRemoveStarting(a0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.C1231a0 a0Var) {
    }

    public void onAddStarting(RecyclerView.C1231a0 a0Var) {
    }

    public void onChangeFinished(RecyclerView.C1231a0 a0Var, boolean z) {
    }

    public void onChangeStarting(RecyclerView.C1231a0 a0Var, boolean z) {
    }

    public void onMoveFinished(RecyclerView.C1231a0 a0Var) {
    }

    public void onMoveStarting(RecyclerView.C1231a0 a0Var) {
    }

    public void onRemoveFinished(RecyclerView.C1231a0 a0Var) {
    }

    public void onRemoveStarting(RecyclerView.C1231a0 a0Var) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
