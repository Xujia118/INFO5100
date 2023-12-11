public class BookParser {
    public static void main(String[] args) {
        // XML
        String sampleXML = "<BookShelf>\n" +
                "    <Book>\n" +
                "        <title>Harry Potter and the Sorcerer's Stone</title>\n" +
                "        <publishedYear>1997</publishedYear>\n" +
                "        <numberOfPages>320</numberOfPages>\n" +
                "        <authors>\n" +
                "            <author>J.K. Rowling</author>\n" +
                "        </authors>\n" +
                "    </Book>\n" +
                "    <Book>\n" +
                "        <title>The Fellowship of the Ring</title>\n" +
                "        <publishedYear>1954</publishedYear>\n" +
                "        <numberOfPages>423</numberOfPages>\n" +
                "        <authors>\n" +
                "            <author>J.R.R. Tolkien</author>\n" +
                "        </authors>\n" +
                "    </Book>\n" +
                "    <Book>\n" +
                "        <title>Harry Potter and the Chamber of Secrets</title>\n" +
                "        <publishedYear>1998</publishedYear>\n" +
                "        <numberOfPages>352</numberOfPages>\n" +
                "        <authors>\n" +
                "            <author>J.K. Rowling</author>\n" +
                "        </authors>\n" +
                "    </Book>\n" +
                "</BookShelf>";

        // JSON
        String sampleJSON = "[\n" +
                "    {\n" +
                "        \"title\": \"Harry Potter and the Sorcerer's Stone\",\n" +
                "        \"publishedYear\": 1997,\n" +
                "        \"numberOfPages\": 320,\n" +
                "        \"authors\": \"J.K. Rowling\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"title\": \"The Fellowship of the Ring\",\n" +
                "        \"publishedYear\": 1954,\n" +
                "        \"numberOfPages\": 423,\n" +
                "        \"authors\": \"J.R.R. Tolkien\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"title\": \"Harry Potter and the Chamber of Secrets\",\n" +
                "        \"publishedYear\": 1998,\n" +
                "        \"numberOfPages\": 352,\n" +
                "        \"authors\": \"J.K. Rowling\"\n" +
                "    }\n" +
                "]";

        // Parse and print XML
        System.out.println("Parsing XML:");
        parseXML(sampleXML);

        // Parse and print JSON
        System.out.println("\nParsing JSON:");
        parseJSON(sampleJSON);

        // Add additional entry to JSON
        System.out.println("\nAdding an additional book to JSON:");
        sampleJSON = addBookToJSON(sampleJSON, "The Two Towers", 1954, 352, "J.R.R. Tolkien");
        System.out.println(sampleJSON);
    }

    private static void parseXML(String xml) {
        String[] books = xml.split("</Book>\\s*<Book>");
        for (int i = 0; i < books.length; i++) {
            String book = books[i];
            String title = getValue(book, "title");
            String publishedYear = getValue(book, "publishedYear");
            String numberOfPages = getValue(book, "numberOfPages");
            String author = getValue(book, "author");

            System.out.println("Title: " + title);
            System.out.println("Published Year: " + publishedYear);
            System.out.println("Number of Pages: " + numberOfPages);
            System.out.println("Author: " + author);
            System.out.println();
        }
    }

    private static void parseJSON(String json) {
        json = json.substring(1, json.length() - 1); // Remove square brackets
        String[] books = json.split("\\},\\s*\\{");
        for (String book : books) {
            String title = getValue(book, "\"title\"");
            String publishedYear = getValue(book, "\"publishedYear\"");
            String numberOfPages = getValue(book, "\"numberOfPages\"");
            String authors = getValue(book, "\"authors\"");

            System.out.println("Title: " + title);
            System.out.println("Published Year: " + publishedYear);
            System.out.println("Number of Pages: " + numberOfPages);
            System.out.println("Authors: " + authors);
            System.out.println();
        }
    }

    private static String getValue(String input, String key) {
        int startIndex = input.indexOf(key) + key.length() + 3; // +3 to skip over ": "
        int endIndex = input.indexOf(",", startIndex);
        if (endIndex == -1 || endIndex < startIndex) {
            endIndex = input.indexOf("}", startIndex);
        }
        if (endIndex == -1) {
            endIndex = input.length(); // Use the end of the string if no comma or closing brace found
        }
        return input.substring(startIndex, endIndex).replaceAll("\"", "");
    }

    private static String addBookToJSON(String json, String title, int publishedYear, int numberOfPages, String author) {
        // Remove the closing square bracket
        json = json.substring(0, json.length() - 1).trim();

        // Add a comma if there are existing books in the array
        if (!json.endsWith("[")) {
            json += ",";
        }

        // Add the new book
        json += String.format("\n    {" +
                "\n        \"title\": \"%s\"," +
                "\n        \"publishedYear\": %d," +
                "\n        \"numberOfPages\": %d," +
                "\n        \"authors\": \"%s\"" +
                "\n    }", title, publishedYear, numberOfPages, author);

        // Add the closing square bracket
        json += "\n]";

        return json;
    }


}