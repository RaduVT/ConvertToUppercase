import java.io.*;
public class ConvertToUpper {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: ConvertToUpper <input file> <output file>");
            System.exit(1);
        }
        BufferedReader input = null;
        PrintWriter output = null;
        String line;
        try {
            input = new BufferedReader(new FileReader(args[0]));
            output = new PrintWriter(new FileWriter(args[1]));
            while ((line = input.readLine()) != null) {
                output.println(line.toUpperCase());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Error uppercasing file");
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}