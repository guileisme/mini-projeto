import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class reader {
    
    HashMap<String, character> readCharacters(String filePath) throws FileNotFoundException
    {
        HashMap<String, character> characters = new HashMap<String, character>();
        File charactersFile = new File(filePath);
        try (Scanner readFiles = new Scanner(charactersFile, "UTF-8")) {
            String nameCharacter = "";
            int staminaCharacter = 0;
            String classCharacter = "";
            String linhaScanned = "";

            while (readFiles.hasNextLine())
            {
                while (!linhaScanned.equals("CHARACTER"))
                {
                linhaScanned = readFiles.nextLine();
                }
                linhaScanned = readFiles.nextLine();
                nameCharacter = readFiles.nextLine();
                linhaScanned = readFiles.nextLine();
                staminaCharacter = Integer.parseInt(readFiles.nextLine());
                linhaScanned = readFiles.nextLine();
                classCharacter = readFiles.nextLine();
                
                characters.put(nameCharacter, new character(nameCharacter, classCharacter, staminaCharacter));

                
            }

            readFiles.close();

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return characters;
    }
}
