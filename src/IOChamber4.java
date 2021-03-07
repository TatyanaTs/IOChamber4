import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IOChamber4 {
    static ArrayList<String> stringIn = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            Scanner in = new Scanner(System.in);
            String line;
            while (!(line = in.nextLine()).isEmpty()) {
                stringIn.add(line); //добавим в список введенную строку
            }

            for (int i = 0; i<stringIn.size(); i++) {
                if (i % 2 != 0) {
                    System.out.println(stringIn.get(i)); //вывод объектов
                }
            }
        } else {
            try {
                String ifarg = args[0];
                BufferedReader reader = new BufferedReader(new FileReader(ifarg));
                String line = reader.readLine();
                int b = 1;
                while(line != null)
                {
                    line = reader.readLine();
                    b++;
                    if (b % 2 == 0) {
                        System.out.println(line);
                    }
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не распознан. Введите ваши сообщения");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
