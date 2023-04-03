package zendesk.messaging.p026ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.ResponseOptionsAdapter */
class ResponseOptionsAdapter extends C1330o<MessagingItem.Option, RecyclerView.C1231a0> {
    /* access modifiers changed from: private */
    public boolean canSelectOption = true;
    /* access modifiers changed from: private */
    public ResponseOptionHandler responseOptionHandler;
    private MessagingItem.Option selectedOption = null;

    /* renamed from: zendesk.messaging.ui.ResponseOptionsAdapter$ResponseOptionsDiffCallback */
    public static class ResponseOptionsDiffCallback extends C1294g.C1300f<MessagingItem.Option> {
        private ResponseOptionsDiffCallback() {
        }

        public boolean areContentsTheSame(MessagingItem.Option option, MessagingItem.Option option2) {
            return option.equals(option2);
        }

        public boolean areItemsTheSame(MessagingItem.Option option, MessagingItem.Option option2) {
            return option.equals(option2);
        }
    }

    public ResponseOptionsAdapter() {
        super(new ResponseOptionsDiffCallback());
    }

    private void notifyItemChanged(MessagingItem.Option option) {
        for (int i = 0; i < getItemCount(); i++) {
            if (((MessagingItem.Option) getItem(i)).equals(option)) {
                notifyItemChanged(i);
                return;
            }
        }
    }

    public int getItemViewType(int i) {
        if (((MessagingItem.Option) getItem(i)) == this.selectedOption) {
            return R$layout.zui_response_options_selected_option;
        }
        return R$layout.zui_response_options_option;
    }

    public void onBindViewHolder(final RecyclerView.C1231a0 a0Var, int i) {
        final MessagingItem.Option option = (MessagingItem.Option) getItem(i);
        ((TextView) a0Var.itemView.findViewById(R$id.zui_response_option_text)).setText(option.getText());
        a0Var.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ResponseOptionsAdapter.this.canSelectOption) {
                    if (ResponseOptionsAdapter.this.responseOptionHandler != null) {
                        a0Var.itemView.post(new Runnable() {
                            public void run() {
                                ResponseOptionsAdapter.this.responseOptionHandler.onResponseOptionSelected(option);
                            }
                        });
                    }
                    boolean unused = ResponseOptionsAdapter.this.canSelectOption = false;
                }
            }
        });
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerView.C1231a0(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false)) {
        };
    }

    public void setResponseOptionHandler(ResponseOptionHandler responseOptionHandler2) {
        this.responseOptionHandler = responseOptionHandler2;
    }

    public void setSelectedOption(MessagingItem.Option option) {
        this.selectedOption = option;
        notifyItemChanged(option);
    }

    public void submitList(List<MessagingItem.Option> list) {
        super.submitList(list);
        this.canSelectOption = true;
        this.selectedOption = null;
    }
}
