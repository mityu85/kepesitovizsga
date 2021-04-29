package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        try (PrintWriter pw = new PrintWriter(output)) {
            for (String contact: contacts.keySet()) {
                pw.print(contact);
                pw.append(": ");
                pw.println(contacts.get(contact));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot write", e);
        }
    }
}
