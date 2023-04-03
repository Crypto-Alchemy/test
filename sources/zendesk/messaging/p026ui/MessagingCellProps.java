package zendesk.messaging.p026ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zendesk.messaging.ui.MessagingCellProps */
class MessagingCellProps {
    private final int avatarVisibility;
    private final int cellSpacing;
    private final int labelVisibility;

    public MessagingCellProps(int i, int i2, int i3) {
        this.labelVisibility = i;
        this.cellSpacing = i2;
        this.avatarVisibility = i3;
    }

    public void apply(View view) {
        apply(view, (View) null, (View) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MessagingCellProps messagingCellProps = (MessagingCellProps) obj;
        if (this.labelVisibility != messagingCellProps.labelVisibility) {
            return false;
        }
        if (this.cellSpacing == messagingCellProps.cellSpacing) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.labelVisibility * 31) + this.cellSpacing;
    }

    public void apply(View view, View view2) {
        apply(view, view2, (View) null);
    }

    public void apply(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(this.labelVisibility);
        }
        if (view3 != null) {
            view3.setVisibility(this.avatarVisibility);
        }
        ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin = this.cellSpacing;
        view.requestLayout();
    }
}
