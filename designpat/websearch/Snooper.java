/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.websearch;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        /*
         * Creates the Observer and QueryFilter
         * 
         * Instantiating the interface is possible thanks to the "anonymous"
         * nature of the object that is being created.
         */
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }
        }, new WebSearchModel.QueryFilter() {
            @Override
            public boolean isInteresting(String query) {
                return query.toLowerCase().contains("friend") || query.toLowerCase().contains("friends");
            }
        });

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long... " + query);
            }
        }, new WebSearchModel.QueryFilter() {
            @Override
            public boolean isInteresting(String query) {
                return query.length() > 60;
            }
        });
    }
}
