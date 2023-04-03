package zendesk.support;

class ZendeskHelpCenterSessionCache implements HelpCenterSessionCache {
    public static final LastSearch DEFAULT_SEARCH = new LastSearch("", 0);
    private LastSearch lastSearch;
    private boolean uniqueSearchResultClick = false;

    public LastSearch getLastSearch() {
        LastSearch lastSearch2 = this.lastSearch;
        if (lastSearch2 != null) {
            return lastSearch2;
        }
        return DEFAULT_SEARCH;
    }

    public boolean isUniqueSearchResultClick() {
        return this.uniqueSearchResultClick;
    }

    public void setLastSearch(String str, int i) {
        this.lastSearch = new LastSearch(str, i);
        this.uniqueSearchResultClick = true;
    }

    public void unsetUniqueSearchResultClick() {
        this.uniqueSearchResultClick = false;
    }
}
