package zendesk.support.guide;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import zendesk.support.guide.HelpRecyclerViewAdapter;

class SeparatorDecoration extends RecyclerView.C1247n {
    private Drawable divider;

    public SeparatorDecoration(Drawable drawable) {
        this.divider = drawable;
    }

    private boolean isItemACategory(RecyclerView.C1231a0 a0Var) {
        return a0Var instanceof HelpRecyclerViewAdapter.CategoryViewHolder;
    }

    private boolean isItemAnExpandedCategory(RecyclerView.C1231a0 a0Var) {
        if (!(a0Var instanceof HelpRecyclerViewAdapter.CategoryViewHolder) || !((HelpRecyclerViewAdapter.CategoryViewHolder) a0Var).isExpanded()) {
            return false;
        }
        return true;
    }

    private boolean isItemAnUnexpandedCategory(RecyclerView.C1231a0 a0Var) {
        if (!(a0Var instanceof HelpRecyclerViewAdapter.CategoryViewHolder) || ((HelpRecyclerViewAdapter.CategoryViewHolder) a0Var).isExpanded()) {
            return false;
        }
        return true;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        super.onDraw(canvas, recyclerView, xVar);
        if (recyclerView.getItemAnimator() == null || !recyclerView.getItemAnimator().isRunning()) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (shouldShowTopSeparator(recyclerView, i)) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    int top = childAt.getTop() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
                    this.divider.setBounds(paddingLeft, top, width, this.divider.getIntrinsicHeight() + top);
                    this.divider.draw(canvas);
                }
            }
        }
    }

    public boolean shouldShowTopSeparator(RecyclerView recyclerView, int i) {
        boolean z;
        boolean isItemACategory = isItemACategory(recyclerView.mo9068h0(recyclerView.getChildAt(i)));
        boolean isItemAnExpandedCategory = isItemAnExpandedCategory(recyclerView.mo9068h0(recyclerView.getChildAt(i)));
        if (i <= 0 || !isItemAnUnexpandedCategory(recyclerView.mo9068h0(recyclerView.getChildAt(i - 1)))) {
            z = false;
        } else {
            z = true;
        }
        if (!isItemACategory) {
            return false;
        }
        if (isItemAnExpandedCategory || !z) {
            return true;
        }
        return false;
    }
}
