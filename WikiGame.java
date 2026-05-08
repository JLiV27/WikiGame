import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class wikiGame {

    public String startLink = "https://en.wikipedia.org/wiki/Pineapple";
    public String endLink = "https://en.wikipedia.org/wiki/Hawaii";

    private int maxDepth;
    private ArrayList<String> path = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        wikiGame w = new wikiGame();
    }

    public wikiGame() throws IOException {

        String startLink = "https://en.wikipedia.org/wiki/Pineapple";  // beginning link, where the program will start
        String endLink = "https://en.wikipedia.org/wiki/Hawaii";    // ending link, where the program is trying to get to
        maxDepth = 1;           // start this at 1 or 2, and if you get it going fast, increase

        if (findLink(startLink, endLink, 0)) {
            System.out.println("found it********************************************************************");
            path.add(startLink);
        } else {
            System.out.println("did not found it********************************************************************");
        }

    }

    // recursion method
    public boolean findLink(String startLink, String endLink, int depth) {

        System.out.println("depth is: " + depth + ", link is: https://en.wikipedia.org" + startLink);

        // BASE CASE
        if (startLink.isEmpty()) {

        } else if (endLink.isEmpty()) {

        }

        // GENERAL RECURSIVE CASE
        else {

        }

        return false;
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command == "Read"){
        BufferedReader reader = getBufferedReader(startLink);
        String line;
        while(true) {
            try {
                if ((line = reader.readLine()) == null);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            {
                try {
                    reader.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
    }
}

BufferedReader getBufferedReader;() {

    URL url = null;
    try {
        url = new URL(startLink);
    } catch (MalformedURLException ex) {
        throw new RuntimeException(ex);
    }

    URLConnection urlc = null;
    try {
        urlc = url.openConnection();
    } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
    urlc.setRequestProperty("User-Agent", "Mozilla 5.0 (Windows; U; " + "Windows NT 5.1; en-US; rv:1.8.0.11) ");

    BufferedReader reader = null;
    try {
        reader = new BufferedReader(
                new InputStreamReader(urlc.getInputStream())
        );
    } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
    return reader;
    }
        }

        private BufferedReader getBufferedReader(String startLink) {
            return null;
        }
    }
}
