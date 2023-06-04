/**
 * Group 29
 * Michal Pavlíček i6306065
 * Luuk Dobbelaar i6331749
 */
package designpat.websearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    // The Filter interface
    public interface QueryFilter {
        boolean isInteresting(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        // Source:
        // https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, QueryFilter filter) {
        /*
         * Overrides the Observer's onQuery function
         * in order to only call the original onQuery
         * if the query is interesting based on the
         * specified filter
         */
        observers.add(new QueryObserver() {
            @Override
            public void onQuery(String query) {
                if (filter.isInteresting(query)) {
                    queryObserver.onQuery(query);
                }
            }
        });
    }

    private void notifyAllObservers(String line) {
        for (QueryObserver obs : observers) {
            obs.onQuery(line);
        }
    }
}
