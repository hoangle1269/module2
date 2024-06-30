import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryInfoManager {
    private static String filePath = "session_16_filetext/ReaFileCSV/countries.csv";
    private static File countryFile = new File(filePath);
    private static Scanner scanner = new Scanner(System.in);

    public CountryInfoManager() {
    }

    public static void createCountry() throws IOException {
        FileWriter fileWriter = new FileWriter(countryFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("Enter country info");
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Enter country code: ");
        String code = scanner.nextLine();
        System.out.println("Enter country name: ");
        String name = scanner.nextLine();

        Country country = new Country(id, code, name);
        String dataCountry = country.getId() + ", " + country.getCode() + ", " + country.getName();
        bufferedWriter.write(dataCountry);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void updateCountry() throws IOException {
        System.out.println("Enter the id of the country to update: ");
        String id = scanner.nextLine();
        List<Country> countries = readCountries();
        boolean found = false;
        for (Country country : countries) {
            if (country.getId().equals(id)) {
                System.out.println("Enter new country code: ");
                country.setCode(scanner.nextLine());
                System.out.println("Enter new country name: ");
                country.setName(scanner.nextLine());
                found = true;
                break;
            }
        }
        if (found) {
            writeCountries(countries);
        } else {
            System.out.println("Country with id " + id + " not found.");
        }
    }

    public static void showListCountry() throws IOException {
        FileReader fileReader = new FileReader(countryFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] info = line.split(", ");
            String idCountry = info[0];
            String codeCountry = info[1];
            String nameCountry = info[2];
            Country c = new Country(idCountry, codeCountry, nameCountry);
            System.out.println(c);
        }
        bufferedReader.close();

    }

    public static void deleteCountry() throws IOException {
        System.out.println("Enter the id of the country to delete: ");
        String id = scanner.nextLine();
        List<Country> countries = readCountries();
        boolean found = countries.removeIf(country -> country.getId().equals(id));
        if (found) {
            writeCountries(countries);
        } else {
            System.out.println("Country with id " + id + " not found.");
        }
    }

    public static void exit() throws IOException {
        System.exit(0);
    }

    private static List<Country> readCountries() throws IOException {
        List<Country> countries = new ArrayList<>();
        if (countryFile.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(countryFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] info = line.split(", ");
                if (info.length == 3) {
                    countries.add(new Country(info[0], info[1], info[2]));
                }
            }
            bufferedReader.close();
        }
        return countries;
    }

    private static void writeCountries(List<Country> countries) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(countryFile));
        for (Country country : countries) {
            String dataCountry = country.getId() + ", " + country.getCode() + ", " + country.getName();
            bufferedWriter.write(dataCountry);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}


