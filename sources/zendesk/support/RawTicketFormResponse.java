package zendesk.support;

import java.util.List;

class RawTicketFormResponse {
    private List<RawTicketField> ticketFields;
    private List<RawTicketForm> ticketForms;

    public List<RawTicketField> getTicketFields() {
        return kj0.m47112c(this.ticketFields);
    }

    public List<RawTicketForm> getTicketForms() {
        return kj0.m47112c(this.ticketForms);
    }
}
