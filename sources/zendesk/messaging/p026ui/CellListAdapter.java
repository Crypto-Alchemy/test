package zendesk.messaging.p026ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zendesk.messaging.ui.CellListAdapter */
class CellListAdapter extends C1330o<MessagingCell, RecyclerView.C1231a0> {

    /* renamed from: zendesk.messaging.ui.CellListAdapter$CellDiffUtil */
    public static class CellDiffUtil extends C1294g.C1300f<MessagingCell> {
        public boolean areContentsTheSame(MessagingCell messagingCell, MessagingCell messagingCell2) {
            return messagingCell.areContentsTheSame(messagingCell2);
        }

        public boolean areItemsTheSame(MessagingCell messagingCell, MessagingCell messagingCell2) {
            if (messagingCell.getId().equals(MessagingCellFactory.TYPING_INDICATOR_ID)) {
                return false;
            }
            return messagingCell.getId().equals(messagingCell2.getId());
        }
    }

    public CellListAdapter() {
        super(new CellDiffUtil());
    }

    public int getItemViewType(int i) {
        return ((MessagingCell) getItem(i)).getLayoutRes();
    }

    public void onBindViewHolder(RecyclerView.C1231a0 a0Var, int i) {
        MessagingCell messagingCell = (MessagingCell) getItem(i);
        View view = a0Var.itemView;
        if (messagingCell.getViewClassType().isInstance(view)) {
            messagingCell.bind(view);
        }
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerView.C1231a0(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false)) {
        };
    }
}
