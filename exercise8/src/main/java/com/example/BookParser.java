package com.example;
import com.google.gson.Gson;
public class BookParser {
    public static void main(String[] args) {
        String json = "{" +
                "  \"books\": [" +
                "    {" +
                "      \"title\": \"Book 1\"," +
                "      \"publishedYear\": 2021," +
                "      \"numberOfPages\": 200," +
                "      \"authors\": [\"Author1\", \"Author2\"]" +
                "    }," +
                "    {" +
                "      \"title\": \"Book 2\"," +
                "      \"publishedYear\": 2022," +
                "      \"numberOfPages\": 250," +
                "      \"authors\": [\"Author3\"]" +
                "    }," +
                "    {" +
                "      \"title\": \"Book 3\"," +
                "      \"publishedYear\": 2023," +
                "      \"numberOfPages\": 180," +
                "      \"authors\": [\"Author4\", \"Author5\"]" +
                "    }" +
                "  ]" +
                "}";

        parseAndPrintJson(json);

        Book newBook = new Book("Book 4", 2024, 220, new String[]{"Author6", "Author7"});
        addBook(json, newBook);

        parseAndPrintJson(json);
    }

    private static void parseAndPrintJson(String json) {
        Gson gson = new Gson();
        Bookshelf bookshelf = gson.fromJson(json, Bookshelf.class);

        System.out.println("Parsed JSON:");
        for (Book book : bookshelf.getBooks()) {
            System.out.println(book);
        }
        System.out.println("------------------------------");
    }

    private static void addBook(String json, Book newBook) {
        Gson gson = new Gson();
        Bookshelf bookshelf = gson.fromJson(json, Bookshelf.class);

        bookshelf.addBook(newBook);

        String updatedJson = gson.toJson(bookshelf);
        System.out.println("Added Book Programmatically:");
        System.out.println(updatedJson);
        System.out.println("------------------------------");
    }
}

